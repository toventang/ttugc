package com.bytedance.frameworks.baselib.network;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.a */
public class C14581a {

    /* renamed from: a */
    public static volatile EnumC14583a f35250a = EnumC14583a.NormalStart;

    /* renamed from: b */
    public static final AtomicBoolean f35251b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final AtomicLong f35252c = new AtomicLong(0);

    /* renamed from: d */
    public static final AtomicLong f35253d = new AtomicLong(0);

    /* renamed from: e */
    public static final AtomicLong f35254e = new AtomicLong(0);

    /* renamed from: f */
    public static final AtomicLong f35255f = new AtomicLong(0);

    /* renamed from: g */
    private static final String f35256g = C14581a.class.getSimpleName();

    /* renamed from: com.bytedance.frameworks.baselib.network.a$a */
    public enum EnumC14583a {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2);
        

        /* renamed from: a */
        final int f35259a;

        public final int getValue() {
            return this.f35259a;
        }

        static {
            Covode.recordClassIndex(16674);
        }

        private EnumC14583a(int i) {
            this.f35259a = i;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.a$1 */
    public static /* synthetic */ class C145821 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35257a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 16673(0x4121, float:2.3364E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.frameworks.baselib.network.a$a[] r0 = com.bytedance.frameworks.baselib.network.C14581a.EnumC14583a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.frameworks.baselib.network.C14581a.C145821.f35257a = r2
                com.bytedance.frameworks.baselib.network.a$a r0 = com.bytedance.frameworks.baselib.network.C14581a.EnumC14583a.ColdStart     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.frameworks.baselib.network.C14581a.C145821.f35257a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.frameworks.baselib.network.a$a r0 = com.bytedance.frameworks.baselib.network.C14581a.EnumC14583a.HotStart     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.frameworks.baselib.network.C14581a.C145821.f35257a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.frameworks.baselib.network.a$a r0 = com.bytedance.frameworks.baselib.network.C14581a.EnumC14583a.WarmStart     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.C14581a.C145821.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(16672);
    }

    /* renamed from: a */
    public static void m26665a(JSONObject jSONObject) {
        boolean z;
        AtomicBoolean atomicBoolean = f35251b;
        if (jSONObject.optInt("request_tag_enabled") > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        f35253d.set((long) jSONObject.optInt("cold_start_seconds"));
        f35254e.set((long) jSONObject.optInt("hot_start_seconds"));
        f35255f.set((long) jSONObject.optInt("warm_start_seconds"));
        Logger.debug();
    }

    /* renamed from: a */
    public static boolean m26666a(long j, long j2) {
        if ((System.currentTimeMillis() / 1000) - j > j2) {
            return true;
        }
        return false;
    }
}
