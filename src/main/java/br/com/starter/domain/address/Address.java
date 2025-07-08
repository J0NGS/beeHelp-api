package br.com.starter.domain.address;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

@Entity
@Audited(targetAuditMode = NOT_AUDITED)
@Table(name = "addresses")
@Getter
@Setter
public class Address {
    @Id
    private UUID id = UUID.randomUUID();
    private String cep;
    private String street;
    private String neighborhood;
    private String number;
    private String city;
    private String state;
    private String complement;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String referencePoint;
}
