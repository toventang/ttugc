package com.p2082ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.mix.model.d */
public class C59867d implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    private String f136366a;
    @AbstractC27891c(mo46611a = "mix_name")

    /* renamed from: b */
    private String f136367b;
    @AbstractC27891c(mo46611a = "extra")
    public String extra;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "mix_id")
    public String mixId;
    @AbstractC27891c(mo46611a = "mix_type")
    public int mixType;
    @AbstractC27891c(mo46611a = "moderated_rename_timestamp")
    public long moderatedRenameTimestamp;
    @AbstractC27891c(mo46611a = "statistic")
    public C59865b statis;
    @AbstractC27891c(mo46611a = "status")
    public C59866c status;

    static {
        Covode.recordClassIndex(70274);
    }

    public String getMixName() {
        String str = this.f136366a;
        if (str == null || str.equals("")) {
            return this.f136367b;
        }
        return this.f136366a;
    }

    public String getName() {
        String str = this.f136367b;
        if (str == null || str.equals("")) {
            return this.f136366a;
        }
        return this.f136367b;
    }

    public void setMixName(String str) {
        this.f136366a = str;
    }

    public void setName(String str) {
        this.f136367b = str;
    }
}
