package com.bytedance.ies.bullet.service.p1170d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16699y;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import com.bytedance.ies.p1191d.p1192a.AbstractC17125m;
import com.bytedance.ies.p1191d.p1192a.C17144y;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.d.b */
public final class C16708b extends C16616a implements AbstractC16699y {

    /* renamed from: b */
    public static final C16709a f39892b = new C16709a((byte) 0);

    /* renamed from: a */
    public AbstractC16710b f39893a;

    /* renamed from: c */
    private final HashSet<Uri> f39894c = new HashSet<>();

    /* renamed from: f */
    private final AbstractC17125m f39895f;

    /* renamed from: g */
    private final String f39896g;

    /* renamed from: com.bytedance.ies.bullet.service.d.b$b */
    public interface AbstractC16710b {
        static {
            Covode.recordClassIndex(19150);
        }

        /* renamed from: a */
        JSONObject mo26541a();
    }

    static {
        Covode.recordClassIndex(19148);
    }

    /* renamed from: com.bytedance.ies.bullet.service.d.b$a */
    public static final class C16709a {
        static {
            Covode.recordClassIndex(19149);
        }

        private C16709a() {
        }

        public /* synthetic */ C16709a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16699y
    /* renamed from: a */
    public final void mo26537a(Uri uri) {
        C89219l.m154719c(uri, "");
        this.f39894c.add(uri);
        m31011d(uri);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16699y
    /* renamed from: a */
    public final Object mo26536a(Object obj) {
        C89219l.m154719c(obj, "");
        return new C16706a(this.f39896g, this, (C16248b) obj, this.f39895f);
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16699y
    /* renamed from: b */
    public final void mo26538b(Uri uri) {
        C89219l.m154719c(uri, "");
        if (!this.f39894c.remove(uri)) {
            m31011d(uri);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16699y
    /* renamed from: c */
    public final JSONObject mo26539c(Uri uri) {
        AbstractC16710b bVar;
        C89219l.m154719c(uri, "");
        C89219l.m154719c(uri, "");
        if (C89361p.m154872a(uri.getScheme(), "lynxview", false)) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("lynxview").authority("prefetch").path(C89219l.m154704a(uri.getAuthority(), (Object) uri.getPath()));
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C89219l.m154709a((Object) queryParameterNames, "");
            for (T t : queryParameterNames) {
                builder.appendQueryParameter(t, uri.getQueryParameter(t));
            }
            String builder2 = builder.toString();
            C89219l.m154709a((Object) builder2, "");
            List<C17144y> b = this.f39895f.mo26986b(builder2);
            if (b != null) {
                JSONObject jSONObject = null;
                for (T t2 : b) {
                    if (t2.f40771f != null) {
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String str = t2.f40773h.f40778b;
                        AbstractC17117i.C17120c cVar = t2.f40771f;
                        if (cVar == null) {
                            C89219l.m154707a();
                        }
                        jSONObject.put(str, cVar.mo27031b().getJSONObject("raw"));
                    }
                }
                if (jSONObject != null) {
                    return jSONObject;
                }
            }
        }
        String valueOf = String.valueOf(uri);
        C89219l.m154719c(valueOf, "");
        if (valueOf.length() == 0 || (bVar = this.f39893a) == null) {
            return null;
        }
        return bVar.mo26541a();
    }

    /* renamed from: d */
    private void m31011d(Uri uri) {
        String str;
        String str2;
        String queryParameter;
        List<String> b;
        C89219l.m154719c(uri, "");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String authority = uri.getAuthority();
            if (authority == null || (b = C89361p.m154915b(authority, new String[]{"_"})) == null || (str = (String) C89070n.m154583g((List) b)) == null) {
                str = uri.getAuthority();
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1772600516) {
                    if (hashCode != -1377934078) {
                        if (hashCode == 1224424441 && str.equals("webview") && (queryParameter = uri.getQueryParameter("url")) != null) {
                            Uri.Builder buildUpon = Uri.parse(queryParameter).buildUpon();
                            Set<String> queryParameterNames = uri.getQueryParameterNames();
                            C89219l.m154709a((Object) queryParameterNames, "");
                            for (T t : queryParameterNames) {
                                if (!C89219l.m154714a((Object) t, (Object) "url")) {
                                    buildUpon.appendQueryParameter(t, uri.getQueryParameter(t));
                                }
                            }
                            str2 = buildUpon.toString();
                        } else {
                            return;
                        }
                    } else if (!str.equals("bullet") || (str2 = uri.getQueryParameter("url")) == null) {
                        return;
                    } else {
                        if (C89361p.m154874b(str2, "lynxview", false)) {
                            Uri parse = Uri.parse(str2);
                            C89219l.m154709a((Object) parse, "");
                            String path = parse.getPath();
                            if (path == null || path.length() == 0) {
                                Uri.Builder buildUpon2 = Uri.parse(parse.getQueryParameter("surl")).buildUpon();
                                Set<String> queryParameterNames2 = parse.getQueryParameterNames();
                                C89219l.m154709a((Object) queryParameterNames2, "");
                                for (T t2 : queryParameterNames2) {
                                    if (!C89219l.m154714a((Object) t2, (Object) "surl")) {
                                        buildUpon2.appendQueryParameter(t2, parse.getQueryParameter(t2));
                                    }
                                }
                                str2 = buildUpon2.toString();
                            } else {
                                Uri.Builder buildUpon3 = parse.buildUpon();
                                buildUpon3.authority("prefetch").path(C89219l.m154704a(parse.getHost(), (Object) parse.getPath()));
                                str2 = buildUpon3.toString();
                            }
                        } else {
                            if (!C89361p.m154874b(str2, "http", false) && !C89361p.m154874b(str2, "https", false)) {
                                return;
                            }
                            this.f39895f.mo26985a(str2);
                            AbstractC16576j.C16578b.m30778a(this, "start prefetch:" + str2 + ", with time cost:" + (System.currentTimeMillis() - currentTimeMillis), null, null, 6);
                        }
                    }
                } else if (str.equals("lynxview")) {
                    String queryParameter2 = uri.getQueryParameter("channel");
                    String queryParameter3 = uri.getQueryParameter("bundle");
                    if ((queryParameter2 == null || queryParameter2.length() == 0) && (queryParameter3 == null || queryParameter3.length() == 0)) {
                        Uri.Builder buildUpon4 = Uri.parse(uri.getQueryParameter("surl")).buildUpon();
                        Set<String> queryParameterNames3 = uri.getQueryParameterNames();
                        C89219l.m154709a((Object) queryParameterNames3, "");
                        for (T t3 : queryParameterNames3) {
                            if (!C89219l.m154714a((Object) t3, (Object) "surl")) {
                                buildUpon4.appendQueryParameter(t3, uri.getQueryParameter(t3));
                            }
                        }
                        str2 = buildUpon4.toString();
                    } else {
                        Uri.Builder builder = new Uri.Builder();
                        builder.scheme("lynxview").authority("prefetch").path(queryParameter2 + '/' + queryParameter3);
                        Set<String> queryParameterNames4 = uri.getQueryParameterNames();
                        C89219l.m154709a((Object) queryParameterNames4, "");
                        for (T t4 : queryParameterNames4) {
                            if ((!C89219l.m154714a((Object) t4, (Object) "channel")) && (!C89219l.m154714a((Object) t4, (Object) "bundle"))) {
                                builder.appendQueryParameter(t4, uri.getQueryParameter(t4));
                            }
                        }
                        str2 = builder.toString();
                    }
                } else {
                    return;
                }
                if (str2 == null) {
                    return;
                }
                this.f39895f.mo26985a(str2);
                AbstractC16576j.C16578b.m30778a(this, "start prefetch:" + str2 + ", with time cost:" + (System.currentTimeMillis() - currentTimeMillis), null, null, 6);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C16708b(AbstractC17125m mVar, String str) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(str, "");
        this.f39895f = mVar;
        this.f39896g = str;
    }
}
