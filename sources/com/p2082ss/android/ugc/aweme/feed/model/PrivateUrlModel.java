package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.PrivateUrlModel */
public class PrivateUrlModel extends BaseResponse {
    @AbstractC27891c(mo46611a = "hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;
    @AbstractC27891c(mo46611a = "label_private")
    public UrlModel labelPrivate;
    @AbstractC27891c(mo46611a = "video_text")
    public List<AwemeTextLabelModel> textVideoLabels;

    static {
        Covode.recordClassIndex(58747);
    }
}
