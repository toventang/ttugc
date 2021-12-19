package com.p2082ss.android.ugc.aweme.p2400bp;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.bp.a */
public final class C34896a {

    /* renamed from: a */
    public static String f82343a = "GraphicMMT.ini";

    /* renamed from: b */
    private static String f82344b = "GMTManager";

    /* renamed from: com.ss.android.ugc.aweme.bp.a$a */
    public static class C34897a {
        @AbstractC27891c(mo46611a = "enable_on_release")

        /* renamed from: a */
        public boolean f82345a;
        @AbstractC27891c(mo46611a = "gmt_config")

        /* renamed from: b */
        public int f82346b = 273;
        @AbstractC27891c(mo46611a = "gmt_dump_threshold")

        /* renamed from: c */
        public int f82347c = 300;
        @AbstractC27891c(mo46611a = "gmt_record_threshold")

        /* renamed from: d */
        public int f82348d = 1048576;

        static {
            Covode.recordClassIndex(41908);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bp.a$b */
    public interface AbstractC34898b {

        /* renamed from: a */
        public static final C34897a f82349a = null;

        static {
            Covode.recordClassIndex(41909);
        }
    }

    static {
        Covode.recordClassIndex(41907);
    }

    /* renamed from: a */
    public static boolean m71280a() {
        Context a;
        if (Build.VERSION.SDK_INT >= 23 && (a = C17867d.m33078a()) != null && a.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m71281b() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2400bp.C34896a.m71281b():int");
    }
}
