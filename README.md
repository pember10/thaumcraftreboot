# Thaumcraft Reboot
A total conversion of Thaumcraft to MC 1.19.2

## Getting Started
First and foremost, see the Forge documentation for getting an environment setup:
https://docs.minecraftforge.net/en/latest/gettingstarted/
(some of it is also noted in the [Forge MDK Installation Notes section below](#forge-mdk-installation-notes))

There is a .rar file within the 'develop' branch that contains the decompiled sources for Thaumcraft 6. Most of the methods, fields, etc. are heavily obfuscated, but you can pretty easily infer what it is based on how it's used:
For example:
protected ResourceLocation func_110775_a(Entity entity) {
  return getEntityTexture((EntityFallingBlock)entity);
}
since func_110775_a returns an entity texture, and since the type is ResourceLocation and it's within the RenderFallingTaint class, the function was probably called "getFallingTaintEntityResource", but I suppose it doesn't matter much, since we can name it whatever we want.

### Additional Resources
... TODO...



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

### Additional Resources:
Community Documentation: https://mcforge.readthedocs.io/en/latest/gettingstarted/  
LexManos' Install Video: https://www.youtube.com/watch?v=8VEdtQLuLO0  
Forge Forum: https://forums.minecraftforge.net/  
Forge Discord: https://discord.gg/UvedJ9m  
