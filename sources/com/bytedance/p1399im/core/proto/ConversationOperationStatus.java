package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ConversationOperationStatus */
public enum ConversationOperationStatus implements WireEnum {
    OP_SUCCEED(0),
    REJECTED(1),
    PARTLY_REJECTED(2),
    APPLY_REJECTED(3),
    APPLY_SUCCEED(4),
    TOUCH_LIMITS(5);
    
    public static final ProtoAdapter<ConversationOperationStatus> ADAPTER = new ProtoAdapter_ConversationOperationStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationOperationStatus$ProtoAdapter_ConversationOperationStatus */
    static final class ProtoAdapter_ConversationOperationStatus extends EnumAdapter<ConversationOperationStatus> {
        static {
            Covode.recordClassIndex(23043);
        }

        ProtoAdapter_ConversationOperationStatus() {
            super(ConversationOperationStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ConversationOperationStatus fromValue(int i) {
            return ConversationOperationStatus.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23042);
    }

    public static ConversationOperationStatus fromValue(int i) {
        if (i == 0) {
            return OP_SUCCEED;
        }
        if (i == 1) {
            return REJECTED;
        }
        if (i == 2) {
            return PARTLY_REJECTED;
        }
        if (i == 3) {
            return APPLY_REJECTED;
        }
        if (i == 4) {
            return APPLY_SUCCEED;
        }
        if (i != 5) {
            return null;
        }
        return TOUCH_LIMITS;
    }

    private ConversationOperationStatus(int i) {
        this.value = i;
    }
}
