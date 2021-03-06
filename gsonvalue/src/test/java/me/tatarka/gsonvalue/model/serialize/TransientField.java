package me.tatarka.gsonvalue.model.serialize;

import me.tatarka.gsonvalue.annotations.GsonConstructor;

public class TransientField {
    private final transient String dontSerialize = "really!";
    private final int arg;

    @GsonConstructor
    public TransientField(int arg) {
        this.arg = arg;
    }

    public int getArg() {
        return arg;
    }

    public final String getDontSerialize() {
        return dontSerialize;
    }
}
