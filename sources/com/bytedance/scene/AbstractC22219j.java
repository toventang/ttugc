package com.bytedance.scene;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.scene.C22268t;
import com.bytedance.scene.p1622d.C22168h;
import com.bytedance.scene.p1622d.C22172l;
import com.bytedance.scene.p1623e.C22179d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.j */
public abstract class AbstractC22219j implements AbstractC1183ag, AbstractC1204m {

    /* renamed from: a */
    private Context f52540a;

    /* renamed from: b */
    private LayoutInflater f52541b;

    /* renamed from: c */
    private C22268t f52542c;

    /* renamed from: d */
    private final StringBuilder f52543d = new StringBuilder(this.f52553q.name);

    /* renamed from: e */
    private final Handler f52544e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final List<Runnable> f52545f = new ArrayList();

    /* renamed from: g */
    private boolean f52546g = false;

    /* renamed from: h */
    private boolean f52547h = false;

    /* renamed from: i */
    private final C22222a f52548i = new C22222a(new C1205n(this), (byte) 0);

    /* renamed from: m */
    public Activity f52549m;

    /* renamed from: n */
    public View f52550n;

    /* renamed from: o */
    public AbstractC22219j f52551o;

    /* renamed from: p */
    public C22268t.AbstractC22270a f52552p = C22268t.f52675a;

    /* renamed from: q */
    public EnumC22282w f52553q = EnumC22282w.NONE;

    /* renamed from: r */
    public Bundle f52554r;

    /* renamed from: s */
    public int f52555s;

    static {
        Covode.recordClassIndex(26025);
    }

    /* renamed from: a */
    public abstract View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: l */
    public void mo36424l() {
        this.f52551o = null;
    }

    /* renamed from: n */
    public void mo36480n() {
        this.f52546g = true;
    }

    /* renamed from: n_ */
    public void mo22713n_() {
        this.f52546g = true;
    }

    /* renamed from: o */
    public void mo36481o() {
        this.f52546g = true;
    }

    /* renamed from: v */
    public void mo36489v() {
        this.f52546g = true;
    }

    /* renamed from: x */
    public void mo36491x() {
        this.f52546g = true;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f52548i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.scene.j$a */
    public static class C22222a extends AbstractC1196i {

        /* renamed from: b */
        final C1205n f52558b;

        /* renamed from: c */
        final List<AbstractC1203l> f52559c;

        static {
            Covode.recordClassIndex(26028);
        }

        @Override // androidx.lifecycle.AbstractC1196i
        /* renamed from: a */
        public final AbstractC1196i.EnumC1199b mo4011a() {
            return this.f52558b.mo4011a();
        }

        private C22222a(C1205n nVar) {
            this.f52559c = new ArrayList();
            this.f52558b = nVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo36493a(AbstractC1196i.EnumC1198a aVar) {
            this.f52558b.mo4016a(aVar);
        }

        @Override // androidx.lifecycle.AbstractC1196i
        /* renamed from: b */
        public final void mo4013b(AbstractC1203l lVar) {
            this.f52559c.remove(lVar);
            this.f52558b.mo4013b(lVar);
        }

        @Override // androidx.lifecycle.AbstractC1196i
        /* renamed from: a */
        public final void mo4012a(AbstractC1203l lVar) {
            this.f52559c.add(lVar);
            this.f52558b.mo4012a(lVar);
        }

        /* synthetic */ C22222a(C1205n nVar, byte b) {
            this(nVar);
        }
    }

    /* renamed from: com.bytedance.scene.j$b */
    static class C22223b implements C22268t.AbstractC22271b {

        /* renamed from: a */
        public C1182af f52560a;

        static {
            Covode.recordClassIndex(26029);
        }

        @Override // com.bytedance.scene.C22268t.AbstractC22271b
        /* renamed from: a */
        public final void mo36494a() {
            this.f52560a.mo3997a();
        }

        private C22223b(C1182af afVar) {
            this.f52560a = afVar;
        }

        /* synthetic */ C22223b(C1182af afVar, byte b) {
            this(afVar);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: y */
    public void mo36492y() {
        this.f52546g = true;
        mo36470A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo36470A() {
        boolean z = mo36460z();
        if (z != this.f52547h) {
            this.f52547h = z;
        }
    }

    /* renamed from: B */
    public final C22268t mo36471B() {
        C22268t tVar = this.f52542c;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Scope is not created, you can't call before onCreate");
    }

    /* renamed from: p */
    public final View mo36482p() {
        View view = this.f52550n;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("requireView() should not be called before onCreateView() or after onDestroyView()");
    }

    /* renamed from: z */
    public boolean mo36460z() {
        if (this.f52553q.value >= EnumC22282w.STARTED.value) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final LayoutInflater cx_() {
        if (this.f52541b == null) {
            if (this.f52549m != null) {
                this.f52541b = new C22262o(mo36486t(), this);
            } else {
                throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
            }
        }
        return this.f52541b;
    }

    /* renamed from: m */
    public void mo36425m() {
        Activity activity = this.f52549m;
        this.f52549m = null;
        this.f52540a = null;
        this.f52546g = false;
        this.f52546g = true;
        if (!activity.isChangingConfigurations()) {
            this.f52542c.mo36581b();
        }
        this.f52542c = null;
        this.f52545f.clear();
    }

    /* renamed from: q */
    public final Context mo36483q() {
        Activity activity = this.f52549m;
        if (activity == null) {
            return null;
        }
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: t */
    public final Activity mo36486t() {
        Activity activity = this.f52549m;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Scene " + this + " not attached to an activity.");
    }

    public void cs_() {
        this.f52546g = false;
        mo36489v();
        if (this.f52546g) {
            mo36392a(this, false);
            m41767a(EnumC22282w.STARTED);
            mo36470A();
            this.f52548i.mo36493a(AbstractC1196i.EnumC1198a.ON_START);
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onStart()");
    }

    public void ct_() {
        this.f52546g = false;
        mo36490w();
        if (this.f52546g) {
            mo36398b(this, false);
            m41767a(EnumC22282w.RESUMED);
            this.f52548i.mo36493a(AbstractC1196i.EnumC1198a.ON_RESUME);
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onResume()");
    }

    public void cu_() {
        this.f52548i.mo36493a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        m41767a(EnumC22282w.STARTED);
        this.f52546g = false;
        mo36491x();
        if (this.f52546g) {
            mo36415d(this, false);
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onPause()");
    }

    public void cv_() {
        this.f52548i.mo36493a(AbstractC1196i.EnumC1198a.ON_STOP);
        m41767a(EnumC22282w.ACTIVITY_CREATED);
        this.f52546g = false;
        mo36492y();
        if (this.f52546g) {
            mo36402c(this, false);
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onStop()");
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        C22268t B = mo36471B();
        if (B.f52679d.containsKey(C22223b.class)) {
            return ((C22223b) B.mo36579a(C22223b.class)).f52560a;
        }
        C1182af afVar = new C1182af();
        B.mo36580a(C22223b.class, new C22223b(afVar, (byte) 0));
        return afVar;
    }

    /* renamed from: k */
    public void mo36423k() {
        this.f52546g = false;
        mo36481o();
        if (this.f52546g) {
            mo36420f(this, false);
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: r */
    public final Context mo36484r() {
        Context r2;
        if (this.f52549m == null) {
            return null;
        }
        if (this.f52540a == null) {
            if (this.f52555s > 0) {
                r2 = new C22179d(this.f52549m, this.f52555s) {
                    /* class com.bytedance.scene.AbstractC22219j.C222201 */

                    static {
                        Covode.recordClassIndex(26026);
                    }

                    @Override // android.content.Context, com.bytedance.scene.p1623e.C22179d, android.content.ContextWrapper
                    public final Object getSystemService(String str) {
                        if ("scene".equals(str)) {
                            return AbstractC22219j.this;
                        }
                        if (!"layout_inflater".equals(str) || AbstractC22219j.this.f52549m == null) {
                            return m41812a((C22179d) this, str);
                        }
                        return AbstractC22219j.this.cx_();
                    }

                    /* renamed from: a */
                    private static Object m41812a(C22179d dVar, String str) {
                        Object obj;
                        MethodCollector.m26663i(11708);
                        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                            if (!C58027i.f132247b && "connectivity".equals(str)) {
                                try {
                                    new C21708b().mo35361a();
                                    C58027i.f132247b = true;
                                    obj = super.getSystemService(str);
                                } catch (Throwable unused) {
                                }
                            }
                            obj = super.getSystemService(str);
                        } else if (C58027i.f132246a) {
                            synchronized (ClipboardManager.class) {
                                try {
                                    obj = super.getSystemService(str);
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
                                    MethodCollector.m26664o(11708);
                                }
                            }
                        } else {
                            obj = super.getSystemService(str);
                        }
                        return obj;
                    }
                };
            } else {
                Activity activity = this.f52549m;
                r2 = new C22179d(activity, activity.getTheme()) {
                    /* class com.bytedance.scene.AbstractC22219j.C222212 */

                    static {
                        Covode.recordClassIndex(26027);
                    }

                    @Override // android.content.Context, com.bytedance.scene.p1623e.C22179d, android.content.ContextWrapper
                    public final Object getSystemService(String str) {
                        if ("scene".equals(str)) {
                            return AbstractC22219j.this;
                        }
                        if (!"layout_inflater".equals(str) || AbstractC22219j.this.f52549m == null) {
                            return m41813a((C22179d) this, str);
                        }
                        return AbstractC22219j.this.cx_();
                    }

                    /* renamed from: a */
                    private static Object m41813a(C22179d dVar, String str) {
                        Object obj;
                        MethodCollector.m26663i(11706);
                        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                            if (!C58027i.f132247b && "connectivity".equals(str)) {
                                try {
                                    new C21708b().mo35361a();
                                    C58027i.f132247b = true;
                                    obj = super.getSystemService(str);
                                } catch (Throwable unused) {
                                }
                            }
                            obj = super.getSystemService(str);
                        } else if (C58027i.f132246a) {
                            synchronized (ClipboardManager.class) {
                                try {
                                    obj = super.getSystemService(str);
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
                                    MethodCollector.m26664o(11706);
                                }
                            }
                        } else {
                            obj = super.getSystemService(str);
                        }
                        return obj;
                    }
                };
            }
            this.f52540a = r2;
        }
        return this.f52540a;
    }

    /* renamed from: s */
    public final Context mo36485s() {
        Context r = mo36484r();
        if (r != null) {
            return r;
        }
        throw new IllegalStateException("Scene " + this + " not attached to an activity.");
    }

    /* renamed from: u */
    public final Context mo36488u() {
        Context q = mo36483q();
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Scene " + this + " not attached to a context.");
    }

    /* renamed from: w */
    public void mo36490w() {
        this.f52546g = true;
        if (this.f52545f.size() > 0) {
            ArrayList<Runnable> arrayList = new ArrayList(this.f52545f);
            for (Runnable runnable : arrayList) {
                runnable.run();
            }
            this.f52545f.removeAll(arrayList);
        }
    }

    public String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        String simpleName = getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('}');
        return sb.toString();
    }

    public void cw_() {
        ViewParent parent;
        int i = Build.VERSION.SDK_INT;
        View view = this.f52550n;
        if (C22172l.f52405a == 0) {
            try {
                C22172l.f52405a = 2;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("cancelTouchTarget", View.class);
                C22172l.f52406b = declaredMethod;
                declaredMethod.setAccessible(true);
                C22172l.f52405a = 1;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        if (C22172l.f52405a == 1 && (parent = view.getParent()) != null) {
            try {
                Method method = C22172l.f52406b;
                Object[] objArr = {view};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{parent, objArr}, 110000, "java.lang.Object", true, "com_bytedance_scene_utlity_ViewRefUtility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                } else {
                    C15346a.m28242a(method.invoke(parent, objArr), method, new Object[]{parent, objArr}, "com_bytedance_scene_utlity_ViewRefUtility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        this.f52548i.mo36493a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        m41767a(EnumC22282w.NONE);
        this.f52546g = false;
        mo22713n_();
        if (this.f52546g) {
            mo36418e(this, false);
            int i2 = Build.VERSION.SDK_INT;
            this.f52550n.cancelPendingInputEvents();
            this.f52550n = null;
            this.f52541b = null;
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: e */
    public void mo36416e(Bundle bundle) {
        this.f52546g = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: b */
    public final <T extends View> T mo36474b(int i) {
        View view = this.f52550n;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i);
    }

    /* renamed from: c_ */
    public final String mo36476c_(int i) {
        return mo36486t().getResources().getString(i);
    }

    /* renamed from: a */
    public void mo22704a(Bundle bundle) {
        View decorView = mo36486t().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & 1024) != 0) {
            C0792v.m2780n(decorView);
        } else if ((systemUiVisibility & 512) != 0) {
            C0792v.m2780n(decorView);
        }
        this.f52546g = true;
    }

    /* renamed from: d */
    public void mo36412d(Bundle bundle) {
        this.f52546g = false;
        mo36419f(bundle);
        if (!this.f52546g) {
            throw new C22283x("Scene " + this + " did not call through to super.onSaveInstanceState()");
        }
    }

    /* renamed from: c */
    public final <T extends View> T mo36475c(int i) {
        T t = (T) mo36482p().findViewById(i);
        if (t != null) {
            return t;
        }
        try {
            throw new IllegalArgumentException(" " + mo36486t().getResources().getResourceName(i) + " view not found");
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(" " + i + " view not found");
        }
    }

    /* renamed from: f */
    public void mo36419f(Bundle bundle) {
        this.f52546g = true;
        if (this.f52554r != null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
            bundle.putBundle("bd-scene-nav:scene_argument", this.f52554r);
        } else {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        bundle.putString("scope_key", this.f52542c.f52677b);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f52550n.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("bd-scene:views", sparseArray);
        View findFocus = this.f52550n.findFocus();
        if (!(findFocus == null || findFocus.getId() == -1)) {
            bundle.putInt("bd-scene:focusedViewId", findFocus.getId());
        }
        mo36414d(this, bundle, false);
    }

    /* renamed from: a */
    private void m41767a(EnumC22282w wVar) {
        EnumC22282w wVar2 = this.f52553q;
        if (wVar.value > wVar2.value) {
            if (wVar.value - wVar2.value != 1) {
                throw new C22168h("Cant setState from " + wVar2.name + " to " + wVar.name);
            }
        } else if (wVar.value < wVar2.value && !((wVar2 == EnumC22282w.ACTIVITY_CREATED && wVar == EnumC22282w.NONE) || wVar.value - wVar2.value == -1)) {
            throw new C22168h("Cant setState from " + wVar2.name + " to " + wVar.name);
        }
        this.f52553q = wVar;
        this.f52543d.append(" - " + wVar.name);
    }

    /* renamed from: b */
    public void mo36396b(Bundle bundle) {
        AbstractC22219j jVar = this.f52551o;
        if (jVar == null) {
            this.f52542c = this.f52552p.mo36467a();
        } else {
            C22268t B = jVar.mo36471B();
            String str = null;
            if (bundle != null) {
                str = bundle.getString("scope_key");
            }
            if (TextUtils.isEmpty(str)) {
                str = C22268t.m41935a();
            }
            C22268t tVar = B.f52678c.get(str);
            if (tVar == null) {
                tVar = new C22268t(B, str);
                B.f52678c.put(str, tVar);
            }
            this.f52542c = tVar;
        }
        if (bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
            Bundle bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            if (bundle2 != null) {
                bundle2.setClassLoader(getClass().getClassLoader());
                this.f52554r = bundle2;
            } else {
                throw new IllegalStateException("can't get Scene arguments from savedInstanceState");
            }
        }
        this.f52546g = false;
        mo36416e(bundle);
        if (this.f52546g) {
            mo36391a(this, bundle, false);
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: c */
    public void mo36399c(Bundle bundle) {
        View findViewById;
        this.f52546g = false;
        mo22704a(bundle);
        if (this.f52546g) {
            mo36401c(this, bundle, false);
            if (bundle != null) {
                this.f52546g = false;
                this.f52546g = true;
                SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("bd-scene:views");
                if (sparseParcelableArray != null) {
                    this.f52550n.restoreHierarchyState(sparseParcelableArray);
                }
                int i = bundle.getInt("bd-scene:focusedViewId", -1);
                if (!(i == -1 || (findViewById = this.f52550n.findViewById(i)) == null)) {
                    findViewById.requestFocus();
                }
                if (!this.f52546g) {
                    throw new C22283x("Scene " + this + " did not call through to super.onViewStateRestored()");
                }
            }
            m41767a(EnumC22282w.ACTIVITY_CREATED);
            this.f52548i.mo36493a(AbstractC1196i.EnumC1198a.ON_CREATE);
            return;
        }
        throw new C22283x("Scene " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: a */
    public void mo36388a(Activity activity) {
        this.f52549m = activity;
        if (this.f52548i.mo4011a() != AbstractC1196i.EnumC1199b.INITIALIZED) {
            C22222a aVar = this.f52548i;
            for (AbstractC1203l lVar : aVar.f52559c) {
                aVar.f52558b.mo4013b(lVar);
            }
            aVar.f52558b.mo4017a(AbstractC1196i.EnumC1199b.INITIALIZED);
            for (AbstractC1203l lVar2 : aVar.f52559c) {
                aVar.f52558b.mo4012a(lVar2);
            }
        }
    }

    /* renamed from: a */
    public void mo36390a(AbstractC22219j jVar) {
        if (jVar != null) {
            this.f52551o = jVar;
        }
        this.f52546g = false;
        mo36480n();
        if (!this.f52546g) {
            throw new C22283x("Scene " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: a */
    public void mo36473a(View view, Bundle bundle) {
        this.f52546g = true;
    }

    /* renamed from: a */
    public final String mo36472a(int i, Object... objArr) {
        return mo36486t().getResources().getString(i, objArr);
    }

    /* renamed from: e */
    public void mo36418e(AbstractC22219j jVar, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36418e(jVar, z2);
        }
    }

    /* renamed from: f */
    public void mo36420f(AbstractC22219j jVar, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36420f(jVar, z2);
        }
    }

    /* renamed from: c */
    public void mo36402c(AbstractC22219j jVar, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36402c(jVar, z2);
        }
    }

    /* renamed from: d */
    public void mo36415d(AbstractC22219j jVar, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36415d(jVar, z2);
        }
    }

    /* renamed from: b */
    public void mo36398b(AbstractC22219j jVar, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36398b(jVar, z2);
        }
    }

    /* renamed from: a */
    private static Object m41766a(Context context, String str) {
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
    public void mo36389a(Bundle bundle, ViewGroup viewGroup) {
        if (this.f52550n == null) {
            View a = mo22702a(cx_(), viewGroup);
            if (a == null) {
                throw new IllegalArgumentException("onCreateView cant return null");
            } else if (a.getParent() == null) {
                a.getId();
                Context s = mo36485s();
                Context context = a.getContext();
                if (context == s || this.f52555s == 0 || m41766a(context, "scene") == this) {
                    a.setTag(R.id.a0m, this);
                    a.setSaveFromParentEnabled(false);
                    this.f52550n = a;
                    this.f52546g = false;
                    mo36473a(a, bundle);
                    if (this.f52546g) {
                        mo36397b(this, bundle, false);
                        m41767a(EnumC22282w.VIEW_CREATED);
                        return;
                    }
                    throw new C22283x("Scene " + this + " did not call through to super.onViewCreated()");
                }
                throw new IllegalArgumentException("Scene view's context is incorrect, you should create view with getLayoutInflater() or requireSceneContext() instead");
            } else {
                throw new IllegalArgumentException("onCreateView returned view already has a parent. You must call removeView() on the view's parent first.");
            }
        } else {
            throw new IllegalArgumentException("Scene already call onCreateView");
        }
    }

    /* renamed from: a */
    public void mo36392a(AbstractC22219j jVar, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36392a(jVar, z2);
        }
    }

    /* renamed from: c */
    public void mo36401c(AbstractC22219j jVar, Bundle bundle, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36401c(jVar, bundle, z2);
        }
    }

    /* renamed from: d */
    public void mo36414d(AbstractC22219j jVar, Bundle bundle, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36414d(jVar, bundle, z2);
        }
    }

    /* renamed from: a */
    public void mo36391a(AbstractC22219j jVar, Bundle bundle, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36391a(jVar, bundle, z2);
        }
    }

    /* renamed from: b */
    public void mo36397b(AbstractC22219j jVar, Bundle bundle, boolean z) {
        boolean z2;
        AbstractC22219j jVar2 = this.f52551o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo36397b(jVar, bundle, z2);
        }
    }
}
