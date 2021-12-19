package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19598aw;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessagesInConversationResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.b.a.af */
public final class C19808af extends AbstractC19927w {
    static {
        Covode.recordClassIndex(22652);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19808af() {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19510e.m36435a(kVar, false).mo31165a();
            return;
        }
        final String str = (String) kVar.f47480d[0];
        MessagesInConversationResponseBody messagesInConversationResponseBody = kVar.f47482f.body.messages_in_conversation_body;
        final List<MessageBody> list = messagesInConversationResponseBody.messages;
        final boolean booleanValue = messagesInConversationResponseBody.has_more.booleanValue();
        RunnableC19987d.m37729a(new AbstractC19986c<List<C19538ai>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19808af.C198113 */

            static {
                Covode.recordClassIndex(22655);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<C19538ai> mo31187a() {
                int i;
                C19598aw a;
                C19742b.m36974a("LoadNewerHandler.saveMsg(String,List,boolean)");
                ArrayList arrayList = new ArrayList();
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    List<MessageBody> list = list;
                    if (list != null) {
                        for (MessageBody messageBody : list) {
                            if (!((messageBody.status != null && messageBody.status.intValue() == 1) || (a = C19821ai.m37325a(messageBody, true, (Pair<String, String>) null, 1)) == null || a.f46543a == null)) {
                                arrayList.add(a.f46543a);
                            }
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        List list2 = list;
                        if (list2 != null) {
                            i = list2.size();
                        } else {
                            i = 0;
                        }
                        jSONObject.put("msg_count", i);
                        jSONObject.put("msg_source", 1);
                        C19510e.m36438a("im_save_msg_list_duration", jSONObject);
                    } catch (Exception unused) {
                    }
                    if (!booleanValue) {
                        C19821ai.m37330a(str);
                    }
                    C19742b.m36975a("LoadNewerHandler.saveMsg(String,List,boolean)", true);
                    Collections.sort(arrayList);
                } catch (Exception e) {
                    C19742b.m36975a("LoadNewerHandler.saveMsg(String,List,boolean)", false);
                    C19512f.m36457b("imsdk", "LoadNewerHandler saveMsg", e);
                    C19696b.m36814a(1, e);
                }
                return arrayList;
            }
        }, new AbstractC19985b<List<C19538ai>>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19808af.C198124 */

            static {
                Covode.recordClassIndex(22656);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(List<C19538ai> list) {
                C20014q.m37816a().mo31913c(str, list);
            }
        }, C19983a.m37721c());
        C19510e.m36435a(kVar, true).mo31165a();
    }
}
