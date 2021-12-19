package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.bytedance.android.livesdk.gift.model.d */
public final class C8839d {

    /* renamed from: a */
    public static final Integer f21702a = 0;

    /* renamed from: b */
    public static final Integer f21703b = 0;

    /* renamed from: c */
    public static final Long f21704c = 0L;
    @AbstractC27891c(mo46611a = "level")

    /* renamed from: d */
    public Integer f21705d;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: e */
    public Integer f21706e;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: f */
    public Long f21707f;

    static {
        Covode.recordClassIndex(9720);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f21705d != null) {
            sb.append(", level=").append(this.f21705d);
        }
        if (this.f21706e != null) {
            sb.append(", type=").append(this.f21706e);
        }
        if (this.f21707f != null) {
            sb.append(", count=").append(this.f21707f);
        }
        return sb.replace(0, 2, "DriveItem{").append('}').toString();
    }
}
