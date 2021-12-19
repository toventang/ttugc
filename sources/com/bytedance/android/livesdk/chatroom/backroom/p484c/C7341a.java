package com.bytedance.android.livesdk.chatroom.backroom.p484c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.a */
public final class C7341a {

    /* renamed from: a */
    public static int f18210a;

    /* renamed from: b */
    public static ValueAnimator f18211b;

    /* renamed from: c */
    public static AbstractC7342a f18212c;

    /* renamed from: d */
    public static long f18213d;

    /* renamed from: e */
    public static final C7341a f18214e = new C7341a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.a$a */
    public interface AbstractC7342a {
        static {
            Covode.recordClassIndex(8106);
        }

        /* renamed from: a */
        void mo13573a();

        /* renamed from: a */
        void mo13574a(float f);
    }

    private C7341a() {
    }

    static {
        Covode.recordClassIndex(8105);
    }

    /* renamed from: a */
    public static void m15241a() {
        ValueAnimator valueAnimator = f18211b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        f18211b = null;
        f18212c = null;
        f18210a = 0;
        f18213d = 0;
    }

    /* renamed from: b */
    public static boolean m15242b() {
        if (f18210a <= 0 && f18213d > 0) {
            return true;
        }
        ValueAnimator valueAnimator = f18211b;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.a$c */
    public static final class C7344c extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(8108);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            AbstractC7342a aVar = C7341a.f18212c;
            if (aVar != null) {
                aVar.mo13573a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.c.a$b */
    public static final class C7343b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public static final C7343b f18215a = new C7343b();

        static {
            Covode.recordClassIndex(8107);
        }

        C7343b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            float f;
            AbstractC7342a aVar = C7341a.f18212c;
            if (aVar != null) {
                Float f2 = null;
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                if (obj instanceof Float) {
                    f2 = obj;
                }
                Float f3 = f2;
                if (f3 != null) {
                    f = f3.floatValue();
                } else {
                    f = 0.0f;
                }
                aVar.mo13574a(f);
            }
        }
    }
}
