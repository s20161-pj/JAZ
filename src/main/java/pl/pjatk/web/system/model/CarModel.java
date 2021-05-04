package pl.pjatk.web.system.model;

public class CarModel {
        private String mark;
        private String model;
        private int yearOfProduction;

        public String getMark() {
            return mark;
        }

        public void setMark(String mark) {
            this.mark = mark;
        }

        public String getModel() {
            return model;
        }

        public String print() {
            return this.mark;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYearOfProduction() {
            return yearOfProduction;
        }

        public void setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
        }

        public CarModel(String mark, String model, int yearOfProduction) {
            this.mark = mark;
            this.model = model;
            this.yearOfProduction = yearOfProduction;
        }
}
