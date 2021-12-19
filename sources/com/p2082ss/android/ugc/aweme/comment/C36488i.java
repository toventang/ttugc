package com.p2082ss.android.ugc.aweme.comment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.AbstractC34530c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.i */
final /* synthetic */ class C36488i implements AbstractC34530c {

    /* renamed from: a */
    private final C36274b f86267a;

    /* renamed from: b */
    private final Aweme f86268b;

    /* renamed from: c */
    private final IMContact f86269c;

    /* renamed from: d */
    private final IIMService f86270d;

    static {
        Covode.recordClassIndex(43791);
    }

    C36488i(C36274b bVar, Aweme aweme, IMContact iMContact, IIMService iIMService) {
        this.f86267a = bVar;
        this.f86268b = aweme;
        this.f86269c = iMContact;
        this.f86270d = iIMService;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34530c
    /* renamed from: a */
    public final void mo60998a(Object obj) {
        C36274b bVar = this.f86267a;
        Aweme aweme = this.f86268b;
        IMContact iMContact = this.f86269c;
        IIMService iIMService = this.f86270d;
        String d = C36274b.m73920d("share_prop" + System.currentTimeMillis());
        C33744d a = new C33744d().mo59983a("enter_from", bVar.f85738i).mo59983a("platform", "chat").mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid());
        String str = "";
        if (!(iMContact instanceof IMUser)) {
            if (iMContact instanceof IMConversation) {
                int conversationType = ((IMConversation) iMContact).getConversationType();
                if (conversationType != 1) {
                    if (conversationType == 2) {
                        str = "group";
                    }
                }
            }
            C33744d a2 = a.mo59983a("chat_type", str).mo59980a("chat_cnt", 1).mo59980a("is_with_text", 0).mo59983a("enter_method", "comment_at").mo59983a("bind_id", d);
            C80409eu.m139390a(a2, aweme.getAuthor());
            Map<String, String> map = a2.f79943a;
            C39162r.m79460a("share_video_to_chat", map);
            C39162r.m79460a("share_video_success", map);
            C33744d a3 = new C33744d().mo59983a("conversation_id", iIMService.getIMContactConversationId(iMContact)).mo59983a("to_user_id", iIMService.getIMContactUserId(iMContact)).mo59983a("bind_id", d);
            C80409eu.m139390a(a3, aweme.getAuthor());
            Map<String, String> map2 = a3.f79943a;
            C39162r.m79460a("share_video_to_chat_info", map2);
            C39162r.m79460a("share_video_success_info", map2);
        }
        str = "private";
        C33744d a22 = a.mo59983a("chat_type", str).mo59980a("chat_cnt", 1).mo59980a("is_with_text", 0).mo59983a("enter_method", "comment_at").mo59983a("bind_id", d);
        C80409eu.m139390a(a22, aweme.getAuthor());
        Map<String, String> map3 = a22.f79943a;
        C39162r.m79460a("share_video_to_chat", map3);
        C39162r.m79460a("share_video_success", map3);
        C33744d a32 = new C33744d().mo59983a("conversation_id", iIMService.getIMContactConversationId(iMContact)).mo59983a("to_user_id", iIMService.getIMContactUserId(iMContact)).mo59983a("bind_id", d);
        C80409eu.m139390a(a32, aweme.getAuthor());
        Map<String, String> map22 = a32.f79943a;
        C39162r.m79460a("share_video_to_chat_info", map22);
        C39162r.m79460a("share_video_success_info", map22);
    }
}
