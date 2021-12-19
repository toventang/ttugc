package com.p2082ss.android.ugc.aweme.pendant;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView */
public final class OptimizedLottieAnimationView extends LottieAnimationView implements AbstractC33974au {

    /* renamed from: e */
    private boolean f142238e;

    /* renamed from: f */
    private boolean f142239f;

    /* renamed from: g */
    private boolean f142240g;

    /* renamed from: h */
    private AbstractC1204m f142241h;

    static {
        Covode.recordClassIndex(73575);
    }

    public OptimizedLottieAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        if (!this.f142239f) {
            this.f142239f = true;
            boolean g = ((LottieAnimationView) this).f5900b.mo6025g();
            if (this.f142240g) {
                this.f142238e = g;
            }
            if (g) {
                mo5837e();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f142239f) {
            this.f142239f = false;
            if (this.f142238e && this.f142240g) {
                mo5831b();
            }
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
        AbstractC1204m mVar = this.f142241h;
        if (mVar != null) {
            mVar.getLifecycle().mo4012a(this);
            return;
        }
        Activity a = m113119a(this);
        if (a instanceof AbstractC1204m) {
            ((AbstractC1204m) a).getLifecycle().mo4012a(this);
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1204m mVar = this.f142241h;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
        } else {
            Activity a = m113119a(this);
            if (a instanceof AbstractC1204m) {
                ((AbstractC1204m) a).getLifecycle().mo4013b(this);
            }
        }
        C58030k.m104850a(this);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: a */
    private static Activity m113119a(View view) {
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        return m113118a(context);
    }

    /* renamed from: a */
    private static Activity m113118a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            C89219l.m154716b(context, "");
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void setComposition(C2044e eVar) {
        C89219l.m154721d(eVar, "");
        super.setComposition(eVar);
        onVisibilityChanged(this, getVisibility());
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void onVisibilityChanged(View view, int i) {
        C89219l.m154721d(view, "");
        super.onVisibilityChanged(view, i);
        try {
            getRepeatMode();
            if (isShown()) {
                if (!this.f142240g) {
                    this.f142240g = true;
                    if (!this.f142239f && this.f142238e) {
                        mo5831b();
                    }
                }
            } else if (this.f142240g) {
                this.f142240g = false;
                boolean g = ((LottieAnimationView) this).f5900b.mo6025g();
                if (!this.f142239f) {
                    this.f142238e = g;
                }
                if (g) {
                    mo5837e();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    private /* synthetic */ OptimizedLottieAnimationView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OptimizedLottieAnimationView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
