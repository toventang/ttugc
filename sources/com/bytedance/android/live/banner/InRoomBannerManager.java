package com.bytedance.android.live.banner;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.message.C9604ah;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

public final class InRoomBannerManager implements AbstractC33974au, OnMessageListener {

    /* renamed from: a */
    static AbstractC1204m f8685a;

    /* renamed from: b */
    static long f8686b = -1;

    /* renamed from: c */
    static boolean f8687c;

    /* renamed from: d */
    static C88958b<C2944a> f8688d;

    /* renamed from: e */
    public static final InRoomBannerManager f8689e = new InRoomBannerManager();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.banner.InRoomBannerManager$e */
    public static final class C2948e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C2948e f8695a = new C2948e();

        static {
            Covode.recordClassIndex(3389);
        }

        C2948e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    private InRoomBannerManager() {
    }

    /* renamed from: com.bytedance.android.live.banner.InRoomBannerManager$a */
    public static final class C2944a {

        /* renamed from: a */
        public final long f8690a;

        /* renamed from: b */
        public final C9695c f8691b;

        static {
            Covode.recordClassIndex(3385);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2944a)) {
                return false;
            }
            C2944a aVar = (C2944a) obj;
            return this.f8690a == aVar.f8690a && C89219l.m154714a(this.f8691b, aVar.f8691b);
        }

        public final String toString() {
            return "Data(roomId=" + this.f8690a + ", data=" + this.f8691b + ")";
        }

        public final int hashCode() {
            int i;
            long j = this.f8690a;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            C9695c cVar = this.f8691b;
            if (cVar != null) {
                i = cVar.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public C2944a(long j, C9695c cVar) {
            C89219l.m154721d(cVar, "");
            this.f8690a = j;
            this.f8691b = cVar;
        }
    }

    static {
        Covode.recordClassIndex(3384);
        C88958b<C2944a> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        f8688d = bVar;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType(), this);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC1196i lifecycle;
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        AbstractC1204m mVar = f8685a;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4013b(this);
        }
        f8685a = null;
        f8686b = -1;
        f8687c = false;
        C88958b<C2944a> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        f8688d = bVar;
    }

    /* renamed from: com.bytedance.android.live.banner.InRoomBannerManager$c */
    static final class C2946c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C2946c f8693a = new C2946c();

        static {
            Covode.recordClassIndex(3387);
        }

        C2946c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            InRoomBannerManager.m8278a(InRoomBannerManager.f8686b, InRoomBannerManager.f8687c);
        }
    }

    /* renamed from: com.bytedance.android.live.banner.InRoomBannerManager$b */
    static final class C2945b<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ Long f8692a;

        static {
            Covode.recordClassIndex(3386);
        }

        C2945b(Long l) {
            this.f8692a = l;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C2944a aVar = (C2944a) obj;
            C89219l.m154721d(aVar, "");
            long j = aVar.f8690a;
            Long l = this.f8692a;
            if (l != null && j == l.longValue()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.banner.InRoomBannerManager$d */
    public static final class C2947d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f8694a;

        static {
            Covode.recordClassIndex(3388);
        }

        C2947d(long j) {
            this.f8694a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C88958b<C2944a> bVar = InRoomBannerManager.f8688d;
            long j = this.f8694a;
            Object obj2 = ((C5832d) obj).data;
            C89219l.m154716b(obj2, "");
            bVar.onNext(new C2944a(j, (C9695c) obj2));
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<C2944a> m8277a(Long l) {
        AbstractC88979t<C2944a> a = f8688d.mo143268a(new C2945b(l));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        if (iMessage != null && iMessage.getIntType() == EnumC9596a.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType() && (iMessage instanceof C9604ah)) {
            C9604ah ahVar = (C9604ah) iMessage;
            if (ahVar.f23312a > 0) {
                AbstractC2951c cVar = (AbstractC2951c) C6193a.m13435a(AbstractC2951c.class);
                C11778b bVar = ahVar.f28134O;
                if (bVar != null) {
                    j = bVar.f28137c;
                } else {
                    j = 0;
                }
                if (cVar.shouldShowBanner(j)) {
                    ((AbstractC11181z) AbstractC88979t.m154310b((Object) 1).mo143295e((long) new Random().nextInt(ahVar.f23312a), TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143280b((AbstractC88433f) C2946c.f8693a).mo143274a(C11152e.m19790a(f8685a))).mo17948a();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m8278a(long j, boolean z) {
        int i;
        BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) C5805e.m12718a().mo11572a(BannerRetrofitApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        ((AbstractC11181z) bannerRetrofitApi.queryLiveRoomBanner(j, i).mo143271a(new C11191f()).mo143274a(C11152e.m19790a(f8685a))).mo17950a(new C2947d(j), C2948e.f8695a);
    }
}
