package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.v */
public final class C34350v extends AbstractC34321d {

    /* renamed from: a */
    public final Uri f81207a;

    /* renamed from: b */
    public final String f81208b;

    static {
        Covode.recordClassIndex(41294);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34348t
    /* renamed from: b */
    public final String mo60803b() {
        String uri = new Uri.Builder().scheme(this.f81207a.getScheme()).authority(this.f81207a.getAuthority()).path(this.f81207a.getPath()).build().toString();
        C89219l.m154716b(uri, "");
        return uri;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34343p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(this.f81208b + "host", new Uri.Builder().scheme(this.f81207a.getScheme()).authority(this.f81207a.getAuthority()).build());
        jSONObject.put(this.f81208b + "path", this.f81207a.getPath());
        jSONObject.put(this.f81208b + "url", new Uri.Builder().scheme(this.f81207a.getScheme()).authority(this.f81207a.getAuthority()).path(this.f81207a.getPath()).build());
        C34322e.m70198a(jSONObject, mo60765a());
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34350v(Uri uri, String str, Map<String, String> map) {
        super(map);
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        this.f81207a = uri;
        this.f81208b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34350v(Uri uri, String str, Map map, int i) {
        this(uri, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : map);
    }
}
