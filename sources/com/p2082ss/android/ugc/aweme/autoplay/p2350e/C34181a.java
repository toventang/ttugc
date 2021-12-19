package com.p2082ss.android.ugc.aweme.autoplay.p2350e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.utils.C80239bc;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.e.a */
public final class C34181a {

    /* renamed from: a */
    public static WeakReference<AbstractC34186b.AbstractC34192d> f80833a;

    /* renamed from: b */
    public static int f80834b = -1;

    /* renamed from: c */
    public static final C34181a f80835c = new C34181a();

    /* renamed from: d */
    private static final AbstractC89244h f80836d = C89250i.m154773a((AbstractC89171a) C34182a.f80837a);

    /* renamed from: a */
    public static C80239bc<WeakReference<AbstractC34186b.AbstractC34192d>> m69856a() {
        return (C80239bc) f80836d.getValue();
    }

    private C34181a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.e.a$a */
    static final class C34182a extends AbstractC89220m implements AbstractC89171a<C80239bc<WeakReference<AbstractC34186b.AbstractC34192d>>> {

        /* renamed from: a */
        public static final C34182a f80837a = new C34182a();

        static {
            Covode.recordClassIndex(41116);
        }

        C34182a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80239bc<WeakReference<AbstractC34186b.AbstractC34192d>> invoke() {
            return new C80239bc();
        }
    }

    static {
        Covode.recordClassIndex(41115);
    }

    /* renamed from: b */
    public static void m69858b() {
        for (WeakReference<AbstractC34186b.AbstractC34192d> weakReference : m69856a().mo123655a()) {
            AbstractC34186b.AbstractC34192d dVar = weakReference.get();
            if (dVar != null) {
                dVar.bg_();
            }
        }
    }

    /* renamed from: d */
    public static void m69861d(AbstractC34186b.AbstractC34192d dVar) {
        C89219l.m154721d(dVar, "");
        dVar.hashCode();
        f80833a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public static void m69857a(AbstractC34186b.AbstractC34192d dVar) {
        C89219l.m154721d(dVar, "");
        dVar.hashCode();
        for (WeakReference<AbstractC34186b.AbstractC34192d> weakReference : m69856a().mo123655a()) {
            if (C89219l.m154714a(weakReference.get(), dVar)) {
                return;
            }
        }
        dVar.hashCode();
        m69856a().mo123656a(new WeakReference<>(dVar));
    }

    /* renamed from: c */
    public static void m69860c(AbstractC34186b.AbstractC34192d dVar) {
        for (WeakReference<AbstractC34186b.AbstractC34192d> weakReference : m69856a().mo123655a()) {
            AbstractC34186b.AbstractC34192d dVar2 = weakReference.get();
            if ((!C89219l.m154714a(dVar2, dVar)) && dVar2 != null) {
                dVar2.bi_();
            }
        }
    }

    /* renamed from: b */
    public static void m69859b(AbstractC34186b.AbstractC34192d dVar) {
        WeakReference<AbstractC34186b.AbstractC34192d> weakReference;
        C89219l.m154721d(dVar, "");
        dVar.hashCode();
        Iterator<WeakReference<AbstractC34186b.AbstractC34192d>> it = m69856a().mo123655a().iterator();
        while (true) {
            if (!it.hasNext()) {
                weakReference = null;
                break;
            }
            weakReference = it.next();
            if (C89219l.m154714a(weakReference.get(), dVar)) {
                break;
            }
        }
        dVar.hashCode();
        m69856a().mo123657b(weakReference);
    }
}
