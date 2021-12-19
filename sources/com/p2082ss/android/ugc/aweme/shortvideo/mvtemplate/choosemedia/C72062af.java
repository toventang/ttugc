package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.af */
final /* synthetic */ class C72062af implements AbstractC59178e {

    /* renamed from: a */
    private final C72060ae f161531a;

    static {
        Covode.recordClassIndex(84727);
    }

    C72062af(C72060ae aeVar) {
        this.f161531a = aeVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e
    /* renamed from: a */
    public final void mo96652a(boolean z, int i, List list, AbstractC59174d dVar) {
        C72060ae aeVar = this.f161531a;
        C84911q.m145922a("MvChooseAlbumFragment", "onMediaPageLoadedCallback, success = " + z + " loadType = " + i + " hasMoreImage = " + aeVar.f161521h + " hasMoreVideo = " + aeVar.f161522i);
        if (i == 4) {
            if (!aeVar.f161522i || !z || list == null) {
                aeVar.f161522i = false;
                C84911q.m145922a("MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreVideo = false and return");
                return;
            } else if (list.size() == 0 && dVar != AbstractC59174d.C59175a.f134652a) {
                aeVar.f161522i = false;
            }
        } else if (!aeVar.f161521h || !z || list == null) {
            aeVar.f161521h = false;
            C84911q.m145922a("MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreImage = false and return");
            return;
        } else if (list.size() == 0 && dVar != AbstractC59174d.C59175a.f134652a) {
            aeVar.f161521h = false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            if (!(mediaModel == null || mediaModel.f134662b == null || TextUtils.isEmpty(mediaModel.f134662b))) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = new MvImageChooseAdapter.MyMediaModel(mediaModel.f134661a);
                myMediaModel.f134662b = mediaModel.f134662b;
                myMediaModel.f134663c = mediaModel.f134663c;
                myMediaModel.f134664d = mediaModel.f134664d;
                myMediaModel.f134675o = mediaModel.f134675o;
                myMediaModel.f134665e = mediaModel.f134665e;
                myMediaModel.f134666f = mediaModel.f134666f;
                myMediaModel.f134667g = mediaModel.f134667g;
                myMediaModel.f134668h = mediaModel.f134668h;
                myMediaModel.f134669i = mediaModel.f134669i;
                myMediaModel.f134670j = mediaModel.f134670j;
                myMediaModel.f134671k = mediaModel.f134671k;
                myMediaModel.f134672l = mediaModel.f134672l;
                myMediaModel.f134673m = mediaModel.f134673m;
                myMediaModel.f134674n = mediaModel.f134674n;
                arrayList.add(myMediaModel);
            }
        }
        View$OnClickListenerC72152av avVar = aeVar.f161517d;
        if (i == 4 || i == 3 || i == 1) {
            avVar.mo114407a(arrayList, i, dVar);
        }
    }
}
