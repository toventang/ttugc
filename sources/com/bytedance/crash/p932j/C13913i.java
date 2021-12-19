package com.bytedance.crash.p932j;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.entity.C13865c;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14007g;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.C14032s;
import com.bytedance.crash.runtime.p934b.C13996a;
import com.bytedance.crash.util.C14052g;
import com.bytedance.crash.util.C14068q;
import com.bytedance.crash.util.C14075v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.bytedance.crash.j.i */
public final class C13913i {

    /* renamed from: a */
    public static final C14068q<C13920a, C13866d> f33901a = new C14068q<C13920a, C13866d>() {
        /* class com.bytedance.crash.p932j.C13913i.C139141 */

        static {
            Covode.recordClassIndex(15974);
        }

        @Override // com.bytedance.crash.util.C14068q
        public final List<C13866d> newList() {
            return new LinkedList();
        }
    };

    /* renamed from: d */
    public static final Object f33902d = C13865c.f33760b;

    /* renamed from: e */
    private static final HashMap<C13920a, HashMap<String, LinkedList<C13866d>>> f33903e = new HashMap<>();

    /* renamed from: f */
    private static volatile C13913i f33904f;

    /* renamed from: b */
    public final C14032s f33905b = C14019n.m25421b();

    /* renamed from: c */
    public final Runnable f33906c = new Runnable() {
        /* class com.bytedance.crash.p932j.C13913i.RunnableC139152 */

        static {
            Covode.recordClassIndex(15975);
        }

        public final void run() {
            if (!C13934n.f33962h) {
                C13913i.m25190b();
                C13913i.this.mo22395c();
                C13913i.this.f33905b.mo22552a(C13913i.this.f33906c, 30000);
            }
        }
    };

    /* renamed from: g */
    private volatile boolean f33907g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.j.i$a */
    public static class C13920a {

        /* renamed from: c */
        private static final HashMap<Integer, C13920a> f33912c = new HashMap<>();

        /* renamed from: a */
        final Object f33913a;

        /* renamed from: b */
        final int f33914b;

        static {
            Covode.recordClassIndex(15980);
        }

        public final int hashCode() {
            return (this.f33913a.hashCode() * 31) + this.f33914b;
        }

        /* renamed from: a */
        private static int m25197a(C13866d dVar) {
            if (dVar.mo22352c()) {
                return 1;
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13920a)) {
                return false;
            }
            C13920a aVar = (C13920a) obj;
            if (this.f33914b != aVar.f33914b) {
                return false;
            }
            return this.f33913a.equals(aVar.f33913a);
        }

        private C13920a(Object obj, int i) {
            this.f33913a = obj;
            this.f33914b = i;
        }

        /* renamed from: b */
        private static int m25199b(Object obj, C13866d dVar) {
            return (obj.hashCode() * 31) + m25197a(dVar);
        }

        /* renamed from: a */
        public static C13920a m25198a(Object obj, C13866d dVar) {
            int b = m25199b(obj, dVar);
            HashMap<Integer, C13920a> hashMap = f33912c;
            C13920a aVar = hashMap.get(Integer.valueOf(b));
            if (aVar != null) {
                return aVar;
            }
            C13920a aVar2 = new C13920a(obj, m25197a(dVar));
            hashMap.put(Integer.valueOf(b), aVar2);
            return aVar2;
        }
    }

    static {
        Covode.recordClassIndex(15973);
    }

    private C13913i() {
    }

    /* renamed from: d */
    private static void m25193d() {
        if (C13934n.f33955a && !C13934n.f33962h) {
            try {
                C14019n.m25421b().mo22551a(new Runnable() {
                    /* class com.bytedance.crash.p932j.C13913i.RunnableC139174 */

                    static {
                        Covode.recordClassIndex(15977);
                    }

                    public final void run() {
                        C13913i.m25187a().mo22395c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static C13913i m25187a() {
        MethodCollector.m26663i(2783);
        if (f33904f == null) {
            synchronized (C13913i.class) {
                try {
                    if (f33904f == null) {
                        f33904f = new C13913i();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2783);
                    throw th;
                }
            }
        }
        C13913i iVar = f33904f;
        MethodCollector.m26664o(2783);
        return iVar;
    }

    /* renamed from: b */
    public static void m25190b() {
        HashMap hashMap;
        MethodCollector.m26663i(2988);
        HashMap<C13920a, HashMap<String, LinkedList<C13866d>>> hashMap2 = f33903e;
        if (hashMap2.isEmpty()) {
            MethodCollector.m26664o(2988);
        } else if (!C13934n.f33955a || (!C13994b.m25335b() && System.currentTimeMillis() - C13933m.f33938c < 180000)) {
            MethodCollector.m26664o(2988);
        } else {
            synchronized (hashMap2) {
                try {
                    hashMap = new HashMap(hashMap2);
                    hashMap2.clear();
                } finally {
                    MethodCollector.m26664o(2988);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                    LinkedList linkedList = (LinkedList) entry2.getValue();
                    while (!linkedList.isEmpty()) {
                        try {
                            C13866d dVar = (C13866d) linkedList.poll();
                            if (dVar == null) {
                                break;
                            }
                            m25189a(((C13920a) entry.getKey()).f33913a, dVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r7 = new java.util.LinkedList();
        r8 = com.bytedance.crash.p932j.C13913i.f33901a.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r8.hasNext() == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1 = r8.next();
        r5 = (java.util.List) r1.getValue();
        r4 = r1.getKey().f33913a;
        r3 = r1.getKey().f33914b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r5.isEmpty() != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r5.isEmpty() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r7.add(r5.remove(0));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r1 >= 30) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r7.isEmpty() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r1 = com.bytedance.crash.runtime.p933a.C13989e.m25320a().mo22512a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r1 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        com.bytedance.crash.util.C14075v.m25650a("upload events");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r4 != com.bytedance.crash.p932j.C13913i.f33902d) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r3 != 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r2 = com.bytedance.crash.entity.C13865c.m25082b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
        r2 = com.bytedance.crash.entity.C13865c.m25081a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        com.bytedance.crash.p932j.C13900c.m25153a(r1.f33757a, r2, new com.bytedance.crash.p932j.C13913i.C139185(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        com.bytedance.crash.runtime.C14007g.m25388a().mo22527c();
        r7.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        com.bytedance.crash.C13933m.f33942g.isDebugMode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r10.f33907g = false;
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3015);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22395c() {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p932j.C13913i.mo22395c():void");
    }

    /* renamed from: a */
    public static void m25188a(final C13866d dVar) {
        if (!C13934n.f33962h) {
            Handler handler = C14019n.m25421b().f34199d;
            if (handler == null || handler.getLooper() != Looper.myLooper()) {
                C14019n.m25421b().mo22551a(new Runnable() {
                    /* class com.bytedance.crash.p932j.C13913i.RunnableC139163 */

                    static {
                        Covode.recordClassIndex(15976);
                    }

                    public final void run() {
                        C13913i.m25189a(C13913i.f33902d, dVar);
                    }
                });
            } else {
                m25189a(f33902d, dVar);
            }
        }
    }

    /* renamed from: b */
    private static void m25191b(Object obj, C13866d dVar) {
        boolean z;
        List<C13866d> list = f33901a.getList(C13920a.m25198a(obj, dVar));
        list.add(dVar);
        int size = list.size();
        if (size >= 30) {
            z = true;
        } else {
            z = false;
        }
        C14075v.m25651b("[enqueue] size=".concat(String.valueOf(size)));
        if (z) {
            m25193d();
        }
    }

    /* renamed from: c */
    private static void m25192c(Object obj, C13866d dVar) {
        LinkedList<C13866d> linkedList;
        MethodCollector.m26663i(2896);
        try {
            String string = dVar.f33757a.getString("log_type");
            HashMap<C13920a, HashMap<String, LinkedList<C13866d>>> hashMap = f33903e;
            synchronized (hashMap) {
                try {
                    HashMap<String, LinkedList<C13866d>> hashMap2 = hashMap.get(C13920a.m25198a(obj, dVar));
                    if (hashMap2 == null) {
                        hashMap2 = new HashMap<>();
                        hashMap.put(C13920a.m25198a(obj, dVar), hashMap2);
                    }
                    linkedList = hashMap2.get(string);
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        hashMap2.put(string, linkedList);
                    }
                } finally {
                    MethodCollector.m26664o(2896);
                }
            }
            linkedList.add(dVar);
            if (linkedList.size() > 100) {
                linkedList.poll();
            }
        } catch (JSONException e) {
            e.printStackTrace();
            MethodCollector.m26664o(2896);
        }
    }

    /* renamed from: a */
    public static void m25189a(Object obj, C13866d dVar) {
        Object obj2;
        String a;
        if (!C13934n.f33962h && !C13934n.f33963i) {
            if (obj == null) {
                obj = f33902d;
            }
            if (!C13934n.f33955a || (obj == (obj2 = f33902d) && !C13994b.m25335b() && System.currentTimeMillis() - C13933m.f33938c < 180000)) {
                m25192c(obj, dVar);
                return;
            }
            if (obj != obj2 && (!C13996a.m25352a(C13865c.m25083c(obj)) || C13924m.m25208a(C13865c.m25083c(obj)))) {
                C13888a.m25121a(obj);
            }
            m25190b();
            String optString = dVar.f33757a.optString("log_type");
            if ("service_monitor".equals(optString)) {
                String optString2 = dVar.f33757a.optString("service");
                if (TextUtils.isEmpty(optString2) || !C13994b.m25336b(obj, optString2)) {
                    C13933m.f33942g.isDebugMode();
                    return;
                }
                C13933m.f33942g.isDebugMode();
                m25191b(obj, dVar);
                return;
            }
            String optString3 = dVar.f33757a.optString("message");
            if (TextUtils.isEmpty(optString3)) {
                a = null;
            } else {
                a = C14052g.m25539a(optString3);
            }
            String optString4 = dVar.f33757a.optString("crash_md5");
            if (!C14007g.m25388a().mo22524a(optString4, a)) {
                C13933m.f33942g.isDebugMode();
            } else if (TextUtils.isEmpty(optString) || !C13994b.m25334a(obj, optString)) {
                C13933m.f33942g.isDebugMode();
            } else if (!C14007g.m25388a().mo22526b(optString4, a)) {
                C13933m.f33942g.isDebugMode();
            } else {
                C13933m.f33942g.isDebugMode();
                m25191b(obj, dVar);
            }
        }
    }
}
