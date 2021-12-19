package dmt.p4542av.video.p4545b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31077h;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.vesdk.C85581w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.c */
public final class C88173c implements AbstractC88174d {
    static {
        Covode.recordClassIndex(104208);
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88174d
    /* renamed from: a */
    public final AbstractC31077h mo142717a(AbstractC14088a aVar) {
        C89219l.m154721d(aVar, "");
        String[] videoPaths = aVar.getVideoPaths();
        if (videoPaths == null) {
            videoPaths = new String[0];
        }
        C31079j jVar = new C31079j(videoPaths);
        jVar.mo56409a(C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
        jVar.f74442d = aVar.getAudioPaths();
        return jVar;
    }
}
