package com.p2082ss.android.ugc.aweme.p2690cr.p2696c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40331a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import java.io.File;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.c.a */
public final class C40334a implements AbstractC40389c {

    /* renamed from: a */
    public static final C40335a f94509a = new C40335a((byte) 0);

    static {
        Covode.recordClassIndex(48135);
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.c.a$a */
    public static final class C40335a {
        static {
            Covode.recordClassIndex(48136);
        }

        private C40335a() {
        }

        public /* synthetic */ C40335a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: a */
    public final String mo69475a(String str) {
        return m81493a(EnumC40331a.SHOOT, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: b */
    public final String mo69476b(String str) {
        return m81493a(EnumC40331a.VIDEOCUT, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: c */
    public final String mo69477c(String str) {
        return m81493a(EnumC40331a.PUBLISH, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: d */
    public final String mo69478d(String str) {
        return m81494a(EnumC40332b.CACHE, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: e */
    public final String mo69479e(String str) {
        return m81494a(EnumC40332b.RESOURCE, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: f */
    public final String mo69480f(String str) {
        return m81494a(EnumC40332b.STORY, str);
    }

    /* renamed from: a */
    private static boolean m81495a(File file) {
        C89219l.m154721d(file, "");
        C40346b.m81527b();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: g */
    public final File mo69481g(String str) {
        C89219l.m154721d(str, "");
        File file = new File(str);
        m81495a(file);
        file.getPath();
        file.exists();
        return file;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c
    /* renamed from: a */
    public final File mo69474a(File file, String str) {
        C89219l.m154721d(file, "");
        C89219l.m154721d(str, "");
        File file2 = new File(file, str);
        m81495a(file2);
        file2.getPath();
        file2.exists();
        return file2;
    }

    /* renamed from: a */
    private static String m81493a(EnumC40331a aVar, String str) {
        String str2;
        C89219l.m154721d(aVar, "");
        int i = C40336b.f94510a[aVar.ordinal()];
        boolean z = true;
        if (i == 1) {
            str2 = "shoot";
        } else if (i == 2) {
            str2 = "videoedit";
        } else if (i == 3) {
            str2 = "videocut";
        } else if (i == 4) {
            str2 = "publish";
        } else {
            throw new C89376n();
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            return C70638dj.f158101d + "shortvideo/" + str2 + '/';
        }
        return C70638dj.f158101d + "shortvideo/" + str2 + '/' + str + '/';
    }

    /* renamed from: a */
    private static String m81494a(EnumC40332b bVar, String str) {
        String str2;
        C89219l.m154721d(bVar, "");
        int i = C40336b.f94511b[bVar.ordinal()];
        boolean z = true;
        if (i == 1) {
            str2 = "cache";
        } else if (i == 2) {
            str2 = "resources";
        } else if (i == 3) {
            str2 = "draft";
        } else if (i == 4) {
            str2 = "story";
        } else {
            throw new C89376n();
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            return C70638dj.f158101d + "shortvideo/" + str2 + '/';
        }
        return C70638dj.f158101d + "shortvideo/" + str2 + '/' + str + '/';
    }
}
