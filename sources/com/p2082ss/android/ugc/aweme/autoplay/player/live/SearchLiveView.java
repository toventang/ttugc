package com.p2082ss.android.ugc.aweme.autoplay.player.live;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.SearchLiveView */
public final class SearchLiveView extends FrameLayout implements AbstractC34186b.AbstractC34192d, AbstractC34203b {

    /* renamed from: a */
    public final C34205d f80861a;

    /* renamed from: b */
    private boolean f80862b;

    /* renamed from: c */
    private final AbstractC89244h f80863c;

    /* renamed from: d */
    private boolean f80864d;

    /* renamed from: e */
    private ImageView f80865e;

    static {
        Covode.recordClassIndex(41132);
    }

    public SearchLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    public final C34215e getDataProvider() {
        return (C34215e) this.f80863c.getValue();
    }

    public final C34205d getLiveCore() {
        return this.f80861a;
    }

    public final ImageView getMCoverView() {
        return this.f80865e;
    }

    public final boolean getOutCorner() {
        return this.f80862b;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return this.f80861a;
    }

    private final AbstractC34186b.AbstractC34189c getMediaHelper() {
        return getDataProvider().f80896e;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return this.f80861a.getMLiveStarted();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void al_() {
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: f */
    public final void mo60523f() {
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: g */
    public final void mo60524g() {
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    public final String getLivePlayerTag() {
        return this.f80861a.getLivePlayerTag();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: h */
    public final void mo60530h() {
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: i */
    public final void mo60531i() {
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: l */
    public final void mo60534l() {
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.SearchLiveView$a */
    static final class C34200a extends AbstractC89220m implements AbstractC89171a<C34215e> {

        /* renamed from: a */
        final /* synthetic */ SearchLiveView f80868a;

        static {
            Covode.recordClassIndex(41135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34200a(SearchLiveView searchLiveView) {
            super(0);
            this.f80868a = searchLiveView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34215e invoke() {
            return this.f80868a.getLiveCore().getDataProvider();
        }
    }

    /* renamed from: m */
    private final void m69894m() {
        this.f80861a.mo60542g();
        this.f80864d = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        AbstractC34186b.AbstractC34189c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.mo60340a(150);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        AbstractC34186b.AbstractC34189c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.mo60344e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void am_() {
        m69894m();
        AbstractC34202a aVar = getDataProvider().f80904m;
        if (aVar != null) {
            aVar.am_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        AbstractC34186b.AbstractC34189c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        AbstractC34186b.AbstractC34189c mediaHelper = getMediaHelper();
        if (mediaHelper != null) {
            mediaHelper.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: e */
    public final void mo60522e() {
        this.f80861a.mo60541e();
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: j */
    public final void mo60532j() {
        m69894m();
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: k */
    public final void mo60533k() {
        this.f80864d = true;
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60365a() {
        LiveRoomStruct b = getDataProvider().mo60575b();
        if ((b == null || !b.liveTypeAudio) && this.f80864d) {
            this.f80864d = false;
            this.f80861a.mo60556h();
        }
        AbstractC34202a aVar = getDataProvider().f80904m;
        if (aVar != null) {
            aVar.mo60365a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void ak_() {
        if (!this.f80862b && Build.VERSION.SDK_INT >= 21 && getContext() != null) {
            setOutlineProvider(new C34201b(this));
            setClipToOutline(true);
        }
        AbstractC34202a aVar = getDataProvider().f80904m;
    }

    public final void setOutCorner(boolean z) {
        this.f80862b = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.SearchLiveView$b */
    public static final class C34201b extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ SearchLiveView f80869a;

        static {
            Covode.recordClassIndex(41136);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34201b(SearchLiveView searchLiveView) {
            this.f80869a = searchLiveView;
        }

        public final void getOutline(View view, Outline outline) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C13628n.m24520b(this.f80869a.getContext(), 2.0f));
        }
    }

    public final void setMCoverView(ImageView imageView) {
        this.f80865e = imageView;
        this.f80861a.setMCoverView(imageView);
    }

    /* renamed from: a */
    private final void m69892a(Aweme aweme) {
        this.f80864d = true;
        this.f80861a.mo60539a(aweme);
        this.f80861a.mo60541e();
    }

    /* renamed from: a */
    private final void m69893a(C67568r rVar) {
        getDataProvider().f80899h = rVar;
        C42460j.C42461a.m84865a(this, rVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60519a(String str) {
        C89219l.m154721d(str, "");
        if (getDataProvider().f80904m != null) {
            C89219l.m154721d(str, "");
        }
    }

    /* renamed from: a */
    public final void mo60518a(Aweme aweme, C67568r rVar) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(rVar, "");
        m69893a(rVar);
        m69892a(aweme);
    }

    private /* synthetic */ SearchLiveView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchLiveView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8113);
        C34205d dVar = new C34205d(context, attributeSet, 0);
        this.f80861a = dVar;
        this.f80863c = C89250i.m154773a((AbstractC89171a) new C34200a(this));
        this.f80864d = true;
        dVar.mo60540a(new AbstractC89171a<AbstractC34203b>(this) {
            /* class com.p2082ss.android.ugc.aweme.autoplay.player.live.SearchLiveView.C341981 */

            /* renamed from: a */
            final /* synthetic */ SearchLiveView f80866a;

            static {
                Covode.recordClassIndex(41133);
            }

            {
                this.f80866a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AbstractC34203b invoke() {
                return new C34216f(this.f80866a.getDataProvider());
            }
        });
        dVar.mo60540a(new AbstractC89171a<AbstractC34203b>(this) {
            /* class com.p2082ss.android.ugc.aweme.autoplay.player.live.SearchLiveView.C341992 */

            /* renamed from: a */
            final /* synthetic */ SearchLiveView f80867a;

            static {
                Covode.recordClassIndex(41134);
            }

            {
                this.f80867a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ AbstractC34203b invoke() {
                return this.f80867a;
            }
        });
        addView(dVar);
        MethodCollector.m26664o(8113);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60366a(View view, int i, int i2) {
        AbstractC34202a aVar = getDataProvider().f80904m;
        if (aVar != null) {
            aVar.mo60366a(view, i, i2);
        }
    }
}
