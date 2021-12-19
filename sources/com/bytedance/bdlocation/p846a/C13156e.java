package com.bytedance.bdlocation.p846a;

import android.text.TextUtils;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p854g.C13185a;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bdlocation.a.e */
public class C13156e {

    /* renamed from: a */
    public String f32079a = "";

    /* renamed from: b */
    public long f32080b;

    /* renamed from: c */
    public long f32081c;

    /* renamed from: d */
    public long f32082d;

    /* renamed from: e */
    public C13185a f32083e;

    /* renamed from: f */
    public int f32084f = 1;

    /* renamed from: g */
    public String f32085g;

    /* renamed from: h */
    public C13149a.AbstractC13151a f32086h;

    /* renamed from: i */
    public C13156e f32087i;

    /* renamed from: j */
    public int f32088j = 2;

    /* renamed from: k */
    public AbstractC13343d f32089k;

    static {
        Covode.recordClassIndex(15103);
    }

    public int hashCode() {
        int i;
        long j = this.f32080b;
        long j2 = this.f32081c;
        long j3 = this.f32082d;
        int i2 = ((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f32088j) * 31) + this.f32084f) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.f32079a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public String toString() {
        return "LocationOption{, locationTimeOutMs=" + this.f32080b + ", interval=" + this.f32081c + ", mode=" + this.f32088j + ", maxCacheTime=" + this.f32082d + ", mTrace=" + this.f32083e + ", geocodeMode=" + this.f32084f + ", timeStamp='" + this.f32085g + '\'' + ", mCallback=" + this.f32086h + ", mFallbackOption=" + this.f32087i + '}';
    }

    public C13156e(String str) {
        this.f32079a = str;
        this.f32083e = new C13185a(str);
    }

    public C13156e(C13156e eVar) {
        this.f32080b = eVar.f32080b;
        this.f32088j = eVar.f32088j;
        this.f32081c = eVar.f32081c;
        this.f32082d = eVar.f32082d;
        this.f32083e = eVar.f32083e;
        this.f32084f = eVar.f32084f;
        this.f32085g = eVar.f32085g;
        this.f32086h = eVar.f32086h;
        this.f32087i = eVar.f32087i;
        this.f32079a = eVar.f32079a;
        this.f32089k = eVar.f32089k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13156e)) {
            return false;
        }
        C13156e eVar = (C13156e) obj;
        if (this.f32080b == eVar.f32080b && this.f32081c == eVar.f32081c && this.f32084f == eVar.f32084f && TextUtils.equals(this.f32079a, eVar.f32079a) && this.f32088j == eVar.f32088j) {
            return true;
        }
        return false;
    }
}
