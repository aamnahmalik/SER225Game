package MapEditor;

import Level.Map;
import Maps.TestMap;
import Maps.TitleScreenMap;
import Maps.ZombieMap;
import Maps.JurassicMap;

import java.util.ArrayList;

public class EditorMaps {
    public static ArrayList<String> getMapNames() {
        return new ArrayList<String>() {{
            add("TestMap");
            add("TitleScreen");
            add("ZombieMap");

            add("JurassicMap");
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


            case "JurassicMap":
                return new JurassicMap();
            default:
                throw new RuntimeException("Unrecognized map name");
        }
    }
}
