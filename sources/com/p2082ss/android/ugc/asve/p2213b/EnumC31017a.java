package com.p2082ss.android.ugc.asve.p2213b;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.b.a */
public enum EnumC31017a {
    AS_CAMERA_NULL,
    AS_CAMERA_1,
    AS_CAMERA_2,
    AS_CAMERA_MI,
    AS_CAMERA_OPPO,
    AS_CAMERA_CHRY_CAMKIT,
    AS_CAMERA_VIVO,
    AS_CAMERA_OPPO_CAMERA_UNIT,
    AS_CAMERA_MI_V2,
    AS_CAMERA_OPPO_CAMERA_MEDIA;
    
    public static final C31018a Companion = new C31018a((byte) 0);

    static {
        Covode.recordClassIndex(37646);
    }

    /* renamed from: com.ss.android.ugc.asve.b.a$a */
    public static final class C31018a {
        static {
            Covode.recordClassIndex(37647);
        }

        private C31018a() {
        }

        public /* synthetic */ C31018a(byte b) {
            this();
        }
    }

    public static final EnumC31017a fromOrdinal(int i) {
        switch (i) {
            case 1:
                return AS_CAMERA_1;
            case 2:
                return AS_CAMERA_2;
            case 3:
                return AS_CAMERA_MI;
            case 4:
                return AS_CAMERA_OPPO;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return AS_CAMERA_CHRY_CAMKIT;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return AS_CAMERA_VIVO;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return AS_CAMERA_OPPO_CAMERA_UNIT;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return AS_CAMERA_MI_V2;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return AS_CAMERA_OPPO_CAMERA_MEDIA;
            default:
                return AS_CAMERA_NULL;
        }
    }

    public static final int toIntValue(EnumC31017a aVar) {
        C89219l.m154721d(aVar, "");
        switch (C31019b.f74341a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return 4;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return 5;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return 6;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return 7;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return 8;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return 9;
            default:
                throw new C89376n();
        }
    }
}
