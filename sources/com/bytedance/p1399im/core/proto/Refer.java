package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.Refer */
public enum Refer implements WireEnum {
    REFER_NOT_USED(0),
    ANDROID(1),
    IOS(2),
    PC(3),
    SERVER(4);
    
    public static final ProtoAdapter<Refer> ADAPTER = new ProtoAdapter_Refer();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.Refer$ProtoAdapter_Refer */
    static final class ProtoAdapter_Refer extends EnumAdapter<Refer> {
        static {
            Covode.recordClassIndex(23429);
        }

        ProtoAdapter_Refer() {
            super(Refer.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final Refer fromValue(int i) {
            return Refer.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23428);
    }

    public static Refer fromValue(int i) {
        if (i == 0) {
            return REFER_NOT_USED;
        }
        if (i == 1) {
            return ANDROID;
        }
        if (i == 2) {
            return IOS;
        }
        if (i == 3) {
            return PC;
        }
        if (i != 4) {
            return null;
        }
        return SERVER;
    }

    private Refer(int i) {
        this.value = i;
    }
}
