package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0730c;
import androidx.core.p037h.p038a.C0733d;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C26685k;
import com.google.android.material.p1951a.C26555a;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C26709b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f63235a = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class com.google.android.material.snackbar.BaseTransientBottomBar.C266911 */

        static {
            Covode.recordClassIndex(32150);
        }

        public final boolean handleMessage(Message message) {
            Behavior behavior;
            MethodCollector.m26663i(11142);
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                if (baseTransientBottomBar.f63240e.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f63240e.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0560e) {
                        CoordinatorLayout.C0560e eVar = (CoordinatorLayout.C0560e) layoutParams;
                        if (baseTransientBottomBar.f63243h == null) {
                            behavior = new Behavior();
                        } else {
                            behavior = baseTransientBottomBar.f63243h;
                        }
                        if (behavior instanceof Behavior) {
                            behavior.f63262g.f63263a = baseTransientBottomBar.f63244i;
                        }
                        behavior.f62793b = new SwipeDismissBehavior.AbstractC26587a() {
                            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C266997 */

                            static {
                                Covode.recordClassIndex(32158);
                            }

                            @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC26587a
                            /* renamed from: a */
                            public final void mo43869a(View view) {
                                view.setVisibility(8);
                                BaseTransientBottomBar.this.mo44221a(0);
                            }

                            @Override // com.google.android.material.behavior.SwipeDismissBehavior.AbstractC26587a
                            /* renamed from: a */
                            public final void mo43868a(int i) {
                                if (i == 0) {
                                    C26709b.m53029a().mo44260b(BaseTransientBottomBar.this.f63244i);
                                } else if (i == 1 || i == 2) {
                                    C26709b.m53029a().mo44255a(BaseTransientBottomBar.this.f63244i);
                                }
                            }
                        };
                        eVar.mo2538a(behavior);
                        eVar.f2422g = 80;
                    }
                    baseTransientBottomBar.f63238c.addView(baseTransientBottomBar.f63240e);
                }
                baseTransientBottomBar.f63240e.setOnAttachStateChangeListener(new AbstractC26704b() {
                    /* class com.google.android.material.snackbar.BaseTransientBottomBar.C267008 */

                    static {
                        Covode.recordClassIndex(32159);
                    }

                    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC26704b
                    /* renamed from: a */
                    public final void mo44239a() {
                        if (C26709b.m53029a().mo44262d(BaseTransientBottomBar.this.f63244i)) {
                            BaseTransientBottomBar.f63235a.post(new Runnable() {
                                /* class com.google.android.material.snackbar.BaseTransientBottomBar.C267008.RunnableC267011 */

                                static {
                                    Covode.recordClassIndex(32160);
                                }

                                public final void run() {
                                    BaseTransientBottomBar.this.mo44228h();
                                }
                            });
                        }
                    }
                });
                if (!C0792v.m2788v(baseTransientBottomBar.f63240e)) {
                    baseTransientBottomBar.f63240e.setOnLayoutChangeListener(new AbstractC26705c() {
                        /* class com.google.android.material.snackbar.BaseTransientBottomBar.C267029 */

                        static {
                            Covode.recordClassIndex(32161);
                        }

                        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC26705c
                        /* renamed from: a */
                        public final void mo44241a() {
                            BaseTransientBottomBar.this.f63240e.setOnLayoutChangeListener(null);
                            if (BaseTransientBottomBar.this.mo44229i()) {
                                BaseTransientBottomBar.this.mo44225e();
                            } else {
                                BaseTransientBottomBar.this.mo44227g();
                            }
                        }
                    });
                } else if (baseTransientBottomBar.mo44229i()) {
                    baseTransientBottomBar.mo44225e();
                } else {
                    baseTransientBottomBar.mo44227g();
                }
                MethodCollector.m26664o(11142);
                return true;
            } else if (i != 1) {
                MethodCollector.m26664o(11142);
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i2 = message.arg1;
                if (!baseTransientBottomBar2.mo44229i() || baseTransientBottomBar2.f63240e.getVisibility() != 0) {
                    baseTransientBottomBar2.mo44228h();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar2.mo44226f());
                    valueAnimator.setInterpolator(C26555a.f62656b);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new AnimatorListenerAdapter(i2) {
                        /* class com.google.android.material.snackbar.BaseTransientBottomBar.C266942 */

                        /* renamed from: a */
                        final /* synthetic */ int f63251a;

                        static {
                            Covode.recordClassIndex(32153);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.mo44228h();
                        }

                        public final void onAnimationStart(Animator animator) {
                            BaseTransientBottomBar.this.f63241f.mo44250b();
                        }

                        {
                            this.f63251a = r2;
                        }
                    });
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.google.android.material.snackbar.BaseTransientBottomBar.C266953 */

                        /* renamed from: b */
                        private int f63254b;

                        static {
                            Covode.recordClassIndex(32154);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            if (BaseTransientBottomBar.f63236b) {
                                C0792v.m2767d(BaseTransientBottomBar.this.f63240e, intValue - this.f63254b);
                            } else {
                                BaseTransientBottomBar.this.f63240e.setTranslationY((float) intValue);
                            }
                            this.f63254b = intValue;
                        }
                    });
                    valueAnimator.start();
                }
                MethodCollector.m26664o(11142);
                return true;
            }
        }
    });

    /* renamed from: b */
    public static final boolean f63236b;

    /* renamed from: j */
    private static final int[] f63237j = {R.attr.acv};

    /* renamed from: c */
    final ViewGroup f63238c;

    /* renamed from: d */
    public final Context f63239d;

    /* renamed from: e */
    public final C26706d f63240e;

    /* renamed from: f */
    public final AbstractC26708a f63241f;

    /* renamed from: g */
    public int f63242g;

    /* renamed from: h */
    public Behavior f63243h;

    /* renamed from: i */
    final C26709b.AbstractC26711a f63244i = new C26709b.AbstractC26711a() {
        /* class com.google.android.material.snackbar.BaseTransientBottomBar.C266986 */

        static {
            Covode.recordClassIndex(32157);
        }

        @Override // com.google.android.material.snackbar.C26709b.AbstractC26711a
        /* renamed from: a */
        public final void mo44237a() {
            Handler handler = BaseTransientBottomBar.f63235a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C26709b.AbstractC26711a
        /* renamed from: a */
        public final void mo44238a(int i) {
            Handler handler = BaseTransientBottomBar.f63235a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: k */
    private List<Object<B>> f63245k;

    /* renamed from: l */
    private final AccessibilityManager f63246l;

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public interface AbstractC26704b {
        static {
            Covode.recordClassIndex(32164);
        }

        /* renamed from: a */
        void mo44239a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public interface AbstractC26705c {
        static {
            Covode.recordClassIndex(32165);
        }

        /* renamed from: a */
        void mo44241a();
    }

    /* renamed from: a */
    public int mo44220a() {
        return this.f63242g;
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public static class C26706d extends FrameLayout {

        /* renamed from: a */
        public final AccessibilityManager f63264a;

        /* renamed from: b */
        private final C0730c.AbstractC0731a f63265b;

        /* renamed from: c */
        private AbstractC26705c f63266c;

        /* renamed from: d */
        private AbstractC26704b f63267d;

        static {
            Covode.recordClassIndex(32166);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0792v.m2780n(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AbstractC26704b bVar = this.f63267d;
            if (bVar != null) {
                bVar.mo44239a();
            }
            C0730c.m2593a(this.f63264a, this.f63265b);
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(AbstractC26704b bVar) {
            this.f63267d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(AbstractC26705c cVar) {
            this.f63266c = cVar;
        }

        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        protected C26706d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            MethodCollector.m26663i(13099);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.sf, R.attr.a50});
            if (obtainStyledAttributes.hasValue(1)) {
                C0792v.m2739a(this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            }
            obtainStyledAttributes.recycle();
            AccessibilityManager accessibilityManager = (AccessibilityManager) m53016a(context, "accessibility");
            this.f63264a = accessibilityManager;
            C267071 r1 = new C0730c.AbstractC0731a() {
                /* class com.google.android.material.snackbar.BaseTransientBottomBar.C26706d.C267071 */

                static {
                    Covode.recordClassIndex(32167);
                }

                @Override // androidx.core.p037h.p038a.C0730c.AbstractC0731a
                /* renamed from: a */
                public final void mo2824a(boolean z) {
                    C26706d.this.setClickableOrFocusableBasedOnAccessibility(z);
                }
            };
            this.f63265b = r1;
            int i = Build.VERSION.SDK_INT;
            accessibilityManager.addTouchExplorationStateChangeListener(new C0730c.accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0732b(r1));
            setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
            MethodCollector.m26664o(13099);
        }

        /* renamed from: a */
        private static Object m53016a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(13164);
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
                        MethodCollector.m26664o(13164);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            MethodCollector.m26663i(13226);
            super.onLayout(z, i, i2, i3, i4);
            AbstractC26705c cVar = this.f63266c;
            if (cVar != null) {
                cVar.mo44241a();
            }
            MethodCollector.m26664o(13226);
        }
    }

    /* renamed from: c */
    public void mo44223c() {
        mo44221a(3);
    }

    /* renamed from: d */
    public boolean mo44224d() {
        return C26709b.m53029a().mo44261c(this.f63244i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo44226f() {
        int height = this.f63240e.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f63240e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo44229i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f63246l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        Covode.recordClassIndex(32149);
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT <= 19) {
            z = true;
        } else {
            z = false;
        }
        f63236b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo44227g() {
        C26709b a = C26709b.m53029a();
        C26709b.AbstractC26711a aVar = this.f63244i;
        synchronized (a.f63277a) {
            if (a.mo44263e(aVar)) {
                a.mo44257a(a.f63279c);
            }
        }
        List<Object<B>> list = this.f63245k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f63245k.get(size);
            }
        }
    }

    /* renamed from: b */
    public void mo44222b() {
        C26709b a = C26709b.m53029a();
        int a2 = mo44220a();
        C26709b.AbstractC26711a aVar = this.f63244i;
        synchronized (a.f63277a) {
            if (a.mo44263e(aVar)) {
                a.f63279c.f63283b = a2;
                a.f63278b.removeCallbacksAndMessages(a.f63279c);
                a.mo44257a(a.f63279c);
                return;
            }
            if (a.mo44264f(aVar)) {
                a.f63280d.f63283b = a2;
            } else {
                a.f63280d = new C26709b.C26712b(a2, aVar);
            }
            if (a.f63279c == null || !a.mo44258a(a.f63279c, 4)) {
                a.f63279c = null;
                a.mo44259b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo44225e() {
        int f = mo44226f();
        if (f63236b) {
            C0792v.m2767d(this.f63240e, f);
        } else {
            this.f63240e.setTranslationY((float) f);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(f, 0);
        valueAnimator.setInterpolator(C26555a.f62656b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C2669210 */

            static {
                Covode.recordClassIndex(32151);
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo44227g();
            }

            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f63241f.mo44249a();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(f) {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.C2669311 */

            /* renamed from: a */
            final /* synthetic */ int f63248a;

            /* renamed from: c */
            private int f63250c;

            static {
                Covode.recordClassIndex(32152);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f63236b) {
                    C0792v.m2767d(BaseTransientBottomBar.this.f63240e, intValue - this.f63250c);
                } else {
                    BaseTransientBottomBar.this.f63240e.setTranslationY((float) intValue);
                }
                this.f63250c = intValue;
            }

            {
                this.f63248a = r2;
                this.f63250c = r2;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo44228h() {
        C26709b a = C26709b.m53029a();
        C26709b.AbstractC26711a aVar = this.f63244i;
        synchronized (a.f63277a) {
            if (a.mo44263e(aVar)) {
                a.f63279c = null;
                if (a.f63280d != null) {
                    a.mo44259b();
                }
            }
        }
        List<Object<B>> list = this.f63245k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f63245k.get(size);
            }
        }
        ViewParent parent = this.f63240e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f63240e);
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: g */
        final C26703a f63262g = new C26703a(this);

        static {
            Covode.recordClassIndex(32162);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: a */
        public final boolean mo43867a(View view) {
            return view instanceof C26706d;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final boolean mo2528a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C26703a aVar = this.f63262g;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C26709b.m53029a().mo44260b(aVar.f63263a);
                }
            } else if (coordinatorLayout.mo2473a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C26709b.m53029a().mo44255a(aVar.f63263a);
            }
            return super.mo2528a(coordinatorLayout, view, motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44221a(int i) {
        C26709b.m53029a().mo44256a(this.f63244i, i);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public static class C26703a {

        /* renamed from: a */
        C26709b.AbstractC26711a f63263a;

        static {
            Covode.recordClassIndex(32163);
        }

        public C26703a(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f62796e = SwipeDismissBehavior.m52704a(0.1f);
            swipeDismissBehavior.f62797f = SwipeDismissBehavior.m52704a(0.6f);
            swipeDismissBehavior.f62794c = 0;
        }
    }

    /* renamed from: a */
    private static Object m52992a(Context context, String str) {
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

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, AbstractC26708a aVar) {
        int i;
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f63238c = viewGroup;
            this.f63241f = aVar;
            Context context = viewGroup.getContext();
            this.f63239d = context;
            C26685k.m52977a(context);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f63237j);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                i = R.layout.akw;
            } else {
                i = R.layout.vk;
            }
            C26706d dVar = (C26706d) C1764a.m5927a(from, i, viewGroup, false);
            this.f63240e = dVar;
            dVar.addView(view);
            int i2 = Build.VERSION.SDK_INT;
            dVar.setAccessibilityLiveRegion(1);
            C0792v.m2740a((View) dVar, 1);
            dVar.setFitsSystemWindows(true);
            C0792v.m2748a(dVar, new AbstractC0788r() {
                /* class com.google.android.material.snackbar.BaseTransientBottomBar.C266964 */

                static {
                    Covode.recordClassIndex(32155);
                }

                @Override // androidx.core.p037h.AbstractC0788r
                /* renamed from: a */
                public final C0753ad mo553a(View view, C0753ad adVar) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), adVar.mo2869d());
                    return adVar;
                }
            });
            C0792v.m2747a(dVar, new C0726a() {
                /* class com.google.android.material.snackbar.BaseTransientBottomBar.C266975 */

                static {
                    Covode.recordClassIndex(32156);
                }

                @Override // androidx.core.p037h.C0726a
                /* renamed from: a */
                public final void mo2808a(View view, C0733d dVar) {
                    super.mo2808a(view, dVar);
                    dVar.mo2829a(1048576);
                    dVar.mo2845e(true);
                }

                @Override // androidx.core.p037h.C0726a
                /* renamed from: a */
                public final boolean mo2809a(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.mo2809a(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.mo44223c();
                    return true;
                }
            });
            this.f63246l = (AccessibilityManager) m52992a(context, "accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }
}
