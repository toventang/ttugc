package com.bytedance.globalpayment.iap.p1050b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OneTimeOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.SubscriptionOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.AckStrategy;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.model.OrderStateInfo;
import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;
import com.bytedance.globalpayment.iap.p1062d.C15162b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.globalpayment.iap.b.a */
public class C15109a {

    /* renamed from: a */
    public AbstractC15235a<OrderStateInfo> f36857a;

    /* renamed from: b */
    int f36858b;

    /* renamed from: c */
    String f36859c;

    /* renamed from: d */
    String f36860d;

    /* renamed from: e */
    HandlerC15112a f36861e;

    /* renamed from: f */
    AbstractC15235a<ResponseEntity> f36862f;

    /* renamed from: g */
    private final String f36863g;

    /* renamed from: h */
    private int f36864h;

    /* renamed from: i */
    private String f36865i;

    /* renamed from: j */
    private String f36866j;

    /* renamed from: k */
    private boolean f36867k;

    /* renamed from: l */
    private boolean f36868l;

    /* renamed from: m */
    private String f36869m;

    /* renamed from: n */
    private IapPaymentMethod f36870n;

    static {
        Covode.recordClassIndex(17277);
    }

    /* renamed from: a */
    public final void mo24367a() {
        if (this.f36858b >= this.f36864h) {
            C15253a.m28071a().mo24705e();
            AbstractC15235a<OrderStateInfo> aVar = this.f36857a;
            if (aVar != null) {
                aVar.mo24359a(new C15126d(204, 2041, "channel pay success, but query order state timeout because query order state retry count is to maxRetryCount."));
                return;
            }
            return;
        }
        C15253a.m28071a().mo24705e();
        this.f36861e.removeMessages(1);
        C15162b.m27903d().mo24493b().mo24402a(this.f36860d, this.f36866j, this.f36865i, this.f36859c, this.f36867k, this.f36869m, this.f36862f, this.f36868l);
    }

    /* renamed from: com.bytedance.globalpayment.iap.b.a$2 */
    static /* synthetic */ class C151112 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36872a;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.p1050b.C15109a.C151112.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.globalpayment.iap.b.a$a */
    public static class HandlerC15112a extends Handler {

        /* renamed from: a */
        private C15109a f36873a;

        static {
            Covode.recordClassIndex(17280);
        }

        public HandlerC15112a(C15109a aVar) {
            super(Looper.getMainLooper());
            this.f36873a = aVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                this.f36873a.mo24367a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo24366a(int i) {
        int min;
        if (this.f36870n == IapPaymentMethod.AMAZON) {
            min = Math.min(Math.max(i * 2, 2), 32);
        } else {
            min = Math.min(Math.max(i, 1), 5);
        }
        return (long) min;
    }

    /* renamed from: a */
    public final void mo24368a(AckStrategy ackStrategy, AbstractC15235a<OrderStateInfo> aVar) {
        this.f36857a = aVar;
        ackStrategy.isNeedAckAfterSuccessQuery();
        mo24367a();
    }

    public C15109a(IapPaymentMethod iapPaymentMethod, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        this(iapPaymentMethod, str, str2, str3, 8, str4, z, str5, z2);
    }

    public C15109a(IapPaymentMethod iapPaymentMethod, String str, String str2, String str3, int i, String str4, boolean z, String str5, boolean z2) {
        this.f36863g = C15109a.class.getSimpleName();
        this.f36858b = 0;
        this.f36864h = 0;
        this.f36862f = new AbstractC15235a<ResponseEntity>() {
            /* class com.bytedance.globalpayment.iap.p1050b.C15109a.C151101 */

            static {
                Covode.recordClassIndex(17278);
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
            /* renamed from: a */
            public final void mo24359a(AbsResult absResult) {
                AbstractC15235a<OrderStateInfo> aVar = C15109a.this.f36857a;
                if (aVar != null) {
                    aVar.mo24359a(absResult);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a
            /* renamed from: a */
            public final /* synthetic */ void mo24360a(ResponseEntity responseEntity) {
                OrderStateEnum orderStateEnum;
                ResponseEntity responseEntity2 = responseEntity;
                if (responseEntity2 instanceof OneTimeOrderStateResponseEntity) {
                    C15109a aVar = C15109a.this;
                    OneTimeOrderStateResponseEntity oneTimeOrderStateResponseEntity = (OneTimeOrderStateResponseEntity) responseEntity2;
                    AbstractC15235a<OrderStateInfo> aVar2 = aVar.f36857a;
                    if (aVar2 != null) {
                        if (oneTimeOrderStateResponseEntity == null || oneTimeOrderStateResponseEntity.data == null) {
                            C15253a.m28071a().mo24705e();
                            orderStateEnum = OrderStateEnum.Failed;
                        } else {
                            orderStateEnum = OrderStateEnum.from(oneTimeOrderStateResponseEntity.data.status);
                        }
                        int i = C151112.f36872a[orderStateEnum.ordinal()];
                        if (i != 3) {
                            switch (i) {
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                    aVar2.mo24360a(new OrderStateInfo().setProductId(aVar.f36859c).setOrderId(aVar.f36860d).setOrderState(orderStateEnum));
                                    return;
                                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                    break;
                                default:
                                    int i2 = aVar.f36858b + 1;
                                    aVar.f36858b = i2;
                                    long a = aVar.mo24366a(i2);
                                    C15253a.m28071a().mo24705e();
                                    aVar.f36861e.sendEmptyMessageDelayed(1, a * 1000);
                                    return;
                            }
                        }
                        aVar2.mo24359a(new C15126d(204, orderStateEnum.ordinal(), "query order error because of the entity state, the state is " + orderStateEnum.name()));
                        return;
                    }
                    return;
                }
                C15109a aVar3 = C15109a.this;
                SubscriptionOrderStateResponseEntity subscriptionOrderStateResponseEntity = (SubscriptionOrderStateResponseEntity) responseEntity2;
                AbstractC15235a<OrderStateInfo> aVar4 = aVar3.f36857a;
                if (aVar4 == null) {
                    return;
                }
                if (subscriptionOrderStateResponseEntity == null || subscriptionOrderStateResponseEntity.data == null || subscriptionOrderStateResponseEntity.data.subsInfo == null) {
                    C15253a.m28071a().mo24705e();
                    aVar4.mo24359a(new C15126d(204, 2021, "entity is null when OrderStateManager.onQuerySubscriptionOrderStateSuccess"));
                    return;
                }
                OrderStateEnum from = OrderStateEnum.from(subscriptionOrderStateResponseEntity.data.subsInfo.status);
                switch (C151112.f36872a[from.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        aVar4.mo24360a(new OrderStateInfo().setProductId(aVar3.f36859c).setOrderId(aVar3.f36860d).setOrderState(OrderStateEnum.from(subscriptionOrderStateResponseEntity.data.subsInfo.status)));
                        return;
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar4.mo24359a(new C15126d(204, from.ordinal(), "query subscription order error because of the entity state, the state is " + from.name()));
                        return;
                    default:
                        int i3 = aVar3.f36858b + 1;
                        aVar3.f36858b = i3;
                        long a2 = aVar3.mo24366a(i3);
                        C15253a.m28071a().mo24705e();
                        aVar3.f36861e.sendEmptyMessageDelayed(1, a2 * 1000);
                        return;
                }
            }
        };
        this.f36859c = str;
        this.f36860d = str2;
        this.f36866j = str3;
        this.f36864h = i;
        this.f36861e = new HandlerC15112a(this);
        this.f36865i = str4;
        this.f36867k = z;
        this.f36868l = z2;
        this.f36869m = str5;
        this.f36870n = iapPaymentMethod;
    }
}
