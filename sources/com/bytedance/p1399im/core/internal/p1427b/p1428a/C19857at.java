package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19773g;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19663l;
import com.bytedance.p1399im.core.proto.ConversationOperationStatus;
import com.bytedance.p1399im.core.proto.ConversationSettingInfo;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.at */
public final class C19857at extends AbstractC19927w<C19638h> {
    static {
        Covode.recordClassIndex(22701);
    }

    C19857at() {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue());
    }

    public C19857at(AbstractC19479b<C19638h> bVar) {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.upsert_conversation_setting_ext_info_body == null || kVar.f47482f.body.upsert_conversation_setting_ext_info_body.status == null || kVar.f47482f.body.upsert_conversation_setting_ext_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f47482f.body.upsert_conversation_setting_ext_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        final String str = (String) kVar.f47480d[0];
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            runnable.run();
            C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31165a();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = kVar.f47482f.body.upsert_conversation_setting_ext_info_body.setting_info;
        RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19857at.C198581 */

            static {
                Covode.recordClassIndex(22702);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ C19638h mo31187a() {
                C19638h a = C19749c.m36999a(str, true);
                C19663l a2 = C19997f.m37767a((C19663l) null, conversationSettingInfo);
                if (a != null) {
                    a.setSettingInfo(a2);
                }
                C19773g.m37163a(a2);
                return a;
            }
        }, new AbstractC19985b<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19857at.C198592 */

            static {
                Covode.recordClassIndex(22703);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19638h hVar) {
                C19638h hVar2 = hVar;
                if (hVar2 != null) {
                    C19640j.m36671a().mo31590a(hVar2, 5);
                    C19857at.this.mo31800a(hVar2);
                    C19510e.m36435a(kVar, true).mo31164a("conversation_id", str).mo31165a();
                } else {
                    C19857at.this.mo31803b(C19978k.m37686a(-1015));
                }
                runnable.run();
            }
        });
    }
}
