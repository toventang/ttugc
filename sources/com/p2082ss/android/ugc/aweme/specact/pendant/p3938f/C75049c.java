package com.p2082ss.android.ugc.aweme.specact.pendant.p3938f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75062c;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.c */
public final class C75049c {

    /* renamed from: a */
    public static Aweme f168680a;

    /* renamed from: b */
    public static final List<AbstractC75056b> f168681b = new ArrayList();

    /* renamed from: c */
    static final Handler f168682c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    static final Runnable f168683d = RunnableC75052c.f168690a;

    /* renamed from: e */
    public static final C75049c f168684e = new C75049c();

    /* renamed from: f */
    private static boolean f168685f;

    /* renamed from: g */
    private static boolean f168686g;

    /* renamed from: h */
    private static final AbstractC89171a<C89391z> f168687h = C75050a.f168688a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.c$b */
    public final /* synthetic */ class RunnableC75051b implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f168689a;

        static {
            Covode.recordClassIndex(87923);
        }

        RunnableC75051b(AbstractC89171a aVar) {
            this.f168689a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f168689a.invoke(), "");
        }
    }

    private C75049c() {
    }

    /* renamed from: c */
    public static void m131770c() {
        if (f168685f) {
            f168685f = false;
            f168682c.removeCallbacks(f168683d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.c$a */
    static final class C75050a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C75050a f168688a = new C75050a();

        static {
            Covode.recordClassIndex(87922);
        }

        C75050a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Iterator<T> it = C75049c.f168681b.iterator();
            while (it.hasNext()) {
                it.next().mo118092c();
            }
            C75049c.m131766a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static void m131768b() {
        if (!f168685f) {
            f168685f = true;
            f168682c.postDelayed(f168683d, 1000);
        }
        if (!f168686g) {
            f168686g = true;
            m131766a();
        }
    }

    static {
        Covode.recordClassIndex(87921);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.specact.pendant.f.c$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m131766a() {
        /*
            int r2 = com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k.m131844a()
            long r4 = com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k.m131846b()
            r0 = 86400(0x15180, double:4.26873E-319)
            long r4 = r4 + r0
            long r0 = (long) r2
            long r4 = r4 - r0
            android.os.Handler r3 = com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75049c.f168682c
            h.f.a.a<h.z> r2 = com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75049c.f168687h
            if (r2 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.specact.pendant.f.c$b r0 = new com.ss.android.ugc.aweme.specact.pendant.f.c$b
            r0.<init>(r2)
            r2 = r0
        L_0x001a:
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            r3.postDelayed(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75049c.m131766a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.c$c */
    static final class RunnableC75052c implements Runnable {

        /* renamed from: a */
        public static final RunnableC75052c f168690a = new RunnableC75052c();

        static {
            Covode.recordClassIndex(87924);
        }

        RunnableC75052c() {
        }

        public final void run() {
            Aweme a;
            String str;
            AbstractC80747i O = C81079v.m140776O();
            C89219l.m154716b(O, "");
            if (O.mo123892o() && (a = C75062c.m131823a()) != null) {
                String aid = a.getAid();
                Aweme aweme = C75049c.f168680a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(aid, str)) {
                    for (T t : C75049c.f168681b) {
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        t.mo118088a(a);
                    }
                }
            }
            C75049c.f168682c.postDelayed(C75049c.f168683d, 1000);
        }
    }

    /* renamed from: a */
    public static void m131767a(AbstractC75056b bVar) {
        C89219l.m154721d(bVar, "");
        List<AbstractC75056b> list = f168681b;
        if (!list.contains(bVar)) {
            list.add(bVar);
            if (!list.isEmpty()) {
                m131768b();
            }
        }
    }

    /* renamed from: b */
    public static void m131769b(AbstractC75056b bVar) {
        C89219l.m154721d(bVar, "");
        List<AbstractC75056b> list = f168681b;
        list.remove(bVar);
        if (list.isEmpty()) {
            m131770c();
        }
    }
}
