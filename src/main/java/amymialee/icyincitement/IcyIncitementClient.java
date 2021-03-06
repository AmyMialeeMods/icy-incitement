package amymialee.icyincitement;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class IcyIncitementClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {}

    static {
        ModelPredicateProviderRegistry.register(IcyIncitement.SNOWBALL_SPRINKLER, new Identifier("charge"), (stack, world, entity, number) -> 1 - ((float) stack.getDamage() / stack.getMaxDamage()));
    }
}