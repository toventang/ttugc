package com.p1795d.p1796a.p1797a.p1798a.p1804e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;

/* renamed from: com.d.a.a.a.e.d */
public final class C23801d {
    static {
        Covode.recordClassIndex(27909);
    }

    /* renamed from: a */
    public static void m44991a(C23781l lVar) {
        if (lVar.f56262e) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public static void m44992a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m44993a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m44994b(C23781l lVar) {
        m44996d(lVar);
        m44991a(lVar);
    }

    /* renamed from: c */
    public static void m44995c(C23781l lVar) {
        if (!lVar.mo39247e()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: d */
    private static void m44996d(C23781l lVar) {
        if (!lVar.f56261d) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
