# Teste de funcional de API com RestAssured

Teste funcional da API ServeRest, especificamente as funções de criar/deletar usuário, editar usuário, listar 1 ou mais usuários e fazer login

#### Funcionalidades: <a name="return"></a>

>- [Funcionalidade cadastrar usuário](#id-1)
>- [Funcionalidade editar usuário](#id-2)
>- [Funcionalidade listar usuários cadastrados](#id-3)
>- [Funcionalidade login](#id-4)




# Funcionalidade cadastrar usuário <a name="id-1"></a>


### CT-16 Validar cadastro de usuário com email nunca usado
![Captura de tela de 2023-07-04 18-05-13](https://github.com/wjonnty/testeAPI/assets/108878868/bba86d07-99e5-4af2-a1bb-8deca0701515)

### CT-17 Validar cadastro de usuário com email em uso
![Captura de tela de 2023-07-04 18-04-49](https://github.com/wjonnty/testeAPI/assets/108878868/58a9ec28-f85b-4e6e-aaf4-0bce63e4fa24)

### CT-18 Validar exclusão de usuário sem carrinho cadastrado
![image](https://github.com/wjonnty/testeAPI/assets/108878868/1ef9c435-90d1-422e-9028-5ac3f72945d0)

### CT-19 Validar exclusão de usuário com carrinho cadastrado
![image](https://github.com/wjonnty/testeAPI/assets/108878868/e170088d-cf67-47e4-96e9-f209c39ecb38)

[Retornar ao topo](#return)



## Funcionalidade editar usuário <a name="id-2"></a>


### CT-21 Validar edição de usuário já cadastrado
![image](https://github.com/wjonnty/testeAPI/assets/108878868/00a8b808-1722-46a6-9218-6f1af52fe83f)

### CT-20 Validar edição de usuário com email em uso por outro usuário
![image](https://github.com/wjonnty/testeAPI/assets/108878868/dcf1f988-a9aa-40aa-ba84-175c0fa839a9)

### CT-22 Validar cadastro de usuário através da edição
![image](https://github.com/wjonnty/testeAPI/assets/108878868/29d797d8-3f70-4c48-a5f5-69f291919987)

[Retornar ao topo](#return)



# Funcionalidade listar usuários cadastrados <a name="id-3"></a>


### CT-24 Validar listagem de usuários cadastrados
![image](https://github.com/wjonnty/testeAPI/assets/108878868/52fe2958-9413-4663-8bfe-2cc5d263e3a4)

### CT-25 Validar listagem de usuários através do id
![image](https://github.com/wjonnty/testeAPI/assets/108878868/151ae7aa-2cf5-4096-a777-c65390df4bf6)

### CT-26 Validar listagem de usuários através do nome
![image](https://github.com/wjonnty/testeAPI/assets/108878868/7e192bb6-0731-4d8e-a205-4f94cd6b0c17)

### CT-27 Validar listagem de usuários através do email
![image](https://github.com/wjonnty/testeAPI/assets/108878868/59b97611-27ac-437f-958d-4efdf3f7bc13)

### CT-28 Validar listagem de usuários através da senha
![image](https://github.com/wjonnty/testeAPI/assets/108878868/cbc1dffc-e113-456a-8e39-eb219e3d21ef)

### CT-29 Validar listagem de usuários cadastrados como administrador
![image](https://github.com/wjonnty/testeAPI/assets/108878868/233114a3-cc5b-4989-b217-cd588dcb5d5f)

### CT-30 Validar listagem de usuários cadastrados como não-administrador
![image](https://github.com/wjonnty/testeAPI/assets/108878868/bdade36b-feb0-4d87-94b6-08d596a126c5)

### CT-31 Validar query administrador com valor não cadastrado
![image](https://github.com/wjonnty/testeAPI/assets/108878868/9dc6038e-aae0-406c-a73a-3f93dd11fcb2)

[Retornar ao topo](#return)



## Funcionalidade login <a name="id-4"></a>


### CT-32 Validar login com email e senha corretos 
![image](https://github.com/wjonnty/testeAPI/assets/108878868/19895d6a-21bc-4f37-a677-479a6837ce21)

### CT-33 Validar Login com email correto e senha errada
![image](https://github.com/wjonnty/testeAPI/assets/108878868/de82197b-1ab2-4dab-98e2-d6f640b3fd1e)

### CT-34 Validar Login com email e senha incorretos
![image](https://github.com/wjonnty/testeAPI/assets/108878868/514172af-648c-466e-91c8-168a30c523e2)

[Retornar ao topo](#return)


      
