package com.p2082ss.videoarch.strategy.inferenceEngine.p4486a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.videoarch.strategy.p4484b.C87203c;
import com.p2082ss.videoarch.strategy.p4484b.p4485a.C87201a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.a */
public class C87215a {

    /* renamed from: B */
    private static List<String> f197493B = new ArrayList();

    /* renamed from: e */
    public static final Map<String, C87224b> f197494e = new C0484a();

    /* renamed from: g */
    public static List<String> f197495g = new ArrayList();

    /* renamed from: A */
    private final List<String> f197496A = new ArrayList();

    /* renamed from: C */
    private Map<String, Integer> f197497C;

    /* renamed from: D */
    private boolean f197498D = false;

    /* renamed from: E */
    private String f197499E = null;

    /* renamed from: F */
    private boolean f197500F = false;

    /* renamed from: G */
    private boolean f197501G = false;

    /* renamed from: a */
    public volatile AbstractC87222d f197502a;

    /* renamed from: b */
    public volatile AbstractC87221c f197503b;

    /* renamed from: c */
    public ReentrantLock f197504c = new ReentrantLock();

    /* renamed from: d */
    public Handler f197505d = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public final List<C87225c> f197506f = new LinkedList();

    /* renamed from: h */
    public boolean f197507h = false;

    /* renamed from: i */
    public boolean f197508i = false;

    /* renamed from: j */
    public Set<String> f197509j;

    /* renamed from: k */
    public int f197510k = 0;

    /* renamed from: l */
    public int f197511l = -1;

    /* renamed from: m */
    public int f197512m = -1;

    /* renamed from: n */
    public int f197513n = -1;

    /* renamed from: o */
    public int f197514o = -1;

    /* renamed from: p */
    public int f197515p = -1;

    /* renamed from: q */
    public int f197516q = 2;

    /* renamed from: r */
    public long f197517r = 5000;

    /* renamed from: s */
    public int f197518s = -1;

    /* renamed from: t */
    public long f197519t = 0;

    /* renamed from: u */
    public int f197520u = -1;

    /* renamed from: v */
    public boolean f197521v = false;

    /* renamed from: w */
    public AbstractC87223e f197522w;

    /* renamed from: x */
    public int f197523x = -1;

    /* renamed from: y */
    private final ThreadPoolExecutor f197524y;

    /* renamed from: z */
    private final ThreadPoolExecutor f197525z;

    /* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.a$c */
    public interface AbstractC87221c {
        static {
            Covode.recordClassIndex(103024);
        }

        /* renamed from: a */
        void mo141049a(String str, String str2);
    }

    /* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.a$d */
    public interface AbstractC87222d {
        static {
            Covode.recordClassIndex(103025);
        }

        /* renamed from: a */
        void mo141047a(String str);
    }

    /* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.a$e */
    public interface AbstractC87223e {
        static {
            Covode.recordClassIndex(103026);
        }

        /* renamed from: a */
        int mo141050a(String str);
    }

    /* renamed from: b */
    private boolean m151245b() {
        if (this.f197512m != 1) {
            return false;
        }
        if (this.f197514o == 0 || this.f197523x == 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103018);
    }

    /* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.a$a */
    static class ThreadFactoryC87219a implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f197538a;

        /* renamed from: b */
        private final AtomicInteger f197539b;

        /* renamed from: c */
        private final String f197540c;

        static {
            Covode.recordClassIndex(103022);
        }

        private ThreadFactoryC87219a() {
            ThreadGroup threadGroup;
            this.f197539b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f197538a = threadGroup;
            this.f197540c = "dns-optimizer-listen-";
        }

        /* synthetic */ ThreadFactoryC87219a(byte b) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(11288);
            Thread thread = new Thread(this.f197538a, runnable, this.f197540c + this.f197539b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.m26664o(11288);
            return thread;
        }
    }

    /* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.a$b */
    static class ThreadFactoryC87220b implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f197541a;

        /* renamed from: b */
        private final AtomicInteger f197542b;

        /* renamed from: c */
        private final String f197543c;

        static {
            Covode.recordClassIndex(103023);
        }

        private ThreadFactoryC87220b() {
            ThreadGroup threadGroup;
            this.f197542b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f197541a = threadGroup;
            this.f197543c = "dns-optimizer-";
        }

        /* synthetic */ ThreadFactoryC87220b(byte b) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(11139);
            Thread thread = new Thread(this.f197541a, runnable, this.f197543c + this.f197542b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.m26664o(11139);
            return thread;
        }
    }

    /* renamed from: a */
    public final void mo141084a() {
        Set<String> set = this.f197509j;
        if (set == null || set.size() == 0) {
            f197494e.clear();
            return;
        }
        for (String str : this.f197509j) {
            C87224b bVar = f197494e.get(str);
            if (bVar != null) {
                bVar.mo141096b(null);
                bVar.mo141098c(null);
                bVar.mo141094a((List<String>) null);
            }
        }
    }

    /* renamed from: c */
    private String m151246c() {
        StringBuilder sb = new StringBuilder();
        this.f197504c.lock();
        List<String> list = f197495g;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            sb.append("\"HTTPDNSRequest\":{\"Enabled\":true,\"DomainNames\":[");
            for (String str : f197495g) {
                if (i != 0) {
                    sb.append(",");
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append("\"" + str + "\"");
                }
                i++;
            }
            sb.append("],\"IsNeedIPV6\":" + m151245b() + "}");
        }
        this.f197504c.unlock();
        return sb.toString();
    }

    public C87215a(AbstractC87222d dVar) {
        MethodCollector.m26663i(9788);
        this.f197502a = dVar;
        ThreadPoolExecutor threadPoolExecutor = C87203c.m151234a().f197461d;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC87220b((byte) 0));
            this.f197524y = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
        } else {
            this.f197524y = threadPoolExecutor;
        }
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC87219a((byte) 0));
        this.f197525z = threadPoolExecutor3;
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        MethodCollector.m26664o(9788);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (android.text.TextUtils.equals(r1, r0) != false) goto L_0x008b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m151247c(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.m151247c(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private String m151244b(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            Map<String, C87224b> map = f197494e;
            if (!(map == null || map.size() == 0)) {
                sb.append("\"SelectNodeRequest\":{\"Enabled\":true,\"IsNeedIPV6\":" + m151245b() + ",\"IPs\":{");
                int i = 0;
                for (C87224b bVar : map.values()) {
                    List<String> list = bVar.f197547c;
                    if (!(list == null || list.size() == 0)) {
                        if (i != 0) {
                            sb.append(",");
                        }
                        sb.append("\"" + bVar.f197545a + "\":[");
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            if (i2 != 0) {
                                sb.append(",");
                            }
                            sb.append("\"" + list.get(i2) + "\"");
                        }
                        sb.append("]");
                        i++;
                    }
                }
                sb.append("}}");
            }
        } else {
            Map<String, C87224b> map2 = f197494e;
            if (!(map2 == null || map2.size() == 0)) {
                sb.append("\"SelectNodeRequest\":{\"Enabled\":true,\"IsNeedIPV6\":" + m151245b() + ",\"IPs\":{");
                sb.append("\"" + str + "\":[");
                C87224b bVar2 = map2.get(str);
                List arrayList = new ArrayList();
                if ((bVar2 == null || (arrayList = bVar2.f197547c) != null) && arrayList.size() != 0) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (i3 != 0) {
                            sb.append(",");
                        }
                        sb.append("\"" + ((String) arrayList.get(i3)) + "\"");
                    }
                }
                sb.append("]}}");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final JSONObject mo141083a(final String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str2 = null;
        if (!this.f197507h && !this.f197498D) {
            return null;
        }
        Map<String, C87224b> map = f197494e;
        C87224b bVar = map.get(str);
        if (bVar != null) {
            str2 = bVar.mo141092a(m151245b());
            jSONObject = bVar.mo141097c();
            jSONArray = bVar.mo141093a();
        } else {
            jSONArray = null;
            jSONObject = null;
        }
        if (str2 == null && map.containsKey(str) && this.f197508i) {
            this.f197505d.post(new Runnable() {
                /* class com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.RunnableC872161 */

                static {
                    Covode.recordClassIndex(103019);
                }

                public final void run() {
                    C87215a aVar = C87215a.this;
                    aVar.mo141086a(aVar.f197502a, str);
                }
            });
        }
        try {
            jSONObject2.put("Ip", str2);
            jSONObject2.put("EvaluatorSymbol", jSONObject);
            jSONObject2.put("RemoteResult", jSONArray);
            jSONObject2.put("RequestId", this.f197499E);
            jSONObject2.put("IsRemoteSorted", this.f197498D);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r0 == 1) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo141082a(boolean r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.mo141082a(boolean, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo141085a(C87201a aVar, String str) {
        this.f197507h = true;
        if (aVar != null) {
            if (this.f197509j == null) {
                this.f197509j = aVar.mo141068a();
                this.f197497C = aVar.f197454h;
            }
            this.f197499E = aVar.f197452f;
            this.f197498D = aVar.f197450d;
            if (aVar.f197448b != -1) {
                this.f197513n = aVar.f197448b;
            }
            if (aVar.f197447a != -1) {
                this.f197512m = aVar.f197447a;
            }
            Set<String> set = this.f197509j;
            if (set == null || set.size() == 0) {
                f197494e.clear();
                return;
            }
            Set<String> hashSet = new HashSet();
            if (str == null) {
                hashSet = this.f197509j;
            } else {
                hashSet.add(str);
            }
            for (String str2 : hashSet) {
                C87224b bVar = f197494e.get(str2);
                if (bVar == null) {
                    if (this.f197497C.get(str2) != null) {
                        bVar = new C87224b(str2, this.f197497C.get(str2).intValue());
                    } else {
                        bVar = new C87224b(str2, 0);
                    }
                }
                JSONArray a = aVar.mo141069a(str2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (a != null) {
                    for (int i = 0; i < a.length(); i++) {
                        JSONObject optJSONObject = a.optJSONObject(i);
                        if (optJSONObject.has("IP") && optJSONObject.has("DomainParseType")) {
                            if (optJSONObject.optInt("DomainParseType") == 0) {
                                arrayList2.add(optJSONObject.optString("IP"));
                            } else {
                                arrayList.add(optJSONObject.optString("IP"));
                            }
                        }
                    }
                }
                bVar.mo141094a(arrayList);
                bVar.mo141096b(arrayList2);
                bVar.f197548d = aVar.f197453g;
                f197494e.put(str2, bVar);
                if (this.f197520u == 1) {
                    String a2 = bVar.mo141092a(m151245b());
                    if (!TextUtils.isEmpty(a2) && this.f197503b != null) {
                        this.f197503b.mo141049a(str2, a2);
                    }
                }
            }
            if (!this.f197501G) {
                this.f197501G = true;
                mo141086a(this.f197502a, (String) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo141086a(AbstractC87222d dVar, String str) {
        Set<String> set;
        String str2;
        if (dVar != null) {
            if (str == null) {
                Map<String, C87224b> map = f197494e;
                if (map == null || map.size() == 0 || (set = this.f197509j) == null || set.size() == 0) {
                    dVar.mo141047a(str);
                    return;
                }
                this.f197510k = 0;
                if (this.f197515p == 1) {
                    this.f197504c.lock();
                    f197495g.clear();
                    this.f197504c.unlock();
                }
                f197493B.clear();
                for (String str3 : this.f197509j) {
                    C87224b bVar = f197494e.get(str3);
                    if (this.f197513n == 1 && this.f197515p != 1 && bVar != null && bVar.f197546b == 1) {
                        if (this.f197516q != 2) {
                            String substring = str3.substring(0, 4);
                            if (this.f197516q == 1) {
                                str2 = "pull";
                            } else {
                                str2 = "push";
                            }
                            if (!TextUtils.equals(substring, str2)) {
                            }
                        }
                        f197493B.add(bVar.f197545a);
                    }
                }
                for (C87224b bVar2 : f197494e.values()) {
                    m151243a(bVar2, dVar, str);
                }
                return;
            }
            m151243a(f197494e.get(str), dVar, str);
        }
    }

    /* renamed from: a */
    private void m151243a(final C87224b bVar, final AbstractC87222d dVar, final String str) {
        MethodCollector.m26663i(9940);
        if (!this.f197507h) {
            MethodCollector.m26664o(9940);
            return;
        }
        final C87225c cVar = new C87225c(bVar.f197545a);
        synchronized (this.f197506f) {
            try {
                this.f197506f.add(cVar);
            } catch (Throwable th) {
                MethodCollector.m26664o(9940);
                throw th;
            }
        }
        final Future<?> submit = this.f197524y.submit(new Runnable() {
            /* class com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.RunnableC872172 */

            static {
                Covode.recordClassIndex(103020);
            }

            public final void run() {
                boolean z;
                boolean z2;
                MethodCollector.m26663i(10020);
                synchronized (C87215a.this.f197506f) {
                    try {
                        z = false;
                        if (!C87215a.this.f197506f.contains(cVar)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } finally {
                        MethodCollector.m26664o(10020);
                    }
                }
                if (z2) {
                    MethodCollector.m26664o(10020);
                    return;
                }
                if (str != null) {
                    bVar.mo141095b();
                    if (!bVar.mo141095b().isEmpty()) {
                        synchronized (C87215a.this.f197506f) {
                            try {
                                C87215a.this.f197506f.remove(cVar);
                            } finally {
                                MethodCollector.m26664o(10020);
                            }
                        }
                        return;
                    }
                }
                List<String> a = cVar.mo141099a();
                if (C87215a.this.f197514o == 1 && !C87215a.this.f197521v && a != null && !a.isEmpty() && C87215a.this.f197522w != null) {
                    Iterator<String> it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (!TextUtils.isEmpty(next) && next.contains(":")) {
                            C87215a aVar = C87215a.this;
                            aVar.f197523x = aVar.f197522w.mo141050a(next);
                            C87215a.this.f197521v = true;
                            break;
                        }
                    }
                }
                bVar.mo141098c(a);
                synchronized (C87215a.this.f197506f) {
                    try {
                        if (!C87215a.this.f197506f.remove(cVar)) {
                            z = true;
                        }
                    } finally {
                        MethodCollector.m26664o(10020);
                    }
                }
                if (z) {
                    MethodCollector.m26664o(10020);
                    return;
                }
                if (str == null) {
                    C87215a.this.f197510k++;
                }
                if (C87215a.this.f197510k == C87215a.this.f197509j.size() || str != null) {
                    C87215a.this.f197508i = true;
                    dVar.mo141047a(str);
                }
            }
        });
        this.f197525z.submit(new Runnable() {
            /* class com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.RunnableC872183 */

            static {
                Covode.recordClassIndex(103021);
            }

            public final void run() {
                try {
                    submit.get(C87215a.this.f197517r, TimeUnit.MILLISECONDS);
                } catch (Exception e) {
                    submit.cancel(true);
                    C87215a.this.f197508i = true;
                    if (C87215a.this.f197513n == 1 && C87215a.this.f197515p == 1) {
                        C87215a.this.f197504c.lock();
                        C87215a.f197495g.add(cVar.f197555a);
                        C87215a.this.f197504c.unlock();
                    }
                    dVar.mo141047a(str);
                    e.printStackTrace();
                }
            }
        });
        MethodCollector.m26664o(9940);
    }
}
