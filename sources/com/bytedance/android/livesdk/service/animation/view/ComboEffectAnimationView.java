package com.bytedance.android.livesdk.service.animation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.fresco.animation.p1867c.AbstractC24295b;
import com.facebook.fresco.animation.p1867c.C24290a;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

public final class ComboEffectAnimationView extends FrameLayout {

    /* renamed from: b */
    public static final C10653a f25656b = new C10653a((byte) 0);

    /* renamed from: a */
    int f25657a;

    /* renamed from: c */
    private AbstractC88412b f25658c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboEffectAnimationView$d */
    public static final class C10657d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10657d f25663a = new C10657d();

        static {
            Covode.recordClassIndex(12248);
        }

        C10657d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboEffectAnimationView$e */
    public static final class C10658e implements AbstractC88428a {

        /* renamed from: a */
        public static final C10658e f25664a = new C10658e();

        static {
            Covode.recordClassIndex(12249);
        }

        C10658e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
        }
    }

    static {
        Covode.recordClassIndex(12243);
    }

    public ComboEffectAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboEffectAnimationView$a */
    public static final class C10653a {
        static {
            Covode.recordClassIndex(12244);
        }

        private C10653a() {
        }

        public /* synthetic */ C10653a(byte b) {
            this();
        }
    }

    public final int getCombo() {
        return this.f25657a;
    }

    public final AbstractC88412b getDisposable() {
        return this.f25658c;
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboEffectAnimationView$b */
    public static final class C10654b implements AbstractC24295b {

        /* renamed from: a */
        final /* synthetic */ ComboEffectAnimationView f25659a;

        /* renamed from: b */
        final /* synthetic */ HSAnimImageView f25660b;

        static {
            Covode.recordClassIndex(12245);
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: a */
        public final void mo9283a(C24290a aVar) {
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: a */
        public final void mo9284a(C24290a aVar, int i) {
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: c */
        public final void mo9286c(C24290a aVar) {
        }

        /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboEffectAnimationView$b$a */
        static final class RunnableC10655a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C10654b f25661a;

            static {
                Covode.recordClassIndex(12246);
            }

            RunnableC10655a(C10654b bVar) {
                this.f25661a = bVar;
            }

            public final void run() {
                this.f25661a.f25659a.removeView(this.f25661a.f25660b);
            }
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: b */
        public final void mo9285b(C24290a aVar) {
            if (this.f25659a.indexOfChild(this.f25660b) >= 0) {
                this.f25659a.post(new RunnableC10655a(this));
            }
        }

        C10654b(ComboEffectAnimationView comboEffectAnimationView, HSAnimImageView hSAnimImageView) {
            this.f25659a = comboEffectAnimationView;
            this.f25660b = hSAnimImageView;
        }
    }

    /* renamed from: a */
    public final void mo17561a() {
        AbstractC88412b bVar = this.f25658c;
        if (bVar != null) {
            bVar.dispose();
        }
        removeAllViews();
    }

    public final void setCombo(int i) {
        this.f25657a = i;
    }

    public final void setDisposable(AbstractC88412b bVar) {
        this.f25658c = bVar;
    }

    /* renamed from: a */
    public final void mo17562a(int i) {
        this.f25657a = i;
        if (i == 0) {
            AbstractC88412b bVar = this.f25658c;
            if (bVar != null) {
                bVar.dispose();
            }
        } else if (i == 1) {
            m19214a(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        } else if (i == 1315) {
            m19214a(1000L);
        }
    }

    /* renamed from: a */
    private final void m19214a(long j) {
        AbstractC88412b bVar = this.f25658c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f25658c = C11231b.m19896a(j, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C10656c(this), C10657d.f25663a, C10658e.f25664a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboEffectAnimationView$c */
    public static final class C10656c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ComboEffectAnimationView f25662a;

        static {
            Covode.recordClassIndex(12247);
        }

        C10656c(ComboEffectAnimationView comboEffectAnimationView) {
            this.f25662a = comboEffectAnimationView;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ComboEffectAnimationView comboEffectAnimationView = this.f25662a;
            int i = comboEffectAnimationView.f25657a;
            String str = "ttlive_gift_combo_effect_level4.webp";
            if (i > 0) {
                if (66 >= i) {
                    str = "ttlive_gift_combo_effect_level1.webp";
                } else if (67 <= i && 188 >= i) {
                    str = "ttlive_gift_combo_effect_level2.webp";
                } else if (189 <= i && 520 >= i) {
                    str = "ttlive_gift_combo_effect_level3.webp";
                }
            }
            HSAnimImageView hSAnimImageView = new HSAnimImageView(comboEffectAnimationView.getContext());
            hSAnimImageView.setLayoutParams(new FrameLayout.LayoutParams((int) C11227ap.m19885a(comboEffectAnimationView.getContext(), 125.0f), (int) C11227ap.m19885a(comboEffectAnimationView.getContext(), 125.0f)));
            comboEffectAnimationView.addView(hSAnimImageView);
            HSAnimImageView a = hSAnimImageView.mo9389a(HSAnimImageView.f11029i.mo9399a("tiktok_live_basic_resource", str));
            a.f11032c = true;
            a.mo9388a(new C10654b(comboEffectAnimationView, hSAnimImageView)).mo9390a();
        }
    }

    private /* synthetic */ ComboEffectAnimationView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboEffectAnimationView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5577);
        MethodCollector.m26664o(5577);
    }
}
