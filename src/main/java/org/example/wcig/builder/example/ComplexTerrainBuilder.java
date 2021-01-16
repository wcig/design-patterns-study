package org.example.wcig.builder.example;

public class ComplexTerrainBuilder implements TerrainBuilder {
    private Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder builderWall() {
        terrain.w = new Wall(1,1,1,1);
        return this;
    }

    @Override
    public TerrainBuilder builderFort() {
        terrain.f = new Fort(1,1,1,1);
        return this;
    }

    @Override
    public TerrainBuilder builderMine() {
        terrain.m = new Mine(1,1,1,1);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
