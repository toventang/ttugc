package android.p003ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: android.ss.com.vboost.e */
public enum EnumC0058e {
    LEVEL_0("level_0", 0),
    LEVEL_1("level_1", 1),
    LEVEL_2("level_2", 2),
    LEVEL_3("level_3", 3),
    LEVEL_4("level_4", 4),
    LEVEL_5("level_5", 5),
    LEVEL_6("level_6", 6),
    LEVEL_7("level_7", 7),
    LEVEL_8("level_8", 8),
    LEVEL_9("level_9", 9);
    

    /* renamed from: a */
    private String f216a;

    /* renamed from: b */
    private int f217b;

    static {
        Covode.recordClassIndex(61);
    }

    public static EnumC0058e valueOf(int i) {
        switch (i) {
            case 0:
                return LEVEL_0;
            case 1:
                return LEVEL_1;
            case 2:
                return LEVEL_2;
            case 3:
                return LEVEL_3;
            case 4:
                return LEVEL_4;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return LEVEL_5;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return LEVEL_6;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return LEVEL_7;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return LEVEL_8;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return LEVEL_9;
            default:
                return null;
        }
    }

    private EnumC0058e(String str, int i) {
        this.f216a = str;
        this.f217b = i;
    }
}
