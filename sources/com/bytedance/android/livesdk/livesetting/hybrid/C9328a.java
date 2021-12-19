package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.livesetting.hybrid.a */
public final class C9328a {
    @AbstractC27891c(mo46611a = "widget_width")

    /* renamed from: a */
    public final int f22771a = 150;
    @AbstractC27891c(mo46611a = "widget_height")

    /* renamed from: b */
    public final int f22772b = 40;
    @AbstractC27891c(mo46611a = "widget_top_margin")

    /* renamed from: c */
    public final int f22773c = 8;
    @AbstractC27891c(mo46611a = "widget_start_margin")

    /* renamed from: d */
    public final int f22774d = 12;
    @AbstractC27891c(mo46611a = "widget_end_margin")

    /* renamed from: e */
    public final int f22775e = 12;
    @AbstractC27891c(mo46611a = "item_width")

    /* renamed from: f */
    public final int f22776f = 40;
    @AbstractC27891c(mo46611a = "item_height")

    /* renamed from: g */
    public final int f22777g = 40;
    @AbstractC27891c(mo46611a = "item_spacing")

    /* renamed from: h */
    public final int f22778h = 4;
    @AbstractC27891c(mo46611a = "preview_width")

    /* renamed from: i */
    public final int f22779i = 70;
    @AbstractC27891c(mo46611a = "preview_height")

    /* renamed from: j */
    public final int f22780j = 70;
    @AbstractC27891c(mo46611a = "preview_top_margin")

    /* renamed from: k */
    public final int f22781k = 15;
    @AbstractC27891c(mo46611a = "preview_start_margin")

    /* renamed from: l */
    public final int f22782l = 15;

    static {
        Covode.recordClassIndex(10473);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9328a)) {
            return false;
        }
        C9328a aVar = (C9328a) obj;
        return this.f22771a == aVar.f22771a && this.f22772b == aVar.f22772b && this.f22773c == aVar.f22773c && this.f22774d == aVar.f22774d && this.f22775e == aVar.f22775e && this.f22776f == aVar.f22776f && this.f22777g == aVar.f22777g && this.f22778h == aVar.f22778h && this.f22779i == aVar.f22779i && this.f22780j == aVar.f22780j && this.f22781k == aVar.f22781k && this.f22782l == aVar.f22782l;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.f22771a * 31) + this.f22772b) * 31) + this.f22773c) * 31) + this.f22774d) * 31) + this.f22775e) * 31) + this.f22776f) * 31) + this.f22777g) * 31) + this.f22778h) * 31) + this.f22779i) * 31) + this.f22780j) * 31) + this.f22781k) * 31) + this.f22782l;
    }

    public final String toString() {
        return "LynxCardWidget(widgetWidth=" + this.f22771a + ", widgetHeight=" + this.f22772b + ", widgetTopMargin=" + this.f22773c + ", widgetStartMargin=" + this.f22774d + ", widgetEndMargin=" + this.f22775e + ", itemWidth=" + this.f22776f + ", itemHeight=" + this.f22777g + ", itemSpacing=" + this.f22778h + ", previewWidth=" + this.f22779i + ", previewHeight=" + this.f22780j + ", previewTopMargin=" + this.f22781k + ", previewStartMargin=" + this.f22782l + ")";
    }
}
