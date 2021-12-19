package com.bytedance.android.live.publicscreen.impl.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p379n.C5784p;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LandscapePublicScreenWidget extends PublicScreenWidget implements AbstractC33974au {

    /* renamed from: c */
    public static final C6038a f15118c = new C6038a((byte) 0);

    /* renamed from: v */
    private static final int f15119v = C3966y.m9653a(56.0f);

    /* renamed from: w */
    private static final int f15120w = C3966y.m9653a(12.0f);

    /* renamed from: a */
    boolean f15121a;

    /* renamed from: b */
    boolean f15122b = true;

    /* renamed from: u */
    private ValueAnimator f15123u;

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: e */
    public final boolean mo11850e() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget$a */
    public static final class C6038a {
        static {
            Covode.recordClassIndex(6653);
        }

        private C6038a() {
        }

        public /* synthetic */ C6038a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    /* renamed from: i */
    public final void mo11911i() {
        super.mo11911i();
        this.f15136d.setHasFixedSize(true);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        ValueAnimator valueAnimator = this.f15123u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    static {
        Covode.recordClassIndex(6652);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo11912j() {
        View view;
        int i;
        ValueAnimator valueAnimator;
        if (isViewValid() && (view = getView()) != null) {
            C89219l.m154716b(view, "");
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i2 = marginLayoutParams.bottomMargin;
                if (this.f15122b) {
                    i = f15119v;
                } else {
                    i = f15120w;
                }
                ValueAnimator valueAnimator2 = this.f15123u;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
                Math.abs(i2 - i);
                ValueAnimator duration = ofInt.setDuration(200L);
                this.f15123u = duration;
                if (duration != null) {
                    duration.addUpdateListener(new C6041d(this, marginLayoutParams, view));
                }
                if (this.f15122b && (valueAnimator = this.f15123u) != null) {
                    valueAnimator.addListener(new C6042e(this));
                }
                ValueAnimator valueAnimator3 = this.f15123u;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget$e */
    public static final class C6042e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LandscapePublicScreenWidget f15129a;

        static {
            Covode.recordClassIndex(6657);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6042e(LandscapePublicScreenWidget landscapePublicScreenWidget) {
            this.f15129a = landscapePublicScreenWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f15129a.mo11927k();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget$c */
    static final class C6040c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LandscapePublicScreenWidget f15125a;

        static {
            Covode.recordClassIndex(6655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6040c(LandscapePublicScreenWidget landscapePublicScreenWidget) {
            super(1);
            this.f15125a = landscapePublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f15125a.mo11910a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo11910a(boolean z) {
        this.f15121a = z;
        if (!z) {
            mo11912j();
        } else {
            mo11927k();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget$b */
    static final class C6039b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LandscapePublicScreenWidget f15124a;

        static {
            Covode.recordClassIndex(6654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6039b(LandscapePublicScreenWidget landscapePublicScreenWidget) {
            super(1);
            this.f15124a = landscapePublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            LandscapePublicScreenWidget landscapePublicScreenWidget = this.f15124a;
            landscapePublicScreenWidget.f15122b = booleanValue;
            if (!landscapePublicScreenWidget.f15121a) {
                landscapePublicScreenWidget.mo11912j();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28313b((AbstractC1204m) this, C5784p.class, (AbstractC89172b) new C6039b(this)).mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C6040c(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget$d */
    public static final class C6041d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LandscapePublicScreenWidget f15126a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f15127b;

        /* renamed from: c */
        final /* synthetic */ View f15128c;

        static {
            Covode.recordClassIndex(6656);
        }

        C6041d(LandscapePublicScreenWidget landscapePublicScreenWidget, ViewGroup.MarginLayoutParams marginLayoutParams, View view) {
            this.f15126a = landscapePublicScreenWidget;
            this.f15127b = marginLayoutParams;
            this.f15128c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            if (this.f15126a.isViewValid()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = this.f15127b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                this.f15128c.setLayoutParams(this.f15127b);
            }
        }
    }
}
