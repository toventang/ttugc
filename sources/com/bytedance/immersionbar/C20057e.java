package com.bytedance.immersionbar;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.core.graphics.C0699a;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.immersionbar.e */
public final class C20057e {

    /* renamed from: a */
    static Map<String, C20057e> f47680a = new HashMap();

    /* renamed from: e */
    private static final int f47681e = R.id.bmh;

    /* renamed from: b */
    public C20055c f47682b;

    /* renamed from: c */
    String f47683c;

    /* renamed from: d */
    boolean f47684d = false;

    /* renamed from: f */
    private ActivityC0945e f47685f;

    /* renamed from: g */
    private Fragment f47686g;

    /* renamed from: h */
    private Dialog f47687h;

    /* renamed from: i */
    private Window f47688i;

    /* renamed from: j */
    private ViewGroup f47689j;

    /* renamed from: k */
    private ViewGroup f47690k;

    /* renamed from: l */
    private C20057e f47691l;

    /* renamed from: m */
    private C20053a f47692m;

    /* renamed from: n */
    private boolean f47693n;

    /* renamed from: o */
    private Map<String, C20055c> f47694o = new HashMap();

    /* renamed from: p */
    private boolean f47695p = false;

    /* renamed from: a */
    public final C20057e mo33405a(int i) {
        return mo33409b(C0643b.m2378c(this.f47685f, i));
    }

    /* renamed from: a */
    public final C20057e mo33407a(boolean z) {
        this.f47682b.f47663j = z;
        this.f47682b.f47665l = 0.2f;
        this.f47682b.f47664k = z;
        this.f47682b.f47666m = 0.2f;
        return this;
    }

    /* renamed from: a */
    public final C20057e mo33406a(EnumC20054b bVar) {
        this.f47682b.f47660g = bVar;
        if (C20059f.f47697a == 19 || C20059f.m37990b()) {
            if (this.f47682b.f47660g == EnumC20054b.FLAG_HIDE_NAVIGATION_BAR || this.f47682b.f47660g == EnumC20054b.FLAG_HIDE_BAR) {
                this.f47682b.f47659f = true;
            } else {
                this.f47682b.f47659f = false;
            }
        }
        return this;
    }

    /* renamed from: a */
    private static boolean m37959a(View view) {
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof DrawerLayout) && m37959a(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C20057e mo33404a() {
        this.f47682b.f47654a = 0;
        return this;
    }

    /* renamed from: n */
    private void m37973n() {
        ViewGroup viewGroup = this.f47690k;
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: p */
    private static boolean m37975p() {
        if (C20059f.m37989a() || C20059f.f47697a >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C20057e mo33408b() {
        this.f47682b.f47655b = 0;
        this.f47682b.f47658e = true;
        return this;
    }

    /* renamed from: c */
    public final C20057e mo33411c() {
        this.f47682b.f47654a = 0;
        this.f47682b.f47655b = 0;
        this.f47682b.f47658e = true;
        return this;
    }

    /* renamed from: d */
    public final void mo33415d() {
        m37964f();
        m37966g();
        this.f47684d = true;
    }

    static {
        Covode.recordClassIndex(23562);
    }

    /* renamed from: e */
    private void m37962e() {
        if (this.f47691l == null) {
            this.f47691l = m37951a(this.f47685f);
        }
        C20057e eVar = this.f47691l;
        if (!eVar.f47684d) {
            eVar.mo33415d();
        }
    }

    /* renamed from: h */
    private void m37967h() {
        if (C20059f.f47697a >= 28 && !this.f47695p) {
            WindowManager.LayoutParams attributes = this.f47688i.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f47688i.setAttributes(attributes);
            this.f47695p = true;
        }
    }

    /* renamed from: j */
    private void m37969j() {
        this.f47688i.addFlags(67108864);
        m37970k();
        this.f47688i.clearFlags(134217728);
    }

    /* renamed from: m */
    private void m37972m() {
        if (!m37959a(this.f47689j.findViewById(16908290))) {
            m37973n();
        }
    }

    /* renamed from: o */
    private static boolean m37974o() {
        if (C20059f.m37989a() || C20059f.m37991c() || C20059f.f47697a >= 23) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.immersionbar.e$1 */
    public static /* synthetic */ class C200581 {

        /* renamed from: a */
        static final /* synthetic */ int[] f47696a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 23563(0x5c0b, float:3.3019E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.immersionbar.b[] r0 = com.bytedance.immersionbar.EnumC20054b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.immersionbar.C20057e.C200581.f47696a = r2
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.EnumC20054b.FLAG_HIDE_BAR     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.immersionbar.C20057e.C200581.f47696a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.EnumC20054b.FLAG_HIDE_STATUS_BAR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.immersionbar.C20057e.C200581.f47696a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.EnumC20054b.FLAG_HIDE_NAVIGATION_BAR     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.immersionbar.C20057e.C200581.f47696a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.EnumC20054b.FLAG_SHOW_BAR     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.immersionbar.C20057e.C200581.<clinit>():void");
        }
    }

    /* renamed from: f */
    private void m37964f() {
        C20057e eVar;
        m37971l();
        if (C20059f.f47697a >= 19) {
            this.f47692m = new C20053a(this.f47685f);
            if (this.f47693n && (eVar = f47680a.get(this.f47685f.toString())) != null) {
                eVar.f47682b = this.f47682b;
            }
        }
    }

    /* renamed from: l */
    private void m37971l() {
        boolean z;
        boolean z2 = true;
        if (this.f47682b.f47663j) {
            if (this.f47682b.f47654a == 0 || this.f47682b.f47654a <= -4539718) {
                z = false;
            } else {
                z = true;
            }
            m37954a(z, this.f47682b.f47665l);
        }
        if (this.f47682b.f47664k) {
            if (this.f47682b.f47655b == 0 || this.f47682b.f47655b <= -4539718) {
                z2 = false;
            }
            m37960b(z2, this.f47682b.f47666m);
        }
    }

    /* renamed from: g */
    private void m37966g() {
        if (C20059f.f47697a >= 19) {
            int i = 256;
            if (C20059f.f47697a < 21 || C20059f.m37990b()) {
                m37969j();
            } else {
                m37967h();
                i = m37965g(m37963f(m37968i()));
            }
            int e = m37961e(i);
            m37972m();
            this.f47689j.setSystemUiVisibility(e);
        }
        if (C20059f.m37989a()) {
            m37956a(this.f47688i, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.f47682b.f47661h);
            if (this.f47682b.f47674u) {
                m37956a(this.f47688i, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", this.f47682b.f47662i);
            }
        }
        if (!C20059f.m37991c()) {
            return;
        }
        if (this.f47682b.f47673t != 0) {
            C20056d.m37943a(this.f47685f, this.f47682b.f47673t);
        } else {
            C20056d.m37944a((Activity) this.f47685f, this.f47682b.f47661h, true);
        }
    }

    /* renamed from: i */
    private int m37968i() {
        int i;
        if (!this.f47682b.f47658e || !this.f47682b.f47674u) {
            i = 1280;
        } else {
            i = 1792;
        }
        this.f47688i.clearFlags(67108864);
        this.f47688i.clearFlags(134217728);
        this.f47688i.addFlags(Integer.MIN_VALUE);
        if (this.f47682b.f47667n) {
            this.f47688i.setStatusBarColor(C0699a.m2465b(this.f47682b.f47654a, this.f47682b.f47668o, this.f47682b.f47656c));
        } else {
            this.f47688i.setStatusBarColor(C0699a.m2465b(this.f47682b.f47654a, 0, this.f47682b.f47656c));
        }
        if (this.f47682b.f47674u && C20059f.f47697a >= 26) {
            this.f47688i.setNavigationBarColor(C0699a.m2465b(this.f47682b.f47655b, this.f47682b.f47669p, this.f47682b.f47657d));
        }
        return i;
    }

    /* renamed from: k */
    private void m37970k() {
        MethodCollector.m26663i(5803);
        ViewGroup viewGroup = this.f47689j;
        int i = f47681e;
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null) {
            findViewById = new View(this.f47685f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f47692m.f47652a);
            layoutParams.gravity = 48;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setVisibility(0);
            findViewById.setId(i);
            this.f47689j.addView(findViewById);
        }
        if (this.f47682b.f47667n) {
            findViewById.setBackgroundColor(C0699a.m2465b(this.f47682b.f47654a, this.f47682b.f47668o, this.f47682b.f47656c));
            MethodCollector.m26664o(5803);
            return;
        }
        findViewById.setBackgroundColor(C0699a.m2465b(this.f47682b.f47654a, 0, this.f47682b.f47656c));
        MethodCollector.m26664o(5803);
    }

    /* renamed from: b */
    public final C20057e mo33409b(int i) {
        this.f47682b.f47654a = i;
        return this;
    }

    /* renamed from: c */
    public final C20057e mo33413c(boolean z) {
        return m37960b(z, 0.2f);
    }

    /* renamed from: d */
    public final C20057e mo33414d(int i) {
        this.f47682b.f47655b = i;
        return this;
    }

    /* renamed from: a */
    private void m37957a(AbstractC1204m mVar) {
        mVar.getLifecycle().mo4012a(new ImmersionBar$1(this));
    }

    /* renamed from: f */
    private int m37963f(int i) {
        if (C20059f.f47697a < 23 || !this.f47682b.f47661h) {
            return i;
        }
        return i | 8192;
    }

    /* renamed from: g */
    private int m37965g(int i) {
        if (C20059f.f47697a < 26 || !this.f47682b.f47662i) {
            return i;
        }
        return i | 16;
    }

    /* renamed from: a */
    public static C20057e m37951a(ActivityC0945e eVar) {
        String obj = eVar.toString();
        C20057e eVar2 = f47680a.get(obj);
        if (eVar2 != null) {
            return eVar2;
        }
        C20057e eVar3 = new C20057e(eVar, obj);
        f47680a.put(obj, eVar3);
        return eVar3;
    }

    /* renamed from: c */
    public final C20057e mo33412c(int i) {
        return mo33414d(C0643b.m2378c(this.f47685f, i));
    }

    /* renamed from: a */
    public static C20057e m37949a(Fragment fragment) {
        m37958a(fragment.getActivity(), "Activity cannot be null");
        String str = fragment.getActivity().toString() + fragment.toString();
        C20057e eVar = f47680a.get(str);
        if (eVar != null) {
            return eVar;
        }
        C20057e eVar2 = new C20057e(fragment, str);
        f47680a.put(str, eVar2);
        return eVar2;
    }

    /* renamed from: e */
    private int m37961e(int i) {
        if (C20059f.f47697a >= 16) {
            int i2 = C200581.f47696a[this.f47682b.f47660g.ordinal()];
            if (i2 == 1) {
                i |= 518;
            } else if (i2 == 2) {
                i |= 1028;
            } else if (i2 == 3) {
                i |= 514;
            } else if (i2 == 4) {
                i |= 0;
            }
        }
        return i | 4096;
    }

    /* renamed from: b */
    public final C20057e mo33410b(boolean z) {
        return m37954a(z, 0.2f);
    }

    /* renamed from: a */
    public static C20057e m37950a(DialogInterface$OnCancelListenerC0944d dVar) {
        m37958a(dVar.getActivity(), "Activity cannot be null");
        String str = dVar.getActivity().toString() + dVar.toString();
        C20057e eVar = f47680a.get(str);
        if (eVar != null) {
            return eVar;
        }
        C20057e eVar2 = new C20057e(dVar, str);
        f47680a.put(str, eVar2);
        return eVar2;
    }

    /* renamed from: a */
    private static <T> void m37958a(T t, String str) {
        Objects.requireNonNull(t, str);
    }

    /* renamed from: b */
    private C20057e m37960b(boolean z, float f) {
        this.f47682b.f47662i = z;
        if (!z || m37975p()) {
            this.f47682b.f47657d = 0.0f;
        } else {
            this.f47682b.f47657d = f;
        }
        return this;
    }

    private C20057e(Fragment fragment, String str) {
        this.f47685f = fragment.getActivity();
        this.f47686g = fragment;
        this.f47693n = true;
        m37962e();
        m37955a(this.f47685f.getWindow(), str);
        m37957a((AbstractC1204m) this.f47686g);
    }

    private C20057e(DialogInterface$OnCancelListenerC0944d dVar, String str) {
        this.f47685f = dVar.getActivity();
        this.f47686g = dVar;
        Dialog dialog = dVar.getDialog();
        this.f47687h = dialog;
        m37958a(dialog, "dialog in DialogFragment cannot be null");
        m37962e();
        m37955a(this.f47687h.getWindow(), str);
        m37957a((AbstractC1204m) this.f47686g);
    }

    /* renamed from: a */
    public static C20057e m37952a(ActivityC0945e eVar, Dialog dialog) {
        String str = eVar.toString() + dialog.toString();
        C20057e eVar2 = f47680a.get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        C20057e eVar3 = new C20057e(eVar, dialog, str);
        f47680a.put(str, eVar3);
        return eVar3;
    }

    private C20057e(ActivityC0945e eVar, String str) {
        this.f47685f = eVar;
        m37955a(eVar.getWindow(), str);
        m37957a((AbstractC1204m) this.f47685f);
    }

    /* renamed from: a */
    public static C20057e m37953a(ActivityC0945e eVar, Window window) {
        String str = eVar.toString() + window.toString();
        C20057e eVar2 = f47680a.get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        C20057e eVar3 = new C20057e(eVar, window, str);
        f47680a.put(str, eVar3);
        return eVar3;
    }

    /* renamed from: a */
    private C20057e m37954a(boolean z, float f) {
        this.f47682b.f47661h = z;
        if (!z || m37974o()) {
            this.f47682b.f47673t = 0;
            this.f47682b.f47656c = 0.0f;
        } else {
            this.f47682b.f47656c = f;
        }
        return this;
    }

    /* renamed from: a */
    private void m37955a(Window window, String str) {
        boolean z;
        this.f47688i = window;
        this.f47683c = str;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        this.f47689j = viewGroup;
        this.f47690k = (ViewGroup) viewGroup.findViewById(16908290);
        this.f47682b = new C20055c();
        if (C20059f.f47697a >= 21) {
            mo33414d(window.getNavigationBarColor());
            mo33409b(window.getStatusBarColor());
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        boolean z2 = true;
        if (C20059f.f47697a >= 23) {
            if ((systemUiVisibility & 8192) != 0) {
                z = true;
            } else {
                z = false;
            }
            mo33410b(z);
        }
        if (C20059f.f47697a >= 26) {
            if ((systemUiVisibility & 16) == 0) {
                z2 = false;
            }
            mo33413c(z2);
        }
    }

    private C20057e(ActivityC0945e eVar, Window window, String str) {
        this.f47685f = eVar;
        m37962e();
        m37955a(window, str);
        m37957a((AbstractC1204m) this.f47685f);
    }

    private C20057e(ActivityC0945e eVar, Dialog dialog, String str) {
        this.f47685f = eVar;
        this.f47687h = dialog;
        m37962e();
        m37955a(this.f47687h.getWindow(), str);
        m37957a((AbstractC1204m) this.f47685f);
    }

    /* renamed from: a */
    private static void m37956a(Window window, String str, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField(str).getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                    return;
                }
                method.invoke(window, 0, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }
}
