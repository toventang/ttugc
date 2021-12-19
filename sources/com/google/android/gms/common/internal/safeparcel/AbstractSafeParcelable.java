package com.google.android.gms.common.internal.safeparcel;

import com.bytedance.covode.number.Covode;

public abstract class AbstractSafeParcelable implements SafeParcelable {
    static {
        Covode.recordClassIndex(30970);
    }

    public final int describeContents() {
        return 0;
    }
}
