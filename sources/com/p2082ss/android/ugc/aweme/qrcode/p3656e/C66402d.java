package com.p2082ss.android.ugc.aweme.qrcode.p3656e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.e.d */
public final class C66402d {
    static {
        Covode.recordClassIndex(77934);
    }

    /* renamed from: a */
    static String m118101a() {
        File a = m118099a(C17867d.m33078a());
        if (a == null) {
            return null;
        }
        C80720e.m139920a(a);
        return a.getAbsolutePath();
    }

    /* renamed from: a */
    static final /* synthetic */ Object m118100a(File file) {
        try {
            m118103b(file);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m118104c(int i) {
        if (m118098a(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static File m118098a(int i) {
        String a = m118101a();
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        File file = new File(a, m118102b(i));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public static void m118105d(int i) {
        File a;
        if (m118104c(i) && (a = m118098a(i)) != null && a.exists()) {
            C1731i.m5640b(new CallableC66404f(a), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    private static File m118099a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: b */
    static String m118102b(int i) {
        String str;
        StringBuilder append = new StringBuilder().append(C31575b.m65865g().getCurUserId());
        if (i == 1) {
            str = "_qrcode_image_cache_for_invite";
        } else {
            str = "_qrcode_image_cache";
        }
        return append.append(str).toString();
    }

    /* renamed from: b */
    private static boolean m118103b(File file) {
        MethodCollector.m26663i(904);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(904);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(904);
        return delete;
    }
}
