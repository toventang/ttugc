package com.bytedance.p1399im.core.p1408d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19910q;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19912s;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1430c.C19946a;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20045u;
import com.bytedance.p1399im.core.internal.utils.C20046v;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19492f;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1406b.C19505b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19631f;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.proto.ConversationType;
import com.bytedance.p1399im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.bytedance.p1399im.core.proto.GetUserConversationListRequestBody;
import com.bytedance.p1399im.core.proto.ParticipantMinIndex;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.core.proto.SortType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.d.j */
public final class C19640j {

    /* renamed from: l */
    private static C19640j f46663l;

    /* renamed from: a */
    public Map<String, C19638h> f46664a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, C19638h> f46665b = new ConcurrentHashMap();

    /* renamed from: c */
    public boolean f46666c = false;

    /* renamed from: d */
    public Set<String> f46667d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public Set<AbstractC19667p> f46668e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public boolean f46669f = false;

    /* renamed from: g */
    public Set<Object> f46670g = new CopyOnWriteArraySet();

    /* renamed from: h */
    public boolean f46671h;

    /* renamed from: i */
    public long f46672i;

    /* renamed from: j */
    public long f46673j;

    /* renamed from: k */
    public long f46674k;

    static {
        Covode.recordClassIndex(22484);
    }

    /* renamed from: a */
    public final void mo31593a(boolean z) {
        if (!C19483d.m36365a().mo31141b().f46240ae || !C19483d.m36365a().f46160e) {
            m36679c(z);
        } else {
            m36677b(z);
        }
    }

    /* renamed from: a */
    public final void mo31589a(C19638h hVar) {
        if (hVar != null) {
            if (hVar.isStranger()) {
                C19730f.m36907a().mo31680b(hVar);
                return;
            } else if (C19505b.m36410b() && C19505b.m36409a().mo31160b(hVar)) {
                return;
            }
        }
        mo31595a(hVar);
        m36681e(hVar);
    }

    /* renamed from: a */
    public final void mo31590a(C19638h hVar, int i) {
        if (hVar != null) {
            C19512f.m36457b("imsdk", "ConversationListModel onUpdateConversation, cid:" + hVar.getConversationId() + ", reason:" + i + ", isStranger:" + hVar.isStranger() + ", isInBox:" + hVar.isInBox(), (Throwable) null);
            m36683f(hVar);
            if (hVar.isStranger()) {
                C19730f.m36907a().mo31677a(hVar, i);
            } else if (!C19505b.m36410b() || !C19505b.m36409a().mo31159a(hVar)) {
                mo31595a(hVar);
                C20014q.m37816a().mo31896a(hVar, i);
                for (AbstractC19667p pVar : this.f46668e) {
                    pVar.mo28002a(hVar, i);
                }
                C19609be.m36623a().mo31399c(hVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo31594a(boolean z, final int i, final C19638h... hVarArr) {
        if (hVarArr != null && hVarArr.length > 0) {
            C19512f.m36457b("imsdk", "ConversationListModel onUpdateConversation, conversations:" + hVarArr.length + ", reason:" + i, (Throwable) null);
            for (final C19638h hVar : hVarArr) {
                m36683f(hVar);
                if (hVar != null && hVar.isStranger()) {
                    C19730f.m36907a().mo31677a(hVar, i);
                } else if (!C19505b.m36410b() || hVar == null || !C19505b.m36409a().mo31159a(hVar)) {
                    if (z) {
                        m36681e(hVar);
                    }
                    if (hVar != null) {
                        final String conversationId = hVar.getConversationId();
                        final C19638h hVar2 = this.f46664a.get(conversationId);
                        if (i != 5 || hVar2 == null || hVar2.isStickTop() == hVar.isStickTop()) {
                            mo31595a(hVar);
                            C20014q.m37816a().mo31896a(hVar, i);
                            for (AbstractC19667p pVar : this.f46668e) {
                                pVar.mo28002a(hVar, i);
                            }
                            C19609be.m36623a().mo31395a(Arrays.asList(hVarArr), true);
                        } else {
                            RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
                                /* class com.bytedance.p1399im.core.p1408d.C19640j.C196526 */

                                static {
                                    Covode.recordClassIndex(22496);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                                /* renamed from: a */
                                public final /* synthetic */ C19638h mo31187a() {
                                    if (!C19483d.m36365a().mo31141b().f46196E || hVar2.getLastMessage() == null) {
                                        hVar.setUpdatedTime(System.currentTimeMillis());
                                    } else {
                                        hVar.setUpdatedTime(hVar2.getLastMessage().getCreatedAt());
                                    }
                                    C19749c.m37010a(conversationId, hVar.getUpdatedTime());
                                    C19749c.m37020c(hVar);
                                    return hVar;
                                }
                            }, new AbstractC19985b<C19638h>() {
                                /* class com.bytedance.p1399im.core.p1408d.C19640j.C196537 */

                                static {
                                    Covode.recordClassIndex(22497);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                                /* renamed from: a */
                                public final /* synthetic */ void mo31188a(C19638h hVar) {
                                    C19638h hVar2 = hVar;
                                    C19640j.this.mo31595a(hVar2);
                                    C20014q.m37816a().mo31896a(hVar2, i);
                                    for (AbstractC19667p pVar : C19640j.this.f46668e) {
                                        pVar.mo28002a(hVar2, i);
                                    }
                                    C19609be.m36623a().mo31395a(Arrays.asList(hVarArr), true);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31592a(String str, List<C19537ah> list) {
        C20014q.m37816a().mo31899a(str, list);
        for (AbstractC19667p pVar : this.f46668e) {
            pVar.mo28005a(str, list);
        }
    }

    /* renamed from: a */
    public final synchronized void mo31595a(C19638h... hVarArr) {
        MethodCollector.m26663i(9903);
        if (hVarArr != null && hVarArr.length > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            for (C19638h hVar : hVarArr) {
                if (hVar != null) {
                    String conversationId = hVar.getConversationId();
                    stringBuffer.append(conversationId).append("_");
                    if (this.f46664a.get(conversationId) != null && this.f46664a.get(conversationId).getUpdatedTime() > hVar.getUpdatedTime()) {
                        C19512f.m36457b("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId, (Throwable) null);
                    }
                    this.f46664a.put(conversationId, hVar);
                }
            }
            C19512f.m36457b("imsdk", "ConversationListModel insertOrUpdateConversation size:" + hVarArr.length + ", ids:" + ((Object) stringBuffer), (Throwable) null);
        }
        if (C19483d.m36365a().mo31141b().f46200I) {
            C20045u.m37926a().mo31918c();
        }
        MethodCollector.m26664o(9903);
    }

    /* renamed from: c */
    public final synchronized Map<String, C19638h> mo31599c() {
        Map<String, C19638h> map;
        MethodCollector.m26663i(9590);
        map = this.f46664a;
        MethodCollector.m26664o(9590);
        return map;
    }

    /* renamed from: a */
    public static C19640j m36671a() {
        MethodCollector.m26663i(9283);
        if (f46663l == null) {
            synchronized (C19640j.class) {
                try {
                    if (f46663l == null) {
                        f46663l = new C19640j();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9283);
                    throw th;
                }
            }
        }
        C19640j jVar = f46663l;
        MethodCollector.m26664o(9283);
        return jVar;
    }

    /* renamed from: f */
    private synchronized List<C19638h> m36682f() {
        ArrayList arrayList;
        MethodCollector.m26663i(9743);
        arrayList = new ArrayList();
        for (C19638h hVar : this.f46664a.values()) {
            C19483d.m36365a();
            arrayList.add(hVar);
        }
        C19512f.m36457b("imsdk", "ConversationListModel filterShowList:" + arrayList.size(), (Throwable) null);
        MethodCollector.m26664o(9743);
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized List<C19638h> mo31596b() {
        List<C19638h> f;
        MethodCollector.m26663i(9439);
        C19512f.m36457b("imsdk", "ConversationListModel getAllConversationSync", (Throwable) null);
        f = m36682f();
        if (f.size() > 0) {
            m36674a(f);
        }
        MethodCollector.m26664o(9439);
        return f;
    }

    /* renamed from: d */
    public final List<C19638h> mo31602d() {
        long uptimeMillis = SystemClock.uptimeMillis();
        C19492f b = C19483d.m36365a().mo31141b();
        if (b != null) {
            C19777i.m37192b(b.f46204M);
        }
        List<C19638h> b2 = C19749c.m37015b();
        C19505b.m36409a();
        C19505b.m36411d();
        C19609be.m36623a().mo31394a(b2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            C19510e.m36438a("im_sync_conversation_list_duration", jSONObject);
        } catch (Exception unused) {
        }
        this.f46673j = SystemClock.uptimeMillis() - uptimeMillis;
        this.f46669f = true;
        int i = C19483d.m36365a().mo31141b().f46213V;
        C19512f.m36457b("imsdk", "ConversationListModel syncConversionList, totalCount:" + Integer.valueOf(b2.size()) + ", limit:" + i, (Throwable) null);
        if (b2.isEmpty()) {
            return new ArrayList();
        }
        if (i > 0 && b2.size() > i) {
            m36674a(b2);
            b2 = b2.subList(0, i);
            this.f46669f = false;
        }
        m36676b(b2);
        return b2;
    }

    /* renamed from: e */
    public final List<C19638h> mo31604e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        C19492f b = C19483d.m36365a().mo31141b();
        if (b != null) {
            C19777i.m37192b(b.f46204M);
        }
        List<C19638h> b2 = C19749c.m37015b();
        C19505b.m36409a();
        C19505b.m36411d();
        C19609be.m36623a().mo31394a(b2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            C19510e.m36438a("im_pre_sync_conversation_list_duration", jSONObject);
        } catch (Exception unused) {
        }
        this.f46673j = SystemClock.uptimeMillis() - uptimeMillis;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        int i = C19483d.m36365a().mo31141b().f46214W;
        C19512f.m36457b("imsdk", "ConversationListModel preSyncConversionList, totalCount:" + Integer.valueOf(b2.size()) + ", limit:" + i, (Throwable) null);
        if (b2.isEmpty()) {
            this.f46669f = true;
            this.f46671h = false;
            this.f46672i = Long.MAX_VALUE;
            this.f46674k = -1;
            return new ArrayList();
        } else if (i > 0) {
            m36674a(b2);
            if (b2.size() > i) {
                b2 = b2.subList(0, i);
                this.f46669f = false;
                this.f46671h = true;
                this.f46672i = b2.get(i - 1).getSortOrder();
            } else {
                this.f46669f = true;
                this.f46671h = false;
                this.f46672i = b2.get(b2.size() - 1).getSortOrder();
            }
            m36676b(b2);
            this.f46674k = SystemClock.uptimeMillis() - uptimeMillis2;
            return b2;
        } else {
            this.f46669f = false;
            this.f46671h = true;
            this.f46672i = Long.MAX_VALUE;
            this.f46674k = -1;
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public static void m36675b(String str) {
        C19930x.m37536a();
        C19930x.m37541a(str);
    }

    /* renamed from: f */
    private void m36683f(final C19638h hVar) {
        if (hVar != null && hVar.getSortOrder() != C19749c.m37022d(hVar)) {
            RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                /* class com.bytedance.p1399im.core.p1408d.C19640j.C196515 */

                static {
                    Covode.recordClassIndex(22495);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Boolean mo31187a() {
                    return Boolean.valueOf(C19749c.m37018b(hVar.getConversationId(), hVar.getSortOrder()));
                }
            }, (AbstractC19985b) null);
        }
    }

    /* renamed from: a */
    public final void mo31591a(AbstractC19667p pVar) {
        if (pVar != null) {
            C19512f.m36457b("imsdk", "ConversationListModel addObserver:".concat(String.valueOf(pVar)), (Throwable) null);
            this.f46668e.add(pVar);
        }
    }

    /* renamed from: c */
    public final boolean mo31601c(String str) {
        if (TextUtils.isEmpty(str) || !this.f46667d.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m36677b(final boolean z) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f46666c) {
            C19512f.m36457b("imsdk", "ConversationListModel preAsync already isSyncing", (Throwable) null);
            return;
        }
        this.f46666c = true;
        C19512f.m36457b("imsdk", "ConversationListModel start preAsync", (Throwable) null);
        RunnableC19987d.m37728a(new AbstractC19986c<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19640j.C1964210 */

            static {
                Covode.recordClassIndex(22486);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ List<C19638h> mo31187a() {
                return C19640j.this.mo31604e();
            }
        }, new AbstractC19985b<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19640j.C1964311 */

            static {
                Covode.recordClassIndex(22487);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(List<C19638h> list) {
                List<C19638h> list2 = list;
                C19696b.m36824a(true, list2.size(), z, SystemClock.uptimeMillis() - uptimeMillis, C19640j.this.f46673j, C19640j.this.f46674k);
                if (C19505b.m36410b()) {
                    C19505b.m36409a().mo31161c();
                }
                if (!C19640j.this.f46670g.isEmpty()) {
                    C19512f.m36457b("imsdk", "ConversationListModel preAsync onCallback IConversationPageListObserver", (Throwable) null);
                    Iterator<C19638h> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next();
                        C19483d.m36365a();
                    }
                    Iterator<Object> it2 = C19640j.this.f46670g.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                if (!C19640j.this.f46668e.isEmpty()) {
                    C19512f.m36457b("imsdk", "ConversationListModel preAsync onCallback IConversationListObserver", (Throwable) null);
                    for (AbstractC19667p pVar : C19640j.this.f46668e) {
                        pVar.mo28007a(C19640j.this.f46664a);
                    }
                }
                C19609be.m36623a().mo31396b();
                C19640j.this.f46666c = false;
                C19946a.m37584a().mo31816c();
            }
        });
    }

    /* renamed from: c */
    private void m36679c(final boolean z) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f46666c) {
            C19512f.m36457b("imsdk", "ConversationListModel async, already isSyncing", (Throwable) null);
            return;
        }
        this.f46666c = true;
        C19512f.m36457b("imsdk", "ConversationListModel start async", (Throwable) null);
        RunnableC19987d.m37728a(new AbstractC19986c<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19640j.C1964412 */

            static {
                Covode.recordClassIndex(22488);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ List<C19638h> mo31187a() {
                return C19640j.this.mo31602d();
            }
        }, new AbstractC19985b<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19640j.C1964513 */

            static {
                Covode.recordClassIndex(22489);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(List<C19638h> list) {
                C19696b.m36824a(false, list.size(), z, SystemClock.uptimeMillis() - uptimeMillis, C19640j.this.f46673j, 0);
                if (C19505b.m36410b()) {
                    C19505b.m36409a().mo31161c();
                }
                if (!C19640j.this.f46668e.isEmpty()) {
                    C19512f.m36457b("imsdk", "ConversationListModel async onCallback", (Throwable) null);
                    for (AbstractC19667p pVar : C19640j.this.f46668e) {
                        pVar.mo28007a(C19640j.this.f46664a);
                    }
                }
                C19609be.m36623a().mo31396b();
                C19640j.this.f46666c = false;
                C19946a.m37584a().mo31816c();
                C19483d a = C19483d.m36365a();
                C89219l.m154709a((Object) a, "");
                if (a.mo31141b().f46228aJ) {
                    C20046v.m37933b(C19631f.RunnableC19634c.f46661a);
                }
            }
        });
    }

    /* renamed from: d */
    private void m36680d(String str) {
        this.f46664a.remove(str);
        C19609be.m36623a().mo31393a(str);
        this.f46665b.remove(str);
        if (C19483d.m36365a().mo31141b().f46200I) {
            C20045u.m37926a().mo31918c();
        }
    }

    /* renamed from: e */
    private void m36681e(C19638h hVar) {
        if (hVar != null && this.f46666c) {
            C19512f.m36457b("imsdk", "ConversationListModel recordConversationWhileSyncing:" + hVar.getConversationId(), (Throwable) null);
            this.f46665b.put(hVar.getConversationId(), hVar);
        }
    }

    /* renamed from: b */
    private void m36676b(List<C19638h> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C19638h hVar : list) {
                if ("0".equals(hVar.getConversationId())) {
                    C19512f.m36457b("imsdk", "ConversationListModel updateLoadedListToMemory dirty conversation", (Throwable) null);
                    arrayList.add(hVar);
                    C19510e.m36436a("im_dirty_sync", hVar.getConversationId());
                }
            }
            if (!arrayList.isEmpty()) {
                list.removeAll(arrayList);
            }
            m36678c(list);
            this.f46664a.putAll(this.f46665b);
            this.f46665b.clear();
            m36673a((Collection<C19638h>) list);
        }
    }

    /* renamed from: d */
    public final void mo31603d(C19638h hVar) {
        if (hVar != null) {
            C19512f.m36457b("imsdk", "ConversationListModel onDissolveConversation:" + hVar.getConversationId(), (Throwable) null);
            if (this.f46664a.containsKey(hVar.getConversationId())) {
                this.f46664a.put(hVar.getConversationId(), hVar);
            }
            C20014q.m37816a().mo31911c(hVar);
            for (AbstractC19667p pVar : this.f46668e) {
                pVar.mo28017d(hVar);
            }
            C19609be.m36623a().mo31397b(hVar);
        }
    }

    /* renamed from: a */
    private synchronized void m36673a(Collection<C19638h> collection) {
        MethodCollector.m26663i(9747);
        if (collection == null || collection.isEmpty()) {
            MethodCollector.m26664o(9747);
            return;
        }
        for (C19638h hVar : collection) {
            if (hVar != null && hVar.isWaitingInfo()) {
                C19512f.m36457b("imsdk", "retryWaitingInfoConversations - " + hVar.getConversationId(), (Throwable) null);
                C19786a.m37232a(hVar.getInboxType(), hVar.getConversationId(), hVar.getConversationShortId(), hVar.getConversationType(), hVar.getUpdatedTime());
            }
        }
        C19786a.m37228a();
        MethodCollector.m26664o(9747);
    }

    /* renamed from: c */
    private synchronized void m36678c(List<C19638h> list) {
        MethodCollector.m26663i(10060);
        if (list != null && !list.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (C19638h hVar : list) {
                if (hVar != null) {
                    String conversationId = hVar.getConversationId();
                    stringBuffer.append(conversationId).append("_");
                    if (this.f46664a.get(conversationId) != null && this.f46664a.get(conversationId).getUpdatedTime() > hVar.getUpdatedTime()) {
                        C19512f.m36457b("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId, (Throwable) null);
                    }
                    this.f46664a.put(conversationId, hVar);
                }
            }
            C19512f.m36457b("imsdk", "ConversationListModel insertOrUpdateConversation size:" + list.size() + ", ids:" + ((Object) stringBuffer), (Throwable) null);
        }
        if (C19483d.m36365a().mo31141b().f46200I) {
            C20045u.m37926a().mo31918c();
        }
        MethodCollector.m26664o(10060);
    }

    /* renamed from: a */
    private static void m36674a(List<C19638h> list) {
        if (list != null && !list.isEmpty()) {
            if (!C19483d.m36365a().mo31141b().f46240ae || !C19483d.m36365a().f46160e) {
                Collections.sort(list, C19483d.m36365a().f46161f);
            } else {
                Collections.sort(list, new Comparator<C19638h>() {
                    /* class com.bytedance.p1399im.core.p1408d.C19640j.C196411 */

                    static {
                        Covode.recordClassIndex(22485);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(C19638h hVar, C19638h hVar2) {
                        long sortOrder = hVar2.getSortOrder() - hVar.getSortOrder();
                        if (sortOrder > 0) {
                            return 1;
                        }
                        if (sortOrder < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public final void mo31597b(C19638h hVar) {
        if (hVar != null) {
            C19512f.m36457b("imsdk", "ConversationListModel onDeleteConversation:" + hVar.getConversationId() + ", isStranger:" + hVar.isStranger() + ", isInBox:" + hVar.isInBox(), (Throwable) null);
            if (hVar.isStranger()) {
                C19730f.m36907a().mo31676a(hVar);
            } else if (!C19505b.m36410b() || !hVar.isInBox()) {
                m36680d(hVar.getConversationId());
                C20014q.m37816a().mo31895a(hVar);
                C19609be.m36623a().mo31392a(hVar);
                for (AbstractC19667p pVar : this.f46668e) {
                    pVar.mo28010b(hVar);
                }
            } else {
                C19505b.m36409a().mo31162c(hVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo31600c(C19638h hVar) {
        if (hVar != null) {
            C19512f.m36457b("imsdk", "ConversationListModel onCreateConversation:" + hVar.getConversationId() + ", isStranger:" + hVar.isStranger() + ", isInBox:" + hVar.isInBox(), (Throwable) null);
            if (hVar.isStranger()) {
                m36680d(hVar.getConversationId());
                C19730f.m36907a().mo31680b(hVar);
                return;
            }
            if (C19505b.m36410b() && hVar.isInBox()) {
                if (hVar.isInBox()) {
                    m36680d(hVar.getConversationId());
                    C19505b.m36409a().mo31160b(hVar);
                    return;
                }
                C19505b.m36409a().mo31160b(hVar);
            }
            mo31595a(hVar);
            C20014q.m37816a().mo31905b(hVar);
            for (AbstractC19667p pVar : this.f46668e) {
                pVar.mo28001a(hVar);
            }
        }
    }

    /* renamed from: a */
    public final C19638h mo31586a(String str) {
        C19638h hVar = this.f46664a.get(str);
        if (C19505b.m36410b()) {
            if (hVar != null) {
                return hVar;
            }
            hVar = C19505b.m36409a().mo31158a(str);
        }
        if (hVar == null) {
            return C19730f.m36907a().mo31672a(str);
        }
        return hVar;
    }

    /* renamed from: a */
    public final void mo31587a(int i, C19638h... hVarArr) {
        mo31594a(false, i, hVarArr);
    }

    /* renamed from: a */
    public static void m36672a(String str, AbstractC19479b<List<ParticipantMinIndex>> bVar) {
        C19930x.m37536a();
        C19910q qVar = new C19910q(bVar);
        C19638h a = m36671a().mo31586a(str);
        if (a == null || a.isLocal()) {
            qVar.mo31803b(C19978k.m37686a(-1017));
            return;
        }
        RequestBody build = new RequestBody.Builder().participants_min_index_body(new GetConversationParticipantsMinIndexV3RequestBody.Builder().conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).conversation_id(a.getConversationId()).build()).build();
        qVar.mo31798a(a.getInboxType(), build, null, a);
    }

    /* renamed from: b */
    public final void mo31598b(final String str, final AbstractC19479b<C19638h> bVar) {
        C19512f.m36457b("imsdk", "ConversationListModel getConversation async", (Throwable) null);
        C19638h a = mo31586a(str);
        if (a == null) {
            RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
                /* class com.bytedance.p1399im.core.p1408d.C19640j.C196548 */

                static {
                    Covode.recordClassIndex(22498);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ C19638h mo31187a() {
                    return C19749c.m36999a(str, true);
                }
            }, new AbstractC19985b<C19638h>() {
                /* class com.bytedance.p1399im.core.p1408d.C19640j.C196559 */

                static {
                    Covode.recordClassIndex(22499);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(C19638h hVar) {
                    C19638h hVar2 = hVar;
                    if (hVar2 != null) {
                        if (hVar2.isStranger()) {
                            C19730f.m36907a().mo31680b(hVar2);
                        } else if (!C19505b.m36410b() || !C19505b.m36409a().mo31160b(hVar2)) {
                            C19640j.this.mo31595a(hVar2);
                        }
                    }
                    AbstractC19479b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo27861a(hVar2);
                    }
                }
            });
        } else if (bVar != null) {
            bVar.mo27861a(a);
        }
    }

    /* renamed from: a */
    public final synchronized void mo31588a(long j, SortType sortType, Boolean bool, AbstractC19478a<List<C19638h>> aVar) {
        MethodCollector.m26663i(9589);
        C19930x.m37536a();
        C19912s sVar = new C19912s(aVar, 1);
        GetUserConversationListRequestBody.Builder cursor = new GetUserConversationListRequestBody.Builder().con_type(ConversationType.GROUP_CHAT).cursor(Long.valueOf(j));
        if (sortType == null) {
            sortType = SortType.JOIN_TIME;
        }
        GetUserConversationListRequestBody.Builder sort_type = cursor.sort_type(sortType);
        if (bool != null) {
            sort_type.include_removed_group(bool);
        }
        sVar.mo31798a(sVar.f47299a, new RequestBody.Builder().get_conversation_list_body(sort_type.build()).build(), null, new Object[0]);
        MethodCollector.m26664o(9589);
    }
}
