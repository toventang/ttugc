package com.bytedance.ies.xelement.bytedlottie;

import android.content.Context;
import android.graphics.Canvas;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.LottieAnimationView;
import com.lynx.tasm.base.LLog;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

public final class LynxBytedLottieAnimationView extends LottieAnimationView implements AbstractC33974au {

    /* renamed from: c */
    private boolean f45031c;

    /* renamed from: d */
    private boolean f45032d;

    /* renamed from: e */
    private String f45033e;

    /* renamed from: f */
    private boolean f45034f;

    static {
        Covode.recordClassIndex(21783);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.bytedance.lottie.LottieAnimationView, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final boolean getDestroyed() {
        return this.f45032d;
    }

    public final boolean getMAutoPlay() {
        return this.f45031c;
    }

    public final String getSrcUrl() {
        return this.f45033e;
    }

    @Override // com.bytedance.lottie.LottieAnimationView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45031c && this.f45034f && !mo34402g()) {
            mo34398c();
        }
    }

    @Override // com.bytedance.lottie.LottieAnimationView
    public final void onDetachedFromWindow() {
        if (mo34402g()) {
            this.f45034f = true;
        }
        super.onDetachedFromWindow();
        mo34416h();
        C58030k.m104850a(this);
    }

    public LynxBytedLottieAnimationView(Context context) {
        super(context);
    }

    public final void setDestroyed(boolean z) {
        this.f45032d = z;
    }

    public final void setMAutoPlay(boolean z) {
        this.f45031c = z;
    }

    public final void setSrcUrl(String str) {
        this.f45033e = str;
    }

    @Override // com.bytedance.lottie.LottieAnimationView
    public final void onDraw(Canvas canvas) {
        if (this.f45032d) {
            LLog.m56859a("byted-lottie", "draw lottie-view after destroyed with src " + this.f45033e);
        } else {
            super.onDraw(canvas);
        }
    }
}
