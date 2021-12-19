package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53627f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.h */
final /* synthetic */ class View$OnClickListenerC54397h implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC54386c.View$OnLongClickListenerC543892 f124613a;

    static {
        Covode.recordClassIndex(64100);
    }

    View$OnClickListenerC54397h(AbstractC54386c.View$OnLongClickListenerC543892 r1) {
        this.f124613a = r1;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC54386c.View$OnLongClickListenerC543892 r2 = this.f124613a;
        AbstractC54386c.this.f124586p.setValue(r2.f124604c);
        C19538ai aiVar = r2.f124604c;
        String a = C55231t.m100995a(aiVar, EnumC53772b.content(aiVar));
        C56244a.m102191c("MessageAdapter", "Reply option clicked ".concat(String.valueOf(a)));
        C19538ai aiVar2 = r2.f124604c;
        boolean isGroupChat = AbstractC54386c.this.f124584n.isGroupChat();
        C53627f.C53630c cVar = C53627f.C53630c.f123054a;
        C89219l.m154721d(aiVar2, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(cVar, "");
        Map<String, String> map = new C33744d().mo59983a("conversation_id", aiVar2.getConversationId()).mo59983a("chat_type", isGroupChat ? "group" : "private").mo59981a("quote_user_id", aiVar2.getSender()).mo59980a("is_self", aiVar2.isSelf() ? 1 : 0).mo59983a("message_type", a).f79943a;
        C89219l.m154716b(map, "");
        cVar.invoke("quote_message", map);
    }
}
