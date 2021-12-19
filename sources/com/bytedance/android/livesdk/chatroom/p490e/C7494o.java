package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.chatroom.api.StickerDonationRetrofitApi;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.C11734o;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.p1114a.AbstractC16043b;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.o */
public final class C7494o extends AbstractC16043b<AbstractC7495a> {

    /* renamed from: a */
    private final C88411a f18615a = new C88411a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.o$a */
    public interface AbstractC7495a extends AbstractC16042a {
        static {
            Covode.recordClassIndex(8265);
        }

        /* renamed from: a */
        void mo13743a(C11734o oVar);

        /* renamed from: a */
        void mo13744a(Throwable th);
    }

    static {
        Covode.recordClassIndex(8264);
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        this.f18615a.dispose();
        this.f18615a.mo142944a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.e.o$c */
    public static final class C7497c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7494o f18617a;

        static {
            Covode.recordClassIndex(8267);
        }

        C7497c(C7494o oVar) {
            this.f18617a = oVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC7495a aVar = (AbstractC7495a) this.f18617a.f38654y;
            if (aVar != null) {
                aVar.mo13744a(th);
            }
        }
    }

    /* renamed from: a */
    public final void mo13742a(Map<String, String> map) {
        C89219l.m154721d(map, "");
        this.f18615a.mo142945a(((StickerDonationRetrofitApi) C5805e.m12718a().mo11572a(StickerDonationRetrofitApi.class)).fetchStickerDonation(new StringBuilder("https://api.tiktokv.com/aweme/v1/donation/orgs/").toString(), map).mo143271a(new C11191f()).mo143254a(new C7496b(this), new C7497c(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.e.o$b */
    public static final class C7496b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7494o f18616a;

        static {
            Covode.recordClassIndex(8266);
        }

        C7496b(C7494o oVar) {
            this.f18616a = oVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11734o oVar = (C11734o) obj;
            if (oVar == null) {
                AbstractC7495a aVar = (AbstractC7495a) this.f18616a.f38654y;
                if (aVar != null) {
                    aVar.mo13744a(new IllegalArgumentException("data is null"));
                }
            } else if (oVar.f28072a == 0) {
                AbstractC7495a aVar2 = (AbstractC7495a) this.f18616a.f38654y;
                if (aVar2 != null) {
                    aVar2.mo13743a(oVar);
                }
            } else {
                AbstractC7495a aVar3 = (AbstractC7495a) this.f18616a.f38654y;
                if (aVar3 != null) {
                    aVar3.mo13744a(new IllegalArgumentException("status code is:" + oVar.f28072a));
                }
            }
        }
    }
}
