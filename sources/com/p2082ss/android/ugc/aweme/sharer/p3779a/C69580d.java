package com.p2082ss.android.ugc.aweme.sharer.p3779a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.d */
public final class C69580d {

    /* renamed from: a */
    public static final C69580d f155416a = new C69580d();

    private C69580d() {
    }

    static {
        Covode.recordClassIndex(81926);
    }

    /* renamed from: a */
    public static boolean m122792a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
