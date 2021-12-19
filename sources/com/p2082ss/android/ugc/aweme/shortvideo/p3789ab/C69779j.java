package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import com.p2082ss.android.ugc.aweme.canvas.PhotoCanvasTransformFilterParam;
import com.p2082ss.android.ugc.aweme.draft.C43207g;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45939c;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75926c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.j */
public final class C69779j {
    static {
        Covode.recordClassIndex(82185);
    }

    /* renamed from: b */
    public static final void m123306b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.containBackgroundVideo) {
            C89219l.m154721d(videoPublishEditModel, "");
            C80720e.m139921a(C70638dj.f158105h, C75926c.m133131a(videoPublishEditModel), true);
            C80720e.m139938e(C70638dj.f158105h);
        }
    }

    /* renamed from: a */
    public static final void m123305a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.hasInfoStickers()) {
            String str = videoPublishEditModel.infoStickerModel.infoStickerDraftDir;
            List<StickerItemModel> list = videoPublishEditModel.infoStickerModel.stickers;
            C89219l.m154716b(list, "");
            for (T t : list) {
                String str2 = str + File.separator + new File(t.path).getName();
                C89219l.m154716b(t, "");
                if (!C45939c.m88695a(t)) {
                    C80720e.m139932c(t.path, str2);
                } else if (!C80720e.m139927b(str2)) {
                    C80720e.m139926b(t.path, str2 + File.separator);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m123304a(C43223c cVar, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        String str3;
        String str4;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        CanvasVideoData canvasVideoData = cVar.f100900W.f100842bo;
        if (canvasVideoData != null) {
            PhotoCanvasBackground background = canvasVideoData.getBackground();
            List list = null;
            if (background != null) {
                str = background.getFilePath();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                String str5 = (C70638dj.f158103f + "canvas/" + cVar.mo73676f()) + '/' + new File(str).getName();
                if (!C84902i.m145892a(str5)) {
                    C43207g.m86164b(str, str5);
                }
                PhotoCanvasBackground background2 = canvasVideoData.getBackground();
                if (background2 == null) {
                    C89219l.m154715b();
                }
                PhotoCanvasBackground photoCanvasBackground = new PhotoCanvasBackground(background2.getType());
                photoCanvasBackground.setFilePath(background2.getFilePath());
                photoCanvasBackground.setStartColor(background2.getStartColor());
                photoCanvasBackground.setEndColor(background2.getEndColor());
                CanvasVideoData copy$default = CanvasVideoData.copy$default(canvasVideoData, null, null, photoCanvasBackground, null, 11, null);
                List<PhotoCanvasTransformFilterParam> transformInfo = canvasVideoData.getTransformInfo();
                if (transformInfo != null) {
                    Iterator<T> it = transformInfo.iterator();
                    while (it.hasNext()) {
                        copy$default.putTransform(it.next());
                    }
                }
                cVar.f100900W.f100842bo = copy$default;
            }
            List<String> sourceInfo = canvasVideoData.getSourceInfo();
            if (sourceInfo != null) {
                str2 = sourceInfo.get(0);
            } else {
                str2 = null;
            }
            List<String> auditFrames = canvasVideoData.getAuditFrames();
            if (auditFrames != null) {
                str3 = (String) C89070n.m154561b((List) auditFrames, 0);
            } else {
                str3 = null;
            }
            if (str2 != null && str2.length() > 0) {
                String str6 = C70638dj.f158103f + "canvas/" + cVar.mo73676f();
                String str7 = str6 + '/' + new File(str2).getName();
                if (str3 != null) {
                    str4 = str6 + '/' + new File(str3).getName();
                } else {
                    str4 = null;
                }
                if (!C84902i.m145892a(str7)) {
                    C43207g.m86164b(str2, str7);
                }
                if (str4 != null && !C84902i.m145892a(str4)) {
                    C43207g.m86164b(str3, str4);
                }
                List a = C89070n.m154516a(str7);
                if (str4 != null) {
                    list = C89070n.m154516a(str4);
                }
                CanvasVideoData copy$default2 = CanvasVideoData.copy$default(canvasVideoData, a, list, null, null, 12, null);
                List<PhotoCanvasTransformFilterParam> transformInfo2 = canvasVideoData.getTransformInfo();
                if (transformInfo2 != null) {
                    Iterator<T> it2 = transformInfo2.iterator();
                    while (it2.hasNext()) {
                        copy$default2.putTransform(it2.next());
                    }
                }
                cVar.f100900W.f100842bo = copy$default2;
            }
        }
    }
}
