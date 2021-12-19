package com.bytedance.android.live.liveinteract.linkroom.p286a.p289c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.p261b.C4413d;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.o */
final /* synthetic */ class C4855o implements AbstractC88433f {

    /* renamed from: a */
    private final C4840b f12710a;

    static {
        Covode.recordClassIndex(5437);
    }

    C4855o(C4840b bVar) {
        this.f12710a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4840b bVar = this.f12710a;
        C4413d dVar = (C4413d) obj;
        if (bVar.f38654y != null && TextUtils.equals(dVar.f12004a, C4413d.f11999b) && bVar.f12687d) {
            ((C4840b.AbstractC4842a) bVar.f38654y).mo10594h();
        }
    }
}
