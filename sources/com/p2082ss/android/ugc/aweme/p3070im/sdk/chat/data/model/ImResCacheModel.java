package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.upload.EncryptUrlModel;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImResCacheModel */
public final class ImResCacheModel {
    private EncryptUrlModel encryptUrlModel;
    private EncryptedVideoContent encryptedVideoContent;
    private String md5;
    private Integer type;
    private UrlModel urlModel;

    static {
        Covode.recordClassIndex(63446);
    }

    public final EncryptUrlModel getEncryptUrlModel() {
        return this.encryptUrlModel;
    }

    public final EncryptedVideoContent getEncryptedVideoContent() {
        return this.encryptedVideoContent;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final Integer getType() {
        return this.type;
    }

    public final UrlModel getUrlModel() {
        return this.urlModel;
    }

    public final String getVideoJson() {
        EncryptedVideoContent encryptedVideoContent2;
        Integer num = this.type;
        if (num == null || num.intValue() != 2 || (encryptedVideoContent2 = this.encryptedVideoContent) == null) {
            return null;
        }
        return C80342dg.m139300a().mo46674b(encryptedVideoContent2);
    }

    public final UrlModel getImageContent() {
        Integer num = this.type;
        if (num != null && num.intValue() == 0) {
            return this.encryptUrlModel;
        }
        Integer num2 = this.type;
        if (num2 != null && num2.intValue() == 1) {
            return this.urlModel;
        }
        Integer num3 = this.type;
        if (num3 != null && num3.intValue() == 2) {
            return this.encryptUrlModel;
        }
        return null;
    }

    public final String getContentJson() {
        EncryptUrlModel encryptUrlModel2;
        Integer num = this.type;
        if (num != null && num.intValue() == 0) {
            EncryptUrlModel encryptUrlModel3 = this.encryptUrlModel;
            if (encryptUrlModel3 != null) {
                return C80342dg.m139300a().mo46674b(encryptUrlModel3);
            }
            return null;
        }
        Integer num2 = this.type;
        if (num2 != null && num2.intValue() == 1) {
            UrlModel urlModel2 = this.urlModel;
            if (urlModel2 != null) {
                return C80342dg.m139300a().mo46674b(urlModel2);
            }
            return null;
        }
        Integer num3 = this.type;
        if (num3 == null || num3.intValue() != 2 || (encryptUrlModel2 = this.encryptUrlModel) == null) {
            return null;
        }
        return C80342dg.m139300a().mo46674b(encryptUrlModel2);
    }

    public final String toString() {
        return "ImResCacheModel(md5=" + this.md5 + ", type=" + this.type + ", urlModel=" + this.urlModel + ", encryptUrlModel=" + this.encryptUrlModel + ", encryptedVideoContent=" + this.encryptedVideoContent + ')';
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isValid() {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ImResCacheModel.isValid():boolean");
    }

    public final void setEncryptUrlModel(EncryptUrlModel encryptUrlModel2) {
        this.encryptUrlModel = encryptUrlModel2;
    }

    public final void setEncryptedVideoContent(EncryptedVideoContent encryptedVideoContent2) {
        this.encryptedVideoContent = encryptedVideoContent2;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUrlModel(UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    public final void setContentJson(String str, String str2) {
        Integer num = this.type;
        if (num != null && num.intValue() == 1) {
            this.urlModel = (UrlModel) C80342dg.m139301a(str, UrlModel.class);
            return;
        }
        Integer num2 = this.type;
        if (num2 != null && num2.intValue() == 0) {
            this.encryptUrlModel = (EncryptUrlModel) C80342dg.m139301a(str, EncryptUrlModel.class);
            return;
        }
        Integer num3 = this.type;
        if (num3 != null && num3.intValue() == 2) {
            this.encryptUrlModel = (EncryptUrlModel) C80342dg.m139301a(str, EncryptUrlModel.class);
            this.encryptedVideoContent = (EncryptedVideoContent) C80342dg.m139301a(str2, EncryptedVideoContent.class);
        }
    }
}
