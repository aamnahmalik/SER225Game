package Tilesets;

import Builders.FrameBuilder;
import Builders.MapTileBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import Level.TileType;
import Level.Tileset;

import java.util.ArrayList;

public class ZombieTileset extends Tileset 
{
        public ZombieTileset()
        {
                super(ImageLoader.load("ZombieTileset.png"), 16, 16, 3);
        }

        @Override
        public ArrayList<MapTileBuilder> defineTiles() 
        {
                ArrayList<MapTileBuilder> mapTiles = new ArrayList<>();

                //beginning of 'road'
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

                Frame frame3 = new FrameBuilder(getSubImage(0, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile3 = new MapTileBuilder(frame3);

                mapTiles.add(tile3);

                Frame frame4 = new FrameBuilder(getSubImage(0, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile4 = new MapTileBuilder(frame4);

                mapTiles.add(tile4);

                Frame frame5 = new FrameBuilder(getSubImage(0, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile5 = new MapTileBuilder(frame5);

                mapTiles.add(tile5);

                Frame frame6 = new FrameBuilder(getSubImage(0, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile6 = new MapTileBuilder(frame6);

                mapTiles.add(tile6);

                Frame frame7 = new FrameBuilder(getSubImage(1, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile7 = new MapTileBuilder(frame7);

                mapTiles.add(tile7);

                Frame frame8 = new FrameBuilder(getSubImage(1, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile8 = new MapTileBuilder(frame8);

                mapTiles.add(tile8);

                Frame frame9 = new FrameBuilder(getSubImage(1, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile9 = new MapTileBuilder(frame9);

                mapTiles.add(tile9);

                Frame frame10 = new FrameBuilder(getSubImage(1, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile10 = new MapTileBuilder(frame10);

                mapTiles.add(tile10);

                Frame frame11 = new FrameBuilder(getSubImage(1, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile11 = new MapTileBuilder(frame11);

                mapTiles.add(tile11);

                Frame frame12 = new FrameBuilder(getSubImage(1, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile12 = new MapTileBuilder(frame12);

                mapTiles.add(tile12);
                //end of 'road'

                //beginning of lava rim
                Frame frame13 = new FrameBuilder(getSubImage(2, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile13 = new MapTileBuilder(frame13)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile13);

                Frame frame14 = new FrameBuilder(getSubImage(2, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile14 = new MapTileBuilder(frame14)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile14);

                Frame frame15 = new FrameBuilder(getSubImage(2, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile15 = new MapTileBuilder(frame15)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile15);

                Frame frame16 = new FrameBuilder(getSubImage(2, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile16 = new MapTileBuilder(frame16)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile16);

                Frame frame17 = new FrameBuilder(getSubImage(2, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile17 = new MapTileBuilder(frame17)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile17);

                Frame frame18 = new FrameBuilder(getSubImage(2, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile18 = new MapTileBuilder(frame18)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile18);

                Frame frame19 = new FrameBuilder(getSubImage(3, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile19 = new MapTileBuilder(frame19)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile19);

                Frame frame20 = new FrameBuilder(getSubImage(3, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile20 = new MapTileBuilder(frame20)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile20);

                Frame frame21 = new FrameBuilder(getSubImage(3, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile21 = new MapTileBuilder(frame21)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile21);

                Frame frame22 = new FrameBuilder(getSubImage(3, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile22 = new MapTileBuilder(frame22)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile22);

                Frame frame23 = new FrameBuilder(getSubImage(3, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile23 = new MapTileBuilder(frame23)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile23);

                Frame frame24 = new FrameBuilder(getSubImage(3, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile24 = new MapTileBuilder(frame24)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile24);

                Frame frame25 = new FrameBuilder(getSubImage(4, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile25 = new MapTileBuilder(frame25)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile25);

                Frame frame26 = new FrameBuilder(getSubImage(4, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile26 = new MapTileBuilder(frame26)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile26);

                Frame frame27 = new FrameBuilder(getSubImage(4, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile27 = new MapTileBuilder(frame27)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile27);

                Frame frame28 = new FrameBuilder(getSubImage(4, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile28 = new MapTileBuilder(frame28)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile28);

                Frame frame29 = new FrameBuilder(getSubImage(4, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile29 = new MapTileBuilder(frame29)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile29);
                //end of lava rim

                //beginning of lava
                Frame frame30 = new FrameBuilder(getSubImage(4, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile30 = new MapTileBuilder(frame30)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile30);

                Frame frame31 = new FrameBuilder(getSubImage(5, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile31 = new MapTileBuilder(frame31)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile31);

                Frame frame32 = new FrameBuilder(getSubImage(5, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile32 = new MapTileBuilder(frame32)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile32);

                Frame frame33 = new FrameBuilder(getSubImage(5, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile33 = new MapTileBuilder(frame33)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile33);

                Frame frame34 = new FrameBuilder(getSubImage(5, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile34 = new MapTileBuilder(frame34)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile34);

                Frame frame35 = new FrameBuilder(getSubImage(5, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile35 = new MapTileBuilder(frame35)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile35);

                Frame frame36 = new FrameBuilder(getSubImage(5, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile36 = new MapTileBuilder(frame36)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile36);

                Frame frame37 = new FrameBuilder(getSubImage(6, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile37 = new MapTileBuilder(frame37)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile37);

                Frame frame38 = new FrameBuilder(getSubImage(6, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile38 = new MapTileBuilder(frame38)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile38);

                Frame frame39 = new FrameBuilder(getSubImage(6, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile39 = new MapTileBuilder(frame39)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile39);

                Frame frame40 = new FrameBuilder(getSubImage(6, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile40 = new MapTileBuilder(frame40)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile40);

                Frame frame41 = new FrameBuilder(getSubImage(6, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile41 = new MapTileBuilder(frame41)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile41);

                Frame frame42 = new FrameBuilder(getSubImage(6, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile42 = new MapTileBuilder(frame42)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile42);

                Frame frame43 = new FrameBuilder(getSubImage(7, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile43 = new MapTileBuilder(frame43)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile43);

                Frame frame44 = new FrameBuilder(getSubImage(7, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile44 = new MapTileBuilder(frame44)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile44);

                Frame frame45 = new FrameBuilder(getSubImage(7, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile45 = new MapTileBuilder(frame45)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile45);

                Frame frame46 = new FrameBuilder(getSubImage(7, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile46 = new MapTileBuilder(frame46)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile46);

                Frame frame47 = new FrameBuilder(getSubImage(7, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile47 = new MapTileBuilder(frame47)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile47);

                Frame frame48 = new FrameBuilder(getSubImage(7, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile48 = new MapTileBuilder(frame48)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile48);
                //end of lava

                Frame frame49 = new FrameBuilder(getSubImage(8, 0))
                        .withScale(tileScale)
                        .build();

                MapTileBuilder tile49 = new MapTileBuilder(frame1)
                                .withTopLayer(frame49)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile49);

                Frame frame50 = new FrameBuilder(getSubImage(8, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile50 = new MapTileBuilder(frame1)
                                .withTopLayer(frame50)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile50);

                Frame frame51 = new FrameBuilder(getSubImage(8, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile51 = new MapTileBuilder(frame7)
                                .withTopLayer(frame51)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile51);

                Frame frame52 = new FrameBuilder(getSubImage(8, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile52 = new MapTileBuilder(frame9)
                                .withTopLayer(frame52)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile52);

                Frame frame53 = new FrameBuilder(getSubImage(8, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile53 = new MapTileBuilder(frame10)
                                .withTopLayer(frame53)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile53);

                Frame frame54 = new FrameBuilder(getSubImage(8, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile54 = new MapTileBuilder(frame4)
                                .withTopLayer(frame54)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile54);

                Frame frame55 = new FrameBuilder(getSubImage(9, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile55 = new MapTileBuilder(frame1)
                                .withTopLayer(frame55)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile55);

                Frame frame56 = new FrameBuilder(getSubImage(9, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile56 = new MapTileBuilder(frame2)
                                .withTopLayer(frame56)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile56);

                Frame frame57 = new FrameBuilder(getSubImage(9, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile57 = new MapTileBuilder(frame3)
                                .withTopLayer(frame57)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile57);

                Frame frame58 = new FrameBuilder(getSubImage(9, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile58 = new MapTileBuilder(frame4)
                                .withTopLayer(frame58)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile58);

                Frame frame59 = new FrameBuilder(getSubImage(9, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile59 = new MapTileBuilder(frame5)
                                .withTopLayer(frame59)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile59);

                Frame frame60 = new FrameBuilder(getSubImage(9, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile60 = new MapTileBuilder(frame7)
                                .withTopLayer(frame60)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile60);

                Frame frame61 = new FrameBuilder(getSubImage(10, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile61 = new MapTileBuilder(frame61)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile61);

                Frame frame62 = new FrameBuilder(getSubImage(10, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile62 = new MapTileBuilder(frame62)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile62);

                Frame frame63 = new FrameBuilder(getSubImage(10, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile63 = new MapTileBuilder(frame63)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile63);

                Frame frame64 = new FrameBuilder(getSubImage(10, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile64 = new MapTileBuilder(frame11)
                                .withTopLayer(frame64)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile64);

                Frame frame65 = new FrameBuilder(getSubImage(10, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile65 = new MapTileBuilder(frame1)
                                .withTopLayer(frame65)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile65);

                Frame frame66 = new FrameBuilder(getSubImage(10, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile66 = new MapTileBuilder(frame66)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile66);

                Frame frame67 = new FrameBuilder(getSubImage(11, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile67 = new MapTileBuilder(frame67)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile67);

                Frame frame68 = new FrameBuilder(getSubImage(11, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile68 = new MapTileBuilder(frame68)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile68);

                Frame frame69 = new FrameBuilder(getSubImage(11, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile69 = new MapTileBuilder(frame5)
                                .withTopLayer(frame69)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile69);

                Frame frame70 = new FrameBuilder(getSubImage(11, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile70 = new MapTileBuilder(frame7)
                                .withTopLayer(frame70)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile70);

                Frame frame71 = new FrameBuilder(getSubImage(11, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile71 = new MapTileBuilder(frame71)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile71);

                Frame frame72 = new FrameBuilder(getSubImage(11, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile72 = new MapTileBuilder(frame72)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile72);

                Frame frame73 = new FrameBuilder(getSubImage(12, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile73 = new MapTileBuilder(frame73)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile73);

                Frame frame74 = new FrameBuilder(getSubImage(12, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile74 = new MapTileBuilder(frame11)
                                .withTopLayer(frame74)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile74);

                Frame frame75 = new FrameBuilder(getSubImage(12, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile75 = new MapTileBuilder(frame1)
                                .withTopLayer(frame75)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile75);

                Frame frame76 = new FrameBuilder(getSubImage(12, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile76 = new MapTileBuilder(frame2)
                                .withTopLayer(frame76)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile76);

                Frame frame77 = new FrameBuilder(getSubImage(12, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile77 = new MapTileBuilder(frame3)
                                .withTopLayer(frame77)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile77);

                Frame frame78 = new FrameBuilder(getSubImage(12, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile78 = new MapTileBuilder(frame4)
                                .withTopLayer(frame78)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile78);

                Frame frame79 = new FrameBuilder(getSubImage(13, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile79 = new MapTileBuilder(frame5)
                                .withTopLayer(frame79)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile79);

                Frame frame80 = new FrameBuilder(getSubImage(13, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile80 = new MapTileBuilder(frame10)
                                .withTopLayer(frame80)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile80);

                Frame frame81 = new FrameBuilder(getSubImage(13, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile81 = new MapTileBuilder(frame3)
                                .withTopLayer(frame81)
                                .withTileType(TileType.NOT_PASSABLE);

                mapTiles.add(tile81);

                Frame frame82 = new FrameBuilder(getSubImage(13, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile82 = new MapTileBuilder(frame9)
                                .withTopLayer(frame82)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile82);

                Frame frame83 = new FrameBuilder(getSubImage(13, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile83 = new MapTileBuilder(frame3)
                                .withTopLayer(frame83)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile83);

                Frame frame84 = new FrameBuilder(getSubImage(13, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile84 = new MapTileBuilder(frame4)
                                .withTopLayer(frame84)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile84);

                Frame frame85 = new FrameBuilder(getSubImage(14, 0))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile85 = new MapTileBuilder(frame10)
                                .withTopLayer(frame85)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile85);

                Frame frame86 = new FrameBuilder(getSubImage(14, 1))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile86 = new MapTileBuilder(frame4)
                                .withTopLayer(frame86)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile86);

                Frame frame87 = new FrameBuilder(getSubImage(14, 2))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile87 = new MapTileBuilder(frame2)
                                .withTopLayer(frame87)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile87);

                Frame frame88 = new FrameBuilder(getSubImage(14, 3))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile88 = new MapTileBuilder(frame8)
                                .withTopLayer(frame88)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile88);

                Frame frame89 = new FrameBuilder(getSubImage(14, 4))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile89 = new MapTileBuilder(frame2)
                                .withTopLayer(frame89)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile89);

                Frame frame90 = new FrameBuilder(getSubImage(14, 5))
                                .withScale(tileScale)
                                .build();

                MapTileBuilder tile90 = new MapTileBuilder(frame10)
                                .withTopLayer(frame90)
                                .withTileType(TileType.PASSABLE);

                mapTiles.add(tile90);

                return mapTiles;
        }
}
