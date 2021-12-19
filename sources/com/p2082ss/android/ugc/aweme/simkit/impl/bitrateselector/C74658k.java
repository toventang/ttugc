package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63098b;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63100d;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.C74680b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.k */
public final class C74658k implements AbstractC81981g {

    /* renamed from: a */
    private final AbstractC81981g f167811a;

    /* renamed from: b */
    private final AbstractC81962a f167812b;

    /* renamed from: c */
    private final AbstractC63098b f167813c = AbstractC63100d.m114034a().mo101327a();

    static {
        Covode.recordClassIndex(87481);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117464a(AbstractC81962a aVar) {
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117465a(List<? extends AbstractC81966e> list) {
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: b */
    public final void mo117466b(List<? extends AbstractC81963b> list) {
    }

    protected C74658k(AbstractC81981g gVar, AbstractC81962a aVar) {
        this.f167811a = gVar;
        this.f167812b = aVar;
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final C81967f mo61744a(List<? extends AbstractC81964c> list, Map<String, Object> map) {
        System.currentTimeMillis();
        String str = (String) map.get("source_id");
        IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = AbstractC74616d.m131036a().mo117290b().getDimensionBitrateCurveConfig();
        AbstractC81962a aVar = null;
        if (dimensionBitrateCurveConfig != null && dimensionBitrateCurveConfig.mo117320a()) {
            AbstractC63098b bVar = this.f167813c;
            C63102f b = dimensionBitrateCurveConfig.mo117321b();
            b.f143408g = str;
            C74680b bVar2 = (C74680b) bVar.mo101326a(b, C74680b.class);
            if (bVar2 == null) {
                C84229a.f188297a.mo129051b(str, null);
            } else {
                C84229a.f188297a.mo129051b(str, new StringBuilder().append(bVar2.f167865a).append(bVar2.f167866b).append(bVar2.f167867c).append(bVar2.f167868d).append(bVar2.f167869e).toString());
                aVar = bVar2;
            }
        }
        System.currentTimeMillis();
        AbstractC81981g gVar = this.f167811a;
        if (aVar == null) {
            aVar = this.f167812b;
        }
        gVar.mo117464a(aVar);
        return this.f167811a.mo61744a(list, map);
    }
}
