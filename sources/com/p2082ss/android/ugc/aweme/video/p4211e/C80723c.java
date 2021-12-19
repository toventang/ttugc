package com.p2082ss.android.ugc.aweme.video.p4211e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LongVideo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84264a;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84273i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84274j;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84276l;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.e.c */
public final class C80723c implements AbstractC84278n {
    static {
        Covode.recordClassIndex(94010);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: b */
    public final C84274j mo117451b(AbstractC84278n.AbstractC84280a aVar) {
        C84264a b = aVar.mo129305b();
        String a = C17975i.m33458a(C80942a.m140471a(b.f188450a).getSourceId());
        if (!TextUtils.isEmpty(a)) {
            return new C84274j(a);
        }
        return aVar.mo129302a(b);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: c */
    public final C84274j mo117452c(AbstractC84278n.AbstractC84280a aVar) {
        C84276l c = aVar.mo129306c();
        String a = C17975i.m33458a(C80942a.m140470a(c.f188464a).getSourceId());
        if (!TextUtils.isEmpty(a)) {
            return new C84274j(a);
        }
        return aVar.mo129304a(c);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: a */
    public final C84274j mo117450a(AbstractC84278n.AbstractC84280a aVar) {
        Aweme b;
        List<LongVideo> longVideos;
        Video video;
        C84273i a = aVar.mo129301a();
        VideoUrlModel a2 = C80942a.m140472a(a.f188459a);
        String sourceId = a2.getSourceId();
        double duration = a2.getDuration();
        if (!TextUtils.isEmpty(sourceId) && (b = AwemeService.m70060b().mo60684b(sourceId)) != null && (longVideos = b.getLongVideos()) != null && !longVideos.isEmpty()) {
            for (LongVideo longVideo : longVideos) {
                if (!(longVideo == null || (video = longVideo.getVideo()) == null || ((double) video.getDuration()) != duration)) {
                    return aVar.mo129303a(a);
                }
            }
        }
        String a3 = C17975i.m33458a(a2.getSourceId());
        if (!TextUtils.isEmpty(a3)) {
            return new C84274j(a3);
        }
        return aVar.mo129303a(a);
    }
}
