package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.FeaturePhoneTypeConfig */
public final class FeaturePhoneTypeConfig extends FeatureTypeConfig {
    @AbstractC27891c(mo46611a = "need_phone_features")
    private String needPhoneFeatures = "all";
    private List<String> phoneFeatureList;

    static {
        Covode.recordClassIndex(70538);
    }

    public final String getNeedPhoneFeatures() {
        return this.needPhoneFeatures;
    }

    public final boolean isNeedAllPhoneFeatures() {
        return TextUtils.equals(this.needPhoneFeatures, "all");
    }

    public final List<String> getPhoneFeatureList() {
        if (TextUtils.isEmpty(this.needPhoneFeatures)) {
            return null;
        }
        if (this.phoneFeatureList == null) {
            this.phoneFeatureList = C89361p.m154915b(this.needPhoneFeatures, new String[]{"|"});
        }
        return this.phoneFeatureList;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureTypeConfig
    public final String toString() {
        return "PhoneType{super=" + super.toString() + ", needPhoneFeatures=" + this.needPhoneFeatures + '}';
    }

    public final void setNeedPhoneFeatures(String str) {
        C89219l.m154721d(str, "");
        this.needPhoneFeatures = str;
    }
}
