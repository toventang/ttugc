package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.e */
public final class C38740e {

    /* renamed from: a */
    public static Set<String> f91484a;

    /* renamed from: b */
    public static Set<Long> f91485b;

    /* renamed from: c */
    public static long f91486c;

    /* renamed from: d */
    public static final C38740e f91487d = new C38740e();

    private C38740e() {
    }

    /* renamed from: a */
    public static final int m78578a() {
        return f91484a.size() + 1;
    }

    /* renamed from: b */
    public static final long m78580b() {
        if (f91486c != 0) {
            return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - f91486c);
        }
        return -1;
    }

    static {
        Covode.recordClassIndex(46281);
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        C89219l.m154716b(synchronizedSet, "");
        f91484a = synchronizedSet;
        Set<Long> synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        C89219l.m154716b(synchronizedSet2, "");
        f91485b = synchronizedSet2;
    }

    /* renamed from: a */
    public static final void m78579a(int i) {
        if (i != 2) {
            f91484a.clear();
            f91485b.clear();
        }
    }
}
