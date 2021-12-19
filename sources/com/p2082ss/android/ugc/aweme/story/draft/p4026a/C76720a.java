package com.p2082ss.android.ugc.aweme.story.draft.p4026a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import com.p2082ss.android.ugc.aweme.canvas.PhotoCanvasTransformFilterParam;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.model.C43222b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.draft.a.a */
public final class C76720a extends C76722b {

    /* renamed from: a */
    public static final C76721a f172221a = new C76721a((byte) 0);

    static {
        Covode.recordClassIndex(89716);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.a.a$a */
    public static final class C76721a {
        static {
            Covode.recordClassIndex(89717);
        }

        private C76721a() {
        }

        public /* synthetic */ C76721a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a, com.p2082ss.android.ugc.aweme.story.draft.p4026a.C76722b
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        PhotoCanvasBackground photoCanvasBackground;
        EditPreviewInfo h;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        DraftFileSaveException component1;
        DraftFileSaveResult a = super.mo110127a();
        if (!a.isSuc()) {
            return a;
        }
        C43223c cVar = this.f172225d;
        CanvasVideoData canvasVideoData = cVar.f100900W.f100842bo;
        if (canvasVideoData != null) {
            ArrayList arrayList = new ArrayList();
            List<String> sourceInfo = canvasVideoData.getSourceInfo();
            if (sourceInfo != null) {
                Iterator<T> it = sourceInfo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C89378p<DraftFileSaveException, String> b = m134295b(it.next());
                    component1 = b.component1();
                    String component2 = b.component2();
                    if (!component1.isSuc()) {
                        break;
                    }
                    arrayList.add(component2);
                }
                return new DraftFileSaveResult(0, component1, 1, null);
            }
            ArrayList arrayList2 = new ArrayList();
            List<String> auditFrames = canvasVideoData.getAuditFrames();
            if (auditFrames != null) {
                Iterator<T> it2 = auditFrames.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C89378p<DraftFileSaveException, String> b2 = m134295b(it2.next());
                    component1 = b2.component1();
                    String component22 = b2.component2();
                    if (!component1.isSuc()) {
                        break;
                    }
                    arrayList2.add(component22);
                }
            }
            PhotoCanvasBackground background = canvasVideoData.getBackground();
            if (background != null) {
                photoCanvasBackground = new PhotoCanvasBackground(background.getType());
                photoCanvasBackground.setFilePath(background.getFilePath());
                photoCanvasBackground.setStartColor(background.getStartColor());
                photoCanvasBackground.setEndColor(background.getEndColor());
                String filePath = background.getFilePath();
                if (filePath != null) {
                    C89378p<DraftFileSaveException, String> b3 = m134295b(filePath);
                    component1 = b3.component1();
                    String component23 = b3.component2();
                    if (component1.isSuc()) {
                        photoCanvasBackground.setFilePath(component23);
                    }
                    return new DraftFileSaveResult(0, component1, 1, null);
                }
            } else {
                photoCanvasBackground = null;
            }
            C43222b bVar = cVar.f100900W;
            CanvasVideoData canvasVideoData2 = new CanvasVideoData(m134294a(arrayList), m134294a(arrayList2), photoCanvasBackground, null, 8, null);
            List<PhotoCanvasTransformFilterParam> transformInfo = canvasVideoData.getTransformInfo();
            if (transformInfo != null) {
                Iterator<T> it3 = transformInfo.iterator();
                while (it3.hasNext()) {
                    canvasVideoData2.putTransform(it3.next());
                }
            }
            bVar.f100842bo = canvasVideoData2;
            String str = (String) C89070n.m154583g((List) arrayList);
            if (!(str == null || (h = C43225d.m86338h(cVar)) == null || (videoList = h.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) C89070n.m154583g((List) videoList)) == null)) {
                editVideoSegment.setVideoPath(str);
            }
        }
        component1 = mo120445b();
        return new DraftFileSaveResult(0, component1, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> List<T> m134294a(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    /* renamed from: b */
    private final C89378p<DraftFileSaveException, String> m134295b(String str) {
        if (str.length() == 0 || mo120444a(str)) {
            return C89387v.m154943a(mo120445b(), str);
        }
        String str2 = C43209h.m86171a(this.f172223b) + "canvas/" + new File(str).getName();
        DraftFileSaveException a = C43209h.m86170a(str, str2, true);
        C84911q.m145921a("CanvasDraftFileSaver:src copy,from " + str + " to " + str2);
        return C89387v.m154943a(a, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76720a(VideoPublishEditModel videoPublishEditModel, C43223c cVar) {
        super(videoPublishEditModel, cVar);
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(cVar, "");
    }
}
