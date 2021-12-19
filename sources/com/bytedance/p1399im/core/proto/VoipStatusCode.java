package com.bytedance.p1399im.core.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.VoipStatusCode */
public enum VoipStatusCode implements WireEnum {
    SUCCESS(0),
    VOIP_PARAMS_ERROR(4),
    VOIP_STATUS_ERROR(18),
    VOIP_CANCEL_ERROR(19),
    VOIP_OTHER_RESPONSE_ERROR(20),
    VOIP_CALLBACK_ERROR(21);
    
    public static final ProtoAdapter<VoipStatusCode> ADAPTER = new ProtoAdapter_VoipStatusCode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.VoipStatusCode$ProtoAdapter_VoipStatusCode */
    static final class ProtoAdapter_VoipStatusCode extends EnumAdapter<VoipStatusCode> {
        static {
            Covode.recordClassIndex(23554);
        }

        ProtoAdapter_VoipStatusCode() {
            super(VoipStatusCode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final VoipStatusCode fromValue(int i) {
            return VoipStatusCode.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23553);
    }

    public static VoipStatusCode fromValue(int i) {
        if (i == 0) {
            return SUCCESS;
        }
        if (i == 4) {
            return VOIP_PARAMS_ERROR;
        }
        switch (i) {
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return VOIP_STATUS_ERROR;
            case 19:
                return VOIP_CANCEL_ERROR;
            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                return VOIP_OTHER_RESPONSE_ERROR;
            case 21:
                return VOIP_CALLBACK_ERROR;
            default:
                return null;
        }
    }

    private VoipStatusCode(int i) {
        this.value = i;
    }
}
