package com.p2082ss.android.ugc.aweme.utils;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.utils.ap */
public final class C80222ap {

    /* renamed from: a */
    public Bundle f179700a = new Bundle();

    static {
        Covode.recordClassIndex(93490);
    }

    /* renamed from: a */
    public final C80222ap mo123646a(String str, int i) {
        this.f179700a.putInt(str, i);
        return this;
    }

    /* renamed from: a */
    public final C80222ap mo123647a(String str, Parcelable parcelable) {
        this.f179700a.putParcelable(str, parcelable);
        return this;
    }

    /* renamed from: a */
    public final C80222ap mo123648a(String str, Serializable serializable) {
        this.f179700a.putSerializable(str, serializable);
        return this;
    }

    /* renamed from: a */
    public final C80222ap mo123649a(String str, String str2) {
        this.f179700a.putString(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C80222ap mo123650a(String str, boolean z) {
        this.f179700a.putBoolean(str, z);
        return this;
    }

    /* renamed from: a */
    public final C80222ap mo123651a(String str, String[] strArr) {
        this.f179700a.putStringArray(str, strArr);
        return this;
    }
}
