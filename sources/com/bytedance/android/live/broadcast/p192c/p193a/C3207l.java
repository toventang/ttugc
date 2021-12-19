package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9624aw;
import com.bytedance.android.livesdk.model.message.C9721ce;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.live.broadcast.c.a.l */
final /* synthetic */ class C3207l implements AbstractC88983w {

    /* renamed from: a */
    private final C9895y f9235a;

    static {
        Covode.recordClassIndex(3688);
    }

    C3207l(C9895y yVar) {
        this.f9235a = yVar;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C9904t tVar;
        C9895y yVar = this.f9235a;
        C9721ce ceVar = null;
        if (!(yVar == null || yVar.getMessageId() == 0 || yVar.f23932g == null || (tVar = yVar.f23945t) == null)) {
            String assetsPath = ((IGiftService) C6193a.m13435a(IGiftService.class)).getAssetsPath("effects", tVar.f24009n);
            if (!C13627m.m24498a(assetsPath)) {
                ceVar = new C9721ce();
                if (tVar.f24003h <= 0) {
                    tVar.f24003h = 3000;
                }
                ceVar.f23694o = (long) tVar.f24003h;
                ceVar.f23695p = true;
                ceVar.f23696q = (C9624aw) C4139e.C4140a.f11575b.mo46670a(tVar.f24010o, C9624aw.class);
                ceVar.f23899a = yVar.getMessageId();
                ceVar.f23908j = tVar.f23999d;
                ceVar.f23900b = tVar.f24009n;
                ceVar.f23901c = tVar.f24001f;
                ceVar.f23902d = assetsPath;
                ceVar.f23903e = yVar.f23943r;
                ceVar.f23904f = yVar.f23933h;
                ceVar.f23905g = yVar.f23932g;
                ceVar.f23906h = tVar.f23998c;
            }
        }
        vVar.mo143031a(ceVar);
        vVar.mo143023a();
    }
}
