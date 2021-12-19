package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: dmt.av.video.ah */
final /* synthetic */ class C88166ah implements AbstractC89172b {

    /* renamed from: a */
    private final C88303z f200121a;

    /* renamed from: b */
    private final VideoPublishEditModel f200122b;

    static {
        Covode.recordClassIndex(104201);
    }

    C88166ah(C88303z zVar, VideoPublishEditModel videoPublishEditModel) {
        this.f200121a = zVar;
        this.f200122b = videoPublishEditModel;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C88303z zVar = this.f200121a;
        VideoPublishEditModel videoPublishEditModel = this.f200122b;
        FilterBean filterBean = (FilterBean) obj;
        if (filterBean == null) {
            return null;
        }
        zVar.f200397H.f200129B = filterBean;
        zVar.f200397H.f200130C = videoPublishEditModel.mSelectedFilterIntensity;
        return null;
    }
}
