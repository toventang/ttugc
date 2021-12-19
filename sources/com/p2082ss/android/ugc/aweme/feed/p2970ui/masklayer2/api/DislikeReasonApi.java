package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.api.DislikeReasonApi */
public final class DislikeReasonApi {

    /* renamed from: a */
    public static final RealApi f116317a = ((RealApi) C18097a.m33698a(C29736b.f70924e, RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.api.DislikeReasonApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(59506);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/commit/dislike/item/")
        @AbstractC89721e
        AbstractC21983b<BaseResponse> disLikeReason(@AbstractC89720d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(59505);
    }
}
