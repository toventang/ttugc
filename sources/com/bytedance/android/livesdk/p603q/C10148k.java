package com.bytedance.android.livesdk.p603q;

import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.chatroom.p488c.C7388g;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.q.k */
public final class C10148k {

    /* renamed from: a */
    C9904t f24610a;

    /* renamed from: b */
    DataChannel f24611b;

    /* renamed from: c */
    final C88411a f24612c;

    /* renamed from: d */
    AbstractC10149a f24613d;

    /* renamed from: e */
    private boolean f24614e = true;

    /* renamed from: com.bytedance.android.livesdk.q.k$a */
    public interface AbstractC10149a {
        static {
            Covode.recordClassIndex(11712);
        }

        /* renamed from: a */
        void mo16978a(C9904t tVar);

        void setImageDrawable(int i);
    }

    static {
        Covode.recordClassIndex(11711);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16989a() {
        C9904t tVar = this.f24610a;
        if (tVar != null) {
            this.f24614e = C10146j.m18653a(tVar.f23999d);
        }
    }

    public C10148k(AbstractC10149a aVar, DataChannel dataChannel) {
        C88411a aVar2 = new C88411a();
        this.f24612c = aVar2;
        this.f24613d = aVar;
        this.f24611b = dataChannel;
        if (dataChannel != null && dataChannel.mo28318b(C9093de.class) != null) {
            if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
                this.f24613d.setImageDrawable(2131234343);
            } else {
                EnumC5847l.FAST_GIFT.hide(this.f24611b);
            }
            long id = ((Room) this.f24611b.mo28318b(C9093de.class)).getId();
            C9904t fastGift = GiftManager.inst().getFastGift(id);
            if (fastGift != null) {
                this.f24610a = fastGift;
                EnumC5847l.FAST_GIFT.show(this.f24611b);
                AbstractC10149a aVar3 = this.f24613d;
                if (aVar3 != null) {
                    aVar3.mo16978a(this.f24610a);
                }
            }
            mo16989a();
            aVar2.mo142945a(C6779a.m14563a().mo13052a(C7388g.class).mo143289d(new C10150l(this, id)));
        }
    }
}
