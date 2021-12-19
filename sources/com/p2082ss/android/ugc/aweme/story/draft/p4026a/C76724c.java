package com.p2082ss.android.ugc.aweme.story.draft.p4026a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.draft.a.c */
public final class C76724c extends C76722b {

    /* renamed from: a */
    public static final C76725a f172227a = new C76725a((byte) 0);

    static {
        Covode.recordClassIndex(89720);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.a.c$a */
    public static final class C76725a {
        static {
            Covode.recordClassIndex(89721);
        }

        private C76725a() {
        }

        public /* synthetic */ C76725a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a, com.p2082ss.android.ugc.aweme.story.draft.p4026a.C76722b
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        String valueOf;
        int i;
        C89378p a;
        DraftFileSaveResult a2 = super.mo110127a();
        if (!a2.isSuc()) {
            return a2;
        }
        EditPreviewInfo h = C43225d.m86338h(this.f172225d);
        char c = 0;
        if (h == null) {
            return new DraftFileSaveResult(0, null, 3, null);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : h.getVideoList()) {
            String draftDir = h.getDraftDir();
            if (mo120444a(t.getVideoPath())) {
                a = C89387v.m154943a(mo120445b(), t);
            } else {
                if (!C84896h.m145869b(t.getVideoPath())) {
                    valueOf = C89159j.m154655f(new File(t.getVideoPath()));
                } else {
                    valueOf = String.valueOf(t.getVideoPath().hashCode());
                }
                String str = C43209h.m86171a(draftDir) + valueOf;
                VideoCutInfo videoCutInfo = t.getVideoCutInfo();
                int i2 = -1;
                if (videoCutInfo != null) {
                    i = (int) videoCutInfo.getStart();
                } else {
                    i = -1;
                }
                VideoCutInfo videoCutInfo2 = t.getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    i2 = (int) videoCutInfo2.getEnd();
                }
                int[] iArr = new int[2];
                iArr[c] = i;
                iArr[1] = i2;
                if (t.getVideoCutInfo() == null || t.getVideoFileInfo().getDuration() - ((long) (i2 - i)) <= 5000) {
                    DraftFileSaveException a3 = C43209h.m86170a(t.getVideoPath(), str, true);
                    if (!a3.isSuc()) {
                        a = C89387v.m154943a(a3, t);
                    }
                } else {
                    File file = new File(str);
                    if (file.exists()) {
                        m134300a(file);
                    }
                    C84902i.m145883a(str, true);
                    int trimToDraft = VEUtils.trimToDraft(t.getVideoPath(), new int[]{i, i2}, str, iArr);
                    if (trimToDraft != 0) {
                        a = C89387v.m154943a(new DraftFileSaveException(trimToDraft - 20000, new RuntimeException("VEUtils.trimToDraft invoke ; retCode : ".concat(String.valueOf(trimToDraft)))), t);
                    }
                }
                C84911q.m145921a("ImportVideoFileSaver:src copy,from " + t.getVideoPath() + " to " + str);
                DraftFileSaveException b = mo120445b();
                EditVideoSegment editVideoSegment = new EditVideoSegment(str, t.getAudioPath(), VideoFileInfo.copy$default(t.getVideoFileInfo(), 0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                VideoCutInfo videoCutInfo3 = t.getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    editVideoSegment.setVideoCutInfo(new VideoCutInfo((long) iArr[0], (long) iArr[1], videoCutInfo3.getSpeed(), videoCutInfo3.getRotate()));
                }
                a = C89387v.m154943a(b, editVideoSegment);
            }
            DraftFileSaveException draftFileSaveException = (DraftFileSaveException) a.component1();
            Object component2 = a.component2();
            if (!draftFileSaveException.isSuc()) {
                return new DraftFileSaveResult(2, draftFileSaveException);
            }
            arrayList.add(component2);
            c = 0;
        }
        this.f172225d.mo73632a(h.cloneWithNewVideos(arrayList));
        return new DraftFileSaveResult(0, null, 3, null);
    }

    /* renamed from: a */
    private static boolean m134300a(File file) {
        MethodCollector.m26663i(5834);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5834);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5834);
        return delete;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76724c(VideoPublishEditModel videoPublishEditModel, C43223c cVar) {
        super(videoPublishEditModel, cVar);
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(cVar, "");
    }
}
