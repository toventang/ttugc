package com.lynx.tasm.behavior.p2052ui;

import android.content.ClipboardManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.b */
public class C28598b extends AccessibilityNodeProvider {

    /* renamed from: g */
    private static String f67328g = "LynxAccessibilityNodeProvider";

    /* renamed from: a */
    public int f67329a;

    /* renamed from: b */
    final UIGroup f67330b;

    /* renamed from: c */
    final ArrayList<C28600a> f67331c = new ArrayList<>();

    /* renamed from: d */
    final View f67332d;

    /* renamed from: e */
    C28600a f67333e;

    /* renamed from: f */
    public boolean f67334f = true;

    /* renamed from: h */
    private final int f67335h = 50;

    /* renamed from: i */
    private final AccessibilityManager f67336i;

    /* renamed from: j */
    private boolean f67337j;

    static {
        Covode.recordClassIndex(34633);
    }

    /* renamed from: c */
    private static String m57193c(LynxBaseUI lynxBaseUI) {
        CharSequence accessibilityLabel = lynxBaseUI.getAccessibilityLabel();
        if (accessibilityLabel == null) {
            accessibilityLabel = "";
        }
        return accessibilityLabel.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo49427a(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI.mAccessibilityElementStatus == -1) {
            return this.f67334f;
        }
        if (lynxBaseUI.mAccessibilityElementStatus == 1) {
            return true;
        }
        return false;
    }

    public C28598b(UIGroup uIGroup) {
        this.f67330b = uIGroup;
        this.f67332d = uIGroup.getRealParentView();
        this.f67336i = (AccessibilityManager) m57188a(uIGroup.mContext, "accessibility");
        this.f67329a = DisplayMetricsHolder.m57911a().heightPixels / 50;
    }

    /* renamed from: b */
    private static Rect m57192b(LynxBaseUI lynxBaseUI) {
        Rect rect = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            m57191a(((LynxUI) lynxBaseUI).mView, rect);
            rect.set(rect.left, rect.top, rect.left + lynxBaseUI.getWidth(), rect.top + lynxBaseUI.getHeight());
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
            while (true) {
                if (parentBaseUI != null) {
                    if (parentBaseUI instanceof LynxUI) {
                        T t = ((LynxUI) parentBaseUI).mView;
                        m57191a(t, rect);
                        rect.offset(-t.getScrollX(), -t.getScrollY());
                        rect.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                        rect.set(rect.left, rect.top, rect.left + lynxBaseUI.getWidth(), rect.top + lynxBaseUI.getHeight());
                        break;
                    }
                    parentBaseUI = parentBaseUI.getParentBaseUI();
                } else {
                    break;
                }
            }
        }
        return rect;
    }

    /* renamed from: d */
    private String m57194d(LynxBaseUI lynxBaseUI) {
        if (!mo49427a(lynxBaseUI)) {
            return "";
        }
        String c = m57193c(lynxBaseUI);
        if (TextUtils.isEmpty(c)) {
            if (!(lynxBaseUI instanceof LynxFlattenUI) || this.f67330b.mContext.f67077r) {
                Iterator<LynxBaseUI> it = lynxBaseUI.mChildren.iterator();
                while (it.hasNext()) {
                    c = ((Object) c) + m57193c(it.next());
                }
            } else {
                LynxBaseUI lynxBaseUI2 = (LynxBaseUI) lynxBaseUI.mParent;
                if (lynxBaseUI2 != null) {
                    for (LynxBaseUI lynxBaseUI3 : lynxBaseUI2.mChildren) {
                        if (!(lynxBaseUI.getBound() == null || lynxBaseUI3.getBound() == null || !lynxBaseUI.getBound().contains(lynxBaseUI3.getBound()))) {
                            c = ((Object) c) + m57193c(lynxBaseUI3);
                        }
                    }
                }
            }
        }
        return c.toString();
    }

    /* renamed from: a */
    private void m57190a(View view) {
        boolean z;
        boolean z2 = true;
        if (view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (view.getImportantForAccessibility() != 1 && (view.getImportantForAccessibility() == 2 || TextUtils.isEmpty(view.getContentDescription()))) {
            z2 = false;
        }
        if (z && z2) {
            Rect rect = new Rect();
            m57191a(view, rect);
            this.f67331c.add(new C28600a(view, rect));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m57190a(viewGroup.getChildAt(i));
            }
        }
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i2;
        boolean z;
        boolean z2 = false;
        if (i == -1) {
            accessibilityNodeInfo = AccessibilityNodeInfo.obtain(this.f67332d);
            this.f67331c.clear();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f67330b);
            while (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LynxBaseUI lynxBaseUI = (LynxBaseUI) it.next();
                    for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.mChildren) {
                        arrayList2.add(lynxBaseUI2);
                    }
                    if (mo49427a(lynxBaseUI)) {
                        this.f67331c.add(new C28600a(lynxBaseUI, m57192b(lynxBaseUI)));
                    }
                    if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.mChildren.isEmpty()) {
                        LynxUI lynxUI = (LynxUI) lynxBaseUI;
                        if (lynxUI.mView instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) lynxUI.mView;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m57190a(viewGroup.getChildAt(i3));
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
            Collections.sort(this.f67331c, new Comparator() {
                /* class com.lynx.tasm.behavior.p2052ui.C28598b.C285991 */

                static {
                    Covode.recordClassIndex(34634);
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Rect rect = ((C28600a) obj).f67341c;
                    Rect rect2 = ((C28600a) obj2).f67341c;
                    int i = (rect.top / C28598b.this.f67329a) - (rect2.top / C28598b.this.f67329a);
                    int i2 = rect.left - rect2.left;
                    if (i == 0) {
                        return i2;
                    }
                    return i;
                }
            });
            this.f67332d.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            for (int i4 = 0; i4 < this.f67331c.size(); i4++) {
                accessibilityNodeInfo.addChild(this.f67332d, i4);
            }
            Rect rect = new Rect();
            m57191a(this.f67332d, rect);
            rect.set(rect.left, rect.top, rect.left + this.f67330b.getWidth(), rect.top + this.f67330b.getHeight());
        } else if (i < 0 || i >= this.f67331c.size()) {
            return null;
        } else {
            C28600a aVar = this.f67331c.get(i);
            accessibilityNodeInfo = AccessibilityNodeInfo.obtain(this.f67332d, i);
            this.f67332d.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (aVar.f67339a != null) {
                aVar.f67341c = m57192b(aVar.f67339a);
                accessibilityNodeInfo.setBoundsInScreen(aVar.f67341c);
                accessibilityNodeInfo.setClassName(aVar.f67339a.getClass().getName());
                String d = m57194d(aVar.f67339a);
                accessibilityNodeInfo.setContentDescription(d);
                accessibilityNodeInfo.setText(d);
            } else if (aVar.f67340b != null) {
                aVar.f67340b.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setSource(this.f67332d, i);
            }
            accessibilityNodeInfo.setParent(this.f67332d);
            if (this.f67333e != aVar) {
                i2 = 64;
            } else {
                i2 = 128;
            }
            accessibilityNodeInfo.addAction(i2);
            if (this.f67333e == aVar) {
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfo.setAccessibilityFocused(z);
            if (this.f67333e == aVar) {
                z2 = true;
            }
            accessibilityNodeInfo.setFocused(z2);
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setFocusable(true);
            accessibilityNodeInfo.setVisibleToUser(true);
            accessibilityNodeInfo.setScrollable(true);
        }
        return accessibilityNodeInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.b$a */
    public static class C28600a {

        /* renamed from: a */
        LynxBaseUI f67339a;

        /* renamed from: b */
        View f67340b;

        /* renamed from: c */
        Rect f67341c;

        static {
            Covode.recordClassIndex(34635);
        }

        public C28600a(View view, Rect rect) {
            this.f67340b = view;
            this.f67341c = rect;
        }

        public C28600a(LynxBaseUI lynxBaseUI, Rect rect) {
            this.f67339a = lynxBaseUI;
            this.f67341c = rect;
        }
    }

    /* renamed from: a */
    static void m57191a(View view, Rect rect) {
        rect.set(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    /* renamed from: a */
    private static Object m57188a(AbstractC28520j jVar, String str) {
        Object obj;
        MethodCollector.m26663i(27);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = jVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = jVar.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = jVar.getSystemService(str);
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
                    MethodCollector.m26664o(27);
                }
            }
        } else {
            obj = jVar.getSystemService(str);
        }
        return obj;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        LynxBaseUI lynxBaseUI;
        String c;
        String c2;
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase();
        if (i == -1) {
            for (int i2 = 0; i2 < this.f67331c.size(); i2++) {
                if (!(this.f67331c.get(i2).f67339a == null || (c2 = m57193c(this.f67331c.get(i2).f67339a)) == null || !c2.toString().toLowerCase().contains(lowerCase))) {
                    arrayList.add(createAccessibilityNodeInfo(i2));
                }
            }
        } else if (i > 0 && i < this.f67331c.size() && (lynxBaseUI = this.f67331c.get(i).f67339a) != null && (c = m57193c(lynxBaseUI)) != null && c.toString().toLowerCase().contains(lowerCase)) {
            arrayList.add(createAccessibilityNodeInfo(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m57189a(int i, int i2) {
        if (this.f67336i.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            if (i >= 0) {
                C28600a aVar = this.f67331c.get(i);
                if (aVar.f67339a != null) {
                    obtain.setPackageName(this.f67332d.getContext().getPackageName());
                    obtain.setClassName(aVar.f67339a.getClass().getName());
                    obtain.setEnabled(true);
                    obtain.setContentDescription(m57194d(aVar.f67339a));
                } else if (aVar.f67340b != null) {
                    aVar.f67340b.onInitializeAccessibilityEvent(obtain);
                } else {
                    return;
                }
                obtain.setSource(this.f67332d, i);
                this.f67332d.invalidate();
                this.f67332d.getParent().requestSendAccessibilityEvent(this.f67332d, obtain);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49426a(int i, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f67337j) {
            if (action == 9 || action == 7) {
                m57189a(i, 128);
                this.f67337j = true;
            }
        } else if (action == 10 || action == 7) {
            this.f67337j = false;
            m57189a(i, 256);
        }
        if (action == 9) {
            this.f67332d.setHovered(true);
        } else if (action == 10) {
            this.f67332d.setHovered(false);
        }
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        LLog.m56859a(f67328g, "performAction on virtualViewId " + i + " action " + i2);
        if (i == -1 || i < 0 || i >= this.f67331c.size()) {
            return false;
        }
        if (i2 == 64) {
            m57189a(i, 32768);
            m57189a(i, 4);
            return true;
        } else if (i2 != 128) {
            return false;
        } else {
            m57189a(i, 65536);
            return true;
        }
    }
}
