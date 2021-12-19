package com.p2082ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.c */
public final class C38232c implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    private String f90335a;
    @AbstractC27891c(mo46611a = "dislike_url")

    /* renamed from: b */
    private String f90336b;
    @AbstractC27891c(mo46611a = "label_clickable")

    /* renamed from: c */
    private boolean f90337c;

    static {
        Covode.recordClassIndex(45716);
    }

    public final String getAdxUrl() {
        return this.f90336b;
    }

    public final boolean getLabelClickable() {
        return this.f90337c;
    }

    public final String getName() {
        return this.f90335a;
    }

    public final void setAdxUrl(String str) {
        this.f90336b = str;
    }

    public final void setLabelClickable(boolean z) {
        this.f90337c = z;
    }

    public final void setName(String str) {
        this.f90335a = str;
    }

    public final String getDislikeUrl(int i) {
        if (!TextUtils.isEmpty(this.f90336b)) {
            return this.f90336b + "&is_long_press=" + i;
        }
        return null;
    }
}
