package net.apidoc.swaggertutorial.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(
        title = "Demo-Title",
        description = "Demo-Description",
        summary = "Demo-summary",
        termsOfService = "Demo-Terms and service",
        contact = @Contact(
                name = "Soumik bose",
                email = "soumikbose560@gmail.com",
                url = "yourssoumik.com"
        ),
        license = @License(
                name = "Licensed by ..."
        )
))
public class SwaggerConfig {
}
