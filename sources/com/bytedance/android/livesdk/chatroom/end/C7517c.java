package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdkapi.depend.model.live.C11735p;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.c */
final /* synthetic */ class C7517c implements AbstractC88434g {

    /* renamed from: a */
    static final AbstractC88434g f18680a = new C7517c();

    static {
        Covode.recordClassIndex(8289);
    }

    private C7517c() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(((C11735p) obj).f28079a));
        hashMap.put("connection_type", "anchor");
        return hashMap;
    }
}
