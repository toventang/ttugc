package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.b */
public final class C69769b {
    static {
        Covode.recordClassIndex(82175);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.b$a */
    public static final class C69770a extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ Workspace f155928a;

        static {
            Covode.recordClassIndex(82176);
        }

        C69770a(Workspace workspace) {
            this.f155928a = workspace;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            Workspace workspace = this.f155928a;
            if (workspace != null) {
                workspace.mo110098g();
            }
        }
    }

    /* renamed from: a */
    public static final void m123294a(C43223c cVar) {
        C84425b a = new C84425b().mo129404a("duration", System.currentTimeMillis() - cVar.f100886I).mo129406a("videoPath", cVar.f100907g).mo129404a("modify_time", cVar.f100886I);
        C40340a aVar = new C40340a();
        aVar.mo69486a(cVar);
        C80322d.m139251a("tool_performance_draft_save", a.mo129404a("size", aVar.mo69485a()).f188764a);
    }

    /* renamed from: a */
    private static boolean m123296a(File file) {
        MethodCollector.m26663i(10200);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(10200);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(10200);
        return delete;
    }

    /* renamed from: a */
    public static final void m123295a(Workspace workspace, boolean z) {
        if (!z) {
            if (SettingsManager.m29616a().mo25400a("creative_prefix_enable_delete_record_files_after_cancel_on_save_draft", false) && C67296h.m119245e()) {
                C67296h.m119235a(new C69770a(workspace), (String) null);
            } else if (workspace != null) {
                workspace.mo110098g();
            }
        }
    }

    /* renamed from: a */
    public static final DraftFileSaveException m123293a(EditPreviewInfo editPreviewInfo, C43223c cVar) {
        String valueOf;
        ArrayList arrayList = new ArrayList();
        DraftFileSaveException draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
        int i = 0;
        for (T t : editPreviewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (!C84896h.m145869b(t2.getVideoPath())) {
                valueOf = C89159j.m154655f(new File(t2.getVideoPath()));
            } else {
                valueOf = String.valueOf(t2.getVideoPath().hashCode());
            }
            String str = C43209h.m86171a(editPreviewInfo.getDraftDir()) + valueOf + "_copy";
            VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
            if (videoCutInfo == null) {
                C89219l.m154715b();
            }
            int start = (int) videoCutInfo.getStart();
            VideoCutInfo videoCutInfo2 = t2.getVideoCutInfo();
            if (videoCutInfo2 == null) {
                C89219l.m154715b();
            }
            int end = (int) videoCutInfo2.getEnd();
            int[] iArr = {start, end};
            if (t2.getVideoFileInfo().getDuration() - ((long) (end - start)) <= 5000) {
                draftFileSaveException = C43209h.m86170a(t2.getVideoPath(), str, true);
                if (!draftFileSaveException.isSuc()) {
                    return draftFileSaveException;
                }
            } else {
                File file = new File(str);
                if (file.exists()) {
                    m123296a(file);
                }
                C84902i.m145883a(str, true);
                int trimToDraft = VEUtils.trimToDraft(t2.getVideoPath(), new int[]{start, end}, str, iArr);
                if (trimToDraft != 0) {
                    return new DraftFileSaveException(trimToDraft - 20000, new RuntimeException("VEUtils.trimToDraft invoke ; retCode : ".concat(String.valueOf(trimToDraft))));
                }
            }
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, t2.getAudioPath(), VideoFileInfo.copy$default(t2.getVideoFileInfo(), 0, 0, 0, 0, 0, 0, 0, 0, 255, null));
            VideoCutInfo videoCutInfo3 = t2.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                editVideoSegment.setVideoCutInfo(new VideoCutInfo((long) iArr[0], (long) iArr[1], videoCutInfo3.getSpeed(), videoCutInfo3.getRotate()));
            }
            arrayList.add(editVideoSegment);
            i = i2;
        }
        cVar.mo73679f(arrayList);
        return draftFileSaveException;
    }
}
