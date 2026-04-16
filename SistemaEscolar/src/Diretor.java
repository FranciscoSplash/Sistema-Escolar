public class Diretor extends Pessoa{
        private int tempodeGestao;


        public  Diretor(String nome, int idade, int tempodeGestao){
            super(nome, idade);

            this.tempodeGestao=tempodeGestao;
        }

        public int getTempodeGestao() {
            return tempodeGestao;
        }

        @Override
        public String apresentar(){
            return getNome()+" "+tempodeGestao;
        }
    }




