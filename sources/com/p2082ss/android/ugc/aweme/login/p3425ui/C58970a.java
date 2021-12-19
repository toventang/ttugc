package com.p2082ss.android.ugc.aweme.login.p3425ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.login.ui.a */
public final class C58970a {

    /* renamed from: b */
    public static final AbstractC89244h f134211b = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C58972b.f134214a);

    /* renamed from: c */
    public static final C58971a f134212c = new C58971a((byte) 0);

    /* renamed from: a */
    public final AtomicBoolean f134213a = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$a */
    public static final class C58971a {
        static {
            Covode.recordClassIndex(69299);
        }

        /* renamed from: a */
        public static C58970a m108339a() {
            return (C58970a) C58970a.f134211b.getValue();
        }

        private C58971a() {
        }

        public /* synthetic */ C58971a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$b */
    static final class C58972b extends AbstractC89220m implements AbstractC89171a<C58970a> {

        /* renamed from: a */
        public static final C58972b f134214a = new C58972b();

        static {
            Covode.recordClassIndex(69300);
        }

        C58972b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C58970a invoke() {
            return new C58970a();
        }
    }

    /* renamed from: a */
    public final void mo96450a() {
        this.f134213a.set(false);
    }

    static {
        Covode.recordClassIndex(69298);
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$c */
    public static final class C58973c extends AbstractC89220m implements AbstractC89172b<C22027b, Boolean> {

        /* renamed from: a */
        public static final C58973c f134215a = new C58973c();

        static {
            Covode.recordClassIndex(69301);
        }

        C58973c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C22027b bVar) {
            C22027b bVar2 = bVar;
            C89219l.m154716b(bVar2, "");
            return Boolean.valueOf(C89219l.m154714a((Object) bVar2.f52037a, (Object) "x-tt-logid"));
        }
    }
}
