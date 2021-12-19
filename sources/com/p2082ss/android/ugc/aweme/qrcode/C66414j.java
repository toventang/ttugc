package com.p2082ss.android.ugc.aweme.qrcode;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.j */
public class C66414j implements Serializable {
    public String describe;
    public String enterFrom;
    public String hashTagName;
    public boolean isEnterpriseUser;
    public boolean isHashTag;
    public String objectId;
    public String title;
    public int type;
    public String webDes;
    public String webImage;
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.j$a */
    public static class C66415a {

        /* renamed from: a */
        public C66414j f149318a = new C66414j((byte) 0);

        static {
            Covode.recordClassIndex(77947);
        }
    }

    static {
        Covode.recordClassIndex(77946);
    }

    private C66414j() {
    }

    public String getWebDes() {
        return this.webDes;
    }

    public String getWebImage() {
        return this.webImage;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setWebDes(String str) {
        this.webDes = str;
    }

    public void setWebImage(String str) {
        this.webImage = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    /* synthetic */ C66414j(byte b) {
        this();
    }

    public C66414j(int i, String str, String str2) {
        this.type = i;
        this.objectId = str;
        this.hashTagName = "";
        this.enterFrom = str2;
    }

    public C66414j(int i, String str, boolean z, String str2, String str3) {
        this.type = i;
        this.objectId = str;
        this.isHashTag = z;
        this.hashTagName = str2;
        this.enterFrom = str3;
    }
}
