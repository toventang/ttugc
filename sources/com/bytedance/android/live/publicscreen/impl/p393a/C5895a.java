package com.bytedance.android.live.publicscreen.impl.p393a;

import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.a.a */
public final class C5895a {

    /* renamed from: a */
    public static final Set<Long> f14759a = new LinkedHashSet();

    /* renamed from: b */
    public static final C5895a f14760b = new C5895a();

    private C5895a() {
    }

    static {
        Covode.recordClassIndex(6502);
    }

    /* renamed from: a */
    public static void m12895a(C5993b bVar) {
        C89219l.m154721d(bVar, "");
        Set<Long> set = f14759a;
        MESSAGE message = bVar.f14737d;
        C89219l.m154716b(message, "");
        set.remove(Long.valueOf(((C9878i) message).f23852a));
    }
}
