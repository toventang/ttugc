package com.bytedance.hybrid.spark.p1110d;

import android.animation.Animator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.a */
public final class C15537a implements AbstractC15510f {

    /* renamed from: a */
    public final C21137b f37887a;

    /* renamed from: b */
    public final View f37888b;

    static {
        Covode.recordClassIndex(17799);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        this.f37887a.getAnimation();
    }

    /* renamed from: com.bytedance.hybrid.spark.d.a$d */
    static final class RunnableC15541d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15537a f37893a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f37894b;

        static {
            Covode.recordClassIndex(17803);
        }

        RunnableC15541d(C15537a aVar, AbstractC89171a aVar2) {
            this.f37893a = aVar;
            this.f37894b = aVar2;
        }

        public final void run() {
            View view = this.f37893a.f37888b;
            view.setTranslationY((float) this.f37893a.f37888b.getHeight());
            view.animate().translationY(0.0f).setDuration(300).setListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.hybrid.spark.p1110d.C15537a.RunnableC15541d.C155421 */

                /* renamed from: a */
                final /* synthetic */ RunnableC15541d f37895a;

                static {
                    Covode.recordClassIndex(17804);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f37895a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    AbstractC89171a aVar = this.f37895a.f37894b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    AbstractC89171a aVar = this.f37895a.f37894b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    this.f37895a.f37893a.f37888b.setVisibility(0);
                }
            }).start();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.a$f */
    static final class RunnableC15545f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15537a f37899a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f37900b;

        static {
            Covode.recordClassIndex(17807);
        }

        RunnableC15545f(C15537a aVar, AbstractC89171a aVar2) {
            this.f37899a = aVar;
            this.f37900b = aVar2;
        }

        public final void run() {
            View view = this.f37899a.f37888b;
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(300).setListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.hybrid.spark.p1110d.C15537a.RunnableC15545f.C155461 */

                /* renamed from: a */
                final /* synthetic */ RunnableC15545f f37901a;

                static {
                    Covode.recordClassIndex(17808);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f37901a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    AbstractC89171a aVar = this.f37901a.f37900b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    AbstractC89171a aVar = this.f37901a.f37900b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    this.f37901a.f37899a.f37888b.setVisibility(0);
                }
            }).start();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.a$e */
    static final class RunnableC15543e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15537a f37896a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f37897b;

        static {
            Covode.recordClassIndex(17805);
        }

        RunnableC15543e(C15537a aVar, AbstractC89171a aVar2) {
            this.f37896a = aVar;
            this.f37897b = aVar2;
        }

        public final void run() {
            WindowManager windowManager;
            Display defaultDisplay;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (this.f37896a.f37888b.getContext() instanceof Activity) {
                Context context = this.f37896a.f37888b.getContext();
                if (context != null) {
                    windowManager = ((Activity) context).getWindowManager();
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                Object a = m28671a(this.f37896a.f37888b.getContext(), "window");
                if (a != null) {
                    windowManager = (WindowManager) a;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            View view = this.f37896a.f37888b;
            view.setTranslationX(-((float) displayMetrics.widthPixels));
            view.animate().translationX(0.0f).setDuration(300).setListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.hybrid.spark.p1110d.C15537a.RunnableC15543e.C155441 */

                /* renamed from: a */
                final /* synthetic */ RunnableC15543e f37898a;

                static {
                    Covode.recordClassIndex(17806);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f37898a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    AbstractC89171a aVar = this.f37898a.f37897b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    AbstractC89171a aVar = this.f37898a.f37897b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    this.f37898a.f37896a.f37888b.setVisibility(0);
                }
            }).start();
        }

        /* renamed from: a */
        private static Object m28671a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(10812);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(10812);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.a$a */
    public static final class C15538a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f37889a;

        static {
            Covode.recordClassIndex(17800);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public C15538a(AbstractC89171a aVar) {
            this.f37889a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            AbstractC89171a aVar = this.f37889a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC89171a aVar = this.f37889a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.a$b */
    public static final class C15539b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f37890a;

        static {
            Covode.recordClassIndex(17801);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public C15539b(AbstractC89171a aVar) {
            this.f37890a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            AbstractC89171a aVar = this.f37890a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC89171a aVar = this.f37890a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.a$c */
    public static final class C15540c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C15537a f37891a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f37892b;

        static {
            Covode.recordClassIndex(17802);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            AbstractC89171a aVar = this.f37892b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC89171a aVar = this.f37892b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f37891a.f37888b.setVisibility(0);
        }

        public C15540c(C15537a aVar, AbstractC89171a aVar2) {
            this.f37891a = aVar;
            this.f37892b = aVar2;
        }
    }

    /* renamed from: a */
    public final void mo25322a(AbstractC89171a<C89391z> aVar) {
        String animation = this.f37887a.getAnimation();
        switch (animation.hashCode()) {
            case -1383228885:
                if (animation.equals("bottom")) {
                    this.f37888b.setVisibility(4);
                    this.f37888b.post(new RunnableC15541d(this, aVar));
                    return;
                }
                break;
            case 3005871:
                if (animation.equals("auto")) {
                    this.f37888b.setVisibility(4);
                    this.f37888b.post(new RunnableC15545f(this, aVar));
                    return;
                }
                break;
            case 3387192:
                if (animation.equals("none")) {
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                break;
            case 108511772:
                if (animation.equals("right")) {
                    this.f37888b.setVisibility(4);
                    this.f37888b.post(new RunnableC15543e(this, aVar));
                    return;
                }
                break;
        }
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public C15537a(C21137b bVar, View view) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        this.f37887a = bVar;
        this.f37888b = view;
    }

    /* renamed from: a */
    public static Object m28668a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10671);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(10671);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
