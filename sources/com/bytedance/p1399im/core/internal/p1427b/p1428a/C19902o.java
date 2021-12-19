package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.internal.utils.C20010n;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19656k;
import com.bytedance.p1399im.core.p1417i.C19737g;
import com.bytedance.p1399im.core.proto.ConversationInfoV2;
import com.bytedance.p1399im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.im.core.internal.b.a.o */
public final class C19902o extends AbstractC19927w<C19638h> {

    /* renamed from: a */
    public C19638h f47266a;

    static {
        Covode.recordClassIndex(22746);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        final int intValue = kVar.f47481e.inbox_type.intValue();
        final String str = (String) kVar.f47480d[0];
        ((Long) kVar.f47480d[1]).longValue();
        ((Integer) kVar.f47480d[2]).intValue();
        final long longValue = ((Long) kVar.f47480d[3]).longValue();
        C19786a.f46966b.remove(str);
        C19512f.m36457b("imsdk", "Get Conversation Info finish: ".concat(String.valueOf(str)), (Throwable) null);
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            runnable.run();
            C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31165a();
            if (kVar.f47485i == -1000 && this.f47266a != null) {
                C19640j.m36671a().mo31590a(this.f47266a, 6);
                return;
            }
            return;
        }
        final ConversationInfoV2 conversationInfoV2 = kVar.f47482f.body.get_conversation_info_v2_body.conversation_info;
        RunnableC19987d.m37728a(new AbstractC19986c<Pair<C19638h, Boolean>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19902o.C199031 */

            static {
                Covode.recordClassIndex(22747);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Pair<C19638h, Boolean> mo31187a() {
                return C19902o.m37457a(intValue, longValue, conversationInfoV2);
            }
        }, new AbstractC19985b<Pair<C19638h, Boolean>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19902o.C199042 */

            static {
                Covode.recordClassIndex(22748);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Pair<C19638h, Boolean> pair) {
                Pair<C19638h, Boolean> pair2 = pair;
                if (pair2 != null) {
                    C19640j.m36671a().mo31590a((C19638h) pair2.first, 5);
                    if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                        new C19802ad().mo31743a(((C19638h) pair2.first).getConversationId(), 0, (AbstractC19977j) null);
                    }
                    C19902o.this.mo31800a(pair2.first);
                    C19786a.m37237b(intValue, str);
                    C19510e.m36435a(kVar, true).mo31164a("conversation_id", str).mo31165a();
                } else {
                    C19902o.this.mo31803b(C19978k.m37686a(-3001));
                }
                runnable.run();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        return (kVar.f47482f.body == null || kVar.f47482f.body.get_conversation_info_v2_body == null || kVar.f47482f.body.get_conversation_info_v2_body.conversation_info == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo31785a(String str) {
        C19638h a = C19640j.m36671a().mo31586a(str);
        if (a == null || a.isTemp()) {
            mo31803b(C19978k.m37686a(-1017));
        } else if (C19786a.m37236a(str)) {
            C19512f.m36457b("imsdk", "hasGettingConversation: ".concat(String.valueOf(str)), (Throwable) null);
            mo31803b(C19978k.m37686a(-1018));
        } else {
            m37461a(a.getInboxType(), str, a.getConversationShortId(), a.getConversationType(), a.getUpdatedTime());
        }
    }

    public C19902o() {
        super(IMCMD.GET_CONVERSATION_INFO_V2.getValue());
    }

    public C19902o(AbstractC19479b<C19638h> bVar) {
        super(IMCMD.GET_CONVERSATION_INFO_V2.getValue(), bVar);
    }

    /* renamed from: a */
    public static C19638h m37458a(int i, MessageBody messageBody) {
        if (messageBody == null) {
            return null;
        }
        return m37459a(i, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue(), messageBody.create_time.longValue(), 0);
    }

    /* renamed from: a */
    public static Pair<C19638h, Boolean> m37457a(int i, long j, ConversationInfoV2 conversationInfoV2) {
        int i2;
        boolean z;
        boolean z2;
        try {
            C19742b.m36974a("saveSingleConversation");
            C19638h a = C19749c.m36999a(conversationInfoV2.conversation_id, true);
            if (a == null || a.isMember() || conversationInfoV2.is_participant == null || conversationInfoV2.is_participant.booleanValue()) {
                C19769e.m37148d(conversationInfoV2.conversation_id);
                String str = conversationInfoV2.conversation_id;
                if (conversationInfoV2.conversation_type == null) {
                    i2 = -1;
                } else {
                    i2 = conversationInfoV2.conversation_type.intValue();
                }
                C19769e.m37141a(str, i2, C19997f.m37768a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                C19638h a2 = C19997f.m37764a(i, a, conversationInfoV2, j);
                C19737g.m36927a(a2);
                if (a == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = C19749c.m37007a(a2);
                } else {
                    z2 = C19749c.m37008a(a2, true);
                }
                C19742b.m36975a("saveSingleConversation", true);
                if (z2) {
                    return new Pair<>(a2, Boolean.valueOf(z));
                }
                return null;
            }
            C19742b.m36975a("saveSingleConversation", true);
            return null;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "GetConversationInfoHandler saveSingleConversation", e);
            C19742b.m36975a("saveSingleConversation", false);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo31783a(int i, C19538ai aiVar, int i2) {
        m37462a(i, aiVar.getConversationId(), aiVar.getConversationShortId(), aiVar.getConversationType(), aiVar.getCreatedAt(), i2, false);
    }

    /* renamed from: a */
    private synchronized void m37461a(int i, String str, long j, int i2, long j2) {
        MethodCollector.m26663i(10575);
        mo31784a(i, str, j, i2, j2, false);
        MethodCollector.m26664o(10575);
    }

    /* renamed from: a */
    public static C19638h m37459a(int i, String str, long j, int i2, long j2, int i3) {
        return m37460a(i, str, j, i2, j2, i3, (C19538ai) null);
    }

    /* renamed from: a */
    public final synchronized void mo31784a(int i, String str, long j, int i2, long j2, boolean z) {
        MethodCollector.m26663i(10576);
        m37462a(i, str, j, i2, j2, 0, z);
        MethodCollector.m26664o(10576);
    }

    /* renamed from: a */
    public static C19638h m37460a(int i, String str, long j, int i2, long j2, int i3, C19538ai aiVar) {
        Exception e;
        C19638h hVar = null;
        try {
            if (C19749c.m37021c(str)) {
                C19512f.m36457b("imsdk", "syncBuildLocalConversation: convId=" + str + ", already has local", (Throwable) null);
                return null;
            }
            C19512f.m36457b("imsdk", "syncBuildLocalConversation: convId=" + str + ", shortId=" + j + ", type=" + i2 + ", time=" + j2, (Throwable) null);
            C19638h hVar2 = new C19638h();
            try {
                hVar2.setInboxType(i);
                hVar2.setConversationId(str);
                hVar2.setConversationShortId(j);
                hVar2.setConversationType(i2);
                hVar2.setUpdatedTime(j2);
                if (hVar2.isSingleChat()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(C19483d.m36365a().f46157b.mo27953a()));
                    arrayList.add(Long.valueOf(C19656k.m36718a(str)));
                    hVar2.setMemberIds(arrayList);
                    hVar2.setMemberCount(2);
                }
                hVar2.setIsMember(true);
                if (aiVar != null) {
                    hVar2.setLastMessageIndex(C20010n.m37810d(aiVar));
                    hVar2.setLastMessage(aiVar);
                    hVar2.setMaxIndexV2(C20010n.m37811e(aiVar));
                } else {
                    hVar2.setLastMessageIndex(C19777i.m37200e(str));
                    hVar2.setLastMessage(C19777i.m37203h(str));
                    hVar2.setMaxIndexV2(C19777i.m37201f(str));
                }
                hVar2.setBadgeCount(i3);
                HashMap hashMap = new HashMap();
                hashMap.put("s:conv_wait_info", "1");
                hVar2.setLocalExt(hashMap);
                if (C19749c.m37007a(hVar2)) {
                    return hVar2;
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                hVar = hVar2;
                C19512f.m36457b("imsdk", "GetConversationInfoHandler syncBuildLocalConversation", e);
                return hVar;
            }
        } catch (Exception e3) {
            e = e3;
            C19512f.m36457b("imsdk", "GetConversationInfoHandler syncBuildLocalConversation", e);
            return hVar;
        }
    }

    /* renamed from: a */
    private synchronized void m37462a(final int i, final String str, final long j, final int i2, final long j2, final int i3, boolean z) {
        MethodCollector.m26663i(10715);
        if (z || !C19786a.m37236a(str)) {
            C19983a.m37717a().execute(new Runnable() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19902o.RunnableC199053 */

                static {
                    Covode.recordClassIndex(22749);
                }

                public final void run() {
                    C19902o.this.f47266a = C19902o.m37459a(i, str, j, i2, j2, i3);
                    RequestBody build = new RequestBody.Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).build()).build();
                    C19902o.this.mo31798a(i, build, null, str, Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2));
                    C19786a.f46966b.add(str);
                }
            });
            MethodCollector.m26664o(10715);
            return;
        }
        C19512f.m36457b("imsdk", "hasGettingConversation: ".concat(String.valueOf(str)), (Throwable) null);
        MethodCollector.m26664o(10715);
    }
}
