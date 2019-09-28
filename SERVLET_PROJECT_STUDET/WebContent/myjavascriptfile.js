function validation(){
	alert("hello");
/*	var z=document.getElementsByTagName("input");
	alert(z[0].value);
	alert(z[1].value);
	alert(z[2].value);
	alert(z[0].value.length);
	if(z[0].value.length==0 && z[1].value.length==0 && z[2].value.length==0)
		return false;*/
	var ph=document.signup.phoneno.value.length;
//	alert(ph);
	if(ph==10)
		return (true);
//	alert(document.signup.email.value);
//	var x=document.getElementsByName("psw");
//	alert(x[0].value);
//	alert(x[1].value);
//	alert(x[2].value);
	//var z=document.getElementById("email"); this is not working
//	alert(z.value); this is not working
//	var y=document.getElementById("psw-repeat");
//	var chararr=['@','!','#','$','%','&','*'];
//	for(var i=0;i<pwd.length;i++){
//		if(spechar.indexOf(pwd.charAt(i))>-1 && spechar.indexOf(pwdrepeat.charAt(i))>-1){
//			return(false);
	//	}
//	}
	//	alert("Password not contain special character");
	alert("please enter a valid phone no");
	return(false);
}