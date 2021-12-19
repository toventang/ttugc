package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CustomInterceptTouchEventFrameLayout;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveSkyLightTouchEventFrameLayout */
public final class LiveSkyLightTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f115374a;

    /* renamed from: b */
    private float f115375b;

    /* renamed from: c */
    private float f115376c;

    /* renamed from: d */
    private long f115377d;

    /* renamed from: e */
    private AbstractC89171a<C89391z> f115378e = C50010a.f115381a;

    /* renamed from: f */
    private AbstractC89183m<? super Float, ? super Float, Boolean> f115379f = C50011b.f115382a;

    /* renamed from: g */
    private boolean f115380g;

    static {
        Covode.recordClassIndex(59128);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveSkyLightTouchEventFrameLayout$a */
    static final class C50010a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C50010a f115381a = new C50010a();

        static {
            Covode.recordClassIndex(59129);
        }

        C50010a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    public final AbstractC89171a<C89391z> getCallBack() {
        return this.f115378e;
    }

    public final boolean getNeedIntercept() {
        return this.f115380g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean>, h.f.a.m<java.lang.Float, java.lang.Float, java.lang.Boolean> */
    public final AbstractC89183m<Float, Float, Boolean> getScrollPredicate() {
        return this.f115379f;
    }

    public final void setNeedIntercept(boolean z) {
        this.f115380g = z;
    }

    public final void setCallBack(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f115378e = aVar;
    }

    public final void setScrollPredicate(AbstractC89183m<? super Float, ? super Float, Boolean> mVar) {
        C89219l.m154721d(mVar, "");
        this.f115379f = mVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        super.onInterceptTouchEvent(motionEvent);
        this.f115374a = false;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f115375b = motionEvent.getX();
            this.f115376c = motionEvent.getY();
            this.f115377d = System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 2 && this.f115380g) {
                float x = motionEvent.getX() - this.f115375b;
                float y = motionEvent.getY() - this.f115376c;
                if (Math.abs(x) > ((float) CustomInterceptTouchEventFrameLayout.f81877a) || Math.abs(y) > ((float) CustomInterceptTouchEventFrameLayout.f81877a)) {
                    if (this.f115379f.invoke(Float.valueOf(x), Float.valueOf(y)).booleanValue()) {
                        this.f115378e.invoke();
                        this.f115374a = true;
                    }
                } else if (System.currentTimeMillis() - this.f115377d > ((long) ViewConfiguration.getDoubleTapTimeout())) {
                    this.f115378e.invoke();
                    this.f115374a = true;
                }
            }
        } else if (this.f115380g) {
            float x2 = motionEvent.getX() - this.f115375b;
            float y2 = motionEvent.getY() - this.f115376c;
            if (Math.abs(x2) < ((float) CustomInterceptTouchEventFrameLayout.f81877a) && Math.abs(y2) < ((float) CustomInterceptTouchEventFrameLayout.f81877a)) {
                this.f115378e.invoke();
                this.f115374a = true;
            }
        }
        return this.f115374a;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveSkyLightTouchEventFrameLayout$b */
    static final class C50011b extends AbstractC89220m implements AbstractC89183m<Float, Float, Boolean> {

        /* renamed from: a */
        public static final C50011b f115382a = new C50011b();

        static {
            Covode.recordClassIndex(59130);
        }

        C50011b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(Float f, Float f2) {
            f.floatValue();
            f2.floatValue();
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveSkyLightTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(10609);
        MethodCollector.m26664o(10609);
    }
}
