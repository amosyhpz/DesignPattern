package com.yuhuizhao.designPattern.structure.filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstPersonList = criteria.meetCriteria(personList);
        List<Person> secondPersonList = otherCriteria.meetCriteria(personList);
        for (Person person : secondPersonList) {
            if (!firstPersonList.contains(person)) {
                firstPersonList.add(person);
            }
        }
        return firstPersonList;
    }
}
