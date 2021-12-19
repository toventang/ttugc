package com.p2082ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.Calendar;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.s */
public final class C80160s {

    /* renamed from: c */
    public static final C80161a f179599c = new C80161a((byte) 0);

    /* renamed from: a */
    public final Keva f179600a;

    /* renamed from: b */
    public final String f179601b;

    static {
        Covode.recordClassIndex(93404);
    }

    /* renamed from: com.ss.android.ugc.aweme.util.s$a */
    public static final class C80161a {
        static {
            Covode.recordClassIndex(93405);
        }

        private C80161a() {
        }

        public /* synthetic */ C80161a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final List<String> mo123607a() {
        String[] stringArray = this.f179600a.getStringArray(this.f179601b, new String[0]);
        C89219l.m154716b(stringArray, "");
        return C89064i.m154509j(stringArray);
    }

    /* renamed from: b */
    public static long m138918b() {
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public C80160s(String str) {
        C89219l.m154721d(str, "");
        this.f179601b = str;
        Keva repo = Keva.getRepo("time_stamp_count_helper");
        C89219l.m154716b(repo, "");
        this.f179600a = repo;
    }
}
