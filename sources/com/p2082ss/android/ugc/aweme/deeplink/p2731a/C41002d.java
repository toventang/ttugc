package com.p2082ss.android.ugc.aweme.deeplink.p2731a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41061r;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;

/* renamed from: com.ss.android.ugc.aweme.deeplink.a.d */
public final class C41002d extends AbstractC40998a {

    /* renamed from: a */
    private Uri f95876a;

    /* renamed from: b */
    private String f95877b;

    /* renamed from: c */
    private boolean f95878c;

    /* renamed from: d */
    private Context f95879d;

    static {
        Covode.recordClassIndex(48865);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009f, code lost:
        if (r6 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if ((!"link.e.tiktok.com".equals(r6.getHost())) != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if (r6 != null) goto L_0x0063;
     */
    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2731a.AbstractC40998a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri mo70209a(final android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.deeplink.p2731a.C41002d.mo70209a(android.net.Uri):android.net.Uri");
    }

    public C41002d(Context context, boolean z) {
        this.f95879d = context;
        this.f95878c = z;
    }

    /* renamed from: a */
    public final void mo70210a(Uri uri, String str) {
        try {
            String queryParameter = uri.getQueryParameter("backurl");
            Uri parse = Uri.parse(str);
            this.f95877b = parse.getQueryParameter("user_id");
            if (!TextUtils.isEmpty(queryParameter)) {
                Uri.Builder buildUpon = Uri.parse(parse.toString()).buildUpon();
                buildUpon.appendQueryParameter("backurl", queryParameter);
                parse = buildUpon.build();
            }
            String[] a = C41061r.C41062a.m82720a();
            int i = 0;
            while (true) {
                if (!a[i].equals(parse.getHost())) {
                    i++;
                    if (i >= 34) {
                        break;
                    }
                } else {
                    this.f95876a = new C40999b().mo70209a(parse);
                    break;
                }
            }
            if (this.f95876a == null) {
                this.f95876a = new C41001c().mo70209a(parse);
            }
        } catch (Exception e) {
            C41039c.m82668a("short_2_long", 2004, uri, "uri parse exception");
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70211b(android.net.Uri r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.deeplink.p2731a.C41002d.mo70211b(android.net.Uri, java.lang.String):void");
    }
}
