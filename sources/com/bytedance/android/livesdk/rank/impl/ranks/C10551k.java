package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.livesdk.model.AbstractC9918z;
import com.bytedance.android.livesdk.model.message.C9600ad;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.k */
final /* synthetic */ class C10551k implements AbstractC9918z {

    /* renamed from: a */
    private final C10546f f25371a;

    /* renamed from: b */
    private final List f25372b;

    static {
        Covode.recordClassIndex(12126);
    }

    C10551k(C10546f fVar, List list) {
        this.f25371a = fVar;
        this.f25372b = list;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9918z
    /* renamed from: a */
    public final void mo16619a() {
        C10546f fVar = this.f25371a;
        for (C9600ad adVar : this.f25372b) {
            fVar.f18625x.insertMessage(adVar.f23305c, true);
        }
    }
}
