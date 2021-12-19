package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.DialogC71047am;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.w */
public final /* synthetic */ class C52284w implements AbstractC0688a {

    /* renamed from: a */
    private final C52264i f120473a;

    /* renamed from: b */
    private final boolean f120474b;

    /* renamed from: c */
    private final boolean f120475c;

    static {
        Covode.recordClassIndex(61672);
    }

    C52284w(C52264i iVar, boolean z, boolean z2) {
        this.f120473a = iVar;
        this.f120474b = z;
        this.f120475c = z2;
    }

    @Override // androidx.core.p036g.AbstractC0688a
    /* renamed from: a */
    public final void mo2720a(Object obj) {
        DialogC71047am amVar;
        C52264i iVar = this.f120473a;
        boolean z = this.f120474b;
        boolean z2 = this.f120475c;
        boolean z3 = !z;
        iVar.f120433d.setVisibility(z3 ? 0 : 4);
        if (z3) {
            iVar.f120433d.mo87957b();
        }
        if (z) {
            iVar.f120433d.f120317k = C52264i.f120409O;
            iVar.f120447r.mo56311a(true);
            return;
        }
        iVar.f120433d.f120317k = 0;
        if (z2) {
            C52155a aVar = iVar.f120423N;
            ActivityC0945e eVar = iVar.f120432c;
            if (eVar != null) {
                if (aVar.f120171h == null) {
                    aVar.f120171h = new DialogC71047am(eVar);
                }
                DialogC71047am amVar2 = aVar.f120171h;
                if ((amVar2 == null || !amVar2.isShowing()) && (amVar = aVar.f120171h) != null) {
                    amVar.show();
                }
            }
            AVServiceImpl.m113116a().fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new C52155a.C52161e(iVar.f120423N));
            return;
        }
        iVar.f120447r.mo56311a(true);
        iVar.f120448s.mo87976a().setValue(C88296t.m153435a());
    }
}
