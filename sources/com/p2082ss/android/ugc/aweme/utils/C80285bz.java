package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.bz */
public final class C80285bz {
    static {
        Covode.recordClassIndex(93553);
    }

    /* renamed from: a */
    public static final void m139184a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C80288ca.m139198b(cVar.mo73676f(), false);
    }

    /* renamed from: b */
    public static final void m139188b(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C80288ca.m139197b(cVar.mo73676f());
    }

    /* renamed from: c */
    public static final void m139190c(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C80288ca.m139198b(videoPublishEditModel.creationId, true);
    }

    /* renamed from: b */
    public static final boolean m139189b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        return C80288ca.m139195a(videoPublishEditModel.creationId);
    }

    /* renamed from: a */
    public static final boolean m139186a(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        if (!shortVideoContext.f155752M || !shortVideoContext.f155755P) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m139187a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!TextUtils.isEmpty(videoPublishEditModel.mMusicPath) || !videoPublishEditModel.mIsFromDraft || !videoPublishEditModel.isDraftMusicIllegal) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m139185a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C89219l.m154721d(videoPublishEditModel, "");
        C80288ca.m139194a(videoPublishEditModel.creationId, z);
    }
}
