# Teste de funcional de API com RestAssured

> Teste funcional da api ServeRest, especificamente as funçoes de criar/deletar usuário, editar usuário, listar 1 ou mais usuários e fazer login

A partir da técnica de partição de equivalência foram criados 2 casos de teste para a funcionalidade cadastrar usuário

## Funcionalidade cadastrar usuário

### CT-16 Validar cadastro de usuário com email nunca usado
![Captura de tela de 2023-07-04 18-05-13](https://github.com/wjonnty/testeAPI/assets/108878868/bba86d07-99e5-4af2-a1bb-8deca0701515)


### CT-17 Validar cadastro de usuário com email em uso
![Captura de tela de 2023-07-04 18-04-49](https://github.com/wjonnty/testeAPI/assets/108878868/58a9ec28-f85b-4e6e-aaf4-0bce63e4fa24)

### CT-18 Validar exclusão de usuário sem carrinho cadastrado
![image](https://github.com/wjonnty/testeAPI/assets/108878868/1ef9c435-90d1-422e-9028-5ac3f72945d0)

### CT-19 Validar exclusão de usuário com carrinho cadastrado
![image](https://github.com/wjonnty/testeAPI/assets/108878868/e170088d-cf67-47e4-96e9-f209c39ecb38)

## Funcionalidade editar usuário

### CT-21 Validar edição de usuário já cadastrado
![image](https://github.com/wjonnty/testeAPI/assets/108878868/00a8b808-1722-46a6-9218-6f1af52fe83f)

### CT-20 Validar edição de usuário com email em uso por outro usuário
![image](https://github.com/wjonnty/testeAPI/assets/108878868/dcf1f988-a9aa-40aa-ba84-175c0fa839a9)

### CT-22 Validar cadastro de usuário através da edição
![image](https://github.com/wjonnty/testeAPI/assets/108878868/29d797d8-3f70-4c48-a5f5-69f291919987)

### CT-23 Validar cadastro de usuário através da edição com email em uso por outro usuário
![image](https://github.com/wjonnty/testeAPI/assets/108878868/823380d8-d17d-4986-b3b5-379727dd0009)

