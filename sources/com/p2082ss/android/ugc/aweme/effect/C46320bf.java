package com.p2082ss.android.ugc.aweme.effect;

import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70528i;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;

/* renamed from: com.ss.android.ugc.aweme.effect.bf */
public final /* synthetic */ class C46320bf implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107976a;

    static {
        Covode.recordClassIndex(54897);
    }

    public C46320bf(C46267ac acVar) {
        this.f107976a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107976a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            acVar.f107850K = booleanValue;
            if (!booleanValue) {
                acVar.f107891s.setVisibility(8);
                acVar.f107892t.setVisibility(8);
            }
            C46371s.m89467a(acVar.f107884l, booleanValue, acVar.mo78765i(), acVar.f107848I, new C46278af(acVar, booleanValue));
            if (booleanValue) {
                if (acVar.f107870ae != null) {
                    acVar.f107870ae.mo87533b(acVar.f107871af);
                }
                if (acVar.f107882j != null) {
                    acVar.f107877e.setValue(C88296t.m153438b(0));
                    acVar.mo78745a(0, false);
                    acVar.mo78769m();
                }
                acVar.mo78770n();
                if (acVar.f107843D == null) {
                    acVar.f107843D = new C46294av(acVar);
                    acVar.f107840A.mo56344c(acVar.f107843D);
                }
            } else if (acVar.f107870ae != null) {
                acVar.f107870ae.mo87535c(acVar.f107871af);
            }
            if (bool.booleanValue()) {
                acVar.f107863X.mo78860k().setValue(C88297u.m153440a(C77795c.m135910a(true, false, false, false), acVar.mo78764h() + C70636dh.m124833c(acVar.f107851L), acVar.mo78765i(), acVar.mo78771o(), C33398a.f79357a.mo59453d()));
                acVar.f107896x.mo111175o();
            } else {
                acVar.f107863X.mo78860k().setValue(C88297u.m153443b(C0643b.m2378c(acVar.f107851L, R.color.a2), acVar.mo78764h() + C70636dh.m124833c(acVar.f107851L), acVar.mo78765i(), acVar.mo78771o(), C33398a.f79357a.mo59453d()));
            }
            if (bool.booleanValue() && C71817eu.m126803n(acVar.f107874b) && acVar.f107869ad) {
                if (acVar.f107897y != null) {
                    acVar.f107896x.mo111132a(acVar.f107896x.getSlideX(), C70528i.m124563a(acVar.f107874b.getMediaModelList(), true, null, 4));
                    if (C46344a.m89397a(acVar.f107893u, acVar.f107849J, acVar.mo78751a())) {
                        acVar.mo78753b();
                    }
                }
                acVar.f107869ad = false;
                if (acVar.f107842C != null && acVar.f107895w != null && acVar.f107895w.getAdapter() != null) {
                    acVar.mo78761e();
                    acVar.f107842C.mo116906b();
                    if (acVar.f107895w.getAdapter() instanceof ChooseVideoCoverView.C74231a) {
                        ((ChooseVideoCoverView.C74231a) acVar.f107895w.getAdapter()).mo116715a();
                    }
                }
            }
        }
    }
}
