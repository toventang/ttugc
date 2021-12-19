package com.bytedance.p1399im.core.p1406b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.AbstractC19502p;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19609be;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.core.b.b */
public class C19505b {

    /* renamed from: f */
    private static volatile C19505b f46297f;

    /* renamed from: a */
    public Set<Object> f46298a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public Set<Object> f46299b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public Map<String, C19638h> f46300c = new ConcurrentHashMap();

    /* renamed from: d */
    public long f46301d;

    /* renamed from: e */
    public C19504a f46302e = null;

    /* renamed from: g */
    private AbstractC19502p f46303g;

    static {
        Covode.recordClassIndex(22349);
    }

    /* renamed from: b */
    public static boolean m36410b() {
        return C19483d.m36365a().mo31141b().f46219aA;
    }

    /* renamed from: e */
    public final int mo31163e() {
        if (m36410b()) {
            return this.f46300c.size();
        }
        return 0;
    }

    private C19505b() {
    }

    /* renamed from: f */
    private boolean m36412f() {
        C19512f.m36457b("imsdk", "ConversationBoxManager shouldDisplay", (Throwable) null);
        C19638h h = m36414h();
        if (!(h == null || h.getLastMessage() == null)) {
            long max = Math.max(this.f46301d, h.getLastMessage().getCreatedAt());
            C20041s.m37876a();
            if (max > C20041s.m37903j()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private C19504a m36413g() {
        if (!m36410b() || this.f46300c.size() <= 0 || !m36412f()) {
            return null;
        }
        C19512f.m36457b("imsdk", "ConversationBoxManager getConversationBox", (Throwable) null);
        return new C19504a(m36408a(new ArrayList(this.f46300c.values())), m36414h());
    }

    /* renamed from: c */
    public final void mo31161c() {
        if (m36410b()) {
            C19512f.m36457b("imsdk", "ConversationBoxManager refreshConversationBox", (Throwable) null);
            this.f46302e = m36413g();
            Iterator<Object> it = this.f46298a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator<Object> it2 = this.f46299b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            C19609be.m36623a().mo31396b();
        }
    }

    /* renamed from: a */
    public static C19505b m36409a() {
        MethodCollector.m26663i(10064);
        if (f46297f == null) {
            synchronized (C19505b.class) {
                try {
                    if (f46297f == null) {
                        f46297f = new C19505b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10064);
                    throw th;
                }
            }
        }
        C19505b bVar = f46297f;
        MethodCollector.m26664o(10064);
        return bVar;
    }

    /* renamed from: d */
    public static void m36411d() {
        if (m36410b()) {
            C19512f.m36457b("imsdk", "ConversationBoxManager getAllConversationFromDB", (Throwable) null);
            List<C19638h> d = C19749c.m37023d();
            if (d.isEmpty()) {
                return;
            }
            if (d.isEmpty()) {
                C19512f.m36457b("ConversationBoxManager updateLoadedListToConversationBoxMemory", "conversationList is empty", (Throwable) null);
                return;
            }
            for (C19638h hVar : d) {
                if ("0".equals(hVar.getConversationId())) {
                    C19512f.m36457b("imsdk", "ConversationBoxManager updateLoadedListToConversationBoxMemory dirty conversation", (Throwable) null);
                    C19510e.m36436a("im_dirty_sync", hVar.getConversationId());
                } else {
                    hVar.setInBox(true);
                    m36409a().mo31160b(hVar);
                }
            }
        }
    }

    /* renamed from: h */
    private C19638h m36414h() {
        C19638h hVar = null;
        C19512f.m36457b("imsdk", "ConversationBoxManager getLatestConversation", (Throwable) null);
        long j = 0;
        for (C19638h hVar2 : new ArrayList(this.f46300c.values())) {
            if (hVar2.getLastMessage() != null && j < hVar2.getLastMessage().getCreatedAt()) {
                j = hVar2.getLastMessage().getCreatedAt();
                hVar = hVar2;
            }
        }
        return hVar;
    }

    /* renamed from: a */
    private long m36408a(List<C19638h> list) {
        if (list.isEmpty()) {
            C19512f.m36457b("ConversationBoxManager calculateTotalUnread", "conversationList is empty", (Throwable) null);
            return 0;
        }
        C19512f.m36457b("imsdk", "ConversationBoxManager calculateTotalUnread", (Throwable) null);
        long j = 0;
        for (C19638h hVar : list) {
            if (hVar != null) {
                C19609be.m36623a();
                long a = C19609be.m36622a(hVar, this.f46303g);
                if (a > 0) {
                    j += a;
                }
            }
        }
        return j;
    }

    /* renamed from: b */
    public final boolean mo31160b(C19638h hVar) {
        if (m36410b() && hVar != null) {
            if (hVar.isInBox()) {
                C19512f.m36457b("ConversationBoxManager updateMemoryConversation", "conversation is in box", (Throwable) null);
                if (!this.f46300c.containsKey(hVar.getConversationId())) {
                    C19640j.m36671a().mo31599c().remove(hVar.getConversationId());
                }
                this.f46300c.put(hVar.getConversationId(), hVar);
                return true;
            }
            C19512f.m36457b("ConversationBoxManager updateMemoryConversation", "conversation is not in box", (Throwable) null);
            this.f46300c.remove(hVar.getConversationId());
        }
        return false;
    }

    /* renamed from: c */
    public final void mo31162c(C19638h hVar) {
        if (!m36410b() || this.f46302e == null) {
            C19512f.m36457b("ConversationBoxManager deleteConversation", "delete conversation failure", (Throwable) null);
        } else if (hVar != null && this.f46300c.containsKey(hVar.getConversationId())) {
            C19512f.m36457b("imsdk", "ConversationBoxManager deleteConversation", (Throwable) null);
            this.f46300c.remove(hVar.getConversationId());
            this.f46302e.f46295a = m36408a(new ArrayList(this.f46300c.values()));
            this.f46302e.f46296b = m36414h();
            mo31161c();
        }
    }

    /* renamed from: a */
    public final C19638h mo31158a(String str) {
        if (!m36410b() || TextUtils.isEmpty(str)) {
            C19512f.m36457b("ConversationBoxManager getConversation", "disable conversationBox or conversation id is empty", (Throwable) null);
            return null;
        }
        C19638h hVar = this.f46300c.get(str);
        if (hVar == null) {
            C19512f.m36457b("imsdk", "ConversationBoxManager getConversation null ".concat(String.valueOf(str)), (Throwable) null);
        }
        return hVar;
    }

    /* renamed from: a */
    public final boolean mo31159a(C19638h hVar) {
        boolean z = false;
        if (m36410b() && hVar != null) {
            if (hVar.isInBox()) {
                C19512f.m36457b("ConversationBoxManager onUpdateConversation", "conversation is in box", (Throwable) null);
                if (!this.f46300c.containsKey(hVar.getConversationId())) {
                    C19640j.m36671a().mo31599c().remove(hVar.getConversationId());
                }
                this.f46300c.put(hVar.getConversationId(), hVar);
                z = true;
            } else {
                C19512f.m36457b("ConversationBoxManager onUpdateConversation", "conversation is not in box", (Throwable) null);
                this.f46300c.remove(hVar.getConversationId());
            }
            mo31161c();
        }
        return z;
    }
}
