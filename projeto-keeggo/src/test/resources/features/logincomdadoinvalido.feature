#language: pt
#Author: llucasp.ribeiro@hotmail.com

@logininvalido
Funcionalidade: Login de clientes
  Eu como usuario quero fazer o login de cadastro para utilizacao do site

  Cenario: Logar com uma conta invalida
    Dado que eu esteja na tela de login
    Quando informar login invalido
    Entao login nao realizado