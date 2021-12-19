package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.AbstractC19667p;
import com.bytedance.p1399im.core.p1408d.AbstractC19669r;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationOperationStatus;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.Participant;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.as */
public final class C19854as extends AbstractC19927w<C19537ah> {
    static {
        Covode.recordClassIndex(22698);
    }

    C19854as() {
        super(IMCMD.UPDATE_CONVERSATION_PARTICIPANT.getValue());
    }

    public C19854as(AbstractC19479b<C19537ah> bVar) {
        super(IMCMD.UPDATE_CONVERSATION_PARTICIPANT.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.update_conversation_participant_body == null || kVar.f47482f.body.update_conversation_participant_body.status == null || kVar.f47482f.body.update_conversation_participant_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f47482f.body.update_conversation_participant_body.participant == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        final String str = (String) kVar.f47480d[0];
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31165a();
            mo31803b(kVar);
            runnable.run();
            return;
        }
        final Participant participant = kVar.f47482f.body.update_conversation_participant_body.participant;
        RunnableC19987d.m37728a(new AbstractC19986c<C19537ah>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19854as.C198551 */

            static {
                Covode.recordClassIndex(22699);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ C19537ah mo31187a() {
                int conversationType;
                C19537ah a = C19997f.m37760a(str, participant);
                C19638h a2 = C19640j.m36671a().mo31586a(str);
                String str = str;
                if (a2 == null) {
                    conversationType = -1;
                } else {
                    conversationType = a2.getConversationType();
                }
                if (C19769e.m37141a(str, conversationType, Collections.singletonList(a))) {
                    return a;
                }
                return null;
            }
        }, new AbstractC19985b<C19537ah>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19854as.C198562 */

            static {
                Covode.recordClassIndex(22700);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19537ah ahVar) {
                if (ahVar != null) {
                    C19640j a = C19640j.m36671a();
                    List<C19537ah> singletonList = Collections.singletonList(ahVar);
                    if (singletonList != null && !singletonList.isEmpty()) {
                        C20014q a2 = C20014q.m37816a();
                        if (!singletonList.isEmpty()) {
                            a2.mo31907b(singletonList.get(0).getConversationId(), new C20014q.AbstractC20039a<AbstractC19669r>(singletonList) {
                                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2002922 */

                                /* renamed from: a */
                                final /* synthetic */ List f47600a;

                                static {
                                    Covode.recordClassIndex(22874);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                                /* renamed from: a */
                                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                                    rVar.mo28006a(this.f47600a);
                                }

                                {
                                    this.f47600a = r2;
                                }
                            });
                        }
                        for (AbstractC19667p pVar : a.f46668e) {
                            pVar.mo28006a(singletonList);
                        }
                    }
                    C19510e.m36435a(kVar, true).mo31164a("conversation_id", str).mo31165a();
                    C19854as.this.mo31800a(ahVar);
                } else {
                    C19854as.this.mo31803b(C19978k.m37686a(-3001));
                }
                runnable.run();
            }
        });
    }
}
