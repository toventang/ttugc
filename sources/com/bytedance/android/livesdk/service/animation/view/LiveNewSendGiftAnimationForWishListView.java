package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.widget.C4128c;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.service.animation.p623b.C10651a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class LiveNewSendGiftAnimationForWishListView extends FrameLayout {

    /* renamed from: a */
    public View f25681a;

    /* renamed from: b */
    public LiveTextView f25682b;

    /* renamed from: c */
    public AnimatorSet f25683c;

    /* renamed from: d */
    public int f25684d;

    /* renamed from: e */
    public int f25685e;

    /* renamed from: f */
    public AbstractC8812b f25686f;

    /* renamed from: g */
    public RoundWaveAnimationView f25687g;

    /* renamed from: h */
    public ComboEffectAnimationView f25688h;

    /* renamed from: i */
    public ComboProgressAnimationForWishListView f25689i;

    /* renamed from: j */
    private Context f25690j;

    /* renamed from: k */
    private EnumC10669a f25691k;

    static {
        Covode.recordClassIndex(12258);
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$4 */
    static /* synthetic */ class C106684 {

        /* renamed from: a */
        static final /* synthetic */ int[] f25698a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 12262(0x2fe6, float:1.7183E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$a[] r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.EnumC10669a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.C106684.f25698a = r2
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.EnumC10669a.Fast     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.C106684.f25698a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$a r0 = com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.EnumC10669a.Special     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.C106684.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$a */
    public enum EnumC10669a {
        Normal,
        Special,
        Fast;

        static {
            Covode.recordClassIndex(12263);
        }
    }

    /* renamed from: a */
    public final void mo17586a() {
        AnimatorSet animatorSet = this.f25683c;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f25683c.removeAllListeners();
            this.f25683c.cancel();
        }
        this.f25683c = null;
        View view = this.f25681a;
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void setPanel(AbstractC8812b bVar) {
        this.f25686f = bVar;
    }

    public void setAnimationType(EnumC10669a aVar) {
        this.f25691k = aVar;
        if (C106684.f25698a[aVar.ordinal()] == 1) {
            this.f25689i.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo17587a(final Runnable runnable) {
        mo17586a();
        this.f25683c = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25681a, "rotation", 0.0f, 360.0f);
        this.f25683c.playTogether(ofFloat);
        this.f25683c.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        this.f25683c.addListener(new C10651a() {
            /* class com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.C106662 */

            static {
                Covode.recordClassIndex(12260);
            }

            @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LiveNewSendGiftAnimationForWishListView.this.f25684d = 0;
                LiveNewSendGiftAnimationForWishListView.this.f25685e = 0;
                if (LiveNewSendGiftAnimationForWishListView.this.f25688h != null) {
                    LiveNewSendGiftAnimationForWishListView.this.f25688h.mo17562a(LiveNewSendGiftAnimationForWishListView.this.f25685e);
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f25683c.start();
    }

    public LiveNewSendGiftAnimationForWishListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveNewSendGiftAnimationForWishListView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5555);
        this.f25691k = EnumC10669a.Normal;
        this.f25690j = context;
        View.inflate(context, R.layout.b4i, this);
        this.f25681a = findViewById(R.id.a8f);
        this.f25682b = (LiveTextView) findViewById(R.id.a8u);
        this.f25687g = (RoundWaveAnimationView) findViewById(R.id.a8t);
        this.f25688h = (ComboEffectAnimationView) findViewById(R.id.a8m);
        this.f25689i = (ComboProgressAnimationForWishListView) findViewById(R.id.a8p);
        C4128c.m10033a(this.f25682b, 700);
        this.f25682b.getPaint().setTextSkewX(-0.25f);
        MethodCollector.m26664o(5555);
    }
}
