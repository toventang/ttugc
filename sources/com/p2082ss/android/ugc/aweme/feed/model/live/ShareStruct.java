package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.ShareStruct */
public class ShareStruct extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "bool_persist")
    public int boolPersist;
    @AbstractC27891c(mo46611a = "share_desc")
    public String shareDesc;
    @AbstractC27891c(mo46611a = "share_link_desc")
    public String shareLinkDesc;
    @AbstractC27891c(mo46611a = "share_qrcode_url")
    public UrlModel shareQrcodeUrl;
    @AbstractC27891c(mo46611a = "share_title")
    public String shareTitle;
    @AbstractC27891c(mo46611a = "share_url")
    public String shareUrl;
    @AbstractC27891c(mo46611a = "share_weibo_desc")
    public String shareWeiboDesc;

    static {
        Covode.recordClassIndex(58816);
    }
}
