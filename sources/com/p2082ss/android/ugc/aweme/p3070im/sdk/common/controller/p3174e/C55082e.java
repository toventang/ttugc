package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55718b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.e */
public final class C55082e {

    /* renamed from: a */
    public static final C55082e f126061a = new C55082e();

    private C55082e() {
    }

    static {
        Covode.recordClassIndex(64810);
    }

    /* renamed from: a */
    public static final IMContact m100739a(C19638h hVar) {
        C89219l.m154721d(hVar, "");
        if (hVar.getConversationType() != C19489e.AbstractC19490a.f46180a) {
            return m100743b(hVar);
        }
        long c = AbstractC17427b.C17428a.m32311c(hVar.getConversationId());
        return C55085g.m100751a(String.valueOf(c), C55080c.m100731b(hVar));
    }

    /* renamed from: a */
    public static final String m100740a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        if (!(iMContact instanceof IMUser)) {
            return null;
        }
        String uid = ((IMUser) iMContact).getUid();
        C89219l.m154716b(uid, "");
        return AbstractC17427b.C17428a.m32309a(Long.parseLong(uid));
    }

    /* renamed from: b */
    public static final IMConversation m100743b(C19638h hVar) {
        C89219l.m154721d(hVar, "");
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationType(hVar.getConversationType());
        iMConversation.setConversationId(hVar.getConversationId());
        iMConversation.setConversationMemberCount(hVar.getMemberCount());
        C19639i coreInfo = hVar.getCoreInfo();
        if (coreInfo != null) {
            iMConversation.setConversationName(coreInfo.getName());
        }
        C55357e.C55358a.m101168a();
        iMConversation.setConversationAvatar(C55357e.m101167b(hVar));
        iMConversation.setInitialLetter(C55718b.m101466a(iMConversation.getDisplayName()));
        return iMConversation;
    }

    /* renamed from: a */
    public static final List<String> m100741a(IMContact[] iMContactArr) {
        C89219l.m154721d(iMContactArr, "");
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : iMContactArr) {
            if (iMContact instanceof IMConversation) {
                arrayList.add(((IMConversation) iMContact).getConversationId());
            } else if (iMContact instanceof IMUser) {
                String uid = ((IMUser) iMContact).getUid();
                C89219l.m154716b(uid, "");
                arrayList.add(AbstractC17427b.C17428a.m32309a(Long.parseLong(uid)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final void m100742a(Context context, IMContact iMContact, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iMContact, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(iMContact, "");
        C89219l.m154721d(aVar, "");
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == C19489e.AbstractC19490a.f46181b) {
                ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102212a(context, 3, iMConversation.getConversationId()).mo93262a(6).mo93271b("share_toast").mo93274c("").f128281a);
                return;
            }
        }
        aVar.invoke();
    }
}
