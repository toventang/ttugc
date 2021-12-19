package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PointF;
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
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout */
public final class PollingStickerLayout extends FrameLayout implements View.OnClickListener, AbstractC71242d {

    /* renamed from: a */
    FrameLayout f159596a;

    /* renamed from: b */
    public FrameLayout f159597b;

    /* renamed from: c */
    public final AbstractC89171a<C89391z> f159598c = new C71224c(this);

    /* renamed from: d */
    AbstractC89172b<? super PollingStickerView, C89391z> f159599d;

    /* renamed from: e */
    AbstractC89172b<? super PollingStickerView, C89391z> f159600e;

    /* renamed from: f */
    C71231a f159601f = new C71231a((byte) 0);

    /* renamed from: g */
    C71231a f159602g = new C71231a((byte) 0);

    /* renamed from: h */
    volatile int f159603h;

    /* renamed from: i */
    int f159604i;

    /* renamed from: j */
    boolean f159605j = true;

    /* renamed from: k */
    boolean f159606k;

    /* renamed from: l */
    boolean f159607l;

    /* renamed from: m */
    PointF f159608m = new PointF(0.0f, 0.0f);

    /* renamed from: n */
    public PollingStickerView f159609n;

    /* renamed from: o */
    int f159610o = C71243e.f159670b;

    /* renamed from: p */
    public boolean f159611p;

    /* renamed from: q */
    public Animator f159612q;

    /* renamed from: r */
    private int f159613r = 3;

    /* renamed from: s */
    private HashMap f159614s;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$e */
    public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC71226e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f159619a;

        static {
            Covode.recordClassIndex(83740);
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC71226e(AbstractC89171a aVar) {
            this.f159619a = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            C89219l.m154716b(this.f159619a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(83735);
    }

    /* renamed from: d */
    private View m125855d() {
        if (this.f159614s == null) {
            this.f159614s = new HashMap();
        }
        View view = (View) this.f159614s.get(Integer.valueOf((int) R.id.ey9));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.ey9);
        this.f159614s.put(Integer.valueOf((int) R.id.ey9), findViewById);
        return findViewById;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z> */
    public final AbstractC89172b<PollingStickerView, C89391z> getBeforeChangeListener() {
        return this.f159600e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z> */
    public final AbstractC89172b<PollingStickerView, C89391z> getOnCompleteListener() {
        return this.f159599d;
    }

    /* renamed from: a */
    public final void mo112611a() {
        this.f159610o = C71243e.f159670b;
        m125854c();
    }

    /* renamed from: b */
    private final void m125853b() {
        InputMethodManager inputMethodManager = (InputMethodManager) m125851a(getContext(), "input_method");
        Context context = getContext();
        C89219l.m154716b(context, "");
        Activity a = C67279a.m119194a(context);
        if (a != null && inputMethodManager != null) {
            Window window = a.getWindow();
            C89219l.m154716b(window, "");
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    /* renamed from: c */
    private void m125854c() {
        this.f159606k = false;
        PollingStickerView pollingStickerView = this.f159609n;
        if (pollingStickerView != null) {
            pollingStickerView.setTouchEnable(true);
        }
        if (!this.f159607l) {
            PollingStickerView pollingStickerView2 = this.f159609n;
            if (pollingStickerView2 != null) {
                this.f159612q = m125850a(pollingStickerView2, new C71222a(this));
                m125853b();
            }
            this.f159607l = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$c */
    static final class C71224c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PollingStickerLayout f159617a;

        static {
            Covode.recordClassIndex(83738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71224c(PollingStickerLayout pollingStickerLayout) {
            super(0);
            this.f159617a = pollingStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            boolean z;
            float f;
            AbstractC89172b<? super PollingStickerView, C89391z> bVar;
            int abs;
            PollingStickerLayout pollingStickerLayout = this.f159617a;
            if (pollingStickerLayout.f159609n != null) {
                Rect rect = new Rect();
                FrameLayout frameLayout = pollingStickerLayout.f159597b;
                if (frameLayout == null) {
                    C89219l.m154710a("root");
                }
                frameLayout.getWindowVisibleDisplayFrame(rect);
                if (pollingStickerLayout.f159604i != 0 && pollingStickerLayout.getHeight() > pollingStickerLayout.f159604i && ((pollingStickerLayout.getHeight() <= rect.height() || (abs = Math.abs(pollingStickerLayout.getHeight() - rect.height())) <= C40979n.m82503a() + 2 || abs <= C40979n.m82508c(pollingStickerLayout.getContext())) && (bVar = pollingStickerLayout.f159600e) != null)) {
                    bVar.invoke(pollingStickerLayout.f159609n);
                }
                if (pollingStickerLayout.getHeight() - rect.height() > C71243e.f159669a) {
                    pollingStickerLayout.f159603h = pollingStickerLayout.getHeight() - rect.height();
                    PollingStickerView pollingStickerView = pollingStickerLayout.f159609n;
                    if (pollingStickerView != null) {
                        pollingStickerLayout.f159601f.f159632d = (float) ((pollingStickerLayout.getWidth() - pollingStickerView.getWidth()) / 2);
                        pollingStickerLayout.f159601f.f159633e = (float) (((pollingStickerLayout.getHeight() - pollingStickerLayout.f159603h) - pollingStickerView.getHeight()) / 2);
                    }
                    int i = pollingStickerLayout.f159610o;
                    if (i == C71243e.f159672d) {
                        pollingStickerLayout.f159610o = C71243e.f159670b;
                        pollingStickerLayout.f159607l = false;
                        if (!pollingStickerLayout.f159606k) {
                            PollingStickerView pollingStickerView2 = pollingStickerLayout.f159609n;
                            if (pollingStickerView2 != null) {
                                pollingStickerView2.setVisibility(0);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pollingStickerView2, "scaleX", pollingStickerLayout.f159602g.f159629a, pollingStickerLayout.f159601f.f159629a);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pollingStickerView2, "scaleY", pollingStickerLayout.f159602g.f159630b, pollingStickerLayout.f159601f.f159630b);
                                float[] fArr = new float[2];
                                fArr[0] = pollingStickerLayout.f159602g.f159631c;
                                if (pollingStickerLayout.f159602g.f159631c > 180.0f) {
                                    f = 360.0f;
                                } else {
                                    f = pollingStickerLayout.f159601f.f159631c;
                                }
                                fArr[1] = f;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pollingStickerView2, "rotation", fArr);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pollingStickerView2, "x", pollingStickerLayout.f159602g.f159632d, pollingStickerLayout.f159601f.f159632d);
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pollingStickerView2, "y", pollingStickerLayout.f159602g.f159633e, pollingStickerLayout.f159601f.f159633e);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.setDuration(300L);
                                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                                animatorSet.addListener(new C71223b(pollingStickerLayout));
                                animatorSet.start();
                            }
                            pollingStickerLayout.f159606k = true;
                        }
                    } else if (i == C71243e.f159671c) {
                        pollingStickerLayout.f159610o = C71243e.f159670b;
                        pollingStickerLayout.f159607l = false;
                        if (!pollingStickerLayout.f159606k) {
                            PollingStickerView pollingStickerView3 = pollingStickerLayout.f159609n;
                            if (pollingStickerView3 != null) {
                                pollingStickerLayout.f159602g.f159632d = (float) ((pollingStickerLayout.getWidth() - pollingStickerView3.getWidth()) / 2);
                                PollEditText pollEditText = (PollEditText) pollingStickerView3.mo112627b(R.id.axa);
                                C89219l.m154716b(pollEditText, "");
                                if (String.valueOf(pollEditText.getText()).length() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    pollingStickerLayout.f159602g.f159633e = (((pollingStickerLayout.f159608m.x - ((float) pollingStickerView3.getHeight())) / 2.0f) + pollingStickerLayout.f159608m.y) - (((float) pollingStickerView3.getHeight()) - C13628n.m24520b(pollingStickerLayout.getContext(), 96.0f));
                                } else {
                                    pollingStickerLayout.f159602g.f159633e = ((pollingStickerLayout.f159608m.x - ((float) pollingStickerView3.getHeight())) / 2.0f) + pollingStickerLayout.f159608m.y;
                                }
                                pollingStickerView3.setX(pollingStickerLayout.f159601f.f159632d);
                                pollingStickerView3.setY(pollingStickerLayout.f159601f.f159633e);
                                pollingStickerView3.setVisibility(0);
                                pollingStickerLayout.requestLayout();
                                PollingStickerView pollingStickerView4 = pollingStickerLayout.f159609n;
                                if (pollingStickerView4 != null) {
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(pollingStickerView4, "scaleX", 0.0f, 1.0f);
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(pollingStickerView4, "scaleY", 0.0f, 1.0f);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    animatorSet2.setDuration(300L);
                                    animatorSet2.play(ofFloat6).with(ofFloat7);
                                    animatorSet2.addListener(new C71225d(pollingStickerLayout));
                                    animatorSet2.start();
                                }
                            }
                            pollingStickerLayout.f159606k = true;
                        }
                    }
                    pollingStickerLayout.f159604i = rect.height();
                }
            }
            return C89391z.f203057a;
        }
    }

    public final void setBeforeChangeListener(AbstractC89172b<? super PollingStickerView, C89391z> bVar) {
        this.f159600e = bVar;
    }

    public final void setMaxLine(int i) {
        this.f159613r = i;
    }

    public final void setOnCompleteListener(AbstractC89172b<? super PollingStickerView, C89391z> bVar) {
        this.f159599d = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$a */
    public static final class C71222a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ PollingStickerLayout f159615a;

        static {
            Covode.recordClassIndex(83736);
        }

        C71222a(PollingStickerLayout pollingStickerLayout) {
            this.f159615a = pollingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(11537);
            super.onAnimationEnd(animator);
            this.f159615a.f159612q = null;
            PollingStickerView pollingStickerView = this.f159615a.f159609n;
            if (pollingStickerView != null) {
                pollingStickerView.mo112624a();
            }
            PollingStickerLayout pollingStickerLayout = this.f159615a;
            PollingStickerView pollingStickerView2 = pollingStickerLayout.f159609n;
            if (pollingStickerView2 != null) {
                FrameLayout frameLayout = pollingStickerLayout.f159596a;
                if (frameLayout == null) {
                    C89219l.m154710a("container");
                }
                frameLayout.removeView(pollingStickerView2);
                pollingStickerView2.setEditEnable(false);
                PollingStickerView pollingStickerView3 = pollingStickerLayout.f159609n;
                if (pollingStickerView3 != null) {
                    pollingStickerView3.setScaleX(1.0f);
                    pollingStickerView3.setScaleY(1.0f);
                    pollingStickerView3.setRotation(0.0f);
                    pollingStickerView3.setTranslationX(0.0f);
                    pollingStickerView3.setTranslationY(0.0f);
                    pollingStickerLayout.f159605j = false;
                    pollingStickerLayout.f159604i = 0;
                    pollingStickerLayout.f159602g = new C71231a((byte) 0);
                }
                AbstractC89172b<? super PollingStickerView, C89391z> bVar = pollingStickerLayout.f159599d;
                if (bVar != null) {
                    bVar.invoke(pollingStickerLayout.f159609n);
                }
                pollingStickerLayout.f159609n = null;
            }
            this.f159615a.setVisibility(4);
            MethodCollector.m26664o(11537);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$b */
    public static final class C71223b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ PollingStickerLayout f159616a;

        static {
            Covode.recordClassIndex(83737);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71223b(PollingStickerLayout pollingStickerLayout) {
            this.f159616a = pollingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            PollingStickerView pollingStickerView = this.f159616a.f159609n;
            if (pollingStickerView != null) {
                pollingStickerView.mo112628b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout$d */
    public static final class C71225d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ PollingStickerLayout f159618a;

        static {
            Covode.recordClassIndex(83739);
        }

        C71225d(PollingStickerLayout pollingStickerLayout) {
            this.f159618a = pollingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            PollingStickerView pollingStickerView = this.f159618a.f159609n;
            if (pollingStickerView != null) {
                pollingStickerView.mo112628b();
            }
        }
    }

    /* renamed from: a */
    private static void m125852a(C71231a aVar) {
        float f = aVar.f159631c % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        aVar.f159631c = f;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (C89219l.m154714a(view, this) || C89219l.m154714a(view, m125855d())) {
            m125853b();
        }
    }

    /* renamed from: a */
    public final void mo112612a(float f, float f2) {
        this.f159608m.x = f;
        this.f159608m.y = f2;
    }

    /* renamed from: a */
    private static Object m125851a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12535);
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
                    MethodCollector.m26664o(12535);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollingStickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(12766);
        setBackgroundColor(C0643b.m2378c(getContext(), R.color.bk));
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aix, this, false);
        if (a != null) {
            FrameLayout frameLayout = (FrameLayout) a;
            this.f159596a = frameLayout;
            if (frameLayout == null) {
                C89219l.m154710a("container");
            }
            addView(frameLayout);
            ((TuxTextView) m125855d()).setOnClickListener(this);
            setOnClickListener(this);
            setVisibility(4);
            MethodCollector.m26664o(12766);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(12766);
        throw nullPointerException;
    }

    /* renamed from: a */
    private final Animator m125850a(View view, Animator.AnimatorListener animatorListener) {
        float f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", this.f159601f.f159629a, this.f159602g.f159629a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.f159601f.f159630b, this.f159602g.f159630b);
        float[] fArr = new float[2];
        if (this.f159602g.f159631c > 180.0f) {
            f = 360.0f;
        } else {
            f = this.f159601f.f159631c;
        }
        fArr[0] = f;
        fArr[1] = this.f159602g.f159631c;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", this.f159601f.f159632d, this.f159602g.f159632d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", this.f159601f.f159633e, this.f159602g.f159633e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.addListener(animatorListener);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        animatorSet.start();
        return animatorSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (p4600h.C89391z.f203057a == null) goto L_0x005c;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.AbstractC71242d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112613a(com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView r9, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.C71231a r10) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout.mo112613a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a):void");
    }
}
