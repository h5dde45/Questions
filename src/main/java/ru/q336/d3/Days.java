package ru.q336.d3;

public enum Days {

    SUNDAY(7,"good day"){
        @Override
        public String shortname() {
            return "sun";
        }
    },
    MONDAY(1,"hard"){
        @Override
        public String shortname() {
            return "mon";
        }
    },
    TUESDAY(2,"work"){
        @Override
        public String shortname() {
            return "tues";
        }
    },
    WEDNESDAY(3,"middle"){
        @Override
        public String shortname() {
            return "wed";
        }
    },
    THURSDAY(4,"work"){
        @Override
        public String shortname() {
            return "thurs";
        }
    },
    FRIDAY(5,"short day"){
        @Override
        public String shortname() {
            return "fri";
        }
    },
    SATURDAY(6,"rest"){
        @Override
        public String shortname() {
            return "sat";
        }
    };

    private int order;
    private String status;

    public abstract String shortname();

    Days(int order, String status) {
        this.order = order;
        this.status = status;
    }
}
