package com.p2082ss.android.ugc.aweme.commercialize.util.p2618a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38554a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.a.a */
public final class C38550a {

    /* renamed from: a */
    public static volatile C38552b f91074a;

    /* renamed from: b */
    public static final C38550a f91075b = new C38550a();

    /* renamed from: c */
    private static final String f91076c = (C38554a.f91082a.mo65600a() + "://adx");

    private C38550a() {
    }

    static {
        Covode.recordClassIndex(46081);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.a.a$a */
    static final class CallableC38551a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Uri f91077a;

        static {
            Covode.recordClassIndex(46082);
        }

        CallableC38551a(Uri uri) {
            this.f91077a = uri;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            Uri uri = this.f91077a;
            C38552b bVar = C38550a.f91074a;
            C38550a.f91074a = null;
            if (bVar != null) {
                String str2 = bVar.f91078a;
                if (str2 == null || str2.length() <= 0) {
                    String queryParameter = uri.getQueryParameter("tag");
                    if (queryParameter == null || queryParameter.length() <= 0) {
                        str = "draw_ad";
                    } else {
                        str = uri.getQueryParameter("tag");
                    }
                } else {
                    str = bVar.f91078a;
                }
                C38151a.C38153b a = C38151a.m77332a();
                a.f90122a = str;
                a.f90123b = "open_url_appback";
                a.mo66446a(Long.valueOf(bVar.f91079b)).mo66454c(bVar.f91080c).mo66452b(Long.valueOf(bVar.f91081d)).mo66455c();
                if (str != null) {
                    C18129a.m33747a(str, "open_url_appback", String.valueOf(bVar.f91079b), bVar.f91080c, String.valueOf(bVar.f91081d)).mo28902c();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static boolean m78169a(String str) {
        if (str == null || !C89361p.m154908a((CharSequence) str, (CharSequence) "__back_url__", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m78168a(Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            C89219l.m154716b(uri2, "");
            if (C89361p.m154874b(uri2, f91076c, false)) {
                C1731i.m5640b(new CallableC38551a(uri), C1731i.f5562a);
            }
        }
    }

    /* renamed from: a */
    public static final String m78167a(String str, String str2) {
        if (!m78169a(str)) {
            return str;
        }
        if (str2 != null && str2.length() > 0) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("tag", str2).build().toString();
        }
        if (str == null) {
            return null;
        }
        String encode = Uri.encode(f91076c);
        C89219l.m154716b(encode, "");
        return C89361p.m154869a(str, "__back_url__", encode, false);
    }
}
