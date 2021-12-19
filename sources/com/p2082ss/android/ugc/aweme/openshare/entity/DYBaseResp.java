package com.p2082ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b;

/* renamed from: com.ss.android.ugc.aweme.openshare.entity.DYBaseResp */
public abstract class DYBaseResp extends AbstractC22348b {
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    static {
        Covode.recordClassIndex(73541);
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
    public boolean checkArgs() {
        return true;
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
    public abstract int getType();

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
    public boolean isSuccess() {
        if (this.errorCode == 20000) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_aweme_open_sdk_params_error_code");
        this.errorMsg = bundle.getString("_aweme_open_sdk_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22348b
    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_open_sdk_params_error_code", this.errorCode);
        bundle.putString("_aweme_open_sdk_params_error_msg", this.errorMsg);
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
    }
}
