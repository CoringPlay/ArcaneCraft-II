package net.reikeb.arcanecraft.init;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.*;

import net.reikeb.arcanecraft.ArcaneCraft;
import net.reikeb.arcanecraft.spell.*;

import java.util.Objects;
import java.util.function.Supplier;

public class ScrollFocusInit {

    public static final DeferredRegister<ScrollFocusObject> SCROLL_FOCUS_DEFERRED_REGISTER = DeferredRegister.create(ScrollFocusObject.class, ArcaneCraft.MODID);

    public static Supplier<IForgeRegistry<ScrollFocusObject>> SCOLL_FOCUS_REGISTRY = SCROLL_FOCUS_DEFERRED_REGISTER.makeRegistry("arcane_scroll_focus", () ->
            new RegistryBuilder<ScrollFocusObject>().setMaxID(Integer.MAX_VALUE - 1).onAdd((owner, stage, id, obj, oldObj) ->
                    ArcaneCraft.LOGGER.info("Scroll Focus added: " + getName(obj).toString() + " ")
            ).setDefaultKey(new ResourceLocation(ArcaneCraft.MODID, "empty"))
    );

    public static final RegistryObject<ScrollFocusObject> EMPTY = SCROLL_FOCUS_DEFERRED_REGISTER.register("empty", ScrollFocusObject::new);
    public static final RegistryObject<ScrollFocusObject> EVOKER = SCROLL_FOCUS_DEFERRED_REGISTER.register("evoker", () -> new ScrollFocusObject(Lazy.of(() -> new SpellInstance(SpellInit.EVOKER.get()))));
    public static final RegistryObject<ScrollFocusObject> FIRE = SCROLL_FOCUS_DEFERRED_REGISTER.register("fire", () -> new ScrollFocusObject(Lazy.of(() -> new SpellInstance(SpellInit.FIRE.get()))));
    public static final RegistryObject<ScrollFocusObject> ICE = SCROLL_FOCUS_DEFERRED_REGISTER.register("ice", () -> new ScrollFocusObject(Lazy.of(() -> new SpellInstance(SpellInit.ICE.get()))));
    public static final RegistryObject<ScrollFocusObject> LIFE_DRAIN = SCROLL_FOCUS_DEFERRED_REGISTER.register("life_drain", () -> new ScrollFocusObject(Lazy.of(() -> new SpellInstance(SpellInit.LIFE_DRAIN.get()))));
    public static final RegistryObject<ScrollFocusObject> LIGHTNING = SCROLL_FOCUS_DEFERRED_REGISTER.register("lightning", () -> new ScrollFocusObject(Lazy.of(() -> new SpellInstance(SpellInit.LIGHTNING.get()))));
    public static final RegistryObject<ScrollFocusObject> BOLT = SCROLL_FOCUS_DEFERRED_REGISTER.register("bolt", () -> new ScrollFocusObject(Lazy.of(() -> new SpellInstance(SpellInit.BOLT.get()))));

    public static <T extends IForgeRegistryEntry<?>> ResourceLocation getName(T type) {
        return Objects.requireNonNull(type.getRegistryName());
    }
}
