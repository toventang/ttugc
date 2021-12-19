package androidx.work.impl.p073b;

import androidx.work.C1603i;
import androidx.work.EnumC1590a;
import androidx.work.EnumC1602h;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: androidx.work.impl.b.m */
public final class C1660m {
    static {
        Covode.recordClassIndex(1816);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.b.m$1 */
    public static /* synthetic */ class C16611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5350a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5351b;

        /* renamed from: c */
        static final /* synthetic */ int[] f5352c;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0097 */
        static {
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p073b.C1660m.C16611.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C1603i.EnumC1604a m5475a(int i) {
        if (i == 0) {
            return C1603i.EnumC1604a.ENQUEUED;
        }
        if (i == 1) {
            return C1603i.EnumC1604a.RUNNING;
        }
        if (i == 2) {
            return C1603i.EnumC1604a.SUCCEEDED;
        }
        if (i == 3) {
            return C1603i.EnumC1604a.FAILED;
        }
        if (i == 4) {
            return C1603i.EnumC1604a.BLOCKED;
        }
        if (i == 5) {
            return C1603i.EnumC1604a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    /* renamed from: b */
    public static EnumC1590a m5477b(int i) {
        if (i == 0) {
            return EnumC1590a.EXPONENTIAL;
        }
        if (i == 1) {
            return EnumC1590a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    /* renamed from: c */
    public static EnumC1602h m5478c(int i) {
        if (i == 0) {
            return EnumC1602h.NOT_REQUIRED;
        }
        if (i == 1) {
            return EnumC1602h.CONNECTED;
        }
        if (i == 2) {
            return EnumC1602h.UNMETERED;
        }
        if (i == 3) {
            return EnumC1602h.NOT_ROAMING;
        }
        if (i == 4) {
            return EnumC1602h.METERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    /* renamed from: a */
    public static int m5473a(C1603i.EnumC1604a aVar) {
        switch (C16611.f5350a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return 4;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e A[SYNTHETIC, Splitter:B:34:0x005e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1595d m5474a(byte[] r7) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p073b.C1660m.m5474a(byte[]):androidx.work.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067 A[SYNTHETIC, Splitter:B:36:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m5476a(androidx.work.C1595d r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p073b.C1660m.m5476a(androidx.work.d):byte[]");
    }
}
