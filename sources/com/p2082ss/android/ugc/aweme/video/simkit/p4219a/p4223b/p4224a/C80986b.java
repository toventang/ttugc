package com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4223b.p4224a;

import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63101e;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.a.b.a.b */
public final class C80986b implements AbstractC63101e {

    /* renamed from: a */
    volatile C13624l.EnumC13625a f181023a = C13624l.EnumC13625a.UNKNOWN;

    static {
        Covode.recordClassIndex(94296);
    }

    @Override // com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63101e
    /* renamed from: a */
    public final String mo101329a() {
        return "network_type";
    }

    @Override // com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63101e
    /* renamed from: b */
    public final String mo101330b() {
        C1731i.m5640b(new CallableC80988c(this), C1731i.f5562a);
        switch (C809871.f181024a[this.f181023a.ordinal()]) {
            case 1:
                return "none";
            case 2:
            case 3:
                return "2g";
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "3g";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "4g";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "5g";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "wifi";
            default:
                return "unknown";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.a.b.a.b$1 */
    static /* synthetic */ class C809871 {

        /* renamed from: a */
        static final /* synthetic */ int[] f181024a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simkit.p4219a.p4223b.p4224a.C80986b.C809871.<clinit>():void");
        }
    }
}
