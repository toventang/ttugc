package com.p2082ss.ugc.live.p4460a.p4461a;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87036a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87037b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.ugc.live.a.a.f */
public final class C87040f implements AbstractC87010a<String> {

    /* renamed from: a */
    public static C87040f f196230a;

    /* renamed from: b */
    public final Map<String, C87045k> f196231b;

    /* renamed from: c */
    public final C87034e f196232c;

    /* renamed from: d */
    public final List<AbstractC87013b> f196233d = new ArrayList();

    /* renamed from: e */
    public final Map<String, Pair<Boolean, Long>> f196234e = new ConcurrentHashMap();

    /* renamed from: f */
    final Handler f196235f;

    /* renamed from: g */
    int f196236g = 0;

    /* renamed from: h */
    int f196237h = 0;

    /* renamed from: i */
    private final Deque<C87020c> f196238i = new ArrayDeque();

    static {
        Covode.recordClassIndex(102806);
    }

    /* renamed from: a */
    public static C87040f m150751a() {
        C87040f fVar = f196230a;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("GiftResourceManager is not initialized");
    }

    /* renamed from: c */
    private void m150752c() {
        this.f196238i.iterator();
        while (this.f196238i.peek() != null) {
            C87020c poll = this.f196238i.poll();
            C87045k kVar = this.f196231b.get(poll.f196189a);
            if (kVar != null) {
                for (AbstractC87026d dVar : kVar.f196250b) {
                    dVar.mo16289a();
                }
                this.f196231b.remove(poll.f196189a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo140642b() {
        if (this.f196236g < this.f196232c.f196217d && !this.f196238i.isEmpty()) {
            if (this.f196232c.f196218e <= 0 || this.f196237h < this.f196232c.f196218e) {
                this.f196236g++;
                mo140644c(this.f196238i.poll());
                return;
            }
            m150752c();
            this.f196237h = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo140644c(C87020c cVar) {
        this.f196232c.f196215b.mo16298a(cVar, this.f196232c).mo16296a(cVar, this);
    }

    public C87040f(C87034e eVar) {
        this.f196232c = eVar;
        this.f196231b = new HashMap();
        this.f196235f = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final String mo140640a(C87020c cVar) {
        if (cVar == null) {
            return null;
        }
        if (mo140643b(cVar)) {
            return mo140645d(cVar);
        }
        String str = cVar.f196189a;
        if (!this.f196231b.containsKey(str)) {
            this.f196231b.put(str, new C87045k(cVar));
            cVar.mo140631b();
            mo140644c(cVar);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo140645d(C87020c cVar) {
        String a = C87037b.m150745a(this.f196232c.f196214a.mo16301a(cVar));
        if (cVar.f196194f) {
            return a;
        }
        try {
            a = a + C87036a.m150742a(cVar.f196191c[0]);
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return a;
        }
    }

    /* renamed from: e */
    private boolean m150753e(C87020c cVar) {
        if (cVar == null) {
            return false;
        }
        boolean exists = new File(C87037b.m150745a(this.f196232c.f196214a.mo16301a(cVar)) + ".fetched").exists();
        this.f196234e.put(cVar.f196189a, new Pair<>(Boolean.valueOf(exists), Long.valueOf(System.currentTimeMillis())));
        return exists;
    }

    /* renamed from: b */
    public final boolean mo140643b(C87020c cVar) {
        if (cVar == null) {
            return false;
        }
        Pair<Boolean, Long> pair = this.f196234e.get(cVar.f196189a);
        if (pair == null || this.f196232c.f196219f <= 0 || System.currentTimeMillis() - ((Long) pair.second).longValue() >= this.f196232c.f196219f) {
            return m150753e(cVar);
        }
        return ((Boolean) pair.first).booleanValue();
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63847a(C87020c cVar, int i) {
        this.f196235f.post(new RunnableC87044j(this, cVar, i));
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63848a(C87020c cVar, C87021a aVar) {
        this.f196235f.post(new RunnableC87042h(this, cVar, aVar));
    }

    /* renamed from: a */
    public final void mo140641a(C87020c cVar, AbstractC87026d dVar) {
        if (cVar != null) {
            if (!mo140643b(cVar)) {
                String str = cVar.f196189a;
                if (this.f196231b.containsKey(str)) {
                    if (cVar.f196195g) {
                        C87020c cVar2 = this.f196231b.get(str).f196249a;
                        if (cVar2 != null) {
                            this.f196238i.remove(cVar2);
                        }
                        cVar.mo140631b();
                        this.f196238i.addFirst(cVar);
                    }
                    if (dVar != null) {
                        this.f196231b.get(str).mo140650a(dVar);
                        return;
                    }
                    return;
                }
                C87045k kVar = new C87045k(cVar);
                if (dVar != null) {
                    kVar.mo140650a(dVar);
                }
                this.f196231b.put(str, kVar);
                cVar.mo140631b();
                if (cVar.f196195g) {
                    this.f196238i.addFirst(cVar);
                } else {
                    this.f196238i.add(cVar);
                }
                mo140642b();
            } else if (dVar != null) {
                dVar.mo16290a(mo140645d(cVar));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final /* synthetic */ void mo63850a(C87020c cVar, String str) {
        try {
            new File(C87037b.m150745a(this.f196232c.f196214a.mo16301a(cVar)) + ".fetched").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f196234e.put(cVar.f196189a, new Pair<>(true, Long.valueOf(System.currentTimeMillis())));
        this.f196235f.post(new RunnableC87041g(this, cVar));
    }
}
