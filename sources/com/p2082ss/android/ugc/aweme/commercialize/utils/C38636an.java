package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.android.gms.common.C25501d;
import com.google.android.gms.common.C25502e;
import com.google.android.gms.p1930a.p1931a.C25248a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import java.io.IOException;
import java.util.concurrent.Callable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.an */
public final class C38636an {

    /* renamed from: a */
    public static boolean f91296a = true;

    /* renamed from: b */
    public static volatile boolean f91297b;

    /* renamed from: c */
    public static final AbstractC89244h f91298c = C89250i.m154773a((AbstractC89171a) C38639c.f91302a);

    /* renamed from: d */
    public static final C38636an f91299d = new C38636an();

    private C38636an() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.an$c */
    static final class C38639c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C38639c f91302a = new C38639c();

        static {
            Covode.recordClassIndex(46180);
        }

        C38639c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!C38669b.m78459a(C17867d.m33078a()));
        }
    }

    static {
        Covode.recordClassIndex(46177);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.an$a */
    public static final class CallableC38637a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC38637a f91300a = new CallableC38637a();

        static {
            Covode.recordClassIndex(46178);
        }

        CallableC38637a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            try {
                C25248a.C25249a a = C25248a.m48579a(C17867d.m33078a());
                if (a != null) {
                    z = a.f59858b;
                } else {
                    z = true;
                }
                C38636an.f91296a = z;
            } catch (IOException unused) {
            } catch (C25501d unused2) {
            } catch (IllegalStateException unused3) {
            } catch (C25502e unused4) {
            } finally {
                C38636an.f91297b = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.an$b */
    public static final class CallableC38638b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC38638b f91301a = new CallableC38638b();

        static {
            Covode.recordClassIndex(46179);
        }

        CallableC38638b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            try {
                C25248a.C25249a a = C25248a.m48579a(C17867d.m33078a());
                if (a != null) {
                    z = a.f59858b;
                } else {
                    z = true;
                }
                C38636an.f91296a = z;
            } catch (IOException unused) {
            } catch (C25501d unused2) {
            } catch (IllegalStateException unused3) {
            } catch (C25502e unused4) {
            } finally {
                C38636an.f91297b = true;
            }
            return C89391z.f203057a;
        }
    }
}
