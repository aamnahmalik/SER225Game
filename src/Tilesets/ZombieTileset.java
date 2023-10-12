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
                super(ImageLoader.load("ZombieTileset.png"), 16, 16, 1);
        }

        @Override
        public ArrayList<MapTileBuilder> defineTiles() {
                ArrayList<MapTileBuilder> mapTiles = new ArrayList<>();

                Frame frame = new FrameBuilder(getSubImage(0, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile = new MapTileBuilder(frame)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile);

                Frame frame1 = new FrameBuilder(getSubImage(0, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile1 = new MapTileBuilder(frame1)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile1);

                Frame frame2 = new FrameBuilder(getSubImage(1, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile2 = new MapTileBuilder(frame2)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile2);

                Frame frame3 = new FrameBuilder(getSubImage(2, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile3 = new MapTileBuilder(frame3)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile3);

                Frame frame4 = new FrameBuilder(getSubImage(3, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile4 = new MapTileBuilder(frame4)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile4);

                Frame frame5 = new FrameBuilder(getSubImage(4, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile5 = new MapTileBuilder(frame5)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile5);

                Frame frame6 = new FrameBuilder(getSubImage(5, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile6 = new MapTileBuilder(frame6)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile6);

                Frame frame7 = new FrameBuilder(getSubImage(6, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile7 = new MapTileBuilder(frame7)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile7);

                Frame frame8 = new FrameBuilder(getSubImage(7, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile8 = new MapTileBuilder(frame8)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile8);

                Frame frame9 = new FrameBuilder(getSubImage(8, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile9 = new MapTileBuilder(frame9)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile9);

                Frame frame10 = new FrameBuilder(getSubImage(9, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile10 = new MapTileBuilder(frame10)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile10);

                Frame frame11 = new FrameBuilder(getSubImage(10, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile11 = new MapTileBuilder(frame11)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile11);

                Frame frame12 = new FrameBuilder(getSubImage(11, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile12 = new MapTileBuilder(frame12)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile12);

                Frame frame13 = new FrameBuilder(getSubImage(12, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile13 = new MapTileBuilder(frame13)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile13);

                Frame frame14 = new FrameBuilder(getSubImage(13, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile14 = new MapTileBuilder(frame14)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile14);

                Frame frame15 = new FrameBuilder(getSubImage(14, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile15 = new MapTileBuilder(frame15)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile15);

                Frame frame16 = new FrameBuilder(getSubImage(15, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile16 = new MapTileBuilder(frame16)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile16);

                Frame frame17 = new FrameBuilder(getSubImage(16, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile17 = new MapTileBuilder(frame17)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile17);

                Frame frame18 = new FrameBuilder(getSubImage(17, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile18 = new MapTileBuilder(frame18)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile18);

                Frame frame19 = new FrameBuilder(getSubImage(18, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile19 = new MapTileBuilder(frame19)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile19);

                Frame frame20 = new FrameBuilder(getSubImage(19, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile20 = new MapTileBuilder(frame20)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile20);

                Frame frame21 = new FrameBuilder(getSubImage(20, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile21 = new MapTileBuilder(frame21)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile21);

                Frame frame22 = new FrameBuilder(getSubImage(21, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile22 = new MapTileBuilder(frame22)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile22);

                Frame frame23 = new FrameBuilder(getSubImage(22, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile23 = new MapTileBuilder(frame23)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile23);

                Frame frame24 = new FrameBuilder(getSubImage(23, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile24 = new MapTileBuilder(frame24)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile24);

                Frame frame25 = new FrameBuilder(getSubImage(24, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile25 = new MapTileBuilder(frame25)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile25);

                Frame frame26 = new FrameBuilder(getSubImage(25, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile26 = new MapTileBuilder(frame26)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile26);

                Frame frame27 = new FrameBuilder(getSubImage(26, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile27 = new MapTileBuilder(frame27)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile27);

                Frame frame28 = new FrameBuilder(getSubImage(27, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile28 = new MapTileBuilder(frame28)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile28);

                Frame frame29 = new FrameBuilder(getSubImage(28, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile29 = new MapTileBuilder(frame29)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile29);

                Frame frame30 = new FrameBuilder(getSubImage(29, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile30 = new MapTileBuilder(frame30)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile30);

                Frame frame31 = new FrameBuilder(getSubImage(30, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile31 = new MapTileBuilder(frame31)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile31);

                Frame frame32 = new FrameBuilder(getSubImage(31, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile32 = new MapTileBuilder(frame32)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile32);

                Frame frame33 = new FrameBuilder(getSubImage(32, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile33 = new MapTileBuilder(frame33)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile33);

                Frame frame34 = new FrameBuilder(getSubImage(33, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile34 = new MapTileBuilder(frame34)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile34);

                Frame frame35 = new FrameBuilder(getSubImage(34, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile35 = new MapTileBuilder(frame35)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile35);

                Frame frame36 = new FrameBuilder(getSubImage(35, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile36 = new MapTileBuilder(frame36)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile36);

                Frame frame37 = new FrameBuilder(getSubImage(36, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile37 = new MapTileBuilder(frame37)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile37);

                Frame frame38 = new FrameBuilder(getSubImage(0, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile38 = new MapTileBuilder(frame38)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile38);

                Frame frame39 = new FrameBuilder(getSubImage(1, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile39 = new MapTileBuilder(frame39)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile39);

                Frame frame40 = new FrameBuilder(getSubImage(2, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile40 = new MapTileBuilder(frame40)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile40);

                Frame frame41 = new FrameBuilder(getSubImage(3, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile41 = new MapTileBuilder(frame41)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile41);

                Frame frame42 = new FrameBuilder(getSubImage(4, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile42 = new MapTileBuilder(frame42)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile42);

                Frame frame43 = new FrameBuilder(getSubImage(5, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile43 = new MapTileBuilder(frame43)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile43);

                Frame frame44 = new FrameBuilder(getSubImage(6, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile44 = new MapTileBuilder(frame44)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile44);

                Frame frame45 = new FrameBuilder(getSubImage(7, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile45 = new MapTileBuilder(frame45)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile45);

                Frame frame46 = new FrameBuilder(getSubImage(8, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile46 = new MapTileBuilder(frame46)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile46);

                Frame frame47 = new FrameBuilder(getSubImage(9, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile47 = new MapTileBuilder(frame47)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile47);

                Frame frame48 = new FrameBuilder(getSubImage(10, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile48 = new MapTileBuilder(frame48)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile48);

                Frame frame49 = new FrameBuilder(getSubImage(11, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile49 = new MapTileBuilder(frame49)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile49);

                Frame frame50 = new FrameBuilder(getSubImage(12, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile50 = new MapTileBuilder(frame50)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile50);

                Frame frame51 = new FrameBuilder(getSubImage(13, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile51 = new MapTileBuilder(frame51)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile51);

                Frame frame52 = new FrameBuilder(getSubImage(14, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile52 = new MapTileBuilder(frame52)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile52);

                Frame frame53 = new FrameBuilder(getSubImage(15, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile53 = new MapTileBuilder(frame53)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile53);

                Frame frame54 = new FrameBuilder(getSubImage(16, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile54 = new MapTileBuilder(frame54)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile54);

                Frame frame55 = new FrameBuilder(getSubImage(17, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile55 = new MapTileBuilder(frame55)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile55);

                Frame frame56 = new FrameBuilder(getSubImage(18, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile56 = new MapTileBuilder(frame56)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile56);

                Frame frame57 = new FrameBuilder(getSubImage(19, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile57 = new MapTileBuilder(frame57)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile57);

                Frame frame58 = new FrameBuilder(getSubImage(20, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile58 = new MapTileBuilder(frame58)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile58);

                Frame frame59 = new FrameBuilder(getSubImage(21, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile59 = new MapTileBuilder(frame59)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile59);

                Frame frame60 = new FrameBuilder(getSubImage(22, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile60 = new MapTileBuilder(frame60)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile60);

                Frame frame61 = new FrameBuilder(getSubImage(23, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile61 = new MapTileBuilder(frame61)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile61);

                Frame frame62 = new FrameBuilder(getSubImage(24, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile62 = new MapTileBuilder(frame62)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile62);

                Frame frame63 = new FrameBuilder(getSubImage(25, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile63 = new MapTileBuilder(frame63)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile63);

                Frame frame64 = new FrameBuilder(getSubImage(26, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile64 = new MapTileBuilder(frame64)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile64);

                Frame frame65 = new FrameBuilder(getSubImage(27, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile65 = new MapTileBuilder(frame65)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile65);

                Frame frame66 = new FrameBuilder(getSubImage(28, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile66 = new MapTileBuilder(frame66)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile66);

                Frame frame67 = new FrameBuilder(getSubImage(29, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile67 = new MapTileBuilder(frame67)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile67);

                Frame frame68 = new FrameBuilder(getSubImage(30, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile68 = new MapTileBuilder(frame68)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile68);

                Frame frame69 = new FrameBuilder(getSubImage(31, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile69 = new MapTileBuilder(frame69)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile69);

                Frame frame70 = new FrameBuilder(getSubImage(32, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile70 = new MapTileBuilder(frame70)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile70);

                Frame frame71 = new FrameBuilder(getSubImage(33, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile71 = new MapTileBuilder(frame71)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile71);

                Frame frame72 = new FrameBuilder(getSubImage(34, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile72 = new MapTileBuilder(frame72)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile72);

                Frame frame73 = new FrameBuilder(getSubImage(35, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile73 = new MapTileBuilder(frame73)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile73);

                Frame frame74 = new FrameBuilder(getSubImage(36, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile74 = new MapTileBuilder(frame74)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile74);

                Frame frame75 = new FrameBuilder(getSubImage(0, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile75 = new MapTileBuilder(frame75)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile75);

                Frame frame76 = new FrameBuilder(getSubImage(1, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile76 = new MapTileBuilder(frame76)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile76);

                Frame frame77 = new FrameBuilder(getSubImage(2, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile77 = new MapTileBuilder(frame77)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile77);

                Frame frame78 = new FrameBuilder(getSubImage(3, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile78 = new MapTileBuilder(frame78)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile78);

                Frame frame79 = new FrameBuilder(getSubImage(4, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile79 = new MapTileBuilder(frame79)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile79);

                Frame frame80 = new FrameBuilder(getSubImage(5, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile80 = new MapTileBuilder(frame80)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile80);

                Frame frame81 = new FrameBuilder(getSubImage(6, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile81 = new MapTileBuilder(frame81)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile81);

                Frame frame82 = new FrameBuilder(getSubImage(7, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile82 = new MapTileBuilder(frame82)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile82);

                Frame frame83 = new FrameBuilder(getSubImage(8, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile83 = new MapTileBuilder(frame83)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile83);

                Frame frame84 = new FrameBuilder(getSubImage(9, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile84 = new MapTileBuilder(frame84)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile84);

                Frame frame85 = new FrameBuilder(getSubImage(10, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile85 = new MapTileBuilder(frame85)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile85);

                Frame frame86 = new FrameBuilder(getSubImage(11, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile86 = new MapTileBuilder(frame86)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile86);

                Frame frame87 = new FrameBuilder(getSubImage(12, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile87 = new MapTileBuilder(frame87)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile87);

                Frame frame88 = new FrameBuilder(getSubImage(13, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile88 = new MapTileBuilder(frame88)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile88);

                Frame frame89 = new FrameBuilder(getSubImage(14, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile89 = new MapTileBuilder(frame89)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile89);

                Frame frame90 = new FrameBuilder(getSubImage(15, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile90 = new MapTileBuilder(frame90)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile90);

                Frame frame91 = new FrameBuilder(getSubImage(16, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile91 = new MapTileBuilder(frame91)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile91);

                Frame frame92 = new FrameBuilder(getSubImage(17, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile92 = new MapTileBuilder(frame92)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile92);

                Frame frame93 = new FrameBuilder(getSubImage(18, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile93 = new MapTileBuilder(frame93)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile93);

                Frame frame94 = new FrameBuilder(getSubImage(19, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile94 = new MapTileBuilder(frame94)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile94);

                Frame frame95 = new FrameBuilder(getSubImage(20, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile95 = new MapTileBuilder(frame95)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile95);

                Frame frame96 = new FrameBuilder(getSubImage(21, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile96 = new MapTileBuilder(frame96)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile96);

                Frame frame97 = new FrameBuilder(getSubImage(22, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile97 = new MapTileBuilder(frame97)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile97);

                Frame frame98 = new FrameBuilder(getSubImage(23, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile98 = new MapTileBuilder(frame98)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile98);

                Frame frame99 = new FrameBuilder(getSubImage(24, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile99 = new MapTileBuilder(frame99)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile99);

                Frame frame100 = new FrameBuilder(getSubImage(25, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile100 = new MapTileBuilder(frame100)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile100);

                Frame frame101 = new FrameBuilder(getSubImage(26, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile101 = new MapTileBuilder(frame101)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile101);

                Frame frame102 = new FrameBuilder(getSubImage(27, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile102 = new MapTileBuilder(frame102)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile102);

                Frame frame103 = new FrameBuilder(getSubImage(28, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile103 = new MapTileBuilder(frame103)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile103);

                Frame frame104 = new FrameBuilder(getSubImage(29, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile104 = new MapTileBuilder(frame104)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile104);

                Frame frame105 = new FrameBuilder(getSubImage(30, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile105 = new MapTileBuilder(frame105)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile105);

                Frame frame106 = new FrameBuilder(getSubImage(31, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile106 = new MapTileBuilder(frame106)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile106);

                Frame frame107 = new FrameBuilder(getSubImage(32, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile107 = new MapTileBuilder(frame107)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile107);

                Frame frame108 = new FrameBuilder(getSubImage(33, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile108 = new MapTileBuilder(frame108)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile108);

                Frame frame109 = new FrameBuilder(getSubImage(34, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile109 = new MapTileBuilder(frame109)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile109);

                Frame frame110 = new FrameBuilder(getSubImage(35, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile110 = new MapTileBuilder(frame110)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile110);

                Frame frame111 = new FrameBuilder(getSubImage(36, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile111 = new MapTileBuilder(frame111)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile111);

                Frame frame112 = new FrameBuilder(getSubImage(0, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile112 = new MapTileBuilder(frame112)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile112);

                Frame frame113 = new FrameBuilder(getSubImage(1, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile113 = new MapTileBuilder(frame113)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile113);

                Frame frame114 = new FrameBuilder(getSubImage(2, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile114 = new MapTileBuilder(frame114)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile114);

                Frame frame115 = new FrameBuilder(getSubImage(3, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile115 = new MapTileBuilder(frame115)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile115);

                Frame frame116 = new FrameBuilder(getSubImage(4, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile116 = new MapTileBuilder(frame116)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile116);

                Frame frame117 = new FrameBuilder(getSubImage(5, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile117 = new MapTileBuilder(frame117)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile117);

                Frame frame118 = new FrameBuilder(getSubImage(6, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile118 = new MapTileBuilder(frame118)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile118);

                Frame frame119 = new FrameBuilder(getSubImage(7, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile119 = new MapTileBuilder(frame119)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile119);

                Frame frame120 = new FrameBuilder(getSubImage(8, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile120 = new MapTileBuilder(frame120)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile120);

                Frame frame121 = new FrameBuilder(getSubImage(9, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile121 = new MapTileBuilder(frame121)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile121);

                Frame frame122 = new FrameBuilder(getSubImage(10, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile122 = new MapTileBuilder(frame122)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile122);

                Frame frame123 = new FrameBuilder(getSubImage(11, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile123 = new MapTileBuilder(frame123)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile123);

                Frame frame124 = new FrameBuilder(getSubImage(12, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile124 = new MapTileBuilder(frame124)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile124);

                Frame frame125 = new FrameBuilder(getSubImage(13, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile125 = new MapTileBuilder(frame125)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile125);

                Frame frame126 = new FrameBuilder(getSubImage(14, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile126 = new MapTileBuilder(frame126)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile126);

                Frame frame127 = new FrameBuilder(getSubImage(15, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile127 = new MapTileBuilder(frame127)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile127);

                Frame frame128 = new FrameBuilder(getSubImage(16, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile128 = new MapTileBuilder(frame128)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile128);

                Frame frame129 = new FrameBuilder(getSubImage(17, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile129 = new MapTileBuilder(frame129)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile129);

                Frame frame130 = new FrameBuilder(getSubImage(18, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile130 = new MapTileBuilder(frame130)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile130);

                Frame frame131 = new FrameBuilder(getSubImage(19, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile131 = new MapTileBuilder(frame131)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile131);

                Frame frame132 = new FrameBuilder(getSubImage(20, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile132 = new MapTileBuilder(frame132)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile132);

                Frame frame133 = new FrameBuilder(getSubImage(21, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile133 = new MapTileBuilder(frame133)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile133);

                Frame frame134 = new FrameBuilder(getSubImage(22, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile134 = new MapTileBuilder(frame134)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile134);

                Frame frame135 = new FrameBuilder(getSubImage(23, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile135 = new MapTileBuilder(frame135)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile135);

                Frame frame136 = new FrameBuilder(getSubImage(24, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile136 = new MapTileBuilder(frame136)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile136);

                Frame frame137 = new FrameBuilder(getSubImage(25, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile137 = new MapTileBuilder(frame137)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile137);

                Frame frame138 = new FrameBuilder(getSubImage(26, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile138 = new MapTileBuilder(frame138)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile138);

                Frame frame139 = new FrameBuilder(getSubImage(27, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile139 = new MapTileBuilder(frame139)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile139);

                Frame frame140 = new FrameBuilder(getSubImage(28, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile140 = new MapTileBuilder(frame140)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile140);

                Frame frame141 = new FrameBuilder(getSubImage(29, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile141 = new MapTileBuilder(frame141)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile141);

                Frame frame142 = new FrameBuilder(getSubImage(30, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile142 = new MapTileBuilder(frame142)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile142);

                Frame frame143 = new FrameBuilder(getSubImage(31, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile143 = new MapTileBuilder(frame143)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile143);

                Frame frame144 = new FrameBuilder(getSubImage(32, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile144 = new MapTileBuilder(frame144)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile144);

                Frame frame145 = new FrameBuilder(getSubImage(33, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile145 = new MapTileBuilder(frame145)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile145);

                Frame frame146 = new FrameBuilder(getSubImage(34, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile146 = new MapTileBuilder(frame146)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile146);

                Frame frame147 = new FrameBuilder(getSubImage(35, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile147 = new MapTileBuilder(frame147)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile147);

                Frame frame148 = new FrameBuilder(getSubImage(36, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile148 = new MapTileBuilder(frame148)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile148);

                Frame frame149 = new FrameBuilder(getSubImage(0, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile149 = new MapTileBuilder(frame149)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile149);

                Frame frame150 = new FrameBuilder(getSubImage(1, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile150 = new MapTileBuilder(frame150)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile150);

                Frame frame151 = new FrameBuilder(getSubImage(2, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile151 = new MapTileBuilder(frame151)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile151);

                Frame frame152 = new FrameBuilder(getSubImage(3, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile152 = new MapTileBuilder(frame152)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile152);

                Frame frame153 = new FrameBuilder(getSubImage(4, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile153 = new MapTileBuilder(frame153)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile153);

                Frame frame154 = new FrameBuilder(getSubImage(5, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile154 = new MapTileBuilder(frame154)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile154);

                Frame frame155 = new FrameBuilder(getSubImage(6, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile155 = new MapTileBuilder(frame155)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile155);

                Frame frame156 = new FrameBuilder(getSubImage(7, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile156 = new MapTileBuilder(frame156)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile156);

                Frame frame157 = new FrameBuilder(getSubImage(8, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile157 = new MapTileBuilder(frame157)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile157);

                Frame frame158 = new FrameBuilder(getSubImage(9, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile158 = new MapTileBuilder(frame158)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile158);

                Frame frame159 = new FrameBuilder(getSubImage(10, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile159 = new MapTileBuilder(frame159)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile159);

                Frame frame160 = new FrameBuilder(getSubImage(11, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile160 = new MapTileBuilder(frame160)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile160);

                Frame frame161 = new FrameBuilder(getSubImage(12, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile161 = new MapTileBuilder(frame161)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile161);

                Frame frame162 = new FrameBuilder(getSubImage(13, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile162 = new MapTileBuilder(frame162)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile162);

                Frame frame163 = new FrameBuilder(getSubImage(14, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile163 = new MapTileBuilder(frame163)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile163);

                Frame frame164 = new FrameBuilder(getSubImage(15, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile164 = new MapTileBuilder(frame164)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile164);

                Frame frame165 = new FrameBuilder(getSubImage(16, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile165 = new MapTileBuilder(frame165)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile165);

                Frame frame166 = new FrameBuilder(getSubImage(17, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile166 = new MapTileBuilder(frame166)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile166);

                Frame frame167 = new FrameBuilder(getSubImage(18, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile167 = new MapTileBuilder(frame167)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile167);

                Frame frame168 = new FrameBuilder(getSubImage(19, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile168 = new MapTileBuilder(frame168)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile168);

                Frame frame169 = new FrameBuilder(getSubImage(20, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile169 = new MapTileBuilder(frame169)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile169);

                Frame frame170 = new FrameBuilder(getSubImage(21, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile170 = new MapTileBuilder(frame170)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile170);

                Frame frame171 = new FrameBuilder(getSubImage(22, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile171 = new MapTileBuilder(frame171)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile171);

                Frame frame172 = new FrameBuilder(getSubImage(23, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile172 = new MapTileBuilder(frame172)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile172);

                Frame frame173 = new FrameBuilder(getSubImage(24, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile173 = new MapTileBuilder(frame173)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile173);

                Frame frame174 = new FrameBuilder(getSubImage(25, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile174 = new MapTileBuilder(frame174)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile174);

                Frame frame175 = new FrameBuilder(getSubImage(26, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile175 = new MapTileBuilder(frame175)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile175);

                Frame frame176 = new FrameBuilder(getSubImage(27, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile176 = new MapTileBuilder(frame176)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile176);

                Frame frame177 = new FrameBuilder(getSubImage(28, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile177 = new MapTileBuilder(frame177)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile177);

                Frame frame178 = new FrameBuilder(getSubImage(29, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile178 = new MapTileBuilder(frame178)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile178);

                Frame frame179 = new FrameBuilder(getSubImage(30, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile179 = new MapTileBuilder(frame179)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile179);

                Frame frame180 = new FrameBuilder(getSubImage(31, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile180 = new MapTileBuilder(frame180)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile180);

                Frame frame181 = new FrameBuilder(getSubImage(32, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile181 = new MapTileBuilder(frame181)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile181);

                Frame frame182 = new FrameBuilder(getSubImage(33, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile182 = new MapTileBuilder(frame182)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile182);

                Frame frame183 = new FrameBuilder(getSubImage(34, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile183 = new MapTileBuilder(frame183)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile183);

                Frame frame184 = new FrameBuilder(getSubImage(35, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile184 = new MapTileBuilder(frame184)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile184);

                Frame frame185 = new FrameBuilder(getSubImage(36, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile185 = new MapTileBuilder(frame185)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile185);

                Frame frame186 = new FrameBuilder(getSubImage(0, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile186 = new MapTileBuilder(frame186)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile186);

                Frame frame187 = new FrameBuilder(getSubImage(1, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile187 = new MapTileBuilder(frame187)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile187);

                Frame frame188 = new FrameBuilder(getSubImage(2, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile188 = new MapTileBuilder(frame188)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile188);

                Frame frame189 = new FrameBuilder(getSubImage(3, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile189 = new MapTileBuilder(frame189)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile189);

                Frame frame190 = new FrameBuilder(getSubImage(4, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile190 = new MapTileBuilder(frame190)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile190);

                Frame frame191 = new FrameBuilder(getSubImage(5, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile191 = new MapTileBuilder(frame191)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile191);

                Frame frame192 = new FrameBuilder(getSubImage(6, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile192 = new MapTileBuilder(frame192)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile192);

                Frame frame193 = new FrameBuilder(getSubImage(7, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile193 = new MapTileBuilder(frame193)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile193);

                Frame frame194 = new FrameBuilder(getSubImage(8, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile194 = new MapTileBuilder(frame194)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile194);

                Frame frame195 = new FrameBuilder(getSubImage(9, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile195 = new MapTileBuilder(frame195)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile195);

                Frame frame196 = new FrameBuilder(getSubImage(10, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile196 = new MapTileBuilder(frame196)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile196);

                Frame frame197 = new FrameBuilder(getSubImage(11, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile197 = new MapTileBuilder(frame197)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile197);

                Frame frame198 = new FrameBuilder(getSubImage(12, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile198 = new MapTileBuilder(frame198)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile198);

                Frame frame199 = new FrameBuilder(getSubImage(13, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile199 = new MapTileBuilder(frame199)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile199);

                Frame frame200 = new FrameBuilder(getSubImage(14, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile200 = new MapTileBuilder(frame200)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile200);

                Frame frame201 = new FrameBuilder(getSubImage(15, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile201 = new MapTileBuilder(frame201)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile201);

                Frame frame202 = new FrameBuilder(getSubImage(16, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile202 = new MapTileBuilder(frame202)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile202);

                Frame frame203 = new FrameBuilder(getSubImage(17, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile203 = new MapTileBuilder(frame203)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile203);

                Frame frame204 = new FrameBuilder(getSubImage(18, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile204 = new MapTileBuilder(frame204)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile204);

                Frame frame205 = new FrameBuilder(getSubImage(19, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile205 = new MapTileBuilder(frame205)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile205);

                Frame frame206 = new FrameBuilder(getSubImage(20, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile206 = new MapTileBuilder(frame206)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile206);

                Frame frame207 = new FrameBuilder(getSubImage(21, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile207 = new MapTileBuilder(frame207)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile207);

                Frame frame208 = new FrameBuilder(getSubImage(22, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile208 = new MapTileBuilder(frame208)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile208);

                Frame frame209 = new FrameBuilder(getSubImage(23, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile209 = new MapTileBuilder(frame209)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile209);

                Frame frame210 = new FrameBuilder(getSubImage(24, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile210 = new MapTileBuilder(frame210)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile210);

                Frame frame211 = new FrameBuilder(getSubImage(25, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile211 = new MapTileBuilder(frame211)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile211);

                Frame frame212 = new FrameBuilder(getSubImage(26, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile212 = new MapTileBuilder(frame212)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile212);

                Frame frame213 = new FrameBuilder(getSubImage(27, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile213 = new MapTileBuilder(frame213)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile213);

                Frame frame214 = new FrameBuilder(getSubImage(28, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile214 = new MapTileBuilder(frame214)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile214);

                Frame frame215 = new FrameBuilder(getSubImage(29, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile215 = new MapTileBuilder(frame215)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile215);

                Frame frame216 = new FrameBuilder(getSubImage(30, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile216 = new MapTileBuilder(frame216)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile216);

                Frame frame217 = new FrameBuilder(getSubImage(31, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile217 = new MapTileBuilder(frame217)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile217);

                Frame frame218 = new FrameBuilder(getSubImage(32, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile218 = new MapTileBuilder(frame218)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile218);

                Frame frame219 = new FrameBuilder(getSubImage(33, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile219 = new MapTileBuilder(frame219)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile219);

                Frame frame220 = new FrameBuilder(getSubImage(34, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile220 = new MapTileBuilder(frame220)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile220);

                Frame frame221 = new FrameBuilder(getSubImage(35, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile221 = new MapTileBuilder(frame221)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile221);

                Frame frame222 = new FrameBuilder(getSubImage(36, 6))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile222 = new MapTileBuilder(frame222)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile222);

                Frame frame223 = new FrameBuilder(getSubImage(0, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile223 = new MapTileBuilder(frame223)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile223);

                Frame frame224 = new FrameBuilder(getSubImage(1, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile224 = new MapTileBuilder(frame224)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile224);

                Frame frame225 = new FrameBuilder(getSubImage(2, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile225 = new MapTileBuilder(frame225)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile225);

                Frame frame226 = new FrameBuilder(getSubImage(3, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile226 = new MapTileBuilder(frame226)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile226);

                Frame frame227 = new FrameBuilder(getSubImage(4, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile227 = new MapTileBuilder(frame227)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile227);

                Frame frame228 = new FrameBuilder(getSubImage(5, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile228 = new MapTileBuilder(frame228)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile228);

                Frame frame229 = new FrameBuilder(getSubImage(6, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile229 = new MapTileBuilder(frame229)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile229);

                Frame frame230 = new FrameBuilder(getSubImage(7, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile230 = new MapTileBuilder(frame230)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile230);

                Frame frame231 = new FrameBuilder(getSubImage(8, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile231 = new MapTileBuilder(frame231)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile231);

                Frame frame232 = new FrameBuilder(getSubImage(9, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile232 = new MapTileBuilder(frame232)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile232);

                Frame frame233 = new FrameBuilder(getSubImage(10, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile233 = new MapTileBuilder(frame233)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile233);

                Frame frame234 = new FrameBuilder(getSubImage(11, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile234 = new MapTileBuilder(frame234)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile234);

                Frame frame235 = new FrameBuilder(getSubImage(12, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile235 = new MapTileBuilder(frame235)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile235);

                Frame frame236 = new FrameBuilder(getSubImage(13, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile236 = new MapTileBuilder(frame236)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile236);

                Frame frame237 = new FrameBuilder(getSubImage(14, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile237 = new MapTileBuilder(frame237)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile237);

                Frame frame238 = new FrameBuilder(getSubImage(15, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile238 = new MapTileBuilder(frame238)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile238);

                Frame frame239 = new FrameBuilder(getSubImage(16, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile239 = new MapTileBuilder(frame239)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile239);

                Frame frame240 = new FrameBuilder(getSubImage(17, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile240 = new MapTileBuilder(frame240)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile240);

                Frame frame241 = new FrameBuilder(getSubImage(18, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile241 = new MapTileBuilder(frame241)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile241);

                Frame frame242 = new FrameBuilder(getSubImage(19, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile242 = new MapTileBuilder(frame242)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile242);

                Frame frame243 = new FrameBuilder(getSubImage(20, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile243 = new MapTileBuilder(frame243)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile243);

                Frame frame244 = new FrameBuilder(getSubImage(21, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile244 = new MapTileBuilder(frame244)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile244);

                Frame frame245 = new FrameBuilder(getSubImage(22, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile245 = new MapTileBuilder(frame245)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile245);

                Frame frame246 = new FrameBuilder(getSubImage(23, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile246 = new MapTileBuilder(frame246)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile246);

                Frame frame247 = new FrameBuilder(getSubImage(24, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile247 = new MapTileBuilder(frame247)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile247);

                Frame frame248 = new FrameBuilder(getSubImage(25, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile248 = new MapTileBuilder(frame248)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile248);

                Frame frame249 = new FrameBuilder(getSubImage(26, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile249 = new MapTileBuilder(frame249)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile249);

                Frame frame250 = new FrameBuilder(getSubImage(27, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile250 = new MapTileBuilder(frame250)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile250);

                Frame frame251 = new FrameBuilder(getSubImage(28, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile251 = new MapTileBuilder(frame251)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile251);

                Frame frame252 = new FrameBuilder(getSubImage(29, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile252 = new MapTileBuilder(frame252)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile252);

                Frame frame253 = new FrameBuilder(getSubImage(30, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile253 = new MapTileBuilder(frame253)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile253);

                Frame frame254 = new FrameBuilder(getSubImage(31, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile254 = new MapTileBuilder(frame254)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile254);

                Frame frame255 = new FrameBuilder(getSubImage(32, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile255 = new MapTileBuilder(frame255)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile255);

                Frame frame256 = new FrameBuilder(getSubImage(33, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile256 = new MapTileBuilder(frame256)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile256);

                Frame frame257 = new FrameBuilder(getSubImage(34, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile257 = new MapTileBuilder(frame257)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile257);

                Frame frame258 = new FrameBuilder(getSubImage(35, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile258 = new MapTileBuilder(frame258)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile258);

                Frame frame259 = new FrameBuilder(getSubImage(36, 7))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile259 = new MapTileBuilder(frame259)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile259);

                Frame frame260 = new FrameBuilder(getSubImage(0, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile260 = new MapTileBuilder(frame260)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile260);

                Frame frame261 = new FrameBuilder(getSubImage(1, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile261 = new MapTileBuilder(frame261)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile261);

                Frame frame262 = new FrameBuilder(getSubImage(2, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile262 = new MapTileBuilder(frame262)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile262);

                Frame frame263 = new FrameBuilder(getSubImage(3, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile263 = new MapTileBuilder(frame263)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile263);

                Frame frame264 = new FrameBuilder(getSubImage(4, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile264 = new MapTileBuilder(frame264)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile264);

                Frame frame265 = new FrameBuilder(getSubImage(5, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile265 = new MapTileBuilder(frame265)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile265);

                Frame frame266 = new FrameBuilder(getSubImage(6, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile266 = new MapTileBuilder(frame266)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile266);

                Frame frame267 = new FrameBuilder(getSubImage(7, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile267 = new MapTileBuilder(frame267)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile267);

                Frame frame268 = new FrameBuilder(getSubImage(8, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile268 = new MapTileBuilder(frame268)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile268);

                Frame frame269 = new FrameBuilder(getSubImage(9, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile269 = new MapTileBuilder(frame269)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile269);

                Frame frame270 = new FrameBuilder(getSubImage(10, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile270 = new MapTileBuilder(frame270)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile270);

                Frame frame271 = new FrameBuilder(getSubImage(11, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile271 = new MapTileBuilder(frame271)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile271);

                Frame frame272 = new FrameBuilder(getSubImage(12, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile272 = new MapTileBuilder(frame272)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile272);

                Frame frame273 = new FrameBuilder(getSubImage(13, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile273 = new MapTileBuilder(frame273)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile273);

                Frame frame274 = new FrameBuilder(getSubImage(14, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile274 = new MapTileBuilder(frame274)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile274);

                Frame frame275 = new FrameBuilder(getSubImage(15, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile275 = new MapTileBuilder(frame275)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile275);

                Frame frame276 = new FrameBuilder(getSubImage(16, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile276 = new MapTileBuilder(frame276)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile276);

                Frame frame277 = new FrameBuilder(getSubImage(17, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile277 = new MapTileBuilder(frame277)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile277);

                Frame frame278 = new FrameBuilder(getSubImage(18, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile278 = new MapTileBuilder(frame278)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile278);

                Frame frame279 = new FrameBuilder(getSubImage(19, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile279 = new MapTileBuilder(frame279)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile279);

                Frame frame280 = new FrameBuilder(getSubImage(20, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile280 = new MapTileBuilder(frame280)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile280);

                Frame frame281 = new FrameBuilder(getSubImage(21, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile281 = new MapTileBuilder(frame281)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile281);

                Frame frame282 = new FrameBuilder(getSubImage(22, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile282 = new MapTileBuilder(frame282)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile282);

                Frame frame283 = new FrameBuilder(getSubImage(23, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile283 = new MapTileBuilder(frame283)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile283);

                Frame frame284 = new FrameBuilder(getSubImage(24, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile284 = new MapTileBuilder(frame284)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile284);

                Frame frame285 = new FrameBuilder(getSubImage(25, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile285 = new MapTileBuilder(frame285)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile285);

                Frame frame286 = new FrameBuilder(getSubImage(26, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile286 = new MapTileBuilder(frame286)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile286);

                Frame frame287 = new FrameBuilder(getSubImage(27, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile287 = new MapTileBuilder(frame287)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile287);

                Frame frame288 = new FrameBuilder(getSubImage(28, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile288 = new MapTileBuilder(frame288)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile288);

                Frame frame289 = new FrameBuilder(getSubImage(29, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile289 = new MapTileBuilder(frame289)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile289);

                Frame frame290 = new FrameBuilder(getSubImage(30, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile290 = new MapTileBuilder(frame290)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile290);

                Frame frame291 = new FrameBuilder(getSubImage(31, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile291 = new MapTileBuilder(frame291)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile291);

                Frame frame292 = new FrameBuilder(getSubImage(32, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile292 = new MapTileBuilder(frame292)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile292);

                Frame frame293 = new FrameBuilder(getSubImage(33, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile293 = new MapTileBuilder(frame293)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile293);

                Frame frame294 = new FrameBuilder(getSubImage(34, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile294 = new MapTileBuilder(frame294)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile294);

                Frame frame295 = new FrameBuilder(getSubImage(35, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile295 = new MapTileBuilder(frame295)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile295);

                Frame frame296 = new FrameBuilder(getSubImage(36, 8))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile296 = new MapTileBuilder(frame296)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile296);

                Frame frame297 = new FrameBuilder(getSubImage(0, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile297 = new MapTileBuilder(frame297)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile297);

                Frame frame298 = new FrameBuilder(getSubImage(1, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile298 = new MapTileBuilder(frame298)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile298);

                Frame frame299 = new FrameBuilder(getSubImage(2, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile299 = new MapTileBuilder(frame299)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile299);

                Frame frame300 = new FrameBuilder(getSubImage(3, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile300 = new MapTileBuilder(frame300)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile300);

                Frame frame301 = new FrameBuilder(getSubImage(4, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile301 = new MapTileBuilder(frame301)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile301);

                Frame frame302 = new FrameBuilder(getSubImage(5, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile302 = new MapTileBuilder(frame302)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile302);

                Frame frame303 = new FrameBuilder(getSubImage(6, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile303 = new MapTileBuilder(frame303)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile303);

                Frame frame304 = new FrameBuilder(getSubImage(7, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile304 = new MapTileBuilder(frame304)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile304);

                Frame frame305 = new FrameBuilder(getSubImage(8, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile305 = new MapTileBuilder(frame305)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile305);

                Frame frame306 = new FrameBuilder(getSubImage(9, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile306 = new MapTileBuilder(frame306)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile306);

                Frame frame307 = new FrameBuilder(getSubImage(10, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile307 = new MapTileBuilder(frame307)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile307);

                Frame frame308 = new FrameBuilder(getSubImage(11, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile308 = new MapTileBuilder(frame308)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile308);

                Frame frame309 = new FrameBuilder(getSubImage(12, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile309 = new MapTileBuilder(frame309)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile309);

                Frame frame310 = new FrameBuilder(getSubImage(13, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile310 = new MapTileBuilder(frame310)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile310);

                Frame frame311 = new FrameBuilder(getSubImage(14, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile311 = new MapTileBuilder(frame311)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile311);

                Frame frame312 = new FrameBuilder(getSubImage(15, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile312 = new MapTileBuilder(frame312)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile312);

                Frame frame313 = new FrameBuilder(getSubImage(16, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile313 = new MapTileBuilder(frame313)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile313);

                Frame frame314 = new FrameBuilder(getSubImage(17, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile314 = new MapTileBuilder(frame314)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile314);

                Frame frame315 = new FrameBuilder(getSubImage(18, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile315 = new MapTileBuilder(frame315)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile315);

                Frame frame316 = new FrameBuilder(getSubImage(19, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile316 = new MapTileBuilder(frame316)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile316);

                Frame frame317 = new FrameBuilder(getSubImage(20, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile317 = new MapTileBuilder(frame317)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile317);

                Frame frame318 = new FrameBuilder(getSubImage(21, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile318 = new MapTileBuilder(frame318)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile318);

                Frame frame319 = new FrameBuilder(getSubImage(22, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile319 = new MapTileBuilder(frame319)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile319);

                Frame frame320 = new FrameBuilder(getSubImage(23, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile320 = new MapTileBuilder(frame320)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile320);

                Frame frame321 = new FrameBuilder(getSubImage(24, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile321 = new MapTileBuilder(frame321)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile321);

                Frame frame322 = new FrameBuilder(getSubImage(25, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile322 = new MapTileBuilder(frame322)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile322);

                Frame frame323 = new FrameBuilder(getSubImage(26, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile323 = new MapTileBuilder(frame323)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile323);

                Frame frame324 = new FrameBuilder(getSubImage(27, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile324 = new MapTileBuilder(frame324)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile324);

                Frame frame325 = new FrameBuilder(getSubImage(28, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile325 = new MapTileBuilder(frame325)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile325);

                Frame frame326 = new FrameBuilder(getSubImage(29, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile326 = new MapTileBuilder(frame326)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile326);

                Frame frame327 = new FrameBuilder(getSubImage(30, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile327 = new MapTileBuilder(frame327)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile327);

                Frame frame328 = new FrameBuilder(getSubImage(31, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile328 = new MapTileBuilder(frame328)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile328);

                Frame frame329 = new FrameBuilder(getSubImage(32, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile329 = new MapTileBuilder(frame329)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile329);

                Frame frame330 = new FrameBuilder(getSubImage(33, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile330 = new MapTileBuilder(frame330)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile330);

                Frame frame331 = new FrameBuilder(getSubImage(34, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile331 = new MapTileBuilder(frame331)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile331);

                Frame frame332 = new FrameBuilder(getSubImage(35, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile332 = new MapTileBuilder(frame332)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile332);

                Frame frame333 = new FrameBuilder(getSubImage(36, 9))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile333 = new MapTileBuilder(frame333)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile333);

                Frame frame334 = new FrameBuilder(getSubImage(0, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile334 = new MapTileBuilder(frame334)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile334);

                Frame frame335 = new FrameBuilder(getSubImage(1, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile335 = new MapTileBuilder(frame335)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile335);

                Frame frame336 = new FrameBuilder(getSubImage(2, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile336 = new MapTileBuilder(frame336)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile336);

                Frame frame337 = new FrameBuilder(getSubImage(3, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile337 = new MapTileBuilder(frame337)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile337);

                Frame frame338 = new FrameBuilder(getSubImage(4, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile338 = new MapTileBuilder(frame338)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile338);

                Frame frame339 = new FrameBuilder(getSubImage(5, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile339 = new MapTileBuilder(frame339)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile339);

                Frame frame340 = new FrameBuilder(getSubImage(6, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile340 = new MapTileBuilder(frame340)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile340);

                Frame frame341 = new FrameBuilder(getSubImage(7, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile341 = new MapTileBuilder(frame341)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile341);

                Frame frame342 = new FrameBuilder(getSubImage(8, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile342 = new MapTileBuilder(frame342)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile342);

                Frame frame343 = new FrameBuilder(getSubImage(9, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile343 = new MapTileBuilder(frame343)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile343);

                Frame frame344 = new FrameBuilder(getSubImage(10, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile344 = new MapTileBuilder(frame344)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile344);

                Frame frame345 = new FrameBuilder(getSubImage(11, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile345 = new MapTileBuilder(frame345)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile345);

                Frame frame346 = new FrameBuilder(getSubImage(12, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile346 = new MapTileBuilder(frame346)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile346);

                Frame frame347 = new FrameBuilder(getSubImage(13, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile347 = new MapTileBuilder(frame347)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile347);

                Frame frame348 = new FrameBuilder(getSubImage(14, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile348 = new MapTileBuilder(frame348)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile348);

                Frame frame349 = new FrameBuilder(getSubImage(15, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile349 = new MapTileBuilder(frame349)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile349);

                Frame frame350 = new FrameBuilder(getSubImage(16, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile350 = new MapTileBuilder(frame350)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile350);

                Frame frame351 = new FrameBuilder(getSubImage(17, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile351 = new MapTileBuilder(frame351)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile351);

                Frame frame352 = new FrameBuilder(getSubImage(18, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile352 = new MapTileBuilder(frame352)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile352);

                Frame frame353 = new FrameBuilder(getSubImage(19, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile353 = new MapTileBuilder(frame353)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile353);

                Frame frame354 = new FrameBuilder(getSubImage(20, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile354 = new MapTileBuilder(frame354)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile354);

                Frame frame355 = new FrameBuilder(getSubImage(21, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile355 = new MapTileBuilder(frame355)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile355);

                Frame frame356 = new FrameBuilder(getSubImage(22, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile356 = new MapTileBuilder(frame356)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile356);

                Frame frame357 = new FrameBuilder(getSubImage(23, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile357 = new MapTileBuilder(frame357)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile357);

                Frame frame358 = new FrameBuilder(getSubImage(24, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile358 = new MapTileBuilder(frame358)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile358);

                Frame frame359 = new FrameBuilder(getSubImage(25, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile359 = new MapTileBuilder(frame359)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile359);

                Frame frame360 = new FrameBuilder(getSubImage(26, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile360 = new MapTileBuilder(frame360)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile360);

                Frame frame361 = new FrameBuilder(getSubImage(27, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile361 = new MapTileBuilder(frame361)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile361);

                Frame frame362 = new FrameBuilder(getSubImage(28, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile362 = new MapTileBuilder(frame362)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile362);

                Frame frame363 = new FrameBuilder(getSubImage(29, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile363 = new MapTileBuilder(frame363)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile363);

                Frame frame364 = new FrameBuilder(getSubImage(30, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile364 = new MapTileBuilder(frame364)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile364);

                Frame frame365 = new FrameBuilder(getSubImage(31, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile365 = new MapTileBuilder(frame365)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile365);

                Frame frame366 = new FrameBuilder(getSubImage(32, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile366 = new MapTileBuilder(frame366)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile366);

                Frame frame367 = new FrameBuilder(getSubImage(33, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile367 = new MapTileBuilder(frame367)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile367);

                Frame frame368 = new FrameBuilder(getSubImage(34, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile368 = new MapTileBuilder(frame368)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile368);

                Frame frame369 = new FrameBuilder(getSubImage(35, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile369 = new MapTileBuilder(frame369)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile369);

                Frame frame370 = new FrameBuilder(getSubImage(36, 10))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile370 = new MapTileBuilder(frame370)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile370);

                Frame frame371 = new FrameBuilder(getSubImage(0, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile371 = new MapTileBuilder(frame371)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile371);

                Frame frame372 = new FrameBuilder(getSubImage(1, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile372 = new MapTileBuilder(frame372)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile372);

                Frame frame373 = new FrameBuilder(getSubImage(2, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile373 = new MapTileBuilder(frame373)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile373);

                Frame frame374 = new FrameBuilder(getSubImage(3, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile374 = new MapTileBuilder(frame374)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile374);

                Frame frame375 = new FrameBuilder(getSubImage(4, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile375 = new MapTileBuilder(frame375)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile375);

                Frame frame376 = new FrameBuilder(getSubImage(5, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile376 = new MapTileBuilder(frame376)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile376);

                Frame frame377 = new FrameBuilder(getSubImage(6, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile377 = new MapTileBuilder(frame377)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile377);

                Frame frame378 = new FrameBuilder(getSubImage(7, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile378 = new MapTileBuilder(frame378)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile378);

                Frame frame379 = new FrameBuilder(getSubImage(8, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile379 = new MapTileBuilder(frame379)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile379);

                Frame frame380 = new FrameBuilder(getSubImage(9, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile380 = new MapTileBuilder(frame380)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile380);

                Frame frame381 = new FrameBuilder(getSubImage(10, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile381 = new MapTileBuilder(frame381)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile381);

                Frame frame382 = new FrameBuilder(getSubImage(11, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile382 = new MapTileBuilder(frame382)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile382);

                Frame frame383 = new FrameBuilder(getSubImage(12, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile383 = new MapTileBuilder(frame383)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile383);

                Frame frame384 = new FrameBuilder(getSubImage(13, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile384 = new MapTileBuilder(frame384)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile384);

                Frame frame385 = new FrameBuilder(getSubImage(14, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile385 = new MapTileBuilder(frame385)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile385);

                Frame frame386 = new FrameBuilder(getSubImage(15, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile386 = new MapTileBuilder(frame386)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile386);

                Frame frame387 = new FrameBuilder(getSubImage(16, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile387 = new MapTileBuilder(frame387)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile387);

                Frame frame388 = new FrameBuilder(getSubImage(17, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile388 = new MapTileBuilder(frame388)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile388);

                Frame frame389 = new FrameBuilder(getSubImage(18, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile389 = new MapTileBuilder(frame389)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile389);

                Frame frame390 = new FrameBuilder(getSubImage(19, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile390 = new MapTileBuilder(frame390)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile390);

                Frame frame391 = new FrameBuilder(getSubImage(20, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile391 = new MapTileBuilder(frame391)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile391);

                Frame frame392 = new FrameBuilder(getSubImage(21, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile392 = new MapTileBuilder(frame392)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile392);

                Frame frame393 = new FrameBuilder(getSubImage(22, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile393 = new MapTileBuilder(frame393)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile393);

                Frame frame394 = new FrameBuilder(getSubImage(23, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile394 = new MapTileBuilder(frame394)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile394);

                Frame frame395 = new FrameBuilder(getSubImage(24, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile395 = new MapTileBuilder(frame395)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile395);

                Frame frame396 = new FrameBuilder(getSubImage(25, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile396 = new MapTileBuilder(frame396)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile396);

                Frame frame397 = new FrameBuilder(getSubImage(26, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile397 = new MapTileBuilder(frame397)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile397);

                Frame frame398 = new FrameBuilder(getSubImage(27, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile398 = new MapTileBuilder(frame398)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile398);

                Frame frame399 = new FrameBuilder(getSubImage(28, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile399 = new MapTileBuilder(frame399)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile399);

                Frame frame400 = new FrameBuilder(getSubImage(29, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile400 = new MapTileBuilder(frame400)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile400);

                Frame frame401 = new FrameBuilder(getSubImage(30, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile401 = new MapTileBuilder(frame401)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile401);

                Frame frame402 = new FrameBuilder(getSubImage(31, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile402 = new MapTileBuilder(frame402)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile402);

                Frame frame403 = new FrameBuilder(getSubImage(32, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile403 = new MapTileBuilder(frame403)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile403);

                Frame frame404 = new FrameBuilder(getSubImage(33, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile404 = new MapTileBuilder(frame404)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile404);

                Frame frame405 = new FrameBuilder(getSubImage(34, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile405 = new MapTileBuilder(frame405)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile405);

                Frame frame406 = new FrameBuilder(getSubImage(35, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile406 = new MapTileBuilder(frame406)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile406);

                Frame frame407 = new FrameBuilder(getSubImage(36, 11))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile407 = new MapTileBuilder(frame407)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile407);

                Frame frame408 = new FrameBuilder(getSubImage(0, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile408 = new MapTileBuilder(frame408)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile408);

                Frame frame409 = new FrameBuilder(getSubImage(1, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile409 = new MapTileBuilder(frame409)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile409);

                Frame frame410 = new FrameBuilder(getSubImage(2, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile410 = new MapTileBuilder(frame410)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile410);

                Frame frame411 = new FrameBuilder(getSubImage(3, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile411 = new MapTileBuilder(frame411)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile411);

                Frame frame412 = new FrameBuilder(getSubImage(4, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile412 = new MapTileBuilder(frame412)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile412);

                Frame frame413 = new FrameBuilder(getSubImage(5, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile413 = new MapTileBuilder(frame413)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile413);

                Frame frame414 = new FrameBuilder(getSubImage(6, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile414 = new MapTileBuilder(frame414)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile414);

                Frame frame415 = new FrameBuilder(getSubImage(7, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile415 = new MapTileBuilder(frame415)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile415);

                Frame frame416 = new FrameBuilder(getSubImage(8, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile416 = new MapTileBuilder(frame416)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile416);

                Frame frame417 = new FrameBuilder(getSubImage(9, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile417 = new MapTileBuilder(frame417)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile417);

                Frame frame418 = new FrameBuilder(getSubImage(10, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile418 = new MapTileBuilder(frame418)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile418);

                Frame frame419 = new FrameBuilder(getSubImage(11, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile419 = new MapTileBuilder(frame419)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile419);

                Frame frame420 = new FrameBuilder(getSubImage(12, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile420 = new MapTileBuilder(frame420)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile420);

                Frame frame421 = new FrameBuilder(getSubImage(13, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile421 = new MapTileBuilder(frame421)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile421);

                Frame frame422 = new FrameBuilder(getSubImage(14, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile422 = new MapTileBuilder(frame422)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile422);

                Frame frame423 = new FrameBuilder(getSubImage(15, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile423 = new MapTileBuilder(frame423)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile423);

                Frame frame424 = new FrameBuilder(getSubImage(16, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile424 = new MapTileBuilder(frame424)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile424);

                Frame frame425 = new FrameBuilder(getSubImage(17, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile425 = new MapTileBuilder(frame425)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile425);

                Frame frame426 = new FrameBuilder(getSubImage(18, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile426 = new MapTileBuilder(frame426)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile426);

                Frame frame427 = new FrameBuilder(getSubImage(19, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile427 = new MapTileBuilder(frame427)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile427);

                Frame frame428 = new FrameBuilder(getSubImage(20, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile428 = new MapTileBuilder(frame428)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile428);

                Frame frame429 = new FrameBuilder(getSubImage(21, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile429 = new MapTileBuilder(frame429)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile429);

                Frame frame430 = new FrameBuilder(getSubImage(22, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile430 = new MapTileBuilder(frame430)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile430);

                Frame frame431 = new FrameBuilder(getSubImage(23, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile431 = new MapTileBuilder(frame431)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile431);

                Frame frame432 = new FrameBuilder(getSubImage(24, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile432 = new MapTileBuilder(frame432)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile432);

                Frame frame433 = new FrameBuilder(getSubImage(25, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile433 = new MapTileBuilder(frame433)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile433);

                Frame frame434 = new FrameBuilder(getSubImage(26, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile434 = new MapTileBuilder(frame434)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile434);

                Frame frame435 = new FrameBuilder(getSubImage(27, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile435 = new MapTileBuilder(frame435)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile435);

                Frame frame436 = new FrameBuilder(getSubImage(28, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile436 = new MapTileBuilder(frame436)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile436);

                Frame frame437 = new FrameBuilder(getSubImage(29, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile437 = new MapTileBuilder(frame437)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile437);

                Frame frame438 = new FrameBuilder(getSubImage(30, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile438 = new MapTileBuilder(frame438)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile438);

                Frame frame439 = new FrameBuilder(getSubImage(31, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile439 = new MapTileBuilder(frame439)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile439);

                Frame frame440 = new FrameBuilder(getSubImage(32, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile440 = new MapTileBuilder(frame440)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile440);

                Frame frame441 = new FrameBuilder(getSubImage(33, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile441 = new MapTileBuilder(frame441)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile441);

                Frame frame442 = new FrameBuilder(getSubImage(34, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile442 = new MapTileBuilder(frame442)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile442);

                Frame frame443 = new FrameBuilder(getSubImage(35, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile443 = new MapTileBuilder(frame443)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile443);

                Frame frame444 = new FrameBuilder(getSubImage(36, 12))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile444 = new MapTileBuilder(frame444)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile444);

                Frame frame445 = new FrameBuilder(getSubImage(0, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile445 = new MapTileBuilder(frame445)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile445);

                Frame frame446 = new FrameBuilder(getSubImage(1, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile446 = new MapTileBuilder(frame446)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile446);

                Frame frame447 = new FrameBuilder(getSubImage(2, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile447 = new MapTileBuilder(frame447)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile447);

                Frame frame448 = new FrameBuilder(getSubImage(3, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile448 = new MapTileBuilder(frame448)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile448);

                Frame frame449 = new FrameBuilder(getSubImage(4, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile449 = new MapTileBuilder(frame449)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile449);

                Frame frame450 = new FrameBuilder(getSubImage(5, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile450 = new MapTileBuilder(frame450)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile450);

                Frame frame451 = new FrameBuilder(getSubImage(6, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile451 = new MapTileBuilder(frame451)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile451);

                Frame frame452 = new FrameBuilder(getSubImage(7, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile452 = new MapTileBuilder(frame452)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile452);

                Frame frame453 = new FrameBuilder(getSubImage(8, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile453 = new MapTileBuilder(frame453)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile453);

                Frame frame454 = new FrameBuilder(getSubImage(9, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile454 = new MapTileBuilder(frame454)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile454);

                Frame frame455 = new FrameBuilder(getSubImage(10, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile455 = new MapTileBuilder(frame455)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile455);

                Frame frame456 = new FrameBuilder(getSubImage(11, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile456 = new MapTileBuilder(frame456)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile456);

                Frame frame457 = new FrameBuilder(getSubImage(12, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile457 = new MapTileBuilder(frame457)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile457);

                Frame frame458 = new FrameBuilder(getSubImage(13, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile458 = new MapTileBuilder(frame458)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile458);

                Frame frame459 = new FrameBuilder(getSubImage(14, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile459 = new MapTileBuilder(frame459)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile459);

                Frame frame460 = new FrameBuilder(getSubImage(15, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile460 = new MapTileBuilder(frame460)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile460);

                Frame frame461 = new FrameBuilder(getSubImage(16, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile461 = new MapTileBuilder(frame461)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile461);

                Frame frame462 = new FrameBuilder(getSubImage(17, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile462 = new MapTileBuilder(frame462)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile462);

                Frame frame463 = new FrameBuilder(getSubImage(18, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile463 = new MapTileBuilder(frame463)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile463);

                Frame frame464 = new FrameBuilder(getSubImage(19, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile464 = new MapTileBuilder(frame464)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile464);

                Frame frame465 = new FrameBuilder(getSubImage(20, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile465 = new MapTileBuilder(frame465)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile465);

                Frame frame466 = new FrameBuilder(getSubImage(21, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile466 = new MapTileBuilder(frame466)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile466);

                Frame frame467 = new FrameBuilder(getSubImage(22, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile467 = new MapTileBuilder(frame467)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile467);

                Frame frame468 = new FrameBuilder(getSubImage(23, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile468 = new MapTileBuilder(frame468)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile468);

                Frame frame469 = new FrameBuilder(getSubImage(24, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile469 = new MapTileBuilder(frame469)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile469);

                Frame frame470 = new FrameBuilder(getSubImage(25, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile470 = new MapTileBuilder(frame470)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile470);

                Frame frame471 = new FrameBuilder(getSubImage(26, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile471 = new MapTileBuilder(frame471)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile471);

                Frame frame472 = new FrameBuilder(getSubImage(27, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile472 = new MapTileBuilder(frame472)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile472);

                Frame frame473 = new FrameBuilder(getSubImage(28, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile473 = new MapTileBuilder(frame473)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile473);

                Frame frame474 = new FrameBuilder(getSubImage(29, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile474 = new MapTileBuilder(frame474)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile474);

                Frame frame475 = new FrameBuilder(getSubImage(30, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile475 = new MapTileBuilder(frame475)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile475);

                Frame frame476 = new FrameBuilder(getSubImage(31, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile476 = new MapTileBuilder(frame476)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile476);

                Frame frame477 = new FrameBuilder(getSubImage(32, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile477 = new MapTileBuilder(frame477)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile477);

                Frame frame478 = new FrameBuilder(getSubImage(33, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile478 = new MapTileBuilder(frame478)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile478);

                Frame frame479 = new FrameBuilder(getSubImage(34, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile479 = new MapTileBuilder(frame479)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile479);

                Frame frame480 = new FrameBuilder(getSubImage(35, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile480 = new MapTileBuilder(frame480)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile480);

                Frame frame481 = new FrameBuilder(getSubImage(36, 13))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile481 = new MapTileBuilder(frame481)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile481);

                Frame frame482 = new FrameBuilder(getSubImage(0, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile482 = new MapTileBuilder(frame482)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile482);

                Frame frame483 = new FrameBuilder(getSubImage(1, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile483 = new MapTileBuilder(frame483)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile483);

                Frame frame484 = new FrameBuilder(getSubImage(2, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile484 = new MapTileBuilder(frame484)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile484);

                Frame frame485 = new FrameBuilder(getSubImage(3, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile485 = new MapTileBuilder(frame485)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile485);

                Frame frame486 = new FrameBuilder(getSubImage(4, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile486 = new MapTileBuilder(frame486)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile486);

                Frame frame487 = new FrameBuilder(getSubImage(5, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile487 = new MapTileBuilder(frame487)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile487);

                Frame frame488 = new FrameBuilder(getSubImage(6, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile488 = new MapTileBuilder(frame488)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile488);

                Frame frame489 = new FrameBuilder(getSubImage(7, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile489 = new MapTileBuilder(frame489)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile489);

                Frame frame490 = new FrameBuilder(getSubImage(8, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile490 = new MapTileBuilder(frame490)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile490);

                Frame frame491 = new FrameBuilder(getSubImage(9, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile491 = new MapTileBuilder(frame491)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile491);

                Frame frame492 = new FrameBuilder(getSubImage(10, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile492 = new MapTileBuilder(frame492)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile492);

                Frame frame493 = new FrameBuilder(getSubImage(11, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile493 = new MapTileBuilder(frame493)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile493);

                Frame frame494 = new FrameBuilder(getSubImage(12, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile494 = new MapTileBuilder(frame494)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile494);

                Frame frame495 = new FrameBuilder(getSubImage(13, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile495 = new MapTileBuilder(frame495)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile495);

                Frame frame496 = new FrameBuilder(getSubImage(14, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile496 = new MapTileBuilder(frame496)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile496);

                Frame frame497 = new FrameBuilder(getSubImage(15, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile497 = new MapTileBuilder(frame497)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile497);

                Frame frame498 = new FrameBuilder(getSubImage(16, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile498 = new MapTileBuilder(frame498)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile498);

                Frame frame499 = new FrameBuilder(getSubImage(17, 14))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile499 = new MapTileBuilder(frame499)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile499);

                return mapTiles;
        }
}
