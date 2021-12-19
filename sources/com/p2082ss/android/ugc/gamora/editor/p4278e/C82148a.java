package com.p2082ss.android.ugc.gamora.editor.p4278e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71494b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73962ap;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.e.a */
public final class C82148a {

    /* renamed from: a */
    int f183792a;

    /* renamed from: b */
    public float f183793b;

    /* renamed from: c */
    final Activity f183794c;

    /* renamed from: d */
    int f183795d = Integer.MAX_VALUE;

    /* renamed from: e */
    final View f183796e;

    /* renamed from: f */
    public final AbstractC31071f f183797f;

    /* renamed from: g */
    final AbstractC89187q<Float, Float, Float, C89391z> f183798g;

    /* renamed from: h */
    final AbstractC89172b<Float, C89391z> f183799h;

    /* renamed from: i */
    public final AbstractC89188r<Integer, Integer, Integer, Integer, C89391z> f183800i;

    static {
        Covode.recordClassIndex(95976);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.a$b */
    public static final class C82150b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C82152b f183808a;

        static {
            Covode.recordClassIndex(95978);
        }

        C82150b(C82152b bVar) {
            this.f183808a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f183808a.f183811b.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.e.a$c */
    public static final class C82151c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C82148a f183809a;

        static {
            Covode.recordClassIndex(95979);
        }

        C82151c(C82148a aVar) {
            this.f183809a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            C82148a aVar = this.f183809a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            aVar.f183793b = ((Float) animatedValue).floatValue();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.a$a */
    static final class C82149a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C82148a f183801a;

        /* renamed from: b */
        final /* synthetic */ boolean f183802b;

        /* renamed from: c */
        final /* synthetic */ int f183803c;

        /* renamed from: d */
        final /* synthetic */ int f183804d;

        /* renamed from: e */
        final /* synthetic */ float f183805e;

        /* renamed from: f */
        final /* synthetic */ int f183806f;

        /* renamed from: g */
        final /* synthetic */ int f183807g;

        static {
            Covode.recordClassIndex(95977);
        }

        C82149a(C82148a aVar, boolean z, int i, int i2, float f, int i3, int i4) {
            this.f183801a = aVar;
            this.f183802b = z;
            this.f183803c = i;
            this.f183804d = i2;
            this.f183805e = f;
            this.f183806f = i3;
            this.f183807g = i4;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr;
            C89219l.m154721d(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (this.f183802b) {
                animatedFraction = 1.0f - animatedFraction;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (C70635dg.m124827a(this.f183804d, this.f183803c)) {
                float f = this.f183805e;
                float f2 = f * floatValue;
                fArr = new float[]{f2, (((float) this.f183806f) - f2) / 2.0f, ((float) (this.f183807g - C33398a.f79357a.mo59453d())) * animatedFraction};
            } else {
                float f3 = this.f183805e * floatValue;
                fArr = new float[]{f3, (((float) this.f183806f) - f3) / 2.0f, 0.0f};
            }
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (int) f5;
            int i2 = (int) fArr[2];
            int i3 = (int) f4;
            int i4 = (int) floatValue;
            this.f183801a.f183797f.mo56303a(i, i2, i3, i4);
            this.f183801a.f183800i.mo8774a(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            C82148a aVar = this.f183801a;
            float f6 = (floatValue * 1.0f) / ((float) this.f183803c);
            if (aVar.f183795d == Integer.MAX_VALUE && C73962ap.m130083a(f6, 1.0f, 1.0E-5f)) {
                aVar.f183795d = i2;
            }
            aVar.f183798g.invoke(Float.valueOf(f6), Float.valueOf((float) i), Float.valueOf(((float) (i2 - aVar.f183795d)) + aVar.f183793b));
            C71494b.f160199a = i;
            C71494b.f160200b = i2;
            C71494b.f160201c = i3;
            C71494b.f160202d = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo127358a(int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        this.f183796e.startAnimation(translateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new C82151c(this));
        ofFloat.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.q<? super java.lang.Float, ? super java.lang.Float, ? super java.lang.Float, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Float, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.r<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C82148a(View view, AbstractC31071f fVar, AbstractC89187q<? super Float, ? super Float, ? super Float, C89391z> qVar, AbstractC89172b<? super Float, C89391z> bVar, AbstractC89188r<? super Integer, ? super Integer, ? super Integer, ? super Integer, C89391z> rVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(rVar, "");
        this.f183796e = view;
        this.f183797f = fVar;
        this.f183798g = qVar;
        this.f183799h = bVar;
        this.f183800i = rVar;
        Context context = view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f183794c = (Activity) context;
    }
}
