package com.bytedance.ies.p1208im.core.p1209a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17441h;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.ies.p1208im.core.api.p1217g.AbstractC17462b;
import com.bytedance.ies.p1208im.core.api.p1217g.C17464d;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1417i.AbstractC19718b;
import com.bytedance.p1399im.core.p1417i.C19720d;
import com.bytedance.p1399im.core.p1417i.C19730f;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.a.f */
public final class C17409f extends AbstractC17441h implements AbstractC17462b, AbstractC19718b {

    /* renamed from: b */
    public static final C17409f f41762b;

    /* renamed from: c */
    private static final AbstractC89244h f41763c = C89250i.m154773a((AbstractC89171a) C17410a.f41766a);

    /* renamed from: d */
    private static long f41764d = -1;

    /* renamed from: e */
    private static final AbstractC89516am f41765e = C89517an.m155448a(C89546bf.f203266a);

    /* renamed from: b */
    private static CopyOnWriteArraySet<AbstractC19718b> m32243b() {
        return (CopyOnWriteArraySet) f41763c.getValue();
    }

    private C17409f() {
    }

    /* renamed from: com.bytedance.ies.im.core.a.f$a */
    static final class C17410a extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<AbstractC19718b>> {

        /* renamed from: a */
        public static final C17410a f41766a = new C17410a();

        static {
            Covode.recordClassIndex(19897);
        }

        C17410a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<AbstractC19718b> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    static {
        Covode.recordClassIndex(19896);
        C17409f fVar = new C17409f();
        f41762b = fVar;
        C19730f a = C19730f.m36907a();
        C19512f.m36457b("imsdk", "StrangerManager registerStrangerBoxObserver", (Throwable) null);
        a.f46889c = fVar;
        C17415a.m32256c().mo27842a(fVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17441h
    /* renamed from: a */
    public final void mo27777a() {
        boolean a = C17415a.m32256c().mo27844a();
        C17415a.m32255b().mo27836b("StrangerBoxModel", "refreshStrangerBox: ".concat(String.valueOf(a)));
        if (a) {
            m32242a(0);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17441h
    /* renamed from: a */
    public final void mo27779a(AbstractC19718b bVar) {
        C89219l.m154721d(bVar, "");
        m32243b().add(bVar);
    }

    @Override // com.bytedance.p1399im.core.p1417i.AbstractC19718b
    /* renamed from: a */
    public final void mo27780a(C19720d dVar) {
        Iterator<T> it = m32243b().iterator();
        while (it.hasNext()) {
            it.next().mo27780a(dVar);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17441h
    /* renamed from: b */
    public final void mo27781b(AbstractC19718b bVar) {
        C89219l.m154721d(bVar, "");
        m32243b().remove(bVar);
    }

    /* renamed from: com.bytedance.ies.im.core.a.f$b */
    static final class C17411b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f41767a;

        /* renamed from: b */
        final /* synthetic */ long f41768b;

        static {
            Covode.recordClassIndex(19898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17411b(long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f41768b = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C17411b(this.f41768b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17411b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r5.f41767a
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0034
                p4600h.C89382r.m154942a(r6)
            L_0x000f:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0012:
                p4600h.C89382r.m154942a(r6)
                long r0 = r5.f41768b
                r5.f41767a = r2
                java.lang.Object r0 = kotlinx.coroutines.C89536ay.m155464a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                p4600h.C89382r.m154942a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.C89652o.f203399a
                com.bytedance.ies.im.core.a.f$b$1 r1 = new com.bytedance.ies.im.core.a.f$b$1
                r0 = 0
                r1.<init>(r0)
                r5.f41767a = r3
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1208im.core.p1209a.C17409f.C17411b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static void m32242a(int i) {
        long uptimeMillis = SystemClock.uptimeMillis() - f41764d;
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("refreshStrangerBoxInternal: ").append(i).append(", ").append(uptimeMillis).append(", ");
        C19483d a = C19483d.m36365a();
        C89219l.m154716b(a, "");
        b.mo27836b("StrangerBoxModel", append.append(a.f46159d).toString());
        if (uptimeMillis >= 10000) {
            C19483d a2 = C19483d.m36365a();
            C89219l.m154716b(a2, "");
            if (a2.f46159d) {
                C17415a.m32255b().mo27836b("StrangerBoxModel", "refreshStrangerBoxInternal real");
                f41764d = SystemClock.uptimeMillis();
                C19730f.m36907a().mo31679b();
            }
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1217g.AbstractC17462b
    /* renamed from: a */
    public final void mo27778a(C17464d dVar) {
        C89219l.m154721d(dVar, "");
        boolean a = C17415a.m32256c().mo27844a();
        C17415a.m32255b().mo27836b("StrangerBoxModel", "onNetworkStateChanged: ".concat(String.valueOf(a)));
        if (a) {
            C17415a.m32259f();
            m32242a(1);
        }
    }
}
