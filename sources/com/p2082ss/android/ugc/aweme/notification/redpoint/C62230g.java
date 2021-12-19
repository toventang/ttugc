package com.p2082ss.android.ugc.aweme.notification.redpoint;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89218k;

/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.g */
public final class C62230g {

    /* renamed from: a */
    public static final AbstractC89244h f141245a = C89250i.m154773a((AbstractC89171a) C62231a.f141247a);

    /* renamed from: b */
    public static final C62230g f141246b = new C62230g();

    private C62230g() {
    }

    static {
        Covode.recordClassIndex(72997);
    }

    /* renamed from: c */
    public static int m112534c() {
        if (C56297a.m102301c()) {
            return 0;
        }
        return C61542b.m111458a(99);
    }

    /* renamed from: a */
    public static boolean m112530a() {
        List g = C89070n.m154585g((Collection) C62221f.m112519a());
        C56297a.m102298a(g);
        C89218k kVar = new C89218k();
        kVar.mo143639b(C89070n.m154578e((Collection<Integer>) g));
        kVar.mo143626a();
        if (!C61542b.m111469c(kVar.mo143627b())) {
            if (!C61542b.m111469c(101) || C56297a.m102301c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m112532b() {
        int c = m112534c();
        List g = C89070n.m154585g((Collection) C62221f.m112525b());
        C56297a.m102298a(g);
        if (C56323c.m102321h()) {
            g.remove((Object) 225);
            g.remove((Object) 233);
        }
        int[] e = C89070n.m154578e((Collection<Integer>) g);
        return C61542b.m111466b(Arrays.copyOf(e, e.length)) + c;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.g$a */
    static final class C62231a extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C62231a f141247a = new C62231a();

        static {
            Covode.recordClassIndex(72998);
        }

        C62231a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ int[] invoke() {
            List c = C89070n.m154524c(3, 2, 6, 14, 7, 12, 228);
            C56297a.m102298a(c);
            return C89070n.m154578e((Collection<Integer>) c);
        }
    }

    /* renamed from: a */
    public static boolean m112531a(int i) {
        if (C56297a.m102299a(i)) {
            return false;
        }
        if (C62221f.m112524a(i) || i == 1000 || i == 101) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m112533b(int i) {
        if (C56297a.m102299a(i)) {
            return false;
        }
        if (C62221f.m112526b(i) || i == 99) {
            return true;
        }
        return false;
    }
}
