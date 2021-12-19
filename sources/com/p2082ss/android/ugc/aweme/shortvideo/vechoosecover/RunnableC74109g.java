package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.g */
final /* synthetic */ class RunnableC74109g implements Runnable {

    /* renamed from: a */
    private final ChooseCoverActivity f166401a;

    static {
        Covode.recordClassIndex(86862);
    }

    RunnableC74109g(ChooseCoverActivity chooseCoverActivity) {
        this.f166401a = chooseCoverActivity;
    }

    public final void run() {
        Bitmap c;
        Bitmap c2;
        ChooseCoverActivity chooseCoverActivity = this.f166401a;
        if (chooseCoverActivity.f166351f != null) {
            C69980b bVar = chooseCoverActivity.f166351f;
            if (bVar.f156423u && (c2 = bVar.f156414l.mo110436a().mo56340c()) != null) {
                bVar.f156423u = false;
                bVar.f156403a.setVideoCoverFrameView(c2);
                c2.recycle();
            }
            if (bVar.f156419q && (c = bVar.f156414l.mo110436a().mo56340c()) != null) {
                bVar.f156416n = (float) bVar.f156414l.mo110436a().mo56370k();
                bVar.f156423u = false;
                bVar.f156403a.setVideoCoverFrameView(c);
                c.recycle();
            }
        }
    }
}
