package veiculos;


public class Ferrari extends Veiculo implements Conversivel {

    private boolean capotaAberta;
    private boolean farolNeblina;

    public Ferrari(String n) {
        int lv = 320;
        int va = 20;
        super(n,lv,va);
        capotaAberta = false;
        farolNeblina = false;
    }

    @Override
    public boolean abrirCapota() {

    }

    @Override
    public boolean fecharCapota() {
        if (capotaAberta){
            System.out.println("fechando capota da ferrari "+ nome);
            capotaAberta = false;
            return true;
        }
        System.out.println("capota da ferrari "+ nome+" já estava fechada");
        return false;
    }

    @Override
    public void frear(int i) {
        System.out.println("Ferrari "+ nome+" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        System.out.println("Ferrari "+ nome + " acelerando com intensidade " + i);
    }

    public boolean ligarFarolNeblina(){
        if (farolNeblina){
            System.out.println("Farol já estava ligado da ferrari " + nome);
            return false;
        }
        System.out.println("Ligando farol de neblina da ferrari " + nome);
        farolNeblina = true;
        return true;
    }
}