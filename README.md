## Spring Security (Lista de ativos da bolsa)

Fluxo para criação do banco de dados:

`docker run --name spring-arlei -e POSTGRES_PASSWORD=102030 -d -p 5432:5432 postgres`

Carga inicial esta dentro da pasta `sql_carga/insertAtivos`

Agora para rodar o projeto execute: `mvn clean install` para instalar as dependências e `mvn spring-boot:run` para subir a aplicação.

1) Adiciona no POM XML o spring security neste momento a aplicação já tera uma tela pedindo usuário e senha
   por default podemos usar : user e a senha que foi gerada randomicamente pelo spring boot
2) Alterando no properties ja irá pedir a senha que ficou lá configurada, podendo usar ate o spring clpud
3) criei a pasta security com um bean padrão para informar quais endpoints necessitam ou não de autenticação
4) usando anotação: @EnableWebSecurity e as classes : SecurityFilterChain e HTTPSecurity em um metodo que o Bean que por conta da anotação da classe 
o spring já usar como a minha regra de segurança...