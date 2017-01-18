import java.util.ArrayList;

public class DeterminaMedalhas {

    public static void SetaMedalhas(ArrayList<Notas> listaNotas, ArrayList<MedalhasPais> medalhasPais) {
        // Seta a medalha de ouro
        int MatchOuro = listaNotas.get(0).getAtleta().getIdPais();
        for (int i = 0; i < medalhasPais.size(); i++) {
            if (medalhasPais.get(i).getPais().getId() == MatchOuro) {
                medalhasPais.get(i).insereOuro();
                Pais p = medalhasPais.get(i).getPais();
                MedalhasPais medalhaOuro = new MedalhasPais(p, medalhasPais.get(i).getOuro(), medalhasPais.get(i).getPrata(), medalhasPais.get(i).getBronze());
                medalhasPais.set(i, medalhaOuro);
            }
        }

        int MatchPrata = listaNotas.get(1).getAtleta().getIdPais();
        for (int i = 0; i < medalhasPais.size(); i++) {
            if (medalhasPais.get(i).getPais().getId() == MatchPrata) {
                medalhasPais.get(i).inserePrata();
                Pais p = medalhasPais.get(i).getPais();
                MedalhasPais medalhaPrata = new MedalhasPais(p, medalhasPais.get(i).getOuro(), medalhasPais.get(i).getPrata(), medalhasPais.get(i).getBronze());
                medalhasPais.set(i, medalhaPrata);
            }
        }

        int MatchBronze = listaNotas.get(2).getAtleta().getIdPais();
        for (int i = 0; i < medalhasPais.size(); i++) {
            if (medalhasPais.get(i).getPais().getId() == MatchBronze) {
                medalhasPais.get(i).insereBronze();
                Pais p = medalhasPais.get(i).getPais();
                MedalhasPais medalhaBronze = new MedalhasPais(p, medalhasPais.get(i).getOuro(), medalhasPais.get(i).getPrata(), medalhasPais.get(i).getBronze());
                medalhasPais.set(i, medalhaBronze);
            }
        }
    }

}
