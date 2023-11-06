package MapEditor;

import Level.Map;
import Maps.TestMap;
import Maps.TitleScreenMap;
import Maps.ZombieMap;
import Maps.BlankMap;

import java.util.ArrayList;

public class EditorMaps {
    public static ArrayList<String> getMapNames() {
        return new ArrayList<String>() {{
            add("TestMap");
            add("TitleScreen");
            add("ZombieMap");
            add("BlankMap");
        }};
    }

    public static Map getMapByName(String mapName) {
        switch(mapName) {
            case "TestMap":
                return new TestMap();
            case "TitleScreen":
                return new TitleScreenMap();
            case "ZombieMap":
                return new ZombieMap();
            case "BlankMap":
                return new BlankMap();
            default:
                throw new RuntimeException("Unrecognized map name");
        }
    }
}
