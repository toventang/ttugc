package com.bytedance.helios.sdk.p1097d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1087a.AbstractC15300c;
import com.bytedance.helios.api.p1087a.C15298b;
import com.bytedance.helios.api.p1088b.AbstractC15315l;
import com.bytedance.helios.api.p1088b.C15302a;
import com.bytedance.helios.api.p1088b.C15304b;
import com.bytedance.helios.api.p1088b.C15314k;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.p1085a.p1086a.C15293f;
import com.bytedance.helios.sdk.C15434f;
import com.bytedance.helios.sdk.p1095c.C15391f;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.d.n */
public abstract class AbstractC15412n extends AbstractC15395b implements AbstractC15300c {

    /* renamed from: d */
    public static final String[] f37629d = {"FORE_START_FORE_END", "FORE_START_BACK_END", "BACK_START_FORE_END", "BACK_START_BACK_END"};

    /* renamed from: e */
    public static final C15413a f37630e = new C15413a((byte) 0);

    /* renamed from: c */
    public final List<C15318n> f37631c = new ArrayList();

    /* renamed from: b */
    public abstract String mo25146b();

    /* renamed from: b */
    public abstract List<Integer> mo25147b(int i);

    /* renamed from: com.bytedance.helios.sdk.d.n$a */
    public static final class C15413a {
        static {
            Covode.recordClassIndex(17665);
        }

        /* renamed from: a */
        public static int m28347a(boolean z, boolean z2) {
            return ((!z ? 1 : 0) << 1) | (!z2 ? 1 : 0);
        }

        /* renamed from: a */
        public static String m28348a(boolean z) {
            return z ? "FORE_START" : "BACK_START";
        }

        private C15413a() {
        }

        public /* synthetic */ C15413a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.helios.api.p1087a.AbstractC15300c
    public List<C15318n> getHoldingResources() {
        return this.f37631c;
    }

    static {
        Covode.recordClassIndex(17664);
    }

    public AbstractC15412n() {
        C15298b.C15299a.m28208a().addResourceChecker(mo25146b(), this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.d.n$b */
    public static final class RunnableC15414b implements Runnable {

        /* renamed from: a */
        private final C15318n f37632a;

        static {
            Covode.recordClassIndex(17666);
        }

        public final void run() {
            List<C15314k> jsbEvents;
            AbstractC15315l lVar = C15320o.f37387g;
            if (lVar == null || (jsbEvents = lVar.getJsbEvents()) == null || !(!jsbEvents.isEmpty())) {
                this.f37632a.f37351C = "";
                return;
            }
            this.f37632a.f37351C = "jsb";
            this.f37632a.f37352D = jsbEvents;
        }

        public RunnableC15414b(C15318n nVar) {
            C89219l.m154719c(nVar, "");
            this.f37632a = nVar;
        }
    }

    /* renamed from: com.bytedance.helios.sdk.d.n$c */
    static final class RunnableC15415c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC15412n f37633a;

        /* renamed from: b */
        final /* synthetic */ List f37634b;

        /* renamed from: c */
        final /* synthetic */ C15397d f37635c;

        /* renamed from: d */
        final /* synthetic */ C15400e f37636d;

        static {
            Covode.recordClassIndex(17667);
        }

        RunnableC15415c(AbstractC15412n nVar, List list, C15397d dVar, C15400e eVar) {
            this.f37633a = nVar;
            this.f37634b = list;
            this.f37635c = dVar;
            this.f37636d = eVar;
        }

        public final void run() {
            int i;
            for (Number number : this.f37634b) {
                number.intValue();
                Object obj = this.f37635c.f37585b;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                this.f37633a.mo25151a((long) i, this.f37634b, this.f37636d, this.f37635c, null);
            }
        }
    }

    /* renamed from: a */
    public long mo25150a(C15397d dVar) {
        int i;
        C89219l.m154719c(dVar, "");
        Object obj = dVar.f37585b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (long) i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25155b(C15397d dVar) {
        C89219l.m154719c(dVar, "");
        for (T t : this.f37631c) {
            if (t.f37350B == null && t.f37371q == mo25150a(dVar)) {
                t.f37350B = new C15304b(dVar.f37588e, 2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25154a(AbstractC15411m mVar) {
        C89219l.m154719c(mVar, "");
        String a = mVar.mo25129a();
        String b = mVar.mo25130b();
        int[] c = mVar.mo25131c();
        String[] d = mVar.mo25132d();
        int[] e = mVar.mo25145e();
        int length = c.length;
        for (int i = 0; i < length; i++) {
            mo25134a(c[i], new C15400e(a, b, c[i], d[i], e[i]));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25152a(C15400e eVar, C15397d dVar, Throwable th) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        if (eVar.f37596b == 0) {
            mo25156b(eVar, dVar, th);
        } else if (eVar.f37596b == 1) {
            mo25157c(eVar, dVar, th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25153a(C15400e eVar, C15397d dVar, List<Integer> list) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(list, "");
        HandlerThreadC15486g.m28499b().post(new RunnableC15415c(this, list, dVar, eVar));
    }

    /* renamed from: c */
    public void mo25157c(C15400e eVar, C15397d dVar, Throwable th) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        long a = mo25150a(dVar);
        List<Integer> b = mo25147b(eVar.f37597c);
        StringBuilder append = new StringBuilder("monitorTrigger factors=").append(eVar.f37597c).append(" calledTime=").append(dVar.f37588e).append(' ').append("runtimeObjHashcode=").append(a).append(" eventCurrentPageHashCode=");
        C15434f a2 = C15434f.m28386a();
        C89219l.m154709a((Object) a2, "");
        C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", append.append(a2.mo25172f()).toString(), (String) null, 12);
        mo25151a(a, b, eVar, dVar, th);
    }

    /* renamed from: b */
    public void mo25156b(C15400e eVar, C15397d dVar, Throwable th) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(dVar, "");
        if (mo25150a(dVar) != 0) {
            C15318n a = dVar.mo25140a(th);
            C15434f a2 = C15434f.m28386a();
            C89219l.m154709a((Object) a2, "");
            boolean c = a2.mo25169c();
            long a3 = mo25150a(dVar);
            a.mo24847a(mo25146b());
            a.mo24854f(C15413a.m28348a(c));
            a.f37375u.add("pair_monitor");
            a.f37371q = a3;
            a.f37374t = 0;
            a.f37368n.put("runtimeObjHashCode", Long.valueOf(a3));
            a.f37349A = new C15302a(C15298b.C15299a.m28208a().getAnchorTaskName(), 3);
            HandlerThreadC15486g.m28499b().postDelayed(new RunnableC15414b(a), 50);
            Iterator<T> it = this.f37631c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (a.f37371q == next.f37371q) {
                    if (next != null) {
                        this.f37631c.remove(next);
                    }
                }
            }
            this.f37631c.add(a);
            C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "monitorTrigger factors=" + a.f37356b + " calledTime=" + a.f37366l + ' ' + "runtimeObjHashcode=" + a.f37371q + " eventCurrentPageHashCode=" + a.f37365k, (String) null, 12);
            C15391f.m28290a(a);
        }
    }

    /* renamed from: a */
    public final void mo25151a(long j, List<Integer> list, C15400e eVar, C15397d dVar, Throwable th) {
        for (int size = this.f37631c.size() - 1; size >= 0; size--) {
            C15318n nVar = this.f37631c.get(size);
            if (nVar.f37371q == j && list.contains(Integer.valueOf(nVar.f37356b))) {
                C15484f.m28491a("Helios-Log-Monitor-Ability-Api-Call", "removeEndApiCallTrace eventId=" + dVar.f37587d + " eventName=" + nVar.f37357c + ' ' + "calledTime=" + dVar.f37588e + " eventStartTime=" + nVar.f37366l, (String) null, 12);
                C15434f a = C15434f.m28386a();
                C89219l.m154709a((Object) a, "");
                int a2 = C15413a.m28347a(!nVar.f37362h, !a.mo25170d());
                C15304b bVar = nVar.f37350B;
                if (bVar != null) {
                    bVar.f37324b = dVar.f37588e;
                }
                nVar.f37356b = eVar.f37597c;
                String str = eVar.f37598d;
                C89219l.m154709a((Object) str, "");
                nVar.mo24849b(str);
                nVar.mo24854f(f37629d[a2]);
                StringBuilder append = new StringBuilder().append(nVar.f37360f);
                if (th == null) {
                    C89219l.m154707a();
                }
                nVar.mo24851d(append.append(C15293f.m28200a(th)).toString());
                nVar.f37372r = dVar.f37589f;
                nVar.f37374t = 1;
                C15391f.m28290a(nVar);
                this.f37631c.remove(size);
            }
        }
    }
}
