package androidx.core.p037h;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p037h.C0726a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.core.h.v */
public class C0792v {

    /* renamed from: a */
    private static final AtomicInteger f2948a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f2949b;

    /* renamed from: c */
    private static boolean f2950c;

    /* renamed from: d */
    private static Field f2951d;

    /* renamed from: e */
    private static boolean f2952e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f2953f;

    /* renamed from: g */
    private static WeakHashMap<View, C0807z> f2954g = null;

    /* renamed from: h */
    private static Method f2955h;

    /* renamed from: i */
    private static Field f2956i;

    /* renamed from: j */
    private static boolean f2957j = false;

    /* renamed from: k */
    private static ThreadLocal<Rect> f2958k;

    /* renamed from: l */
    private static final int[] f2959l = {R.id.aq, R.id.ar, R.id.b2, R.id.bc, R.id.bf, R.id.bg, R.id.bh, R.id.bi, R.id.bj, R.id.bk, R.id.as, R.id.at, R.id.au, R.id.av, R.id.aw, R.id.ax, R.id.ay, R.id.az, R.id.b0, R.id.b1, R.id.b3, R.id.b4, R.id.b5, R.id.b6, R.id.b7, R.id.b8, R.id.b9, R.id.b_, R.id.ba, R.id.bb, R.id.bd, R.id.be};

    /* renamed from: m */
    private static View$OnAttachStateChangeListenerC0797a f2960m = new View$OnAttachStateChangeListenerC0797a();

    /* renamed from: androidx.core.h.v$d */
    public interface AbstractC0800d {
        static {
            Covode.recordClassIndex(881);
        }

        /* renamed from: a */
        boolean mo2923a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.h.v$e */
    public static class C0801e {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f2966a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f2967b;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f2968c;

        /* renamed from: d */
        private WeakReference<KeyEvent> f2969d;

        C0801e() {
        }

        static {
            Covode.recordClassIndex(882);
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m2802a() {
            if (this.f2968c == null) {
                this.f2968c = new SparseArray<>();
            }
            return this.f2968c;
        }

        /* renamed from: b */
        private void m2805b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2967b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2966a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2967b == null) {
                        this.f2967b = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2966a;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2967b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2967b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        static C0801e m2803a(View view) {
            C0801e eVar = (C0801e) view.getTag(R.id.ef0);
            if (eVar != null) {
                return eVar;
            }
            C0801e eVar2 = new C0801e();
            view.setTag(R.id.ef0, eVar2);
            return eVar2;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
            if (r0 == null) goto L_0x0034;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo2924a(android.view.KeyEvent r6) {
            /*
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.f2969d
                r4 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r4
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f2969d = r0
                r0 = 0
                android.util.SparseArray r3 = r5.m2802a()
                int r0 = r6.getAction()
                r2 = 1
                if (r0 != r2) goto L_0x0034
                int r0 = r6.getKeyCode()
                int r1 = r3.indexOfKey(r0)
                if (r1 < 0) goto L_0x0034
                java.lang.Object r0 = r3.valueAt(r1)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r3.removeAt(r1)
                if (r0 != 0) goto L_0x0040
            L_0x0034:
                int r0 = r6.getKeyCode()
                java.lang.Object r0 = r3.get(r0)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                if (r0 == 0) goto L_0x0052
            L_0x0040:
                java.lang.Object r1 = r0.get()
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L_0x0051
                boolean r0 = androidx.core.p037h.C0792v.m2791y(r1)
                if (r0 == 0) goto L_0x0051
                m2806b(r1)
            L_0x0051:
                return r2
            L_0x0052:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.p037h.C0792v.C0801e.mo2924a(android.view.KeyEvent):boolean");
        }

        /* renamed from: b */
        private static boolean m2806b(View view) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.ef1);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((AbstractC0800d) arrayList.get(size)).mo2923a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private View m2804b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2967b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m2804b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m2806b(view)) {
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo2925a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m2805b();
            }
            View b = m2804b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b == null) {
                    return false;
                }
                if (KeyEvent.isModifierKey(keyCode)) {
                    return true;
                }
                m2802a().put(keyCode, new WeakReference<>(b));
                return true;
            } else if (b != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    protected C0792v() {
    }

    /* renamed from: a */
    public static void m2747a(View view, C0726a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null) {
            if (m2736a(view) instanceof C0726a.C0727a) {
                aVar = new C0726a();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = aVar.f2829a;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: a */
    public static void m2753a(View view, boolean z) {
        int i = Build.VERSION.SDK_INT;
        view.setHasTransientState(z);
    }

    /* renamed from: a */
    public static void m2750a(View view, Runnable runnable) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m2751a(View view, Runnable runnable, long j) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: a */
    public static void m2752a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2953f == null) {
            f2953f = new WeakHashMap<>();
        }
        f2953f.put(view, str);
    }

    /* renamed from: a */
    public static void m2754a(ViewGroup viewGroup) {
        if (f2955h == null) {
            try {
                f2955h = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            f2955h.setAccessible(true);
        }
        try {
            f2955h.invoke(viewGroup, true);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    /* renamed from: a */
    public static void m2748a(View view, final AbstractC0788r rVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                /* class androidx.core.p037h.C0792v.View$OnApplyWindowInsetsListenerC07931 */

                static {
                    Covode.recordClassIndex(874);
                }

                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return AbstractC0788r.this.mo553a(view, C0753ad.m2637a(windowInsets)).mo2870e();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m2746a(View view, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static void m2744a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC0791u) {
            ((AbstractC0791u) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m2745a(View view, Rect rect) {
        int i = Build.VERSION.SDK_INT;
        view.setClipBounds(rect);
    }

    /* renamed from: a */
    public static void m2749a(View view, C0789s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (sVar != null ? sVar.f2947a : null));
        }
    }

    /* renamed from: a */
    public static boolean m2755a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0801e.m2803a(view).mo2924a(keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.h.v$b */
    public static abstract class AbstractC0798b<T> {

        /* renamed from: a */
        private final int f2963a;

        /* renamed from: b */
        private final Class<T> f2964b;

        /* renamed from: c */
        private final int f2965c;

        static {
            Covode.recordClassIndex(879);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo2918a(View view);

        /* renamed from: b */
        private static boolean m2797b() {
            int i = Build.VERSION.SDK_INT;
            return true;
        }

        /* renamed from: a */
        private boolean m2796a() {
            if (Build.VERSION.SDK_INT >= this.f2965c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final T mo2922b(View view) {
            if (m2796a()) {
                return mo2918a(view);
            }
            if (!m2797b()) {
                return null;
            }
            T t = (T) view.getTag(this.f2963a);
            if (this.f2964b.isInstance(t)) {
                return t;
            }
            return null;
        }

        AbstractC0798b(int i, Class<T> cls) {
            this(i, cls, 28);
        }

        AbstractC0798b(int i, Class<T> cls, int i2) {
            this.f2963a = i;
            this.f2964b = cls;
            this.f2965c = 28;
        }
    }

    /* renamed from: c */
    private static AbstractC0798b<CharSequence> m2763c() {
        return new AbstractC0798b<CharSequence>(CharSequence.class) {
            /* class androidx.core.p037h.C0792v.C07953 */

            static {
                Covode.recordClassIndex(876);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* access modifiers changed from: package-private */
            @Override // androidx.core.p037h.C0792v.AbstractC0798b
            /* renamed from: a */
            public final /* synthetic */ CharSequence mo2918a(View view) {
                return view.getAccessibilityPaneTitle();
            }
        };
    }

    /* renamed from: androidx.core.h.v$a */
    static class View$OnAttachStateChangeListenerC0797a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f2962a = new WeakHashMap<>();

        static {
            Covode.recordClassIndex(878);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        View$OnAttachStateChangeListenerC0797a() {
        }

        public final void onGlobalLayout() {
            boolean z;
            int i;
            for (Map.Entry<View, Boolean> entry : this.f2962a.entrySet()) {
                View key = entry.getKey();
                boolean booleanValue = entry.getValue().booleanValue();
                boolean z2 = true;
                if (key.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (booleanValue != z) {
                    if (z && ((AccessibilityManager) C0792v.m2738a(key.getContext(), "accessibility")).isEnabled()) {
                        if (C0792v.m2792z(key) == null) {
                            z2 = false;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        if (key.getAccessibilityLiveRegion() != 0 || (z2 && key.getVisibility() == 0)) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain();
                            if (z2) {
                                i = 32;
                            } else {
                                i = 2048;
                            }
                            obtain.setEventType(i);
                            obtain.setContentChangeTypes(16);
                            key.sendAccessibilityEventUnchecked(obtain);
                        } else if (key.getParent() != null) {
                            try {
                                key.getParent().notifySubtreeAccessibilityStateChanged(key, key, 16);
                            } catch (AbstractMethodError unused) {
                                key.getParent().getClass().getSimpleName();
                            }
                        }
                    }
                    this.f2962a.put(key, Boolean.valueOf(z));
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: a */
    public static int m2735a() {
        int i = Build.VERSION.SDK_INT;
        return View.generateViewId();
    }

    /* renamed from: b */
    private static Rect m2756b() {
        if (f2958k == null) {
            f2958k = new ThreadLocal<>();
        }
        Rect rect = f2958k.get();
        if (rect == null) {
            rect = new Rect();
            f2958k.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    static {
        Covode.recordClassIndex(873);
    }

    /* renamed from: B */
    private static void m2734B(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: c */
    public static void m2764c(View view) {
        int i = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    /* renamed from: d */
    public static int m2766d(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    /* renamed from: e */
    public static int m2768e(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    /* renamed from: f */
    public static int m2770f(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingStart();
    }

    /* renamed from: g */
    public static int m2772g(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingEnd();
    }

    /* renamed from: h */
    public static int m2774h(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumWidth();
    }

    /* renamed from: i */
    public static int m2775i(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    /* renamed from: k */
    public static float m2777k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: m */
    public static int m2779m(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: o */
    public static boolean m2781o(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getFitsSystemWindows();
    }

    /* renamed from: p */
    public static boolean m2782p(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOverlappingRendering();
    }

    /* renamed from: q */
    public static boolean m2783q(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isPaddingRelative();
    }

    /* renamed from: u */
    public static void m2787u(View view) {
        if (view instanceof AbstractC0781k) {
            ((AbstractC0781k) view).mo2900a(1);
        }
    }

    /* renamed from: v */
    public static boolean m2788v(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    /* renamed from: w */
    public static float m2789w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: x */
    public static Rect m2790x(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getClipBounds();
    }

    /* renamed from: y */
    public static boolean m2791y(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    /* renamed from: z */
    public static CharSequence m2792z(View view) {
        return m2763c().mo2922b(view);
    }

    /* renamed from: a */
    public static View.AccessibilityDelegate m2736a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m2733A(view);
    }

    /* renamed from: j */
    public static C0807z m2776j(View view) {
        if (f2954g == null) {
            f2954g = new WeakHashMap<>();
        }
        C0807z zVar = f2954g.get(view);
        if (zVar != null) {
            return zVar;
        }
        C0807z zVar2 = new C0807z(view);
        f2954g.put(view, zVar2);
        return zVar2;
    }

    /* renamed from: l */
    public static String m2778l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f2953f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: n */
    public static void m2780n(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        view.requestFitSystemWindows();
    }

    /* renamed from: r */
    public static ColorStateList m2784r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof AbstractC0791u) {
            return ((AbstractC0791u) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: s */
    public static PorterDuff.Mode m2785s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof AbstractC0791u) {
            return ((AbstractC0791u) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: t */
    public static boolean m2786t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof AbstractC0780j) {
            return ((AbstractC0780j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: A */
    private static View.AccessibilityDelegate m2733A(View view) {
        if (f2957j) {
            return null;
        }
        if (f2956i == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2956i = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2957j = true;
                return null;
            }
        }
        try {
            Object obj = f2956i.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2957j = true;
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m2760b(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasTransientState();
    }

    /* renamed from: a */
    public static void m2740a(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setImportantForAccessibility(i);
    }

    /* renamed from: b */
    public static void m2759b(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setLayoutDirection(i);
    }

    /* renamed from: b */
    public static void m2758b(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: b */
    public static C0753ad m2757b(View view, C0753ad adVar) {
        WindowInsets e;
        if (Build.VERSION.SDK_INT < 21 || (e = adVar.mo2870e()) == null || view.dispatchApplyWindowInsets(e).equals(e)) {
            return adVar;
        }
        return C0753ad.m2637a(e);
    }

    /* renamed from: c */
    public static <T extends View> T m2762c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* renamed from: f */
    private static void m2771f(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m2734B(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2734B((View) parent);
            }
        }
    }

    /* renamed from: g */
    private static void m2773g(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m2734B(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2734B((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static C0753ad m2737a(View view, C0753ad adVar) {
        WindowInsets e;
        if (Build.VERSION.SDK_INT >= 21 && (e = adVar.mo2870e()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(e);
            if (!onApplyWindowInsets.equals(e)) {
                return C0753ad.m2637a(onApplyWindowInsets);
            }
        }
        return adVar;
    }

    /* renamed from: c */
    public static void m2765c(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    /* renamed from: a */
    public static Object m2738a(Context context, String str) {
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

    /* renamed from: d */
    public static void m2767d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b = m2756b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2771f(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m2771f(view, i);
        }
    }

    /* renamed from: e */
    public static void m2769e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b = m2756b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2773g(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m2773g(view, i);
        }
    }

    /* renamed from: a */
    public static void m2739a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: b */
    static boolean m2761b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0801e.m2803a(view).mo2925a(view, keyEvent);
    }

    /* renamed from: a */
    public static void m2743a(View view, ColorStateList colorStateList) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC0791u) {
            ((AbstractC0791u) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2741a(View view, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2742a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0799c.m2800a(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: androidx.core.h.v$c */
    static class C0799c {
        static {
            Covode.recordClassIndex(880);
        }

        /* renamed from: a */
        static void m2800a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }
}
