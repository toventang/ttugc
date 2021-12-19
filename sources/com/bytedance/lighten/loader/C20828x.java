package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.p1854e.C24229q;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lighten.loader.x */
public final class C20828x {

    /* renamed from: a */
    private static final C24229q.AbstractC24231b f49258a = C24229q.AbstractC24231b.f57458h;

    static {
        Covode.recordClassIndex(24404);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lighten.loader.x$1 */
    public static /* synthetic */ class C208291 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49259a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.C20828x.C208291.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C24229q.AbstractC24231b m39185a(EnumC20767w wVar) {
        C24229q.AbstractC24231b bVar = f49258a;
        switch (C208291.f49259a[wVar.ordinal()]) {
            case 1:
                return C24229q.AbstractC24231b.f57452b;
            case 2:
                return C24229q.AbstractC24231b.f57453c;
            case 3:
                return C24229q.AbstractC24231b.f57455e;
            case 4:
                return C24229q.AbstractC24231b.f57454d;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return C24229q.AbstractC24231b.f57456f;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return C24229q.AbstractC24231b.f57458h;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return C24229q.AbstractC24231b.f57457g;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return C24229q.AbstractC24231b.f57459i;
            default:
                return bVar;
        }
    }
}
