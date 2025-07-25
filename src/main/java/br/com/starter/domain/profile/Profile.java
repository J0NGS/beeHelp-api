package br.com.starter.domain.profile;

import br.com.starter.domain.address.Address;
import br.com.starter.domain.common.Auditable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Audited
@Table(name = "profiles")
@Getter
@Setter
public class Profile extends Auditable {
    @Id
    private UUID id = UUID.randomUUID();

    @JsonIgnore
    @Column(columnDefinition = "text")
    private String photo;
    private String name;
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Version
    private Long version;
}
