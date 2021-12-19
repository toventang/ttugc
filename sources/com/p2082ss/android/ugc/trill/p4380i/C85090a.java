package com.p2082ss.android.ugc.trill.p4380i;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.ss.android.ugc.trill.i.a */
public final class C85090a {
    static {
        Covode.recordClassIndex(99113);
    }

    /* renamed from: a */
    private static void m146305a(Context context) {
        String b = C29843f.m60132b(context);
        m146306a(b);
        try {
            WebView.setDataDirectorySuffix(b);
        } catch (Exception e) {
            C33830n.m70668a("web_view_set_directory_error", new C33743c().mo59974a("errorCode", (Integer) 4001).mo59976a("errorDesc", "setDataDirectorySuffix error:" + e.getMessage()).mo59976a("processName", b).mo59977a());
        }
    }

    /* renamed from: a */
    private static void m146306a(String str) {
        if (str == null) {
            C33830n.m70668a("web_view_set_directory_error", new C33743c().mo59974a("errorCode", (Integer) 4002).mo59976a("errorDesc", "processName == null").mo59977a());
        }
        if (TextUtils.equals("", str)) {
            C33830n.m70668a("web_view_set_directory_error", new C33743c().mo59974a("errorCode", (Integer) 4003).mo59976a("errorDesc", "processName is empty").mo59977a());
        }
    }

    /* renamed from: b */
    private static void m146310b(Context context) {
        File file = new File(context.getDataDir().getAbsolutePath() + "/app_webview/webview_data.lock");
        if (file.exists()) {
            try {
                FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (tryLock != null) {
                    tryLock.close();
                    return;
                }
                boolean a = m146308a(file);
                C33830n.m70668a("web_view_set_directory_error", new C33743c().mo59974a("errorCode", (Integer) 4005).mo59976a("errorDesc", "web_view.lock locked, need delete:" + a + " isCreateNew:" + m146309a(file, a)).mo59977a());
            } catch (Exception e) {
                boolean z = false;
                if (file.exists()) {
                    z = m146308a(file);
                }
                C33830n.m70668a("web_view_set_directory_error", new C33743c().mo59974a("errorCode", (Integer) 4004).mo59976a("errorDesc", "web_view.lock locked, need delete:" + z + " isCreateNew:" + m146309a(file, z) + " e:" + e.getMessage()).mo59977a());
            }
        }
    }

    /* renamed from: a */
    private static boolean m146308a(File file) {
        MethodCollector.m26663i(3909);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3909);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3909);
        return delete;
    }

    /* renamed from: a */
    public static void m146307a(boolean z, Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        if (z) {
            m146310b(context);
        } else {
            m146305a(context);
        }
    }

    /* renamed from: a */
    private static boolean m146309a(File file, boolean z) {
        if (z && !file.exists()) {
            try {
                return file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
