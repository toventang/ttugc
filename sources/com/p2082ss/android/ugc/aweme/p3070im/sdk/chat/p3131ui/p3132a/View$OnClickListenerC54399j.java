package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.MessageStatus;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53627f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.j */
final /* synthetic */ class View$OnClickListenerC54399j implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC54386c.View$OnLongClickListenerC543892 f124616a;

    static {
        Covode.recordClassIndex(64102);
    }

    View$OnClickListenerC54399j(AbstractC54386c.View$OnLongClickListenerC543892 r1) {
        this.f124616a = r1;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC54386c.View$OnLongClickListenerC543892 r3 = this.f124616a;
        C19538ai aiVar = r3.f124604c;
        if (r3.f124602a == 1 || r3.f124602a == 2 || r3.f124602a == 9 || r3.f124602a == 10 || r3.f124602a == 14 || r3.f124602a == 11 || r3.f124602a == 16 || r3.f124602a == 45 || r3.f124602a == 17 || r3.f124602a == 18 || r3.f124602a == 15 || r3.f124602a == 20 || r3.f124602a == 21 || r3.f124602a == 22 || r3.f124602a == 23 || r3.f124602a == 33 || r3.f124602a == 34 || r3.f124602a == 35 || r3.f124602a == 37 || r3.f124602a == 38 || r3.f124602a == 39 || r3.f124602a == 47 || r3.f124602a == 42 || r3.f124602a == 43 || r3.f124602a == 46 || r3.f124602a == 48 || r3.f124602a == 49 || r3.f124602a == 51) {
            C55231t.m101000a(aiVar, new AbstractC19479b<C19538ai>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.View$OnLongClickListenerC543892.C543901 */

                static {
                    Covode.recordClassIndex(64093);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* synthetic */ void mo27861a(C19538ai aiVar) {
                    C19538ai aiVar2 = aiVar;
                    int i = 0;
                    int i2 = -1;
                    for (int i3 = 0; i3 < AbstractC54386c.this.f124543b.size(); i3++) {
                        C19538ai aiVar3 = (C19538ai) AbstractC54386c.this.f124543b.get(i3);
                        if (aiVar3.getReferenceInfo() != null) {
                            ReferenceInfo referenceInfo = aiVar3.getReferenceInfo();
                            if (referenceInfo.referenced_message_id.longValue() == aiVar2.getMsgId()) {
                                aiVar3.setRefMsg(new ReferenceInfo.Builder().hint(referenceInfo.hint).ref_message_type(referenceInfo.ref_message_type).referenced_message_id(referenceInfo.referenced_message_id).referenced_message_status(MessageStatus.DELETED).build());
                                if (i2 == -1) {
                                    i2 = i3;
                                    i = 1;
                                } else {
                                    i = (i3 - i2) + 1;
                                }
                            }
                        }
                    }
                    C56244a.m102191c("MessageAdapter", "Message deleted " + aiVar2.getMsgId());
                    AbstractC54386c.this.notifyItemRangeChanged(i2, i);
                }
            });
        }
        C53627f.m98869a(AbstractC54386c.this.f124584n.isGroupChat(), "delete");
    }
}
