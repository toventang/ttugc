package com.bytedance.android.livesdk.chatroom.p490e;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.C4347h;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.C7682d;
import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.android.livesdk.chatroom.p488c.C7371ad;
import com.bytedance.android.livesdk.chatroom.p488c.C7372ae;
import com.bytedance.android.livesdk.chatroom.p488c.C7374ag;
import com.bytedance.android.livesdk.chatroom.p492g.C7576f;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.C8097bt;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.model.message.C9694bz;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.c */
public final class C7477c extends AbstractC7501r<AbstractC7479a> implements OnMessageListener {

    /* renamed from: a */
    boolean f18576a = true;

    /* renamed from: b */
    public Room f18577b;

    /* renamed from: c */
    public C88411a f18578c;

    /* renamed from: d */
    private boolean f18579d = true;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.c$a */
    public interface AbstractC7479a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(8249);
        }

        /* renamed from: a */
        void mo13717a();

        /* renamed from: a */
        void mo13718a(C7374ag agVar, Exception exc);

        /* renamed from: a */
        void mo13719a(Barrage barrage);

        /* renamed from: a */
        void mo13720a(C7682d dVar);

        /* renamed from: a */
        void mo13721a(C9878i iVar);

        /* renamed from: a */
        void mo13722a(C9878i iVar, AbstractC7394l.EnumC7395a aVar);

        /* renamed from: a */
        void mo13723a(Exception exc);

        /* renamed from: a */
        void mo13724a(boolean z);

        /* renamed from: b */
        void mo13725b(Exception exc);

        /* renamed from: b */
        void mo13726b(boolean z);
    }

    static {
        Covode.recordClassIndex(8247);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.c$1 */
    static /* synthetic */ class C74781 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18580a;

        static {
            Covode.recordClassIndex(8248);
            int[] iArr = new int[EnumC9596a.values().length];
            f18580a = iArr;
            try {
                iArr[EnumC9596a.ROOM_VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        C88411a aVar = this.f18578c;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f18578c = null;
        C7576f.f18800b = null;
        C7576f.f18799a.f17278a = 0;
    }

    /* renamed from: a */
    private void m15407a(boolean z) {
        String str;
        if (z) {
            EnumC5847l.GIFT.show(this.f18624w);
            this.f18624w.mo28319c(C4347h.class);
        } else {
            EnumC5847l.GIFT.hide(this.f18624w);
        }
        C6555i.m14021b();
        C6555i.m9463b("ttlive_gift", "Gift icon status changed, visiable:" + z + ", reason:CommentPresenter sendGiftVisibilityCommand");
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TOOLBAR_GIFT_ON_COMMAND");
        if (z) {
            str = "VISIBLE";
        } else {
            str = "GONE";
        }
        hashMap.put("view_status", str);
        C6555i.m14021b().mo9217b("ttlive_gift", hashMap);
    }

    /* renamed from: a */
    public final void mo13714a(C7371ad adVar) {
        if (this.f18578c == null || TextUtils.isEmpty(adVar.f18270a) || !this.f18576a) {
            C6779a.m14563a().mo13053a(new C7372ae(adVar, false));
            return;
        }
        String str = null;
        if (adVar.f18271b.get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) adVar.f18271b.get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        this.f18576a = false;
        C88411a aVar = this.f18578c;
        String str2 = adVar.f18270a;
        long id = this.f18577b.getId();
        String requestId = this.f18577b.getRequestId();
        String labels = this.f18577b.getLabels();
        C89219l.m154721d(str2, "");
        AbstractC88979t<R> a = ((CommentApi) C5805e.m12718a().mo11572a(CommentApi.class)).sendBarrage(C8097bt.m16256a(str2, id, requestId, labels, str, 0, false)).mo143271a(new C11191f());
        C89219l.m154716b(a, "");
        aVar.mo142945a(a.mo143254a(new C7483g(this, adVar), new C7484h(this, adVar)));
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (this.f38654y != null && iMessage != null && (iMessage instanceof AbstractC6571a) && C74781.f18580a[((C11777a) iMessage).f28131L.ordinal()] == 1 && (iMessage instanceof C9694bz)) {
            int i = ((C9694bz) iMessage).f23626a;
            if (i == 12) {
                Room room = this.f18577b;
                if (room != null && room.mRoomAuthStatus != null) {
                    this.f18577b.mRoomAuthStatus.enableDigg = false;
                }
            } else if (i != 13) {
                switch (i) {
                    case 3:
                        Room room2 = this.f18577b;
                        if (!(room2 == null || room2.mRoomAuthStatus == null)) {
                            this.f18577b.mRoomAuthStatus.setEnableChat(false);
                        }
                        C7576f.m15565a();
                        ((AbstractC7479a) this.f38654y).mo13726b(false);
                        return;
                    case 4:
                        Room room3 = this.f18577b;
                        if (!(room3 == null || room3.mRoomAuthStatus == null)) {
                            this.f18577b.mRoomAuthStatus.setEnableChat(true);
                        }
                        C7576f.m15565a();
                        ((AbstractC7479a) this.f38654y).mo13726b(true);
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        this.f18579d = false;
                        Room room4 = this.f18577b;
                        if (!(room4 == null || room4.mRoomAuthStatus == null)) {
                            this.f18577b.mRoomAuthStatus.enableDanmaku = false;
                        }
                        ((AbstractC7479a) this.f38654y).mo13724a(this.f18579d);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        this.f18579d = true;
                        Room room5 = this.f18577b;
                        if (!(room5 == null || room5.mRoomAuthStatus == null)) {
                            this.f18577b.mRoomAuthStatus.enableDanmaku = true;
                        }
                        ((AbstractC7479a) this.f38654y).mo13724a(this.f18579d);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        Room room6 = this.f18577b;
                        if (!(room6 == null || room6.mRoomAuthStatus == null)) {
                            this.f18577b.mRoomAuthStatus.enableGift = false;
                        }
                        m15407a(false);
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        Room room7 = this.f18577b;
                        if (!(room7 == null || room7.mRoomAuthStatus == null)) {
                            this.f18577b.mRoomAuthStatus.enableGift = true;
                        }
                        m15407a(true);
                        return;
                    default:
                        return;
                }
            } else {
                Room room8 = this.f18577b;
                if (room8 != null && room8.mRoomAuthStatus != null) {
                    this.f18577b.mRoomAuthStatus.enableDigg = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13715a(C7374ag agVar) {
        if (this.f18578c == null || TextUtils.isEmpty(agVar.mo13596b())) {
            C6779a.m14563a().mo13053a(new C7372ae(agVar, false));
            return;
        }
        String str = null;
        if (agVar.mo13600f().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) agVar.mo13600f().get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        C9878i mockChatMessage = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).mockChatMessage(this.f18577b.getId(), agVar.mo13596b(), (User) C11115u.m19743a().mo17915b().mo13147a());
        ((AbstractC7479a) this.f38654y).mo13721a(mockChatMessage);
        long uptimeMillis = SystemClock.uptimeMillis();
        C88411a aVar = this.f18578c;
        String b = agVar.mo13596b();
        long id = this.f18577b.getId();
        String requestId = this.f18577b.getRequestId();
        String labels = this.f18577b.getLabels();
        boolean c = agVar.mo13597c();
        int d = agVar.mo13598d();
        C89219l.m154721d(b, "");
        AbstractC88979t<R> a = ((CommentApi) C5805e.m12718a().mo11572a(CommentApi.class)).sendTextMessage(C8097bt.m16256a(b, id, requestId, labels, str, d, c)).mo143271a(new C11191f());
        C89219l.m154716b(a, "");
        aVar.mo142945a(a.mo143254a(new C7481e(this, agVar, mockChatMessage, uptimeMillis), new C7482f(this, agVar, mockChatMessage, uptimeMillis)));
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC7479a aVar) {
        super.mo10297a((AbstractC8094bq) aVar);
        this.f18577b = (Room) this.f18624w.mo28318b(C9093de.class);
        this.f18576a = true;
        if (this.f18625x != null) {
            this.f18625x.addMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
        }
        C88411a aVar2 = this.f18578c;
        if (aVar2 != null) {
            aVar2.dispose();
        }
        C88411a aVar3 = new C88411a();
        this.f18578c = aVar3;
        aVar3.mo142945a(C6779a.m14563a().mo13052a(AbstractC7394l.class).mo143289d(new C7480d(this)));
        if ((this.f18624w != null && ((Boolean) this.f18624w.mo28318b(C9119ed.class)).booleanValue()) || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            C7576f.f18800b = this.f18577b;
            C7576f.m15565a();
        }
    }
}
