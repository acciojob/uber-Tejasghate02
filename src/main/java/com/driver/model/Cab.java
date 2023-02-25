package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cab{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int Id;
        private int perKmRate;
        private boolean available;

        //cab is child wrt driver
        //this is unidirectional mapping
        private Driver driver;
        public Cab() {
        }

        public Cab(int Id, int perKmRate, boolean available) {
                this.Id = Id;
                this.perKmRate = perKmRate;
                this.available = available;
        }

        public void setId(int id) {
                Id = id;
        }

        public Driver getDriver() {
                return driver;
        }

        public void setDriver(Driver driver) {
                this.driver = driver;
        }

        public int getId() {
                return Id;
        }

        public void setID(int Id) {
                this.Id = Id;
        }

        public int getPerKmRate() {
                return perKmRate;
        }

        public void setPerKmRate(int perKmRate) {
                this.perKmRate = perKmRate;
        }

        public boolean getAvailable() {
                return available;
        }

        public void setAvailable(boolean available) {
                this.available = available;
        }
}
