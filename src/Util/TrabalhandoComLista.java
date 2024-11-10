package Util;

import Dominio.Categoria;
import Dominio.Palavra;
import com.google.gson.Gson;

import java.util.ArrayList;

public class TrabalhandoComLista {

   private String json = """
        {
            "meiosDeTransporte": ["carro", "avião", "trem", "ônibus", "barco", "bicicleta", "motocicleta", "patinete", "táxi", "metrô", "van", "caminhão", "helicóptero", "dirigível", "canoa", "escuna", "veleiro", "lancha", "submarino", "foguete"],
            "animais": ["cachorro", "gato", "elefante", "girafa", "leão", "tigre", "macaco", "cobra", "pássaro", "peixe", "baleia", "golfinho", "cavalo", "vaca", "ovelha", "porco", "galinha", "pato", "rato", "coelho", "hiena", "panda", "camelo", "canguru", "morcego", "coruja", "águia", "formiga", "abelha"],
            "comidas": ["pizza", "lasanha", "hambúrguer", "sushi", "macarrão", "arroz", "feijão", "frango", "carne", "peixe", "salada", "sopa", "bolo", "torta", "biscoito", "chocolate", "sorvete", "fruta", "leite", "suco", "café", "chá", "vinho", "cerveja", "sanduíche", "omelete", "panqueca", "pastel"],
            "sentimentos": ["alegria", "tristeza", "amor", "ódio", "raiva", "medo", "surpresa", "calma", "ansiedade", "felicidade", "inveja", "ciúme", "orgulho", "vergonha", "solidão", "esperança", "desesperança", "satisfação", "frustração", "saudade"],
            "paises": ["Brasil", "Estados Unidos", "Japão", "China", "Índia", "Rússia", "Alemanha", "França", "Reino Unido", "Itália", "Canadá", "Austrália", "Espanha", "Portugal", "México", "Argentina", "Chile", "Colômbia", "Peru", "Venezuela"],
            "objetos": ["cadeira", "mesa", "lápis", "caneta", "livro", "caderno", "computador", "celular", "relógio", "chave", "porta", "janela", "bola", "carro", "boneca", "carrinho", "brinquedo", "faca", "garfo", "colher", "copo", "prato", "xícara", "panela", "geladeira", "fogão", "cama", "almofada"]
        }
        
        """;

   public Categoria getLista() {
      Gson gson = new Gson();
      Categoria lista = gson.fromJson(json, Categoria.class);
      return lista;
   }

   public ArrayList<Palavra> extraindoPalavras(Categoria categoriaQualquer) {
      ArrayList<Palavra> listaProcessada = new ArrayList<>();
      for (String o : categoriaQualquer.getAnimais() ) {
         Palavra palavra = new Palavra();
         palavra.setPalavra(o);
         palavra.setTamanho(o.length());
         palavra.setDica("Animal");
         listaProcessada.add(palavra);
      }

      System.out.println(listaProcessada.get(17).getPalavra());
      return listaProcessada;
   }

}


