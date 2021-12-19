package com.p2082ss.android.ugc.aweme.commercialize.p2534ad;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.c */
public final class C37592c implements AbstractC33485al {

    /* renamed from: a */
    public static String f88852a = "no_ad";

    /* renamed from: b */
    public static final C37592c f88853b = new C37592c();

    /* renamed from: c */
    private static final HashMap<String, Integer> f88854c = new HashMap<>();

    /* renamed from: d */
    private static int f88855d;

    /* renamed from: e */
    private static long f88856e;

    /* renamed from: f */
    private static int f88857f;

    /* renamed from: g */
    private static boolean f88858g;

    /* renamed from: h */
    private static long f88859h;

    /* renamed from: i */
    private static long f88860i;

    private C37592c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        if (!f88858g) {
            f88856e = System.currentTimeMillis();
        }
    }

    static {
        Covode.recordClassIndex(45009);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        f88857f = 0;
        f88856e = 0;
        f88859h = 0;
        f88860i = 0;
        if (f88858g) {
            f88855d = 0;
            f88852a = "feedad";
        } else {
            f88855d = 1;
            f88852a = "no_ad";
        }
        f88854c.clear();
    }
}
