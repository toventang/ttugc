package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationInfoV2;
import com.bytedance.p1399im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.p1399im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.im.core.internal.b.a.p */
public final class C19906p extends AbstractC19927w {

    /* renamed from: a */
    public boolean f47284a;

    /* renamed from: b */
    public List<C19638h> f47285b;

    static {
        Covode.recordClassIndex(22750);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    private C19906p() {
        this(false);
    }

    private C19906p(boolean z) {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
        this.f47284a = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_conversation_info_list_v2_body == null || kVar.f47482f.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m37471a(final int i, final Map<String, MessageBody> map) {
        Set<String> keySet;
        if (map != null && !map.isEmpty()) {
            if (this.f47284a && (keySet = map.keySet()) != null && !keySet.isEmpty()) {
                if (C19786a.f46974j.get(Integer.valueOf(i)) == null) {
                    C19786a.f46974j.put(Integer.valueOf(i), new ArrayList(keySet));
                } else {
                    C19786a.f46974j.get(Integer.valueOf(i)).addAll(keySet);
                }
            }
            C19983a.m37717a().execute(new Runnable() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19906p.RunnableC199093 */

                static {
                    Covode.recordClassIndex(22753);
                }

                public final void run() {
                    C19906p.this.f47285b = new ArrayList();
                    for (MessageBody messageBody : map.values()) {
                        C19638h a = C19902o.m37458a(i, messageBody);
                        if (a != null) {
                            C19906p.this.f47285b.add(a);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (MessageBody messageBody2 : map.values()) {
                        arrayList.add(new GetConversationInfoV2RequestBody.Builder().conversation_id(messageBody2.conversation_id).conversation_short_id(messageBody2.conversation_short_id).conversation_type(messageBody2.conversation_type).build());
                    }
                    RequestBody build = new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build();
                    C19906p.this.mo31798a(i, build, null, map);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        List<C19638h> list;
        final int intValue = kVar.f47481e.inbox_type.intValue();
        final Map map = (Map) kVar.f47480d[0];
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19786a.m37229a(intValue);
            C19510e.m36435a(kVar, false).mo31165a();
            if (kVar.f47485i == -1000 && (list = this.f47285b) != null && !list.isEmpty()) {
                C19640j.m36671a().mo31594a(false, 6, (C19638h[]) this.f47285b.toArray(new C19638h[0]));
            }
            if (this.f47284a && map != null) {
                C19786a.m37233a(intValue, map.keySet());
                return;
            }
            return;
        }
        final HashSet hashSet = new HashSet();
        RunnableC19987d.m37728a(new AbstractC19986c<List<Pair<Pair<C19638h, Boolean>, List<C19537ah>>>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19906p.C199071 */

            static {
                Covode.recordClassIndex(22751);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ List<Pair<Pair<C19638h, Boolean>, List<C19537ah>>> mo31187a() {
                Pair<C19638h, Boolean> a;
                List<ConversationInfoV2> list = kVar.f47482f.body.get_conversation_info_list_v2_body.conversation_info_list;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    MessageBody messageBody = (MessageBody) map.get(conversationInfoV2.conversation_id);
                    if (!(messageBody == null || (a = C19902o.m37457a(intValue, messageBody.create_time.longValue(), conversationInfoV2)) == null || a.first == null)) {
                        arrayList.add(new Pair(a, conversationInfoV2.first_page_participants != null ? C19997f.m37768a(((C19638h) a.first).getConversationId(), conversationInfoV2.first_page_participants.participants) : null));
                        if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                            hashSet.add(conversationInfoV2.conversation_id);
                        }
                    }
                }
                return arrayList;
            }
        }, new AbstractC19985b<List<Pair<Pair<C19638h, Boolean>, List<C19537ah>>>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19906p.C199082 */

            static {
                Covode.recordClassIndex(22752);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(List<Pair<Pair<C19638h, Boolean>, List<C19537ah>>> list) {
                Map map;
                List<Pair<Pair<C19638h, Boolean>, List<C19537ah>>> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Pair<Pair<C19638h, Boolean>, List<C19537ah>> pair : list2) {
                        arrayList.add(((Pair) pair.first).first);
                        if (hashSet.contains(((C19638h) ((Pair) pair.first).first).getConversationId())) {
                            new C19802ad().mo31743a(((C19638h) ((Pair) pair.first).first).getConversationId(), 0, (AbstractC19977j) null);
                        } else {
                            C19640j.m36671a().mo31592a(((C19638h) ((Pair) pair.first).first).getConversationId(), (List) pair.second);
                        }
                    }
                    C19640j.m36671a().mo31594a(true, 5, (C19638h[]) arrayList.toArray(new C19638h[arrayList.size()]));
                }
                C19510e.m36435a(kVar, true).mo31165a();
                C19786a.m37229a(intValue);
                if (C19906p.this.f47284a && (map = map) != null) {
                    C19786a.m37233a(intValue, map.keySet());
                }
            }
        });
    }

    /* renamed from: a */
    public static void m37472a(int i, Map<String, MessageBody> map, boolean z) {
        if (!(map == null || map.isEmpty())) {
            while (true) {
                HashMap hashMap = null;
                for (String str : map.keySet()) {
                    MessageBody messageBody = map.get(str);
                    if (messageBody != null) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(str, messageBody);
                        if (hashMap.size() == 50) {
                            new C19906p(z).m37471a(i, hashMap);
                        }
                    }
                }
                new C19906p(z).m37471a(i, hashMap);
                return;
            }
        }
    }
}
