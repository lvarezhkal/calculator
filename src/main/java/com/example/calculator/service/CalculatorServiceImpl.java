package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int sum(int nam1, int num2) {
        return nam1+num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1/num2;
    }
}
