package org.example.lab2_1;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.util.ArrayList;

public class CollectionAddressBook implements AdressBook {
    private ObservableList<Person>personObservableList = FXCollections.observableArrayList();

        @Override
        public void add (Person person){ personObservableList.add(person);
        }
        @Override
        public void update (Person person){
        }
        @Override
        public void delete (Person person){personObservableList.remove(person);
        }
    public ObservableList<Person>getPersonObservableList(){return personObservableList;}


        public void print () {
            int number = 0;
            for (Person person : personObservableList) {
                number++;
                System.out.println(number + " Pip: " + person.getPip() + " Phone: " + person.getPhone());
            }
        }
        public void fillTestData () {
            personObservableList.add(new Person("Yulia", "1516568"));
            personObservableList.add(new Person("Anna-Maria", "1234567"));
        }


    }
