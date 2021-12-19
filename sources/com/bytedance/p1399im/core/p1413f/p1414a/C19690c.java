package com.bytedance.p1399im.core.p1413f.p1414a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19802ad;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19902o;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1415g.C19699c;
import com.bytedance.p1399im.core.proto.ClientMetricType;
import com.bytedance.p1399im.core.proto.ConversationCheckInfo;
import com.bytedance.p1399im.core.proto.ConversationInfoV2;
import com.bytedance.p1399im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.p1399im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.f.a.c */
public final class C19690c extends AbstractC19927w {

    /* renamed from: a */
    public volatile boolean f46811a = false;

    /* renamed from: b */
    private int f46812b;

    static {
        Covode.recordClassIndex(22534);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19690c(int i) {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
        this.f46812b = i;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_conversation_info_list_v2_body == null || kVar.f47482f.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31643a(int i, List<ConversationCheckInfo> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (ConversationCheckInfo conversationCheckInfo : list) {
                if (conversationCheckInfo != null) {
                    arrayList.add(new GetConversationInfoV2RequestBody.Builder().conversation_id(conversationCheckInfo.conversation_id).conversation_short_id(conversationCheckInfo.conversation_short_id).conversation_type(conversationCheckInfo.conversation_type).build());
                    if (arrayList.size() == 50) {
                        mo31798a(i, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, new Object[0]);
                        arrayList = new ArrayList();
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                mo31798a(i, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, new Object[0]);
            }
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        final int intValue = kVar.f47481e.inbox_type.intValue();
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19696b.m36817a("pull conversation_info error " + kVar.mo31870m(), -2001);
            return;
        }
        List<ConversationInfoV2> list = kVar.f47482f.body.get_conversation_info_list_v2_body.conversation_info_list;
        if (list == null || list.isEmpty()) {
            C19696b.m36817a("body isEmpty ", -2002);
            return;
        }
        for (final ConversationInfoV2 conversationInfoV2 : list) {
            if (conversationInfoV2 == null || (conversationInfoV2.is_participant != null && !conversationInfoV2.is_participant.booleanValue())) {
                C19696b.m36817a("not member", -2003);
            } else {
                new C19693d(new AbstractC19479b<MessageBody>() {
                    /* class com.bytedance.p1399im.core.p1413f.p1414a.C19690c.C196911 */

                    static {
                        Covode.recordClassIndex(22535);
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                        C19696b.m36817a("pull msg error " + uVar.toString(), -2004);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final /* synthetic */ void mo27861a(MessageBody messageBody) {
                        final MessageBody messageBody2 = messageBody;
                        if (messageBody2 != null) {
                            if (messageBody2.status != null && messageBody2.status.intValue() == 1) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("conversation_id", messageBody2.conversation_id);
                                hashMap.put("msg_id", String.valueOf(messageBody2.server_message_id));
                                C19699c.m36829a().mo31651a(ClientMetricType.COUNTER, "conversation_repair_last_msg_disable", hashMap);
                            }
                            C19983a.m37717a().execute(new Runnable() {
                                /* class com.bytedance.p1399im.core.p1413f.p1414a.C19690c.C196911.RunnableC196921 */

                                static {
                                    Covode.recordClassIndex(22536);
                                }

                                public final void run() {
                                    Pair<C19638h, Boolean> a = C19902o.m37457a(intValue, messageBody2.create_time.longValue(), conversationInfoV2);
                                    if (a != null && a.first != null && ((Boolean) a.second).booleanValue()) {
                                        C19638h hVar = (C19638h) a.first;
                                        C19640j.m36671a().mo31589a(hVar);
                                        if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                                            new C19802ad().mo31743a(hVar.getConversationId(), 0, (AbstractC19977j) null);
                                        }
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("conversation_id", hVar.getConversationId());
                                        C19699c.m36829a().mo31651a(ClientMetricType.COUNTER, "repaired_conversation", hashMap);
                                        if (!C19690c.this.f46811a) {
                                            C19699c.m36829a().mo31651a(ClientMetricType.COUNTER, "conversation_repair_performed", (Map<String, String>) null);
                                            C19696b.m36815a(1, false);
                                            C19690c.this.f46811a = true;
                                        }
                                    }
                                }
                            });
                        }
                    }
                }).mo31646a(intValue, conversationInfoV2.conversation_id, conversationInfoV2.conversation_short_id.longValue(), conversationInfoV2.conversation_type.intValue(), 0);
            }
        }
    }
}
