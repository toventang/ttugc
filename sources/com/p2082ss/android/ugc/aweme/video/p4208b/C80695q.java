package com.p2082ss.android.ugc.aweme.video.p4208b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.player.C62890a;

/* renamed from: com.ss.android.ugc.aweme.video.b.q */
public final class C80695q {

    /* renamed from: a */
    public static boolean f180409a;

    /* renamed from: b */
    public static boolean f180410b = true;

    /* renamed from: c */
    private static boolean f180411c;

    static {
        Covode.recordClassIndex(93976);
    }

    /* renamed from: a */
    public static boolean m139908a() {
        if (f180411c) {
            return true;
        }
        return AbstractC80683i.f180385a;
    }

    /* renamed from: b */
    public static int m139909b() {
        return C16048b.m29633a().mo25412a(true, "preloader_type", 2);
    }

    /* renamed from: c */
    public static boolean m139910c() {
        if (!C62890a.f142627a) {
            return C80680f.m139906a();
        }
        if (f180410b) {
            f180409a = C80680f.m139906a();
            f180410b = false;
        }
        return f180409a;
    }
}
