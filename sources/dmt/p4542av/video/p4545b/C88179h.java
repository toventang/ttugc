package dmt.p4542av.video.p4545b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31077h;
import com.p2082ss.android.ugc.asve.editor.C31087p;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEEditorModel;
import dmt.p4542av.video.VEPreviewParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.h */
public final class C88179h implements AbstractC88174d {
    static {
        Covode.recordClassIndex(104214);
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88174d
    /* renamed from: a */
    public final AbstractC31077h mo142717a(AbstractC14088a aVar) {
        AbstractC14088a aVar2;
        VEEditorModel vEEditorModel;
        C89219l.m154721d(aVar, "");
        if (aVar.getEditorHandler() <= 0) {
            return null;
        }
        if (!(aVar instanceof VEPreviewParams)) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar2;
        if (vEPreviewParams == null || (vEEditorModel = vEPreviewParams.mEditorModel) == null) {
            return null;
        }
        C31087p pVar = new C31087p(vEEditorModel, ((VEPreviewParams) aVar).mTimelineParams);
        C84911q.m145921a("initVEEditor with editorModel");
        return pVar;
    }
}
