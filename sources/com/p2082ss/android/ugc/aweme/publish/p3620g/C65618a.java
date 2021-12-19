package com.p2082ss.android.ugc.aweme.publish.p3620g;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62856b;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import dmt.p4542av.video.C88168aj;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.publish.g.a */
public final class C65618a {

    /* renamed from: a */
    public C27252o f147921a;

    /* renamed from: b */
    public boolean f147922b;

    /* renamed from: c */
    private double f147923c;

    /* renamed from: d */
    private String f147924d;

    /* renamed from: e */
    private String f147925e = "video";

    /* renamed from: f */
    private Object f147926f;

    /* renamed from: g */
    private String f147927g;

    static {
        Covode.recordClassIndex(77109);
    }

    /* renamed from: a */
    public final void mo104798a(boolean z) {
        String str;
        C27252o oVar = this.f147921a;
        if (oVar != null) {
            long a = oVar.mo45339a(TimeUnit.MILLISECONDS);
            C84425b a2 = new C84425b().mo129406a("duration", C1764a.m5929a(Locale.US, "%d", new Object[]{Long.valueOf(a)})).mo129406a("status", String.valueOf(z ? 1 : 0)).mo129406a("bite_rate", new StringBuilder().append(C65357b.m117047c()).toString()).mo129406a("fps", new StringBuilder().append(this.f147923c).toString()).mo129406a("content_source", this.f147924d).mo129406a("content_type", this.f147925e).mo129406a("shoot_way", this.f147927g);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f147926f;
            C84425b a3 = a2.mo129406a("creation_id", videoPublishEditModel.creationId).mo129403a("file_bitrate", C88168aj.m153239c(videoPublishEditModel.mOutputFile));
            if (videoPublishEditModel.isSaveLocal()) {
                str = "1";
            } else {
                str = "0";
            }
            a3.mo129406a("is_download_video", str).mo129406a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo129406a("prop_list", videoPublishEditModel.mStickerID).mo129406a("effect_list", videoPublishEditModel.getEditEffectList()).mo129406a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            C39162r.m79460a("pre_release_time", a2.f188764a);
        }
    }

    public C65618a(Object obj, String str, boolean z) {
        this.f147926f = obj;
        this.f147924d = C62856b.m113272a(0, obj);
        this.f147927g = str;
        this.f147923c = (double) ((VideoPublishEditModel) obj).videoFps();
        this.f147922b = z;
    }
}
