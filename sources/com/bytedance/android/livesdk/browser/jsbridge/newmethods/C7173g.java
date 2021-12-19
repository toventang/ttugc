package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdkapi.p674b.AbstractC11612b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.g */
public final class C7173g extends AbstractC18337f<JSONObject, JSONObject> implements AbstractC11612b {

    /* renamed from: a */
    public static final C7174a f17871a = new C7174a((byte) 0);

    /* renamed from: b */
    private int f17872b = 1;

    static {
        Covode.recordClassIndex(7919);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.g$a */
    public static final class C7174a {
        static {
            Covode.recordClassIndex(7920);
        }

        private C7174a() {
        }

        public /* synthetic */ C7174a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.p674b.AbstractC11612b
    /* renamed from: a */
    public final boolean mo13378a() {
        if (this.f17872b != 1) {
            return true;
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        this.f17872b = jSONObject2.optInt("setViewClosable", 1);
        return null;
    }
}
