## Spring Security (Lista de ativos da bolsa)

Fluxo para criação do banco de dados:

`docker run --name spring-arlei -e POSTGRES_PASSWORD=102030 -d -p 5432:5432 postgres`

Carga inicial esta dentro da pasta `sql_carga/insertAtivos`

Agora para rodar o projeto execute: `mvn clean install` para instalar as dependências e `mvn spring-boot:run` para subir a aplicação.



5) para mudar do basic para o oauth2
5.1) colocar  dependencias no pom do oauth2 como no meu arquivo.
5.2) ir em algum dos provedores de servidores de autorização: google (meu exemplo, twitter, facebook (alguns passos a mais) , keycloack(redhat) e etc..)
e criar uma conta para sua aplicação, lá pode configurar quais usuários podem acessar e coloca-los em alguma regra.
5.3) Na classe que irá tratar as autorizações , receita de bolo, trocar para o oauth2long ao invés de HTTPBasic
5.4) No application properties colocar o seu secret id e client id fonercido pelo seu servidor
   ##spring.security.oauth2.client.registration.google.client-id=ver o seu 
   ##spring.security.oauth2.client.registration.google.client-secret=ver o seu item 5.2
5.5) para capturar os dados do seu token vc pode usar como fiz na user controller ou com rest template conforme link abaixo


_https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/jwt.html
_https://medium.com/rapaduratech/login-com-oauth2-usando-o-spring-security-4aefa3f57a63

6) em qualquer site jwt decoder vc consegue colocar o token e ver as 3 partes do arquivo
   http://calebb.net/


