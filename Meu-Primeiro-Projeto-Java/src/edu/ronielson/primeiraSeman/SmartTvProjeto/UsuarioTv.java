package edu.ronielson.primeiraSeman.SmartTvProjeto;

import edu.ronielson.primeiraSeman.SmartTvProjeto.SmartTv;

public class UsuarioTv {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv= new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status-> TV Ligada ?" + smartTv.ligada);

    }

}
