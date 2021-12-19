package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69743b;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.l */
public final class C69782l implements AbstractC69768a {

    /* renamed from: a */
    public final C43223c f155947a;

    /* renamed from: b */
    public final VideoPublishEditModel f155948b;

    /* renamed from: c */
    public final boolean f155949c;

    /* renamed from: d */
    private final Workspace f155950d;

    static {
        Covode.recordClassIndex(82188);
    }

    /* renamed from: b */
    private final void m123310b() {
        String str;
        EditPreviewInfo h = C43225d.m86338h(this.f155947a);
        if (h == null) {
            C89219l.m154715b();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        File a = this.f155950d.mo110089a();
        C89219l.m154716b(a, "");
        String sb2 = sb.append(C69744c.m123269a(a.getPath())).append(File.separator).toString();
        for (T t : h.getVideoList()) {
            String videoPath = t.getVideoPath();
            String str2 = C70637di.f158101d;
            C89219l.m154716b(str2, "");
            String a2 = C89361p.m154868a(videoPath, str2, sb2);
            String audioPath = t.getAudioPath();
            if (audioPath != null) {
                String str3 = C70637di.f158101d;
                C89219l.m154716b(str3, "");
                str = C89361p.m154868a(audioPath, str3, sb2);
            } else {
                str = null;
            }
            arrayList.add(new EditVideoSegment(a2, str, t.getVideoFileInfo()));
        }
        this.f155947a.mo73632a(new EditPreviewInfo(arrayList, h.getPreviewWidth(), h.getPreviewHeight(), h.getSceneIn(), h.getSceneOut(), sb2));
        C71833a.m126843a();
        C69769b.m123295a(this.f155950d, this.f155949c);
        C69769b.m123294a(this.f155947a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        boolean z;
        List<EditVideoSegment> videoList = this.f155948b.getPreviewInfo().getVideoList();
        if (videoList == null || videoList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(4, new DraftFileSaveException(-600, new RuntimeException("model.previewInfo.videoList.isNullOrEmpty()")));
        }
        File a = this.f155950d.mo110089a();
        C89219l.m154716b(a, "");
        String a2 = C69744c.m123269a(a.getPath());
        C84902i.m145899c(a2);
        DraftFileSaveException draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
        for (T t : this.f155948b.getPreviewInfo().getVideoList()) {
            draftFileSaveException = C43209h.m86170a(t.getVideoPath(), a2 + File.separator + C89159j.m154655f(new File(t.getVideoPath())), true);
            if (!draftFileSaveException.isSuc()) {
                return new DraftFileSaveResult(4, draftFileSaveException);
            }
            String audioPath = t.getAudioPath();
            if (!(audioPath == null || audioPath.length() == 0)) {
                C43209h.m86170a(audioPath, a2 + File.separator + C89159j.m154655f(new File(audioPath)), true);
            }
        }
        m123310b();
        return new DraftFileSaveResult(4, draftFileSaveException);
    }

    public C69782l(C43223c cVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f155947a = cVar;
        this.f155948b = videoPublishEditModel;
        this.f155949c = z;
        this.f155950d = C69743b.m123265a(videoPublishEditModel);
    }
}
