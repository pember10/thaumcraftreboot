# Blocks
There is both code and JSON involved. Just follow the rabbit trail of "table_wood" within the `./java/thaumcraft/` and `./java/resources/assets/thaumcraft/` folders

## Creating Blocks
#### Basic Step-by-step:
Create the block/drop itself...
1. Update `./common/block/ThaumcraftBlocks`
2. Create the blockstate, like `./resources/assets/thaumcraft/blockstates/block_name.json` ("block_name" must match the block's string name from step 1)
3. Create the actual placed block, like `./resources/assets/thaumcraft/models/block/block_name.json` (the world block)
   - I'd recommend using something like Blockbench to create/edit this. It's a lot easier than guessing vertices.
   - There are some config items that Blockbench doesn't automatically provide. For example: `"parent": "block/cube_all"` is important. It tells it to inherit the behavior of a standard block, including the way it's displayed in the inventory.
4. Create the inventory/drop item, like `./resources/assets/thaumcraft/models/item/block_name.json`
5. Create any texture(s), like `./resources/assets/thaumcraft/textures/block/block_name.png`
   - Ensure this filename matches the model's texture from step 3
6. Update the language file, like `./resources/assets/thaumcraft/lang/en_us.json`

Now create the metadata...
7. Create the recipe, like `./resources/data/thaumcraft/recipes/block_name.json`
8. Create the loot table, like `./resources/data/thaumcraft/loot_tables/blocks/block_name.json`
9. Can it be broken and picked up? Add it to the required minimum tool's config, like `./resources/data/minecraft/tags/blocks/needs_stone_tool.json` or etc.
10. Can it be broken by a specific tool? Add it to the mineables configs, like `./resources/data/minecraft/tags/blocks/mineable/axe.json` or etc.
    - Since these are tags, we can add our own mineable tags (e.g. `thaumic.json`)

#### Dev Notes
- The block's .strength() property is a _relative_ strength. For example, a 1f is the normal mining speed. But if it's configured as .requiresCorrectToolForDrops(), it will multiply that by a larger factor when using the wrong tool, and make it so even longer time is needed for mining.
- Occlusion is automatic, even if it shouldn't be. So if you have a block (like a table) that doesn't take up a full block (e.g. the legs), it will still occlude any adjacent block faces, thus rendering the adjacent block as see-through. Simply add the .noOcclusion() property to the block. Be careful with this property on blocks that are placed en masse, as it WILL bog down lower-end computers. 

### Links
- [Minecraft 1.19 Forge Modding Tutorial | CUSTOM BLOCKS | #3](https://www.youtube.com/watch?v=d1fUtp_AAWY&list=PLKGarocXCE1HrC60yuTNTGRoZc6hf5Uvl&index=3)
