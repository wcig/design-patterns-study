package org.example.wcig.builder.example;

public interface TerrainBuilder {
    TerrainBuilder builderWall();
    TerrainBuilder builderFort();
    TerrainBuilder builderMine();
    Terrain build();
}
