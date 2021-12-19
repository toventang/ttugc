package androidx.core.p037h.p038a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p037h.p038a.AbstractC0741g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.h.a.d */
public final class C0733d {

    /* renamed from: d */
    private static int f2836d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f2837a;

    /* renamed from: b */
    public int f2838b = -1;

    /* renamed from: c */
    public int f2839c = -1;

    static {
        Covode.recordClassIndex(814);
    }

    /* renamed from: b */
    private static String m2598b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: a */
    public final void mo2836a(boolean z) {
        this.f2837a.setCheckable(z);
    }

    /* renamed from: a */
    public final boolean mo2837a() {
        int i = Build.VERSION.SDK_INT;
        return this.f2837a.isAccessibilityFocused();
    }

    /* renamed from: a */
    public final void mo2835a(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2837a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C0736c) obj).f2882a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: androidx.core.h.a.d$a */
    public static class C0734a {

        /* renamed from: A */
        public static final C0734a f2840A;

        /* renamed from: B */
        public static final C0734a f2841B;

        /* renamed from: C */
        public static final C0734a f2842C;

        /* renamed from: D */
        public static final C0734a f2843D;

        /* renamed from: E */
        public static final C0734a f2844E;

        /* renamed from: F */
        public static final C0734a f2845F;

        /* renamed from: G */
        public static final C0734a f2846G;

        /* renamed from: H */
        public static final C0734a f2847H;

        /* renamed from: I */
        public static final C0734a f2848I;

        /* renamed from: J */
        public static final C0734a f2849J;

        /* renamed from: K */
        public static final C0734a f2850K;

        /* renamed from: a */
        public static final C0734a f2851a = new C0734a(1);

        /* renamed from: b */
        public static final C0734a f2852b = new C0734a(2);

        /* renamed from: c */
        public static final C0734a f2853c = new C0734a(4);

        /* renamed from: d */
        public static final C0734a f2854d = new C0734a(8);

        /* renamed from: e */
        public static final C0734a f2855e = new C0734a(16);

        /* renamed from: f */
        public static final C0734a f2856f = new C0734a(32);

        /* renamed from: g */
        public static final C0734a f2857g = new C0734a(64);

        /* renamed from: h */
        public static final C0734a f2858h = new C0734a(128);

        /* renamed from: i */
        public static final C0734a f2859i = new C0734a(256, AbstractC0741g.C0743b.class);

        /* renamed from: j */
        public static final C0734a f2860j = new C0734a(512, AbstractC0741g.C0743b.class);

        /* renamed from: k */
        public static final C0734a f2861k = new C0734a(1024, AbstractC0741g.C0744c.class);

        /* renamed from: l */
        public static final C0734a f2862l = new C0734a(2048, AbstractC0741g.C0744c.class);

        /* renamed from: m */
        public static final C0734a f2863m = new C0734a(4096);

        /* renamed from: n */
        public static final C0734a f2864n = new C0734a(8192);

        /* renamed from: o */
        public static final C0734a f2865o = new C0734a(16384);

        /* renamed from: p */
        public static final C0734a f2866p = new C0734a(32768);

        /* renamed from: q */
        public static final C0734a f2867q = new C0734a(65536);

        /* renamed from: r */
        public static final C0734a f2868r = new C0734a(131072, AbstractC0741g.C0748g.class);

        /* renamed from: s */
        public static final C0734a f2869s = new C0734a(262144);

        /* renamed from: t */
        public static final C0734a f2870t = new C0734a(524288);

        /* renamed from: u */
        public static final C0734a f2871u = new C0734a(1048576);

        /* renamed from: v */
        public static final C0734a f2872v = new C0734a(2097152, AbstractC0741g.C0749h.class);

        /* renamed from: w */
        public static final C0734a f2873w;

        /* renamed from: x */
        public static final C0734a f2874x;

        /* renamed from: y */
        public static final C0734a f2875y;

        /* renamed from: z */
        public static final C0734a f2876z;

        /* renamed from: L */
        final Object f2877L;

        /* renamed from: M */
        protected final AbstractC0741g f2878M;

        /* renamed from: N */
        private final int f2879N;

        /* renamed from: O */
        private final Class<? extends AbstractC0741g.AbstractC0742a> f2880O;

        public final int hashCode() {
            Object obj = this.f2877L;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        /* renamed from: a */
        public final int mo2849a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2877L).getId();
            }
            return 0;
        }

        /* renamed from: b */
        public final CharSequence mo2851b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2877L).getLabel();
            }
            return null;
        }

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            Covode.recordClassIndex(815);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityAction = null;
            }
            f2873w = new C0734a(accessibilityAction, 16908342, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                accessibilityAction2 = null;
            }
            f2874x = new C0734a(accessibilityAction2, 16908343, AbstractC0741g.C0746e.class);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            } else {
                accessibilityAction3 = null;
            }
            f2875y = new C0734a(accessibilityAction3, 16908344, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            } else {
                accessibilityAction4 = null;
            }
            f2876z = new C0734a(accessibilityAction4, 16908345, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            } else {
                accessibilityAction5 = null;
            }
            f2840A = new C0734a(accessibilityAction5, 16908346, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
            } else {
                accessibilityAction6 = null;
            }
            f2841B = new C0734a(accessibilityAction6, 16908347, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction7 = null;
            }
            f2842C = new C0734a(accessibilityAction7, 16908358, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction8 = null;
            }
            f2843D = new C0734a(accessibilityAction8, 16908359, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction9 = null;
            }
            f2844E = new C0734a(accessibilityAction9, 16908360, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction10 = null;
            }
            f2845F = new C0734a(accessibilityAction10, 16908361, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                accessibilityAction11 = null;
            }
            f2846G = new C0734a(accessibilityAction11, 16908348, null);
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction12 = null;
            }
            f2847H = new C0734a(accessibilityAction12, 16908349, AbstractC0741g.C0747f.class);
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction13 = null;
            }
            f2848I = new C0734a(accessibilityAction13, 16908354, AbstractC0741g.C0745d.class);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction14 = null;
            }
            f2849J = new C0734a(accessibilityAction14, 16908356, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction15 = null;
            }
            f2850K = new C0734a(accessibilityAction15, 16908357, null);
        }

        private C0734a(int i) {
            this(null, i, null);
        }

        C0734a(Object obj) {
            this(obj, 0, null);
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0734a)) {
                return false;
            }
            C0734a aVar = (C0734a) obj;
            Object obj2 = this.f2877L;
            if (obj2 == null) {
                if (aVar.f2877L != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f2877L)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo2850a(Bundle bundle) {
            if (this.f2878M == null) {
                return false;
            }
            Class<? extends AbstractC0741g.AbstractC0742a> cls = this.f2880O;
            if (cls != null) {
                try {
                    ((AbstractC0741g.AbstractC0742a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).f2886a = bundle;
                } catch (Exception unused) {
                    Class<? extends AbstractC0741g.AbstractC0742a> cls2 = this.f2880O;
                    if (cls2 != null) {
                        cls2.getName();
                    }
                }
            }
            return this.f2878M.mo2864a();
        }

        private C0734a(int i, Class<? extends AbstractC0741g.AbstractC0742a> cls) {
            this(null, i, cls);
        }

        private C0734a(Object obj, int i, Class<? extends AbstractC0741g.AbstractC0742a> cls) {
            this.f2879N = i;
            this.f2878M = null;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f2877L = obj;
            } else {
                this.f2877L = new AccessibilityNodeInfo.AccessibilityAction(i, null);
            }
            this.f2880O = cls;
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2837a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: b */
    public final Bundle mo2838b() {
        int i = Build.VERSION.SDK_INT;
        return this.f2837a.getExtras();
    }

    /* renamed from: d */
    private List<C0734a> m2601d() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList;
        if (Build.VERSION.SDK_INT < 21 || (actionList = this.f2837a.getActionList()) == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0734a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: c */
    private CharSequence m2599c() {
        if (!(!mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f2837a.getText();
        }
        List<Integer> a = mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a2 = mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a3 = mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a4 = mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2837a.getText(), 0, this.f2837a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C0728a(a4.get(i).intValue(), this, mo2838b().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a.get(i).intValue(), a2.get(i).intValue(), a3.get(i).intValue());
        }
        return spannableString;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo2831a(rect);
        sb.append("; boundsInParent: ".concat(String.valueOf(rect)));
        mo2839b(rect);
        sb.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        sb.append("; packageName: ").append(this.f2837a.getPackageName());
        sb.append("; className: ").append(this.f2837a.getClassName());
        sb.append("; text: ").append(m2599c());
        sb.append("; contentDescription: ").append(this.f2837a.getContentDescription());
        StringBuilder append = sb.append("; viewId: ");
        int i = Build.VERSION.SDK_INT;
        append.append(this.f2837a.getViewIdResourceName());
        sb.append("; checkable: ").append(this.f2837a.isCheckable());
        sb.append("; checked: ").append(this.f2837a.isChecked());
        sb.append("; focusable: ").append(this.f2837a.isFocusable());
        sb.append("; focused: ").append(this.f2837a.isFocused());
        sb.append("; selected: ").append(this.f2837a.isSelected());
        sb.append("; clickable: ").append(this.f2837a.isClickable());
        sb.append("; longClickable: ").append(this.f2837a.isLongClickable());
        sb.append("; enabled: ").append(this.f2837a.isEnabled());
        sb.append("; password: ").append(this.f2837a.isPassword());
        sb.append("; scrollable: " + this.f2837a.isScrollable());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C0734a> d = m2601d();
            for (int i2 = 0; i2 < d.size(); i2++) {
                C0734a aVar = d.get(i2);
                String b = m2598b(aVar.mo2849a());
                if (b.equals("ACTION_UNKNOWN") && aVar.mo2851b() != null) {
                    b = aVar.mo2851b().toString();
                }
                sb.append(b);
                if (i2 != d.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = this.f2837a.getActions();
            if (actions != 0) {
                while (true) {
                    int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                    actions &= numberOfTrailingZeros ^ -1;
                    sb.append(m2598b(numberOfTrailingZeros));
                    if (actions == 0) {
                        break;
                    }
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: androidx.core.h.a.d$b */
    public static class C0735b {

        /* renamed from: a */
        public final Object f2881a;

        static {
            Covode.recordClassIndex(816);
        }

        public C0735b(Object obj) {
            this.f2881a = obj;
        }
    }

    /* renamed from: androidx.core.h.a.d$c */
    public static class C0736c {

        /* renamed from: a */
        final Object f2882a;

        static {
            Covode.recordClassIndex(817);
        }

        private C0736c(Object obj) {
            this.f2882a = obj;
        }

        /* renamed from: a */
        public static C0736c m2623a(int i, int i2, int i3, int i4) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new C0736c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, false));
            }
            int i5 = Build.VERSION.SDK_INT;
            return new C0736c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false));
        }
    }

    /* renamed from: a */
    public static C0733d m2596a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0733d(accessibilityNodeInfo);
    }

    /* renamed from: b */
    public final void mo2839b(Rect rect) {
        this.f2837a.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public final void mo2843c(boolean z) {
        this.f2837a.setFocused(z);
    }

    /* renamed from: d */
    public final void mo2844d(boolean z) {
        this.f2837a.setScrollable(z);
    }

    private C0733d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2837a = accessibilityNodeInfo;
    }

    /* renamed from: b */
    public static SparseArray<WeakReference<ClickableSpan>> m2597b(View view) {
        return (SparseArray) view.getTag(R.id.eeh);
    }

    /* renamed from: a */
    public final void mo2829a(int i) {
        this.f2837a.addAction(i);
    }

    /* renamed from: e */
    public final void mo2845e(boolean z) {
        int i = Build.VERSION.SDK_INT;
        this.f2837a.setDismissable(z);
    }

    /* renamed from: c */
    public static ClickableSpan[] m2600c(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public final List<Integer> mo2828a(String str) {
        int i = Build.VERSION.SDK_INT;
        ArrayList<Integer> integerArrayList = this.f2837a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2837a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo2840b(CharSequence charSequence) {
        this.f2837a.setText(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0733d)) {
            return false;
        }
        C0733d dVar = (C0733d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2837a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f2837a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f2837a)) {
            return false;
        }
        if (this.f2839c == dVar.f2839c && this.f2838b == dVar.f2838b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo2841b(boolean z) {
        this.f2837a.setFocusable(z);
    }

    /* renamed from: a */
    public final void mo2831a(Rect rect) {
        this.f2837a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public final void mo2832a(View view) {
        this.f2838b = -1;
        this.f2837a.setParent(view);
    }

    /* renamed from: b */
    public final boolean mo2842b(C0734a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2837a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2877L);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2833a(C0734a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2837a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2877L);
        }
    }

    /* renamed from: a */
    public final void mo2834a(CharSequence charSequence) {
        this.f2837a.setClassName(charSequence);
    }

    /* renamed from: a */
    public static int m2595a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2836d;
        f2836d = i2 + 1;
        return i2;
    }

    /* renamed from: a */
    public final void mo2830a(int i, boolean z) {
        Bundle b = mo2838b();
        if (b != null) {
            int i2 = b.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            b.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }
}
