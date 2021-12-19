package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1254c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17889b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17890c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.C17896c;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.b */
public final class C17922b implements AbstractC17891a {

    /* renamed from: a */
    public AbstractC17895b f42720a;

    /* renamed from: b */
    public AwemeRawAd f42721b;

    /* renamed from: c */
    public ViewGroup f42722c;

    /* renamed from: d */
    public Boolean f42723d = false;

    /* renamed from: e */
    public boolean f42724e;

    /* renamed from: f */
    private C17896c f42725f;

    /* renamed from: g */
    private AwemeSearchAdModel f42726g;

    /* renamed from: h */
    private final AbstractC89244h f42727h = C89250i.m154773a((AbstractC89171a) C17926d.f42735a);

    /* renamed from: i */
    private Context f42728i;

    /* renamed from: j */
    private ViewGroup f42729j;

    /* renamed from: k */
    private Boolean f42730k;

    /* renamed from: l */
    private boolean f42731l;

    static {
        Covode.recordClassIndex(20532);
    }

    /* renamed from: i */
    public final ISearchAdService mo28570i() {
        return (ISearchAdService) this.f42727h.getValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: h */
    public final boolean mo28482h() {
        return this.f42731l;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.b$d */
    static final class C17926d extends AbstractC89220m implements AbstractC89171a<ISearchAdService> {

        /* renamed from: a */
        public static final C17926d f42735a = new C17926d();

        static {
            Covode.recordClassIndex(20536);
        }

        C17926d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchAdService invoke() {
            return SearchAdServiceImpl.m33267a();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: d */
    public final void mo28478d() {
        mo28570i().mo28580d(this.f42722c);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: g */
    public final void mo28481g() {
        mo28570i().mo28582f(this.f42722c);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: a */
    public final void mo28474a() {
        String str;
        C18129a.C18130a a = C18129a.m33746a("result_ad", "othershow", this.f42721b);
        AbstractC17895b bVar = this.f42720a;
        if (bVar != null) {
            str = bVar.mo28495b();
        } else {
            str = null;
        }
        a.mo28897a("enter_from", str).mo28901b();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: b */
    public final boolean mo28476b() {
        Boolean bool;
        AwemeSearchAdModel awemeSearchAdModel = this.f42726g;
        if (awemeSearchAdModel != null) {
            bool = awemeSearchAdModel.isAutoPlayEnable();
        } else {
            bool = null;
        }
        return !C89219l.m154714a((Object) bool, (Object) true);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: c */
    public final void mo28477c() {
        C18129a.m33746a("result_ad", "othershow", this.f42721b).mo28900b("refer", "button").mo28901b();
        mo28570i().mo28576a(this.f42722c);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: f */
    public final void mo28480f() {
        this.f42731l = false;
        mo28570i().mo28578b(this.f42722c);
        mo28570i().mo28581e(this.f42729j);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: e */
    public final void mo28479e() {
        mo28570i().mo28577a(this.f42721b, this.f42729j, new View$OnClickListenerC17924b(this), new View$OnClickListenerC17925c(this));
        AbstractC17895b bVar = this.f42720a;
        if (bVar != null) {
            bVar.mo28501h();
        }
        this.f42730k = true;
        this.f42731l = true;
        mo28570i().mo28579c(this.f42722c);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.b$a */
    static final class View$OnClickListenerC17923a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17922b f42732a;

        static {
            Covode.recordClassIndex(20533);
        }

        View$OnClickListenerC17923a(C17922b bVar) {
            this.f42732a = bVar;
        }

        public final void onClick(View view) {
            this.f42732a.f42724e = true;
            AbstractC17895b bVar = this.f42732a.f42720a;
            if (bVar != null) {
                bVar.mo28498e();
            }
            this.f42732a.f42724e = false;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.b$b */
    static final class View$OnClickListenerC17924b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17922b f42733a;

        static {
            Covode.recordClassIndex(20534);
        }

        View$OnClickListenerC17924b(C17922b bVar) {
            this.f42733a = bVar;
        }

        public final void onClick(View view) {
            this.f42733a.f42724e = true;
            AbstractC17895b bVar = this.f42733a.f42720a;
            if (bVar != null) {
                bVar.mo28499f();
            }
            this.f42733a.f42724e = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a
    /* renamed from: a */
    public final void mo28475a(String str) {
        String str2;
        if (!this.f42724e) {
            C18129a.C18130a a = C18129a.m33746a("result_ad", "otherclick", this.f42721b);
            AbstractC17895b bVar = this.f42720a;
            if (bVar != null) {
                str2 = bVar.mo28495b();
            } else {
                str2 = null;
            }
            a.mo28897a("enter_from", str2).mo28900b("refer", str).mo28901b();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.b$c */
    static final class View$OnClickListenerC17925c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17922b f42734a;

        static {
            Covode.recordClassIndex(20535);
        }

        View$OnClickListenerC17925c(C17922b bVar) {
            this.f42734a = bVar;
        }

        public final void onClick(View view) {
            this.f42734a.f42723d = true;
            AbstractC17895b bVar = this.f42734a.f42720a;
            if (bVar != null) {
                bVar.mo28500g();
            }
            this.f42734a.f42723d = false;
            this.f42734a.mo28480f();
            ISearchAdService i = this.f42734a.mo28570i();
            if (i != null) {
                i.mo28576a(this.f42734a.f42722c);
            }
            C18129a.m33746a("result_ad_bg", "replay", this.f42734a.f42721b).mo28900b("refer", "background").mo28901b();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17888a
    /* renamed from: a */
    public final void mo28473a(AbstractC17890c cVar) {
        AbstractC17889b bVar;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel awemeSearchAdModel;
        Context context;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C89219l.m154721d(cVar, "");
        C17896c cVar2 = (C17896c) cVar;
        this.f42725f = cVar2;
        ViewGroup viewGroup3 = null;
        if (cVar2 != null) {
            bVar = cVar2.f42655b;
        } else {
            bVar = null;
        }
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.ISearchAdVideoSceneCallBack");
        this.f42720a = (AbstractC17895b) bVar;
        C17896c cVar3 = this.f42725f;
        if (cVar3 != null) {
            awemeRawAd = cVar3.f42658a;
        } else {
            awemeRawAd = null;
        }
        this.f42721b = awemeRawAd;
        if (awemeRawAd != null) {
            awemeSearchAdModel = awemeRawAd.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.f42726g = awemeSearchAdModel;
        AbstractC17895b bVar2 = this.f42720a;
        if (bVar2 != null) {
            context = bVar2.mo28496c();
        } else {
            context = null;
        }
        this.f42728i = context;
        ISearchAdService i = mo28570i();
        if (i != null) {
            AbstractC17895b bVar3 = this.f42720a;
            if (bVar3 != null) {
                viewGroup2 = bVar3.mo28494a();
            } else {
                viewGroup2 = null;
            }
            viewGroup = i.mo28575a(viewGroup2, this.f42728i, this.f42721b, new View$OnClickListenerC17923a(this));
        } else {
            viewGroup = null;
        }
        this.f42722c = viewGroup;
        ISearchAdService i2 = mo28570i();
        if (i2 != null) {
            AbstractC17895b bVar4 = this.f42720a;
            if (bVar4 != null) {
                viewGroup3 = bVar4.mo28497d();
            }
            viewGroup3 = i2.mo28574a(viewGroup3, this.f42728i, this.f42721b);
        }
        this.f42729j = viewGroup3;
    }
}
