package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.w */
public final class C34351w extends AbstractC34321d {

    /* renamed from: a */
    public final C34350v f81209a;

    /* renamed from: b */
    public C34350v f81210b;

    /* renamed from: c */
    public Uri f81211c;

    /* renamed from: d */
    public final Uri f81212d;

    static {
        Covode.recordClassIndex(41295);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34343p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        C34322e.m70198a(jSONObject, this.f81210b.getFormatData());
        C34322e.m70198a(jSONObject, this.f81209a.getFormatData());
        C34322e.m70198a(jSONObject, mo60765a());
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34348t
    /* renamed from: b */
    public final String mo60803b() {
        String uri = new Uri.Builder().scheme(this.f81209a.f81207a.getScheme()).authority(this.f81209a.f81207a.getAuthority()).path(this.f81209a.f81207a.getPath()).build().toString();
        C89219l.m154716b(uri, "");
        return uri;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34351w(Uri uri, Uri uri2, Map<String, String> map) {
        super(map);
        C89219l.m154721d(uri, "");
        C89219l.m154721d(uri2, "");
        this.f81212d = uri;
        this.f81209a = new C34350v(uri, "referrer_", null, 4);
        this.f81210b = new C34350v(uri2, "page_", null, 4);
        this.f81211c = uri2;
    }
}
