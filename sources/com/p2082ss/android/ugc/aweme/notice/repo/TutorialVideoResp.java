package com.p2082ss.android.ugc.aweme.notice.repo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp */
public final class TutorialVideoResp extends BaseResponse {
    @AbstractC27891c(mo46611a = "msg_info")
    private final TutorialVideoInfo info;

    static {
        Covode.recordClassIndex(72308);
    }

    public TutorialVideoResp() {
        this(null, 1, null);
    }

    public static /* synthetic */ TutorialVideoResp copy$default(TutorialVideoResp tutorialVideoResp, TutorialVideoInfo tutorialVideoInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            tutorialVideoInfo = tutorialVideoResp.info;
        }
        return tutorialVideoResp.copy(tutorialVideoInfo);
    }

    public final TutorialVideoInfo component1() {
        return this.info;
    }

    public final TutorialVideoResp copy(TutorialVideoInfo tutorialVideoInfo) {
        return new TutorialVideoResp(tutorialVideoInfo);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TutorialVideoResp) && C89219l.m154714a(this.info, ((TutorialVideoResp) obj).info);
        }
        return true;
    }

    public final int hashCode() {
        TutorialVideoInfo tutorialVideoInfo = this.info;
        if (tutorialVideoInfo != null) {
            return tutorialVideoInfo.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "TutorialVideoResp(info=" + this.info + ")";
    }

    public final TutorialVideoInfo getInfo() {
        return this.info;
    }

    public TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo) {
        this.info = tutorialVideoInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : tutorialVideoInfo);
    }
}
