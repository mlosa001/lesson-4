package org.pursuit;


    public class Parrot implements Flier {

        private String food;
        private String biome;
        private int lifespan;


        public Parrot(){
            this.food = food;
            this.biome = biome;
            this.lifespan = lifespan;


        }

        public String getFood() {
            return food;
        }

        public String getBiome() {
            return biome;
        }

        public int getLifespan() {
            return lifespan;
        }

        public void printCharacteristics(){
            System.out.println(" ia ma a + this.getclass.getSimplname() + ");
        }

        @Override
        public void fly() {

        }
    }


