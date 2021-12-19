package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p379n.C5793y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6315c;
import com.bytedance.android.live.wallet.AbstractC6360g;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.C11318g;
import com.bytedance.android.livesdk.wallet.p657a.C11310a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ay */
public final class C7107ay extends AbstractC18334e<JSONObject, Object> {

    /* renamed from: l */
    public static final C7108a f17711l = new C7108a((byte) 0);

    /* renamed from: a */
    public AbstractC6315c f17712a;

    /* renamed from: b */
    public AbstractC6360g f17713b;

    /* renamed from: c */
    public C11314c f17714c;

    /* renamed from: d */
    public C11314c f17715d;

    /* renamed from: e */
    public String f17716e = "";

    /* renamed from: f */
    public String f17717f = "";

    /* renamed from: g */
    public String f17718g = "";

    /* renamed from: h */
    public String f17719h = "";

    /* renamed from: i */
    public boolean f17720i;

    /* renamed from: j */
    public String f17721j = "";

    /* renamed from: k */
    public String f17722k = "";

    static {
        Covode.recordClassIndex(7853);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ay$a */
    public static final class C7108a {
        static {
            Covode.recordClassIndex(7854);
        }

        private C7108a() {
        }

        public /* synthetic */ C7108a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo13360a() {
        AbstractC6315c cVar = this.f17712a;
        if (cVar != null) {
            cVar.mo12355b(this.f17713b);
        }
        this.f17712a = null;
    }

    /* renamed from: a */
    public final void mo13361a(Object obj) {
        String str;
        C6501b a = C6501b.C6502a.m13948a("livesdk_subscription_purchase_successfully").mo12639a().mo12651a("subscribe_type", this.f17721j);
        if (this.f17720i) {
            str = "coins";
        } else {
            str = "IAP";
        }
        a.mo12651a("payment_method", str).mo12655b();
        if (!(obj instanceof SubscribeBadge)) {
            obj = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 1);
        if (obj != null) {
            DataChannelGlobal.f42558d.mo28325b(C5793y.class, obj);
        }
        finishWithRawResult(jSONObject);
        mo13360a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        AbstractC2953a a = C6193a.m13435a(IWalletService.class);
        C89219l.m154716b(a, "");
        this.f17712a = ((IWalletService) a).getPipoPayHelper();
        int optInt = jSONObject2.optInt("action", -1);
        C7109b bVar = new C7109b(this, optInt, gVar);
        this.f17713b = bVar;
        AbstractC6315c cVar = this.f17712a;
        if (cVar != null) {
            cVar.mo12351a(bVar);
        }
        if (optInt == 1) {
            String optString = jSONObject2.optString("subscribe_id");
            C89219l.m154716b(optString, "");
            this.f17716e = optString;
            String optString2 = jSONObject2.optString("single_purchase_id");
            C89219l.m154716b(optString2, "");
            this.f17717f = optString2;
            AbstractC6315c cVar2 = this.f17712a;
            if (cVar2 != null) {
                cVar2.mo12354a(C89070n.m154516a(optString2));
            }
            AbstractC6315c cVar3 = this.f17712a;
            if (cVar3 != null) {
                cVar3.mo12356b(C89070n.m154516a(this.f17716e));
            }
        } else if (optInt == 2) {
            String optString3 = jSONObject2.optString("subscribe_type");
            C89219l.m154716b(optString3, "");
            this.f17721j = optString3;
            if (gVar.f43859a instanceof Activity) {
                this.f17720i = false;
                String optString4 = jSONObject2.optString("to_uid");
                C89219l.m154716b(optString4, "");
                this.f17718g = optString4;
                AbstractC6315c cVar4 = this.f17712a;
                if (cVar4 != null) {
                    String optString5 = jSONObject2.optString("product_id");
                    C89219l.m154716b(optString5, "");
                    String optString6 = jSONObject2.optString("sku_name");
                    C89219l.m154716b(optString6, "");
                    ActivityC0945e a2 = C11279p.m20001a(gVar.f43859a);
                    if (a2 == null) {
                        C89219l.m154715b();
                    }
                    cVar4.mo12353a(optString4, optString5, optString6, a2);
                }
            }
        } else if (optInt == 3) {
            String optString7 = jSONObject2.optString("subscribe_type");
            C89219l.m154716b(optString7, "");
            this.f17721j = optString7;
            this.f17720i = true;
            String optString8 = jSONObject2.optString("to_uid");
            C89219l.m154716b(optString8, "");
            this.f17718g = optString8;
            AbstractC6315c cVar5 = this.f17712a;
            if (cVar5 != null) {
                String optString9 = jSONObject2.optString("contract_id");
                C89219l.m154716b(optString9, "");
                cVar5.mo12352a(optString8, optString9);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ay$b */
    public static final class C7109b implements AbstractC6360g {

        /* renamed from: a */
        final /* synthetic */ C7107ay f17723a;

        /* renamed from: b */
        final /* synthetic */ int f17724b;

        /* renamed from: c */
        final /* synthetic */ C18338g f17725c;

        static {
            Covode.recordClassIndex(7855);
        }

        @Override // com.bytedance.android.live.wallet.AbstractC6360g
        /* renamed from: a */
        public final void mo12414a(int i, Object obj) {
            C11314c cVar;
            AbstractC6315c cVar2;
            int i2 = this.f17724b;
            if (i2 == 1) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.wallet.Diamond>");
                List list = (List) obj;
                if (i == 1) {
                    this.f17723a.f17715d = (C11314c) list.get(0);
                } else if (i == 4) {
                    this.f17723a.f17714c = (C11314c) list.get(0);
                }
                C11314c cVar3 = this.f17723a.f17715d;
                if (cVar3 != null && (cVar = this.f17723a.f17714c) != null) {
                    C7107ay ayVar = this.f17723a;
                    C89219l.m154716b(this.f17725c.f43859a, "");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 1);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("currency", cVar3.f27061g);
                    jSONObject2.put("price", cVar3.f27057c);
                    jSONObject2.put("price_amount_micros", cVar3.f27062h);
                    jSONObject2.put("sku_name", cVar3.f27063i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("currency", cVar.f27061g);
                    jSONObject3.put("price", cVar.f27057c);
                    jSONObject3.put("price_amount_micros", cVar.f27062h);
                    jSONObject3.put("sku_name", cVar.f27063i);
                    jSONObject.put(ayVar.f17717f, jSONObject2);
                    jSONObject.put(ayVar.f17716e, jSONObject3);
                    ayVar.finishWithRawResult(jSONObject);
                    ayVar.mo13360a();
                }
            } else if (i2 != 2) {
                if (i2 == 3 && i == 3) {
                    this.f17723a.mo13361a(obj);
                }
            } else if (i == 2) {
                String str = this.f17723a.f17719h;
                if (str != null && (cVar2 = this.f17723a.f17712a) != null) {
                    cVar2.mo12352a(this.f17723a.f17718g, str);
                }
            } else if (i == 3) {
                this.f17723a.mo13361a(obj);
            } else if (i == 5) {
                C7107ay ayVar2 = this.f17723a;
                if (!(obj instanceof String)) {
                    obj = null;
                }
                ayVar2.f17719h = (String) obj;
            }
        }

        C7109b(C7107ay ayVar, int i, C18338g gVar) {
            this.f17723a = ayVar;
            this.f17724b = i;
            this.f17725c = gVar;
        }

        @Override // com.bytedance.android.live.wallet.AbstractC6360g
        /* renamed from: a */
        public final void mo12413a(int i, int i2, int i3, Exception exc, C11318g gVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            if ((this.f17725c.f43859a instanceof Activity) && (i == 2 || i == 3)) {
                String str = "";
                if (exc instanceof C2912a) {
                    switch (((C2908a) exc).getErrorCode()) {
                        case 4025001:
                            str = "reach_Limit";
                            break;
                        case 4025002:
                            str = "risk";
                            break;
                    }
                } else if (i2 == 203) {
                    str = "google-apple";
                } else if (i2 == 206) {
                    str = "cancel";
                }
                ((IWalletService) C6193a.m13435a(IWalletService.class)).handleExceptionForAll(new C11310a(i, i2, i3, exc, false, str, 0, true), C11279p.m20001a(this.f17725c.f43859a));
                C6501b.C6502a.m13948a("livesdk_subscribe_failed").mo12651a("failed_reason", str).mo12639a().mo12655b();
            } else if (i == 1 || i == 4) {
                jSONObject.put("message", this.f17725c.f43859a.getString(R.string.en1));
            }
            this.f17723a.finishWithRawResult(jSONObject);
            this.f17723a.mo13360a();
        }
    }
}
