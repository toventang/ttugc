package com.p2082ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.p2363ba.C34411c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.t */
public final class C83098t {
    static {
        Covode.recordClassIndex(96973);
    }

    /* renamed from: a */
    public static final boolean m143513a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isPhotoMvMode && !C80285bz.m139187a(videoPublishEditModel)) {
            return true;
        }
        if ((!videoPublishEditModel.mIsFromDraft && C71817eu.m126800k(videoPublishEditModel)) || (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.editMusicSyncMode)) {
            return true;
        }
        if ((videoPublishEditModel.recordMode != 1 || videoPublishEditModel.mIsFromDraft) && cVar != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m143514b(VideoPublishEditModel videoPublishEditModel) {
        List<String> list;
        List list2;
        C89219l.m154721d(videoPublishEditModel, "");
        String a = C34411c.m70401a(C70005cr.m123611a().f156482a);
        C89219l.m154716b(a, "");
        C61288d dVar = videoPublishEditModel.mvCreateVideoData;
        if (dVar != null) {
            list = dVar.musicIds;
        } else {
            list = null;
        }
        if (C84904k.m145909a(list)) {
            return false;
        }
        C61288d dVar2 = videoPublishEditModel.mvCreateVideoData;
        if (dVar2 == null || (list2 = dVar2.musicIds) == null) {
            list2 = C89086z.INSTANCE;
        }
        if (list2.contains(a)) {
            return true;
        }
        return false;
    }
}
