package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.be */
final /* synthetic */ class C72170be implements MvImageChooseAdapter.AbstractC72046a {

    /* renamed from: a */
    private final MvImageChooseAdapter f161782a;

    /* renamed from: b */
    private final MvImageChooseAdapter.C72050e f161783b;

    static {
        Covode.recordClassIndex(84835);
    }

    C72170be(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.C72050e eVar) {
        this.f161782a = mvImageChooseAdapter;
        this.f161783b = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AbstractC72046a
    /* renamed from: a */
    public final void mo114285a() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f161782a;
        MvImageChooseAdapter.C72050e eVar = this.f161783b;
        if (mvImageChooseAdapter.f161437d.size() == mvImageChooseAdapter.f161434a) {
            mvImageChooseAdapter.mo114283d();
            if (mvImageChooseAdapter.f161440g != null) {
                mvImageChooseAdapter.f161444k = mvImageChooseAdapter.f161440g.mo114286a(eVar.f161483i, true);
                mvImageChooseAdapter.f161440g.mo114290a(mvImageChooseAdapter.f161437d, MvImageChooseAdapter.EnumC72047b.THUMBNAIL, eVar.f161483i);
            }
        } else if (!mvImageChooseAdapter.f161437d.contains(eVar.f161483i)) {
            mvImageChooseAdapter.f161437d.add(eVar.f161483i);
            if (mvImageChooseAdapter.f161440g != null) {
                mvImageChooseAdapter.f161444k = mvImageChooseAdapter.f161440g.mo114286a(eVar.f161483i, true);
                mvImageChooseAdapter.f161440g.mo114290a(mvImageChooseAdapter.f161437d, MvImageChooseAdapter.EnumC72047b.THUMBNAIL, eVar.f161483i);
            }
            eVar.f161483i.f161471v = mvImageChooseAdapter.f161444k;
            if (mvImageChooseAdapter.f161437d.size() == mvImageChooseAdapter.f161434a) {
                mvImageChooseAdapter.mo114283d();
            }
            C84911q.m145928d("MvImageChooseAdapter notifyImageClick select originIndex " + eVar.f161483i.f161470u + " selectIndex " + eVar.f161483i.f161471v);
            mvImageChooseAdapter.notifyItemChanged(eVar.f161485k, new Object());
        }
    }
}
