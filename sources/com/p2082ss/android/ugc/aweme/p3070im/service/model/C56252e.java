package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.e */
public class C56252e implements Serializable {

    /* renamed from: a */
    private String f128294a;

    /* renamed from: b */
    private String f128295b;

    static {
        Covode.recordClassIndex(66065);
    }

    public String getCreativeId() {
        return this.f128295b;
    }

    public String getLogExtra() {
        return this.f128294a;
    }

    public void setCreativeId(String str) {
        this.f128295b = str;
    }

    public void setLogExtra(String str) {
        this.f128294a = str;
    }

    public C56252e(String str, String str2) {
        this.f128294a = str;
        this.f128295b = str2;
    }
}
