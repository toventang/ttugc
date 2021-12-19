package com.bytedance.ies.powerlist.proxy;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17643c;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tiktok.proxy.AbstractC22873a;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import com.bytedance.tiktok.proxy.AbstractC22875c;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class ListVMProxy<R extends AbstractC22876d, ITEM extends AbstractC17641a> implements AbstractC1202k, AbstractC22873a<R, ITEM> {

    /* renamed from: d */
    public static final AbstractC89244h f42384d = C89250i.m154773a((AbstractC89171a) C17725b.f42394a);

    /* renamed from: e */
    public static final C17724a f42385e = new C17724a((byte) 0);

    /* renamed from: a */
    public volatile boolean f42386a;

    /* renamed from: b */
    public AbstractC22875c<R, ITEM, AbstractC22873a<R, ITEM>> f42387b;

    /* renamed from: c */
    public final AbstractC22874b<R, ITEM> f42388c;

    /* renamed from: f */
    private boolean f42389f;

    /* renamed from: g */
    private final AbstractC89244h f42390g;

    /* renamed from: h */
    private boolean f42391h;

    /* renamed from: i */
    private final C1182af f42392i;

    /* renamed from: j */
    private final AbstractC89244h f42393j;

    private ListVMProxy(byte b) {
        this();
    }

    /* renamed from: a */
    public final AbstractC1196i mo28191a() {
        return (AbstractC1196i) this.f42390g.getValue();
    }

    /* renamed from: b */
    public final C1205n getLifecycle() {
        return (C1205n) this.f42393j.getValue();
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.ListVMProxy$a */
    public static final class C17724a {
        static {
            Covode.recordClassIndex(20285);
        }

        private C17724a() {
        }

        public /* synthetic */ C17724a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        return this.f42392i;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22879g
    /* renamed from: h */
    public final boolean mo20487h() {
        return this.f42389f;
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.ListVMProxy$c */
    static final class C17726c extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ ListVMProxy f42395a;

        static {
            Covode.recordClassIndex(20287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17726c(ListVMProxy listVMProxy) {
            super(0);
            this.f42395a = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f42395a);
        }
    }

    private /* synthetic */ ListVMProxy() {
        this((AbstractC22874b) null);
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.ListVMProxy$b */
    static final class C17725b extends AbstractC89220m implements AbstractC89171a<C1175ad.C1176a> {

        /* renamed from: a */
        public static final C17725b f42394a = new C17725b();

        static {
            Covode.recordClassIndex(20286);
        }

        C17725b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.C1176a invoke() {
            return C1175ad.C1176a.m3873a(C17643c.f42194b.mo28112b());
        }
    }

    /* renamed from: d */
    public final void mo28196d() {
        AbstractC1196i a = mo28191a();
        if (a != null) {
            a.mo4013b(this);
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final R getActualReceiver() {
        AbstractC22875c<R, ITEM, AbstractC22873a<R, ITEM>> cVar = this.f42387b;
        if (cVar != null) {
            return cVar.aO_();
        }
        return null;
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.ListVMProxy$d */
    static final class C17727d extends AbstractC89220m implements AbstractC89171a<AbstractC1196i> {

        /* renamed from: a */
        final /* synthetic */ ListVMProxy f42396a;

        static {
            Covode.recordClassIndex(20288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17727d(ListVMProxy listVMProxy) {
            super(0);
            this.f42396a = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1196i invoke() {
            AbstractC1204m aK_;
            AbstractC22875c<R, ITEM, AbstractC22873a<R, ITEM>> cVar = this.f42396a.f42387b;
            if (cVar == null || (aK_ = cVar.aK_()) == null) {
                return null;
            }
            return aK_.getLifecycle();
        }
    }

    static {
        Covode.recordClassIndex(20284);
    }

    /* renamed from: e */
    private final void m32852e() {
        AbstractC22874b<R, ITEM> bVar;
        if (!(getLifecycle().mo4011a() == AbstractC1196i.EnumC1199b.CREATED || (bVar = this.f42388c) == null)) {
            bVar.mo23359c();
        }
        getLifecycle().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    /* renamed from: c */
    public final void mo28195c() {
        AbstractC22875c<R, ITEM, AbstractC22873a<R, ITEM>> cVar = this.f42387b;
        if (cVar != null) {
            cVar.mo28066a(null);
        }
        this.f42387b = null;
        AbstractC22874b<R, ITEM> bVar = this.f42388c;
        if (bVar != null) {
            bVar.mo23354a();
        }
    }

    /* renamed from: a */
    private final void m32851a(boolean z) {
        if (getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.RESUMED) {
            AbstractC22874b<R, ITEM> bVar = this.f42388c;
            if (bVar != null) {
                bVar.mo23357a(z);
            }
            this.f42389f = z;
        }
        getLifecycle().mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    public ListVMProxy(AbstractC22874b<R, ITEM> bVar) {
        this.f42388c = bVar;
        this.f42390g = C89250i.m154773a((AbstractC89171a) new C17727d(this));
        this.f42392i = new C1182af();
        this.f42393j = C89250i.m154773a((AbstractC89171a) new C17726c(this));
    }

    /* renamed from: a */
    public final void mo28192a(PowerCell<ITEM> powerCell) {
        if (powerCell.f42163g) {
            if (C89219l.m154714a(powerCell, this.f42387b)) {
                this.f42391h = false;
            }
            m32852e();
        }
    }

    /* renamed from: a */
    public final void mo28193a(PowerCell<ITEM> powerCell, boolean z) {
        if (!this.f42391h) {
            if (C89219l.m154714a(powerCell, this.f42387b) && powerCell != null) {
                this.f42391h = true;
            }
            m32851a(z);
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        int i = C17728a.f42398b[aVar.ordinal()];
        if (i == 1) {
            getLifecycle().mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
            AbstractC22874b<R, ITEM> bVar = this.f42388c;
            if (bVar != null) {
                bVar.mo23358b();
            }
        } else if (i != 2) {
            if (i == 3) {
                m32852e();
            } else if (i == 4) {
                int i2 = C17728a.f42397a[getLifecycle().mo4011a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    m32852e();
                }
                getLifecycle().mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
                AbstractC22874b<R, ITEM> bVar2 = this.f42388c;
                if (bVar2 != null) {
                    bVar2.mo23360d();
                }
            }
        } else if (this.f42391h && this.f42387b != null) {
            m32851a(true);
        }
    }
}
