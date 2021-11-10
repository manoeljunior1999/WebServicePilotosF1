package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/BlocoTeste")

@WebService(targetNamespace = "http://BlocoTeste")
@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class BlocoTeste {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/Executar")
// BlocoTeste
@WebMethod
public static synchronized Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var Grid = Var.VAR_NULL;

   public Var call() throws Exception {

    Grid =
    cronapi.json.Operations.toJson(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Pilotos"),Var.valueOf("select p from Pilotos p")));

    System.out.println(
    Var.valueOf(
    Var.valueOf("Grid:").toString() +
    Grid.toString()).getObjectAsString());
    return Grid;
   }
 }.call();
}

@Configuration
  public static class Config {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpointBlocoTeste() {
      EndpointImpl endpoint = new EndpointImpl(bus, new BlocoTeste());
      endpoint.publish("BlocoTeste");
      return endpoint;
    }
  }
}

