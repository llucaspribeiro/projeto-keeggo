#language: pt
#Author: llucasp.ribeiro@hotmail.com

@executa1
Funcionalidade: Cadastro de clientes
  Eu como usuario quero fazer o cadastro de clientes para utilizacao do site

  Cenario: Criar conta com email incorreto
    Dado que eu esteja na tela de cadastro de cliente
    Quando informar um dado incorreto
    Entao cadastro nao realizado