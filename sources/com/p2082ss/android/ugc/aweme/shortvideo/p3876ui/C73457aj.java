package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aj */
public final class C73457aj {

    /* renamed from: a */
    public Future<List<C43223c>> f165008a;

    /* renamed from: b */
    final ExecutorService f165009b = C77807b.f174559a;

    /* renamed from: c */
    public final ActivityC0945e f165010c;

    /* renamed from: d */
    public final String f165011d;

    static {
        Covode.recordClassIndex(86194);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aj$b */
    static final class RunnableC73459b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73457aj f165013a;

        static {
            Covode.recordClassIndex(86196);
        }

        RunnableC73459b(C73457aj ajVar) {
            this.f165013a = ajVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aj$b$a */
        static final class RunnableC73460a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C43223c f165014a;

            /* renamed from: b */
            final /* synthetic */ RunnableC73459b f165015b;

            static {
                Covode.recordClassIndex(86197);
            }

            RunnableC73460a(C43223c cVar, RunnableC73459b bVar) {
                this.f165014a = cVar;
                this.f165015b = bVar;
            }

            public final void run() {
                C63244g.m114602a().mo73287o().mo104793m().mo104824a(this.f165015b.f165013a.f165010c, this.f165014a);
            }
        }

        public final void run() {
            List<C43223c> list;
            Future<List<C43223c>> future = this.f165013a.f165008a;
            if (!(future == null || (list = future.get()) == null)) {
                ArrayList<C43223c> arrayList = new ArrayList();
                for (T t : list) {
                    if (!C89219l.m154714a((Object) t.mo73726r(), (Object) this.f165013a.f165011d)) {
                        arrayList.add(t);
                    }
                }
                for (C43223c cVar : arrayList) {
                    C29339a.m58754b(new RunnableC73460a(cVar, this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aj$a */
    static final class CallableC73458a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC73458a f165012a = new CallableC73458a();

        static {
            Covode.recordClassIndex(86195);
        }

        CallableC73458a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<String> a = C63244g.m114602a().mo73287o().mo104793m().mo104823a();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(C78397c.m136927a().queryDraftWithUserId(it.next()));
            }
            return C89070n.m154590j(C89070n.m154580f((Iterable) arrayList));
        }
    }

    public C73457aj(ActivityC0945e eVar, String str) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        this.f165010c = eVar;
        this.f165011d = str;
    }
}
