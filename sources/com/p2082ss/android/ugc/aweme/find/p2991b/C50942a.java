package com.p2082ss.android.ugc.aweme.find.p2991b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.find.b.a */
public final class C50942a {

    /* renamed from: f */
    public static final C50943a f117556f = new C50943a((byte) 0);

    /* renamed from: a */
    public int f117557a;

    /* renamed from: b */
    public final View f117558b;

    /* renamed from: c */
    public final View f117559c;

    /* renamed from: d */
    public final View f117560d;

    /* renamed from: e */
    public final AbstractC50944b f117561e;

    /* renamed from: g */
    private final AbstractC89244h f117562g = C89250i.m154773a((AbstractC89171a) new C50949g(this));

    /* renamed from: h */
    private final AbstractC89244h f117563h = C89250i.m154773a((AbstractC89171a) new C50950h(this));

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$b */
    public interface AbstractC50944b {
        static {
            Covode.recordClassIndex(60120);
        }

        /* renamed from: a */
        void mo86297a();

        /* renamed from: b */
        void mo86298b();
    }

    static {
        Covode.recordClassIndex(60118);
    }

    /* renamed from: a */
    public final ValueAnimator mo86294a() {
        return (ValueAnimator) this.f117562g.getValue();
    }

    /* renamed from: b */
    public final ValueAnimator mo86295b() {
        return (ValueAnimator) this.f117563h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$a */
    public static final class C50943a {
        static {
            Covode.recordClassIndex(60119);
        }

        private C50943a() {
        }

        public /* synthetic */ C50943a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo86296c() {
        ValueAnimator b = mo86295b();
        if (b.isRunning()) {
            b.end();
        }
        ValueAnimator a = mo86294a();
        if (a.isRunning()) {
            a.end();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$g */
    static final class C50949g extends AbstractC89220m implements AbstractC89171a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ C50942a f117568a;

        static {
            Covode.recordClassIndex(60125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50949g(C50942a aVar) {
            super(0);
            this.f117568a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ValueAnimator invoke() {
            C50942a aVar = this.f117568a;
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(1.0f, 0.0f);
            valueAnimator.setDuration(200L);
            valueAnimator.addUpdateListener(new C50945c(aVar));
            valueAnimator.addListener(new C50946d(aVar));
            return valueAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$h */
    static final class C50950h extends AbstractC89220m implements AbstractC89171a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ C50942a f117569a;

        static {
            Covode.recordClassIndex(60126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50950h(C50942a aVar) {
            super(0);
            this.f117569a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ValueAnimator invoke() {
            C50942a aVar = this.f117569a;
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.setDuration(200L);
            valueAnimator.addUpdateListener(new C50947e(aVar));
            valueAnimator.addListener(new C50948f(aVar));
            return valueAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$d */
    public static final class C50946d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50942a f117565a;

        static {
            Covode.recordClassIndex(60122);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50946d(C50942a aVar) {
            this.f117565a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationStart(animator);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            this.f117565a.f117561e.mo86297a();
            this.f117565a.f117557a = 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$f */
    public static final class C50948f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50942a f117567a;

        static {
            Covode.recordClassIndex(60124);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50948f(C50942a aVar) {
            this.f117567a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            this.f117567a.f117557a = 1;
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationStart(animator);
            this.f117567a.f117561e.mo86298b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$c */
    static final class C50945c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50942a f117564a;

        static {
            Covode.recordClassIndex(60121);
        }

        C50945c(C50942a aVar) {
            this.f117564a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(this.f117564a.f117558b, 0, 0, Integer.valueOf((int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 62.0f, system.getDisplayMetrics()))) * floatValue)), 0, false, 16);
            View view = this.f117564a.f117559c;
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue2).floatValue());
            View view2 = this.f117564a.f117560d;
            Object animatedValue3 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            view2.setAlpha(((Float) animatedValue3).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$e */
    static final class C50947e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50942a f117566a;

        static {
            Covode.recordClassIndex(60123);
        }

        C50947e(C50942a aVar) {
            this.f117566a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(this.f117566a.f117558b, 0, 0, Integer.valueOf((int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 62.0f, system.getDisplayMetrics()))) * floatValue)), 0, false, 16);
            View view = this.f117566a.f117559c;
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue2).floatValue());
            View view2 = this.f117566a.f117560d;
            Object animatedValue3 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            view2.setAlpha(((Float) animatedValue3).floatValue());
        }
    }

    public C50942a(View view, View view2, View view3, AbstractC50944b bVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        C89219l.m154721d(bVar, "");
        this.f117558b = view;
        this.f117559c = view2;
        this.f117560d = view3;
        this.f117561e = bVar;
    }
}
