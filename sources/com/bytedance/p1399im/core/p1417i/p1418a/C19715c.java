package com.bytedance.p1399im.core.p1417i.p1418a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19598aw;
import com.bytedance.p1399im.core.proto.GetStrangerMessagesRequestBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.i.a.c */
public final class C19715c extends AbstractC19927w<List<C19538ai>> {
    static {
        Covode.recordClassIndex(22559);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19715c(AbstractC19479b<List<C19538ai>> bVar) {
        super(IMCMD.GET_STRANGER_MESSAGES_IN_CONVERSATION.getValue(), bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_stranger_messages_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31659a(int i, long j) {
        C19512f.m36457b("imsdk", "StrangerMsgHandler get, inbox:" + i + ", shortId:" + j, (Throwable) null);
        mo31798a(i, new RequestBody.Builder().get_stranger_messages_body(new GetStrangerMessagesRequestBody.Builder().reset_unread_count(false).conversation_short_id(Long.valueOf(j)).build()).build(), null, new Object[0]);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            C19510e.m36435a(kVar, false).mo31165a();
            return;
        }
        final List<MessageBody> list = kVar.f47482f.body.get_stranger_messages_body.messages;
        if (list == null || list.isEmpty()) {
            C19512f.m36457b("imsdk", "StrangerMsgHandler saveMsg, null or empty", (Throwable) null);
            mo31800a((Object) null);
        } else {
            RunnableC19987d.m37729a(new AbstractC19986c<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1417i.p1418a.C19715c.C197161 */

                static {
                    Covode.recordClassIndex(22560);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<C19538ai> mo31187a() {
                    C19598aw a;
                    C19742b.m36974a("StrangerMsgHandler.saveMsg(String,List,boolean)");
                    ArrayList arrayList = new ArrayList();
                    try {
                        C19512f.m36457b("imsdk", "StrangerMsgHandler saveMsg start, messages:" + list.size(), (Throwable) null);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        for (MessageBody messageBody : list) {
                            if (!((messageBody.status != null && messageBody.status.intValue() == 1) || (a = C19821ai.m37325a(messageBody, true, (Pair<String, String>) null, 1)) == null || a.f46543a == null)) {
                                arrayList.add(a.f46543a);
                            }
                        }
                        C19512f.m36457b("imsdk", "StrangerMsgHandler saveMsg end, list:" + arrayList.size(), (Throwable) null);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                            jSONObject.put("msg_count", list.size());
                            jSONObject.put("msg_source", 1);
                            C19510e.m36438a("im_save_msg_list_duration", jSONObject);
                        } catch (Exception unused) {
                        }
                        C19742b.m36975a("StrangerMsgHandler.saveMsg(String,List,boolean)", true);
                    } catch (Exception e) {
                        C19742b.m36975a("StrangerMsgHandler.saveMsg(String,List,boolean)", false);
                        C20002j.m37781b("LoadHistoryHandler saveMsg", e);
                    }
                    return arrayList;
                }
            }, new AbstractC19985b<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1417i.p1418a.C19715c.C197172 */

                static {
                    Covode.recordClassIndex(22561);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31188a(List<C19538ai> list) {
                    C19715c.this.mo31800a(list);
                }
            }, C19983a.m37721c());
        }
        C19510e.m36435a(kVar, true).mo31165a();
    }
}
