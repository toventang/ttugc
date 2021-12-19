package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import com.bytedance.android.livesdkapi.depend.model.live.C11735p;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.i */
public final /* synthetic */ class C7542i implements AbstractC88434g {

    /* renamed from: a */
    static final AbstractC88434g f18752a = new C7542i();

    static {
        Covode.recordClassIndex(8315);
    }

    private C7542i() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(((C11735p) obj).f28079a));
        hashMap.put("connection_type", "anchor");
        return hashMap;
    }
}
