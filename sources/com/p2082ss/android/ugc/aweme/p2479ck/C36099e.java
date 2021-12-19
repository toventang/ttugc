package com.p2082ss.android.ugc.aweme.p2479ck;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import java.util.Iterator;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.ck.e */
public final class C36099e implements C36125t.AbstractC36130b {

    /* renamed from: a */
    public static final C36099e f85308a = new C36099e();

    private C36099e() {
    }

    static {
        Covode.recordClassIndex(43352);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.e$a */
    static final class C36100a extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C36100a f85309a = new C36100a();

        static {
            Covode.recordClassIndex(43353);
        }

        C36100a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(!C89219l.m154714a((Object) str, (Object) "cid"));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.C36125t.AbstractC36130b
    /* renamed from: a */
    public final String mo59992a(String str) {
        Uri parse;
        String queryParameter;
        if (str == null || (queryParameter = (parse = Uri.parse(str)).getQueryParameter("cid")) == null || queryParameter.length() == 0) {
            return "";
        }
        Uri.Builder buildUpon = Uri.parse("aweme://challenge/detail/".concat(String.valueOf(queryParameter))).buildUpon();
        C89219l.m154716b(parse, "");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        Iterator a = C89309k.m154799a(C89070n.m154598r(queryParameterNames), (AbstractC89172b) C36100a.f85309a).mo2926a();
        while (a.hasNext()) {
            String str2 = (String) a.next();
            buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
        }
        String builder = buildUpon.toString();
        C89219l.m154716b(builder, "");
        return builder;
    }
}
