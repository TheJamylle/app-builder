package com.jamylle.app_builder;

import java.time.LocalDate;
import org.immutables.builder.Builder;

/**
 *
 * @author Jamylle
 */
public class Produto {
    private long id;
    private String urlFoto;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private String categoria;
    private int estoque = 0;
    private double largura;
    private double preco;
    private double peso;
    private double altura;
    private double profundidade;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private Vendedor vendedor;

    @Builder.Constructor
    Produto(long id, String urlFoto, String titulo, String descricao, String marca, String modelo, String categoria, double largura, double preco, double peso, double altura, double profundidade, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, Vendedor vendedor, int estoque) {
        this.id = id;
        this.urlFoto = urlFoto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.largura = largura;
        this.preco = preco;
        this.peso = peso;
        this.altura = altura;
        this.profundidade = profundidade;
        if((dataUltimaAtualizacao.isBefore(LocalDate.now())) || (dataCadastro.isBefore(LocalDate.now()))){
            throw new Error("Data de cadastro e de atualização não podem ser menor que data atual");
        } else {
            this.dataCadastro = dataCadastro;
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        }
        this.vendedor = vendedor;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", urlFoto=" + urlFoto + ", titulo=" + titulo + ", descricao=" + descricao + ", marca=" + marca + ", modelo=" + modelo + ", categoria=" + categoria + ", estoque=" + estoque + ", largura=" + largura + ", preco=" + preco + ", peso=" + peso + ", altura=" + altura + ", profundidade=" + profundidade + ", dataCadastro=" + dataCadastro + ", dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", vendedor=" + vendedor.getNome() + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

}
