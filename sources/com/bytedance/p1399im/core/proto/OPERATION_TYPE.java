package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.OPERATION_TYPE */
public enum OPERATION_TYPE implements WireEnum {
    ADD_PROPERTY_ITEM(0),
    REMOVE_PROPERTY_ITEM(1),
    SET_PROPERTY(2),
    DEL_PROPERTY(3);
    
    public static final ProtoAdapter<OPERATION_TYPE> ADAPTER = new ProtoAdapter_OPERATION_TYPE();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.OPERATION_TYPE$ProtoAdapter_OPERATION_TYPE */
    static final class ProtoAdapter_OPERATION_TYPE extends EnumAdapter<OPERATION_TYPE> {
        static {
            Covode.recordClassIndex(23381);
        }

        ProtoAdapter_OPERATION_TYPE() {
            super(OPERATION_TYPE.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final OPERATION_TYPE fromValue(int i) {
            return OPERATION_TYPE.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23380);
    }

    public static OPERATION_TYPE fromValue(int i) {
        if (i == 0) {
            return ADD_PROPERTY_ITEM;
        }
        if (i == 1) {
            return REMOVE_PROPERTY_ITEM;
        }
        if (i == 2) {
            return SET_PROPERTY;
        }
        if (i != 3) {
            return null;
        }
        return DEL_PROPERTY;
    }

    private OPERATION_TYPE(int i) {
        this.value = i;
    }
}
