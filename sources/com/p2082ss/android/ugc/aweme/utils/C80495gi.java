package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.regex.PatternSyntaxException;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.utils.gi */
public final class C80495gi {

    /* renamed from: a */
    static final AbstractC89244h f180090a = C89250i.m154773a((AbstractC89171a) C80500e.f180099a);

    /* renamed from: b */
    private static final AbstractC89244h f180091b = C89250i.m154773a((AbstractC89171a) C80498c.f180097a);

    /* renamed from: c */
    private static final AbstractC89244h f180092c = C89250i.m154773a((AbstractC89171a) C80499d.f180098a);

    /* renamed from: d */
    private static final AbstractC89244h f180093d = C89250i.m154773a((AbstractC89171a) C80497b.f180096a);

    /* renamed from: e */
    private static final AbstractC89244h f180094e = C89250i.m154773a((AbstractC89171a) C80496a.f180095a);

    /* renamed from: com.ss.android.ugc.aweme.utils.gi$a */
    static final class C80496a extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        public static final C80496a f180095a = new C80496a();

        static {
            Covode.recordClassIndex(93769);
        }

        C80496a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            return C80495gi.m139520a("[a-zA-Z]+");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gi$b */
    static final class C80497b extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        public static final C80497b f180096a = new C80497b();

        static {
            Covode.recordClassIndex(93770);
        }

        C80497b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            return C80495gi.m139520a("[\\x21-\\x7E]+");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gi$c */
    static final class C80498c extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        public static final C80498c f180097a = new C80498c();

        static {
            Covode.recordClassIndex(93771);
        }

        C80498c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            return C80495gi.m139520a("[\\x00-\\x7F]+");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gi$d */
    static final class C80499d extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        public static final C80499d f180098a = new C80499d();

        static {
            Covode.recordClassIndex(93772);
        }

        C80499d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            return C80495gi.m139520a("[^\\x00-\\x7F]+");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gi$e */
    static final class C80500e extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        public static final C80500e f180099a = new C80500e();

        static {
            Covode.recordClassIndex(93773);
        }

        C80500e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            return C80495gi.m139520a("\\s+");
        }
    }

    static {
        Covode.recordClassIndex(93768);
    }

    /* renamed from: a */
    public static final C89350l m139520a(String str) {
        C89219l.m154721d(str, "");
        try {
            return new C89350l(str);
        } catch (PatternSyntaxException unused) {
            return null;
        }
    }
}
