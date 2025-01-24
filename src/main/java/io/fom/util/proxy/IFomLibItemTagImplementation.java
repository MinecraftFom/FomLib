package io.fom.util.proxy;

import javax.annotation.Nullable;

public interface IFomLibItemTagImplementation {
    @Nullable
    public EnumProxyModelTypes getModel();
    @Nullable
    public int getColorHex();
}
