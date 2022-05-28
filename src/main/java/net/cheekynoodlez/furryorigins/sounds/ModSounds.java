package net.cheekynoodlez.furryorigins.sounds;

import net.cheekynoodlez.furryorigins.FurryOrigins;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent SERGAL_MERP = registerSoundEvent("sergal_merp");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FurryOrigins.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
