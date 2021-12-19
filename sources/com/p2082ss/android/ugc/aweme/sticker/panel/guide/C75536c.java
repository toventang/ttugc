package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.effectplatform.C46402a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75457a;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75547h;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.c */
public final class C75536c implements AbstractC75544f {

    /* renamed from: a */
    public final Effect f169770a;

    /* renamed from: b */
    public final ExtraParams f169771b;

    /* renamed from: c */
    public View f169772c;

    /* renamed from: d */
    public ConstraintLayout f169773d;

    /* renamed from: e */
    public TextView f169774e;

    /* renamed from: f */
    public AbstractC75547h f169775f;

    /* renamed from: g */
    public boolean f169776g;

    /* renamed from: h */
    public Runnable f169777h = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75536c.RunnableC755371 */

        static {
            Covode.recordClassIndex(88461);
        }

        public final void run() {
            Animation a = C75457a.m132326a(0.0f, 1.0f, 200);
            a.setAnimationListener(new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75536c.RunnableC755371.animationAnimation$AnimationListenerC755381 */

                static {
                    Covode.recordClassIndex(88462);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C75536c.this.f169776g = true;
                    C75536c.this.f169773d.postDelayed(C75536c.this.f169777h, 3000);
                }
            });
            C75536c.this.f169774e.startAnimation(a);
        }
    };

    /* renamed from: i */
    public Runnable f169778i = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75536c.RunnableC755392 */

        static {
            Covode.recordClassIndex(88463);
        }

        public final void run() {
            Animation a = C75457a.m132326a(1.0f, 0.0f, 300);
            a.setAnimationListener(new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75536c.RunnableC755392.animationAnimation$AnimationListenerC755401 */

                static {
                    Covode.recordClassIndex(88464);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C75536c.this.mo112003a();
                }

                public final void onAnimationStart(Animation animation) {
                    C75536c.this.f169776g = false;
                }
            });
            C75536c.this.f169773d.startAnimation(a);
        }
    };

    /* renamed from: j */
    private FrameLayout f169779j;

    /* renamed from: k */
    private boolean f169780k;

    static {
        Covode.recordClassIndex(88460);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: b */
    public final boolean mo112005b() {
        return this.f169780k;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112003a() {
        MethodCollector.m26663i(5624);
        Effect effect = this.f169770a;
        if (effect == null || TextUtils.isEmpty(effect.getExtra())) {
            MethodCollector.m26664o(5624);
            return;
        }
        this.f169774e.clearAnimation();
        this.f169773d.removeCallbacks(this.f169778i);
        this.f169773d.removeCallbacks(this.f169777h);
        this.f169779j.removeView(this.f169772c);
        this.f169780k = false;
        MethodCollector.m26664o(5624);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112004a(FrameLayout frameLayout) {
        MethodCollector.m26663i(5622);
        Effect effect = this.f169770a;
        if (effect == null || TextUtils.isEmpty(effect.getExtra())) {
            MethodCollector.m26664o(5622);
            return;
        }
        ExtraParams extraParams = this.f169771b;
        if (extraParams == null || !extraParams.isGifValid()) {
            MethodCollector.m26664o(5622);
            return;
        }
        this.f169779j = frameLayout;
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.ahs, frameLayout, false);
        this.f169772c = a;
        this.f169779j.addView(a, 0);
        this.f169774e = (TextView) this.f169772c.findViewById(R.id.e97);
        String hint = this.f169770a.getHint();
        if (TextUtils.isEmpty(hint)) {
            this.f169774e.setVisibility(8);
        } else {
            this.f169774e.setVisibility(0);
            this.f169774e.setText(hint);
        }
        final FrameLayout frameLayout2 = (FrameLayout) this.f169772c.findViewById(R.id.e8r);
        this.f169773d = (ConstraintLayout) this.f169772c.findViewById(R.id.b3f);
        if (2 == this.f169771b.gifType) {
            C0550b bVar = new C0550b();
            bVar.mo2451a(this.f169773d);
            bVar.mo2453b(R.id.e8r, (int) C84912r.m145930a(frameLayout.getContext(), 192.0f));
            bVar.mo2450a(R.id.e8r, "3:4");
            bVar.mo2454b(this.f169773d);
        }
        this.f169779j.findViewById(R.id.e89);
        int a2 = (int) C84912r.m145930a(frameLayout.getContext(), 264.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f169773d.getLayoutParams();
        layoutParams.height = (C70636dh.m124836e(frameLayout.getContext()) - a2) - ((int) C84912r.m145930a(frameLayout.getContext(), 112.0f));
        this.f169773d.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f169772c.getLayoutParams();
        layoutParams2.height = C70636dh.m124836e(frameLayout.getContext()) - a2;
        this.f169772c.setLayoutParams(layoutParams2);
        this.f169773d.post(this.f169777h);
        this.f169780k = true;
        if (this.f169770a.getHintIcon() == null || this.f169770a.getHintIcon().getUrlList() == null || this.f169770a.getHintIcon().getUrlList().size() == 0) {
            this.f169773d.postDelayed(this.f169778i, 5000);
            MethodCollector.m26664o(5622);
            return;
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) this.f169772c.findViewById(R.id.e98);
        UrlModel a3 = C46402a.m89551a(this.f169770a.getHintIcon());
        C755413 r3 = new C24202c<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75536c.C755413 */

            static {
                Covode.recordClassIndex(88465);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onFailure(String str, Throwable th) {
                if (C75536c.this.f169775f != null) {
                    C75536c.this.f169775f.mo119249a(false, C75536c.this.f169770a, AbstractC75547h.EnumC75548a.GIF);
                }
                if (C75536c.this.f169776g) {
                    C75536c.this.f169773d.postDelayed(C75536c.this.f169778i, 5000);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                frameLayout2.setBackgroundResource(R.drawable.u1);
                C75536c cVar = C75536c.this;
                ExtraParams extraParams = cVar.f169771b;
                View findViewById = cVar.f169772c.findViewById(R.id.e8s);
                if (1 == extraParams.manualClose) {
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(new View$OnClickListenerC75542d(cVar));
                } else {
                    findViewById.setVisibility(8);
                }
                if (animatable instanceof C24290a) {
                    C24290a aVar = (C24290a) animatable;
                    aVar.f57586a = 2;
                    aVar.f57587b = true;
                    animatable.start();
                    long b = aVar.mo40071b();
                    if (b > 0 && C75536c.this.f169772c != null) {
                        C75536c.this.f169772c.postDelayed(new RunnableC75543e(this, animatable), b * 2);
                    }
                }
                if (C75536c.this.f169775f != null) {
                    C75536c.this.f169775f.mo119249a(true, C75536c.this.f169770a, AbstractC75547h.EnumC75548a.GIF);
                }
            }
        };
        if (simpleDraweeView == null || a3.getUrlList() == null || a3.getUrlList().size() == 0) {
            MethodCollector.m26664o(5622);
            return;
        }
        if (simpleDraweeView.getContext() != null) {
            simpleDraweeView.getContext().getApplicationContext();
        }
        C24636b[] a4 = C84402a.m145181a(a3, (C24363d) null, (AbstractC24641d) null);
        if (a4 == null || a4.length == 0) {
            MethodCollector.m26664o(5622);
            return;
        }
        C24185e b = C24182c.m45843b();
        b.f57309m = simpleDraweeView.getController();
        C24185e eVar = (C24185e) b.mo39823a(a4);
        eVar.f57306j = false;
        eVar.f57303g = r3;
        simpleDraweeView.setController(eVar.mo39827e());
        MethodCollector.m26664o(5622);
    }

    public C75536c(Effect effect, ExtraParams extraParams, AbstractC75547h hVar) {
        this.f169770a = effect;
        this.f169771b = extraParams;
        this.f169775f = hVar;
    }
}
