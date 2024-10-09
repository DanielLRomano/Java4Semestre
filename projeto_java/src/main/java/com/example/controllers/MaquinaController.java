package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.api.MaquinaAPI;
import com.example.models.Maquina;

public class MaquinaController {
    private List<Maquina> maquinas;

    public MaquinaController() {
        maquinas = new ArrayList<>();
    }

    // metodos - CRUD
    // Método para criar uma nova máquina
    public void CreateMaquina(Maquina maquina) {
        this.maquinas.add(maquina);
    }

    // Método para ler todas as máquinas
    public List<Maquina> readMaquinas() {
        maquinas = MaquinaAPI.getMaquinas();
        return maquinas;
    }

    // Método para atualizar uma máquina
    public void updateMaquina(int posicao, Maquina maquina) {
        maquinas.set(posicao, maquina);
    }

    // Método para deletar uma máquina
    public void deleMaquina(int posicao) {
        maquinas.remove(posicao);
    }
}
