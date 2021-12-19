package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;

public class DefaultValueBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    private final B builder;

    static {
        Covode.recordClassIndex(35671);
    }

    public M build() {
        return (M) this.builder.build();
    }

    public DefaultValueBuilder(B b) {
        this.builder = b;
    }

    public DefaultValueBuilder addDefaultSettingGroup(DefaultValueGroup<M, B> defaultValueGroup) {
        defaultValueGroup.addDefaultValues(this.builder);
        return this;
    }
}
