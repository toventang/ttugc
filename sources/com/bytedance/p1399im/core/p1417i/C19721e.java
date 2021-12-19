package com.bytedance.p1399im.core.p1417i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.i.e */
public final class C19721e {

    /* renamed from: a */
    public static int f46870a = 10;

    /* renamed from: b */
    public Map<String, C19638h> f46871b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c */
    public AbstractC19719c f46872c;

    /* renamed from: d */
    public volatile boolean f46873d;

    /* renamed from: e */
    public volatile boolean f46874e;

    /* renamed from: f */
    public volatile boolean f46875f;

    /* renamed from: g */
    public volatile long f46876g;

    static {
        Covode.recordClassIndex(22565);
    }

    /* renamed from: a */
    public final void mo31667a() {
        C19512f.m36457b("imsdk", "StrangerListModel loadMoreFromLocal", (Throwable) null);
        if (this.f46871b.isEmpty()) {
            C19512f.m36457b("imsdk", "StrangerListModel loadMoreFromLocal un refreshed", (Throwable) null);
            this.f46873d = false;
            return;
        }
        ArrayList arrayList = new ArrayList(this.f46871b.values());
        final C19638h hVar = (C19638h) arrayList.get(arrayList.size() - 1);
        if (hVar == null) {
            C19512f.m36457b("imsdk", "StrangerListModel loadMoreFromLocal lastConversation null", (Throwable) null);
        } else {
            RunnableC19987d.m37728a(new AbstractC19986c<List<C19638h>>() {
                /* class com.bytedance.p1399im.core.p1417i.C19721e.C197285 */

                static {
                    Covode.recordClassIndex(22572);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ List<C19638h> mo31187a() {
                    return C19749c.m37003a(C19730f.f46886a, C19721e.f46870a, hVar.getUpdatedTime());
                }
            }, new AbstractC19985b<List<C19638h>>() {
                /* class com.bytedance.p1399im.core.p1417i.C19721e.C197296 */

                static {
                    Covode.recordClassIndex(22573);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(List<C19638h> list) {
                    Integer valueOf;
                    List<C19638h> list2 = list;
                    C19721e.this.f46873d = false;
                    C19721e eVar = C19721e.this;
                    StringBuilder sb = new StringBuilder("StrangerListModel onLoadMoreConversation:");
                    if (list2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(list2.size());
                    }
                    C19512f.m36457b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                    eVar.mo31670a(list2);
                    if (eVar.f46872c != null) {
                        eVar.f46872c.mo31665b(list2, eVar.f46875f);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final C19638h mo31666a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f46871b.get(str);
    }

    /* renamed from: a */
    public final void mo31668a(C19638h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerListModel onDeleteConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        C19512f.m36457b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f46871b.remove(hVar.getConversationId());
        }
        AbstractC19719c cVar = this.f46872c;
        if (cVar != null) {
            cVar.mo31660a(hVar);
        }
    }

    /* renamed from: b */
    public final void mo31671b(C19638h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerListModel updateMemoryConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        C19512f.m36457b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f46871b.put(hVar.getConversationId(), hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31670a(List<C19638h> list) {
        if (!(list == null || list.isEmpty())) {
            for (C19638h hVar : list) {
                if (hVar != null) {
                    this.f46871b.put(hVar.getConversationId(), hVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31669a(C19638h hVar, int i) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerListModel onUpdateConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        C19512f.m36457b("imsdk", sb.append(conversationId).append(", reason:").append(i).toString(), (Throwable) null);
        if (hVar != null && this.f46871b.containsKey(hVar.getConversationId())) {
            this.f46871b.put(hVar.getConversationId(), hVar);
        }
        AbstractC19719c cVar = this.f46872c;
        if (cVar != null) {
            cVar.mo31661a(hVar, i);
        }
    }
}
