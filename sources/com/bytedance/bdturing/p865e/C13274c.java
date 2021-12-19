package com.bytedance.bdturing.p865e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.bdturing.e.c */
public final class C13274c {

    /* renamed from: a */
    public static final JSONObject f32457a;

    /* renamed from: b */
    public static final C13274c f32458b = new C13274c();

    /* renamed from: c */
    private static final AbstractC89244h f32459c;

    /* renamed from: com.bytedance.bdturing.e.c$a */
    static final class C13275a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C13275a f32460a = new C13275a();

        static {
            Covode.recordClassIndex(15237);
        }

        C13275a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "{\n    \"common\": {\n        \"period\": 300000, \n        \"alpha\": \"0.5\",\n        \"retry_count\":3,\n        \"retry_interval\":2000,\n        \"rgb\": \"000000\",\n        \"skip_launch\":0, \n        \"use_jsb_request\":0, \n        \"pre_create\":0,\n        \"request_encrypt\":0, \n        \"host\": {\n            \"va\": \"https://vcs-va.byteoversea.com/\",\n            \"sg\": \"https://vcs-sg.byteoversea.com/\",\n            \"in\":\"https://vcs-va-useast2a.byteoversea.com/\"\n        },\n        \"back_up_host\": {\n            \"va\": \"https://vcs-va.byteoversea.com/\",\n            \"sg\": \"https://vcs-sg.byteoversea.com/\",\n            \"in\":\"https://vcs-va-useast2a.byteoversea.com/\"\n        }\n    },\n    \"verify\": {\n        \"host\": {\n            \"va\": \"https://verification-va.byteoversea.com/\",\n            \"sg\": \"https://verify-sg.byteoversea.com/\",\n            \"in\":\"https://verification-va-useast2a.byteoversea.com/\"\n        },\n        \"url\": {\n            \"va\": \"https://sf16-scmcdn-va.ibytedtos.com/obj/static-us/secsdk-captcha/va/2.21.2/index.html\",\n            \"sg\": \"https://sf16-scmcdn-sg.ibytedtos.com/obj/static-sg/secsdk-captcha/sg/2.21.2/index.html\",\n            \"in\": \"https://sf16-scmcdn-useast2a.ibytedtos.com/obj/static-aiso/secsdk-captcha/in/2.21.2/index.html\"\n        },\n      \"height\": 303,\n      \"width\": 300\n    }\n}";
        }
    }

    private C13274c() {
    }

    static {
        Covode.recordClassIndex(15236);
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C13275a.f32460a);
        f32459c = a;
        f32457a = new JSONObject((String) a.getValue());
    }
}
