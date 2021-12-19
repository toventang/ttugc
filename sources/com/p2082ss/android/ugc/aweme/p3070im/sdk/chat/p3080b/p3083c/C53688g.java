package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.C54314c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.g */
public final class C53688g {

    /* renamed from: a */
    public static final C53688g f123194a = new C53688g();

    private C53688g() {
    }

    static {
        Covode.recordClassIndex(63268);
    }

    /* renamed from: a */
    public static long m98956a() {
        String obj = C55197c.m100919b().toString();
        long currentTimeMillis = System.currentTimeMillis();
        if (C89219l.m154714a((Object) obj, (Object) "-1")) {
            return currentTimeMillis;
        }
        String str = obj + currentTimeMillis;
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j = ((j * 10) + ((long) (str.charAt(i) - '0'))) % Long.MAX_VALUE;
        }
        return Math.abs(j);
    }

    /* renamed from: a */
    public static String m98961a(IMUser iMUser) {
        String str;
        if (iMUser == null) {
            return "";
        }
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str = iMUser.getShortId();
            if (str == null) {
                str = "";
            }
        } else {
            str = iMUser.getUniqueId();
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    /* renamed from: a */
    public static C53689a m98959a(String str) {
        String str2;
        C19639i coreInfo;
        C89219l.m154721d(str, "");
        String valueOf = String.valueOf(m98956a());
        C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(str);
        if (a == null || (coreInfo = a.getCoreInfo()) == null) {
            str2 = null;
        } else {
            str2 = coreInfo.getName();
        }
        return new C53689a(valueOf, "", str, (String) null, (Boolean) null, "im_group_chat", 3, str2, 56);
    }

    /* renamed from: a */
    public static C53689a m98957a(C19538ai aiVar) {
        String uid;
        boolean z;
        int i;
        String str;
        C89219l.m154721d(aiVar, "");
        String conversationId = aiVar.getConversationId();
        String valueOf = String.valueOf(aiVar.getConversationShortId());
        IMUser b = C55085g.m100757b(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
        String str2 = null;
        if (b == null || (uid = b.getUid()) == null) {
            return null;
        }
        boolean isBlock = b.isBlock();
        C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(conversationId);
        if (a == null) {
            return null;
        }
        if (aiVar.getConversationType() == C19489e.AbstractC19490a.f46181b) {
            z = true;
            i = 3;
        } else {
            z = false;
            if (a.isStranger()) {
                i = 1;
            } else {
                i = 0;
            }
        }
        if (z) {
            valueOf = String.valueOf(m98956a());
        }
        C89219l.m154716b(conversationId, "");
        C19639i coreInfo = a.getCoreInfo();
        if (coreInfo != null) {
            str2 = coreInfo.getName();
        }
        String a2 = m98961a(b);
        Boolean valueOf2 = Boolean.valueOf(isBlock);
        if (z) {
            str = "im_group_chat";
        } else {
            str = "im";
        }
        return new C53689a(valueOf, uid, conversationId, a2, valueOf2, aiVar, str, i, str2);
    }

    /* renamed from: a */
    public static C53689a m98958a(C54315a aVar) {
        String uid;
        C89219l.m154721d(aVar, "");
        String conversationId = aVar.getConversationId();
        IMUser singleChatFromUser = aVar.getSingleChatFromUser();
        String str = null;
        if (singleChatFromUser == null || (uid = singleChatFromUser.getUid()) == null) {
            return null;
        }
        boolean isBlock = singleChatFromUser.isBlock();
        C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(conversationId);
        if (a == null) {
            return null;
        }
        long conversationShortId = a.getConversationShortId();
        if (conversationId.length() == 0 || conversationShortId <= 0) {
            return null;
        }
        int chatType = aVar.getChatType();
        String valueOf = String.valueOf(conversationShortId);
        C19639i coreInfo = a.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getName();
        }
        return new C53689a(valueOf, uid, conversationId, m98961a(singleChatFromUser), Boolean.valueOf(isBlock), "im", chatType, str, 32);
    }

    /* renamed from: a */
    private static String m98960a(C53689a aVar) {
        C28022o oVar = new C28022o();
        oVar.mo46801a("conversation_id", aVar.f123197c);
        String str = aVar.f123198d;
        if (str != null) {
            oVar.mo46801a("unique_id", str);
        }
        Boolean bool = aVar.f123199e;
        if (bool != null) {
            oVar.mo46798a("is_blocked", Boolean.valueOf(bool.booleanValue()));
        }
        C19538ai aiVar = aVar.f123200f;
        if (aiVar != null) {
            oVar.mo46801a("msg_list", String.valueOf(aiVar.getMsgId()));
        }
        return C55214j.m100958a(oVar);
    }

    /* renamed from: a */
    private static void m98962a(Activity activity, C53689a aVar, String str) {
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("owner_id", aVar.f123196b).appendQueryParameter("report_type", aVar.f123201g).appendQueryParameter("object_id", aVar.f123195a).appendQueryParameter("entrance", str);
        if (aVar.f123202h == 3) {
            appendQueryParameter.appendQueryParameter("con_short_id", aVar.f123197c);
            appendQueryParameter.appendQueryParameter("conversation_name", aVar.f123203i);
        }
        appendQueryParameter.appendQueryParameter("extra", m98960a(aVar));
        C39223a.m79587a().mo68688a(activity, appendQueryParameter);
    }

    /* renamed from: a */
    public static void m98963a(C53689a aVar, Activity activity, String str) {
        String str2;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        String str3 = aVar.f123197c;
        C54314c.m99608a(str3);
        C54314c.m99609a(str3, Integer.valueOf(aVar.f123202h));
        C19538ai aiVar = aVar.f123200f;
        if (aiVar != null) {
            C54314c.m99610a(str3, C89070n.m154516a(aiVar));
        }
        m98962a(activity, aVar, str);
        if (aVar.f123202h == 3) {
            str2 = "group_chat";
        } else {
            str2 = "private";
        }
        C55059b.m100697c(aVar.f123197c, str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.g$a */
    public static final class C53689a {

        /* renamed from: a */
        public final String f123195a;

        /* renamed from: b */
        public final String f123196b;

        /* renamed from: c */
        public final String f123197c;

        /* renamed from: d */
        public final String f123198d;

        /* renamed from: e */
        public final Boolean f123199e;

        /* renamed from: f */
        public final C19538ai f123200f;

        /* renamed from: g */
        public final String f123201g;

        /* renamed from: h */
        public final int f123202h;

        /* renamed from: i */
        public final String f123203i;

        static {
            Covode.recordClassIndex(63269);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53689a)) {
                return false;
            }
            C53689a aVar = (C53689a) obj;
            return C89219l.m154714a(this.f123195a, aVar.f123195a) && C89219l.m154714a(this.f123196b, aVar.f123196b) && C89219l.m154714a(this.f123197c, aVar.f123197c) && C89219l.m154714a(this.f123198d, aVar.f123198d) && C89219l.m154714a(this.f123199e, aVar.f123199e) && C89219l.m154714a(this.f123200f, aVar.f123200f) && C89219l.m154714a(this.f123201g, aVar.f123201g) && this.f123202h == aVar.f123202h && C89219l.m154714a(this.f123203i, aVar.f123203i);
        }

        public final int hashCode() {
            String str = this.f123195a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f123196b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f123197c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f123198d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f123199e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            C19538ai aiVar = this.f123200f;
            int hashCode6 = (hashCode5 + (aiVar != null ? aiVar.hashCode() : 0)) * 31;
            String str5 = this.f123201g;
            int hashCode7 = (((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f123202h) * 31;
            String str6 = this.f123203i;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode7 + i;
        }

        public final String toString() {
            return "ReportParams(objectId=" + this.f123195a + ", ownerId=" + this.f123196b + ", conversationId=" + this.f123197c + ", uniqueId=" + this.f123198d + ", isBlocked=" + this.f123199e + ", msg=" + this.f123200f + ", reportType=" + this.f123201g + ", chatType=" + this.f123202h + ", conversationName=" + this.f123203i + ")";
        }

        public C53689a(String str, String str2, String str3, String str4, Boolean bool, C19538ai aiVar, String str5, int i, String str6) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str5, "");
            this.f123195a = str;
            this.f123196b = str2;
            this.f123197c = str3;
            this.f123198d = str4;
            this.f123199e = bool;
            this.f123200f = aiVar;
            this.f123201g = str5;
            this.f123202h = i;
            this.f123203i = str6;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C53689a(String str, String str2, String str3, String str4, Boolean bool, String str5, int i, String str6, int i2) {
            this(str, str2, str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : bool, (C19538ai) null, str5, i, (i2 & 256) == 0 ? str6 : null);
        }
    }
}
