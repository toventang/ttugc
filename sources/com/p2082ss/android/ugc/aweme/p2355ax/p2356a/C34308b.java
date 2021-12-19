package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.b */
public final class C34308b implements AbstractC34343p {

    /* renamed from: a */
    public final String f81148a;

    /* renamed from: b */
    public final String f81149b;

    /* renamed from: c */
    public final String f81150c;

    /* renamed from: d */
    private final AbstractC89244h f81151d = C89250i.m154774a(EnumC89331m.NONE, new C34309a(this));

    static {
        Covode.recordClassIndex(41252);
    }

    /* renamed from: a */
    private Uri m70192a() {
        return (Uri) this.f81151d.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34308b)) {
            return false;
        }
        C34308b bVar = (C34308b) obj;
        return C89219l.m154714a(this.f81148a, bVar.f81148a) && C89219l.m154714a(this.f81149b, bVar.f81149b) && C89219l.m154714a(this.f81150c, bVar.f81150c);
    }

    public final int hashCode() {
        String str = this.f81148a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81149b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f81150c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ApiRequest(url=" + this.f81148a + ", method=" + this.f81149b + ", body=" + this.f81150c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.b$a */
    static final class C34309a extends AbstractC89220m implements AbstractC89171a<Uri> {

        /* renamed from: a */
        final /* synthetic */ C34308b f81152a;

        static {
            Covode.recordClassIndex(41253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34309a(C34308b bVar) {
            super(0);
            this.f81152a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Uri invoke() {
            return Uri.parse(this.f81152a.f81148a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34343p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", new Uri.Builder().scheme(m70192a().getScheme()).authority(m70192a().getAuthority()).build());
        jSONObject.put("path", m70192a().getPath());
        jSONObject.put("url", new Uri.Builder().scheme(m70192a().getScheme()).authority(m70192a().getAuthority()).path(m70192a().getPath()).build());
        jSONObject.put("method", this.f81149b);
        return jSONObject;
    }

    public C34308b(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f81148a = str;
        this.f81149b = str2;
        this.f81150c = str3;
    }
}
