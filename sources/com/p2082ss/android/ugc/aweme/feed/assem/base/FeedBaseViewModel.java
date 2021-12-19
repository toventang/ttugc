package com.p2082ss.android.ugc.aweme.feed.assem.base;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14529j;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel */
public abstract class FeedBaseViewModel<S extends AbstractC12853j> extends AssemViewModelWithItem<S, VideoItemParams> implements AbstractC14529j<S, VideoItemParams> {

    /* renamed from: k */
    private final boolean f112229k = true;

    /* renamed from: o */
    public int f112230o;

    /* renamed from: p */
    public String f112231p;

    /* renamed from: q */
    public JSONObject f112232q;

    /* renamed from: r */
    public boolean f112233r;

    /* renamed from: s */
    public String f112234s;

    /* renamed from: t */
    public Fragment f112235t;

    /* renamed from: u */
    public int f112236u;

    static {
        Covode.recordClassIndex(57265);
    }

    /* renamed from: a */
    public S mo80488a(S s, VideoItemParams videoItemParams) {
        C89219l.m154721d(s, "");
        C89219l.m154721d(videoItemParams, "");
        return s;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bR_() {
        return this.f112229k;
    }

    /* renamed from: b */
    public final S mo23372a(S s, VideoItemParams videoItemParams) {
        C89219l.m154721d(s, "");
        C89219l.m154721d(videoItemParams, "");
        if (videoItemParams != null) {
            this.f112230o = videoItemParams.mPageType;
            this.f112231p = videoItemParams.mEventType;
            this.f112232q = videoItemParams.mRequestId;
            this.f112233r = videoItemParams.isMyProfile;
            this.f112234s = videoItemParams.mEnterMethodValue;
            this.f112235t = videoItemParams.fragment;
            this.f112236u = videoItemParams.mAwemeFromPage;
        }
        return mo80488a((AbstractC12853j) s, videoItemParams);
    }
}
