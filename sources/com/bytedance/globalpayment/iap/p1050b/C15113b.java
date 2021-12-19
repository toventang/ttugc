package com.bytedance.globalpayment.iap.p1050b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.iap.p1062d.C15162b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.b.b */
public class C15113b {

    /* renamed from: a */
    public TokenInfo f36874a;

    /* renamed from: b */
    int f36875b = 0;

    /* renamed from: c */
    int f36876c;

    /* renamed from: d */
    HandlerC15115a f36877d;

    /* renamed from: e */
    AbstractC15235a<ResponseEntity> f36878e;

    /* renamed from: f */
    AbstractC15235a<ResponseEntity> f36879f = new AbstractC15235a<ResponseEntity>() {
        /* class com.bytedance.globalpayment.iap.p1050b.C15113b.C151141 */

        static {
            Covode.recordClassIndex(17282);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final /* synthetic */ void mo24360a(ResponseEntity responseEntity) {
            PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onSuccessFinishedTokenUpload(C15113b.this.f36874a.getOrderId());
            if (C15113b.this.f36878e != null) {
                C15113b.this.f36878e.mo24360a(responseEntity);
            }
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final void mo24359a(AbsResult absResult) {
            C15113b bVar = C15113b.this;
            if (bVar.f36875b >= bVar.f36876c) {
                C15253a.m28071a().mo24705e();
                PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onFailedFinishedTokenUpload(bVar.f36874a.getOrderId());
                if (bVar.f36878e != null) {
                    bVar.f36878e.mo24359a(absResult);
                    return;
                }
                return;
            }
            int i = bVar.f36875b + 1;
            bVar.f36875b = i;
            long min = (long) Math.min(Math.max(i, 1), 5);
            C15253a.m28071a().mo24705e();
            bVar.f36877d.sendEmptyMessageDelayed(1, min * 1000);
        }
    };

    /* renamed from: g */
    private final String f36880g = C15113b.class.getSimpleName();

    /* renamed from: h */
    private String f36881h;

    /* renamed from: i */
    private String f36882i;

    static {
        Covode.recordClassIndex(17281);
    }

    /* renamed from: a */
    public final void mo24370a() {
        JSONObject jSONObject;
        C15253a.m28071a().mo24705e();
        this.f36877d.removeMessages(1);
        try {
            jSONObject = this.f36874a.toJson();
        } catch (JSONException e) {
            C15253a.m28071a().mo24705e();
            e.getLocalizedMessage();
            jSONObject = null;
        }
        C15162b.m27903d().mo24493b().mo24403a(this.f36881h, jSONObject, this.f36882i, this.f36874a.isSubscription(), this.f36874a.getOrderId(), this.f36874a.getProductId(), this.f36879f, this.f36874a.isNewSubscription());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.globalpayment.iap.b.b$a */
    public static class HandlerC15115a extends Handler {

        /* renamed from: a */
        private C15113b f36884a;

        static {
            Covode.recordClassIndex(17283);
        }

        public HandlerC15115a(C15113b bVar) {
            super(Looper.getMainLooper());
            this.f36884a = bVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                this.f36884a.mo24370a();
            }
        }
    }

    /* renamed from: a */
    public final void mo24371a(AbstractC15235a<ResponseEntity> aVar) {
        C15253a.m28071a().mo24705e();
        this.f36878e = aVar;
        mo24370a();
    }

    public C15113b(String str, String str2, TokenInfo tokenInfo) {
        this.f36881h = str;
        this.f36874a = tokenInfo;
        this.f36882i = str2;
        this.f36877d = new HandlerC15115a(this);
        this.f36876c = 8;
    }
}
