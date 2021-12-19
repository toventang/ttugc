package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14668a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14754d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.d */
public class C14681d {

    /* renamed from: k */
    private static final String f35630k = C14681d.class.getSimpleName();

    /* renamed from: a */
    C14754d<String, C14668a> f35631a = new C14754d<>(100);

    /* renamed from: b */
    ConcurrentMap<String, C14668a> f35632b = new ConcurrentHashMap();

    /* renamed from: c */
    ConcurrentMap<String, Future<Void>> f35633c = new ConcurrentHashMap();

    /* renamed from: d */
    ConcurrentMap<String, Future<Void>> f35634d = new ConcurrentHashMap();

    /* renamed from: e */
    ConcurrentMap<String, ConcurrentSkipListSet<C14680c>> f35635e = new ConcurrentHashMap();

    /* renamed from: f */
    ConcurrentMap<String, ConcurrentSkipListSet<C14680c>> f35636f = new ConcurrentHashMap();

    /* renamed from: g */
    ConcurrentSkipListSet<String> f35637g = new ConcurrentSkipListSet<>();

    /* renamed from: h */
    public AtomicInteger f35638h = new AtomicInteger(0);

    /* renamed from: i */
    public AtomicInteger f35639i = new AtomicInteger(0);

    /* renamed from: j */
    final Handler f35640j;

    /* renamed from: l */
    private C13624l.EnumC13625a f35641l = C13624l.EnumC13625a.NONE;

    /* renamed from: m */
    private final long f35642m = 180000;

    /* renamed from: n */
    private final int f35643n = 10;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23666a() {
        this.f35638h.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23672b() {
        this.f35639i.set(0);
    }

    static {
        Covode.recordClassIndex(16778);
    }

    /* renamed from: d */
    public final boolean mo23676d(String str) {
        return this.f35633c.containsKey(str);
    }

    /* renamed from: e */
    public final void mo23677e(String str) {
        this.f35633c.remove(str);
    }

    /* renamed from: g */
    public final boolean mo23679g(String str) {
        return this.f35634d.containsKey(str);
    }

    /* renamed from: b */
    public final C14668a mo23671b(String str) {
        C14668a a;
        MethodCollector.m26663i(8563);
        synchronized (this.f35631a.mo23774c()) {
            try {
                a = this.f35631a.mo23769a(str);
            } finally {
                MethodCollector.m26664o(8563);
            }
        }
        return a;
    }

    /* renamed from: c */
    public final C14668a mo23674c(String str) {
        if (this.f35632b.containsKey(str)) {
            return this.f35632b.get(str);
        }
        return null;
    }

    /* renamed from: f */
    public final Future<Void> mo23678f(String str) {
        if (this.f35633c.containsKey(str)) {
            return this.f35633c.get(str);
        }
        return null;
    }

    /* renamed from: h */
    public final Future<Void> mo23680h(String str) {
        if (this.f35634d.containsKey(str)) {
            return this.f35634d.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo23668a(String str) {
        MethodCollector.m26663i(8414);
        C14668a b = mo23671b(str);
        if (b != null) {
            if (C14682e.m26869a().f35650b.get()) {
                b.mo23649a();
            } else {
                b.mo23651b();
            }
            synchronized (this.f35631a.mo23774c()) {
                try {
                    this.f35631a.mo23773b(str);
                } finally {
                    MethodCollector.m26664o(8414);
                }
            }
            return;
        }
        MethodCollector.m26664o(8414);
    }

    /* renamed from: b */
    public final void mo23673b(C14680c cVar) {
        String host = cVar.getHost();
        if (this.f35635e.containsKey(host)) {
            this.f35635e.get(host).remove(cVar);
            if (this.f35635e.get(host).isEmpty()) {
                this.f35635e.remove(host);
            }
        }
    }

    /* renamed from: c */
    public final void mo23675c(C14680c cVar) {
        String host = cVar.getHost();
        if (this.f35636f.containsKey(host)) {
            this.f35636f.get(host).remove(cVar);
            if (this.f35636f.get(host).isEmpty()) {
                this.f35636f.remove(host);
            }
        }
    }

    public C14681d(Handler handler) {
        this.f35640j = handler;
    }

    /* renamed from: a */
    public final void mo23667a(Context context) {
        MethodCollector.m26663i(8266);
        if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132251c = C13624l.m24488d(context);
        }
        C13624l.EnumC13625a aVar = C58029j.f132251c;
        if (aVar != this.f35641l) {
            synchronized (this.f35631a.mo23774c()) {
                try {
                    for (Map.Entry<String, C14668a> entry : this.f35631a.mo23774c().entrySet()) {
                        if (entry != null) {
                            if (C14682e.m26869a().f35650b.get()) {
                                entry.getValue().mo23649a();
                            } else {
                                entry.getValue().mo23651b();
                            }
                        }
                    }
                    this.f35631a.mo23771a();
                } catch (Throwable th) {
                    MethodCollector.m26664o(8266);
                    throw th;
                }
            }
            for (Map.Entry<String, C14668a> entry2 : this.f35632b.entrySet()) {
                if (entry2 != null) {
                    entry2.getValue().mo23652c();
                }
            }
            this.f35632b.clear();
            if (aVar != C13624l.EnumC13625a.NONE) {
                C14682e.m26869a().mo23682a(C14668a.EnumC14669a.CACHE_STALE_NETCHANGED);
                C14682e.m26869a();
                C14682e.m26876b();
            }
        }
        this.f35641l = aVar;
        MethodCollector.m26664o(8266);
    }

    /* renamed from: a */
    public final boolean mo23670a(C14680c cVar) {
        if (!this.f35635e.containsKey(cVar.getHost()) || !this.f35635e.get(cVar.getHost()).contains(cVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo23669a(String str, C14680c cVar) {
        MethodCollector.m26663i(8709);
        if (this.f35635e.containsKey(str)) {
            this.f35635e.get(str).add(cVar);
            MethodCollector.m26664o(8709);
            return;
        }
        ConcurrentSkipListSet<C14680c> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(cVar);
        this.f35635e.put(str, concurrentSkipListSet);
        MethodCollector.m26664o(8709);
    }
}
