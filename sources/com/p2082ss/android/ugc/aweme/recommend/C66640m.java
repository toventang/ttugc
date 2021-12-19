package com.p2082ss.android.ugc.aweme.recommend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.m */
public final class C66640m {

    /* renamed from: a */
    public final WeakReference<? extends Activity> f149802a;

    /* renamed from: b */
    public final String f149803b;

    /* renamed from: c */
    public final String f149804c;

    /* renamed from: d */
    public final boolean f149805d;

    static {
        Covode.recordClassIndex(78198);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66640m)) {
            return false;
        }
        C66640m mVar = (C66640m) obj;
        return C89219l.m154714a(this.f149802a, mVar.f149802a) && C89219l.m154714a(this.f149803b, mVar.f149803b) && C89219l.m154714a(this.f149804c, mVar.f149804c) && this.f149805d == mVar.f149805d;
    }

    public final int hashCode() {
        WeakReference<? extends Activity> weakReference = this.f149802a;
        int i = 0;
        int hashCode = (weakReference != null ? weakReference.hashCode() : 0) * 31;
        String str = this.f149803b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f149804c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f149805d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "RecommendUserDialogParams(activityRef=" + this.f149802a + ", enterFrom=" + this.f149803b + ", previousPage=" + this.f149804c + ", isColdBoot=" + this.f149805d + ")";
    }

    private C66640m(WeakReference<? extends Activity> weakReference, String str, String str2) {
        C89219l.m154721d(weakReference, "");
        this.f149802a = weakReference;
        this.f149803b = str;
        this.f149804c = str2;
        this.f149805d = false;
    }

    public /* synthetic */ C66640m(WeakReference weakReference, String str, String str2, byte b) {
        this(weakReference, str, str2);
    }
}
