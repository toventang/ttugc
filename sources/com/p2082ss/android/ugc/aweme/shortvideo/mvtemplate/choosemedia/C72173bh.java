package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bh */
public final /* synthetic */ class C72173bh implements C84896h.AbstractC84898b {

    /* renamed from: a */
    private final MvImageChooseAdapter f161789a;

    /* renamed from: b */
    private final MvImageChooseAdapter.MyMediaModel f161790b;

    static {
        Covode.recordClassIndex(84838);
    }

    C72173bh(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        this.f161789a = mvImageChooseAdapter;
        this.f161790b = myMediaModel;
    }

    @Override // com.p2082ss.android.ugc.tools.utils.C84896h.AbstractC84898b
    /* renamed from: a */
    public final void mo96669a(Object obj) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161789a;
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.f161790b;
        if (obj == null || !((Boolean) obj).booleanValue()) {
            if (myMediaModel.mo96674b()) {
                new C79459a(mvImageChooseAdapter.f161436c).mo123052a(mvImageChooseAdapter.f161436c.getString(R.string.cc7)).mo123053a();
                MvImageChooseAdapter.m127143a((MediaModel) myMediaModel, false);
                return;
            }
            new C79459a(mvImageChooseAdapter.f161436c).mo123052a(mvImageChooseAdapter.f161436c.getString(R.string.doo)).mo123053a();
        } else if (mvImageChooseAdapter.f161440g.mo114292b()) {
            if (mvImageChooseAdapter.f161436c instanceof Activity) {
                new C23144b((Activity) mvImageChooseAdapter.f161436c).mo37635a(mvImageChooseAdapter.f161435b).mo37637b();
            } else {
                new C79459a(mvImageChooseAdapter.f161436c).mo123052a(mvImageChooseAdapter.f161435b).mo123053a();
            }
            if (myMediaModel.mo96674b()) {
                MvImageChooseAdapter.m127143a((MediaModel) myMediaModel, false);
            }
        } else if (mvImageChooseAdapter.f161440g.mo114293b(myMediaModel) && mvImageChooseAdapter.f161440g.mo114291a(myMediaModel)) {
            mvImageChooseAdapter.mo114275a(myMediaModel, new C72174bi(mvImageChooseAdapter, myMediaModel));
        }
    }
}
