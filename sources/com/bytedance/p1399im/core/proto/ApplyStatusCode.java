package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ApplyStatusCode */
public enum ApplyStatusCode implements WireEnum {
    APPLYING(1),
    AGREE(2),
    DENY(3),
    INVALID(4);
    
    public static final ProtoAdapter<ApplyStatusCode> ADAPTER = new ProtoAdapter_ApplyStatusCode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.ApplyStatusCode$ProtoAdapter_ApplyStatusCode */
    static final class ProtoAdapter_ApplyStatusCode extends EnumAdapter<ApplyStatusCode> {
        static {
            Covode.recordClassIndex(22907);
        }

        ProtoAdapter_ApplyStatusCode() {
            super(ApplyStatusCode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ApplyStatusCode fromValue(int i) {
            return ApplyStatusCode.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(22906);
    }

    public static ApplyStatusCode fromValue(int i) {
        if (i == 1) {
            return APPLYING;
        }
        if (i == 2) {
            return AGREE;
        }
        if (i == 3) {
            return DENY;
        }
        if (i != 4) {
            return null;
        }
        return INVALID;
    }

    private ApplyStatusCode(int i) {
        this.value = i;
    }
}
