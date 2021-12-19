package com.bytedance.sdk.bdlynx.p1687e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22599d;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22603f;
import com.bytedance.sdk.bdlynx.p1677a.p1680c.C22607a;
import com.bytedance.sdk.bdlynx.p1685c.AbstractC22620b;
import com.bytedance.sdk.bdlynx.p1685c.C22618a;
import com.bytedance.sdk.bdlynx.p1687e.p1688a.C22636a;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.AbstractC22642e;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22638a;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22643f;
import com.lynx.tasm.LynxEnv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.sdk.bdlynx.e.c */
public final class C22646c implements AbstractC22637b {

    /* renamed from: d */
    public static final C22647a f53488d = new C22647a((byte) 0);

    /* renamed from: a */
    public final C22659g f53489a = new C22659g();

    /* renamed from: b */
    public final C22636a f53490b = new C22636a();

    /* renamed from: c */
    AbstractC22656d f53491c = new C22634a();

    /* renamed from: e */
    private final LinkedList<AbstractC22642e> f53492e = new LinkedList<>();

    static {
        Covode.recordClassIndex(26463);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.e.c$a */
    public static final class C22647a {
        static {
            Covode.recordClassIndex(26464);
        }

        private C22647a() {
        }

        public /* synthetic */ C22647a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.bdlynx.e.c$c */
    public static final class RunnableC22649c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22646c f53500a;

        /* renamed from: b */
        final /* synthetic */ String f53501b;

        /* renamed from: c */
        final /* synthetic */ String f53502c;

        /* renamed from: d */
        final /* synthetic */ C22643f f53503d;

        /* renamed from: e */
        final /* synthetic */ AbstractC22657e f53504e;

        /* renamed from: f */
        final /* synthetic */ AbstractC22620b f53505f;

        static {
            Covode.recordClassIndex(26466);
        }

        RunnableC22649c(C22646c cVar, String str, String str2, C22643f fVar, AbstractC22657e eVar, AbstractC22620b bVar) {
            this.f53500a = cVar;
            this.f53501b = str;
            this.f53502c = str2;
            this.f53503d = fVar;
            this.f53504e = eVar;
            this.f53505f = bVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            T t;
            C22646c cVar = this.f53500a;
            String str = this.f53501b;
            String str2 = this.f53502c;
            C22643f fVar = this.f53503d;
            C226501 r11 = new AbstractC22657e(this) {
                /* class com.bytedance.sdk.bdlynx.p1687e.C22646c.RunnableC22649c.C226501 */

                /* renamed from: a */
                public boolean f53506a;

                /* renamed from: b */
                final /* synthetic */ RunnableC22649c f53507b;

                static {
                    Covode.recordClassIndex(26467);
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$a */
                static final class RunnableC22651a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C226501 f53508a;

                    /* renamed from: b */
                    final /* synthetic */ int f53509b;

                    static {
                        Covode.recordClassIndex(26468);
                    }

                    RunnableC22651a(C226501 r1, int i) {
                        this.f53508a = r1;
                        this.f53509b = i;
                    }

                    public final void run() {
                        this.f53508a.f53507b.f53504e.mo36901a(this.f53509b);
                    }
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$b */
                static final class RunnableC22652b implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C226501 f53510a;

                    /* renamed from: b */
                    final /* synthetic */ C22638a f53511b;

                    static {
                        Covode.recordClassIndex(26469);
                    }

                    RunnableC22652b(C226501 r1, C22638a aVar) {
                        this.f53510a = r1;
                        this.f53511b = aVar;
                    }

                    public final void run() {
                        this.f53510a.f53507b.f53504e.mo36926b_(this.f53511b);
                        C22599d.m42633a("TemplateProvider", "getTemplate onLocalSuccess: groupId=" + this.f53510a.f53507b.f53501b + ", cardId=" + this.f53510a.f53507b.f53502c);
                    }
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$c */
                static final class RunnableC22653c implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C226501 f53512a;

                    /* renamed from: b */
                    final /* synthetic */ C22638a f53513b;

                    static {
                        Covode.recordClassIndex(26470);
                    }

                    RunnableC22653c(C226501 r1, C22638a aVar) {
                        this.f53512a = r1;
                        this.f53513b = aVar;
                    }

                    public final void run() {
                        C22599d.m42633a("TemplateProvider", "getTemplate onMemSuccess: groupId=" + this.f53512a.f53507b.f53501b + ", cardId=" + this.f53512a.f53507b.f53502c);
                        this.f53512a.f53507b.f53504e.mo36925a_(this.f53513b);
                    }
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$d */
                static final class RunnableC22654d implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C226501 f53514a;

                    /* renamed from: b */
                    final /* synthetic */ C22638a f53515b;

                    static {
                        Covode.recordClassIndex(26471);
                    }

                    RunnableC22654d(C226501 r1, C22638a aVar) {
                        this.f53514a = r1;
                        this.f53515b = aVar;
                    }

                    public final void run() {
                        this.f53514a.f53507b.f53504e.mo36927c(this.f53515b);
                        C22599d.m42633a("TemplateProvider", "getTemplate onRemoteSuccess: groupId=" + this.f53514a.f53507b.f53501b + ", cardId=" + this.f53514a.f53507b.f53502c);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f53507b = r1;
                }

                @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
                /* renamed from: a_ */
                public final void mo36925a_(C22638a aVar) {
                    C89219l.m154719c(aVar, "");
                    C22603f.m42637a(new RunnableC22653c(this, aVar));
                    m42709d(aVar);
                }

                @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
                /* renamed from: b_ */
                public final void mo36926b_(C22638a aVar) {
                    C89219l.m154719c(aVar, "");
                    C22603f.m42637a(new RunnableC22652b(this, aVar));
                    m42709d(aVar);
                }

                @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
                /* renamed from: c */
                public final void mo36927c(C22638a aVar) {
                    C89219l.m154719c(aVar, "");
                    C22603f.m42637a(new RunnableC22654d(this, aVar));
                    m42709d(aVar);
                }

                /* renamed from: d */
                private final void m42709d(C22638a aVar) {
                    if (!this.f53506a) {
                        this.f53507b.f53500a.f53489a.mo36932a("success");
                        this.f53507b.f53505f.mo36880a(this.f53507b.f53500a.f53489a);
                        aVar.f53460a = this.f53507b.f53505f;
                        this.f53506a = true;
                    }
                }

                @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
                /* renamed from: a */
                public final void mo36901a(int i) {
                    C22603f.m42637a(new RunnableC22651a(this, i));
                    this.f53507b.f53500a.f53489a.mo36932a("fail");
                    this.f53507b.f53505f.mo36880a(this.f53507b.f53500a.f53489a);
                    C22599d.m42633a("TemplateProvider", "getTemplate fail: groupId=" + this.f53507b.f53501b + ", cardId=" + this.f53507b.f53502c + ", errCode=" + i);
                }
            };
            LynxEnv b = LynxEnv.m56706b();
            C89219l.m154709a((Object) b, "");
            if (!b.mo48573f()) {
                r11.mo36901a(3);
                return;
            }
            C89233z.C89238e eVar = new C89233z.C89238e();
            if (fVar != null) {
                z = fVar.f53479c;
                z2 = fVar.f53480d;
            } else {
                z = true;
                z2 = true;
            }
            String a = cVar.f53491c.mo36916a(str, str2);
            List<String> list = null;
            if (z) {
                C22636a aVar = cVar.f53490b;
                C89219l.m154719c(a, "");
                t = (T) aVar.f53458a.get(a);
            } else {
                t = null;
            }
            eVar.element = t;
            if (eVar.element != null) {
                C22659g gVar = cVar.f53489a;
                gVar.f53523b = true;
                T t2 = eVar.element;
                if (t2 == null) {
                    C89219l.m154707a();
                }
                gVar.f53525d = t2.f53464e.length;
                C22599d.m42633a("TemplateProvider", "getTemplate: hit cache: key=".concat(String.valueOf(str)));
                r11.mo36925a_(eVar.element);
                return;
            }
            if (fVar != null) {
                list = fVar.f53478b;
            }
            List<AbstractC22642e> a2 = cVar.mo36922a(true, list);
            C89233z.C89234a aVar2 = new C89233z.C89234a();
            aVar2.element = false;
            Iterator<AbstractC22642e> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC22642e next = it.next();
                eVar.element = (T) next.mo36921b();
                if (eVar.element != null) {
                    C22599d.m42633a("TemplateProvider", "use preload template success, provider=" + next.mo36920a());
                    if (z2) {
                        cVar.f53490b.mo36917a(a, eVar.element);
                    }
                    C22659g gVar2 = cVar.f53489a;
                    gVar2.mo36933b(next.mo36920a());
                    gVar2.f53525d = eVar.element.f53464e.length;
                    aVar2.element = true;
                    r11.mo36926b_(eVar.element);
                    if (fVar != null && !fVar.f53481e) {
                        return;
                    }
                }
            }
            if (aVar2.element) {
                C22599d.m42633a("TemplateProvider", "use preload template success, but still fetch");
            } else {
                C22599d.m42633a("TemplateProvider", "use preload template fail, try runtime");
            }
            cVar.mo36923a(new LinkedList<>(a2), str, str2, fVar, new C22655d(cVar, z2, a, r11, aVar2));
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.e.c$d */
    public static final class C22655d implements AbstractC22657e {

        /* renamed from: a */
        final /* synthetic */ C22646c f53516a;

        /* renamed from: b */
        final /* synthetic */ boolean f53517b;

        /* renamed from: c */
        final /* synthetic */ String f53518c;

        /* renamed from: d */
        final /* synthetic */ AbstractC22657e f53519d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89234a f53520e;

        static {
            Covode.recordClassIndex(26472);
        }

        @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
        /* renamed from: a */
        public final void mo36901a(int i) {
            if (!this.f53520e.element) {
                this.f53519d.mo36901a(i);
            }
        }

        @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
        /* renamed from: a_ */
        public final void mo36925a_(C22638a aVar) {
            C89219l.m154719c(aVar, "");
            throw new IllegalStateException();
        }

        @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
        /* renamed from: b_ */
        public final void mo36926b_(C22638a aVar) {
            C89219l.m154719c(aVar, "");
            throw new IllegalStateException();
        }

        @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
        /* renamed from: c */
        public final void mo36927c(C22638a aVar) {
            C89219l.m154719c(aVar, "");
            if (this.f53517b) {
                this.f53516a.f53490b.mo36917a(this.f53518c, aVar);
            }
            this.f53519d.mo36927c(aVar);
        }

        C22655d(C22646c cVar, boolean z, String str, AbstractC22657e eVar, C89233z.C89234a aVar) {
            this.f53516a = cVar;
            this.f53517b = z;
            this.f53518c = str;
            this.f53519d = eVar;
            this.f53520e = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.bdlynx.e.c$b */
    public static final class C22648b extends AbstractC89220m implements AbstractC89172b<C22638a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C22646c f53493a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22642e f53494b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22657e f53495c;

        /* renamed from: d */
        final /* synthetic */ LinkedList f53496d;

        /* renamed from: e */
        final /* synthetic */ String f53497e;

        /* renamed from: f */
        final /* synthetic */ String f53498f;

        /* renamed from: g */
        final /* synthetic */ C22643f f53499g;

        static {
            Covode.recordClassIndex(26465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22648b(C22646c cVar, AbstractC22642e eVar, AbstractC22657e eVar2, LinkedList linkedList, String str, String str2, C22643f fVar) {
            super(1);
            this.f53493a = cVar;
            this.f53494b = eVar;
            this.f53495c = eVar2;
            this.f53496d = linkedList;
            this.f53497e = str;
            this.f53498f = str2;
            this.f53499g = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22638a aVar) {
            C22638a aVar2 = aVar;
            if (aVar2 != null) {
                C22659g gVar = this.f53493a.f53489a;
                gVar.mo36933b(this.f53494b.mo36920a());
                gVar.f53525d = aVar2.f53464e.length;
                C22599d.m42633a("TemplateProvider", "load template success from provider: " + this.f53494b.mo36920a());
                AbstractC22657e eVar = this.f53495c;
                if (eVar != null) {
                    eVar.mo36927c(aVar2);
                }
            } else {
                this.f53493a.mo36923a(this.f53496d, this.f53497e, this.f53498f, this.f53499g, this.f53495c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final synchronized List<AbstractC22642e> mo36922a(Boolean bool, List<String> list) {
        MethodCollector.m26663i(7703);
        ArrayList arrayList = this.f53492e;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : arrayList) {
                if (list.contains(t.mo36920a())) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        }
        if (C89219l.m154714a((Object) bool, (Object) false)) {
            List<AbstractC22642e> g = C89070n.m154584g((Iterable) arrayList);
            MethodCollector.m26664o(7703);
            return g;
        }
        MethodCollector.m26664o(7703);
        return arrayList;
    }

    @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22637b
    /* renamed from: a */
    public final void mo36918a(String str, String str2, C22643f fVar, AbstractC22657e eVar) {
        String str3;
        C22643f fVar2 = fVar;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(eVar, "");
        C22607a aVar = new C22607a(str, str2);
        if (fVar2 != null) {
            str3 = fVar2.f53483g;
        } else {
            str3 = null;
        }
        AbstractC22620b a = C22618a.C22619a.m42666a(aVar, str3);
        if (fVar2 == null) {
            fVar2 = new C22643f();
        }
        fVar2.f53484h = a;
        a.mo36878a();
        C22603f.m42638b(new RunnableC22649c(this, str, str2, fVar2, eVar, a));
    }

    /* renamed from: a */
    public final void mo36923a(LinkedList<AbstractC22642e> linkedList, String str, String str2, C22643f fVar, AbstractC22657e eVar) {
        if (linkedList.isEmpty()) {
            C22599d.m42633a("TemplateProvider", "load template from all provider failed");
            if (eVar != null) {
                eVar.mo36901a(5);
                return;
            }
            return;
        }
        LinkedList linkedList2 = new LinkedList(linkedList);
        new C22648b(this, (AbstractC22642e) linkedList2.removeFirst(), eVar, linkedList2, str, str2, fVar);
    }
}
