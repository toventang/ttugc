package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4417j.C86537q;
import com.p2082ss.ttvideoengine.p4421n.p4423b.AbstractC86586h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.p */
public final class C63029p implements AbstractC63057c {

    /* renamed from: a */
    private C86535p f143198a;

    static {
        Covode.recordClassIndex(73866);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c
    /* renamed from: c */
    public final Object mo101164c() {
        return this.f143198a;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c
    /* renamed from: b */
    public final String mo101163b() {
        C86535p pVar = this.f143198a;
        if (pVar == null || pVar.f194859d == null) {
            return null;
        }
        return this.f143198a.f194859d.f194919h;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c
    /* renamed from: a */
    public final List<Pair<EnumC63056b, Integer>> mo101162a() {
        C86537q qVar;
        List<C86534o> a;
        ArrayList arrayList = new ArrayList();
        C86535p pVar = this.f143198a;
        if (!(pVar == null || (qVar = pVar.f194859d) == null || (a = qVar.mo137794a()) == null || a.size() <= 0)) {
            for (C86534o oVar : a) {
                arrayList.add(new Pair(C62968f.m113420a(oVar.mo137729c()), Integer.valueOf(oVar.mo137724a(3))));
            }
        }
        return arrayList;
    }

    public C63029p(C86535p pVar) {
        this.f143198a = pVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c
    /* renamed from: a */
    public final EnumC63056b mo101161a(EnumC63056b bVar) {
        return C62968f.m113420a(C86313ai.m148635a(this.f143198a, C62968f.m113421a(bVar), 1, (AbstractC86586h) null));
    }
}
