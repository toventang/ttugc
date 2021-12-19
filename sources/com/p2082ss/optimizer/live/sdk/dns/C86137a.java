package com.p2082ss.optimizer.live.sdk.dns;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.optimizer.live.sdk.dns.p4403b.C86152a;
import com.p2082ss.optimizer.live.sdk.dns.p4403b.C86153b;
import com.p2082ss.optimizer.live.sdk.p4400a.C86129d;
import com.p2082ss.optimizer.live.sdk.p4400a.C86130e;
import com.p2082ss.optimizer.live.sdk.p4400a.p4401a.C86124a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.ss.optimizer.live.sdk.dns.a */
public class C86137a implements AbstractC86157e {

    /* renamed from: e */
    static final Map<String, C86160h> f192082e = new C0484a();

    /* renamed from: a */
    public AbstractC86156d f192083a;

    /* renamed from: b */
    public final Handler f192084b = new Handler(Looper.getMainLooper()) {
        /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.HandlerC861381 */

        static {
            Covode.recordClassIndex(101280);
        }

        public final void handleMessage(Message message) {
            if (message != null && message.what == 1024) {
                if (C86137a.this.f192094m) {
                    C86137a.this.mo136421b();
                } else {
                    C86129d.m147927a().f192061c.mo136404a();
                }
            }
        }
    };

    /* renamed from: c */
    public final Context f192085c;

    /* renamed from: d */
    public final BroadcastReceiver f192086d = new BroadcastReceiver() {
        /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.C861392 */

        static {
            Covode.recordClassIndex(101281);
        }

        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            if (!C86137a.m147935a(context)) {
                C86137a.this.f192084b.removeMessages(1024);
                C86137a.this.mo136416a();
                return;
            }
            C86137a.this.f192084b.removeMessages(1024);
            C86137a.this.mo136416a();
            C86137a.this.mo136421b();
        }
    };

    /* renamed from: f */
    public final List<Callable<?>> f192087f = new LinkedList();

    /* renamed from: g */
    public final List<String> f192088g = new ArrayList();

    /* renamed from: h */
    public boolean f192089h = false;

    /* renamed from: i */
    public Set<String> f192090i;

    /* renamed from: j */
    public long f192091j = 300000;

    /* renamed from: k */
    boolean f192092k = true;

    /* renamed from: l */
    public boolean f192093l = false;

    /* renamed from: m */
    public boolean f192094m = true;

    /* renamed from: n */
    public int f192095n = 0;

    /* renamed from: o */
    private final ThreadPoolExecutor f192096o;

    /* renamed from: p */
    private final Map<String, C86160h> f192097p = new C0484a();

    /* renamed from: q */
    private boolean f192098q = false;

    /* renamed from: r */
    private int f192099r = -1;

    /* renamed from: s */
    private C86130e.AbstractC86134a f192100s = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.optimizer.live.sdk.dns.a$a */
    public interface AbstractC86148a<T> {
        static {
            Covode.recordClassIndex(101290);
        }

        /* renamed from: a */
        void mo136427a(T t);
    }

    @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
    /* renamed from: d */
    public final int mo136424d() {
        return this.f192099r;
    }

    /* renamed from: a */
    public final void mo136416a() {
        Set<String> set = this.f192090i;
        if (set == null || set.size() == 0) {
            f192082e.clear();
            return;
        }
        for (String str : this.f192090i) {
            C86160h hVar = f192082e.get(str);
            if (hVar != null) {
                hVar.mo136441b(null);
                hVar.mo136439a((C86164k) null);
            }
        }
    }

    @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
    /* renamed from: a */
    public final void mo136418a(String str, int i, int i2) {
        C86153b a = C86153b.m147958a();
        C86152a aVar = new C86152a();
        aVar.f192122a = str;
        aVar.f192123b = i;
        aVar.f192124c = i2;
        aVar.f192125d = System.currentTimeMillis();
        a.f192132f = str;
        a.f192133g.put(str, aVar);
    }

    /* renamed from: a */
    public final <T> void mo136419a(final Callable<T> callable, final AbstractC86148a<T> aVar) {
        MethodCollector.m26663i(3474);
        if (!this.f192089h) {
            MethodCollector.m26664o(3474);
            return;
        }
        synchronized (this.f192087f) {
            try {
                this.f192087f.add(callable);
            } catch (Throwable th) {
                MethodCollector.m26664o(3474);
                throw th;
            }
        }
        this.f192096o.submit(new Runnable() {
            /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.RunnableC861468 */

            static {
                Covode.recordClassIndex(101288);
            }

            public final void run() {
                boolean z;
                MethodCollector.m26663i(2946);
                synchronized (C86137a.this.f192087f) {
                    try {
                        if (!C86137a.this.f192087f.contains(callable)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(2946);
                        throw th;
                    }
                }
                if (z) {
                    MethodCollector.m26664o(2946);
                    return;
                }
                final Object obj = null;
                try {
                    obj = callable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C86137a.this.f192084b.post(new Runnable() {
                    /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.RunnableC861468.RunnableC861471 */

                    static {
                        Covode.recordClassIndex(101289);
                    }

                    public final void run() {
                        boolean z;
                        MethodCollector.m26663i(804);
                        synchronized (C86137a.this.f192087f) {
                            try {
                                if (!C86137a.this.f192087f.remove(callable)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(804);
                                throw th;
                            }
                        }
                        if (z) {
                            MethodCollector.m26664o(804);
                            return;
                        }
                        aVar.mo136427a(obj);
                        MethodCollector.m26664o(804);
                    }
                });
                MethodCollector.m26664o(2946);
            }
        });
        MethodCollector.m26664o(3474);
    }

    /* renamed from: a */
    public final void mo136417a(C86124a aVar) {
        if (aVar != null) {
            HashSet hashSet = new HashSet();
            if (aVar.f192034a == 0 && aVar.f192035b != null && aVar.f192035b.length() > 0) {
                Iterator<String> keys = aVar.f192035b.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && !next.equals("")) {
                        hashSet.add(next);
                    }
                }
            }
            this.f192090i = hashSet;
            long j = 300000;
            if (((long) (aVar.f192037d * 1000)) >= 300000) {
                j = (long) (aVar.f192037d * 1000);
            }
            this.f192091j = j;
            this.f192092k = aVar.f192038e;
            this.f192094m = aVar.f192039f;
            Set<String> set = this.f192090i;
            if (set == null || set.size() == 0) {
                f192082e.clear();
                return;
            }
            for (String str : this.f192090i) {
                Map<String, C86160h> map = f192082e;
                C86160h hVar = map.get(str);
                if (hVar == null) {
                    hVar = new C86160h(str);
                }
                List<String> a = aVar.mo136401a(str);
                hVar.mo136439a(new C86164k(str, a));
                hVar.f192147f = aVar.f192036c;
                map.put(str, hVar);
                if (this.f192098q && a != null && !a.isEmpty()) {
                    mo136419a(new CallableC86166m(a, this.f192088g), new AbstractC86148a<List<String>>() {
                        /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.C861446 */

                        static {
                            Covode.recordClassIndex(101286);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.optimizer.live.sdk.dns.C86137a.AbstractC86148a
                        /* renamed from: a */
                        public final /* synthetic */ void mo136427a(List<String> list) {
                            C86137a.this.f192088g.addAll(list);
                        }
                    });
                }
            }
        }
    }

    @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
    /* renamed from: c */
    public final boolean mo136423c() {
        if (!this.f192089h) {
            return false;
        }
        return this.f192092k;
    }

    static {
        Covode.recordClassIndex(101279);
        C86159g.f192141a = false;
    }

    /* renamed from: com.ss.optimizer.live.sdk.dns.a$b */
    static class ThreadFactoryC86149b implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f192116a;

        /* renamed from: b */
        private final AtomicInteger f192117b;

        /* renamed from: c */
        private final String f192118c;

        static {
            Covode.recordClassIndex(101291);
        }

        private ThreadFactoryC86149b() {
            ThreadGroup threadGroup;
            this.f192117b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f192116a = threadGroup;
            this.f192118c = "dns-optimizer-";
        }

        /* synthetic */ ThreadFactoryC86149b(byte b) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(2938);
            Thread thread = new Thread(this.f192116a, runnable, this.f192118c + this.f192117b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.m26664o(2938);
            return thread;
        }
    }

    /* renamed from: b */
    public final void mo136421b() {
        Map<String, C86160h> map;
        if (this.f192094m && (map = f192082e) != null) {
            if (map.size() == 0) {
                mo136419a(new CallableC86155c(), new AbstractC86148a<C86124a>() {
                    /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.C861414 */

                    static {
                        Covode.recordClassIndex(101283);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.p2082ss.optimizer.live.sdk.dns.C86137a.AbstractC86148a
                    /* renamed from: a */
                    public final /* synthetic */ void mo136427a(C86124a aVar) {
                        C86137a.this.mo136417a(aVar);
                        C86137a.this.f192084b.removeMessages(1024);
                        C86137a.this.f192084b.sendEmptyMessageDelayed(1024, C86137a.this.f192091j);
                    }
                });
                return;
            }
            this.f192095n = 0;
            for (final C86160h hVar : map.values()) {
                mo136419a(new C86158f(hVar.f192142a), new AbstractC86148a<C86164k>() {
                    /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.C861425 */

                    static {
                        Covode.recordClassIndex(101284);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.p2082ss.optimizer.live.sdk.dns.C86137a.AbstractC86148a
                    /* renamed from: a */
                    public final /* synthetic */ void mo136427a(C86164k kVar) {
                        C86164k kVar2 = kVar;
                        if (kVar2 == null) {
                            kVar2 = new C86164k(hVar.f192142a, null);
                        }
                        hVar.mo136441b(kVar2);
                        C86137a.this.f192095n++;
                        if (C86137a.this.f192095n == C86137a.this.f192090i.size()) {
                            C86137a.this.mo136419a(new CallableC86155c(), new AbstractC86148a<C86124a>() {
                                /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.C861425.C861431 */

                                static {
                                    Covode.recordClassIndex(101285);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.p2082ss.optimizer.live.sdk.dns.C86137a.AbstractC86148a
                                /* renamed from: a */
                                public final /* synthetic */ void mo136427a(C86124a aVar) {
                                    C86137a.this.mo136417a(aVar);
                                    C86137a.this.f192084b.removeMessages(1024);
                                    C86137a.this.f192084b.sendEmptyMessageDelayed(1024, C86137a.this.f192091j);
                                }
                            });
                        }
                        if (C86137a.this.f192093l) {
                            C86137a aVar = C86137a.this;
                            C86160h hVar = hVar;
                            List<String> unmodifiableList = Collections.unmodifiableList(hVar.f192144c);
                            if (!unmodifiableList.isEmpty()) {
                                for (String str : unmodifiableList) {
                                    aVar.mo136419a(new CallableC86163j(str), new AbstractC86148a<C86162i>(hVar) {
                                        /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.C861457 */

                                        /* renamed from: a */
                                        final /* synthetic */ C86160h f192109a;

                                        static {
                                            Covode.recordClassIndex(101287);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // com.p2082ss.optimizer.live.sdk.dns.C86137a.AbstractC86148a
                                        /* renamed from: a */
                                        public final /* synthetic */ void mo136427a(C86162i iVar) {
                                            C86162i iVar2 = iVar;
                                            C86160h hVar = this.f192109a;
                                            hVar.f192145d.put(iVar2.f192152a, iVar2);
                                            if (hVar.f192145d.size() == hVar.f192144c.size()) {
                                                ArrayList arrayList = new ArrayList(hVar.f192144c);
                                                Collections.sort(arrayList, 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: INVOKE  
                                                      (r2v0 'arrayList' java.util.ArrayList)
                                                      (wrap: com.ss.optimizer.live.sdk.dns.h$1 : 0x0023: CONSTRUCTOR  (r0v5 com.ss.optimizer.live.sdk.dns.h$1) = (r4v0 'hVar' com.ss.optimizer.live.sdk.dns.h) call: com.ss.optimizer.live.sdk.dns.h.1.<init>(com.ss.optimizer.live.sdk.dns.h):void type: CONSTRUCTOR)
                                                     type: STATIC call: java.util.Collections.sort(java.util.List, java.util.Comparator):void in method: com.ss.optimizer.live.sdk.dns.a.7.a(com.ss.optimizer.live.sdk.dns.i):void, file: classes2.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r0v5 com.ss.optimizer.live.sdk.dns.h$1) = (r4v0 'hVar' com.ss.optimizer.live.sdk.dns.h) call: com.ss.optimizer.live.sdk.dns.h.1.<init>(com.ss.optimizer.live.sdk.dns.h):void type: CONSTRUCTOR in method: com.ss.optimizer.live.sdk.dns.a.7.a(com.ss.optimizer.live.sdk.dns.i):void, file: classes2.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                    	... 19 more
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.optimizer.live.sdk.dns.h, state: GENERATED_AND_UNLOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                    	... 25 more
                                                    */
                                                /*
                                                    this = this;
                                                    com.ss.optimizer.live.sdk.dns.i r6 = (com.p2082ss.optimizer.live.sdk.dns.C86162i) r6
                                                    com.ss.optimizer.live.sdk.dns.h r4 = r5.f192109a
                                                    java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.i> r1 = r4.f192145d
                                                    java.lang.String r0 = r6.f192152a
                                                    r1.put(r0, r6)
                                                    java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.i> r0 = r4.f192145d
                                                    int r1 = r0.size()
                                                    java.util.List<java.lang.String> r0 = r4.f192144c
                                                    int r0 = r0.size()
                                                    r3 = 0
                                                    if (r1 != r0) goto L_0x0044
                                                    java.util.ArrayList r2 = new java.util.ArrayList
                                                    java.util.List<java.lang.String> r0 = r4.f192144c
                                                    r2.<init>(r0)
                                                    com.ss.optimizer.live.sdk.dns.h$1 r0 = new com.ss.optimizer.live.sdk.dns.h$1
                                                    r0.<init>()
                                                    java.util.Collections.sort(r2, r0)
                                                    java.util.List<java.lang.String> r0 = r4.f192146e
                                                    r0.clear()
                                                    int r1 = r2.size()
                                                    r0 = 3
                                                    if (r1 > r0) goto L_0x003b
                                                    java.util.List<java.lang.String> r0 = r4.f192146e
                                                    r0.addAll(r2)
                                                    return
                                                L_0x003b:
                                                    java.util.List<java.lang.String> r1 = r4.f192146e
                                                    java.util.List r0 = r2.subList(r3, r0)
                                                    r1.addAll(r0)
                                                L_0x0044:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.optimizer.live.sdk.dns.C86137a.C861457.mo136427a(java.lang.Object):void");
                                            }

                                            {
                                                this.f192109a = r2;
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        private static NetworkInfo m147933a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                return C61338a.m111034a();
            }
        }

        /* renamed from: a */
        public static boolean m147935a(Context context) {
            NetworkInfo a;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) m147934a(context, "connectivity");
                if (connectivityManager == null || (a = m147933a(connectivityManager)) == null || !a.isConnected()) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }

        @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
        /* renamed from: b */
        public final List<String> mo136420b(String str) {
            if (!this.f192089h) {
                return null;
            }
            C86160h hVar = f192082e.get(str);
            if (hVar != null) {
                return hVar.mo136440b();
            }
            C86160h hVar2 = this.f192097p.get(str);
            if (hVar2 != null) {
                return hVar2.mo136440b();
            }
            return null;
        }

        @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
        /* renamed from: c */
        public final List<String> mo136422c(String str) {
            if (!this.f192089h) {
                return null;
            }
            C86160h hVar = f192082e.get(str);
            if (hVar != null) {
                return hVar.mo136442c();
            }
            C86160h hVar2 = this.f192097p.get(str);
            if (hVar2 != null) {
                return hVar2.mo136442c();
            }
            return null;
        }

        public C86137a(Context context) {
            MethodCollector.m26663i(3396);
            this.f192085c = context;
            this.f192100s = new C86130e.AbstractC86134a() {
                /* class com.p2082ss.optimizer.live.sdk.dns.C86137a.C861403 */

                static {
                    Covode.recordClassIndex(101282);
                }

                @Override // com.p2082ss.optimizer.live.sdk.p4400a.C86130e.AbstractC86134a
                /* renamed from: a */
                public final void mo136408a(C86124a aVar) {
                    C86137a aVar2 = C86137a.this;
                    if (aVar != null && aVar2.f192089h) {
                        aVar2.mo136417a(aVar);
                        if (aVar2.f192092k) {
                            aVar2.mo136421b();
                        }
                    }
                }
            };
            C86130e eVar = C86129d.m147927a().f192061c;
            eVar.f192065a.add(this.f192100s);
            ThreadPoolExecutor threadPoolExecutor = C86129d.m147927a().f192062d;
            if (threadPoolExecutor == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC86149b((byte) 0));
                this.f192096o = threadPoolExecutor2;
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
            } else {
                this.f192096o = threadPoolExecutor;
            }
            boolean z = C86129d.m147927a().f192063e;
            this.f192098q = z;
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38964a("vctfo", false, (Context) null);
                C58032m.m104852a(uptimeMillis, "vctfo");
            }
            MethodCollector.m26664o(3396);
        }

        @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
        /* renamed from: a */
        public final String mo136414a(String str) {
            C86160h hVar;
            String str2 = null;
            if (this.f192089h && this.f192092k) {
                C86160h hVar2 = f192082e.get(str);
                if ((hVar2 == null || (str2 = hVar2.mo136437a()) == null) && (hVar = this.f192097p.get(str)) != null) {
                    str2 = hVar.mo136437a();
                }
                if (this.f192098q) {
                    if (this.f192088g.isEmpty() || TextUtils.isEmpty(str2) || !this.f192088g.contains(str2)) {
                        this.f192099r = 0;
                    } else {
                        this.f192099r = 1;
                    }
                }
            }
            return str2;
        }

        /* renamed from: a */
        private static Object m147934a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(3432);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
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
                        MethodCollector.m26664o(3432);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
        /* renamed from: a */
        public final <T> T mo136412a(String str, T t) {
            if (this.f192083a == null) {
                return t;
            }
            str.hashCode();
            return !str.equals("TTNet_NQE_INFO") ? t : (T) this.f192083a.mo16644a(str, t);
        }

        @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
        /* renamed from: a */
        public final String mo136415a(String str, String str2) {
            if (!this.f192089h) {
                return null;
            }
            C86160h hVar = f192082e.get(str);
            if (hVar != null) {
                return hVar.mo136438a(str2);
            }
            C86160h hVar2 = this.f192097p.get(str);
            if (hVar2 != null) {
                return hVar2.mo136438a(str2);
            }
            return null;
        }

        /* renamed from: b */
        private static Intent m147936b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent m147932a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m147936b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.optimizer.live.sdk.dns.C86137a.m147932a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }

        @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e
        /* renamed from: a */
        public final <T> T mo136413a(String str, T t, int i, int i2) {
            C86153b a = C86153b.m147958a();
            str.hashCode();
            return !str.equals("net_effective_connection_type_strategy") ? (str.equals("live_start_play_buffer_thres") && t.getClass() == Long.class) ? (T) Long.valueOf(a.mo136432a(t.longValue(), i, i2)) : t : t.getClass() == JSONObject.class ? (T) a.mo136433a(t) : t;
        }
    }
