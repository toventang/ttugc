package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.r */
public final class C73789r {
    static {
        Covode.recordClassIndex(86528);
    }

    /* renamed from: a */
    public static final void m129848a(VideoPublishEditModel videoPublishEditModel) {
        C43223c queryDraft;
        LighteningExtraInfo lighteningExtraInfo;
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mIsFromDraft && C82306a.m142361c() && (queryDraft = C78397c.m136927a().queryDraft(videoPublishEditModel.getDraftPrimaryKey())) != null && queryDraft.mo73734t() && (lighteningExtraInfo = queryDraft.f100900W.f100843bp) != null) {
            String scheduleId = lighteningExtraInfo.getScheduleId();
            if (!TextUtils.isEmpty(scheduleId)) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getStoryService().mo93866a(scheduleId);
            }
        }
    }
}
