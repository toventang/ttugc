package com.bytedance.ies.powerlist.optimize;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.trace.p791b.C12616b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.C17693c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.optimize.a */
public final class C17661a extends RecyclerView.AbstractC1371n implements C12616b.AbstractC12623d {

    /* renamed from: a */
    final PowerList f42231a;

    /* renamed from: b */
    private final AbstractC89244h f42232b = C89250i.m154773a((AbstractC89171a) new C17662a(this));

    /* renamed from: c */
    private volatile boolean f42233c;

    /* renamed from: d */
    private C12616b.AbstractC12623d f42234d;

    /* renamed from: e */
    private final C17693c f42235e;

    static {
        Covode.recordClassIndex(20218);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C12616b mo28148b() {
        return (C12616b) this.f42232b.getValue();
    }

    /* renamed from: com.bytedance.ies.powerlist.optimize.a$a */
    static final class C17662a extends AbstractC89220m implements AbstractC89171a<C12616b> {

        /* renamed from: a */
        final /* synthetic */ C17661a f42236a;

        static {
            Covode.recordClassIndex(20219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17662a(C17661a aVar) {
            super(0);
            this.f42236a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C12616b invoke() {
            return new C12616b(this.f42236a.mo28147a(), true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo28149c() {
        C12616b.m22744b(mo28147a());
        if (this.f42233c) {
            this.f42233c = false;
            mo28148b().mo20430b();
        }
    }

    /* renamed from: a */
    public final String mo28147a() {
        String str = this.f42235e.f42327i;
        if (str == null || str.length() == 0) {
            return "";
        }
        return "powerlist_fps_" + this.f42235e.f42327i;
    }

    @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12623d
    /* renamed from: a */
    public final void mo20436a(double d) {
        C12616b.AbstractC12623d dVar = this.f42234d;
        if (dVar != null) {
            dVar.mo20436a(d);
        }
    }

    public C17661a(C17693c cVar, PowerList powerList) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(powerList, "");
        this.f42235e = cVar;
        this.f42231a = powerList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154719c(recyclerView, "");
        if (i != 0) {
            if (!this.f42233c) {
                if (!this.f42233c) {
                    C12616b.m22743a(mo28147a());
                    this.f42233c = true;
                    mo28148b().mo20427a();
                }
                C89219l.m154719c(recyclerView, "");
            }
        } else if (this.f42233c) {
            mo28149c();
        }
    }
}
