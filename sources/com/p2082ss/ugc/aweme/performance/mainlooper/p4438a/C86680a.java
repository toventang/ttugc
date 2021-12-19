package com.p2082ss.ugc.aweme.performance.mainlooper.p4438a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.aweme.performance.mainlooper.monitor.p4439a.RunnableC86681a;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.a.a */
public final class C86680a {

    /* renamed from: a */
    public static final C86680a f195383a = new C86680a();

    /* renamed from: b */
    private static LinkedList<RunnableC86681a> f195384b = new LinkedList<>();

    /* renamed from: c */
    private static final int f195385c = 4;

    private C86680a() {
    }

    static {
        Covode.recordClassIndex(101909);
    }

    /* renamed from: a */
    public final synchronized RunnableC86681a mo137960a() {
        RunnableC86681a pollFirst;
        MethodCollector.m26663i(8192);
        pollFirst = f195384b.pollFirst();
        if (pollFirst == null) {
            pollFirst = new RunnableC86681a();
        }
        MethodCollector.m26664o(8192);
        return pollFirst;
    }

    /* renamed from: a */
    public final synchronized void mo137961a(RunnableC86681a aVar) {
        MethodCollector.m26663i(8194);
        C89219l.m154719c(aVar, "");
        if (f195384b.size() <= f195385c) {
            aVar.f195387b = "";
            f195384b.addLast(aVar);
        }
        MethodCollector.m26664o(8194);
    }
}
