package com.bytedance.creativex.recorder.p940b.p941a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.b.a.e */
public final class C14178e {

    /* renamed from: a */
    public final long f34450a;

    /* renamed from: b */
    public final String f34451b;

    /* renamed from: c */
    public final String f34452c;

    /* renamed from: d */
    public final String f34453d;

    static {
        Covode.recordClassIndex(16247);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14178e)) {
            return false;
        }
        C14178e eVar = (C14178e) obj;
        return this.f34450a == eVar.f34450a && C89219l.m154714a(this.f34451b, eVar.f34451b) && C89219l.m154714a(this.f34452c, eVar.f34452c) && C89219l.m154714a(this.f34453d, eVar.f34453d);
    }

    public final int hashCode() {
        long j = this.f34450a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f34451b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34452c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f34453d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CameraChangedLogEvent(duration=" + this.f34450a + ", cameraType=" + this.f34451b + ", toStatus=" + this.f34452c + ", enterMethod=" + this.f34453d + ")";
    }

    public C14178e(long j, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f34450a = j;
        this.f34451b = str;
        this.f34452c = str2;
        this.f34453d = str3;
    }
}
