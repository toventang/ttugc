package com.p2082ss.android.ugc.aweme.common.p2636h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.h.a */
public final class C39122a {

    /* renamed from: a */
    public static final C39123a f92324a = new C39123a((byte) 0);

    static {
        Covode.recordClassIndex(46740);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.a$a */
    public static final class C39123a {
        static {
            Covode.recordClassIndex(46741);
        }

        private C39123a() {
        }

        public /* synthetic */ C39123a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.common.h.a$a$a */
        static final class C39124a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f92325a;

            static {
                Covode.recordClassIndex(46742);
            }

            C39124a(View view) {
                this.f92325a = view;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
                if (r5 != null) goto L_0x0022;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onAnimationUpdate(android.animation.ValueAnimator r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154716b(r7, r0)
                    java.lang.Object r5 = r7.getAnimatedValue()
                    boolean r0 = r5 instanceof p4600h.C89378p
                    if (r0 != 0) goto L_0x000e
                    r5 = 0
                L_0x000e:
                    h.p r5 = (p4600h.C89378p) r5
                    android.view.View r4 = r6.f92325a
                    r3 = 2
                    r2 = 0
                    if (r5 == 0) goto L_0x0036
                    java.lang.Object r0 = r5.getFirst()
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 == 0) goto L_0x0036
                    float r1 = r0.floatValue()
                L_0x0022:
                    java.lang.Object r0 = r5.getSecond()
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 == 0) goto L_0x002e
                    float r2 = r0.floatValue()
                L_0x002e:
                    android.view.MotionEvent r0 = com.p2082ss.android.ugc.aweme.common.p2636h.C39122a.C39123a.m79419a(r3, r1, r2)
                    r4.dispatchTouchEvent(r0)
                    return
                L_0x0036:
                    r1 = 0
                    if (r5 == 0) goto L_0x002e
                    goto L_0x0022
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.p2636h.C39122a.C39123a.C39124a.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.common.h.a$a$b */
        public static final class C39125b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ View f92326a;

            /* renamed from: b */
            final /* synthetic */ C89378p f92327b;

            static {
                Covode.recordClassIndex(46743);
            }

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f92326a.dispatchTouchEvent(C39123a.m79419a(3, ((Number) this.f92327b.getFirst()).floatValue(), ((Number) this.f92327b.getSecond()).floatValue()));
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f92326a.dispatchTouchEvent(C39123a.m79419a(1, ((Number) this.f92327b.getFirst()).floatValue(), ((Number) this.f92327b.getSecond()).floatValue()));
            }

            C39125b(View view, C89378p pVar) {
                this.f92326a = view;
                this.f92327b = pVar;
            }
        }

        /* renamed from: a */
        public static MotionEvent m79419a(int i, float f, float f2) {
            MotionEvent obtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), i, f, f2, 0);
            C89219l.m154716b(obtain, "");
            return obtain;
        }
    }

    /* renamed from: a */
    public static final void m79418a(View view, C89378p<Float, Float> pVar, C89378p<Float, Float> pVar2) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(pVar2, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(pVar2, "");
        view.dispatchTouchEvent(C39123a.m79419a(0, pVar.getFirst().floatValue(), pVar.getSecond().floatValue()));
        view.dispatchTouchEvent(C39123a.m79419a(2, pVar2.getFirst().floatValue(), pVar2.getSecond().floatValue()));
        view.dispatchTouchEvent(C39123a.m79419a(1, pVar2.getFirst().floatValue(), pVar2.getSecond().floatValue()));
    }
}
