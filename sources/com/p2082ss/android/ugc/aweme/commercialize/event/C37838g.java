package com.p2082ss.android.ugc.aweme.commercialize.event;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.event.g */
public final class C37838g implements AbstractC81914b {

    /* renamed from: e */
    public static final C37839a f89333e = new C37839a((byte) 0);

    /* renamed from: a */
    public final String f89334a;

    /* renamed from: b */
    public final JSONObject f89335b;

    /* renamed from: c */
    public final String f89336c;

    /* renamed from: d */
    public final Object f89337d;

    static {
        Covode.recordClassIndex(45290);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37838g)) {
            return false;
        }
        C37838g gVar = (C37838g) obj;
        return C89219l.m154714a(this.f89334a, gVar.f89334a) && C89219l.m154714a(this.f89335b, gVar.f89335b) && C89219l.m154714a(this.f89336c, gVar.f89336c) && C89219l.m154714a(this.f89337d, gVar.f89337d);
    }

    public final int hashCode() {
        String str = this.f89334a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f89335b;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        String str2 = this.f89336c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Object obj = this.f89337d;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "JsBridgeEvent(funcName=" + this.f89334a + ", params=" + this.f89335b + ", callbackId=" + this.f89336c + ", jsBridge=" + this.f89337d + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.event.g$a */
    public static final class C37839a {
        static {
            Covode.recordClassIndex(45291);
        }

        private C37839a() {
        }

        public /* synthetic */ C37839a(byte b) {
            this();
        }
    }

    public /* synthetic */ C37838g(String str, JSONObject jSONObject) {
        this(str, jSONObject, null, null);
    }

    public C37838g(String str, JSONObject jSONObject, String str2, Object obj) {
        C89219l.m154721d(str, "");
        this.f89334a = str;
        this.f89335b = jSONObject;
        this.f89336c = str2;
        this.f89337d = obj;
    }
}
