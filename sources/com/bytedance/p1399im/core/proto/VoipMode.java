package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.VoipMode */
public enum VoipMode implements WireEnum {
    VOIP_MODE_DOUBLE(0),
    VOIP_MODE_MULTIPLAYER(1);
    
    public static final ProtoAdapter<VoipMode> ADAPTER = new ProtoAdapter_VoipMode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.VoipMode$ProtoAdapter_VoipMode */
    static final class ProtoAdapter_VoipMode extends EnumAdapter<VoipMode> {
        static {
            Covode.recordClassIndex(23550);
        }

        ProtoAdapter_VoipMode() {
            super(VoipMode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final VoipMode fromValue(int i) {
            return VoipMode.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23549);
    }

    public static VoipMode fromValue(int i) {
        if (i == 0) {
            return VOIP_MODE_DOUBLE;
        }
        if (i != 1) {
            return null;
        }
        return VOIP_MODE_MULTIPLAYER;
    }

    private VoipMode(int i) {
        this.value = i;
    }
}
