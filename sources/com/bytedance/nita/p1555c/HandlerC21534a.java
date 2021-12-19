package com.bytedance.nita.p1555c;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.C21521a;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.p1553a.C21522a;
import com.bytedance.nita.p1557e.C21554a;
import com.bytedance.nita.p1557e.C21558b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.c.a */
public final class HandlerC21534a extends Handler {

    /* renamed from: a */
    public static final int f51116a = 100;

    /* renamed from: b */
    public static final ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> f51117b = new ConcurrentHashMap<>();

    /* renamed from: c */
    static final ConcurrentHashMap<Integer, ArrayList<String>> f51118c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final ArrayList<String> f51119d = new ArrayList<>();

    /* renamed from: e */
    public static final Object f51120e = new Object();

    /* renamed from: f */
    public static final HandlerC21534a f51121f = new HandlerC21534a();

    /* renamed from: g */
    private static final HashMap<String, Integer> f51122g = new HashMap<>();

    /* renamed from: h */
    private static int f51123h = -1;

    /* renamed from: i */
    private static final C21536a f51124i;

    private HandlerC21534a() {
        super(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static void m40470a() {
        C21554a.f51150b.mo35228a().execute(RunnableC21537b.f51125a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.nita.c.a$b */
    public static final class RunnableC21537b implements Runnable {

        /* renamed from: a */
        public static final RunnableC21537b f51125a = new RunnableC21537b();

        static {
            Covode.recordClassIndex(25178);
        }

        RunnableC21537b() {
        }

        public final void run() {
            MethodCollector.m26663i(6171);
            synchronized (HandlerC21534a.f51120e) {
                try {
                    HashMap hashMap = new HashMap();
                    int i = 0;
                    int size = HandlerC21534a.f51119d.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            if (HandlerC21534a.f51117b.get(HandlerC21534a.f51119d.get(i)) != null) {
                                hashMap.put(HandlerC21534a.f51119d.get(i), HandlerC21534a.f51117b.get(HandlerC21534a.f51119d.get(i)));
                            }
                            HandlerC21534a.f51119d.get(i);
                            if (i == size) {
                                break;
                            }
                            i++;
                        }
                    }
                    HandlerC21534a.f51117b.size();
                    HandlerC21534a.f51117b.clear();
                    HandlerC21534a.f51117b.putAll(hashMap);
                } finally {
                    MethodCollector.m26664o(6171);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(25175);
        C21536a aVar = new C21536a();
        f51124i = aVar;
        Context a = C21521a.m40432a();
        if (a != null) {
            ((Application) a).registerActivityLifecycleCallbacks(aVar);
            Context a2 = C21521a.m40432a();
            if (a2 != null) {
                ((Application) a2).registerComponentCallbacks(new ComponentCallbacks2() {
                    /* class com.bytedance.nita.p1555c.HandlerC21534a.ComponentCallbacks2C215351 */

                    static {
                        Covode.recordClassIndex(25176);
                    }

                    public final void onConfigurationChanged(Configuration configuration) {
                        C89219l.m154719c(configuration, "");
                    }

                    public final void onTrimMemory(int i) {
                    }

                    public final void onLowMemory() {
                        HandlerC21534a.m40470a();
                    }
                });
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: com.bytedance.nita.c.a$a */
    static final class C21536a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(25177);
        }

        public final void onActivityPaused(Activity activity) {
            C89219l.m154719c(activity, "");
        }

        public final void onActivityResumed(Activity activity) {
            C89219l.m154719c(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C89219l.m154719c(activity, "");
            C89219l.m154719c(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            C89219l.m154719c(activity, "");
        }

        public final void onActivityStopped(Activity activity) {
            C89219l.m154719c(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            MethodCollector.m26663i(3294);
            C89219l.m154719c(activity, "");
            synchronized (this) {
                try {
                    ArrayList<String> remove = HandlerC21534a.f51118c.remove(Integer.valueOf(activity.hashCode()));
                    if (remove != null) {
                        Iterator<T> it = remove.iterator();
                        while (it.hasNext()) {
                            HandlerC21534a.m40473a(it.next(), activity);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(3294);
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154719c(activity, "");
            HandlerC21534a.f51118c.put(Integer.valueOf(activity.hashCode()), new ArrayList<>());
        }
    }

    public final void handleMessage(Message message) {
        MethodCollector.m26663i(6783);
        C89219l.m154719c(message, "");
        ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap = f51117b;
        Object obj = message.obj;
        if (obj != null) {
            HashMap<Integer, SparseArray<List<View>>> hashMap = concurrentHashMap.get(obj);
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(message.arg1));
                        if (sparseArray != null) {
                            sparseArray.remove(message.what);
                        }
                    } finally {
                        MethodCollector.m26664o(6783);
                    }
                }
                return;
            }
            MethodCollector.m26664o(6783);
            return;
        }
        C89388w wVar = new C89388w("null cannot be cast to non-null type");
        MethodCollector.m26664o(6783);
        throw wVar;
    }

    /* renamed from: a */
    public static void m40473a(String str, Context context) {
        Class<?> cls;
        MethodCollector.m26663i(7379);
        C89219l.m154719c(str, "");
        HashMap<Integer, SparseArray<List<View>>> hashMap = f51117b.get(str);
        if (hashMap != null) {
            synchronized (hashMap) {
                try {
                    hashMap.remove(Integer.valueOf(f51121f.mo35200a(str, context, false)));
                } catch (Throwable th) {
                    MethodCollector.m26664o(7379);
                    throw th;
                }
            }
        }
        if (context == null || (cls = context.getClass()) == null) {
            MethodCollector.m26664o(7379);
            return;
        }
        cls.getName();
        MethodCollector.m26664o(7379);
    }

    /* renamed from: a */
    public static void m40471a(Context context, AbstractC21525c cVar) {
        MethodCollector.m26663i(6782);
        if (context instanceof Activity) {
            synchronized (f51124i) {
                try {
                    int hashCode = context.hashCode();
                    ConcurrentHashMap<Integer, ArrayList<String>> concurrentHashMap = f51118c;
                    ArrayList<String> arrayList = concurrentHashMap.get(Integer.valueOf(hashCode));
                    if (arrayList == null || !arrayList.contains(cVar.mo35178a())) {
                        ArrayList<String> arrayList2 = concurrentHashMap.get(Integer.valueOf(hashCode));
                        if (arrayList2 != null) {
                            Boolean.valueOf(arrayList2.add(cVar.mo35178a()));
                        }
                        MethodCollector.m26664o(6782);
                    }
                } finally {
                    MethodCollector.m26664o(6782);
                }
            }
        } else {
            MethodCollector.m26664o(6782);
        }
    }

    /* renamed from: a */
    public static void m40472a(String str, int i) {
        List<View> list;
        MethodCollector.m26663i(6934);
        C89219l.m154719c(str, "");
        HashMap<Integer, SparseArray<List<View>>> hashMap = f51117b.get(str);
        if (hashMap != null) {
            synchronized (hashMap) {
                try {
                    for (Map.Entry<Integer, SparseArray<List<View>>> entry : hashMap.entrySet()) {
                        SparseArray<List<View>> value = entry.getValue();
                        if (!(value == null || (list = value.get(i)) == null)) {
                            list.clear();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(6934);
                }
            }
            return;
        }
        MethodCollector.m26664o(6934);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5 = com.bytedance.nita.p1555c.HandlerC21534a.f51121f;
        r0 = r3.get(java.lang.Integer.valueOf(r5.mo35200a(r9, r11, false)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r1 = r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r1.isEmpty() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r0 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0 = r1.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r0 = r3.get(java.lang.Integer.valueOf(r5.mo35200a(r9, r11, true)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r0 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        r1 = r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        if (r1 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r1.isEmpty() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        if (r2 != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        r0 = r1.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0090, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7233);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0094, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0095, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7233);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7233);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo35202b(java.lang.String r9, int r10, android.content.Context r11) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.nita.p1555c.HandlerC21534a.mo35202b(java.lang.String, int, android.content.Context):android.view.View");
    }

    /* renamed from: a */
    public static boolean m40474a(String str, int i, Context context) {
        List<View> list;
        MethodCollector.m26663i(7085);
        C89219l.m154719c(str, "");
        HashMap<Integer, SparseArray<List<View>>> hashMap = f51117b.get(str);
        boolean z = false;
        if (hashMap != null) {
            synchronized (hashMap) {
                try {
                    SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(f51121f.mo35200a(str, context, false)));
                    if (!(sparseArray == null || (list = sparseArray.get(i)) == null || list.size() == 0)) {
                        z = true;
                    }
                } finally {
                    MethodCollector.m26664o(7085);
                }
            }
            return z;
        }
        MethodCollector.m26664o(7085);
        return false;
    }

    /* renamed from: a */
    public final int mo35200a(String str, Context context, boolean z) {
        int i;
        MethodCollector.m26663i(7086);
        if ((context instanceof C21522a) || context == null || z || (context instanceof Application)) {
            synchronized (this) {
                try {
                    HashMap<String, Integer> hashMap = f51122g;
                    Integer num = hashMap.get(str);
                    if (num == null) {
                        int i2 = f51123h - 1;
                        f51123h = i2;
                        num = Integer.valueOf(i2);
                        hashMap.put(str, num);
                    }
                    i = num.intValue();
                } finally {
                    MethodCollector.m26664o(7086);
                }
            }
        } else {
            i = context.hashCode();
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo35201a(View view, AbstractC21525c cVar, int i) {
        MethodCollector.m26663i(6647);
        C89219l.m154719c(view, "");
        C89219l.m154719c(cVar, "");
        String a = cVar.mo35178a();
        ConcurrentHashMap<String, HashMap<Integer, SparseArray<List<View>>>> concurrentHashMap = f51117b;
        HashMap<Integer, SparseArray<List<View>>> hashMap = concurrentHashMap.get(a);
        if (hashMap == null) {
            synchronized (this) {
                try {
                    hashMap = new HashMap<>();
                    if (view.getContext() instanceof C21522a) {
                        int i2 = f51123h - 1;
                        f51123h = i2;
                        f51122g.put(a, Integer.valueOf(i2));
                        hashMap.put(Integer.valueOf(f51123h), new SparseArray<>());
                    } else {
                        hashMap.put(Integer.valueOf(view.getContext().hashCode()), new SparseArray<>());
                    }
                    concurrentHashMap.put(a, hashMap);
                } catch (Throwable th) {
                    MethodCollector.m26664o(6647);
                    throw th;
                }
            }
        }
        Context context = view.getContext();
        C89219l.m154709a((Object) context, "");
        if (!C21558b.m40491a(context)) {
            MethodCollector.m26664o(6647);
            return false;
        }
        synchronized (hashMap) {
            try {
                int a2 = f51121f.mo35200a(a, context, false);
                if (hashMap.get(Integer.valueOf(a2)) == null) {
                    hashMap.put(Integer.valueOf(a2), new SparseArray<>());
                }
                SparseArray<List<View>> sparseArray = hashMap.get(Integer.valueOf(a2));
                if (sparseArray != null) {
                    if (sparseArray.get(i) == null) {
                        sparseArray.put(i, new ArrayList());
                    }
                    List<View> list = sparseArray.get(i);
                    if (list == null) {
                        C89219l.m154707a();
                    }
                    Boolean.valueOf(list.add(view));
                }
            } catch (Throwable th2) {
                MethodCollector.m26664o(6647);
                throw th2;
            }
        }
        MethodCollector.m26664o(6647);
        return true;
    }
}
