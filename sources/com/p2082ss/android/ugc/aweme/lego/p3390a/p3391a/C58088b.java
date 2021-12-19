package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.b */
public final class C58088b extends AbstractC58137v {

    /* renamed from: a */
    private Map<AbstractC58252n, AbstractC58252n> f132332a = new LinkedHashMap();

    /* renamed from: c */
    private Map<AbstractC58252n, Integer> f132333c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(68154);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final void mo95599b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v
    /* renamed from: c */
    public final EnumC58151ae mo95603c() {
        return EnumC58151ae.BACKGROUND;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.b$b */
    public static final class RunnableC58090b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58088b f132336a;

        /* renamed from: b */
        final /* synthetic */ AbstractC58264w f132337b;

        static {
            Covode.recordClassIndex(68156);
        }

        RunnableC58090b(C58088b bVar, AbstractC58264w wVar) {
            this.f132336a = bVar;
            this.f132337b = wVar;
        }

        public final void run() {
            this.f132336a.mo95602a(this.f132337b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.b$a */
    public static final class RunnableC58089a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58088b f132334a;

        /* renamed from: b */
        final /* synthetic */ AbstractC58264w f132335b;

        static {
            Covode.recordClassIndex(68155);
        }

        RunnableC58089a(C58088b bVar, AbstractC58264w wVar) {
            this.f132334a = bVar;
            this.f132335b = wVar;
        }

        public final void run() {
            MethodCollector.m26663i(6324);
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            int priority = currentThread.getPriority();
            if (((AbstractC58084a) this.f132335b).mo28604d() > 1) {
                Thread currentThread2 = Thread.currentThread();
                C89219l.m154716b(currentThread2, "");
                currentThread2.setPriority(((AbstractC58084a) this.f132335b).mo28604d() + 4);
            }
            this.f132334a.mo95602a(this.f132335b);
            Thread currentThread3 = Thread.currentThread();
            C89219l.m154716b(currentThread3, "");
            currentThread3.setPriority(priority);
            MethodCollector.m26664o(6324);
        }
    }

    /* renamed from: b */
    private void m105005b(AbstractC58264w wVar) {
        ExecutorService a;
        C89219l.m154721d(wVar, "");
        if (wVar instanceof AbstractC58084a) {
            EnumC58149ac e = ((AbstractC58084a) wVar).mo28605e();
            if (e != null) {
                int i = C58091c.f132338a[e.ordinal()];
                if (i == 1) {
                    a = C40780g.m82241a();
                    C89219l.m154716b(a, "");
                } else if (i == 2) {
                    a = C58254p.m105192a(false);
                }
                a.execute(new RunnableC58089a(this, wVar));
                return;
            }
            throw new C89376n();
        }
        C58254p.m105192a(false).execute(new RunnableC58090b(this, wVar));
    }

    /* renamed from: a */
    public final void mo95602a(AbstractC58264w wVar) {
        C58221f.f132578b.mo95695b(wVar);
        AbstractC58252n nVar = this.f132332a.get(wVar);
        if (nVar != null) {
            Integer num = this.f132333c.get(nVar);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 1) {
                    this.f132333c.remove(nVar);
                    Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                    m105005b((AbstractC58264w) nVar);
                } else {
                    this.f132333c.put(nVar, Integer.valueOf(intValue - 1));
                }
            }
            this.f132332a.remove(wVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        for (AbstractC58252n nVar : C58221f.f132578b.mo95689a(EnumC58151ae.BACKGROUND, list)) {
            Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
            m105005b((AbstractC58264w) nVar);
        }
    }

    /* renamed from: a */
    public final void mo95601a(AbstractC58252n nVar, AbstractC58252n nVar2) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(nVar2, "");
        this.f132332a.put(nVar2, nVar);
        if (this.f132333c.get(nVar) == null) {
            this.f132333c.put(nVar, 1);
            return;
        }
        Map<AbstractC58252n, Integer> map = this.f132333c;
        Integer num = map.get(nVar);
        if (num == null) {
            C89219l.m154715b();
        }
        map.put(nVar, Integer.valueOf(num.intValue() + 1));
    }
}
