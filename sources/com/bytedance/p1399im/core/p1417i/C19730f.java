package com.bytedance.p1399im.core.p1417i;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1413f.C19682a;
import com.bytedance.p1399im.core.p1413f.p1414a.C19693d;
import com.bytedance.p1399im.core.p1417i.p1418a.C19709a;
import com.bytedance.p1399im.core.p1417i.p1418a.C19715c;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageType;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.core.i.f */
public final class C19730f {

    /* renamed from: a */
    public static int f46886a;

    /* renamed from: g */
    private static volatile C19730f f46887g;

    /* renamed from: b */
    public C19721e f46888b;

    /* renamed from: c */
    public AbstractC19718b f46889c;

    /* renamed from: d */
    public int f46890d;

    /* renamed from: e */
    public LruCache<String, C19638h> f46891e = new LruCache<>(C19483d.m36365a().mo31141b().f46239ad);

    /* renamed from: f */
    public Set<String> f46892f = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(22574);
    }

    /* renamed from: a */
    public final void mo31678a(String str, AbstractC19479b<List<C19538ai>> bVar) {
        C19638h a = mo31672a(str);
        if (a == null) {
            C19512f.m36457b("imsdk", "StrangerManager fetchStrangerMessages, but conversation is null, cid:".concat(String.valueOf(str)), (Throwable) null);
            bVar.mo27860a((C19672u) null);
            return;
        }
        C19512f.m36457b("imsdk", "StrangerManager fetchStrangerMessages, cid:".concat(String.valueOf(str)), (Throwable) null);
        new C19715c(bVar).mo31659a(a.getInboxType(), a.getConversationShortId());
    }

    /* renamed from: a */
    public final void mo31677a(C19638h hVar, int i) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerManager onUpdateConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        C19512f.m36457b("imsdk", sb.append(conversationId).append(", reason:").append(i).toString(), (Throwable) null);
        if (hVar != null) {
            this.f46891e.put(hVar.getConversationId(), hVar);
        }
        C19721e eVar = this.f46888b;
        if (eVar != null) {
            eVar.mo31669a(hVar, i);
        }
    }

    private C19730f() {
    }

    /* renamed from: b */
    public final void mo31679b() {
        C19512f.m36457b("imsdk", "StrangerManager getStrangerBox, notifyUpdate:true", (Throwable) null);
        new C19709a(new AbstractC19478a<List<C19638h>>(true) {
            /* class com.bytedance.p1399im.core.p1417i.C19730f.C197343 */

            /* renamed from: a */
            final /* synthetic */ AbstractC19479b f46901a = null;

            /* renamed from: b */
            final /* synthetic */ boolean f46902b = true;

            static {
                Covode.recordClassIndex(22578);
            }

            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final void mo27860a(C19672u uVar) {
                C19512f.m36457b("imsdk", "StrangerManager getStrangerBox onFailure", (Throwable) null);
                C19730f.this.mo31675a(this.f46901a, this.f46902b);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a
            /* renamed from: a */
            public final /* synthetic */ void mo31135a(List<C19638h> list, long j, boolean z) {
                Integer valueOf;
                List<C19638h> list2 = list;
                StringBuilder sb = new StringBuilder("StrangerManager getStrangerBox onSuccess, result:");
                if (list2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(list2.size());
                }
                C19512f.m36457b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                C19730f.this.mo31675a(this.f46901a, this.f46902b);
            }
        }).mo31658a(f46886a, 0L, 1L, true);
    }

    /* renamed from: a */
    public static C19730f m36907a() {
        MethodCollector.m26663i(9234);
        if (f46887g == null) {
            synchronized (C19682a.class) {
                try {
                    if (f46887g == null) {
                        f46887g = new C19730f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9234);
                    throw th;
                }
            }
        }
        C19730f fVar = f46887g;
        MethodCollector.m26664o(9234);
        return fVar;
    }

    /* renamed from: a */
    public static boolean m36908a(MessageBody messageBody) {
        if (messageBody == null || messageBody.message_type.intValue() != MessageType.MESSAGE_TYPE_MODE_CHANGE.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo31680b(C19638h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerManager updateMemoryConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        C19512f.m36457b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f46891e.put(hVar.getConversationId(), hVar);
        }
        C19721e eVar = this.f46888b;
        if (eVar != null) {
            eVar.mo31671b(hVar);
        }
    }

    /* renamed from: a */
    public final C19638h mo31672a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C19638h hVar = this.f46891e.get(str);
        if (hVar == null) {
            C19721e eVar = this.f46888b;
            if (eVar == null || (hVar = eVar.mo31666a(str)) == null) {
                C19512f.m36457b("imsdk", "StrangerManager getConversation null ".concat(String.valueOf(str)), (Throwable) null);
            } else {
                this.f46891e.put(str, hVar);
            }
        }
        return hVar;
    }

    /* renamed from: b */
    public final void mo31681b(String str) {
        C19512f.m36457b("imsdk", "StrangerManager onStrangerTransferred:".concat(String.valueOf(str)), (Throwable) null);
        this.f46892f.remove(str);
        C19721e eVar = this.f46888b;
        if (eVar != null) {
            C19512f.m36457b("imsdk", "StrangerListModel onStrangerTransfer: ".concat(String.valueOf(str)), (Throwable) null);
            eVar.f46871b.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo31676a(C19638h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerManager onDeleteConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        C19512f.m36457b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f46891e.remove(hVar.getConversationId());
        }
        C19721e eVar = this.f46888b;
        if (eVar != null) {
            eVar.mo31668a(hVar);
        }
        mo31679b();
    }

    /* renamed from: a */
    public final synchronized void mo31673a(int i, MessageBody messageBody) {
        MethodCollector.m26663i(9390);
        if (messageBody != null) {
            mo31674a(i, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue());
        }
        MethodCollector.m26664o(9390);
    }

    /* renamed from: a */
    public final void mo31675a(final AbstractC19479b<C19720d> bVar, final boolean z) {
        C19512f.m36457b("imsdk", "StrangerManager loadStrangerBoxFromLocal, notifyUpdate:".concat(String.valueOf(z)), (Throwable) null);
        RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
            /* class com.bytedance.p1399im.core.p1417i.C19730f.C197354 */

            static {
                Covode.recordClassIndex(22579);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ C19638h mo31187a() {
                List<C19638h> a = C19749c.m37002a(C19730f.f46886a, 1);
                if (a == null || a.isEmpty()) {
                    return null;
                }
                return a.get(0);
            }
        }, new AbstractC19985b<C19638h>() {
            /* class com.bytedance.p1399im.core.p1417i.C19730f.C197365 */

            static {
                Covode.recordClassIndex(22580);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19638h hVar) {
                C19720d dVar;
                C19638h hVar2 = hVar;
                if (hVar2 == null) {
                    C19512f.m36457b("imsdk", "StrangerManager loadStrangerBoxFromLocal null", (Throwable) null);
                    dVar = null;
                } else {
                    C19512f.m36457b("imsdk", "StrangerManager loadStrangerBoxFromLocal, totalUnread:" + C19730f.this.f46890d + ", cid:" + hVar2.getConversationId(), (Throwable) null);
                    dVar = new C19720d(C19730f.this.f46890d, hVar2);
                }
                AbstractC19479b bVar = bVar;
                if (bVar != null) {
                    bVar.mo27861a(dVar);
                }
                if (z) {
                    C19730f fVar = C19730f.this;
                    C19512f.m36457b("imsdk", "StrangerManager notifyUpdateStrangerBox", (Throwable) null);
                    if (fVar.f46889c != null) {
                        fVar.f46889c.mo27780a(dVar);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final synchronized void mo31674a(final int i, final String str, final long j, final int i2) {
        MethodCollector.m26663i(9392);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9392);
            return;
        }
        C19512f.m36457b("imsdk", "StrangerManager handleStrangerTransfer:".concat(String.valueOf(str)), (Throwable) null);
        if (this.f46892f.contains(str)) {
            C19512f.m36457b("imsdk", "StrangerManager already transferring, ignore:".concat(String.valueOf(str)), (Throwable) null);
            MethodCollector.m26664o(9392);
            return;
        }
        this.f46892f.add(str);
        C19638h a = C19640j.m36671a().mo31586a(str);
        if (a == null || a.isStranger()) {
            RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
                /* class com.bytedance.p1399im.core.p1417i.C19730f.C197311 */

                static {
                    Covode.recordClassIndex(22575);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ C19638h mo31187a() {
                    final C19638h a = C19640j.m36671a().mo31586a(str);
                    if (!(a == null && (a = C19749c.m36999a(str, true)) == null)) {
                        if (!a.isStranger()) {
                            C19730f.this.f46892f.remove(str);
                            C19512f.m36457b("imsdk", "StrangerManager find db already transferred, ignore:" + str, (Throwable) null);
                            return a;
                        }
                        C19512f.m36457b("imsdk", "StrangerManager find db stranger conversation, do transfer", (Throwable) null);
                        C19749c.m37028f(str);
                        a.setStranger(false);
                        C19640j.m36671a().mo31589a(a);
                    }
                    C19730f.this.f46891e.remove(str);
                    C19930x.m37536a();
                    C19930x.m37538a(i, str, j, i2, new AbstractC19479b<C19638h>() {
                        /* class com.bytedance.p1399im.core.p1417i.C19730f.C197311.C197321 */

                        static {
                            Covode.recordClassIndex(22576);
                        }

                        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                        /* renamed from: a */
                        public final void mo27860a(C19672u uVar) {
                            C19730f.this.mo31681b(str);
                            C19640j.m36671a().mo31590a(a, 5);
                            new C19693d(null).mo31646a(i, str, j, i2, 0);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                        /* renamed from: a */
                        public final /* synthetic */ void mo27861a(C19638h hVar) {
                            C19730f.this.mo31681b(str);
                            new C19693d(null).mo31646a(i, str, j, i2, 0);
                        }
                    });
                    return a;
                }
            }, new AbstractC19985b<C19638h>() {
                /* class com.bytedance.p1399im.core.p1417i.C19730f.C197332 */

                static {
                    Covode.recordClassIndex(22577);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31188a(C19638h hVar) {
                    C19730f.this.mo31676a(hVar);
                }
            });
            MethodCollector.m26664o(9392);
            return;
        }
        this.f46892f.remove(str);
        C19512f.m36457b("imsdk", "StrangerManager find memory already transferred, ignore:".concat(String.valueOf(str)), (Throwable) null);
        MethodCollector.m26664o(9392);
    }
}
