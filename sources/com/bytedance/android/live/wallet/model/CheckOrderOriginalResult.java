package com.bytedance.android.live.wallet.model;

import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class CheckOrderOriginalResult extends C5830b<C6375a, C6376b> {
    private Exception exception;
    private String orderId;
    private String payChannel;
    private int retry;

    static {
        Covode.recordClassIndex(7101);
    }

    public Exception getException() {
        return this.exception;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPayChannel() {
        return this.payChannel;
    }

    public int getRetry() {
        return this.retry;
    }

    public C6375a getData() {
        return (C6375a) this.data;
    }

    public C6376b getExtra() {
        return (C6376b) this.extra;
    }

    public int getStatus() {
        if (this.data == null) {
            return 0;
        }
        return ((C6375a) this.data).f15916a;
    }

    /* renamed from: com.bytedance.android.live.wallet.model.CheckOrderOriginalResult$a */
    public static class C6375a {
        @AbstractC27891c(mo46611a = "status")

        /* renamed from: a */
        public int f15916a;

        static {
            Covode.recordClassIndex(7102);
        }

        public String toString() {
            return "CheckOrderData{status=" + this.f15916a + '}';
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.model.CheckOrderOriginalResult$b */
    public static class C6376b extends Extra {
        @AbstractC27891c(mo46611a = "coupon")

        /* renamed from: a */
        public String f15917a;
        @AbstractC27891c(mo46611a = "coupon_description")

        /* renamed from: b */
        public String f15918b;
        @AbstractC27891c(mo46611a = "coupon_detail")

        /* renamed from: c */
        public List<Object> f15919c;

        static {
            Covode.recordClassIndex(7103);
        }

        public String toString() {
            return "CheckOrderExtra{coupon='" + this.f15917a + '\'' + ", couponDescription='" + this.f15918b + '\'' + '}';
        }
    }

    public String toString() {
        return "CheckOrderOriginalResult{data=" + this.data + ", extra=" + this.extra + ", retry=" + this.retry + ", orderId='" + this.orderId + '\'' + ", exception=" + this.exception + '}';
    }

    public void setData(C6375a aVar) {
        this.data = aVar;
    }

    public CheckOrderOriginalResult setException(Exception exc) {
        this.exception = exc;
        return this;
    }

    public void setExtra(C6376b bVar) {
        this.extra = bVar;
    }

    public CheckOrderOriginalResult setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public void setPayChannel(String str) {
        this.payChannel = str;
    }

    public CheckOrderOriginalResult setRetry(int i) {
        this.retry = i;
        return this;
    }

    public CheckOrderOriginalResult setStatus(int i) {
        if (this.data == null) {
            this.data = new C6375a();
        }
        ((C6375a) this.data).f15916a = i;
        return this;
    }
}
