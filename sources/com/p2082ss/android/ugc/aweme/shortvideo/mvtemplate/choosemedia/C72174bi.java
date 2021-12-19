package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bi */
final /* synthetic */ class C72174bi implements MvImageChooseAdapter.AbstractC72046a {

    /* renamed from: a */
    private final MvImageChooseAdapter f161791a;

    /* renamed from: b */
    private final MvImageChooseAdapter.MyMediaModel f161792b;

    static {
        Covode.recordClassIndex(84839);
    }

    C72174bi(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        this.f161791a = mvImageChooseAdapter;
        this.f161792b = myMediaModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72046a
    /* renamed from: a */
    public final void mo114285a() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161791a;
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.f161792b;
        C84911q.m145928d("MvImageChooseAdapter notifyMediaClick select originIndex " + myMediaModel.f161470u + " selectIndex " + myMediaModel.f161471v);
        if (mvImageChooseAdapter.f161437d.size() == mvImageChooseAdapter.f161434a) {
            mvImageChooseAdapter.notifyDataSetChanged();
            if (mvImageChooseAdapter.f161440g != null) {
                mvImageChooseAdapter.f161444k = mvImageChooseAdapter.f161440g.mo114286a(myMediaModel, true);
                mvImageChooseAdapter.f161440g.mo114290a(mvImageChooseAdapter.f161437d, MvImageChooseAdapter.EnumC72047b.PREVIEW, myMediaModel);
                return;
            }
            return;
        }
        mvImageChooseAdapter.f161437d.add(myMediaModel);
        if (mvImageChooseAdapter.f161440g != null) {
            mvImageChooseAdapter.f161444k = mvImageChooseAdapter.f161440g.mo114286a(myMediaModel, true);
            mvImageChooseAdapter.f161440g.mo114290a(mvImageChooseAdapter.f161437d, MvImageChooseAdapter.EnumC72047b.PREVIEW, myMediaModel);
        }
        myMediaModel.f161471v = mvImageChooseAdapter.f161444k;
        if (mvImageChooseAdapter.f161437d.size() == mvImageChooseAdapter.f161434a) {
            mvImageChooseAdapter.notifyDataSetChanged();
        } else {
            mvImageChooseAdapter.mo114284e();
        }
    }
}
