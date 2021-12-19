package com.bytedance.ies.uikit.p1282d;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.ies.uikit.d.a */
public final class C18248a {

    /* renamed from: A */
    private int f43464A = R.layout.ve;

    /* renamed from: a */
    public Context f43465a;

    /* renamed from: b */
    ViewGroup f43466b;

    /* renamed from: c */
    public int f43467c = 49;

    /* renamed from: d */
    int[] f43468d;

    /* renamed from: e */
    public View f43469e;

    /* renamed from: f */
    TextView f43470f;

    /* renamed from: g */
    AnimatorSet f43471g;

    /* renamed from: h */
    public long f43472h = 2500;

    /* renamed from: i */
    public boolean f43473i;

    /* renamed from: j */
    boolean f43474j;

    /* renamed from: k */
    public String f43475k;

    /* renamed from: l */
    public boolean f43476l;

    /* renamed from: m */
    public boolean f43477m;

    /* renamed from: n */
    WindowManager f43478n;

    /* renamed from: o */
    WindowManager.LayoutParams f43479o;

    /* renamed from: p */
    public float f43480p;

    /* renamed from: q */
    public float f43481q;

    /* renamed from: r */
    public AnimatorSet f43482r;

    /* renamed from: s */
    public AnimatorSet f43483s;

    /* renamed from: t */
    public boolean f43484t;

    /* renamed from: u */
    int f43485u;

    /* renamed from: v */
    private AnimatorSet f43486v;

    /* renamed from: w */
    private ImageView f43487w;

    /* renamed from: x */
    private View f43488x;

    /* renamed from: y */
    private boolean f43489y;

    /* renamed from: z */
    private int f43490z;

    static {
        Covode.recordClassIndex(20907);
    }

    /* renamed from: a */
    static void m33950a(WindowManager windowManager, View view) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            C15346a.m28240a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_ies_uikit_toast_CustomToast_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    /* renamed from: b */
    public final View mo29116b() {
        View view = this.f43469e;
        if (view == null) {
            return this.f43466b;
        }
        return view;
    }

    /* renamed from: c */
    public final boolean mo29117c() {
        View view = this.f43469e;
        if (view == null || !view.isShown()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo29119e() {
        if (this.f43465a == null || this.f43473i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private View m33952f() {
        LayoutInflater from = LayoutInflater.from(this.f43465a);
        if (-1 == this.f43490z) {
            return this.f43488x;
        }
        int i = this.f43464A;
        if (i <= 0) {
            if (this.f43489y) {
                i = R.layout.vb;
            } else {
                i = R.layout.va;
            }
        }
        try {
            View a = C1764a.m5927a(from, i, this.f43466b, false);
            this.f43488x = a;
            this.f43490z = i;
            return a;
        } catch (InflateException unused) {
            if (this.f43488x == null) {
                this.f43488x = C1764a.m5927a(from, R.layout.va, this.f43466b, false);
            }
            this.f43490z = R.layout.va;
            return this.f43488x;
        }
    }

    /* renamed from: d */
    public final void mo29118d() {
        MethodCollector.m26663i(11324);
        if (!this.f43474j) {
            MethodCollector.m26664o(11324);
            return;
        }
        ViewGroup viewGroup = this.f43466b;
        if (!(viewGroup == null || viewGroup.getParent() == null)) {
            m33950a(this.f43478n, this.f43466b);
            this.f43466b.removeView(this.f43469e);
        }
        this.f43474j = false;
        MethodCollector.m26664o(11324);
    }

    /* renamed from: a */
    public final AnimatorSet mo29112a() {
        if (this.f43486v == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f43486v = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f43466b, "translationY", 0.0f, (float) (-this.f43485u)), ObjectAnimator.ofFloat(this.f43466b, "alpha", 1.0f, 0.0f));
            this.f43486v.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f43486v.setDuration(320L);
        }
        return this.f43486v;
    }

    public C18248a(Context context) {
        MethodCollector.m26663i(11175);
        this.f43465a = context;
        this.f43468d = new int[4];
        if (!mo29119e()) {
            this.f43466b = new FrameLayout(this.f43465a);
            this.f43485u = (int) context.getResources().getDimension(R.dimen.tq);
            this.f43466b.setOnTouchListener(new View.OnTouchListener() {
                /* class com.bytedance.ies.uikit.p1282d.C18248a.View$OnTouchListenerC182491 */

                static {
                    Covode.recordClassIndex(20908);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        C18248a.this.f43480p = motionEvent.getY();
                        C18248a aVar = C18248a.this;
                        aVar.mo29113a(aVar.f43482r, 1.0f, 0.98f);
                        return false;
                    } else if (action == 1) {
                        C18248a aVar2 = C18248a.this;
                        aVar2.mo29113a(aVar2.f43483s, 0.98f, 1.0f);
                        if (!C18248a.this.f43477m || C18248a.this.f43481q - C18248a.this.f43480p >= 0.0f || Math.abs(C18248a.this.f43481q - C18248a.this.f43480p) <= 20.0f) {
                            return false;
                        }
                        HandlerC18250b.m33961a().mo29123b(C18248a.this);
                        return false;
                    } else if (action == 2) {
                        C18248a.this.f43481q = motionEvent.getY();
                        return false;
                    } else if (action != 3) {
                        return false;
                    } else {
                        C18248a aVar3 = C18248a.this;
                        aVar3.mo29113a(aVar3.f43483s, 0.98f, 1.0f);
                        return false;
                    }
                }
            });
        }
        MethodCollector.m26664o(11175);
    }

    /* renamed from: a */
    public final void mo29114a(AnimatorSet animatorSet, AnimatorSet animatorSet2) {
        this.f43471g = animatorSet;
        this.f43486v = animatorSet2;
    }

    /* renamed from: a */
    public final void mo29115a(String str, int i) {
        this.f43469e = m33952f();
        m33951b(str, i);
        HandlerC18250b.m33961a().mo29122a(this);
    }

    /* renamed from: a */
    static Object m33949a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11475);
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
                    MethodCollector.m26664o(11475);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    private void m33951b(String str, int i) {
        if (!mo29119e()) {
            this.f43475k = str;
            View view = this.f43469e;
            if (view != null) {
                this.f43470f = (TextView) view.findViewById(R.id.text);
                this.f43487w = (ImageView) this.f43469e.findViewById(R.id.bh1);
            }
            ImageView imageView = this.f43487w;
            if (imageView != null && i == -1) {
                imageView.setVisibility(8);
            }
            this.f43469e.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        }
    }

    /* renamed from: a */
    public final void mo29113a(AnimatorSet animatorSet, float f, float f2) {
        if (this.f43484t) {
            if (animatorSet == null) {
                if (this.f43469e != null) {
                    animatorSet = new AnimatorSet();
                    animatorSet.play(ObjectAnimator.ofFloat(this.f43466b, "scaleX", f, f2)).with(ObjectAnimator.ofFloat(this.f43466b, "scaleY", f, f2));
                    animatorSet.setDuration(80L);
                } else {
                    return;
                }
            }
            animatorSet.start();
        }
    }
}
