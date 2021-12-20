package com.certification.chapter_6_lambda_functional_interfaces;

public class CheckIfHopper implements CheckTrait{

    @Override
    public boolean test(Animal a) {
        return a.isCanHop();
    }
}
