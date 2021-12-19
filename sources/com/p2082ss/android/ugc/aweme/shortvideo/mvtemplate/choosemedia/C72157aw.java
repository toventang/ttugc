package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.View$OnClickListenerC72152av;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84896h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw */
final /* synthetic */ class C72157aw implements C84896h.AbstractC84898b {

    /* renamed from: a */
    private final View$OnClickListenerC72152av.C72155c f161763a;

    /* renamed from: b */
    private final MediaModel f161764b;

    static {
        Covode.recordClassIndex(84822);
    }

    C72157aw(View$OnClickListenerC72152av.C72155c cVar, MediaModel mediaModel) {
        this.f161763a = cVar;
        this.f161764b = mediaModel;
    }

    @Override // com.p2082ss.android.ugc.tools.utils.C84896h.AbstractC84898b
    /* renamed from: a */
    public final void mo96669a(Object obj) {
        View$OnClickListenerC72152av.C72155c cVar = this.f161763a;
        MediaModel mediaModel = this.f161764b;
        if (obj != null && ((Boolean) obj).booleanValue()) {
            int i = cVar.f161760b.getLayoutParams().width > 0 ? cVar.f161760b.getLayoutParams().width : -1;
            C84402a.m145175a(cVar.f161760b, C84896h.m145871d(mediaModel.f134662b).toString(), i, i, Bitmap.Config.ARGB_4444);
        }
    }
}
