package pjb02.team1.financialplanning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(MasterPK.class)
@Table(name = "MASTER")
public class Master {

    @Id
    @Column(name = "M_CODE", columnDefinition = "INT")
    private int mCode;

    @Id
    @Column(name = "M_ID", columnDefinition = "INT")
    private int mId;

    @Column(name = "VALUE", columnDefinition = "NVARCHAR(255)")
    private String value;
}
