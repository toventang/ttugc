package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.b */
public abstract class AbstractC64005b extends AbstractC64118co implements AbstractC63985aq {

    /* renamed from: a */
    public static final C64006a f145157a = new C64006a((byte) 0);

    /* renamed from: b */
    private SparseArray f145158b;

    static {
        Covode.recordClassIndex(75449);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b$a */
    public static final class C64006a {
        static {
            Covode.recordClassIndex(75450);
        }

        private C64006a() {
        }

        public /* synthetic */ C64006a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b$b */
    public static final class C64007b {

        /* renamed from: a */
        static long f145159a = -1;

        /* renamed from: b */
        static String f145160b;

        /* renamed from: c */
        static String f145161c = "";

        /* renamed from: d */
        public static final C64007b f145162d = new C64007b();

        private C64007b() {
        }

        static {
            Covode.recordClassIndex(75451);
        }

        /* renamed from: a */
        public static void m115769a(String str) {
            C89219l.m154721d(str, "");
            f145161c = str;
        }

        /* renamed from: a */
        public static void m115770a(String str, String str2) {
            f145160b = str;
            if (str2 == null) {
                str2 = "";
            }
            f145161c = str2;
            f145159a = SystemClock.uptimeMillis();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f145158b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }
}
