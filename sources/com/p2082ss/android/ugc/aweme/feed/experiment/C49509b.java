package com.p2082ss.android.ugc.aweme.feed.experiment;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.b */
public final class C49509b {

    /* renamed from: a */
    public static final int f113872a = 1;

    /* renamed from: b */
    public static final C49509b f113873b = new C49509b();

    /* renamed from: c */
    private static final int f113874c = 2;

    /* renamed from: d */
    private static final int f113875d = 3;

    /* renamed from: e */
    private static final int f113876e = 4;

    /* renamed from: f */
    private static final int f113877f = 5;

    private C49509b() {
    }

    /* renamed from: d */
    private static int m92746d() {
        return C16048b.m29633a().mo25412a(true, "audio_mode", 1);
    }

    static {
        Covode.recordClassIndex(58323);
    }

    /* renamed from: b */
    public static boolean m92744b() {
        if (m92746d() == f113875d || m92746d() == f113877f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m92745c() {
        if (m92746d() == f113874c || m92746d() == f113875d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m92743a() {
        String str;
        if (m92746d() == f113872a) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        String str3 = null;
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str = str2.toUpperCase(Locale.ROOT);
            C89219l.m154716b(str, "");
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) str, (Object) "OPPO"))) {
            return false;
        }
        String str4 = Build.MANUFACTURER;
        if (str4 != null) {
            Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
            str3 = str4.toUpperCase(Locale.ROOT);
            C89219l.m154716b(str3, "");
        }
        if (!C89219l.m154714a((Object) str3, (Object) "REALME")) {
            return true;
        }
        return false;
    }
}
