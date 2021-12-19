package com.bytedance.bdlocation.p850e.p851a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;

/* renamed from: com.bytedance.bdlocation.e.a.h */
public class C13176h {
    @AbstractC27891c(mo46611a = "Continent")

    /* renamed from: a */
    public C13178j f32142a;
    @AbstractC27891c(mo46611a = "Country")

    /* renamed from: b */
    public C13178j f32143b;
    @AbstractC27891c(mo46611a = "Subdivisions")

    /* renamed from: c */
    public C13178j[] f32144c;
    @AbstractC27891c(mo46611a = "City")

    /* renamed from: d */
    public C13178j f32145d;
    @AbstractC27891c(mo46611a = "District")

    /* renamed from: e */
    public C13178j f32146e;
    @AbstractC27891c(mo46611a = "Place")

    /* renamed from: f */
    public C13177i f32147f;
    @AbstractC27891c(mo46611a = "GPS")

    /* renamed from: g */
    public C13173e f32148g;
    @AbstractC27891c(mo46611a = "ISP")

    /* renamed from: h */
    public String f32149h;
    @AbstractC27891c(mo46611a = "LocateMethod")

    /* renamed from: i */
    public String f32150i;
    @AbstractC27891c(mo46611a = "Timestamp")

    /* renamed from: j */
    public String f32151j;
    @AbstractC27891c(mo46611a = "Town")

    /* renamed from: k */
    public C13179k f32152k;
    @AbstractC27891c(mo46611a = "Village")

    /* renamed from: l */
    public C13179k f32153l;
    @AbstractC27891c(mo46611a = "IsDisputed")

    /* renamed from: m */
    public boolean f32154m;

    static {
        Covode.recordClassIndex(15123);
    }

    public String toString() {
        return "LocationResult{continent=" + this.f32142a + ", country=" + this.f32143b + ", subdivisions=" + Arrays.toString(this.f32144c) + ", city=" + this.f32145d + ", district=" + this.f32146e + ", place=" + this.f32147f + ", gps=" + this.f32148g + ", isp='" + this.f32149h + '\'' + ", locateMethod='" + this.f32150i + '\'' + ", isDisputed='" + this.f32154m + '\'' + ", timestamp='" + this.f32151j + '\'' + '}';
    }
}
