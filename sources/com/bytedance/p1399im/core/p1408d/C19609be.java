package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.p1404a.AbstractC19502p;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.core.d.be */
public class C19609be {

    /* renamed from: a */
    public static C19609be f46598a;

    /* renamed from: b */
    public Map<String, Long> f46599b = new ConcurrentHashMap();

    /* renamed from: c */
    public Map<String, C19630e> f46600c = new ConcurrentHashMap();

    /* renamed from: d */
    public Map<String, Boolean> f46601d = new ConcurrentHashMap();

    /* renamed from: e */
    public AbstractC19502p f46602e;

    /* renamed from: f */
    private Set<Object> f46603f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private volatile boolean f46604g = false;

    static {
        Covode.recordClassIndex(22453);
    }

    private C19609be() {
    }

    /* renamed from: a */
    public static C19609be m36623a() {
        MethodCollector.m26663i(10170);
        if (f46598a == null) {
            synchronized (C19609be.class) {
                try {
                    if (f46598a == null) {
                        f46598a = new C19609be();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10170);
                    throw th;
                }
            }
        }
        C19609be beVar = f46598a;
        MethodCollector.m26664o(10170);
        return beVar;
    }

    /* renamed from: b */
    public final void mo31396b() {
        if (!this.f46603f.isEmpty()) {
            C19512f.m36457b("imsdk", "UnReadCountHelpernotify unread map update", (Throwable) null);
            Iterator<Object> it = this.f46603f.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        C19512f.m36457b("imsdk", "UnReadCountHelpershould add unread observer", (Throwable) null);
    }

    /* renamed from: c */
    public final int mo31398c() {
        int i = 0;
        for (Map.Entry<String, Long> entry : this.f46599b.entrySet()) {
            if (entry.getValue().longValue() > 0) {
                i = (int) (((long) i) + entry.getValue().longValue());
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo31393a(String str) {
        this.f46599b.remove(str);
        this.f46601d.remove(str);
        this.f46600c.remove(str);
    }

    /* renamed from: c */
    public final void mo31399c(C19638h hVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hVar);
        mo31395a((List<C19638h>) arrayList, true);
    }

    /* renamed from: a */
    public final void mo31392a(C19638h hVar) {
        this.f46599b.remove(hVar.getConversationId());
        this.f46600c.remove(hVar.getConversationId());
        this.f46601d.remove(hVar.getConversationId());
        mo31396b();
    }

    /* renamed from: b */
    public final void mo31397b(C19638h hVar) {
        this.f46599b.remove(hVar.getConversationId());
        this.f46600c.remove(hVar.getConversationId());
        this.f46601d.remove(hVar.getConversationId());
        mo31396b();
    }

    /* renamed from: a */
    public final void mo31394a(List<C19638h> list) {
        mo31395a(list, false);
        if (!this.f46604g && C19483d.m36365a().mo31141b().f46211T && !C19483d.m36365a().f46157b.mo27973n()) {
            this.f46604g = true;
            C19930x.m37536a();
            C19930x.m37539a((long) mo31398c());
        }
    }

    /* renamed from: a */
    public static long m36622a(C19638h hVar, AbstractC19502p pVar) {
        long unreadCount;
        String concat;
        if (hVar == null) {
            C19512f.m36450a("imsdk", "UnReadCountHelpercalculateUnreadCount, conversation is null", (Throwable) null);
            return 0;
        }
        if (pVar != null) {
            unreadCount = pVar.mo31155a();
        } else if (hVar.isMute()) {
            return 0;
        } else {
            unreadCount = hVar.getUnreadCount();
        }
        if (unreadCount <= 0) {
            return unreadCount;
        }
        StringBuilder sb = new StringBuilder("UnReadCountHelpercalculateUnreadCount by ");
        if (pVar == null) {
            concat = "default";
        } else {
            concat = "calculator:".concat(String.valueOf(pVar));
        }
        C19512f.m36450a("imsdk", sb.append(concat).append(", cid:").append(hVar.getConversationId()).append(", unreadCount:").append(unreadCount).toString(), (Throwable) null);
        return unreadCount;
    }

    /* renamed from: a */
    public final void mo31395a(List<C19638h> list, boolean z) {
        C19630e b;
        if (list == null || list.isEmpty()) {
            C19512f.m36457b("imsdk", "UnReadCountHelperconversationList is empty", (Throwable) null);
            return;
        }
        for (C19638h hVar : list) {
            if (hVar != null) {
                m36623a();
                long a = m36622a(hVar, this.f46602e);
                AbstractC19502p pVar = this.f46602e;
                if (!(pVar == null || (b = pVar.mo31156b()) == null)) {
                    this.f46600c.put(hVar.getConversationId(), b);
                }
                if (a > 0) {
                    this.f46599b.put(hVar.getConversationId(), Long.valueOf(a));
                } else {
                    this.f46599b.remove(hVar.getConversationId());
                }
                AbstractC19502p pVar2 = this.f46602e;
                if (pVar2 != null) {
                    boolean c = pVar2.mo31157c();
                    C19512f.m36450a("imsdk", "UnReadCountHelpernotify, conversationID:" + hVar.getConversationId() + ", shouldNotify:" + c, (Throwable) null);
                    this.f46601d.put(hVar.getConversationId(), Boolean.valueOf(c));
                }
            }
        }
        if (z) {
            mo31396b();
        }
    }
}
