package com.bytedance.globalpayment.iap.state;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.AckStrategy;
import com.bytedance.globalpayment.iap.model.OrderStateInfo;
import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;
import com.bytedance.globalpayment.iap.p1050b.C15109a;
import com.bytedance.globalpayment.iap.p1051c.C15118c;
import com.bytedance.globalpayment.iap.p1062d.C15162b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: com.bytedance.globalpayment.iap.state.a */
public abstract class AbstractC15218a extends AbstractC15131a {

    /* renamed from: c */
    protected static final String f37137c = AbstractC15218a.class.getSimpleName();

    /* renamed from: d */
    protected int f37138d = 3;

    /* renamed from: e */
    protected C15109a f37139e;

    /* renamed from: f */
    protected AckStrategy f37140f;

    /* renamed from: g */
    public HandlerC15220b f37141g;

    /* renamed from: h */
    private boolean f37142h;

    static {
        Covode.recordClassIndex(17412);
    }

    /* renamed from: b */
    public final void mo24688b() {
        if (!this.f37142h) {
            this.f37142h = true;
            AbstractC15131a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(this);
            if (nextState != null) {
                nextState.mo24398a(this.f36941a);
            }
        }
    }

    /* renamed from: c */
    public final void mo24689c() {
        Context b = C15253a.m28071a().mo24709i().mo24713b();
        if (b != null) {
            PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removeQueryOrderParam(b, this.f36941a.getOrderId());
        } else {
            C15253a.m28071a().mo24705e();
        }
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.a$b */
    static class HandlerC15220b extends Handler {

        /* renamed from: a */
        private AbstractC15218a f37146a;

        static {
            Covode.recordClassIndex(17414);
        }

        public HandlerC15220b(AbstractC15218a aVar) {
            super(Looper.getMainLooper());
            this.f37146a = aVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1659) {
                C15253a.m28071a().mo24705e();
                this.f37146a.mo24688b();
            }
        }
    }

    public AbstractC15218a(AbstractC15153d dVar) {
        super(dVar);
        PaymentOnlineSettings b = C15253a.m28071a().mo24708h().mo24735b();
        this.f37140f = new AckStrategy(b.mo24757e(), b.mo24756d());
        this.f37141g = new HandlerC15220b(this);
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.a$a */
    public class C15219a implements AbstractC15235a<OrderStateInfo> {

        /* renamed from: a */
        protected C15118c f37143a;

        /* renamed from: b */
        protected AckStrategy f37144b;

        static {
            Covode.recordClassIndex(17413);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final /* synthetic */ void mo24360a(OrderStateInfo orderStateInfo) {
            this.f37143a.mo24378a(true, orderStateInfo.getOrderState().ordinal(), null);
            AbstractC15218a.this.f36941a.setQuerySucceed(true);
            AbstractC15218a.this.mo24689c();
            if (this.f37144b.isNeedAckAfterSuccessQuery()) {
                AbstractC15218a.this.mo24688b();
            }
            if (AbstractC15218a.this.f36941a.isSuccess() && !AbstractC15218a.this.f36941a.isFinished()) {
                AbstractC15218a.this.mo24397a(new C15126d(0, 0, "pay success in QueryOrderStateCallback."));
            }
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
        /* renamed from: a */
        public final void mo24359a(AbsResult absResult) {
            int i;
            int i2;
            if (this.f37144b.isNeedAckAfterSuccessQuery() && this.f37144b.getAutoAckAfterUploadTokenInMs() > 0) {
                C15162b.m27903d().mo24492a().mo24507b(AbstractC15218a.this.f36941a, absResult);
                AbstractC15218a.this.mo24688b();
            }
            if (absResult != null) {
                i = absResult.getCode();
                i2 = absResult.getDetailCode();
            } else {
                i = -1;
                i2 = 0;
            }
            AbstractC15218a.this.mo24397a(C15126d.m27810a(absResult));
            if (i != 204) {
                this.f37143a.mo24378a(false, -1, C15126d.m27810a(absResult));
            } else if (i2 == OrderStateEnum.Failed.ordinal() || i2 == OrderStateEnum.Closed.ordinal() || i2 == OrderStateEnum.Expired.ordinal()) {
                this.f37143a.mo24378a(true, i2, C15126d.m27810a(absResult));
                AbstractC15218a.this.mo24689c();
            } else if (i2 == OrderStateEnum.Abandoned.ordinal() || i2 == OrderStateEnum.SusPended.ordinal() || i2 == OrderStateEnum.Preorder.ordinal()) {
                C15162b.m27903d().mo24492a().mo24505a(AbstractC15218a.this.f36941a, absResult);
                this.f37143a.mo24378a(true, i2, C15126d.m27810a(absResult));
                AbstractC15218a.this.mo24689c();
            }
        }

        public C15219a(C15118c cVar, AckStrategy ackStrategy) {
            this.f37143a = cVar;
            this.f37144b = ackStrategy;
            if (!ackStrategy.isNeedAckAfterSuccessQuery()) {
                AbstractC15218a.this.mo24688b();
                return;
            }
            C15253a.m28071a().mo24705e();
            ackStrategy.getAutoAckAfterUploadTokenInMs();
            if (ackStrategy.getAutoAckAfterUploadTokenInMs() > 0) {
                C15253a.m28071a().mo24705e();
                ackStrategy.getAutoAckAfterUploadTokenInMs();
                AbstractC15218a.this.f37141g.sendEmptyMessageDelayed(1659, ackStrategy.getAutoAckAfterUploadTokenInMs());
            }
        }
    }
}
