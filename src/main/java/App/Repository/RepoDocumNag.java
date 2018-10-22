package App.Repository;

import App.Model.DocuPoz;
import App.Model.DocumNag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoDocumNag extends JpaRepository<DocumNag, Integer> {


}
