package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.common.C39084ah;
import com.p2082ss.android.ugc.aweme.property.C65498u;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.tools.extract.C78588w;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.x */
public final class C78590x {

    /* renamed from: a */
    public static int f176626a = -1;

    /* renamed from: b */
    public static final C78590x f176627b = new C78590x();

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.x$a */
    public static final class C78591a {

        /* renamed from: a */
        public static final C78591a f176628a = new C78591a();

        private C78591a() {
        }

        static {
            Covode.recordClassIndex(91725);
        }

        /* renamed from: a */
        public static final boolean m137203a() {
            return C16048b.m29633a().mo25421a(true, "enable_upload_frame_check", false);
        }
    }

    private C78590x() {
    }

    static {
        Covode.recordClassIndex(91724);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.extract.x$c */
    public static final class C78593c<F, T> implements AbstractC27235f {

        /* renamed from: a */
        public static final C78593c f176630a = new C78593c();

        static {
            Covode.recordClassIndex(91727);
        }

        C78593c() {
        }

        @Override // com.google.p1998c.p1999a.AbstractC27235f
        /* renamed from: a */
        public final /* synthetic */ Object mo45319a(Object obj) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) obj;
            if (editVideoSegment == null) {
                return null;
            }
            C89219l.m154721d(editVideoSegment, "");
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                return new C39084ah(editVideoSegment.getVideoPath(), videoCutInfo.getStart(), videoCutInfo.getEnd() - videoCutInfo.getStart());
            }
            return new C39084ah(editVideoSegment.getVideoPath(), 0, editVideoSegment.getVideoFileInfo().getDuration());
        }
    }

    /* renamed from: c */
    public static final boolean m137201c(Object obj) {
        if (C65498u.m117222a() != 0 || !(obj instanceof VideoPublishEditModel)) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.canvasVideoData != null) {
            return true;
        }
        return videoPublishEditModel.shouldUploadExtractFrames();
    }

    /* renamed from: d */
    private static boolean m137202d(Object obj) {
        if (obj instanceof VideoPublishEditModel) {
            ArrayList<TimeSpeedModelExtension> a = CameraComponentModel.m123137a(((VideoPublishEditModel) obj).mVideoSegmentsDesc);
            C89219l.m154716b(a, "");
            if (!(a instanceof Collection) || !a.isEmpty()) {
                for (T t : a) {
                    C89219l.m154716b(t, "");
                    if (t.getBackgroundVideo() != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static List<Integer> m137200b(Object obj) {
        AbstractC78487a a = m137199a(obj);
        List<C78595z> d = a != null ? a.mo122412d() : null;
        if (!(m137201c(obj) || ((obj instanceof VideoPublishEditModel) && C78588w.C78589a.m137198a((VideoPublishEditModel) obj))) || d == null || d.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C78595z zVar : d) {
            if (!C84902i.m145892a(zVar.f176632a)) {
                return null;
            }
            String str = zVar.f176632a;
            if (str != null && C72440e.m127817b(str)) {
                arrayList.add(Integer.valueOf((int) zVar.f176634c));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final AbstractC78487a m137199a(Object obj) {
        List list;
        List<String> auditFrames;
        List<FrameItem> allFrames;
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.canvasVideoData != null) {
                ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
                if (extractFramesModel == null || (allFrames = extractFramesModel.getAllFrames()) == null) {
                    list = new ArrayList();
                } else {
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) allFrames, 10));
                    Iterator<T> it = allFrames.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getPath());
                    }
                    list = C89070n.m154585g((Collection) arrayList);
                }
                CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
                if (!(canvasVideoData == null || (auditFrames = canvasVideoData.getAuditFrames()) == null)) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) auditFrames, 10));
                    Iterator<T> it2 = auditFrames.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next());
                    }
                    ArrayList arrayList3 = arrayList2;
                    if ((!arrayList3.isEmpty()) && arrayList3 != null) {
                        list.addAll(arrayList3);
                    }
                }
                return new C78560s(list);
            } else if (videoPublishEditModel.isMvThemeVideoType()) {
                f176626a = 1;
                return new C78560s(videoPublishEditModel.mvCreateVideoData.srcSelectMediaList);
            } else if (videoPublishEditModel.isCutSameVideoType()) {
                f176626a = 2;
                return new C78536f(videoPublishEditModel.cutSameEditData.f100713g);
            } else if ((C71817eu.m126799j(videoPublishEditModel) || videoPublishEditModel.editMusicSyncMode) && videoPublishEditModel.getPreviewInfo() != null && !C84904k.m145909a(videoPublishEditModel.getPreviewInfo().getVideoList())) {
                f176626a = 7;
                List a = C27404ap.m54811a(videoPublishEditModel.getPreviewInfo().getVideoList(), C78593c.f176630a);
                return new C78592b(a, a);
            } else if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || C71413b.m126126c(videoPublishEditModel)) {
                f176626a = 6;
                return new C78513ac(videoPublishEditModel.getPreviewInfo());
            } else if (videoPublishEditModel.containBackgroundVideo || m137202d(obj)) {
                f176626a = 10;
                return new C78526d(videoPublishEditModel);
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.x$b */
    public static final class C78592b extends C78556q {

        /* renamed from: f */
        final /* synthetic */ List f176629f;

        static {
            Covode.recordClassIndex(91726);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.extract.C78556q, com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l
        /* renamed from: e */
        public final String mo122447e() {
            return "extract_upload";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78592b(List list, List list2) {
            super(list2);
            this.f176629f = list;
        }
    }
}
