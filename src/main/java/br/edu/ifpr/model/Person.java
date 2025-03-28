/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.model;

/**
 *
 * @author rafae
 */
public class Person {

    private String name;
    private int age;
    private String cpf;
    private String address;

    public Person(String name, int age, String cpf, String address) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\n" + "Idade: " + age + "\n" + "CPF: " + cpf + "\n" + "Endereço:" + address;
    }

}
