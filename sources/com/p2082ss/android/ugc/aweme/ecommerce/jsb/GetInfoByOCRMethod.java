package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p157c.AbstractC2767b;
import com.bytedance.android.ecommerce.p157c.AbstractC2768c;
import com.bytedance.android.ecommerce.p159e.AbstractC2780d;
import com.bytedance.android.ecommerce.p163i.AbstractC2801b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.nio.charset.Charset;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod */
public final class GetInfoByOCRMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C44539a f103932a = new C44539a((byte) 0);

    static {
        Covode.recordClassIndex(52890);
    }

    private GetInfoByOCRMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a */
    public static final class C44539a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$d */
        public final /* synthetic */ class C44545d implements AbstractC2801b {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89183m f103943a;

            static {
                Covode.recordClassIndex(52897);
            }

            C44545d(AbstractC89183m mVar) {
                this.f103943a = mVar;
            }

            @Override // com.bytedance.android.ecommerce.p163i.AbstractC2801b
            /* renamed from: a */
            public final /* synthetic */ void mo7380a(String str, JSONObject jSONObject) {
                C89219l.m154716b(this.f103943a.invoke(str, jSONObject), "");
            }
        }

        static {
            Covode.recordClassIndex(52891);
        }

        private C44539a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$b */
        public static final class C44541b implements AbstractC2767b {

            /* renamed from: a */
            final /* synthetic */ JSONObject f103934a;

            /* renamed from: b */
            final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f103935b;

            /* renamed from: c */
            final /* synthetic */ BaseBridgeMethod.AbstractC34965a f103936c;

            static {
                Covode.recordClassIndex(52893);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$b$a */
            static final class RunnableC44542a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C44541b f103937a;

                static {
                    Covode.recordClassIndex(52894);
                }

                RunnableC44542a(C44541b bVar) {
                    this.f103937a = bVar;
                }

                public final void run() {
                    C44539a.m87272a(this.f103937a.f103934a, this.f103937a.f103935b, this.f103937a.f103936c);
                }
            }

            @Override // com.bytedance.android.ecommerce.p157c.AbstractC2767b
            /* renamed from: a */
            public final void mo7351a() {
                new Handler(Looper.getMainLooper()).post(new RunnableC44542a(this));
            }

            C44541b(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar, BaseBridgeMethod.AbstractC34965a aVar2) {
                this.f103934a = jSONObject;
                this.f103935b = aVar;
                this.f103936c = aVar2;
            }
        }

        public /* synthetic */ C44539a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$a */
        public static final /* synthetic */ class C44540a extends C89217j implements AbstractC89183m<String, JSONObject, C89391z> {

            /* renamed from: a */
            public static final C44540a f103933a = new C44540a();

            static {
                Covode.recordClassIndex(52892);
            }

            C44540a() {
                super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Lorg/json/JSONObject;)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(String str, JSONObject jSONObject) {
                C39162r.m79461a(str, jSONObject);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$c */
        public static final class C44543c implements AbstractC2768c {

            /* renamed from: a */
            final /* synthetic */ JSONObject f103938a;

            /* renamed from: b */
            final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f103939b;

            /* renamed from: c */
            final /* synthetic */ BaseBridgeMethod.AbstractC34965a f103940c;

            static {
                Covode.recordClassIndex(52895);
            }

            C44543c(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar, BaseBridgeMethod.AbstractC34965a aVar2) {
                this.f103938a = jSONObject;
                this.f103939b = aVar;
                this.f103940c = aVar2;
            }

            @Override // com.bytedance.android.ecommerce.p157c.AbstractC2769d
            /* renamed from: a */
            public final void mo7348a(int i, int i2, String str, C2740b bVar) {
                String str2;
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put("detail_code", i2);
                jSONObject.put("message", str);
                jSONObject.put("code", i);
                if (bVar == null || (str2 = bVar.f8198h) == null) {
                    str2 = "";
                }
                jSONObject.put("number", str2);
                if (!(bVar == null || bVar.f8204n == null)) {
                    byte[] encode = Base64.encode(bVar.mo7323a(), 0);
                    C89219l.m154716b(encode, "");
                    Charset defaultCharset = Charset.defaultCharset();
                    C89219l.m154716b(defaultCharset, "");
                    jSONObject.put("image_str", new String(encode, defaultCharset));
                }
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod.C44539a.C44543c.RunnableC445441 */

                    /* renamed from: a */
                    final /* synthetic */ C44543c f103941a;

                    static {
                        Covode.recordClassIndex(52896);
                    }

                    {
                        this.f103941a = r1;
                    }

                    public final void run() {
                        BaseCommonJavaMethod.AbstractC47813a aVar = this.f103941a.f103939b;
                        if (aVar != null) {
                            aVar.mo79888a(jSONObject);
                        }
                        BaseBridgeMethod.AbstractC34965a aVar2 = this.f103941a.f103940c;
                        if (aVar2 != null) {
                            aVar2.mo61874a(jSONObject);
                        }
                    }
                });
            }
        }

        /* renamed from: b */
        public static void m87273b(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar, BaseBridgeMethod.AbstractC34965a aVar2) {
            if (jSONObject == null) {
                return;
            }
            if (!C2732a.f8145a.mo7362a()) {
                m87274c(jSONObject, aVar, aVar2);
            } else {
                m87272a(jSONObject, aVar, aVar2);
            }
        }

        /* renamed from: a */
        public static JSONObject m87272a(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar, BaseBridgeMethod.AbstractC34965a aVar2) {
            AbstractC2780d dVar = C2732a.f8145a;
            C2732a.f8145a.mo7365c(jSONObject.optString("nonce"));
            C2732a.f8145a.mo7366d(jSONObject.optString("merchant_user_id"));
            dVar.mo7361a(jSONObject.optString("merchant_id"), new C44543c(jSONObject, aVar, aVar2));
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m87274c(org.json.JSONObject r4, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a r5, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a r6) {
            /*
                boolean r0 = com.p2082ss.android.ugc.aweme.language.C58071d.m104909c()
                if (r0 != 0) goto L_0x0053
                java.lang.String r3 = "https://f-p-va.isnssdk.com"
            L_0x0008:
                com.bytedance.android.ecommerce.e.a$a r2 = new com.bytedance.android.ecommerce.e.a$a
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                r2.<init>(r0)
                com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$a r1 = com.p2082ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod.C44539a.C44540a.f103933a
                if (r1 == 0) goto L_0x001b
                com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$d r0 = new com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$d
                r0.<init>(r1)
                r1 = r0
            L_0x001b:
                com.bytedance.android.ecommerce.i.b r1 = (com.bytedance.android.ecommerce.p163i.AbstractC2801b) r1
                r2.f8345l = r1
                java.lang.String r0 = "merchant_user_id"
                java.lang.String r0 = r4.optString(r0)
                r2.f8352s = r0
                java.lang.String r0 = "nonce"
                java.lang.String r0 = r4.optString(r0)
                r2.f8351r = r0
                com.ss.android.ugc.aweme.ecommerce.combinepayment.a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.a
                r0.<init>()
                r2.f8347n = r0
                com.ss.android.ugc.aweme.setting.services.ISettingService r0 = com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl.m120782v()
                java.lang.String r0 = r0.mo108872h()
                r2.f8346m = r0
                r2.f8335b = r3
                com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$b r0 = new com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$b
                r0.<init>(r4, r5, r6)
                r2.f8353t = r0
                com.bytedance.android.ecommerce.e.a r1 = r2.mo7355a()
                com.bytedance.android.ecommerce.e.d r0 = com.bytedance.android.ecommerce.C2732a.f8145a
                r0.mo7360a(r1)
                return
            L_0x0053:
                java.lang.String r3 = "https://f-p.sgsnssdk.com"
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod.C44539a.m87274c(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
        }
    }

    private /* synthetic */ GetInfoByOCRMethod() {
        this((C18288a) null);
    }

    public GetInfoByOCRMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C44539a.m87273b(jSONObject, aVar, null);
    }
}
