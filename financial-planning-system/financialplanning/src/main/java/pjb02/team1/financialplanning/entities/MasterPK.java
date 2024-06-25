package pjb02.team1.financialplanning.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MasterPK implements Serializable {

    private int mCode;
    private int mId;
}
