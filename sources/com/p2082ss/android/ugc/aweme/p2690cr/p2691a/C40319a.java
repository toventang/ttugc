package com.p2082ss.android.ugc.aweme.p2690cr.p2691a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p2001c.C27471bk;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2690cr.p2691a.p2693b.C40325a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2691a.p2693b.C40328b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2691a.p2693b.C40329c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40391e;
import com.p2082ss.android.ugc.aweme.utils.C80561hz;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.cr.a.a */
public final class C40319a implements AbstractC40391e {

    /* renamed from: a */
    private final AbstractC89244h f94485a = C89250i.m154773a((AbstractC89171a) C40322c.f94492a);

    /* renamed from: b */
    private final AbstractC89244h f94486b = C89250i.m154777a(new C40329c());

    /* renamed from: c */
    private final AbstractC89244h f94487c = C89250i.m154777a(new C40328b());

    /* renamed from: d */
    private final AbstractC89244h f94488d = C89250i.m154777a(new C40325a());

    /* renamed from: e */
    private final Set<String> f94489e = C27471bk.m54929a();

    static {
        Covode.recordClassIndex(48120);
    }

    /* renamed from: c */
    private final C40329c m81471c() {
        return (C40329c) this.f94486b.getValue();
    }

    /* renamed from: d */
    private final C40328b m81472d() {
        return (C40328b) this.f94487c.getValue();
    }

    /* renamed from: e */
    private final C40325a m81473e() {
        return (C40325a) this.f94488d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.a.a$c */
    static final class C40322c extends AbstractC89220m implements AbstractC89171a<Set<? extends String>> {

        /* renamed from: a */
        public static final C40322c f94492a = new C40322c();

        static {
            Covode.recordClassIndex(48123);
        }

        C40322c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<? extends String> invoke() {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            List<String> cacheCleanDefaultWhiteList = iESSettingsProxy.getCacheCleanDefaultWhiteList();
            C89219l.m154716b(cacheCleanDefaultWhiteList, "");
            return C89070n.m154592l(cacheCleanDefaultWhiteList);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40391e
    /* renamed from: b */
    public final Set<String> mo69464b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll((Set) this.f94485a.getValue());
        return linkedHashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40391e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<java.lang.String> mo69462a() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2690cr.p2691a.C40319a.mo69462a():java.util.Set");
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.a.a$a */
    static final class C40320a<F, T> implements AbstractC27235f {

        /* renamed from: a */
        public static final C40320a f94490a = new C40320a();

        static {
            Covode.recordClassIndex(48121);
        }

        C40320a() {
        }

        @Override // com.google.p1998c.p1999a.AbstractC27235f
        /* renamed from: a */
        public final /* synthetic */ Object mo45319a(Object obj) {
            String str = (String) obj;
            if (str != null) {
                return new C89350l("/data/user/0/").replaceFirst(str, "/data/data/");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.a.a$b */
    static final class C40321b<F, T> implements AbstractC27235f {

        /* renamed from: a */
        public static final C40321b f94491a = new C40321b();

        static {
            Covode.recordClassIndex(48122);
        }

        C40321b() {
        }

        @Override // com.google.p1998c.p1999a.AbstractC27235f
        /* renamed from: a */
        public final /* synthetic */ Object mo45319a(Object obj) {
            String str = (String) obj;
            if (str != null) {
                return new C89350l("/data/data/").replaceFirst(str, "/data/user/0/");
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43239n
    /* renamed from: a */
    public final void mo69463a(C43223c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        C40325a e = m81473e();
        e.f94497a.set(true);
        if (C80561hz.m139646a()) {
            C1731i.m5640b(new C40325a.CallableC40326a(e), C1731i.f5562a);
        } else {
            e.mo69465a();
        }
    }
}
