package App.Controller;

import App.Model.DocuPoz;
import App.Model.DocumNag;
import App.Repository.RepoDocumNag;
import App.Repository.RepoPoz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestApi {

@Autowired
private RepoDocumNag repoDocumNag;

@Autowired
private RepoPoz repoPoz;

    @RequestMapping("/api")
    private List<DocumNag> documNags(){
        return repoDocumNag.findAll();

    }
    

}
