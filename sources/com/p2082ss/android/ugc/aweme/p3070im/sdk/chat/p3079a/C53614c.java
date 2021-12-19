package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53622e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.c */
public final class C53614c implements AbstractC53613b {

    /* renamed from: a */
    public final AtomicIntegerArray f123039a = new AtomicIntegerArray(EnumC53612a.values().length);

    static {
        Covode.recordClassIndex(63194);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.AbstractC53613b
    /* renamed from: a */
    public final void mo90188a() {
        Iterator it = C89271h.m154766a(0, this.f123039a.length()).iterator();
        while (it.hasNext()) {
            this.f123039a.set(((AbstractC89040af) it).mo143429a(), 0);
        }
    }

    /* renamed from: a */
    private static long m98856a(String str) {
        C89219l.m154721d(str, "");
        return AbstractC17427b.C17428a.m32311c(str);
    }

    /* renamed from: a */
    private final void m98857a(EnumC53612a aVar) {
        this.f123039a.incrementAndGet(aVar.ordinal());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r1 != 4) goto L_0x0060;
     */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.AbstractC53613b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90189a(com.bytedance.p1399im.core.p1408d.C19538ai r9) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53614c.mo90189a(com.bytedance.im.core.d.ai):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.AbstractC53613b
    /* renamed from: a */
    public final void mo90190a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        long a = m98856a(str);
        AtomicIntegerArray atomicIntegerArray = this.f123039a;
        String a2 = C55058a.m100681a();
        C53622e.C53626d dVar = C53622e.C53626d.f123050a;
        C89219l.m154721d(atomicIntegerArray, "");
        C89219l.m154721d(a2, "");
        C89219l.m154721d(dVar, "");
        if (atomicIntegerArray.length() == EnumC53612a.values().length) {
            C0484a aVar = new C0484a();
            aVar.put("send_message", "[" + (atomicIntegerArray.get(EnumC53612a.SEND_SUCCESS.ordinal()) + atomicIntegerArray.get(EnumC53612a.SEND_FAIL.ordinal())) + ", " + atomicIntegerArray.get(EnumC53612a.SEND_FAIL.ordinal()) + ']');
            aVar.put("send_emoji", "[" + (atomicIntegerArray.get(EnumC53612a.BIG_EMOJI_SUCCESS.ordinal()) + atomicIntegerArray.get(EnumC53612a.BIG_EMOJI_FAIL.ordinal())) + ", " + atomicIntegerArray.get(EnumC53612a.BIG_EMOJI_FAIL.ordinal()) + ']');
            aVar.put("send_favorite_emoji", "[" + (atomicIntegerArray.get(EnumC53612a.SELF_EMOJI_SUCCESS.ordinal()) + atomicIntegerArray.get(EnumC53612a.SELF_EMOJI_FAIL.ordinal())) + ", " + atomicIntegerArray.get(EnumC53612a.SELF_EMOJI_FAIL.ordinal()) + ']');
            aVar.put("send_giphy", "[" + (atomicIntegerArray.get(EnumC53612a.SEARCH_GIF_SUCCESS.ordinal()) + atomicIntegerArray.get(EnumC53612a.SEARCH_GIF_FAIL.ordinal())) + ", " + atomicIntegerArray.get(EnumC53612a.SEARCH_GIF_FAIL.ordinal()) + ']');
            aVar.put("send_text", "[" + (atomicIntegerArray.get(EnumC53612a.TEXT_SUCCESS.ordinal()) + atomicIntegerArray.get(EnumC53612a.TEXT_FAIL.ordinal())) + ", " + atomicIntegerArray.get(EnumC53612a.TEXT_FAIL.ordinal()) + ']');
            aVar.put("send_video", "[" + (atomicIntegerArray.get(EnumC53612a.VIDEO_SUCCESS.ordinal()) + atomicIntegerArray.get(EnumC53612a.VIDEO_FAIL.ordinal())) + ", " + atomicIntegerArray.get(EnumC53612a.VIDEO_FAIL.ordinal()) + ']');
            aVar.put("to_user_id", String.valueOf(a));
            aVar.put("process_id", a2);
            dVar.invoke("chat_stats", aVar);
        }
        C53622e eVar = C53622e.f123047a;
        long a3 = m98856a(str);
        AtomicIntegerArray atomicIntegerArray2 = this.f123039a;
        C53622e.C53625c cVar = new C53622e.C53625c(eVar);
        C89219l.m154721d(str2, "");
        C89219l.m154721d(atomicIntegerArray2, "");
        C89219l.m154721d(cVar, "");
        if (atomicIntegerArray2.length() == EnumC53612a.values().length) {
            C0484a aVar2 = new C0484a();
            aVar2.put("event", "chat_stats");
            aVar2.put("label", "message");
            aVar2.put("success_cnt", String.valueOf(atomicIntegerArray2.get(EnumC53612a.SEND_SUCCESS.ordinal())));
            aVar2.put("fail_cnt", String.valueOf(atomicIntegerArray2.get(EnumC53612a.SEND_UNEXPECTED_FAIL.ordinal())));
            aVar2.put("session_id", String.valueOf(a3));
            aVar2.put("source_type", str2);
            cVar.invoke(aVar2);
        }
    }
}
