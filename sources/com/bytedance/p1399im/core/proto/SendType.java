package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.SendType */
public enum SendType implements WireEnum {
    BY_CONVERSATION(0),
    BY_USER(1);
    
    public static final ProtoAdapter<SendType> ADAPTER = new ProtoAdapter_SendType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.SendType$ProtoAdapter_SendType */
    static final class ProtoAdapter_SendType extends EnumAdapter<SendType> {
        static {
            Covode.recordClassIndex(23475);
        }

        ProtoAdapter_SendType() {
            super(SendType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final SendType fromValue(int i) {
            return SendType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23474);
    }

    public static SendType fromValue(int i) {
        if (i == 0) {
            return BY_CONVERSATION;
        }
        if (i != 1) {
            return null;
        }
        return BY_USER;
    }

    private SendType(int i) {
        this.value = i;
    }
}
