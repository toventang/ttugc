package com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.q */
public final class C49560q {

    /* renamed from: a */
    public static Map<AbstractC49544a, Runnable> f113987a = new HashMap();

    /* renamed from: b */
    public static Set<AbstractC49544a> f113988b = new LinkedHashSet();

    /* renamed from: c */
    public static Set<AbstractC49544a> f113989c = new LinkedHashSet();

    /* renamed from: d */
    public static final C49560q f113990d = new C49560q();

    private C49560q() {
    }

    static {
        Covode.recordClassIndex(58401);
    }

    /* renamed from: b */
    public static boolean m92875b(AbstractC49544a aVar) {
        C89219l.m154721d(aVar, "");
        return f113988b.contains(aVar);
    }

    /* renamed from: c */
    public static boolean m92876c(AbstractC49544a aVar) {
        C89219l.m154721d(aVar, "");
        return f113989c.contains(aVar);
    }

    /* renamed from: d */
    public static void m92877d(AbstractC49544a aVar) {
        C89219l.m154721d(aVar, "");
        f113989c.add(aVar);
    }

    /* renamed from: a */
    public static void m92874a(AbstractC49544a aVar) {
        C89219l.m154721d(aVar, "");
        Runnable remove = f113987a.remove(aVar);
        if (remove != null) {
            remove.run();
        }
        f113988b.add(aVar);
        f113989c.remove(aVar);
    }
}
