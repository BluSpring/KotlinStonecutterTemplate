package xyz.bluspring.template.forge

import net.minecraftforge.fml.common.Mod
import xyz.bluspring.template.KotlinStonecutterTemplate

@Mod(KotlinStonecutterTemplate.MOD_ID)
class KotlinStonecutterTemplateForge {
    init {
        KotlinStonecutterTemplate.init()
    }
}
