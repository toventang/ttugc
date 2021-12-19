package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.PreviewOperationStatus */
public enum PreviewOperationStatus implements WireEnum {
    PREVIEW_OP_SUCCEED(0),
    PREVIEW_OP_PREVIEW_STATUS_NOT_OPEN(1),
    PREVIEW_OP_CALLBACK_NOT_PASS(2),
    PREVIEW_OP_CONVERSATION_NOT_FOUND(3);
    
    public static final ProtoAdapter<PreviewOperationStatus> ADAPTER = new ProtoAdapter_PreviewOperationStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.PreviewOperationStatus$ProtoAdapter_PreviewOperationStatus */
    static final class ProtoAdapter_PreviewOperationStatus extends EnumAdapter<PreviewOperationStatus> {
        static {
            Covode.recordClassIndex(23395);
        }

        ProtoAdapter_PreviewOperationStatus() {
            super(PreviewOperationStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final PreviewOperationStatus fromValue(int i) {
            return PreviewOperationStatus.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23394);
    }

    public static PreviewOperationStatus fromValue(int i) {
        if (i == 0) {
            return PREVIEW_OP_SUCCEED;
        }
        if (i == 1) {
            return PREVIEW_OP_PREVIEW_STATUS_NOT_OPEN;
        }
        if (i == 2) {
            return PREVIEW_OP_CALLBACK_NOT_PASS;
        }
        if (i != 3) {
            return null;
        }
        return PREVIEW_OP_CONVERSATION_NOT_FOUND;
    }

    private PreviewOperationStatus(int i) {
        this.value = i;
    }
}
