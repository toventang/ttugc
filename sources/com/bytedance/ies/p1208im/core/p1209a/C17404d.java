package com.bytedance.ies.p1208im.core.p1209a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d;
import com.bytedance.p1399im.core.internal.p1419a.C19771f;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19911r;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20009m;
import com.bytedance.p1399im.core.internal.utils.C20010n;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.bytedance.p1399im.core.p1408d.AbstractC19668q;
import com.bytedance.p1399im.core.p1408d.C19522aa;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19546ak;
import com.bytedance.p1399im.core.p1408d.C19605bb;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1417i.C19706a;
import com.bytedance.p1399im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.bytedance.p1399im.core.proto.ParticipantReadIndex;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.a.d */
public final class C17404d extends AbstractC17434e {

    /* renamed from: b */
    public static final C17405a f41753b = new C17405a((byte) 0);

    /* renamed from: c */
    private final C19706a f41754c;

    /* renamed from: d */
    private boolean f41755d;

    /* renamed from: e */
    private final String f41756e;

    /* renamed from: f */
    private final boolean f41757f;

    static {
        Covode.recordClassIndex(19891);
    }

    /* renamed from: com.bytedance.ies.im.core.a.d$a */
    public static final class C17405a {
        static {
            Covode.recordClassIndex(19892);
        }

        private C17405a() {
        }

        public /* synthetic */ C17405a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: a */
    public final String mo27757a() {
        return this.f41756e;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: e */
    public final int mo27764e() {
        return this.f41754c.f46402c;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: g */
    public final void mo27766g() {
        this.f41754c.mo31319e();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: f */
    public final void mo27765f() {
        this.f41755d = true;
        this.f41754c.mo31311b();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: h */
    public final List<C19538ai> mo27767h() {
        C20009m mVar = this.f41754c.f46401b;
        C89219l.m154716b(mVar, "");
        return mVar;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: i */
    public final List<C19538ai> mo27768i() {
        List<C19538ai> h = this.f41754c.mo31322h();
        C89219l.m154716b(h, "");
        return h;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: c */
    public final void mo27762c() {
        C19706a aVar = this.f41754c;
        C19512f.m36457b("imsdk", "MessageModel resume", (Throwable) null);
        if (aVar.f46405f) {
            C19640j a = C19640j.m36671a();
            a.f46667d.add(aVar.f46400a);
        }
        new C19517i().mo31179a("imsdk_enter_conversation").mo31180a("conversation_id", aVar.f46400a).mo31180a("result", 1).mo31181b();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: d */
    public final void mo27763d() {
        C19706a aVar = this.f41754c;
        C19512f.m36457b("imsdk", "MessageModel stop", (Throwable) null);
        if (aVar.f46405f) {
            C19640j a = C19640j.m36671a();
            a.f46667d.remove(aVar.f46400a);
        }
        C19605bb bbVar = aVar.f46415p;
        bbVar.f46585d.removeMessages(bbVar.f46582a);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: b */
    public final void mo27761b() {
        C19706a aVar = this.f41754c;
        C19512f.m36457b("imsdk", "MessageModel unregister", (Throwable) null);
        aVar.f46401b.clear();
        aVar.f46403d = null;
        C20014q.m37816a().mo31906b(aVar.f46400a, aVar);
        aVar.f46404e = null;
        C20014q.m37816a().f47561g.remove(aVar);
        if (aVar.f46409j) {
            C20014q a = C20014q.m37816a();
            String str = aVar.f46400a;
            AbstractC19668q qVar = aVar.f46410k;
            List<AbstractC19668q> list = a.f47559e.get(str);
            if (list != null) {
                list.remove(qVar);
            }
            a.f47559e.put(str, list);
            aVar.f46410k = null;
        }
        C19522aa.m36471a().f46336b.remove(aVar);
        new C19517i().mo31179a("imsdk_close_conversation").mo31180a("conversation_id", aVar.f46400a).mo31180a("result", 1).mo31181b();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: a */
    public final void mo27758a(int i) {
        this.f41754c.f46402c = i;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: a */
    public final void mo27759a(AbstractC17425d dVar) {
        C89219l.m154721d(dVar, "");
        C19706a aVar = this.f41754c;
        C19512f.m36457b("imsdk", "MessageModel register, autoGetConversationInfo:true", (Throwable) null);
        aVar.f46403d = dVar;
        C20014q.m37816a().mo31897a(aVar.f46400a, aVar);
        C19640j.m36671a();
        C19640j.m36675b(aVar.f46400a);
        if (aVar.f46409j) {
            C20014q a = C20014q.m37816a();
            String str = aVar.f46400a;
            AbstractC19668q qVar = aVar.f46410k;
            List<AbstractC19668q> list = a.f47559e.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!list.contains(qVar)) {
                list.add(qVar);
            }
            a.f47559e.put(str, list);
        }
        C19522aa.m36471a().f46336b.add(aVar);
    }

    public C17404d(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f41756e = str;
        this.f41757f = z;
        this.f41754c = new C19706a(str, z);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e
    /* renamed from: a */
    public final void mo27760a(C19538ai aiVar, boolean z, AbstractC19479b<Pair<List<Long>, List<Long>>> bVar) {
        C89219l.m154721d(aiVar, "");
        C19706a aVar = this.f41754c;
        if (aiVar == null || !aiVar.isSelf() || aiVar.isDeleted() || !C20010n.m37809c(aiVar) || TextUtils.isEmpty(aiVar.getConversationId()) || !aiVar.getConversationId().equals(aVar.f46400a) || !aiVar.isSuccessOrNormal() || !aVar.f46409j) {
            C19512f.m36457b("imsdk", "read_receipt, getMessageReadStatusAsync failed", (Throwable) null);
            bVar.mo27860a(C19672u.m36756a(C19978k.m37686a(-1015)));
            return;
        }
        C19512f.m36457b("imsdk", "read_receipt, getMessageReadStatusAsync, msgSvrId:" + aiVar.getMsgId() + ", needRequestNet:" + z, (Throwable) null);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - aVar.f46412m >= ((long) C19483d.m36365a().mo31141b().f46212U)) {
                aVar.f46412m = currentTimeMillis;
                C19640j.m36671a();
                String conversationId = aiVar.getConversationId();
                C19546ak.C1956425 r0 = new AbstractC19479b<List<ParticipantReadIndex>>(aiVar, bVar) {
                    /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956425 */

                    /* renamed from: a */
                    final /* synthetic */ C19538ai f46452a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC19479b f46453b;

                    static {
                        Covode.recordClassIndex(22408);
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                        C19546ak.this.mo31314b(this.f46452a, this.f46453b);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final /* synthetic */ void mo27861a(List<ParticipantReadIndex> list) {
                        final List<ParticipantReadIndex> list2 = list;
                        RunnableC19987d.m37729a(new AbstractC19986c<Pair<Boolean, Map<Long, C19589ao>>>() {
                            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956425.C195651 */

                            static {
                                Covode.recordClassIndex(22409);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                            /* renamed from: a */
                            public final /* synthetic */ Pair<Boolean, Map<Long, C19589ao>> mo31187a() {
                                long j;
                                long j2;
                                C19546ak akVar = C19546ak.this;
                                String conversationId = C1956425.this.f46452a.getConversationId();
                                List list = list2;
                                if (TextUtils.isEmpty(conversationId)) {
                                    return null;
                                }
                                boolean b = akVar.mo31316b(conversationId);
                                if (akVar.f46411l != null && !akVar.f46411l.isEmpty() && list != null && !list.isEmpty()) {
                                    int size = list.size();
                                    for (int i = 0; i < size; i++) {
                                        ParticipantReadIndex participantReadIndex = (ParticipantReadIndex) list.get(i);
                                        if (participantReadIndex != null) {
                                            if (participantReadIndex.user_id != null) {
                                                j = participantReadIndex.user_id.longValue();
                                            } else {
                                                j = 0;
                                            }
                                            if (participantReadIndex.index != null) {
                                                j2 = participantReadIndex.index.longValue();
                                            } else {
                                                j2 = 0;
                                            }
                                            long c = C19777i.m37193c(conversationId, j2);
                                            C19589ao aoVar = akVar.f46411l.get(Long.valueOf(j));
                                            if (aoVar != null) {
                                                if (c > 0) {
                                                    if (c > aoVar.f46509e) {
                                                        aoVar.mo31360b(j2);
                                                        aoVar.mo31363c(c);
                                                    }
                                                } else if (j2 > aoVar.f46508d) {
                                                    aoVar.mo31360b(j2);
                                                    aoVar.mo31358a();
                                                }
                                                b = true;
                                            }
                                        }
                                    }
                                }
                                return new Pair(Boolean.valueOf(b), akVar.f46411l);
                            }
                        }, new AbstractC19985b<Pair<Boolean, Map<Long, C19589ao>>>() {
                            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956425.C195662 */

                            static {
                                Covode.recordClassIndex(22410);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                            /* renamed from: a */
                            public final /* synthetic */ void mo31188a(Pair<Boolean, Map<Long, C19589ao>> pair) {
                                Pair<Boolean, Map<Long, C19589ao>> pair2 = pair;
                                if (pair2 != null) {
                                    final Map<Long, C19589ao> map = (Map) pair2.second;
                                    if (map != null && !map.isEmpty()) {
                                        Iterator<Map.Entry<Long, C19589ao>> it = map.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Map.Entry<Long, C19589ao> next = it.next();
                                                if (next != null && next.getValue() != null && next.getValue().f46507c < 0) {
                                                    C19546ak.this.mo31310a(C1956425.this.f46452a.getConversationId(), C1956425.this.f46452a, C1956425.this.f46453b);
                                                    break;
                                                }
                                            } else {
                                                Pair<List<Long>, List<Long>> a = C19546ak.this.mo31306a(C1956425.this.f46452a, map);
                                                if (C1956425.this.f46453b != null) {
                                                    C1956425.this.f46453b.mo27861a(a);
                                                }
                                            }
                                        }
                                    } else if (C1956425.this.f46453b != null) {
                                        C1956425.this.f46453b.mo27861a(new Pair(Collections.emptyList(), Collections.emptyList()));
                                    }
                                    if (((Boolean) pair2.first).booleanValue()) {
                                        RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
                                            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956425.C195662.C195671 */

                                            static {
                                                Covode.recordClassIndex(22411);
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                                            /* renamed from: a */
                                            public final /* synthetic */ Boolean mo31187a() {
                                                return Boolean.valueOf(C19771f.m37154a(C1956425.this.f46452a.getConversationId(), map));
                                            }
                                        }, null, C19983a.m37722d());
                                    }
                                } else if (C1956425.this.f46453b != null) {
                                    C1956425.this.f46453b.mo27860a(C19672u.m36756a(C19978k.m37686a(-9999)));
                                }
                            }
                        }, C19983a.m37722d());
                    }

                    {
                        this.f46452a = r2;
                        this.f46453b = r3;
                    }
                };
                C19930x.m37536a();
                C19911r rVar = new C19911r(r0);
                C19638h a = C19640j.m36671a().mo31586a(conversationId);
                if (a == null || a.isLocal()) {
                    rVar.mo31803b(C19978k.m37686a(-1017));
                    return;
                }
                RequestBody build = new RequestBody.Builder().participants_read_index_body(new GetConversationParticipantsReadIndexV3RequestBody.Builder().conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).conversation_id(a.getConversationId()).build()).build();
                rVar.mo31798a(a.getInboxType(), build, null, a);
                return;
            }
        }
        aVar.mo31314b(aiVar, bVar);
    }
}
