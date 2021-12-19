package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b */
public final class C57864b implements AbstractC33485al {

    /* renamed from: a */
    public static final C57864b f131929a = new C57864b();

    /* renamed from: b */
    private static boolean f131930b;

    /* renamed from: c */
    private static final CopyOnWriteArrayList<AbstractC33485al> f131931c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static int f131932d;

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b$b */
    public static final class C57866b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C57866b f131934a = new C57866b();

        static {
            Covode.recordClassIndex(67876);
        }

        C57866b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C57864b() {
    }

    static {
        Covode.recordClassIndex(67874);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final synchronized void mo59568a() {
        MethodCollector.m26663i(10164);
        mo95172c();
        int i = f131932d + 1;
        f131932d = i;
        if (i == 1) {
            Iterator<T> it = f131931c.iterator();
            while (it.hasNext()) {
                it.next().mo59568a();
            }
        }
        MethodCollector.m26664o(10164);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final synchronized void mo59569b() {
        MethodCollector.m26663i(10165);
        mo95172c();
        int i = f131932d - 1;
        f131932d = i;
        if (i == 0) {
            Iterator<T> it = f131931c.iterator();
            while (it.hasNext()) {
                it.next().mo59569b();
            }
        }
        MethodCollector.m26664o(10165);
    }

    /* renamed from: c */
    public final synchronized void mo95172c() {
        MethodCollector.m26663i(10011);
        if (f131930b) {
            MethodCollector.m26664o(10011);
            return;
        }
        if (C29843f.m60129a(C17867d.m33078a())) {
            m104615a(new C57872c());
        }
        f131930b = true;
        MethodCollector.m26664o(10011);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b$a */
    public static final class C57865a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C57865a f131933a = new C57865a();

        static {
            Covode.recordClassIndex(67875);
        }

        C57865a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57864b.f131929a.mo59568a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b$c */
    public static final class C57867c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C57867c f131935a = new C57867c();

        static {
            Covode.recordClassIndex(67877);
        }

        C57867c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57864b.f131929a.mo59569b();
        }
    }

    /* renamed from: a */
    private synchronized void m104615a(AbstractC33485al alVar) {
        MethodCollector.m26663i(10012);
        C89219l.m154721d(alVar, "");
        CopyOnWriteArrayList<AbstractC33485al> copyOnWriteArrayList = f131931c;
        if (!copyOnWriteArrayList.contains(alVar)) {
            copyOnWriteArrayList.add(alVar);
        }
        MethodCollector.m26664o(10012);
    }
}
