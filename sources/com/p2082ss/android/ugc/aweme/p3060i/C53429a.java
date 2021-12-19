package com.p2082ss.android.ugc.aweme.p3060i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61497a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.i.a */
public class C53429a implements AbstractC33485al, AbstractC53432c {

    /* renamed from: b */
    private static C53429a f122641b;

    /* renamed from: a */
    public List<AbstractC33485al> f122642a = new CopyOnWriteArrayList();

    /* renamed from: c */
    private boolean f122643c;

    static {
        Covode.recordClassIndex(62998);
    }

    private C53429a() {
    }

    /* renamed from: c */
    public static C53429a m98598c() {
        MethodCollector.m26663i(6854);
        if (f122641b == null) {
            synchronized (C53429a.class) {
                try {
                    if (f122641b == null) {
                        f122641b = new C53429a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6854);
                    throw th;
                }
            }
        }
        C53429a aVar = f122641b;
        MethodCollector.m26664o(6854);
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        MethodCollector.m26663i(7290);
        mo89998d();
        synchronized (C53429a.class) {
            try {
                for (AbstractC33485al alVar : this.f122642a) {
                    if (alVar != null) {
                        alVar.mo59568a();
                    }
                }
            } finally {
                MethodCollector.m26664o(7290);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        MethodCollector.m26663i(7438);
        mo89998d();
        synchronized (C53429a.class) {
            try {
                for (AbstractC33485al alVar : this.f122642a) {
                    if (alVar != null) {
                        alVar.mo59569b();
                    }
                }
            } finally {
                MethodCollector.m26664o(7438);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo89998d() {
        MethodCollector.m26663i(6993);
        if (this.f122643c) {
            MethodCollector.m26664o(6993);
            return;
        }
        if (C29843f.m60129a(C17867d.m33078a())) {
            m98598c().mo89996a(C39223a.m79588b().mo68599g());
            m98598c().mo89996a(new C61497a());
        }
        this.f122643c = true;
        MethodCollector.m26664o(6993);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3060i.AbstractC53432c
    /* renamed from: b */
    public final void mo89997b(AbstractC33485al alVar) {
        MethodCollector.m26663i(7289);
        synchronized (C53429a.class) {
            try {
                this.f122642a.remove(alVar);
            } finally {
                MethodCollector.m26664o(7289);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3060i.AbstractC53432c
    /* renamed from: a */
    public final void mo89996a(AbstractC33485al alVar) {
        MethodCollector.m26663i(7148);
        synchronized (C53429a.class) {
            if (alVar != null) {
                try {
                    if (!this.f122642a.contains(alVar)) {
                        this.f122642a.add(alVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7148);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(7148);
    }
}
