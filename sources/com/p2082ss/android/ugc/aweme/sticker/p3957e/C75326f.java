package com.p2082ss.android.ugc.aweme.sticker.p3957e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.e.f */
public final class C75326f {

    /* renamed from: a */
    public static final C75326f f169329a = new C75326f();

    private C75326f() {
    }

    static {
        Covode.recordClassIndex(88243);
    }

    /* renamed from: a */
    public static String m132130a() {
        StringBuilder sb = new StringBuilder();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("personalEffect").toString();
    }
}
