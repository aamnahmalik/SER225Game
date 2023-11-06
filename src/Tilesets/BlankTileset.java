package Tilesets;

import Builders.FrameBuilder;
import Builders.MapTileBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import Level.Tileset;

import java.util.ArrayList;

public class BlankTileset extends Tileset 
{
    public BlankTileset() 
    {
        super(ImageLoader.load("BlankMapTileset.png"), 16, 16, 3);
    }

    @Override
    public ArrayList<MapTileBuilder> defineTiles() 
    {
        ArrayList<MapTileBuilder> mapTiles = new ArrayList<>();

        Frame frame1 = new FrameBuilder(getSubImage(0, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile1 = new MapTileBuilder(frame1);

        mapTiles.add(tile1);

        Frame frame2 = new FrameBuilder(getSubImage(0, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile2 = new MapTileBuilder(frame2);

        mapTiles.add(tile2);

        return mapTiles;
    }
}
