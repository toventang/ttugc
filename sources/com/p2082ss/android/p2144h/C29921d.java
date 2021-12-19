package com.p2082ss.android.p2144h;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.statisticlogger.p1278b.C18214a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.p2144h.p2145a.AbstractC29918c;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.h.d */
public final class C29921d {

    /* renamed from: d */
    public static HashMap<String, Boolean> f71397d = new HashMap<>();

    /* renamed from: a */
    public Map<String, AbstractC29918c> f71398a;

    /* renamed from: b */
    public AtomicBoolean f71399b;

    /* renamed from: c */
    public AtomicBoolean f71400c;

    /* renamed from: e */
    public final Queue<C29920c> f71401e;

    /* renamed from: f */
    public Application f71402f;

    /* renamed from: g */
    public C29913a f71403g;

    /* renamed from: h */
    private final Queue<C29920c> f71404h;

    /* renamed from: com.ss.android.h.d$a */
    public static class C29923a {

        /* renamed from: a */
        public static final C29921d f71406a = new C29921d((byte) 0);

        static {
            Covode.recordClassIndex(36334);
        }
    }

    static {
        Covode.recordClassIndex(36332);
    }

    private C29921d() {
        this.f71398a = new ConcurrentHashMap();
        this.f71399b = new AtomicBoolean(false);
        this.f71400c = new AtomicBoolean(false);
        this.f71404h = new LinkedList();
        this.f71401e = new LinkedList();
    }

    /* renamed from: a */
    public final void mo52228a() {
        LinkedList linkedList;
        MethodCollector.m26663i(1177);
        if (!this.f71399b.get()) {
            MethodCollector.m26664o(1177);
            return;
        }
        synchronized (this.f71404h) {
            try {
                linkedList = new LinkedList(this.f71404h);
                this.f71404h.clear();
            } finally {
                MethodCollector.m26664o(1177);
            }
        }
        long j = 0;
        while (!linkedList.isEmpty()) {
            j += 100;
            C29920c cVar = (C29920c) linkedList.poll();
            if (C18214a.m33892c()) {
                C58254p.f132679a.postDelayed(new RunnableC29925f(this, cVar), j);
            } else {
                mo52231a(cVar);
            }
        }
    }

    /* synthetic */ C29921d(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo52229a(Context context) {
        if (this.f71399b.get()) {
            AppLog.onResume(context);
        }
    }

    /* renamed from: a */
    public final void mo52230a(C29913a aVar) {
        this.f71403g = aVar;
        Iterator<AbstractC29918c> it = this.f71398a.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo52231a(C29920c cVar) {
        MethodCollector.m26663i(1428);
        if (f71397d.get(cVar.f71394a) != null) {
            synchronized (this.f71401e) {
                try {
                    if (!this.f71400c.get()) {
                        this.f71401e.offer(cVar);
                        if (this.f71401e.size() > 50) {
                            this.f71401e.poll();
                        }
                        return;
                    }
                } finally {
                    MethodCollector.m26664o(1428);
                }
            }
        } else {
            synchronized (this.f71404h) {
                try {
                    if (!this.f71399b.get()) {
                        this.f71404h.offer(cVar);
                        if (this.f71404h.size() > 50) {
                            this.f71404h.poll();
                        }
                        return;
                    }
                } finally {
                    MethodCollector.m26664o(1428);
                }
            }
        }
        for (AbstractC29918c cVar2 : this.f71398a.values()) {
            cVar2.mo52226b(cVar);
        }
        MethodCollector.m26664o(1428);
    }

    /* renamed from: a */
    public final void mo52234a(String str, Map<String, String> map, int i) {
        Set<Map.Entry<String, String>> entrySet;
        HashMap hashMap = new HashMap();
        if (!(map == null || (entrySet = map.entrySet()) == null)) {
            for (Map.Entry<String, String> entry : entrySet) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        mo52231a(new C29920c(str, hashMap, i));
    }

    /* renamed from: a */
    public final void mo52232a(String str, String str2, String str3, int i) {
        mo52233a(str, str2, str3, null, null, null, i);
    }

    /* renamed from: a */
    public final void mo52233a(String str, String str2, String str3, Long l, Long l2, JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(C29919b.f71389q, str);
        }
        if (str3 != null) {
            hashMap.put(C29919b.f71386n, str3);
        }
        if (l != null) {
            hashMap.put(C29919b.f71390r, l);
        }
        if (l2 != null) {
            hashMap.put(C29919b.f71391s, l2);
        }
        if (jSONObject != null) {
            hashMap.put(C29919b.f71392t, jSONObject);
        }
        mo52231a(new C29920c(str2, hashMap, i));
    }
}
