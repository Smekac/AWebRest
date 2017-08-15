
$(document).ready(function() {

	$('#login').click(function() {
		$(location).attr("href","login.html");
	});

});

function registracija() {
	
	var korisnik={};
	for ( var k of $('#register').serializeArray() ) {
		korisnik[k.username] = k.value();
	}
	
	var request = {
			type: "POST",
			url: 'rest/login/add/',
			data: JSON.stringify(korisnik),
			contentType: 'application/json'
		};
	
	$.ajax(request).done(function(prolaz) {
		if(prolaz == "prijavi"){
			login();	//proverititii.....
		}else{
			$('#sva').Text(prolaz);	
		}
		
	});
	
}


function login(){
	
	imeId = $('#KorisnickoIme').val();
	sifra = $('#sifra').val();
	
	var request = {
			type: "POST",
			url: 'services/login/',
			data: JSON.stringify({'username': imeId, 
									'lozinka': sifra}),	//izmena
			contentType: 'application/json'
		};
	
	$.ajax(request).done(function(prolaz) {
		
		if(prolaz == "prijavi")
		{
			window.location.replace('https://www.reddit.com/');	//probaaa.........
		}else{
			$('#porukaID').Text(prolaz);
		}
		
	});	
}

$(function() {
	$('#register input[name="username"]').change(function()
			{
				var username = $(this).val();
				$.get('rest/login/provera/' + username, function(data)
				{
					if(data == 'true')
					{
						$('#sva').text('Username already exists');
					}
					else
						$('#sva').text('');
				});
			});
	
	
});