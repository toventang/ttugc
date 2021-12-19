package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70044a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.b */
public final class C75925b implements AbstractC72263v {

    /* renamed from: a */
    private final Activity f170539a;

    static {
        Covode.recordClassIndex(88866);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    public C75925b(Activity activity) {
        this.f170539a = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        ShortVideoContext shortVideoContext;
        long j;
        BackgroundVideoCompileConfigure backgroundVideoCompileConfigure;
        C89219l.m154721d(intent, "");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null && (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) != null && !parcelableArrayListExtra.isEmpty() && !C23697c.m44781a(((MediaModel) parcelableArrayListExtra.get(0)).f134662b)) {
            C59187c.f134693a.mo96693b();
            Intent intent2 = new Intent();
            intent2.putExtra("file_path", ((MediaModel) parcelableArrayListExtra.get(0)).f134662b);
            intent2.putExtra("from_background_video", true);
            if (shortVideoContext.f155817b.f155664t) {
                j = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();
            } else {
                j = 15000;
            }
            intent2.putExtra("background_video_max_length", j);
            intent2.putExtra("enter_method", shortVideoContext.f155838w);
            Workspace workspace = shortVideoContext.f155817b.f155652h;
            if (workspace != null) {
                backgroundVideoCompileConfigure = C70044a.m123683a(workspace);
            } else {
                backgroundVideoCompileConfigure = null;
            }
            intent2.putExtra("background_video_compile_configure", backgroundVideoCompileConfigure);
            Activity activity = this.f170539a;
            if (activity != null) {
                C72724a.m128203a().mo62196a((Context) activity, intent2, i);
            }
        }
    }
}
