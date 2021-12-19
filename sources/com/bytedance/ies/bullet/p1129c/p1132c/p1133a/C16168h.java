package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16194r;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16178i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1138b.AbstractC16252a;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.c.c.a.h */
public final class C16168h implements AbstractC16187m, AbstractC16576j {

    /* renamed from: e */
    public static final AbstractC89172b<String, List<String>> f38934e = C16171c.f38948a;

    /* renamed from: f */
    public static final AbstractC89172b<List<String>, String> f38935f = C16170b.f38947a;

    /* renamed from: g */
    public static final C16169a f38936g = new C16169a((byte) 0);

    /* renamed from: a */
    final Map<String, AbstractC16188n> f38937a = new LinkedHashMap();

    /* renamed from: b */
    AbstractC89172b<? super AbstractC16192q, C89391z> f38938b;

    /* renamed from: c */
    public final AbstractC89172b<C16248b, List<AbstractC16192q>> f38939c;

    /* renamed from: d */
    public final C16248b f38940d;

    /* renamed from: h */
    private final Map<String, AbstractC16192q> f38941h = new LinkedHashMap();

    /* renamed from: i */
    private final AbstractC89244h f38942i = C89250i.m154773a((AbstractC89171a) C16172d.f38949a);

    /* renamed from: j */
    private boolean f38943j;

    /* renamed from: k */
    private boolean f38944k;

    /* renamed from: l */
    private final AbstractC89244h f38945l = C89250i.m154773a((AbstractC89171a) new C16177i(this));

    /* renamed from: m */
    private AbstractC16252a<C16162c> f38946m;

    /* renamed from: f */
    private final List<C16163d> m30024f() {
        return (List) this.f38942i.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return (C16587q) this.f38945l.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$a */
    public static final class C16169a {
        static {
            Covode.recordClassIndex(18462);
        }

        private C16169a() {
        }

        public /* synthetic */ C16169a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: b */
    public final Map<String, AbstractC16188n> mo25736b() {
        return this.f38937a;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: d */
    public final boolean mo25738d() {
        return this.f38943j;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: e */
    public final AbstractC16252a<C16162c> mo25739e() {
        return this.f38946m;
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$d */
    static final class C16172d extends AbstractC89220m implements AbstractC89171a<List<C16163d>> {

        /* renamed from: a */
        public static final C16172d f38949a = new C16172d();

        static {
            Covode.recordClassIndex(18465);
        }

        C16172d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C16163d> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$i */
    static final class C16177i extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ C16168h f38958a;

        static {
            Covode.recordClassIndex(18470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16177i(C16168h hVar) {
            super(0);
            this.f38958a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q((AbstractC16652m) this.f38958a.f38940d.mo25832c(AbstractC16652m.class), "BridgeRegistry");
        }
    }

    static {
        Covode.recordClassIndex(18461);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        for (Map.Entry<String, AbstractC16188n> entry : this.f38937a.entrySet()) {
            entry.getValue().mo25721a();
        }
        for (Map.Entry<String, AbstractC16192q> entry2 : this.f38941h.entrySet()) {
            entry2.getValue().mo25721a();
        }
        this.f38937a.clear();
        this.f38941h.clear();
        this.f38943j = true;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: c */
    public final Map<String, AbstractC16192q> mo25737c() {
        Map<String, AbstractC16192q> map = this.f38941h;
        if (!this.f38944k) {
            this.f38944k = true;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (T t : this.f38939c.invoke(this.f38940d)) {
                StringBuilder append = sb.append(t.mo25752d());
                C89219l.m154709a((Object) append, "");
                C89361p.m154859b(append);
                AbstractC16192q qVar = this.f38941h.get(t.mo25752d());
                if (qVar != null) {
                    StringBuilder append2 = sb2.append(qVar.mo25752d());
                    C89219l.m154709a((Object) append2, "");
                    C89361p.m154859b(append2);
                    qVar.mo25721a();
                }
                this.f38941h.put(t.mo25752d(), t);
            }
            AbstractC16576j.C16578b.m30778a(this, "start to register bridges: ".concat(String.valueOf(sb)), EnumC16586p.D, null, 4);
            AbstractC16576j.C16578b.m30778a(this, "these bridges has been registered! use the newer one. replaced list: ".concat(String.valueOf(sb2)), EnumC16586p.W, null, 4);
            for (T t2 : m30024f()) {
                m30023a(t2.f38921a, t2.f38922b);
            }
        }
        return map;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: a */
    public final void mo25733a(AbstractC89172b<? super AbstractC16192q, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f38938b = bVar;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: a */
    public final AbstractC16192q mo25730a(String str) {
        C89219l.m154719c(str, "");
        return mo25737c().get(str);
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$b */
    static final class C16170b extends AbstractC89220m implements AbstractC89172b<List<? extends String>, String> {

        /* renamed from: a */
        public static final C16170b f38947a = new C16170b();

        static {
            Covode.recordClassIndex(18463);
        }

        C16170b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            C89219l.m154719c(list2, "");
            return C89070n.m154551a(list2, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$c */
    static final class C16171c extends AbstractC89220m implements AbstractC89172b<String, List<? extends String>> {

        /* renamed from: a */
        public static final C16171c f38948a = new C16171c();

        static {
            Covode.recordClassIndex(18464);
        }

        C16171c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<? extends String> invoke(String str) {
            String str2 = str;
            C89219l.m154719c(str2, "");
            return C89361p.m154915b(str2, new String[]{"/"});
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$e */
    static final class C16173e extends AbstractC89220m implements AbstractC89172b<C16162c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89188r f38950a;

        static {
            Covode.recordClassIndex(18466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16173e(AbstractC89188r rVar) {
            super(1);
            this.f38950a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16162c cVar) {
            C16162c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            this.f38950a.mo8774a(cVar2.f38917a, cVar2.f38918b, cVar2.f38919c, cVar2.f38920d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$f */
    static final class C16174f extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89188r f38951a;

        /* renamed from: b */
        final /* synthetic */ String f38952b;

        /* renamed from: c */
        final /* synthetic */ Object f38953c;

        /* renamed from: d */
        final /* synthetic */ AbstractC16192q.AbstractC16193a f38954d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f38955e;

        static {
            Covode.recordClassIndex(18467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16174f(AbstractC89188r rVar, String str, Object obj, AbstractC16192q.AbstractC16193a aVar, AbstractC89172b bVar) {
            super(1);
            this.f38951a = rVar;
            this.f38952b = str;
            this.f38953c = obj;
            this.f38954d = aVar;
            this.f38955e = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154719c(th, "");
            this.f38951a.mo8774a(this.f38952b, this.f38953c, this.f38954d, this.f38955e);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: a */
    public final void mo25731a(AbstractC16187m mVar) {
        List b;
        C89219l.m154719c(mVar, "");
        for (Map.Entry<String, AbstractC16188n> entry : mVar.mo25736b().entrySet()) {
            if (this.f38937a.containsKey(entry.getKey())) {
                AbstractC16188n nVar = this.f38937a.get(entry.getKey());
                if (nVar != null) {
                    nVar.mo25740a(entry.getValue(), false);
                }
            } else {
                this.f38937a.put(entry.getKey(), entry.getValue());
            }
        }
        m30024f().add(new C16163d(mVar));
        AbstractC16252a<C16162c> aVar = this.f38946m;
        if (aVar == null) {
            this.f38946m = mVar.mo25739e();
            return;
        }
        AbstractC16252a<C16162c> e = mVar.mo25739e();
        if (!(e == null || (b = C89070n.m154522b(aVar, e)) == null)) {
            this.f38946m = new C16181j(b);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: a */
    public final void mo25732a(AbstractC16192q qVar) {
        C89219l.m154719c(qVar, "");
        AbstractC16576j.C16578b.m30778a(this, "register bridge method named " + qVar.mo25752d() + '.', EnumC16586p.D, null, 4);
        if (this.f38941h.containsKey(qVar.mo25752d())) {
            AbstractC16576j.C16578b.m30778a(this, "bridge method named " + qVar.mo25752d() + " has been registered! use the newer one.", EnumC16586p.W, null, 4);
            AbstractC16192q qVar2 = this.f38941h.get(qVar.mo25752d());
            if (qVar2 != null) {
                qVar2.mo25721a();
            }
        }
        this.f38941h.put(qVar.mo25752d(), qVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: a */
    public final void mo25734a(AbstractC89183m<? super String, ? super AbstractC16192q, C89391z> mVar) {
        C89219l.m154719c(mVar, "");
        C16176h hVar = new C16176h(mVar);
        C89219l.m154719c(hVar, "");
        for (Map.Entry<String, AbstractC16188n> entry : this.f38937a.entrySet()) {
            entry.getValue().mo25741a(hVar);
        }
        for (Map.Entry<String, AbstractC16192q> entry2 : mo25737c().entrySet()) {
            hVar.invoke(C89086z.INSTANCE, entry2.getValue());
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$h */
    static final class C16176h extends AbstractC89220m implements AbstractC89183m<List<? extends AbstractC16188n>, AbstractC16192q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f38957a;

        static {
            Covode.recordClassIndex(18469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16176h(AbstractC89183m mVar) {
            super(2);
            this.f38957a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(List<? extends AbstractC16188n> list, AbstractC16192q qVar) {
            String invoke;
            List<? extends AbstractC16188n> list2 = list;
            AbstractC16192q qVar2 = qVar;
            C89219l.m154719c(list2, "");
            C89219l.m154719c(qVar2, "");
            AbstractC89183m mVar = this.f38957a;
            if (list2.isEmpty()) {
                invoke = qVar2.mo25752d();
            } else {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo25743b());
                }
                List<String> g = C89070n.m154585g((Collection) arrayList);
                g.add(qVar2.mo25752d());
                invoke = C16168h.f38935f.invoke(g);
            }
            mVar.invoke(invoke, qVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m30023a(AbstractC16187m mVar, boolean z) {
        AbstractC16576j.C16578b.m30778a(this, "start to register and merge bridges: ".concat(String.valueOf(mVar.mo25737c().keySet())), EnumC16586p.D, null, 4);
        for (Map.Entry<String, AbstractC16192q> entry : mVar.mo25737c().entrySet()) {
            if (!this.f38941h.containsKey(entry.getKey())) {
                this.f38941h.put(entry.getKey(), entry.getValue());
            } else if (z) {
                AbstractC16576j.C16578b.m30778a(this, "bridge method named " + entry.getKey() + " has been registered! use the newer one.", EnumC16586p.W, null, 4);
                AbstractC16192q qVar = this.f38941h.get(entry.getKey());
                if (qVar != null) {
                    qVar.mo25721a();
                }
                this.f38941h.put(entry.getKey(), entry.getValue());
            } else {
                AbstractC16576j.C16578b.m30778a(this, "bridge method named " + entry.getKey() + " has been registered! use the older one.", EnumC16586p.W, null, 4);
                entry.getValue().mo25721a();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m
    /* renamed from: a */
    public final void mo25735a(String str, Object obj, AbstractC16192q.AbstractC16193a aVar, AbstractC89172b<? super Throwable, C89391z> bVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(obj, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(bVar, "");
        C16175g gVar = new C16175g(this);
        AbstractC16252a<C16162c> aVar2 = this.f38946m;
        if (aVar2 == null) {
            gVar.mo8774a(str, obj, aVar, bVar);
        } else {
            aVar2.mo25746a(new C16162c(str, obj, aVar, bVar), new C16173e(gVar), new C16174f(gVar, str, obj, aVar, bVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends java.util.List<? extends com.bytedance.ies.bullet.c.c.a.q>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16168h(List<? extends AbstractC16190o> list, AbstractC89172b<? super C16248b, ? extends List<? extends AbstractC16192q>> bVar, C16248b bVar2, AbstractC16252a<C16162c> aVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        this.f38939c = bVar;
        this.f38940d = bVar2;
        this.f38946m = aVar;
        for (T t : list) {
            this.f38937a.put(t.mo25749a(), C16178i.C16179a.m30044a(t, this.f38940d));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$g */
    static final class C16175g extends AbstractC89220m implements AbstractC89188r<String, Object, AbstractC16192q.AbstractC16193a, AbstractC89172b<? super Throwable, ? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16168h f38956a;

        static {
            Covode.recordClassIndex(18468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16175g(C16168h hVar) {
            super(4);
            this.f38956a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: com.bytedance.ies.bullet.c.c.a.n */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(String str, Object obj, AbstractC16192q.AbstractC16193a aVar, AbstractC89172b<? super Throwable, ? extends C89391z> bVar) {
            String str2;
            AbstractC16192q.AbstractC16193a aVar2 = aVar;
            AbstractC89172b<? super Throwable, ? extends C89391z> bVar2 = bVar;
            C89219l.m154719c(str, "");
            C89219l.m154719c(obj, "");
            C89219l.m154719c(aVar2, "");
            C89219l.m154719c(bVar2, "");
            C16168h hVar = this.f38956a;
            List<String> invoke = C16168h.f38934e.invoke(str);
            if (invoke == null || invoke.isEmpty()) {
                str2 = "";
            } else {
                str2 = invoke.get(0);
            }
            if (str2.isEmpty()) {
                C84357h.f188595a.mo129371a(hVar, invoke, new JSONObject());
            } else {
                AbstractC16192q a = hVar.mo25730a(str2);
                if (a == null) {
                    C84357h.f188595a.mo129371a(hVar, invoke, new JSONObject());
                } else if (a instanceof AbstractC16183k) {
                    try {
                        C84357h.f188595a.mo129371a(hVar, invoke, (JSONObject) obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                        C84357h.f188595a.mo129371a(hVar, invoke, new JSONObject());
                    }
                }
            }
            C89219l.m154719c(invoke, "");
            C89219l.m154719c(obj, "");
            C89219l.m154719c(aVar2, "");
            C89219l.m154719c(bVar2, "");
            int size = invoke.size();
            if (size == 0) {
                bVar2.invoke(new AbstractC16188n.C16189a("[unknown]"));
            } else if (size != 1) {
                String str3 = (String) C89070n.m154579f((List) invoke);
                AbstractC16188n nVar = hVar.f38937a.get(str3);
                if (nVar == 0) {
                    bVar2.invoke(new AbstractC16188n.C16189a(str3));
                } else {
                    hVar.f38938b = hVar.f38938b;
                    nVar.mo25742a(invoke.subList(1, invoke.size()), obj, aVar2, bVar2);
                }
            } else {
                String str4 = (String) C89070n.m154579f((List) invoke);
                AbstractC16192q qVar = hVar.mo25737c().get(str4);
                AbstractC16576j.C16578b.m30778a(hVar, "call Lynx/RN bridge method named " + str4 + " with parameters " + obj, EnumC16586p.D, null, 4);
                SystemClock.elapsedRealtime();
                if (qVar == null) {
                    bVar2.invoke(new AbstractC16188n.C16189a(str4));
                } else if (qVar instanceof AbstractC16183k) {
                    AbstractC89172b<? super AbstractC16192q, C89391z> bVar3 = hVar.f38938b;
                    if (bVar3 != null) {
                        bVar3.invoke(qVar);
                    }
                    ((AbstractC16183k) qVar).mo25748a((JSONObject) obj, (AbstractC16183k.AbstractC16185b) aVar2);
                } else if (qVar instanceof AbstractC16194r) {
                    AbstractC89172b<? super AbstractC16192q, C89391z> bVar4 = hVar.f38938b;
                    if (bVar4 != null) {
                        bVar4.invoke(qVar);
                    }
                    AbstractC16194r rVar = (AbstractC16194r) qVar;
                    if (rVar != null) {
                        C16165f.m30014a(rVar, obj, (AbstractC16194r.AbstractC16195a) aVar2);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
