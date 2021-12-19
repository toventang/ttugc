package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.util.concurrent.Callable;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c */
public final class C75926c {

    /* renamed from: a */
    public static final C75926c f170540a = new C75926c();

    private C75926c() {
    }

    static {
        Covode.recordClassIndex(88867);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c$a */
    public static final class CallableC75927a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70650dt f170541a;

        /* renamed from: b */
        final /* synthetic */ C75439a f170542b;

        static {
            Covode.recordClassIndex(88868);
        }

        public CallableC75927a(C70650dt dtVar, C75439a aVar) {
            this.f170541a = dtVar;
            this.f170542b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C75439a backgroundVideo;
            for (TimeSpeedModelExtension timeSpeedModelExtension : this.f170541a) {
                if (!(timeSpeedModelExtension == null || (backgroundVideo = timeSpeedModelExtension.getBackgroundVideo()) == null || !(!C89219l.m154714a(backgroundVideo, this.f170542b)))) {
                    C75926c.m133132a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final String m133131a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.uniqueVideoSessionDir(C70638dj.f158106i);
        } else {
            str = null;
        }
        return C89219l.m154704a(str, (Object) File.separator);
    }

    /* renamed from: a */
    public static final void m133132a(String str, String str2) {
        try {
            C80720e.m139931c(str);
            C80720e.m139931c(str2);
        } catch (Exception e) {
            C40970e.m82485a("Delete BGV failed, videoPath: " + str + " audioPath: " + str2 + " error: " + e.getMessage());
        }
    }
}
