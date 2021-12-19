package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.h */
public final /* synthetic */ class C40024h implements AbstractC88433f {

    /* renamed from: a */
    private final C39986a f94047a;

    /* renamed from: b */
    private final boolean f94048b;

    static {
        Covode.recordClassIndex(47790);
    }

    C40024h(C39986a aVar, boolean z) {
        this.f94047a = aVar;
        this.f94048b = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C39986a aVar = this.f94047a;
        boolean z = this.f94048b;
        BaseResponse baseResponse = (BaseResponse) obj;
        int i = 1;
        if (baseResponse == null || baseResponse.status_code != 0) {
            new C23144b(aVar.getParentFragment() instanceof C23226a ? aVar.getParentFragment() : aVar).mo37640e(R.string.bof).mo37637b();
            aVar.f93989h = !z;
            aVar.f93993l.mo70126a(new C40012ax(aVar));
        } else if (aVar.f93984c != null && aVar.f93984c.getVideo() != null && aVar.f93984c.getVideo().getCaptionModel() != null) {
            CaptionModel captionModel = aVar.f93984c.getVideo().getCaptionModel();
            int hasOriginalAudio = captionModel.getHasOriginalAudio();
            if (!aVar.f93989h) {
                i = -1;
            }
            aVar.f93984c.getVideo().setCaptionModel(new CaptionModel(hasOriginalAudio, i, captionModel.getOriginalCaptionLanguage(), captionModel.getCaptionList()));
        }
    }
}
