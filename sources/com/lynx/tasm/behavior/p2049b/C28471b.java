package com.lynx.tasm.behavior.p2049b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.p2043a.C28407b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.lynx.tasm.behavior.b.b */
public final class C28471b {

    /* renamed from: a */
    public WeakHashMap<LynxUI, C28407b> f66962a = new WeakHashMap<>();

    /* renamed from: b */
    public WeakHashMap<LynxUI, C28407b> f66963b = new WeakHashMap<>();

    /* renamed from: c */
    public WeakHashMap<LynxUI, C28407b> f66964c = new WeakHashMap<>();

    /* renamed from: d */
    public WeakHashMap<LynxUI, C28407b> f66965d = new WeakHashMap<>();

    /* renamed from: e */
    public WeakHashMap<LynxUI, String> f66966e = new WeakHashMap<>();

    /* renamed from: f */
    public volatile boolean f66967f = true;

    /* renamed from: g */
    private ConcurrentHashMap<String, WeakReference<View>> f66968g = new ConcurrentHashMap<>();

    /* renamed from: com.lynx.tasm.behavior.b.b$b */
    public interface AbstractC28475b {
        static {
            Covode.recordClassIndex(34473);
        }

        /* renamed from: a */
        void mo48986a();
    }

    /* renamed from: com.lynx.tasm.behavior.b.b$c */
    public interface AbstractC28476c {
        static {
            Covode.recordClassIndex(34474);
        }

        /* renamed from: a */
        void mo48987a();
    }

    static {
        Covode.recordClassIndex(34469);
    }

    /* renamed from: com.lynx.tasm.behavior.b.b$a */
    public static final class C28474a {

        /* renamed from: a */
        public static C28471b f66975a = new C28471b();

        static {
            Covode.recordClassIndex(34472);
        }
    }

    /* renamed from: a */
    public final void mo48980a(LynxView lynxView) {
        for (LynxUI lynxUI : this.f66964c.keySet()) {
            if (lynxUI.mContext.f67068i.f67258a == lynxView) {
                lynxUI.execResumeAnim();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo48981a(LynxUI lynxUI, C28407b bVar) {
        MethodCollector.m26663i(946);
        this.f66963b.put(lynxUI, bVar);
        lynxUI.setEnterAnim(bVar);
        MethodCollector.m26664o(946);
    }

    /* renamed from: b */
    public final synchronized void mo48983b(LynxUI lynxUI, C28407b bVar) {
        MethodCollector.m26663i(950);
        this.f66962a.put(lynxUI, bVar);
        lynxUI.setExitAnim(bVar);
        MethodCollector.m26664o(950);
    }

    /* renamed from: c */
    public final synchronized void mo48984c(LynxUI lynxUI, C28407b bVar) {
        MethodCollector.m26663i(954);
        this.f66964c.put(lynxUI, bVar);
        lynxUI.setResumeAnim(bVar);
        MethodCollector.m26664o(954);
    }

    /* renamed from: d */
    public final synchronized void mo48985d(LynxUI lynxUI, C28407b bVar) {
        MethodCollector.m26663i(957);
        this.f66965d.put(lynxUI, bVar);
        lynxUI.setPauseAnim(bVar);
        MethodCollector.m26664o(957);
    }

    /* renamed from: a */
    public static <T> void m56908a(Map<LynxUI, T> map, LynxView lynxView) {
        Iterator<Map.Entry<LynxUI, T>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().mContext.f67068i.f67258a == lynxView) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final synchronized View mo48979a(String str, LynxUI lynxUI) {
        View view;
        MethodCollector.m26663i(944);
        WeakReference<View> weakReference = this.f66968g.get(str);
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view == null) {
            for (Map.Entry<LynxUI, String> entry : this.f66966e.entrySet()) {
                LynxUI key = entry.getKey();
                if (lynxUI != key && entry.getValue().equals(str)) {
                    T t = key.mView;
                    MethodCollector.m26664o(944);
                    return t;
                }
            }
        }
        MethodCollector.m26664o(944);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo48982a(LynxUI lynxUI, String str) {
        MethodCollector.m26663i(936);
        this.f66966e.put(lynxUI, str);
        MethodCollector.m26664o(936);
    }
}
