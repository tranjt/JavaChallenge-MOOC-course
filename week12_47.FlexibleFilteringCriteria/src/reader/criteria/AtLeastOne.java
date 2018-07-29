/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zun
 */
public class AtLeastOne implements Criterion{
    private List<Criterion> criterionList = new ArrayList<Criterion>();

    public AtLeastOne(Criterion... criterions) {
        for(Criterion criterion : criterions) {
            criterionList.add(criterion);
        }
    }    

    @Override
    public boolean complies(String line) {
        for(Criterion criterion : this.criterionList){
            if(criterion.complies(line)){
                return true;
            }
        }
        return false;
    }
    
    
}
