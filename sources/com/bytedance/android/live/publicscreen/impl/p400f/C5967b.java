package com.bytedance.android.live.publicscreen.impl.p400f;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.IdReasonMessage;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.f.b */
public final class C5967b {

    /* renamed from: a */
    public static final C5967b f14983a = new C5967b();

    private C5967b() {
    }

    static {
        Covode.recordClassIndex(6575);
    }

    /* renamed from: a */
    public static final void m13083a(AbstractC6571a aVar) {
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("clickedMessage", C4139e.C4140a.f11575b.mo46674b(IdMessage.from(aVar)));
            C6555i.m14021b().mo9217b("ttlive_text_message_clicked_on_name", hashMap);
        }
    }

    /* renamed from: b */
    public static final void m13085b(AbstractC6571a aVar) {
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("clickedMessage", C4139e.C4140a.f11575b.mo46674b(IdMessage.from(aVar)));
            C6555i.m14021b().mo9217b("ttlive_text_message_clicked_on_content", hashMap);
        }
    }

    /* renamed from: a */
    public static final void m13084a(AbstractC6571a aVar, String str) {
        C89219l.m154721d(str, "");
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("discardedMessage", C4139e.C4140a.f11575b.mo46674b(IdReasonMessage.from(aVar, str)));
            C6555i.m14021b().mo9217b("ttlive_message_discarded_on_message", hashMap);
        }
    }

    /* renamed from: b */
    public static final void m13086b(AbstractC6571a aVar, String str) {
        C89219l.m154721d(str, "");
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("discardedMessage", C4139e.C4140a.f11575b.mo46674b(IdReasonMessage.from(aVar, str)));
            C6555i.m14021b().mo9217b("ttlive_message_discarded_on_buffer", hashMap);
        }
    }
}
