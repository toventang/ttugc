package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.NewMessageNotifyType */
public enum NewMessageNotifyType implements WireEnum {
    PER_USER(1),
    PER_CONVERSATION(2);
    
    public static final ProtoAdapter<NewMessageNotifyType> ADAPTER = new ProtoAdapter_NewMessageNotifyType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.NewMessageNotifyType$ProtoAdapter_NewMessageNotifyType */
    static final class ProtoAdapter_NewMessageNotifyType extends EnumAdapter<NewMessageNotifyType> {
        static {
            Covode.recordClassIndex(23376);
        }

        ProtoAdapter_NewMessageNotifyType() {
            super(NewMessageNotifyType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final NewMessageNotifyType fromValue(int i) {
            return NewMessageNotifyType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23375);
    }

    public static NewMessageNotifyType fromValue(int i) {
        if (i == 1) {
            return PER_USER;
        }
        if (i != 2) {
            return null;
        }
        return PER_CONVERSATION;
    }

    private NewMessageNotifyType(int i) {
        this.value = i;
    }
}
