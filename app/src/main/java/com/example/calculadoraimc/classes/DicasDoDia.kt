package com.example.calculadoraimc.classes

import java.util.*

class DicasDoDia {

    fun dicasDoDia(): String {

        val dicas = listOf<String>(
            "Beba água\n\n" +
                    "Pode parecer um aviso simples, mas beber água é fundamental para a manutenção das funções vitais do organismo e para evitar a desidratação. Então, nada de passar horas sem beber água. Carregue sempre a sua garrafinha, principalmente se você morar em regiões mais quentes!",


            "Movimente-se\n\n" +
                    "A ideia de ficar bastante tempo sentado ou optar sempre pelo elevador podem parecer bem atrativas, mas, se formos avaliar todos os riscos que o sedentarismo causa à saúde, você não permaneceria com essa ideia por bastante tempo." +
                    "\n" +
                    "Se o seu trabalho exige que você fique sentado por muitas horas, programe horários para levantar e dar uma volta no ambiente em volta." +
                    "\n" +
                    "Além disso, também é importante adotar o hábito de praticar atividades físicas, de acordo com suas necessidades e recomendações médicas. Alguns exemplos de atividades possíveis de serem feitas são: natação, caminhada, dança, corrida, artes marciais, etc.",

            "Use protetor solar  \n\n" + "Cuidado com o sol! ",

            "Ria mais \n\n" + "O riso diminui o estresse, promove o bem-estar e fortalece as relações sociais.",

            "Alimente-se bem \n\n" +
                    "O debate sobre alimentação saudável não acontece por acaso. A alimentação saudável é primordial para evitar complicações cardiovasculares e combater o aumento desequilibrado do peso, por exemplo.",


            "Durma bem \n\n" +
                    "Você está dormindo bem? A qualidade do sono tem influência direta nos resultados das funções desempenhadas ao longo do dia. Uma noite incompleta de sono pode desencadear irritação, atraso de tarefas e sonolência durante o dia. Portanto, para evitar esses males, teste e descubra a quantidade de horas de sono adequadas ao seu organismo.",


            "Diminua o estresse\n\n" + "Respire fundo e relaxe. ",

            "Dialogue \n\n" + "Uma conversa amigável e compreensiva conserva relações. Ouça, fale, entenda! ",

            "Reserve um tempo para você \n\n" +
                    "Em meio à correria diária, os cuidados consigo mesmo também devem ser priorizados, seja para a realização de uma leitura, um passeio, cuidados com a beleza ou momentos de descanso. Ter tempo para si mesmo garante mais vigor!",
        )

        val sorteio = Random()
        val dica = sorteio.nextInt(dicas.size)

        return dicas[dica]
    }
}