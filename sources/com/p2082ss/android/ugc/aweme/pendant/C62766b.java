package com.p2082ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.util.C80160s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.pendant.b */
public final class C62766b {

    /* renamed from: a */
    public static final String f142286a = "fission_sp";

    /* renamed from: b */
    public static final String f142287b = "last_show_feed_pendant_date";

    /* renamed from: c */
    public static final int f142288c = 86400000;

    /* renamed from: d */
    public static final String f142289d = "app_open";

    /* renamed from: e */
    public static final String f142290e = "open_time";

    /* renamed from: f */
    public static final String f142291f = "bubble_state";

    /* renamed from: g */
    public static final String f142292g = "today_showed_time";

    /* renamed from: h */
    public static final String f142293h = "current_day";

    /* renamed from: i */
    public static final String f142294i = "pendant_close_day_list";

    /* renamed from: j */
    public static final String f142295j = "not_show_before_stamp";

    /* renamed from: k */
    public static final C62767a f142296k = new C62767a((byte) 0);

    /* renamed from: l */
    private final Keva f142297l = Keva.getRepo(f142286a);

    /* renamed from: m */
    private final C80160s f142298m = new C80160s(f142294i);

    /* renamed from: n */
    private int f142299n = -1;

    /* renamed from: o */
    private int f142300o = -1;

    /* renamed from: p */
    private int f142301p = -1;

    /* renamed from: com.ss.android.ugc.aweme.pendant.b$a */
    public static final class C62767a {
        static {
            Covode.recordClassIndex(73590);
        }

        private C62767a() {
        }

        public /* synthetic */ C62767a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.b$b */
    public static final class C62768b {

        /* renamed from: a */
        public static final C62766b f142302a = new C62766b();

        /* renamed from: b */
        public static final C62768b f142303b = new C62768b();

        private C62768b() {
        }

        static {
            Covode.recordClassIndex(73591);
        }
    }

    /* renamed from: a */
    public final Keva mo100734a() {
        Keva keva = this.f142297l;
        C89219l.m154716b(keva, "");
        return keva;
    }

    /* renamed from: d */
    private final void m113134d() {
        mo100734a().storeInt(f142292g, 0);
    }

    /* renamed from: e */
    private final boolean m113135e() {
        return C89219l.m154714a((Object) m113137g(), (Object) m113139i());
    }

    /* renamed from: f */
    private final void m113136f() {
        mo100734a().storeString(f142293h, m113137g());
    }

    /* renamed from: i */
    private final String m113139i() {
        return mo100734a().getString(f142293h, "");
    }

    /* renamed from: c */
    private final int m113133c() {
        if (m113135e()) {
            return mo100734a().getInt(f142292g, 0);
        }
        m113136f();
        m113134d();
        return 0;
    }

    static {
        Covode.recordClassIndex(73589);
    }

    /* renamed from: g */
    private static String m113137g() {
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return String.valueOf(instance.getTimeInMillis());
    }

    /* renamed from: h */
    private static long m113138h() {
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: b */
    public final void mo100738b() {
        C80160s sVar = this.f142298m;
        if (sVar != null) {
            long b = C80160s.m138918b();
            List<String> a = sVar.mo123607a();
            a.add(String.valueOf(b));
            Keva keva = sVar.f179600a;
            String str = sVar.f179601b;
            String[] strArr = new String[a.size()];
            int i = 0;
            for (String str2 : a) {
                strArr[i] = str2;
                i++;
            }
            keva.storeStringArray(str, strArr);
            int i2 = this.f142299n;
            if (i2 > 0 && this.f142301p > 0 && this.f142300o > 0) {
                C80160s sVar2 = this.f142298m;
                long b2 = C80160s.m138918b();
                List<String> a2 = sVar2.mo123607a();
                ArrayList arrayList = new ArrayList();
                long j = b2 - ((long) ((i2 - 1) * 86400000));
                for (String str3 : a2) {
                    Long g = C89361p.m154865g(str3);
                    if (g != null && g.longValue() >= j) {
                        arrayList.add(String.valueOf(g.longValue()));
                    }
                }
                if (arrayList.size() >= this.f142300o) {
                    mo100734a().storeLong(f142295j, m113138h() + ((long) (this.f142301p * f142288c)));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100735a(Context context) {
        C89219l.m154721d(context, "");
        mo100734a().storeInt(f142292g, m113133c() + 1);
    }

    /* renamed from: a */
    public final boolean mo100737a(int i, Context context) {
        C89219l.m154721d(context, "");
        if (m113133c() + 1 <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m113130a(Context context, int i) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception e) {
            e.printStackTrace();
            packageInfo = null;
        }
        long j = 0;
        if (packageInfo != null) {
            j = packageInfo.firstInstallTime;
        }
        if (System.currentTimeMillis() - j < ((long) (i * f142288c))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo100736a(int i, int i2, int i3) {
        this.f142299n = i;
        this.f142300o = i2;
        this.f142301p = i3;
        Keva a = mo100734a();
        String str = f142295j;
        long j = a.getLong(str, -1);
        if (j <= 0) {
            return true;
        }
        if (m113138h() < j) {
            return false;
        }
        mo100734a().storeLong(str, -1);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cd, code lost:
        if (r7 == null) goto L_0x00d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113131a(android.content.Context r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.pendant.C62766b.m113131a(android.content.Context, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        if (r6.getCount() < r18) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d5, code lost:
        if (r6 == null) goto L_0x00da;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113132b(android.content.Context r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.pendant.C62766b.m113132b(android.content.Context, int, int):boolean");
    }
}
