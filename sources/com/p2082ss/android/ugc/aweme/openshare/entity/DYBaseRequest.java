package com.p2082ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a;

/* renamed from: com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest */
public abstract class DYBaseRequest extends AbstractC22347a {
    public Bundle extras;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mClientKey;
    public String mState;

    static {
        Covode.recordClassIndex(73540);
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
    public abstract int getType();

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
    public String getCallerPackage() {
        return this.mCallerPackage;
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
    public String getCallerVersion() {
        return this.mCallerSDKVersion;
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
    public void fromBundle(Bundle bundle) {
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
    }

    @Override // com.bytedance.sdk.p1625a.p1638c.p1639a.AbstractC22347a
    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
    }
}
