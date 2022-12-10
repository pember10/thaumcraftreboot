# Thaumcraft Reboot
A total conversion of Thaumcraft to MC 1.19.2

## Getting Started
First and foremost, see the Forge documentation for getting an environment setup:
https://docs.minecraftforge.net/en/latest/gettingstarted/
(some of it is also noted in the [Forge MDK Installation Notes section below](#forge-mdk-installation-notes))

There is a .rar file within the 'develop' branch that contains the decompiled sources for Thaumcraft 4. Most of the methods, fields, etc. are somewhat obfuscated, but you can pretty easily infer what it is based on how it's used:

For example:
```java
protected ResourceLocation func_110775_a(Entity entity) {
  return getEntityTexture((EntityFallingBlock)entity);
}
```

Since `func_110775_a` returns an entity texture, and since the type is ResourceLocation and it's within the RenderFallingTaint class, the function was probably called `getFallingTaintEntityResource`, but I suppose it doesn't matter much, since we can name it whatever we want.

### Additional Dev Resources
- 1.19.2 JavaDocs: https://nekoyue.github.io/ForgeJavaDocs-NG/javadoc/1.19.2/ (Conversion version)
- 1.12.2 JavaDocs: https://nekoyue.github.io/ForgeJavaDocs-NG/javadoc/1.12.2/ (Current TC6 version)
- 1.7.10 JavaDocs: https://skmedix.github.io/ForgeJavaDocs/javadoc/forge/1.7.10-10.13.4.1614/ (TC4)
- Modding Tutorials: https://www.youtube.com/playlist?list=PLKGarocXCE1HrC60yuTNTGRoZc6hf5Uvl

### Dev Notes
- Create an Item (within the API)
  - Modify ThaumcraftItems.java -- check out the example SOAP_WATER_BUCKET. If you really want to get crazy, derive a custom class from the Item base class.
  - If it's possible, can we do this all with JSON?
- Create a Block (within the API)
  - Modify ThaumcraftBlocks.java -- the SOAP_WATER_BLOCK is a good example. If you really want to go all out, create a class that derives from the Block class (though I don't know how the registry will handle that).
- Create a Fluid (within the API)
  - Modify ThaumcraftFluids.java -- The SOURCE_ and FLOWING_SOAP_WATER fluids are good examples.
- In general, keep everything organized under these folders. See the /resources folder for examples of how to configure the display.
- When attempting to create a new block, search the whole project for instance of "flux_goo" and "fluxgoo". You'll see how to implement them.

-------------------------------------------------


## Forge MDK Installation Notes
### Source installation information for modders
This code follows the Minecraft Forge installation methodology. It will apply
some small patches to the vanilla MCP source code, giving you and it access 
to some of the data and functions you need to build a successful mod.

Note also that the patches are built against "un-renamed" MCP source code (aka
SRG Names) - this means that you will not be able to read them directly against
normal code.

### Setup Process:
Step 1: Open your command-line and browse to the folder where you extracted the zip file.

Step 2: You're left with a choice.
If you prefer to use VSCode (the preferred method)
1. Ensure that you have the Gradle extension installed in VSCode (the icon looks like an elephant).
2. Within Gradle, expand Tasks > forgegradle runs, and run the `genVSCodeRuns` task.
3. Optionally: If you don't have the Gradle extension, open a terminal and run `gradlew genVSCodeRuns` (in Windows, replace `gradlew` with `.\gradlew.bat`).

If you prefer to use Eclipse:
1. Run the following command: `gradlew genEclipseRuns` (`./gradlew genEclipseRuns` if you are on Mac/Linux)
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run `gradlew eclipse` to generate the project.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: `gradlew genIntellijRuns` (`./gradlew genIntellijRuns` if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.

### Mapping Names:
By default, the MDK is configured to use the official mapping names from Mojang for methods and fields 
in the Minecraft codebase. These names are covered by a specific license. All modders should be aware of this
license, if you do not agree with it you can change your mapping names to other crowdsourced names in your 
build.gradle. For the latest license text, refer to the mapping file itself, or the reference copy here:
https://github.com/MinecraftForge/MCPConfig/blob/master/Mojang.md

### Additional Forge MDK Installation Resources:
Community Documentation: https://mcforge.readthedocs.io/en/latest/gettingstarted/  
LexManos' Install Video: https://www.youtube.com/watch?v=8VEdtQLuLO0  
Forge Forum: https://forums.minecraftforge.net/  
Forge Discord: https://discord.gg/UvedJ9m  
