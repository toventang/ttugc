package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bd */
final /* synthetic */ class C72169bd implements C84896h.AbstractC84898b {

    /* renamed from: a */
    private final MvImageChooseAdapter f161780a;

    /* renamed from: b */
    private final MvImageChooseAdapter.C72050e f161781b;

    static {
        Covode.recordClassIndex(84834);
    }

    C72169bd(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.C72050e eVar) {
        this.f161780a = mvImageChooseAdapter;
        this.f161781b = eVar;
    }

    @Override // com.p2082ss.android.ugc.tools.utils.C84896h.AbstractC84898b
    /* renamed from: a */
    public final void mo96669a(Object obj) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161780a;
        MvImageChooseAdapter.C72050e eVar = this.f161781b;
        if (obj != null && ((Boolean) obj).booleanValue()) {
            mvImageChooseAdapter.f161440g.mo114287a();
            if (mvImageChooseAdapter.f161440g.mo114292b()) {
                if (mvImageChooseAdapter.f161436c instanceof Activity) {
                    new C23144b((Activity) mvImageChooseAdapter.f161436c).mo37635a(mvImageChooseAdapter.f161435b).mo37637b();
                } else {
                    new C79459a(mvImageChooseAdapter.f161436c).mo123052a(mvImageChooseAdapter.f161435b).mo123053a();
                }
                if (eVar.f161483i.mo96674b()) {
                    MvImageChooseAdapter.m127143a((MediaModel) eVar.f161483i, false);
                }
            } else if (mvImageChooseAdapter.f161440g.mo114293b(eVar.f161483i) && mvImageChooseAdapter.f161440g.mo114291a(eVar.f161483i)) {
                mvImageChooseAdapter.mo114275a(eVar.f161483i, new C72170be(mvImageChooseAdapter, eVar));
            }
        } else if (eVar.f161483i.mo96674b()) {
            new C79459a(mvImageChooseAdapter.f161436c).mo123052a(mvImageChooseAdapter.f161436c.getString(R.string.cc7)).mo123053a();
            MvImageChooseAdapter.m127143a((MediaModel) eVar.f161483i, false);
        } else {
            new C79459a(mvImageChooseAdapter.f161436c).mo123052a(mvImageChooseAdapter.f161436c.getString(R.string.doo)).mo123053a();
        }
    }
}
