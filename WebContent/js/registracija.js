
$(document).ready(function() {	

	var userId = $('#username').val();
	var lozinka = $('#pasword').val();
	var ime = $('#name').val();
	var prezime = $('#lastName').val();
	var telefon = $('#telephone').val();
	var email = $('#email').val();
	var flag = false;
/*	
	 $('#userid').mouseout(function() {
		 if(userId == ""){
				$('#divUserId').fadeIn(100);
				flag =true;
		 }
	}).focus(function() {
		if(userId != "UserId" || userId != ""){
			$('#divUserId').fadeOut(100);
	 }
	});
	
	 $('#pasword').mouseout(function() {
		 if(lozinka == ""){
				$('#divSifra').fadeIn(100);
				flag =true;	
		 }
	});	 
	 $('#name').mouseout(function() {
		 if(ime == ""){
				$('#divIme').fadeIn(100);
				flag =true;	
		 }
	});	 
	 $('#lastName').mouseout(function() {
		 if(prezime == ""){
				$('#divPrezime').fadeIn(100);
				flag =true;	
		 }
	}); 
	 $('#telephone').mouseout(function() {
		 if(telefon == ""){
				$('#divTelefon').fadeIn(100);
				flag =true;	
		 }
	}); 
	 $('#email').mouseout(function() {
		 if(email == ""){
				$('#divEmail').fadeIn(100);
				flag =true;	
		 }
	})	 
	 if(flag){		//Moglo bi da se stavi i na dugme submit ili click na Login
		 alert("Popunite sva polja");
		 return false;
	 }
	 */
	$("input").focus(function () {
		$(this).css({"background-color": "green"});	
	});

	$("input").blur(function () {
		$(this).css({"background-color":"background"});

	});

	$("input[name=ime]").blur(function() {	//nesto necee !!!
	provera($(this));	
	});
	
	$("input[name=prezime]").blur(function() {	//nesto necee !!!
		provera($(this));	
	});
	
	$('#pasword').focus(function() {
		$('#pasword').mouseout(function() {
		if($('#pasword').val().length < 4 ){	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			//alert($('#pasword').val().length);
			$('#pasword').after("<td id='brisi' ><span style='color:red'>Morate uneti vise od 4 vrednosti</span></td>");
		}else{
			$('#brisi').remove(); //   after("<td><span style='display:none'></span></td>");
		}
		});
		
		
	});
	
	/*.blur(function() {
		if($('#pasword').val().length < 4 ){	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		$(this).next().remove();
		}
	});*/
	/*$('#pasword').focus(function() {
		minlength = $(this).attr('minlength');
		
		//treba i key up
	});*/
	
	$("input[name=brTelefona]").blur(function(){
		if(isNaN($(this).val())){
				if($(this).next().length==0){
				$(this).after("<td><span style='color:red'>Morate uneti broj telefona</span></td>");
			}
		}else{
			flag = true;
			$(this).next().remove();
		}
	});
	
	
	function provera(polje) {
		
		if(polje.val().charAt(0) != polje.val().charAt(0).toUpperCase()){
			if(polje.next().length==0){
				polje.after("<td><span style='color:red'>Prvo slovo mora biti veliko</span></td>");
			}
					}else{
			polje.next().remove();
		}
		
	}
	
	
	$("#registracija").click(function (e){			//radii
		$("input[type=text] ,input[type=password] ").each(function (){
			if($(this).val().trim()=="" ){		// proveriti za sifruu
				if($(this).next().length==0)
				//$(this).after("<td><span style='color:red'>Morate uneti vrednost</span></td>");
					$('#sva').html("<span style='color:red'>Morate uneti sve vrednost</span>");
					e.preventDefault();
			flag = true;
			}else{
				$(this).next().remove();
				//flag = false;
			}
			
		});
		if(!flag){
			$(location).attr("href","login.html");	//kao ulogovan korisnik
		}else{
			flag=false;		//posto je globalna promenljiva... sa var (tako je..)
		}
		
	
	});
	//Hajmo hajdee ....
	
});
