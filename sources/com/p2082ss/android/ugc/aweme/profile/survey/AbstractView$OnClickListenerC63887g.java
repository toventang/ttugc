package com.p2082ss.android.ugc.aweme.profile.survey;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.g */
public abstract class AbstractView$OnClickListenerC63887g implements View.OnClickListener {

    /* renamed from: q */
    private static final boolean f144820q = false;

    /* renamed from: a */
    public ViewStub f144821a;

    /* renamed from: b */
    public View f144822b;

    /* renamed from: c */
    public View f144823c;

    /* renamed from: d */
    public TextView f144824d;

    /* renamed from: e */
    public TextView f144825e;

    /* renamed from: f */
    public View f144826f;

    /* renamed from: g */
    public TextView f144827g;

    /* renamed from: h */
    public TextView f144828h;

    /* renamed from: i */
    public TextView f144829i;

    /* renamed from: j */
    public TextView f144830j;

    /* renamed from: k */
    public AbstractC63882c f144831k;

    /* renamed from: l */
    public C40760a f144832l;

    /* renamed from: m */
    Animator f144833m;

    /* renamed from: n */
    public boolean f144834n;

    /* renamed from: o */
    public boolean f144835o;

    /* renamed from: p */
    public boolean f144836p;

    /* renamed from: r */
    private ValueAnimator f144837r;

    static {
        Covode.recordClassIndex(75315);
    }

    /* renamed from: b */
    public final void mo103426b() {
        View view = this.f144822b;
        if (view != null) {
            view.setVisibility(8);
        }
        m115586d();
        this.f144834n = false;
    }

    /* renamed from: d */
    private void m115586d() {
        Animator animator = this.f144833m;
        if (animator != null && this.f144837r != null) {
            if (animator.isStarted() || this.f144833m.isRunning()) {
                this.f144833m.cancel();
            }
            if (this.f144837r.isStarted() || this.f144837r.isRunning()) {
                this.f144837r.cancel();
            }
        }
    }

    /* renamed from: a */
    public final void mo103425a() {
        View view = this.f144822b;
        view.setTranslationY((float) view.getHeight());
        ViewGroup.LayoutParams layoutParams = this.f144826f.getLayoutParams();
        layoutParams.height = this.f144822b.getHeight();
        this.f144826f.setLayoutParams(layoutParams);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f144822b, View.TRANSLATION_Y, (float) this.f144822b.getMeasuredHeight(), 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.profile.survey.AbstractView$OnClickListenerC63887g.C638881 */

            static {
                Covode.recordClassIndex(75316);
            }

            public final void onAnimationEnd(Animator animator) {
                AbstractView$OnClickListenerC63887g.this.f144834n = true;
                if (AbstractView$OnClickListenerC63887g.this.f144831k != null) {
                    AbstractView$OnClickListenerC63887g.this.f144831k.mo103421a(AbstractView$OnClickListenerC63887g.this.f144832l);
                }
            }

            public final void onAnimationStart(Animator animator) {
                AbstractView$OnClickListenerC63887g.this.f144822b.setVisibility(0);
                AbstractView$OnClickListenerC63887g.this.f144823c.setVisibility(0);
                AbstractView$OnClickListenerC63887g.this.f144823c.setAlpha(1.0f);
                AbstractView$OnClickListenerC63887g.this.f144826f.setVisibility(8);
            }
        });
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo103427c() {
        if (this.f144837r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 0.0f, 1.0f);
            this.f144837r = ofFloat;
            ofFloat.addUpdateListener(new C63891i(this));
            this.f144837r.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.profile.survey.AbstractView$OnClickListenerC63887g.C638892 */

                static {
                    Covode.recordClassIndex(75317);
                }

                public final void onAnimationStart(Animator animator) {
                    AbstractView$OnClickListenerC63887g.this.f144826f.setAlpha(0.0f);
                    AbstractView$OnClickListenerC63887g.this.f144826f.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    AbstractView$OnClickListenerC63887g gVar = AbstractView$OnClickListenerC63887g.this;
                    if (!gVar.f144835o) {
                        if (gVar.f144833m == null) {
                            gVar.f144833m = ObjectAnimator.ofFloat(gVar.f144822b, View.TRANSLATION_Y, 0.0f, (float) gVar.f144822b.getHeight());
                            gVar.f144833m.setDuration(300);
                            gVar.f144833m.setInterpolator(new DecelerateInterpolator());
                            gVar.f144833m.setStartDelay(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                        if (!gVar.f144833m.isStarted() && !gVar.f144833m.isRunning()) {
                            gVar.f144833m.start();
                        }
                    }
                }
            });
            this.f144837r.setDuration(600L);
        }
        if (!this.f144837r.isStarted() && !this.f144837r.isRunning()) {
            this.f144837r.start();
        }
    }

    AbstractView$OnClickListenerC63887g(ViewStub viewStub) {
        this.f144821a = viewStub;
        if (viewStub.getLayoutResource() <= 0) {
            this.f144821a.setLayoutResource(R.layout.aog);
        }
    }

    /* renamed from: a */
    public static boolean m115585a(C40760a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f95418c) || TextUtils.isEmpty(aVar.f95419d) || TextUtils.isEmpty(aVar.f95420e) || TextUtils.isEmpty(aVar.f95421f) || TextUtils.isEmpty(aVar.f95422g)) {
            return false;
        }
        return true;
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.ecq) {
            AbstractC63882c cVar = this.f144831k;
            if (cVar != null) {
                cVar.mo103422a(this.f144832l, 3, "");
            }
        } else if (id == R.id.ecs) {
            AbstractC63882c cVar2 = this.f144831k;
            if (cVar2 == null) {
                return;
            }
            if (this.f144836p) {
                C40760a aVar = this.f144832l;
                if (!TextUtils.isEmpty(aVar.f95426k)) {
                    str4 = this.f144832l.f95426k;
                } else {
                    str4 = this.f144832l.f95420e;
                }
                cVar2.mo103422a(aVar, 2, str4);
                return;
            }
            C40760a aVar2 = this.f144832l;
            if (!TextUtils.isEmpty(aVar2.f95425j)) {
                str3 = this.f144832l.f95425j;
            } else {
                str3 = this.f144832l.f95419d;
            }
            cVar2.mo103422a(aVar2, 1, str3);
        } else if (id == R.id.ecw) {
            AbstractC63882c cVar3 = this.f144831k;
            if (cVar3 == null) {
                return;
            }
            if (this.f144836p) {
                C40760a aVar3 = this.f144832l;
                if (!TextUtils.isEmpty(aVar3.f95425j)) {
                    str2 = this.f144832l.f95425j;
                } else {
                    str2 = this.f144832l.f95419d;
                }
                cVar3.mo103422a(aVar3, 1, str2);
                return;
            }
            C40760a aVar4 = this.f144832l;
            if (!TextUtils.isEmpty(aVar4.f95426k)) {
                str = this.f144832l.f95426k;
            } else {
                str = this.f144832l.f95420e;
            }
            cVar3.mo103422a(aVar4, 2, str);
        } else if (id == R.id.ecv) {
            this.f144835o = true;
            m115586d();
            AbstractC63882c cVar4 = this.f144831k;
            if (cVar4 != null) {
                cVar4.mo103420a();
            }
        }
    }
}
