package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.l */
public final class C75562l implements AbstractC75544f {

    /* renamed from: c */
    public static final C75563a f169816c = new C75563a((byte) 0);

    /* renamed from: a */
    public FrameLayout f169817a;

    /* renamed from: b */
    public View f169818b;

    /* renamed from: d */
    private Effect f169819d;

    /* renamed from: e */
    private boolean f169820e;

    static {
        Covode.recordClassIndex(88486);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.l$a */
    public static final class C75563a {
        static {
            Covode.recordClassIndex(88487);
        }

        private C75563a() {
        }

        public /* synthetic */ C75563a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: b */
    public final boolean mo112005b() {
        return this.f169820e;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112003a() {
        if (this.f169819d != null) {
            View view = this.f169818b;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(150).setListener(new C75564b(this)).start();
            }
            this.f169820e = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.l$b */
    public static final class C75564b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C75562l f169821a;

        static {
            Covode.recordClassIndex(88488);
        }

        C75564b(C75562l lVar) {
            this.f169821a = lVar;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(5454);
            C89219l.m154721d(animator, "");
            FrameLayout frameLayout = this.f169821a.f169817a;
            if (frameLayout != null) {
                frameLayout.removeView(this.f169821a.f169818b);
                MethodCollector.m26664o(5454);
                return;
            }
            MethodCollector.m26664o(5454);
        }
    }

    public C75562l(Effect effect) {
        this.f169819d = effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112004a(FrameLayout frameLayout) {
        MethodCollector.m26663i(5458);
        if (this.f169819d == null || frameLayout == null) {
            MethodCollector.m26664o(5458);
            return;
        }
        this.f169817a = frameLayout;
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.ahy, frameLayout, false);
        this.f169818b = a;
        FrameLayout frameLayout2 = this.f169817a;
        if (frameLayout2 != null) {
            frameLayout2.addView(a);
            View view = this.f169818b;
            if (view != null) {
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).setDuration(150).start();
            }
            this.f169820e = true;
            MethodCollector.m26664o(5458);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(5458);
        throw nullPointerException;
    }
}
