package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a */
public final class C55191a {
    static {
        Covode.recordClassIndex(64936);
    }

    /* renamed from: a */
    public static final int m100904a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        int i = 0;
        for (T t : list) {
            if (t instanceof IMConversation) {
                i += t.getConversationMemberCount();
            } else if (t instanceof IMUser) {
                i++;
            }
        }
        return i;
    }
}
