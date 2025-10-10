# shortner_sb_analytics
JWTUtils

-> Contains utility methods for generating, parsing, and validation JWTs.
-> Include generating a token, from a username , and extracting the username from token.


JWTAuthenticationFilter

-> Filters incoming requests to check for a valid JWT in the header, setting the authentication context if the token is valid.
-> Extracts JWT from request header, validates it, and configures the Spring Security context with the user details if the token is valid.


JWTAuthenticationFilter

-> DTO for JWT authentication response

SecurityConfig

-> Configures Spring Security filters and rules for the application
-> Sets up the security filter chain, permitting or denying access based on paths and roles.


-> Spring Security provides the tools and structure to authenticate and authorize users.
-> Spring Security has its own inbuilt implementation of User which would work, but in a lot of cases custom is needed.



UserDetailsServiceImpl

-> This is a service that loads user details from the database.
-> Bridges the gap between the database (User entity) and Spring Security (UserDetails interface)




JwtAuthenticationFilter -: intercepts HTTP requests and extracts JWT tokens.
JWTUtils -: Generates, validates tokens and provides helper methods.
UserDetailsServiceImpl -: Fetches user details from the database.
UserDetailImpl -: Provides a Spring Security- compatible representation of the user for authentication and authorization.



** Custom Security Configuration for our application
Defines the security rules for handling HTTP requests.

Configure JWTAuthenticationFilter in filter chain
 # Spring Security recognizes it as a filter that will only be executed once per request.
 # By default, Spring Security doesn't automatically include your custom filter. (JWTAuthenticationFilter) in the filter chain unless you explicitly add it.


* Configure DaoAuthenticationProvider

  #Sets up how authentication is handled by spring security
  #Bean for AuthenticationManager and PasswordEncoder


