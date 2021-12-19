package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.utils.UserVerify */
public final class UserVerify {
    private final UrlModel avatarThumb;
    private final String customVerify;
    private final String enterpriseVerifyReason;
    private final Integer verificationType;

    static {
        Covode.recordClassIndex(93442);
    }

    public UserVerify() {
        this(null, null, null, null, 15, null);
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Integer getVerificationType() {
        return this.verificationType;
    }

    public UserVerify(UrlModel urlModel, String str, String str2, Integer num) {
        this.avatarThumb = urlModel;
        this.customVerify = str;
        this.enterpriseVerifyReason = str2;
        this.verificationType = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserVerify(UrlModel urlModel, String str, String str2, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? -1 : num);
    }
}
