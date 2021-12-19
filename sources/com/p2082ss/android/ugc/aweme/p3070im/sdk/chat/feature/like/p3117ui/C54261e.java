package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.e */
public final class C54261e {

    /* renamed from: a */
    public static final C54261e f124302a = new C54261e();

    private C54261e() {
    }

    static {
        Covode.recordClassIndex(63951);
    }

    /* renamed from: b */
    public static void m99517b(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        C39162r.m79460a("cancel_like_message", m99515a(aiVar).f79943a);
    }

    /* renamed from: c */
    private static String m99518c(C19538ai aiVar) {
        int msgType = aiVar.getMsgType();
        if (msgType == 5) {
            return "GIF";
        }
        if (msgType == 7) {
            return "text";
        }
        if (msgType != 8) {
            return "card";
        }
        return "video";
    }

    /* renamed from: a */
    static C33744d m99515a(C19538ai aiVar) {
        C33744d a = new C33744d().mo59983a("to_user_id", String.valueOf(aiVar.getSender())).mo59983a("message_type", m99518c(aiVar)).mo59983a("conversation_id", aiVar.getConversationId());
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static void m99516a(C19538ai aiVar, boolean z, boolean z2) {
        String str;
        String str2;
        C89219l.m154721d(aiVar, "");
        C33744d a = m99515a(aiVar);
        if (aiVar.getConversationType() == C19489e.AbstractC19490a.f46181b) {
            str = "group";
        } else {
            str = "private";
        }
        C33744d a2 = a.mo59983a("chat_type", str);
        if (z) {
            str2 = "double_click";
        } else {
            str2 = "button";
        }
        C39162r.m79460a("like_message", a2.mo59983a("like_method", str2).mo59980a("isauthor", !z2 ? 1 : 0).mo59980a("is_master", C55059b.m100684a(aiVar)).f79943a);
    }
}
