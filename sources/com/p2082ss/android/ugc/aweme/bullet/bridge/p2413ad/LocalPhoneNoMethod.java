package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22468e;
import com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22476c;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22477d;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod */
public final class LocalPhoneNoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public CountDownLatch f82508b;

    /* renamed from: c */
    public C34977b f82509c;

    /* renamed from: d */
    private final String f82510d = "localPhoneNo";

    /* renamed from: e */
    private final AbstractC89244h f82511e = C89250i.m154773a((AbstractC89171a) C34985g.f82534a);

    /* renamed from: f */
    private C34976a f82512f;

    /* renamed from: g */
    private final AbstractC89244h f82513g = C89250i.m154773a((AbstractC89171a) C34980c.f82526a);

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$a */
    public static final class C34976a {
        @AbstractC27891c(mo46611a = "getMask")

        /* renamed from: a */
        public Integer f82514a;
        @AbstractC27891c(mo46611a = "getToken")

        /* renamed from: b */
        public Integer f82515b;

        static {
            Covode.recordClassIndex(42034);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$b */
    public static final class C34977b {

        /* renamed from: h */
        public static final C34978a f82516h = new C34978a((byte) 0);

        /* renamed from: a */
        public String f82517a;

        /* renamed from: b */
        public volatile int f82518b = 1;

        /* renamed from: c */
        public volatile int f82519c;

        /* renamed from: d */
        public volatile int f82520d;

        /* renamed from: e */
        public volatile int f82521e;

        /* renamed from: f */
        public volatile String f82522f;

        /* renamed from: g */
        public volatile String f82523g;

        /* renamed from: i */
        private final AbstractC89244h f82524i = C89250i.m154773a((AbstractC89171a) C34979b.f82525a);

        static {
            Covode.recordClassIndex(42035);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final JSONObject mo61878a() {
            return (JSONObject) this.f82524i.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$b$a */
        public static final class C34978a {
            static {
                Covode.recordClassIndex(42036);
            }

            private C34978a() {
            }

            public /* synthetic */ C34978a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$b$b */
        static final class C34979b extends AbstractC89220m implements AbstractC89171a<JSONObject> {

            /* renamed from: a */
            public static final C34979b f82525a = new C34979b();

            static {
                Covode.recordClassIndex(42037);
            }

            C34979b() {
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
        Covode.recordClassIndex(42033);
    }

    /* renamed from: g */
    private final AbstractC22468e m71496g() {
        return (AbstractC22468e) this.f82511e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82510d;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$c */
    static final class C34980c extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C34980c f82526a = new C34980c();

        static {
            Covode.recordClassIndex(42038);
        }

        C34980c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$g */
    static final class C34985g extends AbstractC89220m implements AbstractC89171a<AbstractC22468e> {

        /* renamed from: a */
        public static final C34985g f82534a = new C34985g();

        static {
            Covode.recordClassIndex(42043);
        }

        C34985g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC22468e invoke() {
            return C22477d.m42420a(AbstractC22468e.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$f */
    static final class RunnableC34983f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LocalPhoneNoMethod f82531a;

        /* renamed from: b */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82532b;

        static {
            Covode.recordClassIndex(42041);
        }

        RunnableC34983f(LocalPhoneNoMethod localPhoneNoMethod, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82531a = localPhoneNoMethod;
            this.f82532b = aVar;
        }

        public final void run() {
            LocalPhoneNoMethod.m71495b(this.f82531a).await();
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.LocalPhoneNoMethod.RunnableC34983f.RunnableC349841 */

                /* renamed from: a */
                final /* synthetic */ RunnableC34983f f82533a;

                static {
                    Covode.recordClassIndex(42042);
                }

                {
                    this.f82533a = r1;
                }

                public final void run() {
                    JSONObject a;
                    BaseBridgeMethod.AbstractC34965a aVar = this.f82533a.f82532b;
                    C34977b a2 = LocalPhoneNoMethod.m71494a(this.f82533a.f82531a);
                    if (a2.f82518b == 0) {
                        a = new JSONObject();
                        a.put("code", a2.f82518b);
                        String str = a2.f82517a;
                        if (str == null) {
                            C89219l.m154710a("from");
                        }
                        a.put("from", str);
                        a.put("tokenErrorCode", a2.f82519c);
                        a.put("maskErrorCode", a2.f82520d);
                        a.put("networkType", a2.f82521e);
                    } else {
                        a2.mo61878a().put("code", a2.f82518b);
                        JSONObject a3 = a2.mo61878a();
                        String str2 = a2.f82517a;
                        if (str2 == null) {
                            C89219l.m154710a("from");
                        }
                        a3.put("from", str2);
                        a = a2.mo61878a();
                    }
                    aVar.mo61874a(a);
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C34977b m71494a(LocalPhoneNoMethod localPhoneNoMethod) {
        C34977b bVar = localPhoneNoMethod.f82509c;
        if (bVar == null) {
            C89219l.m154710a("jsResponseBody");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CountDownLatch m71495b(LocalPhoneNoMethod localPhoneNoMethod) {
        CountDownLatch countDownLatch = localPhoneNoMethod.f82508b;
        if (countDownLatch == null) {
            C89219l.m154710a("countDownLatch");
        }
        return countDownLatch;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalPhoneNoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$d */
    public static final class C34981d implements AbstractC22475b {

        /* renamed from: a */
        final /* synthetic */ LocalPhoneNoMethod f82527a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f82528b;

        static {
            Covode.recordClassIndex(42039);
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34356a(C22476c cVar) {
            int i;
            Integer e;
            if (!this.f82528b.element) {
                this.f82528b.element = true;
                LocalPhoneNoMethod.m71494a(this.f82527a).f82518b = 0;
                C34977b a = LocalPhoneNoMethod.m71494a(this.f82527a);
                String str = cVar.f53132c;
                if (str == null || (e = C89361p.m154863e(str)) == null) {
                    i = -1;
                } else {
                    i = e.intValue();
                }
                a.f82520d = i;
                LocalPhoneNoMethod.m71495b(this.f82527a).countDown();
            }
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34355a(Bundle bundle) {
            String str;
            if (!this.f82528b.element) {
                this.f82528b.element = true;
                if (bundle != null) {
                    str = bundle.getString("security_phone");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    LocalPhoneNoMethod.m71494a(this.f82527a).f82518b = 0;
                } else {
                    C34977b a = LocalPhoneNoMethod.m71494a(this.f82527a);
                    a.f82523g = str;
                    a.mo61878a().put("phoneMask", str);
                }
                LocalPhoneNoMethod.m71495b(this.f82527a).countDown();
            }
        }

        C34981d(LocalPhoneNoMethod localPhoneNoMethod, C89233z.C89234a aVar) {
            this.f82527a = localPhoneNoMethod;
            this.f82528b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$e */
    public static final class C34982e implements AbstractC22475b {

        /* renamed from: a */
        final /* synthetic */ LocalPhoneNoMethod f82529a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f82530b;

        static {
            Covode.recordClassIndex(42040);
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34356a(C22476c cVar) {
            int i;
            Integer e;
            if (!this.f82530b.element) {
                this.f82530b.element = true;
                LocalPhoneNoMethod.m71494a(this.f82529a).f82518b = 0;
                C34977b a = LocalPhoneNoMethod.m71494a(this.f82529a);
                String str = cVar.f53132c;
                if (str == null || (e = C89361p.m154863e(str)) == null) {
                    i = -1;
                } else {
                    i = e.intValue();
                }
                a.f82519c = i;
                LocalPhoneNoMethod.m71495b(this.f82529a).countDown();
            }
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
        /* renamed from: a */
        public final void mo34355a(Bundle bundle) {
            String str;
            if (!this.f82530b.element) {
                this.f82530b.element = true;
                if (bundle != null) {
                    str = bundle.getString("access_token");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    LocalPhoneNoMethod.m71494a(this.f82529a).f82518b = 0;
                } else {
                    C34977b a = LocalPhoneNoMethod.m71494a(this.f82529a);
                    a.f82522f = str;
                    a.mo61878a().put("verifyToken", str);
                }
                LocalPhoneNoMethod.m71495b(this.f82529a).countDown();
            }
        }

        C34982e(LocalPhoneNoMethod localPhoneNoMethod, C89233z.C89234a aVar) {
            this.f82529a = localPhoneNoMethod;
            this.f82530b = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        String str;
        Integer num;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        Integer num4;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C34977b bVar = new C34977b();
        this.f82509c = bVar;
        AbstractC22468e g = m71496g();
        if (g == null || (str = g.mo36762a()) == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        bVar.f82517a = str;
        C34977b bVar2 = this.f82509c;
        if (bVar2 == null) {
            C89219l.m154710a("jsResponseBody");
        }
        bVar2.f82521e = m71496g().mo36763b();
        C34977b bVar3 = this.f82509c;
        if (bVar3 == null) {
            C89219l.m154710a("jsResponseBody");
        }
        if (bVar3.f82517a == null) {
            C89219l.m154710a("from");
        }
        Object a = ((C27910f) this.f82513g.getValue()).mo46670a(jSONObject.toString(), C34976a.class);
        C89219l.m154716b(a, "");
        C34976a aVar2 = (C34976a) a;
        C34977b bVar4 = this.f82509c;
        if (bVar4 == null) {
            C89219l.m154710a("jsResponseBody");
        }
        if ((aVar2.f82514a != null && (((num3 = aVar2.f82514a) == null || num3.intValue() != 1) && ((num4 = aVar2.f82514a) == null || num4.intValue() != 0))) || (aVar2.f82515b != null && (((num = aVar2.f82515b) == null || num.intValue() != 1) && ((num2 = aVar2.f82515b) == null || num2.intValue() != 0)))) {
            aVar2.f82514a = 0;
            aVar2.f82515b = 0;
            bVar4.f82518b = 0;
        }
        this.f82512f = aVar2;
        Integer num5 = aVar2.f82514a;
        if (num5 != null) {
            i = num5.intValue();
        } else {
            i = 0;
        }
        int i3 = i + 0;
        C34976a aVar3 = this.f82512f;
        if (aVar3 == null) {
            C89219l.m154710a("jsParams");
        }
        Integer num6 = aVar3.f82515b;
        if (num6 != null) {
            i2 = num6.intValue();
        } else {
            i2 = 0;
        }
        this.f82508b = new CountDownLatch(i3 + i2);
        C34976a aVar4 = this.f82512f;
        if (aVar4 == null) {
            C89219l.m154710a("jsParams");
        }
        Integer num7 = aVar4.f82514a;
        if (num7 != null && 1 == num7.intValue()) {
            C89233z.C89234a aVar5 = new C89233z.C89234a();
            aVar5.element = false;
            m71496g();
            new C34981d(this, aVar5);
        }
        C34976a aVar6 = this.f82512f;
        if (aVar6 == null) {
            C89219l.m154710a("jsParams");
        }
        Integer num8 = aVar6.f82515b;
        if (num8 != null && 1 == num8.intValue()) {
            C89233z.C89234a aVar7 = new C89233z.C89234a();
            aVar7.element = false;
            m71496g();
            new C34982e(this, aVar7);
        }
        new Thread(new RunnableC34983f(this, aVar)).start();
    }
}
