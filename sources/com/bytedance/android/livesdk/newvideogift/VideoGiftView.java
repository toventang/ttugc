package com.bytedance.android.livesdk.newvideogift;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.livesdk.model.message.C9722cf;
import com.bytedance.android.livesdk.model.message.C9888r;
import com.bytedance.android.livesdk.newvideogift.p595a.C9950b;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

public class VideoGiftView extends FrameLayout {

    /* renamed from: a */
    FrameLayout f24093a;

    /* renamed from: b */
    View f24094b;

    /* renamed from: c */
    TextView f24095c;

    /* renamed from: d */
    ImageView f24096d;

    /* renamed from: e */
    C9722cf.C9723a f24097e;

    /* renamed from: f */
    C9950b f24098f;

    /* renamed from: g */
    Runnable f24099g;

    /* renamed from: h */
    private boolean f24100h;

    /* renamed from: i */
    private Map<String, Object> f24101i = new HashMap();

    static {
        Covode.recordClassIndex(11499);
    }

    private int getResourceLayout() {
        return R.layout.bff;
    }

    /* renamed from: b */
    public final void mo16656b() {
        C9950b bVar = this.f24098f;
        if (bVar != null) {
            bVar.mo16660a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f24099g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        mo16656b();
    }

    /* renamed from: a */
    public final void mo16654a() {
        if (this.f24097e != null) {
            this.f24094b.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f24094b, "alpha", 0.0f, 0.0f).setDuration(this.f24097e.f23702d);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f24094b, "alpha", 0.0f, 1.0f).setDuration(500L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f24094b, "alpha", 1.0f, 1.0f).setDuration(this.f24097e.f23703e - 500);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f24094b, "alpha", 1.0f, 0.0f).setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2, duration3, duration4);
            animatorSet.start();
        }
    }

    public void setPortrait(boolean z) {
        this.f24100h = z;
    }

    /* access modifiers changed from: package-private */
    public void setTextEffect(C9722cf cfVar) {
        C9722cf.C9723a aVar;
        if (cfVar != null) {
            if (this.f24100h) {
                aVar = cfVar.f23697a;
            } else {
                aVar = cfVar.f23698b;
            }
            this.f24097e = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16655a(C9888r rVar) {
        String str;
        this.f24101i.put("effect_id", Long.valueOf(rVar.f23900b));
        this.f24101i.put("gift_id", Long.valueOf(rVar.f23908j));
        this.f24101i.put("msg_id", Long.valueOf(rVar.f23899a));
        Map<String, Object> map = this.f24101i;
        if (rVar.f23905g != null) {
            str = String.valueOf(rVar.f23905g.getId());
        } else {
            str = "";
        }
        map.put("from_user_id", str);
        C6555i.m14021b().mo9215a("ttlive_gift", this.f24101i);
    }

    public VideoGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(6761);
        C1764a.m5927a(LayoutInflater.from(context), getResourceLayout(), this, true);
        this.f24093a = (FrameLayout) findViewById(R.id.fe8);
        this.f24094b = findViewById(R.id.eg6);
        this.f24096d = (ImageView) findViewById(R.id.eg7);
        this.f24095c = (TextView) findViewById(R.id.eg8);
        this.f24101i.put("desc", "play large gift animation");
        MethodCollector.m26664o(6761);
    }
}
