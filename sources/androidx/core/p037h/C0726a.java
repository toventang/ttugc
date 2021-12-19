package androidx.core.p037h;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.core.p037h.p038a.C0737e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.h.a */
public class C0726a {

    /* renamed from: b */
    private static final View.AccessibilityDelegate f2828b = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f2829a;

    /* renamed from: c */
    private final View.AccessibilityDelegate f2830c;

    public C0726a() {
        this(f2828b);
    }

    static {
        Covode.recordClassIndex(807);
    }

    /* renamed from: androidx.core.h.a$a */
    public static final class C0727a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C0726a f2831a;

        static {
            Covode.recordClassIndex(808);
        }

        C0727a(C0726a aVar) {
            this.f2831a = aVar;
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0737e a = this.f2831a.mo2805a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.f2883a;
            }
            return null;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2831a.mo2811b(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2831a.mo2813d(view, accessibilityEvent);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2831a.mo2812c(view, accessibilityEvent);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.f2831a.mo2806a(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2831a.mo2807a(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean booleanValue;
            boolean booleanValue2;
            C0733d a = C0733d.m2596a(accessibilityNodeInfo);
            Boolean bool = (Boolean) new C0792v.AbstractC0798b<Boolean>(Boolean.class) {
                /* class androidx.core.p037h.C0792v.C07942 */

                static {
                    Covode.recordClassIndex(875);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // androidx.core.p037h.C0792v.AbstractC0798b
                /* renamed from: a */
                public final /* synthetic */ Boolean mo2918a(View view) {
                    return Boolean.valueOf(view.isScreenReaderFocusable());
                }
            }.mo2922b(view);
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                a.f2837a.setScreenReaderFocusable(booleanValue);
            } else {
                a.mo2830a(1, booleanValue);
            }
            Boolean bool2 = (Boolean) new C0792v.AbstractC0798b<Boolean>(Boolean.class) {
                /* class androidx.core.p037h.C0792v.C07964 */

                static {
                    Covode.recordClassIndex(877);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // androidx.core.p037h.C0792v.AbstractC0798b
                /* renamed from: a */
                public final /* synthetic */ Boolean mo2918a(View view) {
                    return Boolean.valueOf(view.isAccessibilityHeading());
                }
            }.mo2922b(view);
            if (bool2 == null) {
                booleanValue2 = false;
            } else {
                booleanValue2 = bool2.booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                a.f2837a.setHeading(booleanValue2);
            } else {
                a.mo2830a(2, booleanValue2);
            }
            CharSequence z = C0792v.m2792z(view);
            if (Build.VERSION.SDK_INT >= 28) {
                a.f2837a.setPaneTitle(z);
            } else {
                int i = Build.VERSION.SDK_INT;
                a.f2837a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", z);
            }
            this.f2831a.mo2808a(view, a);
            CharSequence text = accessibilityNodeInfo.getText();
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT < 26) {
                int i3 = Build.VERSION.SDK_INT;
                a.f2837a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                a.f2837a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                a.f2837a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                a.f2837a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray<WeakReference<ClickableSpan>> b = C0733d.m2597b(view);
                if (b != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < b.size(); i4++) {
                        if (b.valueAt(i4).get() == null) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        b.remove(((Integer) arrayList.get(i5)).intValue());
                    }
                }
                ClickableSpan[] c = C0733d.m2600c(text);
                if (c != null && c.length > 0) {
                    a.mo2838b().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.ap);
                    SparseArray<WeakReference<ClickableSpan>> b2 = C0733d.m2597b(view);
                    if (b2 == null) {
                        b2 = new SparseArray<>();
                        view.setTag(R.id.eeh, b2);
                    }
                    for (int i6 = 0; i6 < c.length; i6++) {
                        int a2 = C0733d.m2595a(c[i6], b2);
                        b2.put(a2, new WeakReference<>(c[i6]));
                        ClickableSpan clickableSpan = c[i6];
                        Spanned spanned = (Spanned) text;
                        a.mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
                        a.mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
                        a.mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
                        a.mo2828a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(a2));
                    }
                }
            }
            List<C0733d.C0734a> b3 = C0726a.m2582b(view);
            for (int i7 = 0; i7 < b3.size(); i7++) {
                a.mo2833a(b3.get(i7));
            }
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2831a.mo2810a(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2831a.mo2809a(view, i, bundle);
        }
    }

    public C0726a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2830c = accessibilityDelegate;
        this.f2829a = new C0727a(this);
    }

    /* renamed from: b */
    static List<C0733d.C0734a> m2582b(View view) {
        List<C0733d.C0734a> list = (List) view.getTag(R.id.eeg);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: a */
    public C0737e mo2805a(View view) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2830c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0737e(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: a */
    public void mo2806a(View view, int i) {
        this.f2830c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: b */
    public boolean mo2811b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2830c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo2812c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2830c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
        this.f2830c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo2807a(View view, AccessibilityEvent accessibilityEvent) {
        this.f2830c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo2808a(View view, C0733d dVar) {
        this.f2830c.onInitializeAccessibilityNodeInfo(view, dVar.f2837a);
    }

    /* renamed from: a */
    public boolean mo2809a(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List<C0733d.C0734a> b = m2582b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C0733d.C0734a aVar = b.get(i2);
            if (aVar.mo2849a() == i) {
                boolean a = aVar.mo2850a(bundle);
                if (a) {
                    return a;
                }
            } else {
                i2++;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean performAccessibilityAction = this.f2830c.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != R.id.ap) {
            return performAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.eeh);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            ClickableSpan[] c = C0733d.m2600c(view.createAccessibilityNodeInfo().getText());
            int i5 = 0;
            if (c != null) {
                while (true) {
                    if (i5 >= c.length) {
                        break;
                    } else if (clickableSpan.equals(c[i5])) {
                        clickableSpan.onClick(view);
                        z = true;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2810a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2830c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
