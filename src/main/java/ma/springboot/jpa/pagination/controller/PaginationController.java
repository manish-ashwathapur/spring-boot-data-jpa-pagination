package ma.springboot.jpa.pagination.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import ma.springboot.jpa.pagination.domain.*;
import ma.springboot.jpa.pagination.service.SrvcElement1;
import ma.springboot.jpa.pagination.service.SrvcElement2;
import ma.springboot.jpa.pagination.service.SrvcElement3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/data")
public class PaginationController {
    private SrvcElement1 srvcElement1;
    private SrvcElement2 srvcElement2;
    private SrvcElement3 srvcElement3;

    @Autowired
    public PaginationController(SrvcElement1 srvcElement1, SrvcElement2 srvcElement2, SrvcElement3 srvcElement3){
        this.srvcElement1 = srvcElement1;
        this.srvcElement2 = srvcElement2;
        this.srvcElement3 = srvcElement3;
    }

    @RequestMapping(value = "/element1/{page}", method = RequestMethod.GET)
    public List<DomainElement1> getPaginatedElement1(@PathVariable(name = "page") int page){
        return srvcElement1.findAll(page);
    }

    @RequestMapping(value = "/element2/{page}", method = RequestMethod.GET)
    public List<DomainElement2> getPaginatedElement2(@PathVariable(name = "page") int page){
        return srvcElement2.findAll(page);
    }

    @RequestMapping(value = "/element3/{page}", method = RequestMethod.GET)
    public List<DomainElement3> getPaginatedElement3(@PathVariable(name = "page") int page){
        return srvcElement3.findAll(page);
    }

    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public DomainElement getData(@PathVariable(name = "page") int page){
        return new DomainElement(srvcElement1.findAll(page), srvcElement2.findAll(page), srvcElement3.findAll(page));
    }
}
