package com.bytedance.p1399im.core.p1413f.p1414a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.MessageDirection;
import com.bytedance.p1399im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.p1399im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.f.a.d */
public final class C19693d extends AbstractC19927w<MessageBody> {

    /* renamed from: a */
    public String f46818a;

    /* renamed from: b */
    public int f46819b;

    /* renamed from: c */
    public long f46820c;

    /* renamed from: d */
    public long f46821d;

    /* renamed from: e */
    public long f46822e;

    /* renamed from: f */
    public boolean f46823f;

    /* renamed from: g */
    public boolean f46824g;

    /* renamed from: h */
    public boolean f46825h;

    /* renamed from: i */
    public int f46826i;

    /* renamed from: j */
    public List<Long> f46827j;

    /* renamed from: k */
    private long f46828k;

    /* renamed from: l */
    private int f46829l;

    /* renamed from: m */
    private int f46830m;

    /* renamed from: n */
    private int f46831n;

    /* renamed from: o */
    private int f46832o;

    static {
        Covode.recordClassIndex(22537);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19693d(AbstractC19479b<MessageBody> bVar) {
        this(false, 0, 0, 0, 0, 0, false, false, bVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            return;
        }
        MessagesInConversationResponseBody messagesInConversationResponseBody = kVar.f47482f.body.messages_in_conversation_body;
        final List<MessageBody> list = messagesInConversationResponseBody.messages;
        if (list == null || list.isEmpty()) {
            mo31800a((Object) null);
            return;
        }
        final boolean z = true;
        if (this.f46832o == 0) {
            mo31800a(list.get(list.size() - 1));
        }
        int size = this.f46832o + list.size();
        this.f46832o = size;
        if (size < this.f46831n && messagesInConversationResponseBody.has_more.booleanValue()) {
            mo31646a(this.f46830m, this.f46818a, this.f46828k, this.f46829l, list.get(0).index_in_conversation.longValue());
            z = false;
        }
        C19983a.m37717a().execute(new Runnable() {
            /* class com.bytedance.p1399im.core.p1413f.p1414a.C19693d.RunnableC196941 */

            static {
                Covode.recordClassIndex(22538);
            }

            /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 315
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1413f.p1414a.C19693d.RunnableC196941.run():void");
            }
        });
    }

    /* renamed from: a */
    public final void mo31646a(int i, String str, long j, int i2, long j2) {
        if (TextUtils.isEmpty(str)) {
            mo31799a(C19672u.m36756a(C19978k.m37686a(-1015)));
            return;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        this.f46818a = str;
        this.f46828k = j;
        this.f46829l = i2;
        this.f46830m = i;
        mo31798a(i, new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(this.f46818a).conversation_short_id(Long.valueOf(this.f46828k)).conversation_type(Integer.valueOf(this.f46829l)).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }

    public C19693d(boolean z, int i, int i2, long j, long j2, long j3, boolean z2, boolean z3, AbstractC19479b<MessageBody> bVar) {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue(), bVar);
        this.f46823f = z;
        this.f46831n = i;
        this.f46825h = z2;
        this.f46819b = i2;
        this.f46820c = j;
        this.f46821d = j2;
        this.f46822e = j3;
        this.f46824g = z3;
    }
}
