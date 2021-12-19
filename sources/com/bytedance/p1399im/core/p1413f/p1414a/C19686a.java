package com.bytedance.p1399im.core.p1413f.p1414a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1408d.C19586am;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1415g.C19699c;
import com.bytedance.p1399im.core.proto.ClientMetricType;
import com.bytedance.p1399im.core.proto.ConversationCheckInfo;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.f.a.a */
public final class C19686a extends AbstractC19927w {
    static {
        Covode.recordClassIndex(22530);
    }

    public C19686a() {
        super(IMCMD.GET_CONVERSATIONS_CHECKINFO.getValue());
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.get_conversations_checkinfo_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m36788a(String str) {
        if (C19786a.m37236a(str)) {
            return true;
        }
        Map<Integer, Map<String, MessageBody>> map = C19786a.f46972h;
        if (map != null) {
            for (Map<String, MessageBody> map2 : map.values()) {
                if (map2 != null && map2.containsKey(str)) {
                    return true;
                }
            }
        }
        Map<Integer, List<String>> map3 = C19786a.f46974j;
        if (map3 == null) {
            return false;
        }
        for (List<String> list : map3.values()) {
            if (list != null && list.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r5.f47482f.body.get_conversations_checkinfo_body.conversation_checkinfo_list;
     */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31129a(com.bytedance.p1399im.core.internal.p1431d.C19978k r5, java.lang.Runnable r6) {
        /*
            r4 = this;
            boolean r0 = r4.mo31130a(r5)
            if (r0 == 0) goto L_0x001c
            boolean r0 = r5.mo31869l()
            if (r0 == 0) goto L_0x001c
            com.bytedance.im.core.proto.Response r0 = r5.f47482f
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body
            com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody r0 = r0.get_conversations_checkinfo_body
            java.util.List<com.bytedance.im.core.proto.ConversationCheckInfo> r3 = r0.conversation_checkinfo_list
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.bytedance.im.core.proto.Request r0 = r5.f47481e
            java.lang.Integer r0 = r0.inbox_type
            int r2 = r0.intValue()
            java.util.concurrent.Executor r1 = com.bytedance.p1399im.core.internal.p1434e.C19983a.m37717a()
            com.bytedance.im.core.f.a.a$1 r0 = new com.bytedance.im.core.f.a.a$1
            r0.<init>(r2, r3)
            r1.execute(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1413f.p1414a.C19686a.mo31129a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void");
    }

    /* renamed from: a */
    public static void m36787a(int i, List<ConversationCheckInfo> list, long j) {
        List<ConversationCheckInfo> list2;
        int i2;
        if (list == null || list.isEmpty()) {
            list2 = list;
        } else {
            list2 = new ArrayList<>();
            for (ConversationCheckInfo conversationCheckInfo : list) {
                if (conversationCheckInfo != null && !m36788a(conversationCheckInfo.conversation_id)) {
                    list2.add(conversationCheckInfo);
                }
            }
        }
        int i3 = 0;
        if (!C19738a.m36948n()) {
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = 0;
            }
            new C19690c(i2).mo31643a(i, list2);
        }
        ArrayList arrayList = new ArrayList();
        if (list2 != null && !list2.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("leak_conversation_count", String.valueOf(list2.size()));
            arrayList.add(new C19586am(ClientMetricType.COUNTER, "check_conversation_leak", 1, hashMap));
        }
        arrayList.add(new C19586am(ClientMetricType.TIMER, "check_conversation_cost", System.currentTimeMillis() - j, null));
        C19699c.m36829a().mo31654a(arrayList);
        if (list2 != null) {
            i3 = list2.size();
        }
        C19696b.m36815a(i3, true);
    }
}
