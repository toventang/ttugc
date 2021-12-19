package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55054g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55193c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3201a.C55361a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.C56241d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c */
public final class C54871c {

    /* renamed from: a */
    public static final C54871c f125647a = new C54871c();

    private C54871c() {
    }

    static {
        Covode.recordClassIndex(64590);
    }

    /* renamed from: b */
    public static boolean m100474b(C19638h hVar) {
        if (hVar == null) {
            C56244a.m102191c("SessionConverter", "conversation convert fail cause null");
            return false;
        } else if (hVar.getLastMessage() != null) {
            return true;
        } else {
            C56244a.m102191c("SessionConverter", "conversation convertToChat fail cause lastMessage is null! conv id is " + hVar.getConversationId() + " is single chat " + hVar.isSingleChat() + " last message property: " + C54881c.m100498c(hVar));
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a m100470a(com.bytedance.p1399im.core.p1408d.C19638h r12) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54871c.m100470a(com.bytedance.im.core.d.h):com.ss.android.ugc.aweme.im.service.k.a");
    }

    /* renamed from: a */
    private static C56241d m100471a(AbstractC56237a aVar, C19638h hVar) {
        boolean z;
        C56241d a;
        boolean z2 = true;
        if (aVar.f128238q > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = aVar.f128239r;
        C56244a.m102191c("SessionConverter", "im session unread number " + aVar.f128238q + " isMute: " + hVar.isMute() + " isStranger: " + hVar.isStranger() + "has unread likes " + z3);
        if (!z && !z3) {
            return null;
        }
        int a2 = C55054g.m100677a();
        if (z || !z3) {
            z2 = false;
        }
        if (hVar.isStranger()) {
            a = C54872d.m100477b(z2, a2);
        } else if (hVar.isMute()) {
            a = C54872d.m100475a(a2);
        } else {
            a = C54872d.m100476a(z2, a2);
        }
        C56244a.m102191c("SessionConverter", "im session unread view strategy " + a2 + " and state " + a + "session id " + aVar.bL_());
        return a;
    }

    /* renamed from: a */
    private static String m100472a(BaseContent baseContent, C19538ai aiVar) {
        int i;
        IMUser b;
        String refmsg_uid;
        String str = null;
        String wrapMsgHint = baseContent.wrapMsgHint(!aiVar.isSelf(), false, null);
        if (wrapMsgHint == null) {
            C56244a.m102192d("SessionConverter", "wrapMsgHint is null for conv " + aiVar.getConversationId());
            wrapMsgHint = "";
        }
        if (aiVar.getConversationType() != C19489e.AbstractC19490a.f46181b) {
            return wrapMsgHint;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (C56201b.m102110a()) {
            i = C55361a.m101172a(aiVar.getConversationShortId());
            if (i > 0) {
                str2 = "[" + C17867d.m33078a().getResources().getQuantityString(R.plurals.cs, i) + "] ";
                sb.append(str2);
            }
        } else {
            i = 0;
        }
        if (!aiVar.isSelf() && !C55193c.m100907a(aiVar) && (b = C55085g.m100757b(null, aiVar.getSecSender())) != null) {
            if (aiVar.getReferenceInfo() != null) {
                ReferenceInfo referenceInfo = aiVar.getReferenceInfo();
                C89219l.m154716b(referenceInfo, "");
                ReferenceInfoHint a = C55193c.m100906a(referenceInfo);
                if (!(a == null || (refmsg_uid = a.getRefmsg_uid()) == null)) {
                    User d = C55197c.m100922d();
                    if (d != null) {
                        str = d.getUid();
                    }
                    if (C89219l.m154714a((Object) refmsg_uid, (Object) str)) {
                        sb.append(C17867d.m33078a().getResources().getString(R.string.b9i, b.getNickName(), ""));
                    }
                }
            }
            sb.append(b.getNickName()).append(": ");
        }
        sb.append(wrapMsgHint);
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        if (sb2.length() > 300) {
            Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
            sb2 = sb2.substring(0, 300);
            C89219l.m154716b(sb2, "");
        }
        SpannableString spannableString = new SpannableString(sb2);
        if (i > 0) {
            spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(C17867d.m33078a(), R.color.bh)), 0, str2.length(), 33);
        }
        return spannableString.toString();
    }

    /* renamed from: a */
    public static String m100473a(BaseContent baseContent, C19538ai aiVar, boolean z) {
        String str;
        C89219l.m154721d(aiVar, "");
        if (baseContent == null) {
            return "";
        }
        IMUser a = C55085g.m100751a(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
        if (a != null) {
            str = a.getDisplayName();
        } else {
            str = "";
        }
        String wrapMsgHint = baseContent.wrapMsgHint(!aiVar.isSelf(), z, str);
        if (wrapMsgHint == null) {
            return "";
        }
        return wrapMsgHint;
    }
}
