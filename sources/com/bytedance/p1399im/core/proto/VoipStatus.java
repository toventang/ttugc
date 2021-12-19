package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.VoipStatus */
public enum VoipStatus implements WireEnum {
    IDLE(0),
    CALLING(1),
    RINGING(2),
    ACCEPTED(3),
    ONTHECALL(4),
    TERMINATED(101),
    OCCUPIED(102),
    REFUSED(103),
    CANCELLED(104),
    UNAVAILABLE(105),
    RTCERROR(106),
    RTC_ENGINE_MISMATCH(107);
    
    public static final ProtoAdapter<VoipStatus> ADAPTER = new ProtoAdapter_VoipStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.VoipStatus$ProtoAdapter_VoipStatus */
    static final class ProtoAdapter_VoipStatus extends EnumAdapter<VoipStatus> {
        static {
            Covode.recordClassIndex(23552);
        }

        ProtoAdapter_VoipStatus() {
            super(VoipStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final VoipStatus fromValue(int i) {
            return VoipStatus.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23551);
    }

    public static VoipStatus fromValue(int i) {
        if (i == 0) {
            return IDLE;
        }
        if (i == 1) {
            return CALLING;
        }
        if (i == 2) {
            return RINGING;
        }
        if (i == 3) {
            return ACCEPTED;
        }
        if (i == 4) {
            return ONTHECALL;
        }
        switch (i) {
            case 101:
                return TERMINATED;
            case 102:
                return OCCUPIED;
            case 103:
                return REFUSED;
            case 104:
                return CANCELLED;
            case 105:
                return UNAVAILABLE;
            case 106:
                return RTCERROR;
            case 107:
                return RTC_ENGINE_MISMATCH;
            default:
                return null;
        }
    }

    private VoipStatus(int i) {
        this.value = i;
    }
}
