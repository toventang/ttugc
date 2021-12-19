package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.AbstractC19667p;
import com.bytedance.p1399im.core.p1408d.AbstractC19669r;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationOperationStatus;
import com.bytedance.p1399im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.ak */
public final class C19832ak extends AbstractC19927w<List<C19537ah>> {
    static {
        Covode.recordClassIndex(22676);
    }

    C19832ak() {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue());
    }

    public C19832ak(AbstractC19479b<List<C19537ah>> bVar) {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.conversation_remove_participants_body == null || kVar.f47482f.body.conversation_remove_participants_body.status == null || kVar.f47482f.body.conversation_remove_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<C19537ah> m37346a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (l != null) {
                C19537ah ahVar = new C19537ah();
                ahVar.setUid(l.longValue());
                ahVar.setConversationId(str);
                arrayList.add(ahVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            runnable.run();
            C19510e.m36435a(kVar, false).mo31165a();
            return;
        }
        final String str = (String) kVar.f47480d[0];
        final List list = (List) kVar.f47480d[1];
        final ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody = kVar.f47482f.body.conversation_remove_participants_body;
        RunnableC19987d.m37728a(new AbstractC19986c<Pair<C19638h, List<C19537ah>>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19832ak.C198331 */

            static {
                Covode.recordClassIndex(22677);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ Pair<C19638h, List<C19537ah>> mo31187a() {
                if (conversationRemoveParticipantsResponseBody.failed_participants != null) {
                    list.removeAll(conversationRemoveParticipantsResponseBody.failed_participants);
                }
                if (list.size() <= 0) {
                    return null;
                }
                List<C19537ah> a = C19769e.m37138a(str, list);
                int b = C19769e.m37142b(str, list);
                C19638h a2 = C19749c.m36999a(str, true);
                if (a2 != null && b > 0) {
                    a2.setMemberCount(Math.max(0, a2.getMemberCount() - b));
                    C19749c.m37008a(a2, false);
                }
                if (a == null || a.isEmpty()) {
                    a = C19832ak.m37346a(str, list);
                }
                return new Pair(a2, a);
            }
        }, new AbstractC19985b<Pair<C19638h, List<C19537ah>>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19832ak.C198342 */

            static {
                Covode.recordClassIndex(22678);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Pair<C19638h, List<C19537ah>> pair) {
                Object obj;
                Pair<C19638h, List<C19537ah>> pair2 = pair;
                if (pair2 != null) {
                    if (pair2.first != null) {
                        C19640j.m36671a().mo31590a((C19638h) pair2.first, 8);
                    }
                    C19640j a = C19640j.m36671a();
                    List<C19537ah> list = (List) pair2.second;
                    if (list != null && !list.isEmpty()) {
                        C20014q a2 = C20014q.m37816a();
                        if (!list.isEmpty()) {
                            a2.mo31907b(list.get(0).getConversationId(), new C20014q.AbstractC20039a<AbstractC19669r>(list) {
                                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2003124 */

                                /* renamed from: a */
                                final /* synthetic */ List f47604a;

                                static {
                                    Covode.recordClassIndex(22876);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                                /* renamed from: a */
                                public final /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                                    rVar.mo28015c(this.f47604a);
                                }

                                {
                                    this.f47604a = r2;
                                }
                            });
                        }
                        for (AbstractC19667p pVar : a.f46668e) {
                            pVar.mo28015c(list);
                        }
                    }
                    C19510e.m36435a(kVar, true).mo31165a();
                }
                C19832ak akVar = C19832ak.this;
                if (pair2 != null) {
                    obj = pair2.second;
                } else {
                    obj = null;
                }
                akVar.mo31800a(obj);
                runnable.run();
            }
        });
    }
}
