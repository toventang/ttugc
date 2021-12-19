package com.p2082ss.android.ugc.aweme.p2433ca;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ca.g */
public final class C35350g {

    /* renamed from: a */
    public static final List<Runnable> f83388a = new ArrayList();

    /* renamed from: b */
    public static final C35350g f83389b = new C35350g();

    private C35350g() {
    }

    static {
        Covode.recordClassIndex(42518);
    }

    /* renamed from: a */
    public static void m72349a() {
        Iterator<T> it = f83388a.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        f83388a.clear();
    }

    /* renamed from: a */
    public static void m72350a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        f83388a.add(runnable);
    }
}
