package com.p2082ss.android.ugc.aweme.music.p3476k;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.k.h */
public final class C60830h {

    /* renamed from: a */
    public static final C60830h f138242a = new C60830h();

    private C60830h() {
    }

    static {
        Covode.recordClassIndex(71387);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.k.h$a */
    public static final class C60831a {

        /* renamed from: a */
        private final HashMap<String, String> f138243a;

        /* renamed from: b */
        private final Uri.Builder f138244b;

        static {
            Covode.recordClassIndex(71388);
        }

        /* renamed from: a */
        public final Uri mo98235a() {
            for (Map.Entry<String, String> entry : this.f138243a.entrySet()) {
                this.f138244b.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            Uri build = this.f138244b.build();
            C89219l.m154716b(build, "");
            return build;
        }

        public C60831a(HashMap<String, String> hashMap, Uri.Builder builder) {
            C89219l.m154721d(hashMap, "");
            C89219l.m154721d(builder, "");
            this.f138243a = hashMap;
            this.f138244b = builder;
        }

        /* renamed from: a */
        public final C60831a mo98236a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (!TextUtils.isEmpty(this.f138243a.get("rn_schema"))) {
                HashMap<String, String> hashMap = this.f138243a;
                String uri = Uri.parse(this.f138243a.get("rn_schema")).buildUpon().appendQueryParameter(str, str2).build().toString();
                C89219l.m154716b(uri, "");
                hashMap.put("rn_schema", uri);
            }
            if (!TextUtils.isEmpty(this.f138243a.get("url"))) {
                HashMap<String, String> hashMap2 = this.f138243a;
                String uri2 = Uri.parse(this.f138243a.get("url")).buildUpon().appendQueryParameter(str, str2).build().toString();
                C89219l.m154716b(uri2, "");
                hashMap2.put("url", uri2);
            }
            return this;
        }
    }

    /* renamed from: a */
    public static final C60831a m110432a(String str) {
        C89219l.m154721d(str, "");
        HashMap<String, String> b = m110433b(str);
        Uri.Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        C89219l.m154716b(clearQuery, "");
        return new C60831a(b, clearQuery);
    }

    /* renamed from: b */
    private static HashMap<String, String> m110433b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        Uri parse = Uri.parse(str);
        HashMap<String, String> hashMap = new HashMap<>();
        C89219l.m154716b(parse, "");
        for (String str2 : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                C89219l.m154716b(str2, "");
                if (queryParameter == null) {
                    C89219l.m154715b();
                }
                hashMap.put(str2, queryParameter);
            }
        }
        return hashMap;
    }
}
