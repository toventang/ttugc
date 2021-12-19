package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ConversationType */
public enum ConversationType implements WireEnum {
    ONE_TO_ONE_CHAT(1),
    GROUP_CHAT(2),
    LIVE_CHAT(3),
    BROADCAST_CHAT(4);
    
    public static final ProtoAdapter<ConversationType> ADAPTER = new ProtoAdapter_ConversationType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationType$ProtoAdapter_ConversationType */
    static final class ProtoAdapter_ConversationType extends EnumAdapter<ConversationType> {
        static {
            Covode.recordClassIndex(23069);
        }

        ProtoAdapter_ConversationType() {
            super(ConversationType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ConversationType fromValue(int i) {
            return ConversationType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23068);
    }

    public static ConversationType fromValue(int i) {
        if (i == 1) {
            return ONE_TO_ONE_CHAT;
        }
        if (i == 2) {
            return GROUP_CHAT;
        }
        if (i == 3) {
            return LIVE_CHAT;
        }
        if (i != 4) {
            return null;
        }
        return BROADCAST_CHAT;
    }

    private ConversationType(int i) {
        this.value = i;
    }
}
