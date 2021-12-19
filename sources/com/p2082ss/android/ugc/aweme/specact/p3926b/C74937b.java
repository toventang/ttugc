package com.p2082ss.android.ugc.aweme.specact.p3926b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.b.b */
public final class C74937b implements AbstractC88434g<AbstractC88979t<? extends Throwable>, AbstractC88979t<?>> {

    /* renamed from: a */
    public int f168467a;

    /* renamed from: b */
    public final int f168468b = 2;

    /* renamed from: c */
    public final long f168469c = 3000;

    static {
        Covode.recordClassIndex(87805);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.b.b$a */
    public static final class C74938a implements AbstractC88434g<Throwable, AbstractC88979t<?>> {

        /* renamed from: a */
        final /* synthetic */ C74937b f168470a;

        static {
            Covode.recordClassIndex(87806);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74938a(C74937b bVar) {
            this.f168470a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC88979t<?> apply(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            C74937b bVar = this.f168470a;
            int i = bVar.f168467a;
            bVar.f168467a = i + 1;
            if (i < this.f168470a.f168468b) {
                return AbstractC88979t.m154307b(this.f168470a.f168469c, TimeUnit.MILLISECONDS);
            }
            return AbstractC88979t.m154302a(th2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final /* synthetic */ AbstractC88979t<?> apply(AbstractC88979t<? extends Throwable> tVar) {
        AbstractC88979t<? extends Throwable> tVar2 = tVar;
        C89219l.m154721d(tVar2, "");
        AbstractC88979t<R> a = tVar2.mo143267a((AbstractC88434g<? super Object, ? extends AbstractC88984x<? extends R>>) new C74938a(this), false);
        C89219l.m154716b(a, "");
        return a;
    }
}
