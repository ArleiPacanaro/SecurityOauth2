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
o spring já vai assumir como a minha regra de segurança...

5) para mudar do basic para o oauth2
5.1) colocar  dependencias no pom do ouath como no meu arquivo
5.2) ir em algum dos provedores de servidores de autorização: google (meus exemplos, twitter, facebook (alguns passos a mais) , keycloack e etc..)
e criar uma conta para sua aplicação, lá pode configurar quais usuários podem acessar e coloca-los em alguma regra
5.3) Na classe que irá tratar as autorizações , receita de bolo, torcar para o oauth2long ao invés de basic
5.4) No application properties colocar o seu secret id e client id fonercido pelo seu servidor
5.5) para capturar os dados do seu token vc pode usar como fiz na user controller ou com rest template conforme link abaixo

##spring.security.oauth2.client.registration.google.client-id=ver o seu 
##spring.security.oauth2.client.registration.google.client-secret=ver o seu item 5.2


Material bom de exemplo para usar oauth2

_https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/jwt.html
_https://medium.com/rapaduratech/login-com-oauth2-usando-o-spring-security-4aefa3f57a63

6) em qualquer site jwt decoder vc consegue colocar o token e ver as 3 partes do arquivo
   http://calebb.net/
