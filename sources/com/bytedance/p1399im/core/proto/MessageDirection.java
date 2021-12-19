package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MessageDirection */
public enum MessageDirection implements WireEnum {
    OLDER(1),
    NEWER(2),
    FROM_LATEST(3);
    
    public static final ProtoAdapter<MessageDirection> ADAPTER = new ProtoAdapter_MessageDirection();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.MessageDirection$ProtoAdapter_MessageDirection */
    static final class ProtoAdapter_MessageDirection extends EnumAdapter<MessageDirection> {
        static {
            Covode.recordClassIndex(23313);
        }

        ProtoAdapter_MessageDirection() {
            super(MessageDirection.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MessageDirection fromValue(int i) {
            return MessageDirection.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23312);
    }

    public static MessageDirection fromValue(int i) {
        if (i == 1) {
            return OLDER;
        }
        if (i == 2) {
            return NEWER;
        }
        if (i != 3) {
            return null;
        }
        return FROM_LATEST;
    }

    private MessageDirection(int i) {
        this.value = i;
    }
}
