package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.utils.C20046v;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19585al;
import com.bytedance.p1399im.core.p1408d.C19589ao;
import com.bytedance.p1399im.core.p1408d.C19631f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.bytedance.p1399im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.ParticipantReadIndex;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.internal.b.a.c */
public final class C19861c extends AbstractC19927w<List<C19585al>> {
    static {
        Covode.recordClassIndex(22705);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19861c() {
        super(IMCMD.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue());
    }

    public C19861c(AbstractC19479b<List<C19585al>> bVar) {
        super(IMCMD.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.batch_get_conversation_participants_readindex == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31756a(List<C19538ai> list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (C19538ai aiVar : list) {
            if (aiVar.getSender() == C19483d.m36365a().f46157b.mo27953a()) {
                arrayList.add(aiVar);
                String conversationId = aiVar.getConversationId();
                C19638h a = C19640j.m36671a().mo31586a(conversationId);
                if (a != null) {
                    i = a.getInboxType();
                    arrayList2.add(conversationId);
                    arrayList3.add(Long.valueOf(a.getConversationShortId()));
                }
            }
        }
        mo31798a(i, new RequestBody.Builder().batch_get_conversation_participants_readindex(new BatchGetConversationParticipantsReadIndexRequestBody.Builder().conversation_id(arrayList2).conversation_short_id(arrayList3).request_from(str).min_index_required(Boolean.valueOf(C19483d.m36365a().mo31141b().f46229aK)).build()).build(), null, arrayList);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
            mo31803b(kVar);
        } else {
            z = true;
            List<C19538ai> list = (List) kVar.f47480d[0];
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (ConversationParticipantReadIndex conversationParticipantReadIndex : kVar.f47482f.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex) {
                hashMap.put(conversationParticipantReadIndex.conversation_id, conversationParticipantReadIndex);
            }
            C20046v.m37933b(new Runnable() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19861c.RunnableC198621 */

                static {
                    Covode.recordClassIndex(22706);
                }

                public final void run() {
                    C19589ao aoVar;
                    List<ConversationParticipantReadIndex> list = kVar.f47482f.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex;
                    C89219l.m154719c(list, "");
                    C19483d a = C19483d.m36365a();
                    C89219l.m154709a((Object) a, "");
                    if (a.mo31141b().f46228aJ) {
                        C19512f.m36450a("imsdk", " ConvReadInfoHelperimczy updateReadInfo netParticipantIndexInfoList = ".concat(String.valueOf(list)), (Throwable) null);
                        HashMap hashMap = new HashMap();
                        for (ConversationParticipantReadIndex conversationParticipantReadIndex : list) {
                            String str = conversationParticipantReadIndex.conversation_id;
                            HashMap<Long, C19589ao> hashMap2 = C19631f.f46654b.get(str);
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap<>();
                            }
                            C89219l.m154709a((Object) hashMap2, "");
                            for (ParticipantReadIndex participantReadIndex : conversationParticipantReadIndex.participantReadIndex) {
                                HashMap<Long, C19589ao> hashMap3 = C19631f.f46654b.get(str);
                                if (hashMap3 == null || (aoVar = hashMap3.get(participantReadIndex.user_id)) == null) {
                                    aoVar = new C19589ao();
                                }
                                C19483d a2 = C19483d.m36365a();
                                C89219l.m154709a((Object) a2, "");
                                if (a2.mo31141b().f46229aK && participantReadIndex.index_min != null) {
                                    Long l = participantReadIndex.index_min;
                                    C89219l.m154709a((Object) l, "");
                                    aoVar.mo31359a(l.longValue());
                                }
                                Long l2 = participantReadIndex.user_id;
                                C89219l.m154709a((Object) l2, "");
                                aoVar.f46506b = l2.longValue();
                                aoVar.f46505a = str;
                                long j = aoVar.f46508d;
                                Long l3 = participantReadIndex.index;
                                if (l3 == null || j != l3.longValue()) {
                                    Long l4 = participantReadIndex.index;
                                    C89219l.m154709a((Object) l4, "");
                                    aoVar.mo31360b(l4.longValue());
                                    aoVar.mo31363c(participantReadIndex.index.longValue() * 1000);
                                    if (!hashMap.containsKey(str)) {
                                        C89219l.m154709a((Object) str, "");
                                        hashMap.put(str, new HashMap());
                                    }
                                    HashMap hashMap4 = (HashMap) hashMap.get(str);
                                    if (hashMap4 != null) {
                                        hashMap4.put(participantReadIndex.user_id, aoVar);
                                    }
                                }
                                hashMap2.put(Long.valueOf(aoVar.f46506b), aoVar);
                            }
                            ConcurrentHashMap<String, HashMap<Long, C19589ao>> concurrentHashMap = C19631f.f46654b;
                            C89219l.m154709a((Object) str, "");
                            concurrentHashMap.put(str, hashMap2);
                        }
                        Set<String> keySet = C19631f.f46654b.keySet();
                        C89219l.m154709a((Object) keySet, "");
                        C19631f.m36666a(keySet);
                        C19631f.m36667a(hashMap);
                    }
                }
            });
            for (C19538ai aiVar : list) {
                ConversationParticipantReadIndex conversationParticipantReadIndex2 = (ConversationParticipantReadIndex) hashMap.get(aiVar.getConversationId());
                if (conversationParticipantReadIndex2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    C19638h a = C19640j.m36671a().mo31586a(conversationParticipantReadIndex2.conversation_id);
                    if (a == null || a.getMemberIds() == null || a.getMemberIds().isEmpty()) {
                        arrayList3.addAll(C19769e.m37137a(conversationParticipantReadIndex2.conversation_id));
                    } else {
                        arrayList3.addAll(a.getMemberIds());
                    }
                    arrayList3.remove(Long.valueOf(C19483d.m36365a().f46157b.mo27953a()));
                    for (ParticipantReadIndex participantReadIndex : conversationParticipantReadIndex2.participantReadIndex) {
                        if (participantReadIndex.user_id.longValue() != C19483d.m36365a().f46157b.mo27953a()) {
                            if ("1".equals(aiVar.getLocalExt().get("s:message_index_is_local"))) {
                                if (participantReadIndex.index.longValue() > aiVar.getIndex()) {
                                    arrayList2.add(participantReadIndex.user_id);
                                }
                            } else if (participantReadIndex.index.longValue() >= aiVar.getIndex()) {
                                arrayList2.add(participantReadIndex.user_id);
                            }
                        }
                    }
                    arrayList.add(new C19585al(arrayList2, arrayList3, conversationParticipantReadIndex2.conversation_id, aiVar.getMsgId(), aiVar.getSender()));
                }
            }
            mo31800a(arrayList);
        }
        C19510e.m36435a(kVar, z).mo31165a();
    }
}
