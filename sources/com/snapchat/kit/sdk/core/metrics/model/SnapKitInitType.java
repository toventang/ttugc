package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SnapKitInitType implements WireEnum {
    INIT_TYPE_NONE(0),
    INIT_TYPE_AUTO(1),
    INIT_TYPE_DEFERRED(2),
    INIT_TYPE_FEATURE(3);
    
    public static final ProtoAdapter<SnapKitInitType> ADAPTER = new ProtoAdapter_SnapKitInitType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_SnapKitInitType extends EnumAdapter<SnapKitInitType> {
        static {
            Covode.recordClassIndex(35317);
        }

        ProtoAdapter_SnapKitInitType() {
            super(SnapKitInitType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final SnapKitInitType fromValue(int i) {
            return SnapKitInitType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(35316);
    }

    public static SnapKitInitType fromValue(int i) {
        if (i == 0) {
            return INIT_TYPE_NONE;
        }
        if (i == 1) {
            return INIT_TYPE_AUTO;
        }
        if (i == 2) {
            return INIT_TYPE_DEFERRED;
        }
        if (i != 3) {
            return null;
        }
        return INIT_TYPE_FEATURE;
    }

    private SnapKitInitType(int i) {
        this.value = i;
    }
}
