package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.mvtheme.C61289e;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.e.e */
public final /* synthetic */ class CallableC78951e implements Callable {

    /* renamed from: a */
    private final C43223c f177445a;

    static {
        Covode.recordClassIndex(92100);
    }

    public CallableC78951e(C43223c cVar) {
        this.f177445a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C43223c cVar = this.f177445a;
        ArrayList<String> arrayList = cVar.f100900W.f100753M.selectMediaList;
        if (!C84904k.m145909a(arrayList)) {
            for (String str : arrayList) {
                C80720e.m139931c(str);
            }
        }
        ArrayList<MvNetFileBean> arrayList2 = cVar.f100900W.f100753M.newMaskFileData;
        if (!C84904k.m145909a(arrayList2)) {
            for (MvNetFileBean mvNetFileBean : arrayList2) {
                C80720e.m139931c(mvNetFileBean.getFilePath());
            }
        }
        ArrayList<C61289e> arrayList3 = cVar.f100900W.f100753M.sourceItemList;
        if (!C84904k.m145909a(arrayList3)) {
            for (C61289e eVar : arrayList3) {
                C80720e.m139931c(eVar.getOriginFilePath());
            }
        }
        C80720e.m139931c(cVar.f100900W.f100753M.videoCoverImgPath);
        C80720e.m139931c(cVar.f100900W.f100753M.contactVideoPath);
        return null;
    }
}
