package com.p2082ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.d */
public final class C42452d implements AbstractC42448c {

    /* renamed from: b */
    public static boolean f98930b;

    /* renamed from: c */
    public static boolean f98931c;

    /* renamed from: d */
    public static boolean f98932d;

    /* renamed from: e */
    public static String f98933e = "";

    /* renamed from: f */
    static String f98934f = "";

    /* renamed from: g */
    static int f98935g = -1;

    /* renamed from: h */
    static Map<String, String> f98936h;

    /* renamed from: i */
    static C67568r f98937i;

    /* renamed from: j */
    public static boolean f98938j;

    /* renamed from: k */
    public static int f98939k;

    /* renamed from: l */
    public static int f98940l;

    /* renamed from: m */
    public static final C42452d f98941m = new C42452d();

    /* renamed from: n */
    private static int f98942n;

    private C42452d() {
    }

    static {
        Covode.recordClassIndex(50400);
    }

    /* renamed from: a */
    public static String m84857a() {
        C67469ad c;
        String str;
        AbstractC67567q a = C67486am.m119564a();
        if (a == null || (c = a.mo106431c()) == null || (str = c.f151151a) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static void m84858a(View view, String str, int i) {
        m84859a(view, str, i, null);
    }

    /* renamed from: a */
    public static void m84859a(View view, String str, int i, Map<String, String> map) {
        if (view != null) {
            C67568r a = C42460j.C42461a.m84864a(view);
            f98937i = a;
            f98942n = a.f151308c;
            f98934f = a.f151310e;
            if (str == null) {
                str = "";
            }
            f98933e = str;
            f98935g = i;
            f98936h = map;
        }
    }
}
