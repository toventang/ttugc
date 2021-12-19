package com.p2082ss.android.ugc.aweme.video.preload;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.b */
public final class C80860b {

    /* renamed from: a */
    public static final C80860b f180801a = new C80860b();

    /* renamed from: b */
    private static final String f180802b = "FeedCacheLoader";

    private C80860b() {
    }

    static {
        Covode.recordClassIndex(94158);
    }

    /* renamed from: a */
    private static String m140275a() {
        File a = m140274a(C17867d.m33078a());
        C89219l.m154716b(a, "");
        String absolutePath = a.getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        return absolutePath;
    }

    /* renamed from: a */
    private static File m140274a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: b */
    public static final boolean m140277b(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m140276a(String str) {
        if (C17867d.m33078a() != null && !TextUtils.isEmpty(str)) {
            String a = m140275a();
            if (!TextUtils.isEmpty(a)) {
                return a + File.separator + "feedCache" + File.separator + str;
            }
        }
        return null;
    }
}
