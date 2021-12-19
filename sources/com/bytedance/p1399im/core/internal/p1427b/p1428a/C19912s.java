package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationInfoV2;
import com.bytedance.p1399im.core.proto.IMCMD;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.s */
public final class C19912s extends AbstractC19927w<List<C19638h>> {

    /* renamed from: a */
    public int f47299a;

    static {
        Covode.recordClassIndex(22756);
    }

    public C19912s() {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_conversation_list_body == null || kVar.f47482f.body.get_conversation_list_body.list == null) {
            return false;
        }
        return true;
    }

    public C19912s(AbstractC19478a<List<C19638h>> aVar, int i) {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue(), aVar);
        this.f47299a = 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19510e.m36435a(kVar, false).mo31165a();
            mo31803b(kVar);
            return;
        }
        final List<ConversationInfoV2> list = kVar.f47482f.body.get_conversation_list_body.list;
        final boolean booleanValue = kVar.f47482f.body.get_conversation_list_body.has_more.booleanValue();
        final long longValue = kVar.f47482f.body.get_conversation_list_body.next_cursor.longValue();
        RunnableC19987d.m37728a(new AbstractC19986c<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19912s.C199131 */

            static {
                Covode.recordClassIndex(22757);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ List<C19638h> mo31187a() {
                int intValue;
                List list = list;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    C19638h a = C19749c.m36999a(conversationInfoV2.conversation_id, true);
                    if (a == null) {
                        String str = conversationInfoV2.conversation_id;
                        if (conversationInfoV2.conversation_type == null) {
                            intValue = -1;
                        } else {
                            intValue = conversationInfoV2.conversation_type.intValue();
                        }
                        C19769e.m37145b(str, intValue, C19997f.m37768a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                        a = C19997f.m37764a(C19912s.this.f47299a, (C19638h) null, conversationInfoV2, 0);
                        C19749c.m37007a(a);
                        if (conversationInfoV2.first_page_participants.has_more != null && conversationInfoV2.first_page_participants.has_more.booleanValue()) {
                            new C19802ad(false).mo31743a(conversationInfoV2.conversation_id, 0, (AbstractC19977j) null);
                        }
                    }
                    arrayList.add(a);
                }
                return arrayList;
            }
        }, new AbstractC19985b<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19912s.C199142 */

            static {
                Covode.recordClassIndex(22758);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(List<C19638h> list) {
                List<C19638h> list2 = list;
                C19510e.m36435a(kVar, true).mo31165a();
                if (list2 != null && !list2.isEmpty()) {
                    for (C19638h hVar : list2) {
                        if (!(hVar == null || hVar.getConversationId() == null || C19640j.m36671a().mo31586a(hVar.getConversationId()) != null)) {
                            C19640j.m36671a().mo31589a(hVar);
                        }
                    }
                }
                C19912s.this.mo31801a(list2, longValue, booleanValue);
            }
        });
    }
}
