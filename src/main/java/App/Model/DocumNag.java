package App.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="DocumNag")
public class DocumNag {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private Integer Number;
    private Integer data;

    @OneToMany(mappedBy = "documNag", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<DocuPoz> docuPozs ;

    public Set<DocuPoz> getDocuPozs() {
        return docuPozs;
    }

    public void setDocuPozs(Set<DocuPoz> docuPozs) {
        this.docuPozs = docuPozs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
