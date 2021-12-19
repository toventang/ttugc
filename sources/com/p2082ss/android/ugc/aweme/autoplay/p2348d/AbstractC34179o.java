package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.o */
public abstract class AbstractC34179o extends AbstractView$OnAttachStateChangeListenerC41671b implements AbstractView$OnAttachStateChangeListenerC34144b {

    /* renamed from: a */
    private final AbstractC89244h f80829a;

    /* renamed from: f */
    public final boolean f80830f;

    static {
        Covode.recordClassIndex(41113);
    }

    /* renamed from: a */
    private AbstractView$OnAttachStateChangeListenerC34144b mo60336a() {
        return (AbstractView$OnAttachStateChangeListenerC34144b) this.f80829a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        mo60336a().mo60424A();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        mo60336a().mo60425B();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        mo60336a().bg_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        mo60336a().bi_();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.o$a */
    static final class C34180a extends AbstractC89220m implements AbstractC89171a<C34158i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34179o f80831a;

        /* renamed from: b */
        final /* synthetic */ View f80832b;

        static {
            Covode.recordClassIndex(41114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34180a(AbstractC34179o oVar, View view) {
            super(0);
            this.f80831a = oVar;
            this.f80832b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34158i invoke() {
            return new C34158i(this.f80832b, this.f80831a.f80830f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: C */
    public final boolean mo60473C() {
        return mo60336a().mo60473C();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: D */
    public final int mo60474D() {
        return mo60336a().mo60474D();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return mo60336a().mo60468z();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: a */
    public final void mo60475a(int i) {
        mo60336a().mo60475a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewAttachedToWindow(view);
        mo60336a().onViewAttachedToWindow(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewDetachedFromWindow(view);
        mo60336a().onViewDetachedFromWindow(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC34179o(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f80830f = true;
        this.f80829a = C89250i.m154773a((AbstractC89171a) new C34180a(this, view));
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: a */
    public final void mo60476a(AbstractC34146d dVar) {
        mo60336a().mo60476a(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b
    /* renamed from: a */
    public final void mo60477a(boolean z) {
        mo60336a().mo60477a(z);
    }

    public /* synthetic */ AbstractC34179o(View view, byte b) {
        this(view);
    }
}
