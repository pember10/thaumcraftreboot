# About Recipes
In 1.19.2, the recipes are configured via JSON within this folder (see table_wood.json as an example).

In 1.7.12, it was a little different. Within the decompiled TC code, you can find the things like this:
```Java
oreDictRecipe("tablewood", defaultGroup, new ItemStack(BlocksTC.tableWood), new Object[] { "SSS", "W W"
        Character.valueOf('S'), "slabWood", Character.valueOf('W'), "plankWood" });
```

It would be comparable to the 1.19.2 JSON file formatting like so:
```json
{
  "type": "minecraft:crafting_shaped",
  "key": {
    "S": {
      "tag": "minecraft:slabWood"
    },
    "W": {
      "tag": "minecraft:plankWood"
    }
  },
  "pattern": [
    "SSS",
    "W W",
    "   "
  ],
  "result": {
    "count": 1,
    "item": "thaumcraft:tablewood"
  }
}
```