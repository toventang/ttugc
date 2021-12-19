package com.p2082ss.android.ugc.aweme.tools.extract;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.n */
public final class C78553n {

    /* renamed from: a */
    final Context f176545a;

    /* renamed from: b */
    public String f176546b;

    static {
        Covode.recordClassIndex(91685);
    }

    /* renamed from: a */
    public final String mo122482a() {
        return this.f176546b + File.separator + "extract-frame-" + System.currentTimeMillis() + ".jpg";
    }

    /* renamed from: b */
    public final String mo122485b() {
        return this.f176546b + File.separator + "extract-frame-" + System.currentTimeMillis() + "_hq.jpg";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C78553n(android.app.Application r3) {
        /*
            r2 = this;
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x000c
        L_0x0008:
            r2.<init>(r1)
            return
        L_0x000c:
            if (r1 == 0) goto L_0x000f
            goto L_0x0008
        L_0x000f:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.extract.C78553n.<init>(android.app.Application):void");
    }

    /* renamed from: a */
    public static File m137133a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    private C78553n(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f176545a = applicationContext;
        this.f176546b = m137133a(applicationContext).getAbsolutePath();
    }

    /* renamed from: a */
    public final String mo122483a(String str) {
        if (TextUtils.isEmpty(str)) {
            return mo122482a();
        }
        return this.f176546b + File.separator + "extract-frame-" + str + "_" + System.currentTimeMillis() + ".jpg";
    }

    /* renamed from: a */
    public final void mo122484a(String str, String str2, String str3) {
        this.f176546b = str + File.separator + str2 + File.separator + str3;
        File file = new File(this.f176546b);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
