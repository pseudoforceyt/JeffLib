package de.jeff_media.jefflib.internal.nms;

import com.mojang.authlib.GameProfile;
import de.jeff_media.jefflib.data.tuples.Pair;
import de.jeff_media.jefflib.internal.InternalOnly;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@Deprecated
@InternalOnly
public interface AbstractNMSHandler {

    //void updateMap(@NotNull final MapView map);

    Pair<String,String> getBiomeName(@NotNull final Location location);

    void playTotemAnimation(@NotNull final Player player);

    void setHeadTexture(@NotNull final Block block, @NotNull final GameProfile gameProfile);

    /*int getComparatorOutput(final Block block);

    void setComparatorOutput(final Block block, final int value);*/

}