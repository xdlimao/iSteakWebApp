slv = document.getElementById("slv")
slv.addEventListener("click", salvar)

slv0 = document.getElementById("slv0")
slv0.addEventListener("click", salvar)

slv1 = document.getElementById("slv1")
slv1.addEventListener("click", salvar)


dfn = document.getElementById("dfn")
dfn.addEventListener("click", definir)

dfn0 = document.getElementById("dfn0")
dfn0.addEventListener("click", definir)

dfn1 = document.getElementById("dfn1")
dfn1.addEventListener("click", definir)



function salvar() {
    alert("Salvo com sucesso!")
}

function definir() {
    alert("Definido com sucesso!")
}

function erro() {
    alert("Ocorreu um erro, espero alguns minutos e tente novamente.")
}