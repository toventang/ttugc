package com.bytedance.android.livesdk.chatroom.p490e;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11164m;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.p1114a.AbstractC16043b;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.r */
public abstract class AbstractC7501r<T extends AbstractC8094bq> extends AbstractC16043b<T> {

    /* renamed from: a */
    private C11191f f18623a;

    /* renamed from: w */
    public DataChannel f18624w;

    /* renamed from: x */
    public IMessageManager f18625x;

    static {
        Covode.recordClassIndex(8271);
    }

    /* renamed from: u */
    public final <D> AbstractC11164m<D> mo13748u() {
        return C11152e.m19790a((AbstractC1204m) this.f38654y);
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: b */
    public void mo8577b() {
        IMessageManager iMessageManager;
        if ((this instanceof OnMessageListener) && (iMessageManager = this.f18625x) != null) {
            iMessageManager.removeMessageListener((OnMessageListener) this);
        }
        this.f18624w = null;
        super.mo8577b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final <D> AbstractC11164m<D> mo13749v() {
        if (this.f18623a == null) {
            this.f18623a = new C11191f();
        }
        return C11152e.m19792a(C11126a.m19763a((AbstractC1204m) this.f38654y, AbstractC1196i.EnumC1198a.ON_DESTROY), this.f18623a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final <D> AbstractC11164m<D> mo13750w() {
        if (this.f18623a == null) {
            this.f18623a = new C11191f();
        }
        return C11152e.m19792a(C11126a.m19763a((AbstractC1204m) ((AbstractC8094bq) this.f38654y).getContext(), AbstractC1196i.EnumC1198a.ON_DESTROY), this.f18623a);
    }

    /* renamed from: a */
    public void mo10297a(T t) {
        super.mo10297a((AbstractC16042a) t);
        if (t != null) {
            DataChannel provideDataChannel = t.provideDataChannel();
            this.f18624w = provideDataChannel;
            if (provideDataChannel != null) {
                this.f18625x = (IMessageManager) provideDataChannel.mo28318b(C9068cg.class);
            }
        }
    }

    /* renamed from: a */
    public final void mo13747a(Throwable th) {
        C3854a.m9455a(6, getClass().getName(), th.getStackTrace());
    }
}
