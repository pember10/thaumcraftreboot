# About Loot Tables
In 1.19.2, loot tables are configured via the JSON files within this folder (e.g. /blocks/table_wood.json). For example:

`./blocks/table_wood.json`
```json
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "thaumcraft:table_wood"
        }
      ]
    }
  ]
}
```
A simple example of a drop from an item (mapped via the filename)

### Links
- [Minecraft 1.19 Forge Modding Tutorial | RECIPES & LOOT TABLES | #4](https://www.youtube.com/watch?v=iFFc5-zkDcA&list=PLKGarocXCE1HrC60yuTNTGRoZc6hf5Uvl&index=4)
- _Loot Table Generator_: https://misode.github.io/loot-table/ (no reason to re-invent the wheel)