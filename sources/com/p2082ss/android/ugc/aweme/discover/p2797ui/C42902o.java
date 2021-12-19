package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41729k;
import com.p2082ss.android.ugc.aweme.discover.helper.C41967a;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.o */
public final class C42902o implements C41967a.AbstractC41969b {

    /* renamed from: a */
    public final ActivityC0945e f100042a;

    /* renamed from: b */
    public final AbstractC41729k f100043b;

    /* renamed from: c */
    private final AbstractC89244h f100044c = C89250i.m154773a((AbstractC89171a) C42903a.f100045a);

    static {
        Covode.recordClassIndex(51007);
    }

    /* renamed from: i */
    private final C41967a m85646i() {
        return (C41967a) this.f100044c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: a */
    public final void mo71141a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: b */
    public final void mo71142b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: c */
    public final void mo71143c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: d */
    public final void mo71144d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: e */
    public final void mo71145e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: f */
    public final void mo71146f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.o$a */
    static final class C42903a extends AbstractC89220m implements AbstractC89171a<C41967a> {

        /* renamed from: a */
        public static final C42903a f100045a = new C42903a();

        static {
            Covode.recordClassIndex(51008);
        }

        C42903a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41967a invoke() {
            return new C41967a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: g */
    public final void mo71147g() {
        AbstractC41729k kVar = this.f100043b;
        if (kVar != null) {
            kVar.mo70799b(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: h */
    public final void mo71148h() {
        AbstractC41729k kVar = this.f100043b;
        if (kVar != null) {
            kVar.mo70799b(false);
        }
    }

    public C42902o(ActivityC0945e eVar, AbstractC41729k kVar) {
        this.f100042a = eVar;
        this.f100043b = kVar;
        if (eVar != null) {
            m85646i().mo71140a(new WeakReference<>(eVar));
            m85646i().mo71139a(this);
        }
    }
}
