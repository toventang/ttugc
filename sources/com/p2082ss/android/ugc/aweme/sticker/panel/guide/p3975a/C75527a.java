package com.p2082ss.android.ugc.aweme.sticker.panel.guide.p3975a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.effectplatform.C46402a;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75457a;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.a.a */
public final class C75527a implements AbstractC75544f {

    /* renamed from: a */
    public Effect f169752a;

    /* renamed from: b */
    public View f169753b;

    /* renamed from: c */
    private TextView f169754c;

    /* renamed from: d */
    private SimpleDraweeView f169755d;

    /* renamed from: e */
    private View f169756e;

    /* renamed from: f */
    private FrameLayout f169757f;

    /* renamed from: g */
    private boolean f169758g;

    /* renamed from: h */
    private Runnable f169759h = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.p3975a.C75527a.RunnableC755281 */

        static {
            Covode.recordClassIndex(88452);
        }

        public final void run() {
            Animation a = C75457a.m132326a(1.0f, 0.0f, 300);
            a.setAnimationListener(new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.p3975a.C75527a.RunnableC755281.animationAnimation$AnimationListenerC755291 */

                static {
                    Covode.recordClassIndex(88453);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C75527a.this.mo112003a();
                }
            });
            C75527a.this.f169753b.startAnimation(a);
        }
    };

    static {
        Covode.recordClassIndex(88451);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: b */
    public final boolean mo112005b() {
        return this.f169758g;
    }

    public C75527a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112003a() {
        View view;
        MethodCollector.m26663i(7781);
        if (this.f169752a == null || (view = this.f169753b) == null || this.f169757f == null) {
            MethodCollector.m26664o(7781);
            return;
        }
        view.removeCallbacks(this.f169759h);
        this.f169757f.removeView(this.f169756e);
        this.f169758g = false;
        MethodCollector.m26664o(7781);
    }

    public C75527a(Effect effect) {
        this.f169752a = effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112004a(FrameLayout frameLayout) {
        boolean z;
        MethodCollector.m26663i(7615);
        this.f169757f = frameLayout;
        if (this.f169752a == null) {
            MethodCollector.m26664o(7615);
            return;
        }
        int i = 0;
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.ahu, frameLayout, false);
        this.f169756e = a;
        this.f169757f.addView(a, 0);
        this.f169753b = this.f169756e.findViewById(R.id.b3f);
        this.f169754c = (TextView) this.f169756e.findViewById(R.id.e97);
        if (this.f169752a.getHint() != null) {
            this.f169754c.setText(this.f169752a.getHint());
        }
        this.f169755d = (SimpleDraweeView) this.f169756e.findViewById(R.id.e98);
        if (this.f169752a.getHintIcon() == null || C84904k.m145909a(this.f169752a.getHintIcon().getUrlList())) {
            z = false;
        } else {
            z = true;
        }
        SimpleDraweeView simpleDraweeView = this.f169755d;
        if (!z) {
            i = 8;
        }
        C71827ew.m126825a(simpleDraweeView, i);
        if (z) {
            C84402a.m145169a(this.f169755d, C46402a.m89551a(this.f169752a.getHintIcon()), -1, -1);
        }
        this.f169753b.startAnimation(C75457a.m132326a(0.0f, 1.0f, 300));
        this.f169753b.postDelayed(this.f169759h, 5000);
        this.f169758g = true;
        MethodCollector.m26664o(7615);
    }
}
