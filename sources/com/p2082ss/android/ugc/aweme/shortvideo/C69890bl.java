package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bl */
public final class C69890bl {
    static {
        Covode.recordClassIndex(82299);
    }

    /* renamed from: a */
    public static final C84425b m123458a(Object obj) {
        C84425b bVar = new C84425b();
        C89219l.m154716b(bVar, "");
        return m123457a(bVar, obj);
    }

    /* renamed from: b */
    public static final C69840ar m123459b(Object obj) {
        C69840ar arVar = new C69840ar();
        C89219l.m154716b(arVar, "");
        return m123456a(arVar, obj);
    }

    /* renamed from: a */
    public static final C84425b m123457a(C84425b bVar, Object obj) {
        String str;
        int i;
        C89219l.m154721d(bVar, "");
        if (!(obj instanceof VideoPublishEditModel)) {
            obj = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.isStoryEditMode) {
                str = "story_shoot_page";
            } else {
                str = "video_shoot_page";
            }
            bVar.mo129406a("shoot_page", str);
            if (videoPublishEditModel.ttStoryUploadModel != null) {
                i = 1;
            } else {
                i = 0;
            }
            bVar.mo129403a("is_story", i);
            TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
            if (tTStoryUploadModel != null) {
                bVar.mo129403a("clip_index", tTStoryUploadModel.getIndex());
                bVar.mo129403a("clips_cnt", tTStoryUploadModel.getTotalCount());
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private static C69840ar m123456a(C69840ar arVar, Object obj) {
        String str;
        int i;
        C89219l.m154721d(arVar, "");
        if (!(obj instanceof VideoPublishEditModel)) {
            obj = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.isStoryEditMode) {
                str = "story_shoot_page";
            } else {
                str = "video_shoot_page";
            }
            arVar.mo110189a("shoot_page", str);
            if (videoPublishEditModel.ttStoryUploadModel != null) {
                i = 1;
            } else {
                i = 0;
            }
            arVar.mo110187a("is_story", Integer.valueOf(i));
            TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.ttStoryUploadModel;
            if (tTStoryUploadModel != null) {
                arVar.mo110187a("clip_index", Integer.valueOf(tTStoryUploadModel.getIndex()));
                arVar.mo110187a("clips_cnt", Integer.valueOf(tTStoryUploadModel.getTotalCount()));
            }
        }
        return arVar;
    }
}
