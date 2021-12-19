package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.InitType */
public enum InitType implements WireEnum {
    TYPE_BY_CONVERSATION(1),
    TYPE_BY_USER(2),
    TYPE_BY_RANK(3);
    
    public static final ProtoAdapter<InitType> ADAPTER = new ProtoAdapter_InitType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.InitType$ProtoAdapter_InitType */
    static final class ProtoAdapter_InitType extends EnumAdapter<InitType> {
        static {
            Covode.recordClassIndex(23262);
        }

        ProtoAdapter_InitType() {
            super(InitType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final InitType fromValue(int i) {
            return InitType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23261);
    }

    public static InitType fromValue(int i) {
        if (i == 1) {
            return TYPE_BY_CONVERSATION;
        }
        if (i == 2) {
            return TYPE_BY_USER;
        }
        if (i != 3) {
            return null;
        }
        return TYPE_BY_RANK;
    }

    private InitType(int i) {
        this.value = i;
    }
}
