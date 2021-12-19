package com.p2082ss.android.p2141e;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.e.b */
public final class C29905b {

    /* renamed from: a */
    public static Context f71340a;

    /* renamed from: c */
    private static AbstractC29907c<C29905b> f71341c = new AbstractC29907c<C29905b>() {
        /* class com.p2082ss.android.p2141e.C29905b.C299061 */

        static {
            Covode.recordClassIndex(36317);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.p2141e.AbstractC29907c
        /* renamed from: a */
        public final /* synthetic */ C29905b mo52218a() {
            return new C29905b();
        }
    };

    /* renamed from: b */
    public AbstractC29904a f71342b;

    static {
        Covode.recordClassIndex(36316);
    }

    /* renamed from: a */
    private static int m60281a() {
        try {
            return C34822d.m71158a(f71340a, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).getInt("json_data", 0);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static C29905b m60282a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        f71340a = applicationContext;
        return f71341c.mo52219b();
    }

    /* renamed from: a */
    public final void mo52217a(Uri uri) {
        Uri parse;
        try {
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("needlaunchlog", false);
            int a = m60281a();
            if (booleanQueryParameter && a > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : uri.getQueryParameterNames()) {
                    if (!TextUtils.isEmpty(str)) {
                        linkedHashMap.put(str, uri.getQueryParameter(str));
                    }
                }
                String queryParameter = uri.getQueryParameter("params_url");
                if (!TextUtils.isEmpty(queryParameter) && (parse = Uri.parse(queryParameter)) != null) {
                    for (String str2 : parse.getQueryParameterNames()) {
                        if (!TextUtils.isEmpty(str2)) {
                            linkedHashMap.put(str2, parse.getQueryParameter(str2));
                        }
                    }
                }
                linkedHashMap.put("launchlog_protocol", uri.getScheme());
                linkedHashMap.put("launchlog_authority", uri.getAuthority());
                linkedHashMap.put("launchlog_path", uri.getPath());
                AbstractC29904a aVar = this.f71342b;
                if (aVar != null) {
                    aVar.onEvent(linkedHashMap);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
