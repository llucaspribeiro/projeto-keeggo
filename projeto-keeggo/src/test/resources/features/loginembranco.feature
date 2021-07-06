#language: pt
#Author: llucasp.ribeiro@hotmail.com

@eloginembranco
Funcionalidade: Login de clientes
  Eu como usuario quero fazer o login de cadastro para utilizacao do site

  Cenario: Logar com uma conta com dados em branco
    Dado que eu esteja na tela de login
    Quando nao informar login e senha
    Entao login nao realizado com sucesso