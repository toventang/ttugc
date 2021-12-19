package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55062b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.c */
public final class C55080c {
    static {
        Covode.recordClassIndex(64808);
    }

    /* renamed from: a */
    public static final long m100729a(C19638h hVar) {
        if (hVar == null) {
            return -1;
        }
        return AbstractC17427b.C17428a.m32311c(hVar.getConversationId());
    }

    /* renamed from: a */
    public static final String m100730a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return m100731b(AbstractC17420a.C17421a.m32276a().mo27720a(str));
    }

    /* renamed from: c */
    public static final IMUser m100732c(C19638h hVar) {
        if (hVar == null || !hVar.isSingleChat()) {
            return null;
        }
        long c = AbstractC17427b.C17428a.m32311c(hVar.getConversationId());
        return C55085g.m100751a(String.valueOf(c), m100731b(hVar));
    }

    /* renamed from: d */
    public static final int m100733d(C19638h hVar) {
        C19639i coreInfo;
        Map<String, String> ext;
        String str;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:s_group_member_limit")) == null || str.length() == 0) {
            return C55062b.m100702a();
        }
        return Integer.parseInt(str);
    }

    /* renamed from: b */
    public static final String m100731b(C19638h hVar) {
        String secUid;
        String secSender;
        if (hVar != null && hVar.isSingleChat()) {
            String valueOf = String.valueOf(m100729a(hVar));
            if (C55197c.m100919b().equals(valueOf)) {
                return C55197c.m100921c();
            }
            User d = C55197c.m100922d();
            if (!(d == null || (secUid = d.getSecUid()) == null)) {
                List<C19537ah> singleChatMembers = hVar.getSingleChatMembers();
                if (singleChatMembers != null) {
                    for (T t : singleChatMembers) {
                        C89219l.m154716b(t, "");
                        String secUid2 = t.getSecUid();
                        if (!(secUid2 == null || secUid2.length() == 0 || !(!C89219l.m154714a((Object) t.getSecUid(), (Object) secUid)))) {
                            return t.getSecUid();
                        }
                        C55095h.m100767a(valueOf, t.getSecUid());
                    }
                }
                C19538ai lastMessage = hVar.getLastMessage();
                if (!(lastMessage == null || !(!lastMessage.isSelf()) || (secSender = lastMessage.getSecSender()) == null || secSender.length() == 0)) {
                    return lastMessage.getSecSender();
                }
            }
        }
        return null;
    }
}
