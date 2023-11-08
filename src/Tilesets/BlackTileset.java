package Tilesets;

import Builders.FrameBuilder;
import Builders.MapTileBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import Level.TileType;
import Level.Tileset;

import java.util.ArrayList;

public class BlackTileset extends Tileset {
    public BlackTileset() {
        super(ImageLoader.load("BlackTile.png"), 16, 16, 1); // Replace "BlackTile.png" with the actual path to your black tile image.
    }

    @Override
    public ArrayList<MapTileBuilder> defineTiles() {
        ArrayList<MapTileBuilder> mapTiles = new ArrayList<>();

        Frame blackFrame = new FrameBuilder(getSubImage(0, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder blackTile = new MapTileBuilder(blackFrame)
                .withTileType(TileType.PASSABLE); // Use TileType.PASSABLE for a completely black tile.

        mapTiles.add(blackTile);

        return mapTiles;
    }
}