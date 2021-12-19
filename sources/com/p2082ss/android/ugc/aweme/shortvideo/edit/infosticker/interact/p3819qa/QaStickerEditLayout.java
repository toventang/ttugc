package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.AbstractC71250a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.AbstractC71253b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout */
public final class QaStickerEditLayout extends FrameLayout implements AbstractC71274g {

    /* renamed from: a */
    FrameLayout f159675a;

    /* renamed from: b */
    public QaStickerView f159676b;

    /* renamed from: c */
    public FrameLayout f159677c;

    /* renamed from: d */
    public final AbstractC89171a<C89391z> f159678d;

    /* renamed from: e */
    volatile int f159679e;

    /* renamed from: f */
    int f159680f;

    /* renamed from: g */
    C71244a f159681g;

    /* renamed from: h */
    C71244a f159682h;

    /* renamed from: i */
    C71244a f159683i;

    /* renamed from: j */
    AnimatorSet f159684j;

    /* renamed from: k */
    AbstractC71250a f159685k;

    /* renamed from: l */
    AbstractC71253b f159686l;

    /* renamed from: m */
    private AbstractC89172b<? super QaStickerView, C89391z> f159687m;

    /* renamed from: n */
    private TuxTextView f159688n;

    /* renamed from: o */
    private C65863a f159689o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$f */
    public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC71249f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f159699a;

        static {
            Covode.recordClassIndex(83765);
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC71249f(AbstractC89171a aVar) {
            this.f159699a = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            C89219l.m154716b(this.f159699a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(83759);
    }

    public QaStickerEditLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.qasticker.view.QaStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.qasticker.view.QaStickerView, h.z> */
    public final AbstractC89172b<QaStickerView, C89391z> getOnCompleteListener() {
        return this.f159687m;
    }

    /* renamed from: a */
    public final void mo112654a() {
        int i;
        AbstractC71250a aVar = this.f159685k;
        if (aVar == null) {
            C89219l.m154710a("addMethod");
        }
        if (aVar instanceof AbstractC71250a.C71251a) {
            C71244a aVar2 = this.f159681g;
            int height = getHeight();
            QaStickerView qaStickerView = this.f159676b;
            if (qaStickerView != null) {
                i = qaStickerView.getHeight();
            } else {
                i = 0;
            }
            aVar2.f159694e = (float) ((height - i) / 2);
        }
        this.f159686l = AbstractC71253b.C71256c.f159704a;
        m125890a(this.f159676b, this.f159682h, this.f159681g, new C71245b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$e */
    static final class C71248e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ QaStickerEditLayout f159698a;

        static {
            Covode.recordClassIndex(83764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71248e(QaStickerEditLayout qaStickerEditLayout) {
            super(0);
            this.f159698a = qaStickerEditLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            QaStickerEditLayout qaStickerEditLayout = this.f159698a;
            if (qaStickerEditLayout.f159676b != null && !(!C89219l.m154714a(qaStickerEditLayout.f159686l, AbstractC71253b.C71257d.f159705a))) {
                Rect rect = new Rect();
                FrameLayout frameLayout = qaStickerEditLayout.f159677c;
                if (frameLayout == null) {
                    C89219l.m154710a("root");
                }
                frameLayout.getWindowVisibleDisplayFrame(rect);
                if (qaStickerEditLayout.getHeight() - rect.height() > C71273f.f159732a) {
                    qaStickerEditLayout.f159686l = AbstractC71253b.C71255b.f159703a;
                    qaStickerEditLayout.f159679e = qaStickerEditLayout.getHeight() - rect.height();
                    QaStickerView qaStickerView = qaStickerEditLayout.f159676b;
                    if (qaStickerView != null) {
                        qaStickerEditLayout.f159682h = new C71244a(0.0f, 0.0f, (float) ((qaStickerEditLayout.getWidth() - qaStickerView.getWidth()) / 2), (float) (((qaStickerEditLayout.getHeight() - qaStickerEditLayout.f159679e) - qaStickerView.getHeight()) / 2), 7);
                    }
                    AbstractC71250a aVar = qaStickerEditLayout.f159685k;
                    if (aVar == null) {
                        C89219l.m154710a("addMethod");
                    }
                    if (aVar instanceof AbstractC71250a.C71252b) {
                        qaStickerEditLayout.f159684j = QaStickerEditLayout.m125890a(qaStickerEditLayout.f159676b, qaStickerEditLayout.f159681g, qaStickerEditLayout.f159682h, null);
                        qaStickerEditLayout.f159686l = AbstractC71253b.C71254a.f159702a;
                    } else if (aVar instanceof AbstractC71250a.C71251a) {
                        QaStickerView qaStickerView2 = qaStickerEditLayout.f159676b;
                        if (qaStickerView2 != null) {
                            qaStickerEditLayout.f159681g.f159693d = (float) ((qaStickerEditLayout.getWidth() - qaStickerView2.getWidth()) / 2);
                            qaStickerEditLayout.f159681g.f159694e = (float) (((qaStickerEditLayout.getHeight() - qaStickerEditLayout.f159679e) - qaStickerView2.getHeight()) / 2);
                        }
                        qaStickerEditLayout.f159684j = QaStickerEditLayout.m125890a(qaStickerEditLayout.f159676b, qaStickerEditLayout.f159681g, qaStickerEditLayout.f159682h, null);
                        qaStickerEditLayout.f159686l = AbstractC71253b.C71254a.f159702a;
                    }
                    qaStickerEditLayout.f159680f = rect.height();
                }
            }
            return C89391z.f203057a;
        }
    }

    public final void setOnCompleteListener(AbstractC89172b<? super QaStickerView, C89391z> bVar) {
        this.f159687m = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$b */
    public static final class C71245b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ QaStickerEditLayout f159695a;

        static {
            Covode.recordClassIndex(83761);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71245b(QaStickerEditLayout qaStickerEditLayout) {
            this.f159695a = qaStickerEditLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(12566);
            QaStickerEditLayout qaStickerEditLayout = this.f159695a;
            QaStickerView qaStickerView = qaStickerEditLayout.f159676b;
            if (qaStickerView != null) {
                qaStickerView.mo9139b();
            }
            FrameLayout frameLayout = qaStickerEditLayout.f159675a;
            if (frameLayout == null) {
                C89219l.m154710a("rootViw");
            }
            frameLayout.removeView(qaStickerEditLayout.f159676b);
            qaStickerEditLayout.f159686l = AbstractC71253b.C71257d.f159705a;
            QaStickerView qaStickerView2 = qaStickerEditLayout.f159676b;
            if (qaStickerView2 != null) {
                qaStickerView2.setTouchAble(false);
                qaStickerView2.setScaleX(1.0f);
                qaStickerView2.setScaleY(1.0f);
                qaStickerView2.setRotation(0.0f);
                qaStickerView2.setTranslationX(0.0f);
                qaStickerView2.setTranslationY(0.0f);
                qaStickerEditLayout.f159680f = 0;
                qaStickerEditLayout.f159681g = new C71244a(0.0f, 0.0f, 0.0f, 0.0f, 31);
                qaStickerEditLayout.f159683i = new C71244a(0.0f, 0.0f, 0.0f, 0.0f, 31);
            }
            AbstractC89172b<QaStickerView, C89391z> onCompleteListener = this.f159695a.getOnCompleteListener();
            if (onCompleteListener != null) {
                onCompleteListener.invoke(this.f159695a.f159676b);
            }
            this.f159695a.f159676b = null;
            QaStickerEditLayout qaStickerEditLayout2 = this.f159695a;
            InputMethodManager inputMethodManager = (InputMethodManager) QaStickerEditLayout.m125891a(qaStickerEditLayout2.getContext(), "input_method");
            Context context = qaStickerEditLayout2.getContext();
            C89219l.m154716b(context, "");
            Activity a = C67279a.m119194a(context);
            if (!(a == null || inputMethodManager == null)) {
                Window window = a.getWindow();
                C89219l.m154716b(window, "");
                View decorView = window.getDecorView();
                C89219l.m154716b(decorView, "");
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            }
            this.f159695a.setVisibility(4);
            MethodCollector.m26664o(12566);
        }
    }

    public final void setMobHelper(C65863a aVar) {
        C89219l.m154721d(aVar, "");
        this.f159689o = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$c */
    static final class View$OnClickListenerC71246c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QaStickerEditLayout f159696a;

        static {
            Covode.recordClassIndex(83762);
        }

        View$OnClickListenerC71246c(QaStickerEditLayout qaStickerEditLayout) {
            this.f159696a = qaStickerEditLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f159696a.mo112654a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$d */
    static final class View$OnClickListenerC71247d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QaStickerEditLayout f159697a;

        static {
            Covode.recordClassIndex(83763);
        }

        View$OnClickListenerC71247d(QaStickerEditLayout qaStickerEditLayout) {
            this.f159697a = qaStickerEditLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f159697a.mo112654a();
        }
    }

    /* renamed from: a */
    private static void m125892a(C71244a aVar) {
        float f = aVar.f159692c % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        aVar.f159692c = f;
    }

    /* renamed from: a */
    public static Object m125891a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12149);
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
                    MethodCollector.m26664o(12149);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (p4600h.C89391z.f203057a == null) goto L_0x0054;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.AbstractC71274g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112655a(com.p2082ss.android.ugc.aweme.qasticker.view.QaStickerView r26, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.QaStickerEditLayout.C71244a r27) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.QaStickerEditLayout.mo112655a(com.ss.android.ugc.aweme.qasticker.view.QaStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$a):void");
    }

    private /* synthetic */ QaStickerEditLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QaStickerEditLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12153);
        this.f159678d = new C71248e(this);
        this.f159681g = new C71244a(0.0f, 0.0f, 0.0f, 0.0f, 31);
        this.f159682h = new C71244a(0.0f, 0.0f, 0.0f, 0.0f, 31);
        this.f159683i = new C71244a(0.0f, 0.0f, 0.0f, 0.0f, 31);
        this.f159686l = AbstractC71253b.C71257d.f159705a;
        setBackgroundColor(C0643b.m2378c(getContext(), R.color.bk));
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.agy, this, false);
        if (a != null) {
            FrameLayout frameLayout = (FrameLayout) a;
            this.f159675a = frameLayout;
            if (frameLayout == null) {
                C89219l.m154710a("rootViw");
            }
            addView(frameLayout);
            FrameLayout frameLayout2 = this.f159675a;
            if (frameLayout2 == null) {
                C89219l.m154710a("rootViw");
            }
            View findViewById = frameLayout2.findViewById(R.id.ey6);
            C89219l.m154716b(findViewById, "");
            this.f159688n = (TuxTextView) findViewById;
            setVisibility(4);
            TuxTextView tuxTextView = this.f159688n;
            if (tuxTextView == null) {
                C89219l.m154710a("done");
            }
            tuxTextView.setOnClickListener(new View$OnClickListenerC71246c(this));
            setOnClickListener(new View$OnClickListenerC71247d(this));
            MethodCollector.m26664o(12153);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(12153);
        throw nullPointerException;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$a */
    public static final class C71244a {

        /* renamed from: a */
        public float f159690a;

        /* renamed from: b */
        public float f159691b;

        /* renamed from: c */
        public float f159692c;

        /* renamed from: d */
        public float f159693d;

        /* renamed from: e */
        public float f159694e;

        static {
            Covode.recordClassIndex(83760);
        }

        public C71244a() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 31);
        }

        private C71244a(float f, float f2, float f3, float f4) {
            this.f159690a = f;
            this.f159691b = f2;
            this.f159692c = 0.0f;
            this.f159693d = f3;
            this.f159694e = f4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C71244a(float f, float f2, float f3, float f4, int i) {
            this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 0.0f : f4);
        }
    }

    /* renamed from: a */
    static AnimatorSet m125890a(View view, C71244a aVar, C71244a aVar2, AnimatorListenerAdapter animatorListenerAdapter) {
        float f;
        if (view == null) {
            return null;
        }
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", aVar.f159690a, aVar2.f159690a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", aVar.f159691b, aVar2.f159691b);
        float[] fArr = new float[2];
        fArr[0] = aVar.f159692c;
        if (aVar2.f159692c > 180.0f) {
            f = 360.0f;
        } else {
            f = aVar2.f159692c;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", aVar.f159693d, aVar2.f159693d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", aVar.f159694e, aVar2.f159694e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        animatorSet.start();
        return animatorSet;
    }
}
