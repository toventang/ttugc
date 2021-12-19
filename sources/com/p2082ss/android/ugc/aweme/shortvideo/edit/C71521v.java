package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.v */
public final class C71521v {

    /* renamed from: a */
    public static final C71522a f160296a = new C71522a((byte) 0);

    static {
        Covode.recordClassIndex(84062);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.v$a */
    public static final class C71522a {
        static {
            Covode.recordClassIndex(84063);
        }

        private C71522a() {
        }

        /* renamed from: a */
        public static String m126402a() {
            return m126404b() + m126403a("_cover.png");
        }

        /* renamed from: b */
        public static String m126404b() {
            StringBuilder sb = new StringBuilder();
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            File cacheDir = application.getCacheDir();
            C89219l.m154716b(cacheDir, "");
            return sb.append(cacheDir.getPath()).append(File.separator).toString();
        }

        public /* synthetic */ C71522a(byte b) {
            this();
        }

        /* renamed from: a */
        private static String m126403a(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
            C89219l.m154716b(instance, "");
            return simpleDateFormat.format(instance.getTime()) + str;
        }
    }

    /* renamed from: b */
    public static String m126400b(String str) {
        C89219l.m154721d(str, "");
        String path = new File(C70638dj.f158107j, new File(str).getName()).getPath();
        C89219l.m154716b(path, "");
        return path;
    }

    /* renamed from: c */
    public static String m126401c(String str) {
        C89219l.m154721d(str, "");
        String path = new File(C70638dj.f158109l, new File(str).getName()).getPath();
        C89219l.m154716b(path, "");
        return path;
    }

    /* renamed from: a */
    public static String m126399a(String str) {
        C89219l.m154721d(str, "");
        File file = new File(str);
        String path = new File(file.getParent(), "synthetise_" + file.getName()).getPath();
        C89219l.m154716b(path, "");
        return path;
    }
}
