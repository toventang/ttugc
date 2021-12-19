package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34256e;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.j */
public final class C34160j implements AbstractC34145c {

    /* renamed from: a */
    public final SearchVideoView f80779a;

    /* renamed from: b */
    private AbstractC34186b.AbstractC34187a f80780b;

    /* renamed from: c */
    private final AbstractC89244h f80781c = C89250i.m154773a((AbstractC89171a) new C34163c(this));

    /* renamed from: d */
    private final AbstractC89244h f80782d = C89250i.m154773a((AbstractC89171a) new C34162b(this));

    /* renamed from: e */
    private final AbstractC89244h f80783e = C89250i.m154773a((AbstractC89171a) new C34161a(this));

    /* renamed from: f */
    private final ImageView f80784f;

    /* renamed from: g */
    private final AbstractC51043a f80785g;

    /* renamed from: i */
    private final C51060g f80786i;

    /* renamed from: j */
    private AbstractC51044b f80787j;

    /* renamed from: k */
    private final View f80788k;

    static {
        Covode.recordClassIndex(41094);
    }

    /* renamed from: a */
    public final C34256e mo60496a() {
        return (C34256e) this.f80781c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: g */
    public final C34246c mo60348g() {
        return (C34246c) this.f80783e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: h */
    public final C34176n mo60349h() {
        return (C34176n) this.f80782d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: i */
    public final AbstractC34186b.AbstractC34187a mo60350i() {
        return this.f80780b;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bg_() {
        mo60496a().bg_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bi_() {
        mo60496a().bi_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: e */
    public final void mo60344e() {
        mo60496a().mo60344e();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.j$a */
    static final class C34161a extends AbstractC89220m implements AbstractC89171a<C34246c> {

        /* renamed from: a */
        final /* synthetic */ C34160j f80789a;

        static {
            Covode.recordClassIndex(41095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34161a(C34160j jVar) {
            super(0);
            this.f80789a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34246c invoke() {
            SearchVideoView searchVideoView = this.f80789a.f80779a;
            if (searchVideoView != null) {
                return searchVideoView.getDataProvider();
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final boolean aZ_() {
        return mo60496a().aZ_();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.j$b */
    static final class C34162b extends AbstractC89220m implements AbstractC89171a<C34176n> {

        /* renamed from: a */
        final /* synthetic */ C34160j f80790a;

        static {
            Covode.recordClassIndex(41096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34162b(C34160j jVar) {
            super(0);
            this.f80790a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34176n invoke() {
            SearchPlayerCore searchPlayerCore;
            SearchVideoView searchVideoView = this.f80790a.f80779a;
            if (searchVideoView != null) {
                searchPlayerCore = searchVideoView.getCore();
            } else {
                searchPlayerCore = null;
            }
            return new C34176n(searchPlayerCore, this.f80790a.mo60496a(), (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.j$c */
    static final class C34163c extends AbstractC89220m implements AbstractC89171a<C34256e> {

        /* renamed from: a */
        final /* synthetic */ C34160j f80791a;

        static {
            Covode.recordClassIndex(41097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34163c(C34160j jVar) {
            super(0);
            this.f80791a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34256e invoke() {
            SearchPlayerCore searchPlayerCore;
            SearchVideoView searchVideoView = this.f80791a.f80779a;
            if (searchVideoView != null) {
                searchPlayerCore = searchVideoView.getCore();
            } else {
                searchPlayerCore = null;
            }
            return new C34256e(searchPlayerCore, this.f80791a.mo60348g());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: a */
    public final void mo60340a(long j) {
        mo60496a().mo60340a(j);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: a */
    public final void mo60347a(AbstractC34186b.AbstractC34187a aVar) {
        this.f80780b = aVar;
        C34246c g = mo60348g();
        if (g != null) {
            g.f80996m = this.f80780b;
        }
    }

    public C34160j(SearchVideoView searchVideoView, ImageView imageView, AbstractC51043a aVar, C51060g gVar, AbstractC51044b bVar, View view) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view, "");
        this.f80779a = searchVideoView;
        this.f80784f = imageView;
        this.f80785g = aVar;
        this.f80786i = gVar;
        this.f80787j = bVar;
        this.f80788k = view;
        if (searchVideoView != null) {
            SearchPlayerCore core = searchVideoView.getCore();
            if (core != null) {
                core.setFillHeight(false);
            }
            searchVideoView.setMScrollStateObserver(mo60349h());
            searchVideoView.hashCode();
            AbstractC51064i mScrollStateObserver = searchVideoView.getMScrollStateObserver();
            if (mScrollStateObserver != null) {
                mScrollStateObserver.hashCode();
            }
            searchVideoView.setMScrollStateManager(gVar);
            C34246c dataProvider = searchVideoView.getDataProvider();
            if (dataProvider != null) {
                dataProvider.f80991h = this.f80787j;
            }
            C34246c dataProvider2 = searchVideoView.getDataProvider();
            if (dataProvider2 != null) {
                dataProvider2.f80992i = aVar;
            }
            C34246c dataProvider3 = searchVideoView.getDataProvider();
            if (dataProvider3 != null) {
                dataProvider3.f80984a = view;
            }
            C34246c dataProvider4 = searchVideoView.getDataProvider();
            if (dataProvider4 != null) {
                dataProvider4.f80995l = mo60496a();
            }
            C34246c dataProvider5 = searchVideoView.getDataProvider();
            if (dataProvider5 != null) {
                dataProvider5.f80996m = this.f80780b;
            }
            C34246c dataProvider6 = searchVideoView.getDataProvider();
            if (dataProvider6 != null) {
                dataProvider6.mo60667a("general_search");
            }
            searchVideoView.setMCoverView(imageView);
        }
    }
}
