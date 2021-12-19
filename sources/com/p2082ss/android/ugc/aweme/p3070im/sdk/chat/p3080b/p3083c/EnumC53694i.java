package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMServiceProvider;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.C55278b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.i */
public abstract class EnumC53694i extends Enum<EnumC53694i> {
    public static final EnumC53694i PROPERTY_CHANGE;
    public static final EnumC53694i REAL_MESSAGE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC53694i[] f123210a;

    static {
        Covode.recordClassIndex(63274);
        C53696b bVar = new C53696b("REAL_MESSAGE");
        REAL_MESSAGE = bVar;
        C53695a aVar = new C53695a("PROPERTY_CHANGE");
        PROPERTY_CHANGE = aVar;
        f123210a = new EnumC53694i[]{bVar, aVar};
    }

    public static EnumC53694i valueOf(String str) {
        return (EnumC53694i) Enum.valueOf(EnumC53694i.class, str);
    }

    public static EnumC53694i[] values() {
        return (EnumC53694i[]) f123210a.clone();
    }

    public void beforeReport(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
    }

    public boolean keepEnterFrom(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        return false;
    }

    public Map<String, String> makeExtraParam(C19538ai aiVar, BaseContent baseContent) {
        C89219l.m154721d(aiVar, "");
        return null;
    }

    public boolean shouldReport(String str) {
        C89219l.m154721d(str, "");
        return true;
    }

    public abstract String transformMessageType(String str);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.i$a */
    static final class C53695a extends EnumC53694i {
        static {
            Covode.recordClassIndex(63275);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.EnumC53694i
        public final void beforeReport(C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.EnumC53694i
        public final String transformMessageType(String str) {
            return "fast_emoji";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53695a(String str) {
            super(str, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.i$b */
    static final class C53696b extends EnumC53694i {
        static {
            Covode.recordClassIndex(63276);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.EnumC53694i
        public final boolean shouldReport(String str) {
            C89219l.m154721d(str, "");
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.EnumC53694i
        public final String transformMessageType(String str) {
            return str;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53696b(String str) {
            super(str, 0, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.EnumC53694i
        public final Map<String, String> makeExtraParam(C19538ai aiVar, BaseContent baseContent) {
            String str;
            IMUser a;
            Map<String, String> eventParam;
            C89219l.m154721d(aiVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (aiVar.getLocalExt() == null || !aiVar.getLocalExt().containsKey("key_resend")) {
                str = "0";
            } else {
                str = "1";
            }
            linkedHashMap.put("is_resend", str);
            String str2 = C55059b.f126008b;
            if (TextUtils.isEmpty(str2) && aiVar.getLocalExt() != null) {
                str2 = aiVar.getLocalExt().get("process_id");
            }
            if (str2 != null) {
                linkedHashMap.put("process_id", str2);
            }
            if (!(baseContent == null || (eventParam = baseContent.eventParam()) == null)) {
                linkedHashMap.putAll(eventParam);
            }
            long c = AbstractC17427b.C17428a.m32311c(aiVar.getConversationId());
            if (aiVar.getConversationType() == C19489e.AbstractC19490a.f46180a && (a = C55085g.m100751a(String.valueOf(c), C55080c.m100730a(aiVar.getConversationId()))) != null) {
                linkedHashMap.put("relation_tag", String.valueOf(a.getFollowStatus()));
            }
            return linkedHashMap;
        }
    }

    private EnumC53694i(String str, int i) {
    }

    public /* synthetic */ EnumC53694i(String str, int i, C89214g gVar) {
        this(str, i);
    }

    public final Map<String, String> makeParams(C19538ai aiVar, BaseContent baseContent, String str, String str2) {
        String str3;
        String str4 = "";
        C89219l.m154721d(aiVar, str4);
        C89219l.m154721d(str2, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aiVar.getConversationType() == C19489e.AbstractC19490a.f46181b) {
            str3 = "group";
        } else {
            str3 = "private";
        }
        linkedHashMap.put("chat_type", str3);
        linkedHashMap.put("conversation_id", aiVar.getConversationId());
        linkedHashMap.put("is_master", String.valueOf(C55059b.m100684a(aiVar)));
        String str5 = aiVar.getLocalExt().get("enter_from");
        String str6 = aiVar.getLocalExt().get("message_type");
        if (!TextUtils.equals(str5, "live") && !TextUtils.equals(str6, "ttFarm")) {
            C55059b.m100685a();
            str5 = C55059b.m100686a("enter_from", aiVar.getLocalExt().get("enter_from"));
            C55059b.m100685a();
            C55059b.m100694b("enter_from", str5);
        }
        linkedHashMap.put("enter_from", str5);
        linkedHashMap.put("send_method", C55231t.m100996a(baseContent));
        if (!TextUtils.equals(str2, "long_press")) {
            C55059b.m100685a();
            str2 = C55059b.m100686a("enter_method", aiVar.getLocalExt().get("enter_method"));
            C55059b.m100685a();
            C55059b.m100694b("enter_method", str2);
        }
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("relation_tag", C55059b.m100686a("relation_tag", "-1"));
        String transformMessageType = transformMessageType(str);
        if (transformMessageType != null && !TextUtils.isEmpty(transformMessageType)) {
            linkedHashMap.put("message_type", transformMessageType);
        }
        long c = AbstractC17427b.C17428a.m32311c(aiVar.getConversationId());
        if (c > 0) {
            linkedHashMap.put("to_user_id", String.valueOf(c));
            C55278b familiarService = IMServiceProvider.INSTANCE.getFamiliarService();
            String valueOf = String.valueOf(c);
            C89219l.m154716b(valueOf, str4);
            String a = familiarService.mo92287a(valueOf, C55080c.m100730a(aiVar.getConversationId()), null);
            if (a != null) {
                linkedHashMap.put("rec_type", a);
            }
            IMUser b = C55085g.m100757b(String.valueOf(c), C55080c.m100730a(aiVar.getConversationId()));
            if (b != null && b.getFriendRecType() == 1) {
                str4 = "share_link_match";
            }
            linkedHashMap.put("rec_reason", str4);
        }
        Map<String, String> makeExtraParam = makeExtraParam(aiVar, baseContent);
        if (makeExtraParam != null) {
            linkedHashMap.putAll(makeExtraParam);
        }
        return linkedHashMap;
    }
}
