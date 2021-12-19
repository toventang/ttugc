package com.bytedance.android.livesdk.event;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.event.c */
public final class C8449c {

    /* renamed from: d */
    public static final C8450a f20890d = new C8450a((byte) 0);

    /* renamed from: a */
    public final int f20891a;

    /* renamed from: b */
    public final String f20892b;

    /* renamed from: c */
    public final JSONObject f20893c;

    static {
        Covode.recordClassIndex(9297);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8449c)) {
            return false;
        }
        C8449c cVar = (C8449c) obj;
        return this.f20891a == cVar.f20891a && C89219l.m154714a(this.f20892b, cVar.f20892b) && C89219l.m154714a(this.f20893c, cVar.f20893c);
    }

    public final int hashCode() {
        int i = this.f20891a * 31;
        String str = this.f20892b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f20893c;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BannerH5RoomStatusChangeEvent(position=" + this.f20891a + ", type=" + this.f20892b + ", data=" + this.f20893c + ")";
    }

    /* renamed from: com.bytedance.android.livesdk.event.c$a */
    public static final class C8450a {
        static {
            Covode.recordClassIndex(9298);
        }

        private C8450a() {
        }

        public /* synthetic */ C8450a(byte b) {
            this();
        }
    }
}
