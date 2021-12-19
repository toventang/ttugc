package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.text.TextUtils;
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
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75457a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.a */
public final class C75524a implements AbstractC75544f {

    /* renamed from: a */
    public View f169741a;

    /* renamed from: b */
    private TextView f169742b;

    /* renamed from: c */
    private SimpleDraweeView f169743c;

    /* renamed from: d */
    private View f169744d;

    /* renamed from: e */
    private FrameLayout f169745e;

    /* renamed from: f */
    private Effect f169746f;

    /* renamed from: g */
    private final ShortVideoContext f169747g;

    /* renamed from: h */
    private boolean f169748h;

    /* renamed from: i */
    private Runnable f169749i = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75524a.RunnableC755251 */

        static {
            Covode.recordClassIndex(88449);
        }

        public final void run() {
            Animation a = C75457a.m132326a(1.0f, 0.0f, 300);
            a.setAnimationListener(new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75524a.RunnableC755251.animationAnimation$AnimationListenerC755261 */

                static {
                    Covode.recordClassIndex(88450);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C75524a.this.mo112003a();
                }
            });
            C75524a.this.f169741a.startAnimation(a);
        }
    };

    static {
        Covode.recordClassIndex(88448);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: b */
    public final boolean mo112005b() {
        return this.f169748h;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112003a() {
        MethodCollector.m26663i(8581);
        Effect effect = this.f169746f;
        if (effect == null || TextUtils.isEmpty(effect.getHint())) {
            MethodCollector.m26664o(8581);
            return;
        }
        this.f169742b.removeCallbacks(this.f169749i);
        this.f169745e.removeView(this.f169744d);
        this.f169748h = false;
        MethodCollector.m26664o(8581);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112004a(FrameLayout frameLayout) {
        boolean z;
        MethodCollector.m26663i(8580);
        this.f169745e = frameLayout;
        Effect effect = this.f169746f;
        if (effect == null || TextUtils.isEmpty(effect.getHint())) {
            MethodCollector.m26664o(8580);
            return;
        }
        int i = 0;
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.ahu, frameLayout, false);
        this.f169744d = a;
        this.f169745e.addView(a);
        this.f169741a = this.f169744d.findViewById(R.id.b3f);
        this.f169742b = (TextView) this.f169744d.findViewById(R.id.e97);
        String hint = this.f169746f.getHint();
        if (this.f169747g.f155817b.mo109889b() || this.f169747g.f155817b.mo109890c() || this.f169747g.mo110022c()) {
            MethodCollector.m26664o(8580);
        } else if (this.f169747g.f155817b.f155652h.mo110093c() == null || C69823b.m123387a(this.f169747g.f155817b.f155652h.mo110093c())) {
            File file = null;
            if (this.f169747g.f155817b.f155652h.mo110093c() != null) {
                file = new File(this.f169747g.f155817b.f155652h.mo110093c());
            }
            String a2 = C63244g.m114602a().mo73291s().mo101742a(this.f169747g.f155817b.f155669y);
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar != null && cVar.getStrongBeatUrl() != null && !TextUtils.isEmpty(a2) && !new File(a2).exists()) {
                C85041d.m146226b(frameLayout.getContext(), R.string.yk).mo129984b();
                MethodCollector.m26664o(8580);
            } else if (file != null) {
                MethodCollector.m26664o(8580);
            } else {
                this.f169742b.setText(hint);
                this.f169743c = (SimpleDraweeView) this.f169744d.findViewById(R.id.e98);
                if (this.f169746f.getHintIcon() == null || C84904k.m145909a(this.f169746f.getHintIcon().getUrlList())) {
                    z = false;
                } else {
                    z = true;
                }
                SimpleDraweeView simpleDraweeView = this.f169743c;
                if (!z) {
                    i = 8;
                }
                C71827ew.m126825a(simpleDraweeView, i);
                if (z) {
                    C84402a.m145169a(this.f169743c, C46402a.m89551a(this.f169746f.getHintIcon()), -1, -1);
                }
                this.f169741a.startAnimation(C75457a.m132326a(0.0f, 1.0f, 300));
                this.f169741a.postDelayed(this.f169749i, 5000);
                this.f169748h = true;
                MethodCollector.m26664o(8580);
            }
        } else {
            C85041d.m146222a(frameLayout.getContext(), frameLayout.getContext().getString(R.string.yl)).mo129984b();
            MethodCollector.m26664o(8580);
        }
    }

    public C75524a(Effect effect, ShortVideoContext shortVideoContext) {
        this.f169746f = effect;
        this.f169747g = shortVideoContext;
    }
}
