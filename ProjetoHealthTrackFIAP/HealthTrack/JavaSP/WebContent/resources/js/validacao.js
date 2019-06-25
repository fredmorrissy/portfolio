$(document).ready(function(){
	$("#formCadastro").validate({
		rules:{
			nome: {
				required: true,
				maxlength: 100,
				minlength: 3,
				lettersonly: true,
				minWords: 2,
			},

			data: {
				required: true,
				date: true,
			},

			genero: {
				required: true,

			},

			peso: {
				required: true,
				number: true,
				maxlength: 4,
				minlength: 2,

			},

			altura: {
				required: true,
				number: true,
				maxlength: 4,
				minlength: 1,

			},


			email: {
				required: true,
				email: true,
			},

			senha: {
				required: true,
				alphanumeric: true,
				minlength: 6,
			},


			

		}

	})

})






$("#alterarsenha").validate({
	rules:{
		pwdatual: {
			required: true,
			alphanumeric: true,
			minlength: 6,
		},

		pwdnova: {
			required: true,
			alphanumeric: true,
			minlength: 6,
		},

		pwdnova2: {
			required: true,
			alphanumeric: true,
			minlength: 6,
			equalTo: "#pwdnova",
		},



	}	

})		






$("#login").validate({
	rules:{
		emaillogin: {
				required: true,
				email: true,
		},

		senhalogin: {
				required: true,
				alphanumeric: true,
				minlength: 6,
		},


	}	
})






$("#modalemail").validate({
	rules:{
		emailmodal: {
				required: true,
				email: true,
		},

	}
})