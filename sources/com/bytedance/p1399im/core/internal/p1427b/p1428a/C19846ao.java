package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19743b;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationCoreInfo;
import com.bytedance.p1399im.core.proto.ConversationOperationStatus;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.ao */
public final class C19846ao extends AbstractC19927w<C19638h> {
    static {
        Covode.recordClassIndex(22690);
    }

    C19846ao() {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue());
    }

    public C19846ao(AbstractC19479b<C19638h> bVar) {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.set_conversation_core_info_body == null || kVar.f47482f.body.set_conversation_core_info_body.status == null || kVar.f47482f.body.set_conversation_core_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f47482f.body.set_conversation_core_info_body.conversation_core_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        final String str = (String) kVar.f47480d[0];
        final String str2 = (String) kVar.f47480d[1];
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            runnable.run();
            C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31164a("keys", str2).mo31165a();
            return;
        }
        final ConversationCoreInfo conversationCoreInfo = kVar.f47482f.body.set_conversation_core_info_body.conversation_core_info;
        RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19846ao.C198471 */

            static {
                Covode.recordClassIndex(22691);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C19638h mo31187a() {
                if (C19743b.m36987a(C19997f.m37766a(conversationCoreInfo.conversation_id, C19743b.m36982a(conversationCoreInfo.conversation_id), conversationCoreInfo))) {
                    return C19749c.m36999a(conversationCoreInfo.conversation_id, true);
                }
                return null;
            }
        }, new AbstractC19985b<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19846ao.C198482 */

            static {
                Covode.recordClassIndex(22692);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19638h hVar) {
                C19638h hVar2 = hVar;
                if (hVar2 != null) {
                    C19640j.m36671a().mo31590a(hVar2, 5);
                    C19846ao.this.mo31800a(hVar2);
                    C19510e.m36435a(kVar, true).mo31164a("conversation_id", str).mo31164a("keys", str2).mo31165a();
                } else {
                    C19846ao.this.mo31803b(C19978k.m37686a(-3001));
                    C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31164a("keys", str2).mo31165a();
                }
                runnable.run();
            }
        });
    }
}
