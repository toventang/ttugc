package com.p2082ss.android.ugc.aweme.publish.p3624h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65511b;
import com.p2082ss.android.ugc.aweme.publish.p3610a.p3611a.C65507b;
import com.p2082ss.android.ugc.aweme.publish.p3619f.AbstractC65609a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65610b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.h.a */
final class C65632a implements AbstractC65511b {
    static {
        Covode.recordClassIndex(77123);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65511b
    /* renamed from: a */
    public final void mo104627a(VideoPublishEditModel videoPublishEditModel, int i) {
        C89219l.m154721d(videoPublishEditModel, "");
        videoPublishEditModel.setSaveModel(C65507b.m117235a(videoPublishEditModel.getSaveModel(), i, false, C65610b.f147850a));
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65511b
    /* renamed from: a */
    public final AVUploadSaveModel mo104626a(VideoPublishEditModel videoPublishEditModel, int i, boolean z, AbstractC65609a aVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        return C65507b.m117235a(videoPublishEditModel.getSaveModel(), i, z, aVar);
    }
}
