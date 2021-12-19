package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8806a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bb */
public final class C7116bb extends AbstractC18334e<JSONObject, JSONObject> {

    /* renamed from: a */
    private String f17735a;

    /* renamed from: b */
    private final AbstractC8806a f17736b = new C7117a(this);

    static {
        Covode.recordClassIndex(7862);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bb$a */
    public static final class C7117a implements AbstractC8806a {

        /* renamed from: a */
        final /* synthetic */ C7116bb f17737a;

        static {
            Covode.recordClassIndex(7863);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7117a(C7116bb bbVar) {
            this.f17737a = bbVar;
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8806a
        /* renamed from: a */
        public final void mo13365a(Throwable th) {
            C89219l.m154721d(th, "");
            this.f17737a.mo13363a(th);
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8806a
        /* renamed from: a */
        public final void mo13364a(C8859w wVar) {
            C89219l.m154721d(wVar, "");
            if (C13617h.m24465a(wVar.f21794o)) {
                this.f17737a.mo13363a(new AssertionError());
            } else {
                this.f17737a.mo13362a(wVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo13363a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            if (th instanceof C2908a) {
                jSONObject.put("error_code", ((C2908a) th).getErrorCode());
            }
            finishWithResult(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0151, code lost:
        if (r7 == false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0144  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13362a(com.bytedance.android.livesdk.gift.model.C8859w r11) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7116bb.mo13362a(com.bytedance.android.livesdk.gift.model.w):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        long optLong = jSONObject2.optLong("gift_id");
        int optInt = jSONObject2.optInt("gift_count");
        this.f17735a = jSONObject2.optString("gift_type");
        if (optLong <= 0 || optInt <= 0) {
            mo13363a(new IllegalArgumentException());
        } else {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).sendGiftInternal(optLong, optInt, this.f17736b);
        }
    }
}
