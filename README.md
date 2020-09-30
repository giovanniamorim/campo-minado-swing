# Jogo Campo Minado
Java 13 - Com Swing e Padrão Observer

Campo minado é um popular jogo de computador para um jogador. Foi inventado por Phil Spencer em 1989 e tem como objectivo revelar um campo de minas sem que alguma seja detonada. Este jogo tem sido reescrito para as mais diversas plataformas, sendo a sua versão mais popular a que vinha nativamente nas edições anteriores ao Windows 10.

<img src="https://github.com/giovanniamorim/campo-minado/blob/master/campo-minado-1.png">

# Java Swing
O Swing é um framework que disponibiliza um conjunto de elementos gráficos para ser utilizado na plataforma Java. O Swing é compatível com o Abstract Window Toolkit (AWT), mas trabalha de forma totalmente diferente. O Swing é mais completo e os programas têm uma aparência muito parecida, independente do sistema operacional que está sendo utilizado, possui uma enorme gama de controles extras disponíveis, tais como áreas de texto que nativamente podem mostrar conteúdo como RTF ou HTML, botões com suporte a imagens, sliders, selecionadores de cores, alteração do tipo de borda para os componentes, maior controle de como desenhar os mínimos detalhes de apresentação e muito mais. No entanto, a performance é um pouco pior devido a alta abstração, consumindo assim mais memória RAM.

# Padrão Observer em Java
Segundo a Wikipedia o padrão Observer é:

“Um padrão de projeto de software em que um objeto, chamado “subject”, mantém uma lista de seus dependentes, chamados de “observers”, e os notifica automaticamente de eventuais mudanças de estado, geralmente, chamando um dos seus métodos. É usado principalmente para implementar sistemas de tratamento de eventos distribuídos. O padrão Observer é também uma peça-chave no familiar padrão de arquitetura Model View Controller (MVC). Na verdade, o padrão Observer foi implementado pela primeira vez no framework MVC de interface de usuário Smalltalk. O observador padrão é implementado em inúmeras bibliotecas de programação e sistemas, incluindo quase todas as ferramentas GUI.”

Basicamente, é um padrão de projetos que define uma espécie de audição aos eventos selecionados para serem observados. Tal como descrito na Wikipédia, na grande maioria dos frameworks e bibliotecas de interfaces gráfica, em Java por exemplo, temos a presença constante de ouvintes de eventos que capturam determinados eventos de usuário (cliques, focos, teclas pressionadas, etc.) e executam ações respectivas a cada um dos mesmos.

O modelo do padrão define a criação de dois atores principais: o objeto sendo observado (o subject, ou observable) e o objeto observador (observer , ou listener), ambos com interfaces respectivas para registrar os métodos obrigatórios. E define para o mesmo, um tipo de relacionamento de dependência de one-to-many (um-para-muitos) entre os mesmos objetos, para que, em um dado momento que o estado do objeto for alterado, todos os objetos dependentes recebam essa atualização via pattern.
