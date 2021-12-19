package com.bytedance.android.livesdk;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.ReasonMessage;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.y */
public final class C11590y {

    /* renamed from: a */
    public static final C11590y f27741a = new C11590y();

    private C11590y() {
    }

    static {
        Covode.recordClassIndex(13256);
    }

    /* renamed from: a */
    public static final void m20408a(String str) {
        C89219l.m154721d(str, "");
        C6555i.m14021b();
        C6555i.m9463b("ttlive_fetch_message_polling_failed", str);
    }

    /* renamed from: a */
    public static final void m20409a(List<? extends IdMessage> list, List<? extends ReasonMessage> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        HashMap hashMap = new HashMap();
        if (!list.isEmpty()) {
            hashMap.put("successfulMessages", C4139e.C4140a.f11575b.mo46674b(list));
        }
        if (!list2.isEmpty()) {
            hashMap.put("failedMessages", C4139e.C4140a.f11575b.mo46674b(list2));
        }
        C6555i.m14021b().mo9217b("ttlive_fetch_message_polling_succeeded", hashMap);
    }
}
