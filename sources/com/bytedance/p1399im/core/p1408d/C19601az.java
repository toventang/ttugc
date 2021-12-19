package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.d.az */
public class C19601az implements Serializable {
    private String basicExtInfo;
    private String senderNickName;
    private String senderPortrait;

    static {
        Covode.recordClassIndex(22445);
    }

    public String getBasicExtInfo() {
        return this.basicExtInfo;
    }

    public String getSenderNickName() {
        return this.senderNickName;
    }

    public String getSenderPortrait() {
        return this.senderPortrait;
    }

    public C19601az(String str, String str2, String str3) {
        this.senderPortrait = str;
        this.senderNickName = str2;
        this.basicExtInfo = str3;
    }
}
