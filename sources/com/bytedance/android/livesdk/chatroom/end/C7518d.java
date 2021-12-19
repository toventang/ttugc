package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.end.d */
public final /* synthetic */ class C7518d implements AbstractC88433f {

    /* renamed from: a */
    private final C7512b f18681a;

    /* renamed from: b */
    private final Map f18682b;

    static {
        Covode.recordClassIndex(8290);
    }

    C7518d(C7512b bVar, Map map) {
        this.f18681a = bVar;
        this.f18682b = map;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7512b bVar = this.f18681a;
        Map<String, String> map = this.f18682b;
        map.putAll((Map) obj);
        C6501b.C6502a.m13948a("live_show").mo12652a(map).mo12643a(bVar.f18658c).mo12655b();
    }
}
