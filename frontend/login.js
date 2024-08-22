const porta = 9090

function validarDadosLogin() {

    let nome = $("#usuario").val();
    let senha = $("#senha").val();

    if(nome.length == 0 || nome == "") {
        alert("Informe um Usuário");
    }else{
        if(senha.length == 0 || senha == ""){
            alert("Informe uma senha");
        } else {
            enviaDadosLogin(nome,senha);
        }
    }
}

function enviaDadosLogin(nome,senha) {

    $.ajax({
        url:"http://localhost:" + porta + "/login/",
        type:'POST',
        data: JSON.stringify({
            nome: nome,
            senha: senha
        }),

        contentType:"application/json;charset=UTF-8",

        success: function(msg){

            if(Object.keys(msg).length === 0) {

                alert("Usuario não encontrado")

            } else {

                alert("usuario encontrado com sucessooooooooo!!!!!")
            }
           
        },
        error: function(msg){
            alert("Erro de busca...")
        }
    });
}