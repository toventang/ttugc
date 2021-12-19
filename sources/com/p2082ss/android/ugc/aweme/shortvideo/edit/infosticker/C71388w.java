package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3811d.C70985a;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.w */
public final /* synthetic */ class C71388w implements AbstractC0688a {

    /* renamed from: a */
    private final C71056i f159966a;

    /* renamed from: b */
    private final boolean f159967b;

    /* renamed from: c */
    private final boolean f159968c;

    static {
        Covode.recordClassIndex(83916);
    }

    C71388w(C71056i iVar, boolean z, boolean z2) {
        this.f159966a = iVar;
        this.f159967b = z;
        this.f159968c = z2;
    }

    @Override // androidx.core.p036g.AbstractC0688a
    /* renamed from: a */
    public final void mo2720a(Object obj) {
        DialogC71048an anVar;
        C71056i iVar = this.f159966a;
        boolean z = this.f159967b;
        boolean z2 = this.f159968c;
        boolean z3 = !z;
        iVar.f159122d.setVisibility(z3 ? 0 : 4);
        if (z3) {
            iVar.f159122d.mo112171c();
        }
        if (z) {
            iVar.f159122d.f159003l = InfoStickerEditView.f158973m;
            iVar.f159137s.mo56311a(true);
            return;
        }
        iVar.f159122d.f159003l = 0;
        if (z2) {
            C70985a aVar = iVar.f159108O;
            ActivityC0945e eVar = iVar.f159121c;
            if (eVar != null) {
                if (aVar.f158895h == null) {
                    aVar.f158895h = new DialogC71048an(eVar);
                }
                DialogC71048an anVar2 = aVar.f158895h;
                if ((anVar2 == null || !anVar2.isShowing()) && (anVar = aVar.f158895h) != null) {
                    anVar.show();
                }
            }
            AVServiceImpl.m113116a().fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new C70985a.C70991e(iVar.f159108O));
            return;
        }
        iVar.f159137s.mo56311a(true);
        iVar.f159138t.mo112195a().setValue(C88296t.m153435a());
    }
}
