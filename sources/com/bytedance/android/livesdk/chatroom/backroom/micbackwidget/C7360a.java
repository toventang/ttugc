package com.bytedance.android.livesdk.chatroom.backroom.micbackwidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a */
public final class C7360a {

    /* renamed from: a */
    public static final int f18243a = 10;

    /* renamed from: b */
    public static boolean f18244b;

    /* renamed from: c */
    public static int f18245c;

    /* renamed from: d */
    public static ValueAnimator f18246d;

    /* renamed from: e */
    public static AbstractC7361a f18247e;

    /* renamed from: f */
    public static final C7360a f18248f = new C7360a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a$a */
    public interface AbstractC7361a {
        static {
            Covode.recordClassIndex(8126);
        }

        /* renamed from: a */
        void mo13584a();

        /* renamed from: a */
        void mo13585a(float f);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a$c */
    public static final class C7363c extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(8128);
        }

        C7363c() {
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            AbstractC7361a aVar = C7360a.f18247e;
            if (aVar != null) {
                aVar.mo13584a();
            }
        }
    }

    private C7360a() {
    }

    static {
        Covode.recordClassIndex(8125);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a$b */
    static final class C7362b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public static final C7362b f18249a = new C7362b();

        static {
            Covode.recordClassIndex(8127);
        }

        C7362b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            float f;
            AbstractC7361a aVar = C7360a.f18247e;
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
                aVar.mo13585a(f);
            }
        }
    }
}
