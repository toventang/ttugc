package com.p2082ss.android.ugc.aweme.discover.helper;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.C41967a;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.d */
public final class C42003d implements C41967a.AbstractC41969b {

    /* renamed from: a */
    private final AbstractC89244h f97952a = C89250i.m154773a((AbstractC89171a) C42005b.f97954a);

    /* renamed from: b */
    private AbstractC42004a f97953b;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.d$a */
    public interface AbstractC42004a {
        static {
            Covode.recordClassIndex(49934);
        }

        /* renamed from: a */
        void mo71182a();
    }

    static {
        Covode.recordClassIndex(49933);
    }

    /* renamed from: i */
    private final C41967a m84071i() {
        return (C41967a) this.f97952a.getValue();
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

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: g */
    public final void mo71147g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: h */
    public final void mo71148h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.d$b */
    static final class C42005b extends AbstractC89220m implements AbstractC89171a<C41967a> {

        /* renamed from: a */
        public static final C42005b f97954a = new C42005b();

        static {
            Covode.recordClassIndex(49935);
        }

        C42005b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41967a invoke() {
            return new C41967a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: a */
    public final void mo71141a() {
        AbstractC42004a aVar = this.f97953b;
        if (aVar == null) {
            C89219l.m154710a("refreshSuggestSearchWhenStart");
        }
        aVar.mo71182a();
    }

    public C42003d(ActivityC0945e eVar, AbstractC42004a aVar) {
        C89219l.m154721d(aVar, "");
        if (eVar != null) {
            m84071i().mo71140a(new WeakReference<>(eVar));
            m84071i().mo71139a(this);
            this.f97953b = aVar;
        }
    }
}
