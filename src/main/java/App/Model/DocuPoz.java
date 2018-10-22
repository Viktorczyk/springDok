package App.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="docupoz")
public class DocuPoz{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String indeks;
    private String opis;


    //Łączymy pozycje z nagłówkiem
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name ="id_nag")
    //JSONIGNORE powoduje że nie ma wyświetlania obustronnego
    @JsonIgnore
    private DocumNag documNag;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public DocumNag getDocumNag() {
        return documNag;
    }

    public void setDocumNag(DocumNag documNag) {
        this.documNag = documNag;
    }
}
