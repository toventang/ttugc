package com.p2082ss.android.ugc.aweme.web;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.sdk.webview.AbstractC30269m;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.web.k */
public final class C81631k implements AbstractC30269m {

    /* renamed from: a */
    public static C81631k f182525a = new C81631k();

    /* renamed from: b */
    public static boolean f182526b = true;

    /* renamed from: c */
    private String f182527c;

    private C81631k() {
    }

    static {
        Covode.recordClassIndex(95028);
    }

    /* renamed from: b */
    public static File m141476b() {
        File file = new File(m141475a(C17867d.m33078a()), "offlineX");
        C80720e.m139920a(file);
        return file;
    }

    /* renamed from: d */
    private static boolean m141477d() {
        boolean equals = TextUtils.equals(C17867d.f42595s, "local_test");
        boolean equals2 = "online".equals(C80333dc.m139286g());
        if (!equals || equals2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo125297c() {
        String str;
        if (TextUtils.isEmpty(this.f182527c)) {
            if (m141477d()) {
                str = C81632l.m141481a();
            } else {
                str = "f9e6186803d872f739d3d1707d9a652e";
            }
            this.f182527c = str;
        }
        return this.f182527c;
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30269m
    /* renamed from: a */
    public final String mo53730a() {
        File file = new File(m141476b().getPath(), mo125297c());
        C80720e.m139920a(file);
        return file.getPath();
    }

    /* renamed from: a */
    private static File m141475a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30269m
    /* renamed from: a */
    public final String mo53731a(String str) {
        File file = new File(m141476b().getPath(), str);
        C80720e.m139920a(file);
        return file.getPath();
    }
}
