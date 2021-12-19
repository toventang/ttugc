package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.h */
public final class C70681h {

    /* renamed from: a */
    public static final C70681h f158203a = new C70681h();

    private C70681h() {
    }

    static {
        Covode.recordClassIndex(83152);
    }

    /* renamed from: b */
    public static boolean m124909b() {
        if (!C80720e.m139927b(m124910c()) || !Keva.getRepo("duet_layout").getBoolean("duet_layout_file_copied", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static String m124910c() {
        StringBuilder sb = new StringBuilder();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("duet").append(File.separator).append("default").toString();
    }

    /* renamed from: a */
    public static boolean m124908a() {
        MethodCollector.m26663i(9017);
        if (Keva.getRepo("duet_layout").getInt("duet_layout_version", 0) <= 0) {
            Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", false);
            Keva.getRepo("duet_layout").storeInt("duet_layout_version", 1);
        }
        if (Keva.getRepo("duet_layout").getBoolean("duet_layout_file_copied", false)) {
            MethodCollector.m26664o(9017);
            return true;
        }
        File file = new File(m124910c());
        if (file.exists() || file.mkdirs()) {
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            try {
                InputStream open = application.getAssets().open("duet_default_layout.zip");
                C89219l.m154716b(open, "");
                String absolutePath = file.getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                C84915u.m145942a(open, absolutePath);
                Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", true);
                MethodCollector.m26664o(9017);
                return true;
            } catch (IOException unused) {
                MethodCollector.m26664o(9017);
                return false;
            }
        } else {
            MethodCollector.m26664o(9017);
            return false;
        }
    }
}
