package xyz.bluspring.template.fabric

import net.fabricmc.api.ModInitializer
import xyz.bluspring.template.KotlinStonecutterTemplate

class KotlinStonecutterTemplateFabric : ModInitializer {
    override fun onInitialize() {
        KotlinStonecutterTemplate.init()
    }
}