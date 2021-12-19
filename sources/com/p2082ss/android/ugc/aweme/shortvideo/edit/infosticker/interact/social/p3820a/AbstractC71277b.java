package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45886d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.C71231a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3825ui.SocialTouchableEditText;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b */
public abstract class AbstractC71277b<T> extends FrameLayout {

    /* renamed from: a */
    public TuxTextView f159750a;

    /* renamed from: b */
    public FrameLayout f159751b;

    /* renamed from: c */
    AbstractC71284d<T> f159752c;

    /* renamed from: d */
    C71231a f159753d;

    /* renamed from: e */
    C71231a f159754e;

    /* renamed from: f */
    Animator f159755f;

    /* renamed from: g */
    PointF f159756g;

    /* renamed from: h */
    boolean f159757h;

    /* renamed from: i */
    boolean f159758i;

    /* renamed from: j */
    int f159759j;

    /* renamed from: k */
    int f159760k;

    /* renamed from: l */
    private final String f159761l;

    /* renamed from: m */
    private AbstractC71288f<T> f159762m;

    static {
        Covode.recordClassIndex(83796);
    }

    /* renamed from: a */
    public abstract Animator mo112712a();

    /* renamed from: a */
    public abstract void mo112714a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo112717a(String str);

    /* renamed from: b */
    public abstract AbstractC71284d<T> mo112718b();

    public abstract void setSearchListMarginBottom(int i);

    public abstract void setSearchListViewVisibility(int i);

    public final C71231a getClickSrcAnimatorInfo() {
        return this.f159753d;
    }

    public final PointF getDeltaPointF() {
        return this.f159756g;
    }

    public final C71231a getEditDstAnimatorInfo() {
        return this.f159754e;
    }

    public final int getMEditState() {
        return this.f159759j;
    }

    public final AbstractC71288f<T> getMEditingListener() {
        return this.f159762m;
    }

    public final AbstractC71284d<T> getMInputView() {
        return this.f159752c;
    }

    public final boolean getMIsDismissing() {
        return this.f159758i;
    }

    public final boolean getMIsEditing() {
        return this.f159757h;
    }

    public final int getMKeyboardHeight() {
        return this.f159760k;
    }

    public final Animator getModifyAnimator() {
        return this.f159755f;
    }

    public Typeface getCustomTypeface() {
        return C45989b.m88764a().mo77597c(this.f159761l);
    }

    public final TuxTextView getMCompleteView() {
        TuxTextView tuxTextView = this.f159750a;
        if (tuxTextView == null) {
            C89219l.m154710a("mCompleteView");
        }
        return tuxTextView;
    }

    public final FrameLayout getMInputTextContainer() {
        FrameLayout frameLayout = this.f159751b;
        if (frameLayout == null) {
            C89219l.m154710a("mInputTextContainer");
        }
        return frameLayout;
    }

    /* renamed from: c */
    public void mo112719c() {
        Editable editable;
        SocialTouchableEditText mEditTextView;
        AbstractC71284d<T> dVar = this.f159752c;
        if (dVar == null || (mEditTextView = dVar.getMEditTextView()) == null) {
            editable = null;
        } else {
            editable = mEditTextView.getText();
        }
        mo112717a(String.valueOf(editable));
    }

    /* renamed from: d */
    public final void mo112720d() {
        Object obj;
        this.f159759j = C71283c.f159769a;
        if (!this.f159758i) {
            this.f159758i = true;
            AbstractC71284d<T> dVar = this.f159752c;
            if (dVar != null) {
                String content = dVar.getContent();
                if (content == null || content.length() == 0) {
                    mo112715a((AbstractC71284d) dVar);
                    this.f159757h = false;
                    this.f159758i = false;
                    obj = C89391z.f203057a;
                } else {
                    Animator animator = this.f159755f;
                    if (animator != null) {
                        animator.cancel();
                    }
                    obj = m125937a(dVar, new C71278a(dVar, this));
                }
                if (obj != null) {
                    return;
                }
            }
            this.f159757h = false;
            this.f159758i = false;
        }
    }

    /* renamed from: e */
    public final void mo112721e() {
        InputMethodManager inputMethodManager = (InputMethodManager) m125938a(getContext(), "input_method");
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

    public final void setMEditState(int i) {
        this.f159759j = i;
    }

    public final void setMEditingListener(AbstractC71288f<T> fVar) {
        this.f159762m = fVar;
    }

    public final void setMInputView(AbstractC71284d<T> dVar) {
        this.f159752c = dVar;
    }

    public final void setMIsDismissing(boolean z) {
        this.f159758i = z;
    }

    public final void setMIsEditing(boolean z) {
        this.f159757h = z;
    }

    public final void setMKeyboardHeight(int i) {
        this.f159760k = i;
    }

    public final void setModifyAnimator(Animator animator) {
        this.f159755f = animator;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b$b */
    public static final class C71279b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC71277b f159765a;

        static {
            Covode.recordClassIndex(83798);
        }

        C71279b(AbstractC71277b bVar) {
            this.f159765a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f159765a.setSearchListViewVisibility(0);
            this.f159765a.mo112719c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b$c */
    public static final class C71280c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC71277b f159766a;

        static {
            Covode.recordClassIndex(83799);
        }

        C71280c(AbstractC71277b bVar) {
            this.f159766a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f159766a.setSearchListViewVisibility(0);
            this.f159766a.mo112719c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b$d */
    public static final class C71281d extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ AbstractC71277b f159767a;

        static {
            Covode.recordClassIndex(83800);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71281d(AbstractC71277b bVar) {
            this.f159767a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f159767a.mo112721e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b$e */
    public static final class C71282e extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ AbstractC71277b f159768a;

        static {
            Covode.recordClassIndex(83801);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71282e(AbstractC71277b bVar) {
            this.f159768a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f159768a.mo112721e();
        }
    }

    public final void setClickSrcAnimatorInfo(C71231a aVar) {
        C89219l.m154721d(aVar, "");
        this.f159753d = aVar;
    }

    public final void setDeltaPointF(PointF pointF) {
        C89219l.m154721d(pointF, "");
        this.f159756g = pointF;
    }

    public final void setEditDstAnimatorInfo(C71231a aVar) {
        C89219l.m154721d(aVar, "");
        this.f159754e = aVar;
    }

    public final void setMCompleteView(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        this.f159750a = tuxTextView;
    }

    public final void setMInputTextContainer(FrameLayout frameLayout) {
        C89219l.m154721d(frameLayout, "");
        this.f159751b = frameLayout;
    }

    /* renamed from: a */
    private static void m125939a(C71231a aVar) {
        float f = aVar.f159631c % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        aVar.f159631c = f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b$a */
    public static final class C71278a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC71284d f159763a;

        /* renamed from: b */
        final /* synthetic */ AbstractC71277b f159764b;

        static {
            Covode.recordClassIndex(83797);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f159764b.mo112715a((AbstractC71284d) this.f159763a);
            this.f159764b.setMIsEditing(false);
            this.f159764b.setMIsDismissing(false);
        }

        C71278a(AbstractC71284d dVar, AbstractC71277b bVar) {
            this.f159763a = dVar;
            this.f159764b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo112715a(AbstractC71284d<T> dVar) {
        C89219l.m154721d(dVar, "");
        setSearchListViewVisibility(8);
        FrameLayout frameLayout = this.f159751b;
        if (frameLayout == null) {
            C89219l.m154710a("mInputTextContainer");
        }
        frameLayout.removeView(dVar);
        SocialTouchableEditText mEditTextView = dVar.getMEditTextView();
        mEditTextView.setMode(true);
        C45886d.m88529a((EditText) mEditTextView, false);
        AbstractC71284d<T> dVar2 = this.f159752c;
        if (dVar2 != null) {
            dVar2.setScaleX(1.0f);
            dVar2.setScaleY(1.0f);
            dVar2.setRotation(0.0f);
            dVar2.setTranslationX(0.0f);
            dVar2.setTranslationY(0.0f);
            this.f159753d = new C71231a((byte) 0);
        }
        AbstractC71288f<T> fVar = this.f159762m;
        if (fVar != null) {
            fVar.mo112780a(dVar, false);
        }
        this.f159752c = null;
        setVisibility(4);
        mo112721e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractC71277b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final void mo112713a(float f, float f2) {
        this.f159756g.x = f;
        this.f159756g.y = f2;
    }

    /* renamed from: a */
    private static Object m125938a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    private Animator m125937a(AbstractC71284d<T> dVar, Animator.AnimatorListener animatorListener) {
        float f;
        C89219l.m154721d(dVar, "");
        Animator a = mo112712a();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar, "scaleX", this.f159754e.f159629a, this.f159753d.f159629a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dVar, "scaleY", this.f159754e.f159630b, this.f159753d.f159630b);
        float[] fArr = new float[2];
        if (this.f159753d.f159631c > 180.0f) {
            f = 360.0f;
        } else {
            f = this.f159754e.f159631c;
        }
        fArr[0] = f;
        fArr[1] = this.f159753d.f159631c;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dVar, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dVar, "x", this.f159754e.f159632d, this.f159753d.f159632d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dVar, "y", this.f159754e.f159633e, this.f159753d.f159633e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        if (a != null) {
            a.setDuration(50);
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).after(a);
        } else {
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
        }
        animatorSet.addListener(animatorListener);
        animatorSet.start();
        return animatorSet;
    }

    /* renamed from: a */
    public final void mo112716a(AbstractC71284d<T> dVar, C71231a aVar) {
        int i;
        C89219l.m154721d(aVar, "");
        setVisibility(0);
        setSearchListViewVisibility(4);
        if (dVar != null) {
            this.f159759j = C71283c.f159771c;
            this.f159753d = aVar;
            m125939a(aVar);
            ViewParent parent = dVar.getParent();
            if (parent != null) {
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(dVar);
            }
            this.f159752c = dVar;
            dVar.setVisibility(4);
            FrameLayout frameLayout = this.f159751b;
            if (frameLayout == null) {
                C89219l.m154710a("mInputTextContainer");
            }
            frameLayout.addView(dVar, new FrameLayout.LayoutParams(-2, -2, 1));
            SocialTouchableEditText mEditTextView = dVar.getMEditTextView();
            mEditTextView.setMode(false);
            C45886d.m88529a((EditText) mEditTextView, true);
            C45886d.m88527a(mEditTextView);
            Editable text = mEditTextView.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            mEditTextView.setSelection(i);
            Object a = m125938a(mEditTextView.getContext(), "input_method");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) a).toggleSoftInput(0, 2);
            return;
        }
        this.f159759j = C71283c.f159770b;
        AbstractC71284d<T> b = mo112718b();
        b.setVisibility(4);
        FrameLayout frameLayout2 = this.f159751b;
        if (frameLayout2 == null) {
            C89219l.m154710a("mInputTextContainer");
        }
        frameLayout2.addView(b, new FrameLayout.LayoutParams(-2, -2, 1));
        this.f159752c = b;
        SocialTouchableEditText mEditTextView2 = b.getMEditTextView();
        if (mEditTextView2 != null) {
            mEditTextView2.setMode(false);
            C45886d.m88527a(mEditTextView2);
            Object a2 = m125938a(mEditTextView2.getContext(), "input_method");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) a2).toggleSoftInput(0, 2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC71277b(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f159761l = "Neon";
        this.f159753d = new C71231a((byte) 0);
        this.f159754e = new C71231a((byte) 0);
        this.f159756g = new PointF(0.0f, 0.0f);
        this.f159759j = C71283c.f159769a;
        setBackgroundColor(C0643b.m2378c(getContext(), R.color.bk));
        LayoutInflater.from(getContext()).inflate(R.layout.ahh, this);
        View findViewById = findViewById(R.id.ey8);
        C89219l.m154716b(findViewById, "");
        this.f159750a = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.b5i);
        C89219l.m154716b(findViewById2, "");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f159751b = frameLayout;
        if (frameLayout == null) {
            C89219l.m154710a("mInputTextContainer");
        }
        mo112714a(frameLayout);
        setOnClickListener(new C71281d(this));
        TuxTextView tuxTextView = this.f159750a;
        if (tuxTextView == null) {
            C89219l.m154710a("mCompleteView");
        }
        tuxTextView.setOnClickListener(new C71282e(this));
        setVisibility(4);
    }
}
