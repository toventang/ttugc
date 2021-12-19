package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71992b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74295o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.j */
final /* synthetic */ class RunnableC69991j implements Runnable {

    /* renamed from: a */
    private final C69980b f156442a;

    /* renamed from: b */
    private final VideoPublishEditModel f156443b;

    static {
        Covode.recordClassIndex(82405);
    }

    RunnableC69991j(C69980b bVar, VideoPublishEditModel videoPublishEditModel) {
        this.f156442a = bVar;
        this.f156443b = videoPublishEditModel;
    }

    public final void run() {
        C69980b bVar = this.f156442a;
        VideoPublishEditModel videoPublishEditModel = this.f156443b;
        int measuredHeight = bVar.f156403a.getMeasuredHeight();
        int oneThumbWidth = (int) bVar.f156403a.getOneThumbWidth();
        if (bVar.mo110432a(videoPublishEditModel)) {
            C71992b bVar2 = new C71992b(oneThumbWidth, measuredHeight);
            bVar.f156403a.setAdapter(bVar2);
            C71993c cVar = new C71993c();
            cVar.f161328b = C69989h.f156440a;
            C71993c a = cVar.mo114167a(oneThumbWidth, measuredHeight);
            a.f161338l = bVar.f156421s;
            a.f161339m = bVar.f156422t;
            a.mo114168a(bVar.getActivity(), bVar.f156414l.mo110436a(), 7, new C69990i(bVar2));
            return;
        }
        bVar.f156403a.setAdapter(new C74295o(bVar.f156412j, oneThumbWidth, measuredHeight));
    }
}
