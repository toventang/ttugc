package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19527ab;
import com.bytedance.p1399im.core.p1408d.C19531ac;
import com.bytedance.p1399im.core.p1408d.C19532ad;
import com.bytedance.p1399im.core.p1408d.C19590ap;
import com.bytedance.p1399im.core.p1408d.C19598aw;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageDirection;
import com.bytedance.p1399im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.aa */
public final class C19791aa extends AbstractC19927w<C19531ac> {

    /* renamed from: a */
    public C19531ac f46996a = new C19531ac();

    /* renamed from: b */
    long f46997b;

    /* renamed from: c */
    public String f46998c;

    /* renamed from: d */
    private int f46999d;

    static {
        Covode.recordClassIndex(22635);
    }

    public C19791aa(AbstractC19479b<C19531ac> bVar) {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue(), bVar);
        C20041s.m37876a();
        this.f46997b = C20041s.m37890d();
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
    public final void mo31129a(final C19978k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        C19512f.m36457b("imsdk", "LeakMsgRepairToOldHandler handleResponse, isSuccess:".concat(String.valueOf(z)), (Throwable) null);
        if (!z) {
            this.f46996a.f46368h = C19672u.m36756a(kVar);
            mo31800a(this.f46996a);
            return;
        }
        final List<MessageBody> list = kVar.f47482f.body.messages_in_conversation_body.messages;
        if (C19995d.m37744a(list)) {
            this.f46996a.f46361a = true;
            mo31800a(this.f46996a);
            return;
        }
        RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19791aa.C197921 */

            static {
                Covode.recordClassIndex(22636);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Boolean mo31187a() {
                boolean z;
                try {
                    C19742b.m36974a("LeakMsgRepairToOldHandler.handleResponse()");
                    C19791aa aaVar = C19791aa.this;
                    List<MessageBody> list = list;
                    C19512f.m36457b("imsdk", "LeakMsgRepairToOldHandler repair start, cid:" + aaVar.f46998c + ", messages:" + list.size(), (Throwable) null);
                    C19590ap apVar = new C19590ap(Long.MAX_VALUE, Long.MIN_VALUE);
                    long g = C19777i.m37202g(aaVar.f46998c);
                    boolean z2 = false;
                    boolean z3 = false;
                    for (MessageBody messageBody : list) {
                        long longValue = messageBody.index_in_conversation_v2.longValue();
                        long longValue2 = messageBody.order_in_conversation.longValue();
                        if (longValue >= aaVar.f46997b) {
                            apVar.start = Math.min(apVar.start, longValue);
                            apVar.end = Math.max(apVar.end, longValue);
                        }
                        if (longValue <= aaVar.f46997b || longValue2 <= g) {
                            z2 = true;
                        }
                        aaVar.f46996a.f46365e++;
                        C19598aw a = C19821ai.m37325a(messageBody, true, (Pair<String, String>) null, 1);
                        if (!(a == null || a.f46543a == null)) {
                            aaVar.f46996a.f46366f++;
                            if (a.f46544b) {
                                aaVar.f46996a.f46367g++;
                            } else {
                                z3 = true;
                            }
                        }
                    }
                    C19512f.m36457b("imsdk", "LeakMsgRepairToOldHandler repair end, cid:" + aaVar.f46998c + ", reachBase:" + z2 + ", reachLocal:" + z3 + ", range:" + apVar, (Throwable) null);
                    if (!z2) {
                        if (!z3) {
                            if (apVar.isValid()) {
                                C19527ab.m36483a(aaVar.f46998c, apVar);
                            }
                            aaVar.f46996a.f46362b = z2;
                            aaVar.f46996a.f46363c = z3;
                            C19531ac acVar = aaVar.f46996a;
                            acVar.f46369i.add(apVar.copy());
                            acVar.f46370j.merge(apVar.copy());
                            if (!z2 || z3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C19742b.m36975a("LeakMsgRepairToOldHandler.handleResponse()", true);
                            return Boolean.valueOf(z);
                        }
                    }
                    List<C19590ap> list2 = C19532ad.m36496a(aaVar.f46998c).copy().ranges;
                    long j = aaVar.f46997b;
                    if (!C19995d.m37744a(list2)) {
                        j = list2.get(0).start;
                    } else if (apVar.end > aaVar.f46997b) {
                        j = apVar.end;
                    }
                    C19527ab.m36483a(aaVar.f46998c, new C19590ap(aaVar.f46997b, j));
                    aaVar.f46996a.f46362b = z2;
                    aaVar.f46996a.f46363c = z3;
                    C19531ac acVar2 = aaVar.f46996a;
                    acVar2.f46369i.add(apVar.copy());
                    acVar2.f46370j.merge(apVar.copy());
                    if (!z2) {
                    }
                    z = true;
                    C19742b.m36975a("LeakMsgRepairToOldHandler.handleResponse()", true);
                    return Boolean.valueOf(z);
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "LeakMsgRepairToOldHandler handleResponse repair error", e);
                    C19742b.m36975a("LeakMsgRepairToOldHandler.handleResponse()", false);
                    C19510e.m36439a(e);
                    return false;
                }
            }
        }, new AbstractC19985b<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19791aa.C197932 */

            static {
                Covode.recordClassIndex(22637);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Boolean bool) {
                Boolean bool2 = bool;
                C19512f.m36457b("imsdk", "LeakMsgRepairToOldHandler handleResponse onCallback, result:".concat(String.valueOf(bool2)), (Throwable) null);
                if (bool2.booleanValue() || !kVar.f47482f.body.messages_in_conversation_body.has_more.booleanValue()) {
                    C19791aa.this.f46996a.f46361a = true;
                    C19791aa aaVar = C19791aa.this;
                    aaVar.mo31800a(aaVar.f46996a);
                    return;
                }
                C19791aa aaVar2 = C19791aa.this;
                aaVar2.mo31742a(aaVar2.f46998c, kVar.f47482f.body.messages_in_conversation_body.next_cursor.longValue());
            }
        }, C19983a.m37717a());
    }

    /* renamed from: a */
    public final void mo31742a(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            this.f46996a.f46368h = C19672u.m36755a().mo31630a("invalid cid or anchorIndex, cid:" + str + ", anchorIndex:" + j).f46736a;
            mo31800a(this.f46996a);
            return;
        }
        C19638h a = C19640j.m36671a().mo31586a(str);
        if (a == null || a.isTemp() || a.isLocal()) {
            this.f46996a.f46368h = C19672u.m36755a().mo31630a("invalid conversation, cid:".concat(String.valueOf(str))).f46736a;
            mo31800a(this.f46996a);
            return;
        }
        int i = this.f46999d;
        if (i >= 10) {
            C19512f.m36457b("imsdk", "LeakMsgRepairToOldHandler pull to many times, cid:".concat(String.valueOf(str)), (Throwable) null);
            mo31800a(this.f46996a);
            return;
        }
        int i2 = i + 1;
        this.f46999d = i2;
        this.f46996a.f46364d = i2;
        this.f46998c = str;
        RequestBody build = new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(a.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(j)).build()).build();
        mo31798a(a.getInboxType(), build, null, a.getConversationId());
    }
}
