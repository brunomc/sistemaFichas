package br.com.sistema.rest;
import javax.faces.bean.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationScoped
@ApplicationPath("rest") // set the path to REST web services
public class Service extends Application {

}
