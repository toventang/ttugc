package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.AbstractC19667p;
import com.bytedance.p1399im.core.p1408d.AbstractC19669r;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.p1399im.core.proto.ConversationOperationStatus;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.SecUidPair;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.a */
public final class C19787a extends AbstractC19927w<List<C19537ah>> {

    /* renamed from: a */
    public long f46979a = -1;

    static {
        Covode.recordClassIndex(22631);
    }

    C19787a() {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue());
    }

    public C19787a(AbstractC19479b<List<C19537ah>> bVar) {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.conversation_add_participants_body == null || kVar.f47482f.body.conversation_add_participants_body.status == null || kVar.f47482f.body.conversation_add_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        final String str = (String) kVar.f47480d[0];
        final List list = (List) kVar.f47480d[1];
        final int size = list.size();
        if (z) {
            final ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = kVar.f47482f.body.conversation_add_participants_body;
            RunnableC19987d.m37728a(new AbstractC19986c<Pair<C19638h, List<C19537ah>>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19787a.C197881 */

                static {
                    Covode.recordClassIndex(22632);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Pair<C19638h, List<C19537ah>> mo31187a() {
                    int conversationType;
                    List<SecUidPair> list;
                    if (conversationAddParticipantsResponseBody.failed_participants != null) {
                        list.removeAll(conversationAddParticipantsResponseBody.failed_participants);
                    }
                    long c = C19769e.m37147c(str);
                    C19638h a = C19640j.m36671a().mo31586a(str);
                    if (C19787a.this.f46979a > 0 && a == null) {
                        C19787a aVar = C19787a.this;
                        String str = str;
                        C19638h hVar = new C19638h();
                        hVar.setConversationId(str);
                        hVar.setConversationShortId(aVar.f46979a);
                        hVar.setConversationType(C19489e.AbstractC19490a.f46181b);
                        hVar.setIsMember(true);
                        C19749c.m37007a(hVar);
                    }
                    String str2 = str;
                    if (a == null) {
                        conversationType = -1;
                    } else {
                        conversationType = a.getConversationType();
                    }
                    String str3 = str;
                    List list2 = list;
                    ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = conversationAddParticipantsResponseBody;
                    HashMap hashMap = null;
                    if (!(conversationAddParticipantsResponseBody == null || (list = conversationAddParticipantsResponseBody.sec_success_participants) == null || list.isEmpty())) {
                        hashMap = new HashMap();
                        for (SecUidPair secUidPair : list) {
                            if (!(secUidPair == null || secUidPair.uid == null)) {
                                hashMap.put(secUidPair.uid, secUidPair.sec_uid);
                            }
                        }
                    }
                    C19769e.m37141a(str2, conversationType, C19997f.m37769a(str3, list2, hashMap, c));
                    C19638h a2 = C19749c.m36999a(str, true);
                    if (a2 != null) {
                        if (kVar.f47482f != null) {
                            a2.setInboxType(kVar.f47482f.inbox_type.intValue());
                        }
                        a2.setMemberCount(a2.getMemberCount() + list.size());
                        C19749c.m37008a(a2, false);
                    }
                    return new Pair(a2, C19769e.m37138a(str, list));
                }
            }, new AbstractC19985b<Pair<C19638h, List<C19537ah>>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19787a.C197892 */

                static {
                    Covode.recordClassIndex(22633);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(Pair<C19638h, List<C19537ah>> pair) {
                    Pair<C19638h, List<C19537ah>> pair2 = pair;
                    if (pair2.first != null) {
                        C19640j.m36671a().mo31590a((C19638h) pair2.first, 1);
                    }
                    C19787a.this.mo31802a(pair2.second, kVar);
                    C19640j a = C19640j.m36671a();
                    List<C19537ah> list = (List) pair2.second;
                    if (list != null && !list.isEmpty()) {
                        C20014q a2 = C20014q.m37816a();
                        if (!list.isEmpty()) {
                            a2.mo31907b(list.get(0).getConversationId(), new C20014q.AbstractC20039a<AbstractC19669r>(list) {
                                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2003023 */

                                /* renamed from: a */
                                final /* synthetic */ List f47602a;

                                static {
                                    Covode.recordClassIndex(22875);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                                /* renamed from: a */
                                public final /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                                    rVar.mo28012b(this.f47602a);
                                }

                                {
                                    this.f47602a = r2;
                                }
                            });
                        }
                        for (AbstractC19667p pVar : a.f46668e) {
                            pVar.mo28012b(list);
                        }
                    }
                    C19510e.m36435a(kVar, true).mo31164a("conversation_id", str).mo31164a("total_count", Integer.valueOf(size)).mo31164a("count", Integer.valueOf(((List) pair2.second).size())).mo31165a();
                    runnable.run();
                }
            });
            return;
        }
        mo31803b(kVar);
        runnable.run();
        C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31164a("total_count", Integer.valueOf(size)).mo31165a();
    }
}
