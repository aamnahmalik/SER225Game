package Tilesets;

import java.util.ArrayList;

import Builders.FrameBuilder;
import Builders.MapTileBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import Level.TileType;
import Level.Tileset;

public class ZombieTileset extends Tileset {
        public ZombieTileset() {
                super(ImageLoader.load("temporaryZombieTileset.png"), 16, 16, 3);
        }

        @Override
        public ArrayList<MapTileBuilder> defineTiles() {
                ArrayList<MapTileBuilder> mapTiles = new ArrayList<>();

                Frame frame1 = new FrameBuilder(getSubImage(0, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile1 = new MapTileBuilder(frame1)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile1);

                Frame frame2 = new FrameBuilder(getSubImage(0, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile2 = new MapTileBuilder(frame2)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile2);

                Frame frame3 = new FrameBuilder(getSubImage(0, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile3 = new MapTileBuilder(frame3)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile3);

                Frame frame4 = new FrameBuilder(getSubImage(0, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile4 = new MapTileBuilder(frame4)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile4);

                Frame frame5 = new FrameBuilder(getSubImage(0, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile5 = new MapTileBuilder(frame5)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile5);

                Frame frame6 = new FrameBuilder(getSubImage(0, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile6 = new MapTileBuilder(frame6)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile6);

                Frame frame7 = new FrameBuilder(getSubImage(0, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile7 = new MapTileBuilder(frame7)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile7);

                Frame frame8 = new FrameBuilder(getSubImage(0, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile8 = new MapTileBuilder(frame8)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile8);

                Frame frame9 = new FrameBuilder(getSubImage(0, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile9 = new MapTileBuilder(frame9)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile9);

                Frame frame10 = new FrameBuilder(getSubImage(1, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile10 = new MapTileBuilder(frame10)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile10);

                Frame frame11 = new FrameBuilder(getSubImage(1, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile11 = new MapTileBuilder(frame11)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile11);

                Frame frame12 = new FrameBuilder(getSubImage(1, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile12 = new MapTileBuilder(frame12)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile12);

                Frame frame13 = new FrameBuilder(getSubImage(1, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile13 = new MapTileBuilder(frame13)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile13);

                Frame frame14 = new FrameBuilder(getSubImage(1, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile14 = new MapTileBuilder(frame14)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile14);

                Frame frame15 = new FrameBuilder(getSubImage(1, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile15 = new MapTileBuilder(frame15)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile15);

                Frame frame16 = new FrameBuilder(getSubImage(1, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile16 = new MapTileBuilder(frame16)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile16);

                Frame frame17 = new FrameBuilder(getSubImage(1, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile17 = new MapTileBuilder(frame17)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile17);

                Frame frame18 = new FrameBuilder(getSubImage(1, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile18 = new MapTileBuilder(frame18)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile18);

                Frame frame19 = new FrameBuilder(getSubImage(2, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile19 = new MapTileBuilder(frame19)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile19);

                Frame frame20 = new FrameBuilder(getSubImage(2, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile20 = new MapTileBuilder(frame20)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile20);

                Frame frame21 = new FrameBuilder(getSubImage(2, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile21 = new MapTileBuilder(frame21)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile21);

                Frame frame22 = new FrameBuilder(getSubImage(2, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile22 = new MapTileBuilder(frame22)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile22);

                Frame frame23 = new FrameBuilder(getSubImage(2, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile23 = new MapTileBuilder(frame23)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile23);

                Frame frame24 = new FrameBuilder(getSubImage(2, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile24 = new MapTileBuilder(frame24)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile24);

                Frame frame25 = new FrameBuilder(getSubImage(2, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile25 = new MapTileBuilder(frame25)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile25);

                Frame frame26 = new FrameBuilder(getSubImage(2, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile26 = new MapTileBuilder(frame26)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile26);

                Frame frame27 = new FrameBuilder(getSubImage(2, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile27 = new MapTileBuilder(frame27)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile27);

                Frame frame28 = new FrameBuilder(getSubImage(3, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile28 = new MapTileBuilder(frame28)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile28);

                Frame frame29 = new FrameBuilder(getSubImage(3, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile29 = new MapTileBuilder(frame29)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile29);

                Frame frame30 = new FrameBuilder(getSubImage(3, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile30 = new MapTileBuilder(frame30)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile30);

                Frame frame31 = new FrameBuilder(getSubImage(3, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile31 = new MapTileBuilder(frame31)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile31);

                Frame frame32 = new FrameBuilder(getSubImage(3, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile32 = new MapTileBuilder(frame32)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile32);

                Frame frame33 = new FrameBuilder(getSubImage(3, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile33 = new MapTileBuilder(frame33)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile33);

                Frame frame34 = new FrameBuilder(getSubImage(3, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile34 = new MapTileBuilder(frame34)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile34);

                Frame frame35 = new FrameBuilder(getSubImage(3, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile35 = new MapTileBuilder(frame35)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile35);

                Frame frame36 = new FrameBuilder(getSubImage(3, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile36 = new MapTileBuilder(frame36)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile36);

                Frame frame37 = new FrameBuilder(getSubImage(4, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile37 = new MapTileBuilder(frame37)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile37);

                Frame frame38 = new FrameBuilder(getSubImage(4, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile38 = new MapTileBuilder(frame38)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile38);

                Frame frame39 = new FrameBuilder(getSubImage(4, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile39 = new MapTileBuilder(frame39)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile39);

                Frame frame40 = new FrameBuilder(getSubImage(4, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile40 = new MapTileBuilder(frame40)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile40);

                Frame frame41 = new FrameBuilder(getSubImage(4, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile41 = new MapTileBuilder(frame41)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile41);

                Frame frame42 = new FrameBuilder(getSubImage(4, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile42 = new MapTileBuilder(frame42)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile42);

                Frame frame43 = new FrameBuilder(getSubImage(4, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile43 = new MapTileBuilder(frame43)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile43);

                Frame frame44 = new FrameBuilder(getSubImage(4, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile44 = new MapTileBuilder(frame44)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile44);

                Frame frame45 = new FrameBuilder(getSubImage(4, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile45 = new MapTileBuilder(frame45)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile45);

                Frame frame46 = new FrameBuilder(getSubImage(5, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile46 = new MapTileBuilder(frame46)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile46);

                Frame frame47 = new FrameBuilder(getSubImage(5, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile47 = new MapTileBuilder(frame47)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile47);

                Frame frame48 = new FrameBuilder(getSubImage(5, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile48 = new MapTileBuilder(frame48)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile48);

                Frame frame49 = new FrameBuilder(getSubImage(5, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile49 = new MapTileBuilder(frame49)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile49);

                Frame frame50 = new FrameBuilder(getSubImage(5, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile50 = new MapTileBuilder(frame50)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile50);

                Frame frame51 = new FrameBuilder(getSubImage(5, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile51 = new MapTileBuilder(frame51)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile51);

                Frame frame52 = new FrameBuilder(getSubImage(5, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile52 = new MapTileBuilder(frame52)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile52);

                Frame frame53 = new FrameBuilder(getSubImage(5, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile53 = new MapTileBuilder(frame53)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile53);

                Frame frame54 = new FrameBuilder(getSubImage(5, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile54 = new MapTileBuilder(frame54)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile54);
                return mapTiles;
        }
}
