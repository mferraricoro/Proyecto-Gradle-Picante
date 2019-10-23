package tutoci;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcesadorDeAlimentos {
    public List<Alimento> alimentos;

    public ProcesadorDeAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public List<Alimento> filterEj1(Integer weight){
        return this.alimentos.stream().filter(a-> weight <= a.getKiloCalorias()).collect(Collectors.toList());
    }

    public List<Alimento> filterEj2(String code){
        return this.alimentos.stream().filter(a-> code == a.getCodigo()).collect(Collectors.toList());
    }

    public Integer filterEj3(){
        return this.alimentos.stream().reduce(0, (sum, a) -> sum + a.getKiloCalorias(), Integer::sum);
    }

    public Integer filterEj4(String ingredient){
        return this.alimentos.stream().filter(a-> a.getIngredientes().contains(ingredient))
                .reduce(0, (sum, a) -> sum + a.getKiloCalorias(), Integer::sum);
    }

}
