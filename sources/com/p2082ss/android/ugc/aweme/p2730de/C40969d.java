package com.p2082ss.android.ugc.aweme.p2730de;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.de.d */
public final class C40969d {

    /* renamed from: a */
    public static final C40969d f95805a = new C40969d();

    private C40969d() {
    }

    static {
        Covode.recordClassIndex(48821);
    }

    /* renamed from: a */
    public static final void m82483a(String str, String str2) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str2)) {
            C40970e.m82485a("  logFile is null :".concat(String.valueOf(str)));
            return;
        }
        File file = new File(str2);
        C40970e.m82485a(str + "   filePath:" + file.getAbsolutePath() + "         exist:" + file.exists() + "        fileSize:" + file.length());
    }
}
