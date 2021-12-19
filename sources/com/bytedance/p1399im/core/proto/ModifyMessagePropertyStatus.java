package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyStatus */
public enum ModifyMessagePropertyStatus implements WireEnum {
    MODIFY_PROPERTY_SUCCESS(0),
    MODIFY_PROPERTY_REPEAT_REQUEST(1),
    MODIFY_PROPERTY_INVALID_LENGTH(2),
    MODIFY_PROPERTY_INVALID_REQUEST(3),
    MODIFY_PROPERTY_CALLBACK_ERROR(4),
    MODIFY_PROPERTY_INTERNAL_ERROR(500);
    
    public static final ProtoAdapter<ModifyMessagePropertyStatus> ADAPTER = new ProtoAdapter_ModifyMessagePropertyStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyStatus$ProtoAdapter_ModifyMessagePropertyStatus */
    static final class ProtoAdapter_ModifyMessagePropertyStatus extends EnumAdapter<ModifyMessagePropertyStatus> {
        static {
            Covode.recordClassIndex(23349);
        }

        ProtoAdapter_ModifyMessagePropertyStatus() {
            super(ModifyMessagePropertyStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ModifyMessagePropertyStatus fromValue(int i) {
            return ModifyMessagePropertyStatus.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23348);
    }

    public static ModifyMessagePropertyStatus fromValue(int i) {
        if (i == 0) {
            return MODIFY_PROPERTY_SUCCESS;
        }
        if (i == 1) {
            return MODIFY_PROPERTY_REPEAT_REQUEST;
        }
        if (i == 2) {
            return MODIFY_PROPERTY_INVALID_LENGTH;
        }
        if (i == 3) {
            return MODIFY_PROPERTY_INVALID_REQUEST;
        }
        if (i == 4) {
            return MODIFY_PROPERTY_CALLBACK_ERROR;
        }
        if (i != 500) {
            return null;
        }
        return MODIFY_PROPERTY_INTERNAL_ERROR;
    }

    private ModifyMessagePropertyStatus(int i) {
        this.value = i;
    }
}
