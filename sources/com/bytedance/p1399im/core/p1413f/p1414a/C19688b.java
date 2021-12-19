package com.bytedance.p1399im.core.p1413f.p1414a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessagesCheckInfo;
import java.util.List;

/* renamed from: com.bytedance.im.core.f.a.b */
public final class C19688b extends AbstractC19927w {

    /* renamed from: a */
    public long f46805a;

    /* renamed from: b */
    public long f46806b;

    /* renamed from: c */
    public boolean f46807c;

    static {
        Covode.recordClassIndex(22532);
    }

    public C19688b(boolean z) {
        super(IMCMD.GET_MESSAGES_CHECKINFO_IN_CONVERSATION.getValue());
        this.f46807c = z;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.get_messages_checkinfo_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        if (mo31130a(kVar) && kVar.mo31869l()) {
            final String str = (String) kVar.f47480d[0];
            kVar.f47481e.inbox_type.intValue();
            final List<MessagesCheckInfo> list = kVar.f47482f.body.get_messages_checkinfo_in_conversation_body.msgs_checkinfo_list;
            if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
                C19983a.m37717a().execute(new Runnable() {
                    /* class com.bytedance.p1399im.core.p1413f.p1414a.C19688b.RunnableC196891 */

                    static {
                        Covode.recordClassIndex(22533);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:22:0x0110  */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x011d  */
                    /* JADX WARNING: Removed duplicated region for block: B:37:0x0196  */
                    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c3  */
                    /* JADX WARNING: Removed duplicated region for block: B:41:0x01c5  */
                    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        // Method dump skipped, instructions count: 465
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1413f.p1414a.C19688b.RunnableC196891.run():void");
                    }
                });
            }
        }
    }
}
