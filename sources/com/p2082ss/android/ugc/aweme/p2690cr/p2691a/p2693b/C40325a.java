package com.p2082ss.android.ugc.aweme.p2690cr.p2691a.p2693b;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.C27471bk;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.a.b.a */
public final class C40325a {

    /* renamed from: a */
    public final AtomicBoolean f94497a = new AtomicBoolean(true);

    /* renamed from: b */
    public final Set<String> f94498b = C27471bk.m54929a();

    static {
        Covode.recordClassIndex(48126);
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.a.b.a$a */
    public static final class CallableC40326a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C40325a f94499a;

        static {
            Covode.recordClassIndex(48127);
        }

        public CallableC40326a(C40325a aVar) {
            this.f94499a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f94499a.mo69465a();
        }
    }

    /* renamed from: a */
    public final Set<String> mo69465a() {
        Set<String> b = m81479b();
        this.f94498b.clear();
        this.f94498b.addAll(b);
        this.f94497a.set(false);
        return b;
    }

    /* renamed from: b */
    private static Set<String> m81479b() {
        Collection f;
        List<C43223c> queryAllDraftList = AVServiceImpl.m113116a().draftService().queryAllDraftList(true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C40340a aVar = new C40340a();
        C89219l.m154716b(queryAllDraftList, "");
        for (C43223c cVar : C89070n.m154580f((Iterable) queryAllDraftList)) {
            aVar.mo69486a(cVar);
            C43223c cVar2 = aVar.f94514a;
            if (cVar2 == null) {
                f = C89036ab.INSTANCE;
            } else if (!cVar2.mo73652a()) {
                f = C89036ab.INSTANCE;
            } else {
                f = C43225d.m86336f(cVar2);
            }
            linkedHashSet.addAll(f);
        }
        return linkedHashSet;
    }
}
