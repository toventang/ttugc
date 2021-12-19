package com.bytedance.tiktok.homepage.mainpagefragment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33920b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.c */
final /* synthetic */ class RunnableC22812c implements Runnable {

    /* renamed from: a */
    private final C22810a f53859a;

    static {
        Covode.recordClassIndex(26708);
    }

    RunnableC22812c(C22810a aVar) {
        this.f53859a = aVar;
    }

    public final void run() {
        C22810a aVar = this.f53859a;
        C53318b bVar = (C53318b) HomeTabViewModel.C53309a.m98315a(aVar.f53857b).mo89735a("PUBLISH");
        if (bVar != null) {
            if (!C33918a.m69450a() ? false : C33918a.m69451a(C33920b.f80231a.mo60159a(), System.currentTimeMillis())) {
                AbstractC53316a aVar2 = bVar.f122398b;
                if (aVar2 == null) {
                    C89219l.m154710a("tabView");
                }
                aVar2.mo89769o();
                C33920b.f80231a.mo60160a(System.currentTimeMillis());
            } else {
                AbstractC53316a aVar3 = bVar.f122398b;
                if (aVar3 == null) {
                    C89219l.m154710a("tabView");
                }
                aVar3.mo89768n();
            }
            aVar.f53856a.mo93042d();
        }
    }
}
