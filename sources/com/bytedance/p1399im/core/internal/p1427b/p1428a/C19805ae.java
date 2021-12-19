package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C20010n;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19535af;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19598aw;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.bytedance.p1399im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageDirection;
import com.bytedance.p1399im.core.proto.MessageInfo;
import com.bytedance.p1399im.core.proto.MessageStatus;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.ae */
public final class C19805ae extends AbstractC19927w<C19535af> {

    /* renamed from: a */
    public C19638h f47031a;

    /* renamed from: b */
    public C19535af f47032b;

    static {
        Covode.recordClassIndex(22649);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19805ae() {
        this(null);
    }

    public C19805ae(AbstractC19479b<C19535af> bVar) {
        super(IMCMD.GET_MESSAGE_INFO_BY_INDEX_V2_RANGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_message_info_by_index_v2_range_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<C19538ai> m37295a(List<MessageInfo> list) {
        boolean z;
        C19598aw a;
        ArrayList arrayList = new ArrayList();
        if (C19995d.m37744a(list)) {
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler saveMessage empty", (Throwable) null);
            return arrayList;
        }
        try {
            C19742b.m36974a("LoadMsgByIndexV2RangeHandler.saveMsg");
            for (MessageInfo messageInfo : list) {
                if (!(messageInfo == null || messageInfo.body == null)) {
                    if (messageInfo.status == MessageStatus.AVAILABLE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(!z || (a = C19821ai.m37325a(messageInfo.body, true, (Pair<String, String>) null, 6)) == null || a.f46543a == null)) {
                        arrayList.add(a.f46543a);
                    }
                }
            }
            C19742b.m36975a("LoadMsgByIndexV2RangeHandler.saveMsg", true);
        } catch (Exception e) {
            C19742b.m36975a("LoadMsgByIndexV2RangeHandler.saveMsg", false);
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler saveMsg failed", e);
            C19696b.m36814a(6, e);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        final boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler handleResponse, isSuccess:" + z + ", seqId:" + kVar.f47477a, (Throwable) null);
        RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19805ae.C198061 */

            static {
                Covode.recordClassIndex(22650);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ Boolean mo31187a() {
                if (!z) {
                    C19510e.m36435a(kVar, false);
                    C19805ae.this.f47032b.f46381g = C19672u.m36756a(kVar);
                    C19805ae aeVar = C19805ae.this;
                    aeVar.mo31800a(aeVar.f47032b);
                    return false;
                }
                GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody = kVar.f47482f.body.get_message_info_by_index_v2_range_body;
                List<C19538ai> a = C19805ae.m37295a(getMessageInfoByIndexV2RangeResponseBody.infos);
                C19535af afVar = C19805ae.this.f47032b;
                Long l = getMessageInfoByIndexV2RangeResponseBody.next_index_in_conversation_v2;
                boolean booleanValue = getMessageInfoByIndexV2RangeResponseBody.has_more.booleanValue();
                if (!C19995d.m37744a(a)) {
                    afVar.f46380f.addAll(a);
                }
                if (!booleanValue) {
                    afVar.f46376b = true;
                }
                if (l == null || l.longValue() < 0) {
                    C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler invalid nextIndexV2:".concat(String.valueOf(l)), (Throwable) null);
                } else if (afVar.f46375a == 1) {
                    afVar.f46379e.start = l.longValue() + 1;
                    if (afVar.f46379e.end <= 0) {
                        afVar.f46379e.end = afVar.f46378d.end;
                    }
                    afVar.f46378d.end = l.longValue();
                } else {
                    if (afVar.f46379e.start <= 0) {
                        afVar.f46379e.start = afVar.f46378d.start;
                    }
                    afVar.f46379e.end = l.longValue() - 1;
                    afVar.f46378d.start = l.longValue();
                }
                if (!getMessageInfoByIndexV2RangeResponseBody.has_more.booleanValue()) {
                    C19805ae aeVar2 = C19805ae.this;
                    aeVar2.mo31800a(aeVar2.f47032b);
                }
                return true;
            }
        }, new AbstractC19985b<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19805ae.C198072 */

            static {
                Covode.recordClassIndex(22651);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Boolean bool) {
                Boolean bool2 = bool;
                C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler handleResponse onCallback, isSuccess:" + bool2 + ", result:" + C19805ae.this.f47032b, (Throwable) null);
                if (!bool2.booleanValue()) {
                    C19510e.m36435a(kVar, false).mo31165a();
                } else if (kVar.f47482f.body.get_message_info_by_index_v2_range_body.has_more.booleanValue()) {
                    C19805ae aeVar = C19805ae.this;
                    aeVar.mo31744a(aeVar.f47031a, C19805ae.this.f47032b.f46378d.start, C19805ae.this.f47032b.f46378d.end, C19805ae.this.f47032b.f46375a);
                } else {
                    C19510e.m36435a(kVar, true).mo31165a();
                }
            }
        }, C19983a.m37721c());
    }

    /* renamed from: a */
    public final void mo31744a(C19638h hVar, long j, long j2, int i) {
        if (hVar == null) {
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler pull, conversation null", (Throwable) null);
            mo31799a(C19672u.m36755a().mo31630a("conversation null").f46736a);
        } else if (hVar.isTemp() || hVar.isWaitingInfo()) {
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler pull, conversation invalid, cid:" + hVar.getConversationId() + ", isTemp:" + hVar.isTemp() + "isWaitingInfo:" + hVar.isWaitingInfo(), (Throwable) null);
            mo31799a(C19672u.m36755a().mo31630a("conversation invalid").f46736a);
        } else if (j > j2) {
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler pull invalid indexV2, min:" + j + ", max:" + j2, (Throwable) null);
            mo31799a(C19672u.m36755a().mo31630a("indexV2 invalid").f46736a);
        } else {
            MessageDirection a = C20010n.m37804a(i);
            if (a == null) {
                C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler pull, direction invalid:".concat(String.valueOf(i)), (Throwable) null);
                mo31799a(C19672u.m36755a().mo31630a("direction invalid").f46736a);
                return;
            }
            if (this.f47032b == null) {
                this.f47032b = new C19535af(j, j2, i);
            }
            if (this.f47031a == null) {
                this.f47031a = hVar;
            }
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler pull start, result:" + this.f47032b, (Throwable) null);
            mo31798a(hVar.getInboxType(), new RequestBody.Builder().get_message_info_by_index_v2_range_body(new GetMessageInfoByIndexV2RangeRequestBody.Builder().conversation_id(hVar.getConversationId()).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).min_index_in_conversation_v2(Long.valueOf(j)).max_index_in_conversation_v2(Long.valueOf(j2)).direction(a).build()).build(), (AbstractC19977j) null, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo31745a(String str, long j, long j2, int i) {
        if (TextUtils.isEmpty(str)) {
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler pull, invalid conversationId", (Throwable) null);
            mo31799a(C19672u.m36755a().mo31630a("conversationId invalid").f46736a);
            return;
        }
        C19638h a = C19640j.m36671a().mo31586a(str);
        if (a == null) {
            C19512f.m36457b("imsdk", "LoadMsgByIndexV2RangeHandler pull, conversation null, cid:".concat(String.valueOf(str)), (Throwable) null);
            mo31799a(C19672u.m36755a().mo31630a("conversation null").f46736a);
            return;
        }
        mo31744a(a, j, j2, i);
    }
}
