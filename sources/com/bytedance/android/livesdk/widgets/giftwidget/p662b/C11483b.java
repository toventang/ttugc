package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.gift.C4325a;
import com.bytedance.android.live.gift.C4326b;
import com.bytedance.android.live.gift.C4336l;
import com.bytedance.android.live.gift.C4337m;
import com.bytedance.android.live.gift.C4338n;
import com.bytedance.android.live.gift.C4339o;
import com.bytedance.android.live.gift.C4342r;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.live.p379n.C5784p;
import com.bytedance.android.live.p379n.C5793y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C8972i;
import com.bytedance.android.livesdk.chatroom.p488c.C7381an;
import com.bytedance.android.livesdk.chatroom.p488c.C7385d;
import com.bytedance.android.livesdk.chatroom.p488c.C7389h;
import com.bytedance.android.livesdk.firstrecharge.C8741f;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.android.livesdk.gift.p544b.C8793b;
import com.bytedance.android.livesdk.gift.p548d.C8800d;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.gift.p548d.C8804h;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9077cp;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.util.rxutils.C11121a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p689e.C11754d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.b */
public final class C11483b {

    /* renamed from: a */
    final DataChannel f27546a;

    /* renamed from: b */
    public AbstractC11485a f27547b;

    /* renamed from: c */
    public View f27548c;

    /* renamed from: d */
    public final C1213t<Boolean> f27549d;

    /* renamed from: e */
    boolean f27550e = false;

    /* renamed from: f */
    boolean f27551f = false;

    /* renamed from: g */
    boolean f27552g = false;

    /* renamed from: h */
    public final C88411a f27553h;

    /* renamed from: i */
    public AbstractC8807b f27554i;

    /* renamed from: j */
    public final AbstractC1214u<Boolean> f27555j;

    /* renamed from: k */
    private final AbstractC1204m f27556k;

    /* renamed from: l */
    private final C11121a<Object> f27557l;

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.b$a */
    public interface AbstractC11485a {
        static {
            Covode.recordClassIndex(13144);
        }

        /* renamed from: a */
        void mo18277a(int i);

        /* renamed from: a */
        void mo18278a(View view);

        /* renamed from: a */
        void mo18279a(C7389h hVar);

        /* renamed from: a */
        void mo18280a(C8803g gVar);

        /* renamed from: a */
        void mo18286a(String str);

        /* renamed from: a */
        void mo18287a(boolean z);

        /* renamed from: b */
        void mo18289b(boolean z);

        /* renamed from: c */
        void mo18290c();

        /* renamed from: d */
        void mo18291d();

        /* renamed from: e */
        void mo18292e();

        /* renamed from: f */
        void mo18293f();

        /* renamed from: g */
        void mo18294g();

        /* renamed from: h */
        void mo18295h();

        /* renamed from: i */
        void mo18296i();
    }

    static {
        Covode.recordClassIndex(13142);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo18317a() {
        DataChannel dataChannel;
        boolean z;
        boolean z2;
        Room room = (Room) this.f27546a.mo28318b(C9093de.class);
        if (room == null || (dataChannel = this.f27546a) == null || dataChannel.mo28318b(C9119ed.class) == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) this.f27546a.mo28318b(C9119ed.class)).booleanValue();
        if (room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().isEnableGift()) {
            z = false;
        } else {
            z = true;
        }
        if (((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C8789a.EnumC8790a a = C8789a.m17098a(booleanValue, z2, z);
        if (a == C8789a.EnumC8790a.SHOW) {
            return true;
        }
        if (a == C8789a.EnumC8790a.GREY) {
            if (C8793b.m17101a(booleanValue, z2, z) != C8793b.EnumC8794a.TOAST) {
                AbstractC11485a aVar = this.f27547b;
                if (aVar != null) {
                    aVar.mo18293f();
                }
            } else if (!(room.getRoomAuthStatus() == null || room.getRoomAuthStatus().getRoomAuthOffReasons() == null || room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() == null)) {
                C11226ao.m19884a(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                DataChannel dataChannel2 = this.f27546a;
                if (dataChannel2 != null) {
                    dataChannel2.mo28320c(C4336l.class, true);
                }
            }
        }
        return false;
    }

    public C11483b(DataChannel dataChannel, C11121a<Object> aVar, AbstractC1204m mVar) {
        C1213t<Boolean> tVar = new C1213t<>();
        this.f27549d = tVar;
        C88411a aVar2 = new C88411a();
        this.f27553h = aVar2;
        this.f27554i = new AbstractC8807b() {
            /* class com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11483b.C114841 */

            static {
                Covode.recordClassIndex(13143);
            }

            @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
            /* renamed from: a */
            public final void mo8519a(List<C9904t> list) {
            }

            @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
            /* renamed from: b */
            public final void mo8520b(List<GiftPage> list) {
                if (C11483b.this.f27547b != null) {
                    C11483b.this.f27547b.mo18295h();
                }
            }
        };
        C11486c cVar = new C11486c(this);
        this.f27555j = cVar;
        this.f27546a = dataChannel;
        this.f27557l = aVar;
        this.f27556k = mVar;
        tVar.observeForever(cVar);
        dataChannel.mo28309a(mVar, C4338n.class, (AbstractC89172b) new C11487d(this)).mo28309a(mVar, C11754d.class, (AbstractC89172b) new C11497n(this)).mo28309a(mVar, C4344t.class, (AbstractC89172b) new C11498o(this)).mo28309a(mVar, C9034ba.class, (AbstractC89172b) new C11499p(this)).mo28309a(mVar, C4337m.class, (AbstractC89172b) new C11500q(this)).mo28309a(mVar, C9077cp.class, (AbstractC89172b) new C11501r(this)).mo28309a(mVar, C4326b.class, (AbstractC89172b) new C11502s(this)).mo28313b(mVar, C4339o.class, (AbstractC89172b) new C11503t(this)).mo28309a(mVar, C5784p.class, (AbstractC89172b) new C11504u(this)).mo28309a(mVar, C4325a.class, (AbstractC89172b) new C11488e(this)).mo28309a(mVar, C4342r.class, (AbstractC89172b) new C11489f(this));
        aVar2.mo142945a(C6779a.m14563a().mo13052a(C7381an.class).mo143271a(aVar).mo143289d(new C11490g(this)));
        aVar2.mo142945a(C6779a.m14563a().mo13052a(C8800d.class).mo143289d(new C11491h(this)));
        aVar2.mo142945a(C6779a.m14563a().mo13052a(C8741f.class).mo143289d(new C11492i(this)));
        aVar2.mo142945a(C6779a.m14563a().mo13052a(C7385d.class).mo143289d(new C11493j(this)));
        aVar2.mo142945a(C6779a.m14563a().mo13052a(C8804h.class).mo143289d(new C11494k(this)));
        DataChannelGlobal.f42558d.mo28322a(mVar, mVar, C5793y.class, new C11495l(this));
        aVar2.mo142945a(C6779a.m14563a().mo13052a(C8972i.class).mo143289d(new C11496m(this)));
    }
}
