package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19773g;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationOperationStatus;
import com.bytedance.p1399im.core.proto.ConversationSettingInfo;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.ap */
public final class C19849ap extends AbstractC19927w<C19638h> {
    static {
        Covode.recordClassIndex(22693);
    }

    C19849ap() {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue());
    }

    public C19849ap(AbstractC19479b<C19638h> bVar) {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.set_conversation_setting_info_body == null || kVar.f47482f.body.set_conversation_setting_info_body.status == null || kVar.f47482f.body.set_conversation_setting_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f47482f.body.set_conversation_setting_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        final String str = (String) kVar.f47480d[0];
        final boolean booleanValue = ((Boolean) kVar.f47480d[1]).booleanValue();
        final String str2 = (String) kVar.f47480d[2];
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            runnable.run();
            C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31164a("keys", str2).mo31165a();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = kVar.f47482f.body.set_conversation_setting_info_body.setting_info;
        RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19849ap.C198501 */

            static {
                Covode.recordClassIndex(22694);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ C19638h mo31187a() {
                boolean a = C19773g.m37163a(C19997f.m37767a(C19773g.m37159a(conversationSettingInfo.conversation_id), conversationSettingInfo));
                if (booleanValue) {
                    C19638h a2 = C19749c.m36999a(conversationSettingInfo.conversation_id, true);
                    if (!C19483d.m36365a().mo31141b().f46196E || a2 == null || a2.getLastMessage() == null) {
                        C19749c.m37010a(conversationSettingInfo.conversation_id, System.currentTimeMillis());
                    } else {
                        C19749c.m37010a(conversationSettingInfo.conversation_id, a2.getLastMessage().getCreatedAt());
                    }
                }
                if (a) {
                    return C19749c.m36999a(conversationSettingInfo.conversation_id, true);
                }
                return null;
            }
        }, new AbstractC19985b<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19849ap.C198512 */

            static {
                Covode.recordClassIndex(22695);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19638h hVar) {
                C19638h hVar2 = hVar;
                if (hVar2 != null) {
                    C19640j.m36671a().mo31590a(hVar2, 5);
                    C19849ap.this.mo31800a(hVar2);
                    C19510e.m36435a(kVar, true).mo31164a("conversation_id", str).mo31164a("keys", str2).mo31165a();
                } else {
                    C19849ap.this.mo31803b(C19978k.m37686a(-3001));
                    C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31164a("keys", str2).mo31165a();
                }
                runnable.run();
            }
        });
    }
}
