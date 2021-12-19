package com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.c */
public final class C39638c {

    /* renamed from: a */
    final AbstractC39649e.AbstractC39654c f93430a;

    /* renamed from: b */
    final AbstractC39641d.AbstractC39648d f93431b;

    /* renamed from: c */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f93432c;

    /* renamed from: d */
    final AbstractC39640a f93433d;

    /* renamed from: e */
    public int f93434e;

    /* renamed from: f */
    private RecyclerView.AbstractC1353c f93435f = new RecyclerView.AbstractC1353c() {
        /* class com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39638c.C396391 */

        static {
            Covode.recordClassIndex(47358);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            C39638c cVar = C39638c.this;
            cVar.f93434e = cVar.f93432c.getItemCount();
            C39638c.this.f93433d.mo69048a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C39638c.this.f93433d.mo69051a(C39638c.this, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C39638c.this.f93434e += i2;
            C39638c.this.f93433d.mo69050a(C39638c.this, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C39638c.this.f93434e -= i2;
            C39638c.this.f93433d.mo69052b(C39638c.this, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            if (i3 == 1) {
                C39638c.this.f93433d.mo69054c(C39638c.this, i, i2);
                return;
            }
            throw new IllegalArgumentException("moving more than 1 item is not supported in RecyclerView");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            C39638c.this.f93433d.mo69051a(C39638c.this, i, i2, obj);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.c$a */
    interface AbstractC39640a {
        static {
            Covode.recordClassIndex(47359);
        }

        /* renamed from: a */
        void mo69048a();

        /* renamed from: a */
        void mo69050a(C39638c cVar, int i, int i2);

        /* renamed from: a */
        void mo69051a(C39638c cVar, int i, int i2, Object obj);

        /* renamed from: b */
        void mo69052b(C39638c cVar, int i, int i2);

        /* renamed from: c */
        void mo69054c(C39638c cVar, int i, int i2);
    }

    static {
        Covode.recordClassIndex(47357);
    }

    C39638c(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar, AbstractC39640a aVar2, AbstractC39649e eVar, AbstractC39641d.AbstractC39648d dVar) {
        this.f93432c = aVar;
        this.f93433d = aVar2;
        this.f93430a = eVar.mo69058a(this);
        this.f93431b = dVar;
        this.f93434e = aVar.getItemCount();
        aVar.registerAdapterDataObserver(this.f93435f);
    }
}
