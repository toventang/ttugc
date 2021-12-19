package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MessageStatus */
public enum MessageStatus implements WireEnum {
    AVAILABLE(0),
    NOT_EXIST(1),
    INVISIBLE(2),
    RECALLED(3),
    DELETED(4);
    
    public static final ProtoAdapter<MessageStatus> ADAPTER = new ProtoAdapter_MessageStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.MessageStatus$ProtoAdapter_MessageStatus */
    static final class ProtoAdapter_MessageStatus extends EnumAdapter<MessageStatus> {
        static {
            Covode.recordClassIndex(23318);
        }

        ProtoAdapter_MessageStatus() {
            super(MessageStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MessageStatus fromValue(int i) {
            return MessageStatus.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23317);
    }

    public static MessageStatus fromValue(int i) {
        if (i == 0) {
            return AVAILABLE;
        }
        if (i == 1) {
            return NOT_EXIST;
        }
        if (i == 2) {
            return INVISIBLE;
        }
        if (i == 3) {
            return RECALLED;
        }
        if (i != 4) {
            return null;
        }
        return DELETED;
    }

    private MessageStatus(int i) {
        this.value = i;
    }
}
