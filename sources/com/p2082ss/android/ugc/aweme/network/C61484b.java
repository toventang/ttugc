package com.p2082ss.android.ugc.aweme.network;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.AbstractC22938d;
import com.bytedance.ttnet.p1701b.AbstractC22917a;
import com.p2082ss.android.ugc.aweme.net.p3490c.AbstractC61311a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.network.b */
public final class C61484b {

    /* renamed from: r */
    public static final C61485a f139571r = new C61485a((byte) 0);

    /* renamed from: a */
    public AbstractC22938d f139572a;

    /* renamed from: b */
    public AbstractC22917a f139573b;

    /* renamed from: c */
    public int f139574c;

    /* renamed from: d */
    public String f139575d;

    /* renamed from: e */
    public String f139576e;

    /* renamed from: f */
    public String f139577f;

    /* renamed from: g */
    public boolean f139578g;

    /* renamed from: h */
    public boolean f139579h;

    /* renamed from: i */
    public List<AbstractC22021a> f139580i = new ArrayList();

    /* renamed from: j */
    public AbstractC89171a<String> f139581j = C61487c.f139590a;

    /* renamed from: k */
    public AbstractC89171a<Integer> f139582k = C61489e.f139592a;

    /* renamed from: l */
    public AbstractC89171a<Integer> f139583l = C61486b.f139589a;

    /* renamed from: m */
    public AbstractC89171a<Boolean> f139584m = C61490f.f139593a;

    /* renamed from: n */
    public AbstractC89171a<Integer> f139585n = C61488d.f139591a;

    /* renamed from: o */
    public AbstractC61311a f139586o;

    /* renamed from: p */
    public final NetworkPartnerGroup f139587p = new NetworkPartnerGroup();

    /* renamed from: q */
    public final Application f139588q;

    /* renamed from: com.ss.android.ugc.aweme.network.b$c */
    static final class C61487c extends AbstractC89220m implements AbstractC89171a {

        /* renamed from: a */
        public static final C61487c f139590a = new C61487c();

        static {
            Covode.recordClassIndex(72144);
        }

        C61487c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(72141);
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$a */
    public static final class C61485a {
        static {
            Covode.recordClassIndex(72142);
        }

        private C61485a() {
        }

        public /* synthetic */ C61485a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$b */
    static final class C61486b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61486b f139589a = new C61486b();

        static {
            Covode.recordClassIndex(72143);
        }

        C61486b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$d */
    static final class C61488d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61488d f139591a = new C61488d();

        static {
            Covode.recordClassIndex(72145);
        }

        C61488d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$e */
    static final class C61489e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61489e f139592a = new C61489e();

        static {
            Covode.recordClassIndex(72146);
        }

        C61489e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return 10;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$f */
    static final class C61490f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61490f f139593a = new C61490f();

        static {
            Covode.recordClassIndex(72147);
        }

        C61490f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    public C61484b(Application application) {
        C89219l.m154721d(application, "");
        this.f139588q = application;
    }
}
