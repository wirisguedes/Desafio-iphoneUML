### Modelagem do iPhone

```mermaid

   classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
       
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone ..> ReprodutorMusical
    iPhone ..> AparelhoTelefonico
    iPhone ..> NavegadorInternet
```![image](https://github.com/wirisguedes/Desafio-iphoneUML/assets/50426735/a0b1eb6a-5a78-47bb-b039-24abe995ec93)
