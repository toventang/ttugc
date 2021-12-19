package com.facebook.p1814a.p1816b;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1816b.C23876a;
import com.facebook.p1814a.p1816b.C23898d;
import com.facebook.p1814a.p1816b.p1817a.C23880a;
import com.facebook.p1814a.p1816b.p1817a.C23883b;
import com.facebook.p1814a.p1816b.p1817a.C23884c;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import com.facebook.p1814a.p1820e.C23929b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.a.b.c */
public class C23894c {

    /* renamed from: f */
    private static final String f56568f = C23894c.class.getCanonicalName();

    /* renamed from: g */
    private static C23894c f56569g = null;

    /* renamed from: a */
    public final Handler f56570a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public Set<Activity> f56571b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public Set<ViewTreeObserver$OnGlobalLayoutListenerC23897b> f56572c = new HashSet();

    /* renamed from: d */
    public HashSet<String> f56573d = new HashSet<>();

    /* renamed from: e */
    public HashMap<Integer, HashSet<String>> f56574e = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: com.facebook.a.b.c$b */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC23897b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: a */
        private WeakReference<View> f56578a;

        /* renamed from: b */
        private List<C23880a> f56579b;

        /* renamed from: c */
        private final Handler f56580c;

        /* renamed from: d */
        private HashSet<String> f56581d;

        /* renamed from: e */
        private final String f56582e;

        static {
            Covode.recordClassIndex(28018);
        }

        public final void onGlobalLayout() {
            m45191a();
        }

        public final void onScrollChanged() {
            m45191a();
        }

        /* renamed from: a */
        private void m45191a() {
            if (!(this.f56579b == null || this.f56578a.get() == null)) {
                for (int i = 0; i < this.f56579b.size(); i++) {
                    m45192a(this.f56579b.get(i), this.f56578a.get());
                }
            }
        }

        public final void run() {
            View view;
            if (!C24677a.m47209a(this)) {
                try {
                    C24699ae.m47299a();
                    C24768q a = C24770r.m47425a(C24872m.f59041a);
                    if (a == null) {
                        return;
                    }
                    if (a.f58764l) {
                        List<C23880a> a2 = C23880a.m45146a(a.f58766n);
                        this.f56579b = a2;
                        if (a2 != null && (view = this.f56578a.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            m45191a();
                        }
                    }
                } catch (Throwable th) {
                    C24677a.m47208a(th, this);
                }
            }
        }

        /* renamed from: a */
        private static List<View> m45189a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m45192a(C23880a aVar, View view) {
            if (!(aVar == null || view == null)) {
                if (TextUtils.isEmpty(aVar.f56534i) || aVar.f56534i.equals(this.f56582e)) {
                    List unmodifiableList = Collections.unmodifiableList(aVar.f56530e);
                    if (unmodifiableList.size() <= 25) {
                        for (C23896a aVar2 : m45190a(aVar, view, unmodifiableList, 0, -1, this.f56582e)) {
                            m45193a(aVar2, view, aVar);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        private void m45195b(C23896a aVar, View view, C23880a aVar2) {
            boolean z;
            View a = aVar.mo39391a();
            if (a != null) {
                String str = aVar.f56576a;
                View.OnClickListener g = C23888f.m45165g(a);
                if (!(g instanceof C23876a.View$OnClickListenerC23878a) || !((C23876a.View$OnClickListenerC23878a) g).f56516a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f56581d.contains(str) && !z) {
                    a.setOnClickListener(C23876a.m45142a(aVar2, view, a));
                    this.f56581d.add(str);
                }
            }
        }

        /* renamed from: c */
        private void m45196c(C23896a aVar, View view, C23880a aVar2) {
            boolean z;
            AdapterView adapterView = (AdapterView) aVar.mo39391a();
            if (adapterView != null) {
                String str = aVar.f56576a;
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (!(onItemClickListener instanceof C23876a.C23879b) || !((C23876a.C23879b) onItemClickListener).f56521a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f56581d.contains(str) && !z) {
                    adapterView.setOnItemClickListener(C23876a.m45143a(aVar2, view, adapterView));
                    this.f56581d.add(str);
                }
            }
        }

        /* renamed from: d */
        private void m45197d(C23896a aVar, View view, C23880a aVar2) {
            boolean z;
            View a = aVar.mo39391a();
            if (a != null) {
                String str = aVar.f56576a;
                View.OnTouchListener h = C23888f.m45166h(a);
                if (!(h instanceof C23898d.View$OnTouchListenerC23899a) || !((C23898d.View$OnTouchListenerC23899a) h).f56584a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f56581d.contains(str) && !z) {
                    a.setOnTouchListener(C23898d.m45198a(aVar2, view, a));
                    this.f56581d.add(str);
                }
            }
        }

        /* renamed from: a */
        private void m45193a(C23896a aVar, View view, C23880a aVar2) {
            if (aVar2 != null) {
                try {
                    View a = aVar.mo39391a();
                    if (a != null) {
                        View i = C23888f.m45167i(a);
                        if (i != null && C23888f.m45159a(a, i)) {
                            m45197d(aVar, view, aVar2);
                        } else if (!a.getClass().getName().startsWith("com.facebook.react")) {
                            if (!(a instanceof AdapterView)) {
                                m45195b(aVar, view, aVar2);
                            } else if (a instanceof ListView) {
                                m45196c(aVar, view, aVar2);
                            }
                        }
                    }
                } catch (Exception e) {
                    C24693ad.m47255a(C23894c.m45186c(), e);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
            if (r7.getClass().getSimpleName().equals(r1[r1.length - 1]) == false) goto L_0x0043;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m45194a(android.view.View r7, com.facebook.p1814a.p1816b.p1817a.C23884c r8, int r9) {
            /*
            // Method dump skipped, instructions count: 267
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1816b.C23894c.ViewTreeObserver$OnGlobalLayoutListenerC23897b.m45194a(android.view.View, com.facebook.a.b.a.c, int):boolean");
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC23897b(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f56578a = new WeakReference<>(view);
            this.f56580c = handler;
            this.f56581d = hashSet;
            this.f56582e = str;
            handler.postDelayed(this, 200);
        }

        /* renamed from: a */
        public static List<C23896a> m45190a(C23880a aVar, View view, List<C23884c> list, int i, int i2, String str) {
            String str2 = str + "." + String.valueOf(i2);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C23896a(view, str2));
            } else {
                C23884c cVar = list.get(i);
                if (cVar.f56541a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> a = m45189a((ViewGroup) parent);
                        int size = a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m45190a(aVar, a.get(i3), list, i + 1, i3, str2));
                        }
                    }
                    return arrayList;
                } else if (cVar.f56541a.equals(".")) {
                    arrayList.add(new C23896a(view, str2));
                    return arrayList;
                } else if (!m45194a(view, cVar, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C23896a(view, str2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List<View> a2 = m45189a((ViewGroup) view);
                int size2 = a2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m45190a(aVar, a2.get(i4), list, i + 1, i4, str2));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.facebook.a.b.c$a */
    public static class C23896a {

        /* renamed from: a */
        public String f56576a;

        /* renamed from: b */
        private WeakReference<View> f56577b;

        static {
            Covode.recordClassIndex(28017);
        }

        /* renamed from: a */
        public final View mo39391a() {
            WeakReference<View> weakReference = this.f56577b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public C23896a(View view, String str) {
            this.f56577b = new WeakReference<>(view);
            this.f56576a = str;
        }
    }

    static {
        Covode.recordClassIndex(28015);
    }

    /* renamed from: c */
    static /* synthetic */ String m45186c() {
        if (C24677a.m47209a(C23894c.class)) {
            return null;
        }
        try {
            return f56568f;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23894c.class);
            return null;
        }
    }

    private C23894c() {
    }

    /* renamed from: a */
    public static synchronized C23894c m45185a() {
        synchronized (C23894c.class) {
            MethodCollector.m26663i(9638);
            if (C24677a.m47209a(C23894c.class)) {
                MethodCollector.m26664o(9638);
                return null;
            }
            try {
                if (f56569g == null) {
                    f56569g = new C23894c();
                }
                C23894c cVar = f56569g;
                MethodCollector.m26664o(9638);
                return cVar;
            } catch (Throwable th) {
                C24677a.m47208a(th, C23894c.class);
                MethodCollector.m26664o(9638);
                return null;
            }
        }
    }

    /* renamed from: b */
    public final void mo39389b() {
        if (!C24677a.m47209a(this)) {
            try {
                for (Activity activity : this.f56571b) {
                    if (activity != null) {
                        this.f56572c.add(new ViewTreeObserver$OnGlobalLayoutListenerC23897b(C23929b.m45241a(activity), this.f56570a, this.f56573d, activity.getClass().getSimpleName()));
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    public static Bundle m45184a(C23880a aVar, View view, View view2) {
        List<C23883b> unmodifiableList;
        List<C23896a> a;
        if (C24677a.m47209a(C23894c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            C23880a aVar2 = aVar;
            if (!(aVar2 == null || (unmodifiableList = Collections.unmodifiableList(aVar2.f56531f)) == null)) {
                for (C23883b bVar : unmodifiableList) {
                    if (bVar.f56538b != null && bVar.f56538b.length() > 0) {
                        bundle.putString(bVar.f56537a, bVar.f56538b);
                    } else if (bVar.f56539c.size() > 0) {
                        if (bVar.f56540d.equals("relative")) {
                            a = ViewTreeObserver$OnGlobalLayoutListenerC23897b.m45190a(aVar2, view2, bVar.f56539c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            aVar2 = aVar2;
                            a = ViewTreeObserver$OnGlobalLayoutListenerC23897b.m45190a(aVar2, view, bVar.f56539c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<C23896a> it = a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C23896a next = it.next();
                            if (next.mo39391a() != null) {
                                String e = C23888f.m45163e(next.mo39391a());
                                if (e.length() > 0) {
                                    bundle.putString(bVar.f56537a, e);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23894c.class);
            return null;
        }
    }
}
