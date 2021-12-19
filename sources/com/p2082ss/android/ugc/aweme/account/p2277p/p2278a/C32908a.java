package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22468e;
import com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22476c;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22477d;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.a */
public final class C32908a implements AbstractC18293d {

    /* renamed from: a */
    public CountDownLatch f78299a;

    /* renamed from: b */
    public C32910b f78300b;

    /* renamed from: c */
    public final WeakReference<Context> f78301c;

    /* renamed from: d */
    public final C18288a f78302d;

    /* renamed from: e */
    private final AbstractC89244h f78303e = C89250i.m154773a((AbstractC89171a) C32918g.f78326a);

    /* renamed from: f */
    private C32909a f78304f;

    /* renamed from: g */
    private final AbstractC89244h f78305g = C89250i.m154773a((AbstractC89171a) C32917f.f78325a);

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$a */
    public static final class C32909a {
        @AbstractC27891c(mo46611a = "getMask")

        /* renamed from: a */
        public Integer f78306a;
        @AbstractC27891c(mo46611a = "getToken")

        /* renamed from: b */
        public Integer f78307b;

        static {
            Covode.recordClassIndex(39697);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$b */
    public static final class C32910b {

        /* renamed from: h */
        public static final C32911a f78308h = new C32911a((byte) 0);

        /* renamed from: a */
        public String f78309a;

        /* renamed from: b */
        public volatile int f78310b = 1;

        /* renamed from: c */
        public volatile int f78311c;

        /* renamed from: d */
        public volatile int f78312d;

        /* renamed from: e */
        public volatile int f78313e;

        /* renamed from: f */
        public volatile String f78314f;

        /* renamed from: g */
        public volatile String f78315g;

        /* renamed from: i */
        private final AbstractC89244h f78316i = C89250i.m154773a((AbstractC89171a) C32912b.f78317a);

        static {
            Covode.recordClassIndex(39698);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo58693a() {
            return (JSONObject) this.f78316i.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$b$a */
        public static final class C32911a {
            static {
                Covode.recordClassIndex(39699);
            }

            private C32911a() {
            }

            public /* synthetic */ C32911a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$b$b */
        static final class C32912b extends AbstractC89220m implements AbstractC89171a<JSONObject> {

            /* renamed from: a */
            public static final C32912b f78317a = new C32912b();

            static {
                Covode.recordClassIndex(39700);
            }

            C32912b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ JSONObject invoke() {
                return new JSONObject();
            }
        }
    }

    static {
        Covode.recordClassIndex(39696);
    }

    /* renamed from: a */
    private final AbstractC22468e m67543a() {
        return (AbstractC22468e) this.f78303e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$f */
    static final class C32917f extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C32917f f78325a = new C32917f();

        static {
            Covode.recordClassIndex(39705);
        }

        C32917f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$g */
    static final class C32918g extends AbstractC89220m implements AbstractC89171a<AbstractC22468e> {

        /* renamed from: a */
        public static final C32918g f78326a = new C32918g();

        static {
            Covode.recordClassIndex(39706);
        }

        C32918g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC22468e invoke() {
            return C22477d.m42420a(AbstractC22468e.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$e */
    static final class RunnableC32915e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32908a f78322a;

        /* renamed from: b */
        final /* synthetic */ C18297h f78323b;

        static {
            Covode.recordClassIndex(39703);
        }

        RunnableC32915e(C32908a aVar, C18297h hVar) {
            this.f78322a = aVar;
            this.f78323b = hVar;
        }

        public final void run() {
            C32908a.m67545b(this.f78322a).await();
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.account.p2277p.p2278a.C32908a.RunnableC32915e.RunnableC329161 */

                /* renamed from: a */
                final /* synthetic */ RunnableC32915e f78324a;

                static {
                    Covode.recordClassIndex(39704);
                }

                {
                    this.f78324a = r1;
                }

                public final void run() {
                    JSONObject a;
                    C32908a aVar = this.f78324a.f78322a;
                    String str = this.f78324a.f78323b.f43669b;
                    C89219l.m154716b(str, "");
                    C32910b a2 = C32908a.m67544a(this.f78324a.f78322a);
                    if (a2.f78310b == 0) {
                        a = new JSONObject();
                        a.put("code", a2.f78310b);
                        String str2 = a2.f78309a;
                        if (str2 == null) {
                            C89219l.m154710a("from");
                        }
                        a.put("from", str2);
                        a.put("tokenErrorCode", a2.f78311c);
                        a.put("maskErrorCode", a2.f78312d);
                        a.put("networkType", a2.f78313e);
                    } else {
                        a2.mo58693a().put("code", a2.f78310b);
                        JSONObject a3 = a2.mo58693a();
                        String str3 = a2.f78309a;
                        if (str3 == null) {
                            C89219l.m154710a("from");
                        }
                        a3.put("from", str3);
                        a = a2.mo58693a();
                    }
                    aVar.f78302d.mo29249a(str, a);
                }
            });
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ CountDownLatch m67545b(C32908a aVar) {
        CountDownLatch countDownLatch = aVar.f78299a;
        if (countDownLatch == null) {
            C89219l.m154710a("countDownLatch");
        }
        return countDownLatch;
    }

    /* renamed from: a */
    public static final /* synthetic */ C32910b m67544a(C32908a aVar) {
        C32910b bVar = aVar.f78300b;
        if (bVar == null) {
            C89219l.m154710a("jsResponseBody");
        }
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$c */
    public static final class C32913c implements AbstractC22475b {

        /* renamed from: a */
        final /* synthetic */ C32908a f78318a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f78319b;

        static {
            Covode.recordClassIndex(39701);
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34356a(C22476c cVar) {
            int i;
            Integer e;
            if (!this.f78319b.element) {
                this.f78319b.element = true;
                C32908a.m67544a(this.f78318a).f78310b = 0;
                C32910b a = C32908a.m67544a(this.f78318a);
                String str = cVar.f53132c;
                if (str == null || (e = C89361p.m154863e(str)) == null) {
                    i = -1;
                } else {
                    i = e.intValue();
                }
                a.f78312d = i;
                C32908a.m67545b(this.f78318a).countDown();
            }
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34355a(Bundle bundle) {
            String str;
            if (!this.f78319b.element) {
                this.f78319b.element = true;
                if (bundle != null) {
                    str = bundle.getString("security_phone");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    C32908a.m67544a(this.f78318a).f78310b = 0;
                } else {
                    C32910b a = C32908a.m67544a(this.f78318a);
                    a.f78315g = str;
                    a.mo58693a().put("phoneMask", str);
                }
                C32908a.m67545b(this.f78318a).countDown();
            }
        }

        C32913c(C32908a aVar, C89233z.C89234a aVar2) {
            this.f78318a = aVar;
            this.f78319b = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$d */
    public static final class C32914d implements AbstractC22475b {

        /* renamed from: a */
        final /* synthetic */ C32908a f78320a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f78321b;

        static {
            Covode.recordClassIndex(39702);
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34356a(C22476c cVar) {
            int i;
            Integer e;
            if (!this.f78321b.element) {
                this.f78321b.element = true;
                C32908a.m67544a(this.f78320a).f78310b = 0;
                C32910b a = C32908a.m67544a(this.f78320a);
                String str = cVar.f53132c;
                if (str == null || (e = C89361p.m154863e(str)) == null) {
                    i = -1;
                } else {
                    i = e.intValue();
                }
                a.f78311c = i;
                C32908a.m67545b(this.f78320a).countDown();
            }
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34355a(Bundle bundle) {
            String str;
            if (!this.f78321b.element) {
                this.f78321b.element = true;
                if (bundle != null) {
                    str = bundle.getString("access_token");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    C32908a.m67544a(this.f78320a).f78310b = 0;
                } else {
                    C32910b a = C32908a.m67544a(this.f78320a);
                    a.f78314f = str;
                    a.mo58693a().put("verifyToken", str);
                }
                C32908a.m67545b(this.f78320a).countDown();
            }
        }

        C32914d(C32908a aVar, C89233z.C89234a aVar2) {
            this.f78320a = aVar;
            this.f78321b = aVar2;
        }
    }

    public C32908a(WeakReference<Context> weakReference, C18288a aVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        this.f78301c = weakReference;
        this.f78302d = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        String str;
        Integer num;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        Integer num4;
        C89219l.m154721d(hVar, "");
        hVar.f43676i = false;
        C32910b bVar = new C32910b();
        this.f78300b = bVar;
        AbstractC22468e a = m67543a();
        if (a == null || (str = a.mo36762a()) == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        bVar.f78309a = str;
        C32910b bVar2 = this.f78300b;
        if (bVar2 == null) {
            C89219l.m154710a("jsResponseBody");
        }
        bVar2.f78313e = m67543a().mo36763b();
        C32910b bVar3 = this.f78300b;
        if (bVar3 == null) {
            C89219l.m154710a("jsResponseBody");
        }
        if (bVar3.f78309a == null) {
            C89219l.m154710a("from");
        }
        Object a2 = ((C27910f) this.f78305g.getValue()).mo46670a(hVar.f43671d.toString(), C32909a.class);
        C89219l.m154716b(a2, "");
        C32909a aVar = (C32909a) a2;
        C32910b bVar4 = this.f78300b;
        if (bVar4 == null) {
            C89219l.m154710a("jsResponseBody");
        }
        if ((aVar.f78306a != null && (((num3 = aVar.f78306a) == null || num3.intValue() != 1) && ((num4 = aVar.f78306a) == null || num4.intValue() != 0))) || (aVar.f78307b != null && (((num = aVar.f78307b) == null || num.intValue() != 1) && ((num2 = aVar.f78307b) == null || num2.intValue() != 0)))) {
            aVar.f78306a = 0;
            aVar.f78307b = 0;
            bVar4.f78310b = 0;
        }
        this.f78304f = aVar;
        Integer num5 = aVar.f78306a;
        if (num5 != null) {
            i = num5.intValue();
        } else {
            i = 0;
        }
        int i3 = i + 0;
        C32909a aVar2 = this.f78304f;
        if (aVar2 == null) {
            C89219l.m154710a("jsParams");
        }
        Integer num6 = aVar2.f78307b;
        if (num6 != null) {
            i2 = num6.intValue();
        } else {
            i2 = 0;
        }
        this.f78299a = new CountDownLatch(i3 + i2);
        C32909a aVar3 = this.f78304f;
        if (aVar3 == null) {
            C89219l.m154710a("jsParams");
        }
        Integer num7 = aVar3.f78306a;
        if (num7 != null && 1 == num7.intValue()) {
            C89233z.C89234a aVar4 = new C89233z.C89234a();
            aVar4.element = false;
            m67543a();
            new C32913c(this, aVar4);
        }
        C32909a aVar5 = this.f78304f;
        if (aVar5 == null) {
            C89219l.m154710a("jsParams");
        }
        Integer num8 = aVar5.f78307b;
        if (num8 != null && 1 == num8.intValue()) {
            C89233z.C89234a aVar6 = new C89233z.C89234a();
            aVar6.element = false;
            m67543a();
            new C32914d(this, aVar6);
        }
        new Thread(new RunnableC32915e(this, hVar)).start();
    }
}
