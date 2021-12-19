package com.p2082ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UrlModelWrap */
public class UrlModelWrap implements Serializable {
    private int position;
    private UrlModel urlModel;

    static {
        Covode.recordClassIndex(75218);
    }

    public int getPosition() {
        return this.position;
    }

    public UrlModel getUrlModel() {
        return this.urlModel;
    }

    public String toJsonString() {
        return new C27910f().mo46674b(this);
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setUrlModel(UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    public static UrlModelWrap fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (UrlModelWrap) new C27910f().mo46670a(str, UrlModelWrap.class);
    }

    public UrlModelWrap(int i, UrlModel urlModel2) {
        this.position = i;
        this.urlModel = urlModel2;
    }
}
