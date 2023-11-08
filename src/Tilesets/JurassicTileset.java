package Tilesets;

import Builders.FrameBuilder;
import Builders.MapTileBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import Level.TileType;
import Level.Tileset;

import java.util.ArrayList;

public class JurassicTileset extends Tileset 
{
    public JurassicTileset() 
    {
        super(ImageLoader.load("JungleTileset.png"), 16, 16, 3);
    }

    @Override
    public ArrayList<MapTileBuilder> defineTiles() 
    {
        ArrayList<MapTileBuilder> mapTiles = new ArrayList<>();

        //beginning of grass
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

        Frame frame7 = new FrameBuilder(getSubImage(0, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile7 = new MapTileBuilder(frame7);

        mapTiles.add(tile7);

        Frame frame8 = new FrameBuilder(getSubImage(0, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile8 = new MapTileBuilder(frame8);

        mapTiles.add(tile8);
        //end of grass

        //beginning of dirt
        Frame frame9 = new FrameBuilder(getSubImage(1, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile9 = new MapTileBuilder(frame9);

        mapTiles.add(tile9);

        Frame frame10 = new FrameBuilder(getSubImage(1, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile10 = new MapTileBuilder(frame10);

        mapTiles.add(tile10);

        Frame frame11 = new FrameBuilder(getSubImage(1, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile11 = new MapTileBuilder(frame11);

        mapTiles.add(tile11);

        Frame frame12 = new FrameBuilder(getSubImage(1, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile12 = new MapTileBuilder(frame12);

        mapTiles.add(tile12);

        Frame frame13 = new FrameBuilder(getSubImage(1, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile13 = new MapTileBuilder(frame13);

        mapTiles.add(tile13);

        Frame frame14 = new FrameBuilder(getSubImage(1, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile14 = new MapTileBuilder(frame14);

        mapTiles.add(tile14);

        Frame frame15 = new FrameBuilder(getSubImage(1, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile15 = new MapTileBuilder(frame15);

        mapTiles.add(tile15);

        Frame frame16 = new FrameBuilder(getSubImage(1, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile16 = new MapTileBuilder(frame16);

        mapTiles.add(tile16);
        //end of dirt

        //beginning of plants/rocks
        Frame frame17 = new FrameBuilder(getSubImage(2, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile17 = new MapTileBuilder(frame1)
                .withTopLayer(frame17);

        mapTiles.add(tile17);
        
        Frame frame18 = new FrameBuilder(getSubImage(2, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile18 = new MapTileBuilder(frame1)
                .withTopLayer(frame18);

        mapTiles.add(tile18);

        Frame frame19 = new FrameBuilder(getSubImage(2, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile19 = new MapTileBuilder(frame2)
                .withTopLayer(frame19);

        mapTiles.add(tile19);

        Frame frame20 = new FrameBuilder(getSubImage(2, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile20 = new MapTileBuilder(frame3)
                .withTopLayer(frame20);

        mapTiles.add(tile20);

        Frame frame21 = new FrameBuilder(getSubImage(2, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile21 = new MapTileBuilder(frame4)
                .withTopLayer(frame21);

        mapTiles.add(tile21);

        Frame frame22 = new FrameBuilder(getSubImage(2, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile22 = new MapTileBuilder(frame4)
                .withTopLayer(frame22);

        mapTiles.add(tile22);

        Frame frame23 = new FrameBuilder(getSubImage(2, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile23 = new MapTileBuilder(frame13)
                .withTopLayer(frame23);

        mapTiles.add(tile23);

        Frame frame24 = new FrameBuilder(getSubImage(2, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile24 = new MapTileBuilder(frame13)
                .withTopLayer(frame24);

        mapTiles.add(tile24);

        Frame frame25 = new FrameBuilder(getSubImage(3, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile25 = new MapTileBuilder(frame8)
                .withTopLayer(frame25);

        mapTiles.add(tile25);

        Frame frame26 = new FrameBuilder(getSubImage(3, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile26 = new MapTileBuilder(frame5)
                .withTopLayer(frame26);

        mapTiles.add(tile26);

        Frame frame27 = new FrameBuilder(getSubImage(3, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile27 = new MapTileBuilder(frame6)
                .withTopLayer(frame27);

        mapTiles.add(tile27);

        Frame frame28 = new FrameBuilder(getSubImage(3, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile28 = new MapTileBuilder(frame7)
                .withTopLayer(frame28);

        mapTiles.add(tile28);

        Frame frame29 = new FrameBuilder(getSubImage(3, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile29 = new MapTileBuilder(frame3)
                .withTopLayer(frame29);

        mapTiles.add(tile29);

        Frame frame30 = new FrameBuilder(getSubImage(3, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile30 = new MapTileBuilder(frame4)
                .withTopLayer(frame30);

        mapTiles.add(tile30);

        Frame frame31 = new FrameBuilder(getSubImage(3, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile31 = new MapTileBuilder(frame1)
                .withTopLayer(frame31);

        mapTiles.add(tile31);

        Frame frame32 = new FrameBuilder(getSubImage(3, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile32 = new MapTileBuilder(frame2)
                .withTopLayer(frame32);

        mapTiles.add(tile32);

        Frame frame33 = new FrameBuilder(getSubImage(4, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile33 = new MapTileBuilder(frame2)
                .withTopLayer(frame33)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile33);

        Frame frame34 = new FrameBuilder(getSubImage(4, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile34 = new MapTileBuilder(frame4)
                .withTopLayer(frame34)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile34);

        Frame frame35 = new FrameBuilder(getSubImage(4, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile35 = new MapTileBuilder(frame6)
                .withTopLayer(frame35)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile35);

        Frame frame36 = new FrameBuilder(getSubImage(4, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile36 = new MapTileBuilder(frame10)
                .withTopLayer(frame36)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile36);

        Frame frame37 = new FrameBuilder(getSubImage(4, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile37 = new MapTileBuilder(frame12)
                .withTopLayer(frame37)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile37);

        Frame frame38 = new FrameBuilder(getSubImage(4, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile38 = new MapTileBuilder(frame13)
                .withTopLayer(frame38)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile38);

        Frame frame39 = new FrameBuilder(getSubImage(4, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile39 = new MapTileBuilder(frame11)
                .withTopLayer(frame39)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile39);

        Frame frame40 = new FrameBuilder(getSubImage(4, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile40 = new MapTileBuilder(frame9)
                .withTopLayer(frame40)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile40);

        Frame frame41 = new FrameBuilder(getSubImage(5, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile41 = new MapTileBuilder(frame1)
                .withTopLayer(frame41)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile41);

        Frame frame42 = new FrameBuilder(getSubImage(5, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile42 = new MapTileBuilder(frame7)
                .withTopLayer(frame42)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile42);

        Frame frame43 = new FrameBuilder(getSubImage(5, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile43 = new MapTileBuilder(frame4)
                .withTopLayer(frame43)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile43);

        Frame frame44 = new FrameBuilder(getSubImage(5, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile44 = new MapTileBuilder(frame5)
                .withTopLayer(frame44)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile44);

        Frame frame45 = new FrameBuilder(getSubImage(5, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile45 = new MapTileBuilder(frame2)
                .withTopLayer(frame45)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile45);

        Frame frame46 = new FrameBuilder(getSubImage(5, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile46 = new MapTileBuilder(frame46)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile46);

        Frame frame47 = new FrameBuilder(getSubImage(5, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile47 = new MapTileBuilder(frame47)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile47);

        Frame frame48 = new FrameBuilder(getSubImage(5, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile48 = new MapTileBuilder(frame48)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile48);

        Frame frame49 = new FrameBuilder(getSubImage(6, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile49 = new MapTileBuilder(frame10)
                .withTopLayer(frame49)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile49);

        Frame frame50 = new FrameBuilder(getSubImage(6, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile50 = new MapTileBuilder(frame5)
                .withTopLayer(frame50)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile50);

        Frame frame51 = new FrameBuilder(getSubImage(6, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile51 = new MapTileBuilder(frame1)
                .withTopLayer(frame51)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile51);

        Frame frame52 = new FrameBuilder(getSubImage(6, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile52 = new MapTileBuilder(frame12)
                .withTopLayer(frame52)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile52);

        Frame frame53 = new FrameBuilder(getSubImage(6, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile53 = new MapTileBuilder(frame13)
                .withTopLayer(frame53)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile53);

        Frame frame54 = new FrameBuilder(getSubImage(6, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile54 = new MapTileBuilder(frame54);

        mapTiles.add(tile54);

        Frame frame55 = new FrameBuilder(getSubImage(6, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile55 = new MapTileBuilder(frame55);

        mapTiles.add(tile55);

        Frame frame56 = new FrameBuilder(getSubImage(6, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile56 = new MapTileBuilder(frame56);

        mapTiles.add(tile56);

        Frame frame57 = new FrameBuilder(getSubImage(7, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile57 = new MapTileBuilder(frame57);

        mapTiles.add(tile57);

        Frame frame58 = new FrameBuilder(getSubImage(7, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile58 = new MapTileBuilder(frame58);

        mapTiles.add(tile58);

        Frame frame59 = new FrameBuilder(getSubImage(7, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile59 = new MapTileBuilder(frame59);

        mapTiles.add(tile59);

        Frame frame60 = new FrameBuilder(getSubImage(7, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile60 = new MapTileBuilder(frame60)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile60);

        Frame frame61 = new FrameBuilder(getSubImage(7, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile61 = new MapTileBuilder(frame61)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile61);

        Frame frame62 = new FrameBuilder(getSubImage(7, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile62 = new MapTileBuilder(frame62);

        mapTiles.add(tile62);

        Frame frame63 = new FrameBuilder(getSubImage(7, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile63 = new MapTileBuilder(frame63);

        mapTiles.add(tile63);

        Frame frame64 = new FrameBuilder(getSubImage(7, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile64 = new MapTileBuilder(frame64);

        mapTiles.add(tile64);

        Frame frame65 = new FrameBuilder(getSubImage(8, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile65 = new MapTileBuilder(frame65);

        mapTiles.add(tile65);

        Frame frame66 = new FrameBuilder(getSubImage(8, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile66 = new MapTileBuilder(frame66);

        mapTiles.add(tile66);

        Frame frame67 = new FrameBuilder(getSubImage(8, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile67 = new MapTileBuilder(frame67);

        mapTiles.add(tile67);

        Frame frame68 = new FrameBuilder(getSubImage(8, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile68 = new MapTileBuilder(frame68)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile68);

        Frame frame69 = new FrameBuilder(getSubImage(8, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile69 = new MapTileBuilder(frame69)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile69);

        Frame frame70 = new FrameBuilder(getSubImage(8, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile70 = new MapTileBuilder(frame70)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile70);

        Frame frame71 = new FrameBuilder(getSubImage(8, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile71 = new MapTileBuilder(frame71)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile71);

        Frame frame72 = new FrameBuilder(getSubImage(8, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile72 = new MapTileBuilder(frame72)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile72);

        Frame frame73 = new FrameBuilder(getSubImage(9, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile73 = new MapTileBuilder(frame73);

        mapTiles.add(tile73);

        Frame frame74 = new FrameBuilder(getSubImage(9, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile74 = new MapTileBuilder(frame74);

        mapTiles.add(tile74);

        Frame frame75 = new FrameBuilder(getSubImage(9, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile75 = new MapTileBuilder(frame75);

        mapTiles.add(tile75);

        Frame frame76 = new FrameBuilder(getSubImage(9, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile76 = new MapTileBuilder(frame76);

        mapTiles.add(tile76);

        Frame frame77 = new FrameBuilder(getSubImage(9, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile77 = new MapTileBuilder(frame77);

        mapTiles.add(tile77);

        Frame frame78 = new FrameBuilder(getSubImage(9, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile78 = new MapTileBuilder(frame78)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile78);

        Frame frame79 = new FrameBuilder(getSubImage(9, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile79 = new MapTileBuilder(frame79)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile79);

        Frame frame80 = new FrameBuilder(getSubImage(9, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile80 = new MapTileBuilder(frame80)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile80);

        Frame frame81 = new FrameBuilder(getSubImage(10, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile81 = new MapTileBuilder(frame81)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile81);

        Frame frame82 = new FrameBuilder(getSubImage(10, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile82 = new MapTileBuilder(frame82)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile82);

        Frame frame83 = new FrameBuilder(getSubImage(10, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile83 = new MapTileBuilder(frame83)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile83);

        Frame frame84 = new FrameBuilder(getSubImage(10, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile84 = new MapTileBuilder(frame84);

        mapTiles.add(tile84);

        Frame frame85 = new FrameBuilder(getSubImage(10, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile85 = new MapTileBuilder(frame85);

        mapTiles.add(tile85);

        Frame frame86 = new FrameBuilder(getSubImage(10, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile86 = new MapTileBuilder(frame86);

        mapTiles.add(tile86);

        Frame frame87 = new FrameBuilder(getSubImage(10, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile87 = new MapTileBuilder(frame87);

        mapTiles.add(tile87);

        Frame frame88 = new FrameBuilder(getSubImage(10, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile88 = new MapTileBuilder(frame88);

        mapTiles.add(tile88);

        Frame frame89 = new FrameBuilder(getSubImage(11, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile89 = new MapTileBuilder(frame89)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile89);

        Frame frame90 = new FrameBuilder(getSubImage(11, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile90 = new MapTileBuilder(frame90)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile90);

        Frame frame91 = new FrameBuilder(getSubImage(11, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile91 = new MapTileBuilder(frame91)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile91);

        Frame frame92 = new FrameBuilder(getSubImage(11, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile92 = new MapTileBuilder(frame92)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile92);

        Frame frame93 = new FrameBuilder(getSubImage(11, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile93 = new MapTileBuilder(frame93)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile93);

        Frame frame94 = new FrameBuilder(getSubImage(11, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile94 = new MapTileBuilder(frame94)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile94);

        Frame frame95 = new FrameBuilder(getSubImage(11, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile95 = new MapTileBuilder(frame95)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile95);

        Frame frame96 = new FrameBuilder(getSubImage(11, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile96 = new MapTileBuilder(frame96)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile96);

        // Frame frame97 = new FrameBuilder(getSubImage(12, 0))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile97 = new MapTileBuilder(frame97);

        // mapTiles.add(tile97);

        // Frame frame98 = new FrameBuilder(getSubImage(12, 1))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile98 = new MapTileBuilder(frame98);

        // mapTiles.add(tile98);

        // Frame frame99 = new FrameBuilder(getSubImage(12, 2))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile99 = new MapTileBuilder(frame99);

        // mapTiles.add(tile99);

        // Frame frame100 = new FrameBuilder(getSubImage(12, 3))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile100 = new MapTileBuilder(frame100);

        // mapTiles.add(tile100);

        // Frame frame101 = new FrameBuilder(getSubImage(12, 4))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile101 = new MapTileBuilder(frame101);

        // mapTiles.add(tile101);

        // Frame frame102 = new FrameBuilder(getSubImage(12, 5))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile102 = new MapTileBuilder(frame102);

        // mapTiles.add(tile102);

        Frame frame103 = new FrameBuilder(getSubImage(12, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile103 = new MapTileBuilder(frame103)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile103);

        Frame frame104 = new FrameBuilder(getSubImage(12, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile104 = new MapTileBuilder(frame104)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile104);

        // Frame frame105 = new FrameBuilder(getSubImage(13, 0))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile105 = new MapTileBuilder(frame105);

        // mapTiles.add(tile105);

        // Frame frame106 = new FrameBuilder(getSubImage(13, 1))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile106 = new MapTileBuilder(frame106);

        // mapTiles.add(tile106);

        // Frame frame107 = new FrameBuilder(getSubImage(13, 2))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile107 = new MapTileBuilder(frame107);

        // mapTiles.add(tile107);

        // Frame frame108 = new FrameBuilder(getSubImage(13, 3))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile108 = new MapTileBuilder(frame108);

        // mapTiles.add(tile108);

        // Frame frame109 = new FrameBuilder(getSubImage(13, 4))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile109 = new MapTileBuilder(frame109);

        // mapTiles.add(tile109);

        // Frame frame110 = new FrameBuilder(getSubImage(13, 5))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile110 = new MapTileBuilder(frame110);

        // mapTiles.add(tile110);

        Frame frame111 = new FrameBuilder(getSubImage(13, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile111 = new MapTileBuilder(frame111);

        mapTiles.add(tile111);

        Frame frame112 = new FrameBuilder(getSubImage(13, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile112 = new MapTileBuilder(frame112);

        mapTiles.add(tile112);

        // Frame frame113 = new FrameBuilder(getSubImage(14, 0))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile113 = new MapTileBuilder(frame113);

        // mapTiles.add(tile113);

        // Frame frame114 = new FrameBuilder(getSubImage(14, 1))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile114 = new MapTileBuilder(frame114);

        // mapTiles.add(tile114);

        // Frame frame115 = new FrameBuilder(getSubImage(14, 2))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile115 = new MapTileBuilder(frame115);

        // mapTiles.add(tile115);

        // Frame frame116 = new FrameBuilder(getSubImage(14, 3))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile116 = new MapTileBuilder(frame116);

        // mapTiles.add(tile116);

        // Frame frame117 = new FrameBuilder(getSubImage(14, 4))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile117 = new MapTileBuilder(frame117);

        // mapTiles.add(tile117);

        // Frame frame118 = new FrameBuilder(getSubImage(14, 5))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile118 = new MapTileBuilder(frame118);

        // mapTiles.add(tile118);

        // Frame frame119 = new FrameBuilder(getSubImage(14, 6))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile119 = new MapTileBuilder(frame119);

        // mapTiles.add(tile119);

        // Frame frame120 = new FrameBuilder(getSubImage(14, 7))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile120 = new MapTileBuilder(frame120);

        // mapTiles.add(tile120);

        // Frame frame121 = new FrameBuilder(getSubImage(15, 0))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile121 = new MapTileBuilder(frame121);

        // mapTiles.add(tile121);

        // Frame frame122 = new FrameBuilder(getSubImage(15, 1))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile122 = new MapTileBuilder(frame122);

        // mapTiles.add(tile122);

        // Frame frame123 = new FrameBuilder(getSubImage(15, 2))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile123 = new MapTileBuilder(frame123);

        // mapTiles.add(tile123);

        // Frame frame124 = new FrameBuilder(getSubImage(15, 3))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile124 = new MapTileBuilder(frame124);

        // mapTiles.add(tile124);

        // Frame frame125 = new FrameBuilder(getSubImage(15, 4))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile125 = new MapTileBuilder(frame125);

        // mapTiles.add(tile125);

        // Frame frame126 = new FrameBuilder(getSubImage(15, 5))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile126 = new MapTileBuilder(frame126);

        // mapTiles.add(tile126);

        // Frame frame127 = new FrameBuilder(getSubImage(15, 6))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile127 = new MapTileBuilder(frame127);

        // mapTiles.add(tile127);

        // Frame frame128 = new FrameBuilder(getSubImage(15, 7))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile128 = new MapTileBuilder(frame128);

        // mapTiles.add(tile128);

        // Frame frame129 = new FrameBuilder(getSubImage(16, 0))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile129 = new MapTileBuilder(frame129);

        // mapTiles.add(tile129);

        // Frame frame130 = new FrameBuilder(getSubImage(16, 1))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile130 = new MapTileBuilder(frame130);

        // mapTiles.add(tile130);

        // Frame frame131 = new FrameBuilder(getSubImage(16, 2))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile131 = new MapTileBuilder(frame131);

        // mapTiles.add(tile131);

        // Frame frame132 = new FrameBuilder(getSubImage(16, 3))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile132 = new MapTileBuilder(frame132);

        // mapTiles.add(tile132);

        // Frame frame133 = new FrameBuilder(getSubImage(16, 4))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile133 = new MapTileBuilder(frame133);

        // mapTiles.add(tile133);

        // Frame frame134 = new FrameBuilder(getSubImage(16, 5))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile134 = new MapTileBuilder(frame134);

        // mapTiles.add(tile134);

        // Frame frame135 = new FrameBuilder(getSubImage(16, 6))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile135 = new MapTileBuilder(frame135);

        // mapTiles.add(tile135);

        // Frame frame136 = new FrameBuilder(getSubImage(16, 7))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile136 = new MapTileBuilder(frame136);

        // mapTiles.add(tile136);

        Frame frame137 = new FrameBuilder(getSubImage(17, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile137 = new MapTileBuilder(frame9)
                .withTopLayer(frame137)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile137);

        Frame frame138 = new FrameBuilder(getSubImage(17, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile138 = new MapTileBuilder(frame10)
                .withTopLayer(frame138)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile138);

        Frame frame139 = new FrameBuilder(getSubImage(17, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile139 = new MapTileBuilder(frame9)
                .withTopLayer(frame139)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile139);

        Frame frame140 = new FrameBuilder(getSubImage(17, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile140 = new MapTileBuilder(frame10)
                .withTopLayer(frame140)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile140);

        Frame frame141 = new FrameBuilder(getSubImage(17, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile141 = new MapTileBuilder(frame6)
                .withTopLayer(frame141)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile141);

        Frame frame142 = new FrameBuilder(getSubImage(17, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile142 = new MapTileBuilder(frame7)
                .withTopLayer(frame142)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile142);

        Frame frame143 = new FrameBuilder(getSubImage(17, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile143 = new MapTileBuilder(frame12)
                .withTopLayer(frame143)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile143);

         MapTileBuilder tile193 = new MapTileBuilder(frame4)
                .withTopLayer(frame143)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(tile193);

        // Frame frame144 = new FrameBuilder(getSubImage(17, 7))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile144 = new MapTileBuilder(frame144);

        // mapTiles.add(tile144);

        // Frame frame145 = new FrameBuilder(getSubImage(18, 0))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile145 = new MapTileBuilder(frame145);

        // mapTiles.add(tile145);

        // Frame frame146 = new FrameBuilder(getSubImage(18, 1))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile146 = new MapTileBuilder(frame146);

        // mapTiles.add(tile146);

        // Frame frame147 = new FrameBuilder(getSubImage(18, 2))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile147 = new MapTileBuilder(frame147);

        // mapTiles.add(tile147);

        // Frame frame148 = new FrameBuilder(getSubImage(18, 3))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile148 = new MapTileBuilder(frame148);

        // mapTiles.add(tile148);

        // Frame frame149 = new FrameBuilder(getSubImage(18, 4))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile149 = new MapTileBuilder(frame149);

        // mapTiles.add(tile149);

        // Frame frame150 = new FrameBuilder(getSubImage(18, 5))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile150 = new MapTileBuilder(frame150);

        // mapTiles.add(tile150);

        // Frame frame151 = new FrameBuilder(getSubImage(18, 6))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile151 = new MapTileBuilder(frame151);

        // mapTiles.add(tile151);

        // Frame frame152 = new FrameBuilder(getSubImage(18, 7))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile152 = new MapTileBuilder(frame152);

        // mapTiles.add(tile152);

        // Frame frame153 = new FrameBuilder(getSubImage(19, 0))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile153 = new MapTileBuilder(frame153);

        // mapTiles.add(tile153);

        // Frame frame154 = new FrameBuilder(getSubImage(19, 1))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile154 = new MapTileBuilder(frame154);

        // mapTiles.add(tile154);

        // Frame frame155 = new FrameBuilder(getSubImage(19, 2))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile155 = new MapTileBuilder(frame155);

        // mapTiles.add(tile155);

        // Frame frame156 = new FrameBuilder(getSubImage(19, 3))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile156 = new MapTileBuilder(frame156);

        // mapTiles.add(tile156);

        // Frame frame157 = new FrameBuilder(getSubImage(19, 4))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile157 = new MapTileBuilder(frame157);

        // mapTiles.add(tile157);

        Frame frame158 = new FrameBuilder(getSubImage(19, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile158 = new MapTileBuilder(frame158);

        mapTiles.add(tile158);

        Frame frame159 = new FrameBuilder(getSubImage(19, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile159 = new MapTileBuilder(frame159);

        mapTiles.add(tile159);

        Frame frame160 = new FrameBuilder(getSubImage(19, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile160 = new MapTileBuilder(frame160);

        mapTiles.add(tile160);

        Frame frame161 = new FrameBuilder(getSubImage(20, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile161 = new MapTileBuilder(frame161);

        mapTiles.add(tile161);

        Frame frame162 = new FrameBuilder(getSubImage(20, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile162 = new MapTileBuilder(frame162);

        mapTiles.add(tile162);

        Frame frame163 = new FrameBuilder(getSubImage(20, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile163 = new MapTileBuilder(frame163);

        mapTiles.add(tile163);

        Frame frame164 = new FrameBuilder(getSubImage(20, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile164 = new MapTileBuilder(frame164);

        mapTiles.add(tile164);

        Frame frame165 = new FrameBuilder(getSubImage(20, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile165 = new MapTileBuilder(frame165);

        mapTiles.add(tile165);

        Frame frame166 = new FrameBuilder(getSubImage(20, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile166 = new MapTileBuilder(frame166);

        mapTiles.add(tile166);

        Frame frame167 = new FrameBuilder(getSubImage(20, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile167 = new MapTileBuilder(frame167);

        mapTiles.add(tile167);

        Frame frame168 = new FrameBuilder(getSubImage(20, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile168 = new MapTileBuilder(frame168);

        mapTiles.add(tile168);

        Frame frame169 = new FrameBuilder(getSubImage(21, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile169 = new MapTileBuilder(frame169);

        mapTiles.add(tile169);

        Frame frame170 = new FrameBuilder(getSubImage(21, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile170 = new MapTileBuilder(frame170);

        mapTiles.add(tile170);

        Frame frame171 = new FrameBuilder(getSubImage(21, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile171 = new MapTileBuilder(frame2)
                .withTopLayer(frame171)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile171);

        Frame frame172 = new FrameBuilder(getSubImage(21, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile172 = new MapTileBuilder(frame3)
                .withTopLayer(frame172)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile172);

        Frame frame173 = new FrameBuilder(getSubImage(21, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile173 = new MapTileBuilder(frame4)
                .withTopLayer(frame173)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile173);

        Frame frame174 = new FrameBuilder(getSubImage(21, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile174 = new MapTileBuilder(frame1)
                .withTopLayer(frame174)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile174);

        Frame frame175 = new FrameBuilder(getSubImage(21, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile175 = new MapTileBuilder(frame2)
                .withTopLayer(frame175)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile175);

        Frame frame176 = new FrameBuilder(getSubImage(21, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile176 = new MapTileBuilder(frame3)
                .withTopLayer(frame176)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile176);

        Frame frame177 = new FrameBuilder(getSubImage(22, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile177 = new MapTileBuilder(frame4)
                .withTopLayer(frame177)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile177);

        Frame frame178 = new FrameBuilder(getSubImage(22, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile178 = new MapTileBuilder(frame5)
                .withTopLayer(frame178)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile178);

        Frame frame179 = new FrameBuilder(getSubImage(22, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile179 = new MapTileBuilder(frame1)
                .withTopLayer(frame179)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile179);

        Frame frame180 = new FrameBuilder(getSubImage(22, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile180 = new MapTileBuilder(frame2)
                .withTopLayer(frame180)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile180);

        Frame frame181 = new FrameBuilder(getSubImage(22, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile181 = new MapTileBuilder(frame3)
                .withTopLayer(frame181)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile181);

        Frame frame182 = new FrameBuilder(getSubImage(22, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile182 = new MapTileBuilder(frame4)
                .withTopLayer(frame182)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile182);

        Frame frame183 = new FrameBuilder(getSubImage(22, 6))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile183 = new MapTileBuilder(frame5)
                .withTopLayer(frame183)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile183);

        Frame frame184 = new FrameBuilder(getSubImage(22, 7))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile184 = new MapTileBuilder(frame1)
                .withTopLayer(frame184)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile184);

        Frame frame185 = new FrameBuilder(getSubImage(23, 0))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile185 = new MapTileBuilder(frame2)
                .withTopLayer(frame185)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile185);

        Frame frame186 = new FrameBuilder(getSubImage(23, 1))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile186 = new MapTileBuilder(frame3)
                .withTopLayer(frame186)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile186);

        Frame frame187 = new FrameBuilder(getSubImage(23, 2))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile187 = new MapTileBuilder(frame4)
                .withTopLayer(frame187)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile187);

        Frame frame188 = new FrameBuilder(getSubImage(23, 3))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile188 = new MapTileBuilder(frame5)
                .withTopLayer(frame188)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile188);

        Frame frame189 = new FrameBuilder(getSubImage(23, 4))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile189 = new MapTileBuilder(frame3)
                .withTopLayer(frame189)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile189);

        Frame frame190 = new FrameBuilder(getSubImage(23, 5))
                .withScale(tileScale)
                .build();

        MapTileBuilder tile190 = new MapTileBuilder(frame4)
                .withTopLayer(frame190)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(tile190);

        // Frame frame191 = new FrameBuilder(getSubImage(23, 6))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile191 = new MapTileBuilder(frame191);

        // mapTiles.add(tile191);

        // Frame frame192 = new FrameBuilder(getSubImage(23, 7))
        //         .withScale(tileScale)
        //         .build();

        // MapTileBuilder tile192 = new MapTileBuilder(frame192);

        // mapTiles.add(tile192);

        return mapTiles;
    }
}
