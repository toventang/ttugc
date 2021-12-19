package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e */
public final class C70831e implements AbstractC75544f {

    /* renamed from: b */
    public static final C70832a f158582b = new C70832a((byte) 0);

    /* renamed from: a */
    public View f158583a;

    /* renamed from: c */
    private TextView f158584c;

    /* renamed from: d */
    private SimpleDraweeView f158585d;

    /* renamed from: e */
    private View f158586e;

    /* renamed from: f */
    private FrameLayout f158587f;

    /* renamed from: g */
    private boolean f158588g;

    /* renamed from: h */
    private final Runnable f158589h = new RunnableC70833b(this);

    /* renamed from: i */
    private final Effect f158590i;

    static {
        Covode.recordClassIndex(83322);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e$a */
    public static final class C70832a {
        static {
            Covode.recordClassIndex(83323);
        }

        private C70832a() {
        }

        public /* synthetic */ C70832a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Animation m125097a(float f, float f2) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
            alphaAnimation.setDuration(300);
            return alphaAnimation;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: b */
    public final boolean mo112005b() {
        return this.f158588g;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e$b */
    static final class RunnableC70833b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70831e f158591a;

        static {
            Covode.recordClassIndex(83324);
        }

        RunnableC70833b(C70831e eVar) {
            this.f158591a = eVar;
        }

        public final void run() {
            Animation a = C70832a.m125097a(1.0f, 0.0f);
            a.setAnimationListener(new Animation.AnimationListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a.C70831e.RunnableC70833b.animationAnimation$AnimationListenerC708341 */

                /* renamed from: a */
                final /* synthetic */ RunnableC70833b f158592a;

                static {
                    Covode.recordClassIndex(83325);
                }

                public final void onAnimationRepeat(Animation animation) {
                    C89219l.m154721d(animation, "");
                }

                public final void onAnimationStart(Animation animation) {
                    C89219l.m154721d(animation, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f158592a = r1;
                }

                public final void onAnimationEnd(Animation animation) {
                    C89219l.m154721d(animation, "");
                    this.f158592a.f158591a.mo112003a();
                }
            });
            View view = this.f158591a.f158583a;
            if (view != null) {
                view.startAnimation(a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112003a() {
        MethodCollector.m26663i(11211);
        View view = this.f158583a;
        if (view != null) {
            view.removeCallbacks(this.f158589h);
        }
        FrameLayout frameLayout = this.f158587f;
        if (frameLayout != null) {
            frameLayout.removeView(this.f158586e);
        }
        this.f158588g = false;
        MethodCollector.m26664o(11211);
    }

    public C70831e(Effect effect) {
        C89219l.m154721d(effect, "");
        this.f158590i = effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112004a(FrameLayout frameLayout) {
        View view;
        TextView textView;
        MethodCollector.m26663i(11210);
        if (frameLayout == null) {
            MethodCollector.m26664o(11210);
            return;
        }
        this.f158587f = frameLayout;
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.ahu, frameLayout, false);
        this.f158586e = a;
        FrameLayout frameLayout2 = this.f158587f;
        if (frameLayout2 != null) {
            frameLayout2.addView(a);
        }
        View view2 = this.f158586e;
        SimpleDraweeView simpleDraweeView = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.b3f);
        } else {
            view = null;
        }
        this.f158583a = view;
        View view3 = this.f158586e;
        if (view3 != null) {
            textView = (TextView) view3.findViewById(R.id.e97);
        } else {
            textView = null;
        }
        this.f158584c = textView;
        if (textView != null) {
            String hint = this.f158590i.getHint();
            if (hint == null) {
                hint = "";
            }
            textView.setText(hint);
        }
        View view4 = this.f158586e;
        if (view4 != null) {
            simpleDraweeView = (SimpleDraweeView) view4.findViewById(R.id.e98);
        }
        this.f158585d = simpleDraweeView;
        C71827ew.m126825a(simpleDraweeView, 8);
        View view5 = this.f158583a;
        if (view5 != null) {
            view5.startAnimation(C70832a.m125097a(0.0f, 1.0f));
        }
        View view6 = this.f158583a;
        if (view6 != null) {
            view6.postDelayed(this.f158589h, 5000);
        }
        this.f158588g = true;
        MethodCollector.m26664o(11210);
    }
}
