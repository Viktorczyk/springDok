package App.Repository;

import App.Model.DocuPoz;
import App.Model.DocumNag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPoz extends JpaRepository<DocuPoz, Integer> {

}
