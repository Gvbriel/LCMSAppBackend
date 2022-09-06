package pl.pranagal.bartosz.lcmsapp.model.dao.users;

import com.vaadin.flow.templatemodel.AllowClientUpdates;
import lombok.Data;
import pl.pranagal.bartosz.lcmsapp.model.Idenficiable;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
@Data
public class AuthorityEntity implements Idenficiable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "AuthorityName")
    private String authorityName;
}
