package com.p2082ss.android.ugc.aweme.feed.adapter;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22873a;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import com.bytedance.tiktok.proxy.AbstractC22875c;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ao */
public final class C48155ao<R extends AbstractC22876d, ITEM> implements AbstractC22873a<R, ITEM> {

    /* renamed from: a */
    public AbstractC22875c<R, ITEM, AbstractC22873a<R, ITEM>> f111542a;

    /* renamed from: b */
    public final AbstractC22874b<R, ITEM> f111543b;

    /* renamed from: c */
    private boolean f111544c;

    /* renamed from: d */
    private final C1182af f111545d;

    /* renamed from: e */
    private final AbstractC89244h f111546e;

    static {
        Covode.recordClassIndex(56897);
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        return this.f111545d;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22879g
    /* renamed from: h */
    public final boolean mo20487h() {
        return this.f111544c;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.ao$a */
    static final class C48156a extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ C48155ao f111547a;

        static {
            Covode.recordClassIndex(56898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48156a(C48155ao aoVar) {
            super(0);
            this.f111547a = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f111547a);
        }
    }

    private /* synthetic */ C48155ao() {
        this(null);
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final R getActualReceiver() {
        AbstractC22875c<R, ITEM, AbstractC22873a<R, ITEM>> cVar = this.f111542a;
        if (cVar != null) {
            return cVar.aO_();
        }
        return null;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final /* synthetic */ AbstractC1196i getLifecycle() {
        return (C1205n) this.f111546e.getValue();
    }

    /* renamed from: a */
    public final void mo80293a() {
        AbstractC22875c<R, ITEM, AbstractC22873a<R, ITEM>> cVar = this.f111542a;
        if (cVar != null) {
            cVar.mo28066a(null);
        }
        this.f111542a = null;
        AbstractC22874b<R, ITEM> bVar = this.f111543b;
        if (bVar != null) {
            bVar.mo23354a();
        }
    }

    public C48155ao(AbstractC22874b<R, ITEM> bVar) {
        this.f111543b = bVar;
        this.f111545d = new C1182af();
        this.f111546e = C89250i.m154773a((AbstractC89171a) new C48156a(this));
    }
}
