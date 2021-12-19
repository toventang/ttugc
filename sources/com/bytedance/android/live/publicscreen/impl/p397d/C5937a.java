package com.bytedance.android.live.publicscreen.impl.p397d;

import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5881a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.d.a */
public final class C5937a implements AbstractC5881a {

    /* renamed from: a */
    public final Map<Class<? extends IMessage>, AbstractC5859b<? extends IMessage>> f14863a = new HashMap();

    static {
        Covode.recordClassIndex(6545);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5881a
    /* renamed from: a */
    public final <MESSAGE extends IMessage> void mo11734a(Class<MESSAGE> cls, AbstractC5859b<MESSAGE> bVar) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(bVar, "");
        this.f14863a.put(cls, bVar);
    }
}
