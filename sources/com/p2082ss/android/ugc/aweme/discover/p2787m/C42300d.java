package com.p2082ss.android.ugc.aweme.discover.p2787m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.m.d */
public class C42300d implements AbstractC42293b {

    /* renamed from: a */
    private final AbstractC89244h f98538a = C89250i.m154773a((AbstractC89171a) C42301a.f98540a);

    /* renamed from: b */
    public int f98539b;

    static {
        Covode.recordClassIndex(50243);
    }

    /* renamed from: a */
    public final List<WeakReference<AbstractC42293b.AbstractC42294a<?>>> mo71486a() {
        return (List) this.f98538a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.m.d$a */
    static final class C42301a extends AbstractC89220m implements AbstractC89171a<List<WeakReference<AbstractC42293b.AbstractC42294a<?>>>> {

        /* renamed from: a */
        public static final C42301a f98540a = new C42301a();

        static {
            Covode.recordClassIndex(50244);
        }

        C42301a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<WeakReference<AbstractC42293b.AbstractC42294a<?>>> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final void mo71487a(AbstractC42293b.AbstractC42294a<?> aVar) {
        C89219l.m154721d(aVar, "");
        mo71486a().add(new WeakReference<>(aVar));
    }

    /* renamed from: a */
    public final void mo71488a(Object obj) {
        C89219l.m154721d(obj, "");
        for (WeakReference<AbstractC42293b.AbstractC42294a<?>> weakReference : mo71486a()) {
            AbstractC42293b.AbstractC42294a<?> aVar = weakReference.get();
            if (aVar == null) {
                mo71486a().remove(weakReference);
            } else if (C89219l.m154714a(aVar.mo60371a(), obj.getClass()) && (obj instanceof Object)) {
                aVar.mo60372a(obj);
            }
        }
    }
}
