# Projeto do Bootcamp de Desenvolvimento Java com Santander

Este projeto faz parte do **Bootcamp de Desenvolvimento Java com Santader da DIO**, em parceria com o **Santander**, com o objetivo de aplicar os conhecimentos adquiridos no desenvolvimento de um sistema utilizando **Java** e **Santander**.

O foco deste exercício foi criar uma modelagem UML para representar as funcionalidades do iPhone, abordando três componentes principais: o **Reprodutor Musical**, o **Aparelho Telefônico** e o **Navegador de Internet**. A UML (Unified Modeling Language) é uma linguagem padrão utilizada para especificar, visualizar, construir e documentar sistemas de software, sendo uma ferramenta essencial na arquitetura de sistemas.

## Descrição das Funcionalidades

### Reprodutor Musical

O **Reprodutor Musical** é responsável pela gestão das músicas no dispositivo. Ele possui as seguintes funcionalidades:
- `tocar()`: Inicia a reprodução de uma música.
- `pausar()`: Pausa a reprodução da música.
- `selecionarMusica(string Musica)`: Escolhe a música que será reproduzida.

### Aparelho Telefônico

O **Aparelho Telefônico** é responsável pela gestão das chamadas e do correio de voz. Suas principais funções incluem:
- `ligar(string Numero)`: Faz uma chamada para o número especificado.
- `atender()`: Atende uma chamada recebida.
- `iniciarCorreioVoz()`: Ativa o correio de voz.

### Navegador de Internet

O **Navegador de Internet** permite a navegação na web e é responsável por:
- `exibirPagina(string url)`: Exibe a página web do URL fornecido.
- `adicionarNovaAba()`: Adiciona uma nova aba ao navegador.
- `atualizarPagina()`: Atualiza a página web atual.

## Diagrama de Classes UML

A modelagem do diagrama de classes foi projetada para ilustrar a interação entre as funcionalidades mencionadas. O diagrama a seguir reflete como os componentes do iPhone interagem e como suas funcionalidades são integradas.

### Descrição do Diagrama

- **iPhone**: A classe principal que agrega as funcionalidades de **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador de Internet**, formando a base do sistema.
- **Reprodutor Musical**: Classe responsável pela reprodução de músicas, com métodos para controlar a reprodução, como `tocar()`, `pausar()` e `selecionarMusica()`.
- **Aparelho Telefônico**: Classe que gerencia as funções de chamadas, como realizar ligações, atender chamadas e acessar o correio de voz.
- **Navegador de Internet**: Classe que gerencia a navegação na web, com funcionalidades para exibir páginas, adicionar abas e atualizar o conteúdo.

## Conclusão

A modelagem UML realizada neste projeto oferece uma estrutura bem definida das funcionalidades do iPhone. Ela permite um entendimento mais claro de como as diferentes funcionalidades interagem e são organizadas dentro do sistema. A abordagem modular, proporcionada pela UML, é fundamental para o desenvolvimento contínuo, pois facilita a manutenção e evolução do sistema, além de ser uma ferramenta essencial para a documentação e análise de sistemas de software.
