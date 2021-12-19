package dmt.p4542av.p4543a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.e */
public final class C88131e {
    static {
        Covode.recordClassIndex(104159);
    }

    /* renamed from: a */
    public static final List<EditVideoSegment> m153202a(EditPreviewInfo editPreviewInfo) {
        C89219l.m154721d(editPreviewInfo, "");
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        ArrayList arrayList = new ArrayList();
        for (T t : videoList) {
            if (!C72440e.m127817b(t.getVideoPath())) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
