package com.yuhuizhao.designPattern.structure.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<>();
        for (Person person : personList) {
            if ("SINGLE".equalsIgnoreCase(person.getMaritalStatus())) {
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
