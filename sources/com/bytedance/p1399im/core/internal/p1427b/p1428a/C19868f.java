package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.InboxMessagesPerUserResponseBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.f */
public final class C19868f extends AbstractC19927w<int[]> {
    static {
        Covode.recordClassIndex(22712);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19868f(AbstractC19479b<int[]> bVar) {
        super(IMCMD.CHECK_MESSAGES_BY_USER.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.check_messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        int[] iArr = (int[]) kVar.f47480d[0];
        if (z) {
            CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody = kVar.f47482f.body.check_messages_per_user_body;
            if (checkMessagesPerUserResponseBody == null) {
                mo31803b(kVar);
                return;
            }
            List<InboxMessagesPerUserResponseBody> list = checkMessagesPerUserResponseBody.messages;
            if (list == null || list.isEmpty()) {
                mo31803b(kVar);
            } else if (iArr == null || iArr.length == 0) {
                mo31803b(kVar);
            } else {
                for (InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody : list) {
                    if (inboxMessagesPerUserResponseBody != null) {
                        Integer num = inboxMessagesPerUserResponseBody.inbox_type;
                        Boolean bool = inboxMessagesPerUserResponseBody.has_more;
                        if (!(num == null || bool == null)) {
                            for (int i = 0; i < iArr.length; i++) {
                                if (iArr[i] == num.intValue() && !bool.booleanValue()) {
                                    iArr[i] = -1;
                                }
                            }
                        }
                    }
                }
                mo31800a(iArr);
            }
        } else {
            mo31803b(kVar);
        }
    }
}
