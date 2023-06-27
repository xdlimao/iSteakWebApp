var cr = document.getElementById("cr");
cr.addEventListener("click", criar);

var del = document.getElementById("del");
del.addEventListener("click", deletar);

var edit = document.getElementById("edit");
edit.addEventListener("click", editar);



function criar() {
    alert("Criado com sucesso!")
}

function deletar() {
    alert("Deletado com sucesso!")
}

function editar(){
    alert("Editado com sucesso!")
}
function erro() {
    alert("Ocorreu um erro, espero alguns minutos e tente novamente.")
}