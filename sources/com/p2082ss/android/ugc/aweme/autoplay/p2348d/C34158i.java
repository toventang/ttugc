package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.i */
public final class C34158i implements AbstractView$OnAttachStateChangeListenerC34144b {

    /* renamed from: a */
    public final View f80770a;

    /* renamed from: b */
    private int f80771b;

    /* renamed from: c */
    private boolean f80772c;

    /* renamed from: d */
    private boolean f80773d;

    /* renamed from: e */
    private final AbstractC89244h f80774e = C89250i.m154773a((AbstractC89171a) new C34159a(this));

    /* renamed from: f */
    private boolean f80775f;

    /* renamed from: g */
    private AbstractC34146d f80776g;

    /* renamed from: h */
    private final boolean f80777h;

    static {
        Covode.recordClassIndex(41092);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: C */
    public final boolean mo60473C() {
        return this.f80773d;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: D */
    public final int mo60474D() {
        return this.f80771b;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.i$a */
    static final class C34159a extends AbstractC89220m implements AbstractC89171a<C34166l> {

        /* renamed from: a */
        final /* synthetic */ C34158i f80778a;

        static {
            Covode.recordClassIndex(41093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34159a(C34158i iVar) {
            super(0);
            this.f80778a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34166l invoke() {
            return new C34166l(this.f80778a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        this.f80772c = true;
        C34181a.m69861d(this);
        AbstractC34146d dVar = this.f80776g;
        if (dVar != null) {
            dVar.mo60424A();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        this.f80772c = false;
        AbstractC34146d dVar = this.f80776g;
        if (dVar != null) {
            dVar.mo60425B();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        AbstractC34146d dVar = this.f80776g;
        if (dVar != null) {
            return dVar.aZ_();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        this.f80772c = false;
        AbstractC34146d dVar = this.f80776g;
        if (dVar != null) {
            dVar.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        this.f80772c = false;
        AbstractC34146d dVar = this.f80776g;
        if (dVar != null) {
            dVar.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        AbstractC34146d dVar = this.f80776g;
        if (dVar != null) {
            return dVar.mo60468z();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: a */
    public final void mo60476a(AbstractC34146d dVar) {
        this.f80776g = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: a */
    public final void mo60477a(boolean z) {
        this.f80773d = z;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f80775f = true;
        C34181a.m69857a(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f80775f = false;
        C34181a.m69859b(this);
        if (this.f80777h) {
            mo60425B();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: a */
    public final void mo60475a(int i) {
        AbstractC51064i iVar = (AbstractC51064i) this.f80774e.getValue();
        Objects.requireNonNull(iVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.autoplay.video.SearchMultiVideoScrollObserver");
        ((C34166l) iVar).f80798a = i;
        this.f80771b = i;
    }

    public C34158i(View view, boolean z) {
        this.f80770a = view;
        this.f80777h = z;
    }
}
