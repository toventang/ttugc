package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.GetMessageByIdRequestBody;
import com.bytedance.p1399im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.b.a.t */
public final class C19915t extends AbstractC19927w<C19538ai> {

    /* renamed from: a */
    public static boolean f47306a = true;

    /* renamed from: b */
    public LruCache<Long, C19538ai> f47307b = new LruCache<>(C19483d.m36365a().mo31141b().f46255at);

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return false;
    }

    static {
        Covode.recordClassIndex(22759);
    }

    public C19915t() {
        super(IMCMD.GET_MESSAGE_INFO_BY_SERVER_ID.getValue());
    }

    public C19915t(AbstractC19479b<C19538ai> bVar) {
        super(IMCMD.GET_MESSAGE_INFO_BY_SERVER_ID.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.get_message_by_id_body == null || kVar.f47482f.body.get_message_by_id_body.msg_info == null || kVar.f47482f.body.get_message_by_id_body.msg_info.body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31788a(long j, C19638h hVar) {
        if (hVar == null) {
            C19672u.C19673a a = C19672u.m36755a();
            a.mo31630a("conversation is null");
            mo31799a(a.f46736a);
            return;
        }
        m37487a(j, hVar.getConversationId(), Long.valueOf(hVar.getConversationShortId()), Integer.valueOf(hVar.getConversationType()), Integer.valueOf(hVar.getInboxType()));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        boolean z;
        String str;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        if (mo31130a(kVar)) {
            GetMessageByIdResponseBody getMessageByIdResponseBody = kVar.f47482f.body.get_message_by_id_body;
            Map<String, String> map = getMessageByIdResponseBody.msg_info.body.ext;
            if (map == null || !map.containsKey("s:client_message_id") || TextUtils.isEmpty(map.get("s:client_message_id"))) {
                str = "";
            } else {
                str = map.get("s:client_message_id");
            }
            C19538ai a = C19997f.m37761a(str, (C19538ai) null, getMessageByIdResponseBody.msg_info.body);
            a.setMessageStatus(getMessageByIdResponseBody.msg_info.status);
            this.f47307b.put(Long.valueOf(a.getMsgId()), a);
            mo31800a(a);
        } else {
            mo31803b(kVar);
        }
        C19510e.m36435a(kVar, z).mo31165a();
    }

    /* renamed from: a */
    private void m37487a(long j, String str, Long l, Integer num, Integer num2) {
        mo31798a(num2.intValue(), new RequestBody.Builder().get_message_by_id_body(new GetMessageByIdRequestBody.Builder().conversation_id(str).conversation_short_id(l).conversation_type(num).server_message_id(Long.valueOf(j)).build()).build(), null, new Object[0]);
    }
}
