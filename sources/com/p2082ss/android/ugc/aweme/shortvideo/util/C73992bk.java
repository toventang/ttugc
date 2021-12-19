package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.agilelogger.C29726e;
import com.p2082ss.android.agilelogger.p2118b.C29718a;
import com.p2082ss.android.agilelogger.p2119c.C29721b;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bk */
public final class C73992bk {

    /* renamed from: a */
    public static final C73992bk f166084a = new C73992bk();

    /* renamed from: b */
    private static final AbstractC89244h f166085b = C89250i.m154773a((AbstractC89171a) C73993a.f166088a);

    /* renamed from: c */
    private static final AbstractC89244h f166086c = C89250i.m154773a((AbstractC89171a) C73995c.f166090a);

    /* renamed from: d */
    private static final AbstractC89244h f166087d = C89250i.m154773a((AbstractC89171a) C73994b.f166089a);

    /* renamed from: a */
    private static boolean m130135a() {
        return ((Boolean) f166085b.getValue()).booleanValue();
    }

    /* renamed from: b */
    private static Set<String> m130136b() {
        return (Set) f166086c.getValue();
    }

    /* renamed from: c */
    private static C29718a m130137c() {
        return (C29718a) f166087d.getValue();
    }

    private C73992bk() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bk$b */
    static final class C73994b extends AbstractC89220m implements AbstractC89171a<C29718a> {

        /* renamed from: a */
        public static final C73994b f166089a = new C73994b();

        static {
            Covode.recordClassIndex(86744);
        }

        C73994b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C29718a invoke() {
            return new C29718a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bk$c */
    static final class C73995c extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C73995c f166090a = new C73995c();

        static {
            Covode.recordClassIndex(86745);
        }

        C73995c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return m130138a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054 A[Catch:{ NameNotFoundException -> 0x0062 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.Set<java.lang.String> m130138a() {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.util.C73992bk.C73995c.m130138a():java.util.Set");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bk$a */
    static final class C73993a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C73993a f166088a = new C73993a();

        static {
            Covode.recordClassIndex(86743);
        }

        C73993a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89219l.m154714a((Object) "__ies_tools_android_opt_test__", (Object) C17867d.f42595s));
        }
    }

    static {
        Covode.recordClassIndex(86742);
    }

    /* renamed from: a */
    public static final void m130134a(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!m130135a()) {
            return;
        }
        if (!(!m130136b().isEmpty()) || m130136b().contains(str)) {
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            C29726e a = C29726e.m59907a(i, str, "", currentThread.getId(), C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper()));
            a.f70886g = C29721b.EnumC29722a.MSG;
            a.f70887h = str2;
            m130137c();
        }
    }
}
