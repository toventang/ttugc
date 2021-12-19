package com.bytedance.android.live.liveinteract.match.p307e.p309b;

import com.bytedance.android.live.liveinteract.match.p305d.p306a.C5011a;
import com.bytedance.android.live.liveinteract.match.p305d.p306a.C5012b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5861c;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.livesdk.model.message.C9615ao;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.e.b.a */
public final class C5015a implements AbstractC5861c<C9615ao> {
    static {
        Covode.recordClassIndex(5598);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.android.livesdk.ab.b.a] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5861c
    /* renamed from: a */
    public final /* synthetic */ AbstractC5873h mo10369a(C9615ao aoVar) {
        C9615ao aoVar2 = aoVar;
        C89219l.m154721d(aoVar2, "");
        int i = aoVar2.f23365a;
        if (i == 0 || i == 4) {
            return new C5011a(aoVar2);
        }
        return new C5012b(aoVar2);
    }
}
