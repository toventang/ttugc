package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.widget.C4128c;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.service.animation.p623b.C10651a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class LiveNewSendGiftAnimationView extends FrameLayout {

    /* renamed from: a */
    public int f25700a;

    /* renamed from: b */
    public int f25701b;

    /* renamed from: c */
    public ComboEffectAnimationView f25702c;

    /* renamed from: d */
    private Context f25703d;

    /* renamed from: e */
    private View f25704e;

    /* renamed from: f */
    private LiveTextView f25705f;

    /* renamed from: g */
    private AnimatorSet f25706g;

    /* renamed from: h */
    private EnumC10674a f25707h;

    /* renamed from: i */
    private AbstractC8812b f25708i;

    /* renamed from: j */
    private RoundWaveAnimationView f25709j;

    /* renamed from: k */
    private ComboProgressAnimationView f25710k;

    static {
        Covode.recordClassIndex(12264);
    }

    /* renamed from: c */
    private boolean m19242c() {
        AbstractC8812b bVar = this.f25708i;
        if (bVar == null || !(bVar.f21695b instanceof Prop) || ((Prop) this.f25708i.f21695b).count >= this.f25701b) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$4 */
    static /* synthetic */ class C106734 {

        /* renamed from: a */
        static final /* synthetic */ int[] f25717a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 12268(0x2fec, float:1.7191E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$a[] r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.EnumC10674a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.C106734.f25717a = r2
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.EnumC10674a.Fast     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.C106734.f25717a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.EnumC10674a.Special     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.C106734.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView$a */
    public enum EnumC10674a {
        Normal,
        Special,
        Fast;

        static {
            Covode.recordClassIndex(12269);
        }
    }

    /* renamed from: b */
    private void m19240b() {
        AnimatorSet animatorSet = this.f25706g;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f25706g.removeAllListeners();
            this.f25706g.cancel();
        }
        this.f25706g = null;
        View view = this.f25704e;
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public final void mo17590a() {
        this.f25701b = 0;
        m19240b();
        setScaleX(1.0f);
        setScaleY(1.0f);
        View view = this.f25704e;
        if (view != null) {
            view.setRotation(0.0f);
        }
        RoundWaveAnimationView roundWaveAnimationView = this.f25709j;
        if (roundWaveAnimationView != null) {
            roundWaveAnimationView.mo17596b();
        }
        ComboEffectAnimationView comboEffectAnimationView = this.f25702c;
        if (comboEffectAnimationView != null) {
            comboEffectAnimationView.mo17561a();
        }
        ComboProgressAnimationView comboProgressAnimationView = this.f25710k;
        if (comboProgressAnimationView != null) {
            comboProgressAnimationView.mo17581d();
        }
    }

    public void setPanel(AbstractC8812b bVar) {
        this.f25708i = bVar;
    }

    public void setAnimationType(EnumC10674a aVar) {
        this.f25707h = aVar;
        if (C106734.f25717a[aVar.ordinal()] == 1) {
            this.f25710k.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo17591a(Runnable runnable) {
        if (m19242c()) {
            this.f25701b++;
            if (this.f25700a == 0) {
                m19241c(runnable);
            } else {
                this.f25700a = 1;
                m19243d(new RunnableC10680b(this, runnable));
            }
            RoundWaveAnimationView roundWaveAnimationView = this.f25709j;
            if (roundWaveAnimationView != null) {
                roundWaveAnimationView.mo17595a();
            }
            ComboEffectAnimationView comboEffectAnimationView = this.f25702c;
            if (comboEffectAnimationView != null) {
                comboEffectAnimationView.mo17562a(this.f25701b);
            }
            ComboProgressAnimationView comboProgressAnimationView = this.f25710k;
            if (comboProgressAnimationView != null) {
                comboProgressAnimationView.mo17578a();
            }
        }
    }

    /* renamed from: b */
    public final void mo17592b(final Runnable runnable) {
        m19240b();
        this.f25706g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25704e, "rotation", 0.0f, 360.0f);
        this.f25706g.playTogether(ofFloat);
        this.f25706g.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.f25706g.addListener(new C10651a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.C106712 */

            static {
                Covode.recordClassIndex(12266);
            }

            @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LiveNewSendGiftAnimationView.this.f25700a = 0;
                LiveNewSendGiftAnimationView.this.f25701b = 0;
                if (LiveNewSendGiftAnimationView.this.f25702c != null) {
                    LiveNewSendGiftAnimationView.this.f25702c.mo17562a(LiveNewSendGiftAnimationView.this.f25701b);
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f25706g.start();
    }

    /* renamed from: c */
    private void m19241c(final Runnable runnable) {
        m19240b();
        this.f25706g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25704e, "scaleX", 1.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25704e, "scaleY", 1.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f25705f, "scaleX", 1.0f, 1.1f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f25705f, "scaleY", 1.0f, 1.1f, 1.0f);
        this.f25706g.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.f25706g.setDuration(300L);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f25706g.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        }
        this.f25706g.addListener(new C10651a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.C106701 */

            static {
                Covode.recordClassIndex(12265);
            }

            @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LiveNewSendGiftAnimationView.this.f25700a = 2;
                LiveNewSendGiftAnimationView.this.mo17592b(runnable);
            }
        });
        this.f25706g.start();
    }

    /* renamed from: d */
    private void m19243d(final Runnable runnable) {
        m19240b();
        this.f25706g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25704e, "scaleX", 1.0f, 0.95f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25704e, "scaleY", 1.0f, 0.95f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f25705f, "scaleX", 1.0f, 0.95f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f25705f, "scaleY", 1.0f, 0.95f, 1.0f);
        this.f25706g.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        this.f25706g.setDuration(200L);
        this.f25706g.addListener(new C10651a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView.C106723 */

            static {
                Covode.recordClassIndex(12267);
            }

            @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        ViewPropertyAnimator duration = this.f25704e.animate().rotation(0.0f).setDuration(150);
        if (Build.VERSION.SDK_INT >= 21) {
            PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
            duration.setInterpolator(pathInterpolator);
            this.f25706g.setInterpolator(pathInterpolator);
        }
        duration.start();
        this.f25706g.start();
    }

    public LiveNewSendGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveNewSendGiftAnimationView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6594);
        this.f25707h = EnumC10674a.Normal;
        this.f25703d = context;
        View.inflate(context, R.layout.b4j, this);
        this.f25704e = findViewById(R.id.a8f);
        this.f25705f = (LiveTextView) findViewById(R.id.a8u);
        this.f25709j = (RoundWaveAnimationView) findViewById(R.id.a8t);
        this.f25702c = (ComboEffectAnimationView) findViewById(R.id.a8m);
        this.f25710k = (ComboProgressAnimationView) findViewById(R.id.a8p);
        C4128c.m10033a(this.f25705f, 700);
        this.f25705f.getPaint().setTextSkewX(-0.25f);
        MethodCollector.m26664o(6594);
    }
}
