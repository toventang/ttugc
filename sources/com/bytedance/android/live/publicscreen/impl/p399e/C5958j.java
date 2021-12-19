package com.bytedance.android.live.publicscreen.impl.p399e;

import androidx.core.p036g.C0692e;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.live.publicscreen.impl.p393a.C5895a;
import com.bytedance.android.live.publicscreen.impl.p399e.C5953h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.publicscreen.impl.e.j */
public final /* synthetic */ class C5958j implements AbstractC89172b {

    /* renamed from: a */
    private final C5953h f14944a;

    static {
        Covode.recordClassIndex(6566);
    }

    C5958j(C5953h hVar) {
        this.f14944a = hVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C5953h hVar = this.f14944a;
        C0692e eVar = (C0692e) obj;
        if (eVar.f2750a == null || eVar.f2751b == null || hVar.f38654y == null || hVar.f14930m == null) {
            return C89391z.f203057a;
        }
        int size = hVar.f14927j.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            AbstractC5873h hVar2 = hVar.f14927j.get(size);
            if (!(hVar2 instanceof AbstractC5877k) || ((AbstractC5877k) hVar2).f14737d.getMessageId() != eVar.f2750a.getMessageId()) {
                size--;
            } else {
                C5895a.m12895a((C5993b) hVar.f14927j.get(size));
                hVar.mo11831a(size, new C5993b(eVar.f2751b));
                if (hVar.f38654y != null) {
                    ((C5953h.AbstractC5956a) hVar.f38654y).mo11842a(size);
                }
            }
        }
        return C89391z.f203057a;
    }
}
