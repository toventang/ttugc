package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.SendMessageStatus */
public enum SendMessageStatus implements WireEnum {
    SEND_SUCCEED(0),
    USER_NOT_IN_CONVERSATION(1),
    CHECK_CONV_NOT_PASS(2),
    CHECK_MSG_NOT_PASS(3),
    CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE(4),
    USER_HAS_BEEN_BLOCKED(5);
    
    public static final ProtoAdapter<SendMessageStatus> ADAPTER = new ProtoAdapter_SendMessageStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.SendMessageStatus$ProtoAdapter_SendMessageStatus */
    static final class ProtoAdapter_SendMessageStatus extends EnumAdapter<SendMessageStatus> {
        static {
            Covode.recordClassIndex(23473);
        }

        ProtoAdapter_SendMessageStatus() {
            super(SendMessageStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final SendMessageStatus fromValue(int i) {
            return SendMessageStatus.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23472);
    }

    public static SendMessageStatus fromValue(int i) {
        if (i == 0) {
            return SEND_SUCCEED;
        }
        if (i == 1) {
            return USER_NOT_IN_CONVERSATION;
        }
        if (i == 2) {
            return CHECK_CONV_NOT_PASS;
        }
        if (i == 3) {
            return CHECK_MSG_NOT_PASS;
        }
        if (i == 4) {
            return CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE;
        }
        if (i != 5) {
            return null;
        }
        return USER_HAS_BEEN_BLOCKED;
    }

    private SendMessageStatus(int i) {
        this.value = i;
    }
}
