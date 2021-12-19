package com.p2082ss.android.ugc.aweme.deeplink.p2734c;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33798k;
import com.p2082ss.android.ugc.aweme.deeplink.C41035d;
import com.p2082ss.android.ugc.aweme.deeplink.C41058p;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41037a;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import java.net.URLDecoder;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.c.c */
public final class C41026c extends AbstractC41025b {

    /* renamed from: a */
    public static final C41027a f95910a = new C41027a((byte) 0);

    static {
        Covode.recordClassIndex(48896);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.c.c$a */
    public static final class C41027a {
        static {
            Covode.recordClassIndex(48897);
        }

        private C41027a() {
        }

        public /* synthetic */ C41027a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2734c.AbstractC41025b
    /* renamed from: a */
    public final boolean mo70238a(C41035d dVar) {
        String str = "";
        C89219l.m154721d(dVar, str);
        C41039c.m82675c("EntryNode");
        C41058p pVar = dVar.f95920c;
        Intent intent = dVar.f95923f;
        Uri uri = dVar.f95922e;
        C41037a aVar = new C41037a(dVar.f95921d, dVar.f95923f);
        Object obj = dVar.f95919b.get("is_from_notification");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        aVar.mo70246a(((Boolean) obj).booleanValue(), dVar.f95922e);
        C33798k kVar = new C33798k(pVar);
        Object obj2 = dVar.f95919b.get("is_from_notification");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        if (!((Boolean) obj2).booleanValue()) {
            kVar.mo60037a(dVar.f95921d, dVar.f95922e);
        }
        if (m82647a(intent, "user_id") != null) {
            String a = m82647a(intent, "user_id");
            if (a == null) {
                C89219l.m154715b();
            }
            pVar.mo70269e(a);
        } else {
            String queryParameter = uri.getQueryParameter("params_url");
            if (queryParameter != null) {
                C89219l.m154716b(queryParameter, str);
                String queryParameter2 = Uri.parse(URLDecoder.decode(queryParameter)).getQueryParameter("user_id");
                if (queryParameter2 == null) {
                    queryParameter2 = str;
                }
                pVar.mo70269e(queryParameter2);
            }
        }
        String a2 = m82647a(intent, "launch_method");
        if (a2 == null) {
            a2 = str;
        }
        pVar.mo70265a(a2);
        String a3 = m82647a(intent, "page_source");
        if (a3 != null) {
            str = a3;
        }
        pVar.mo70266b(str);
        C41039c.m82672b("EntryNode");
        return true;
    }

    /* renamed from: a */
    private static String m82647a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
