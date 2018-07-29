/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Zun
 */
public class Both implements Criterion{
    private Criterion firstCriterion;
    private Criterion secondCriterion;

    public Both(Criterion firstCriterion, Criterion secondCriterion) {
        this.firstCriterion = firstCriterion;
        this.secondCriterion = secondCriterion;
    }
    

    @Override
    public boolean complies(String line) {
        return this.firstCriterion.complies( line) && this.secondCriterion.complies(line);
    }
    
}
