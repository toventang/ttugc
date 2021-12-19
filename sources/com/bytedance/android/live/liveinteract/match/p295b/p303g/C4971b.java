package com.bytedance.android.live.liveinteract.match.p295b.p303g;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4391ae;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4491b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4948b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4950a;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4951b;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4953d;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4954e;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4955f;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4957h;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4960k;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.liveinteract.match.p305d.C5010a;
import com.bytedance.android.live.liveinteract.match.p305d.C5013b;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleOpenTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.message.C9613am;
import com.bytedance.android.livesdk.model.message.C9614an;
import com.bytedance.android.livesdk.model.message.C9615ao;
import com.bytedance.android.livesdk.model.message.p578b.C9631a;
import com.bytedance.android.livesdk.model.message.p578b.C9636b;
import com.bytedance.android.livesdk.model.message.p578b.C9640f;
import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9644i;
import com.bytedance.android.livesdk.model.message.p578b.C9645j;
import com.bytedance.android.livesdk.model.message.p578b.C9646k;
import com.bytedance.android.livesdk.model.message.p578b.C9648l;
import com.bytedance.android.livesdk.model.message.p578b.C9649m;
import com.bytedance.android.livesdk.model.message.p578b.C9651o;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11696c;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11697d;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b */
public final class C4971b extends AbstractC7501r<AbstractC4981b> implements OnMessageListener {

    /* renamed from: o */
    public static final C4972a f12956o = new C4972a((byte) 0);

    /* renamed from: a */
    public final C4384b f12957a;

    /* renamed from: b */
    public Room f12958b;

    /* renamed from: c */
    public boolean f12959c;

    /* renamed from: d */
    AbstractC88412b f12960d;

    /* renamed from: e */
    AbstractC88412b f12961e;

    /* renamed from: f */
    public final Handler f12962f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public boolean f12963g;

    /* renamed from: h */
    public boolean f12964h;

    /* renamed from: i */
    public boolean f12965i;

    /* renamed from: j */
    public boolean f12966j;

    /* renamed from: k */
    public boolean f12967k;

    /* renamed from: l */
    public String f12968l;

    /* renamed from: m */
    public final boolean f12969m;

    /* renamed from: n */
    public C9613am f12970n;

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$ag */
    public static final class C4979ag<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4979ag f12982a = new C4979ag();

        static {
            Covode.recordClassIndex(5562);
        }

        C4979ag() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$b */
    public interface AbstractC4981b extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(5564);
        }

        /* renamed from: a */
        void mo10701a(C9614an anVar);

        /* renamed from: a */
        void mo10702a(C9642h hVar, AbstractC89171a<C89391z> aVar);

        /* renamed from: a */
        void mo10703a(String str);

        /* renamed from: b */
        void mo10704b(Throwable th);
    }

    static {
        Covode.recordClassIndex(5554);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$a */
    public static final class C4972a {
        static {
            Covode.recordClassIndex(5555);
        }

        private C4972a() {
        }

        public /* synthetic */ C4972a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10297a(com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.AbstractC4981b r13) {
        /*
        // Method dump skipped, instructions count: 517
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.mo10297a(com.bytedance.android.live.liveinteract.match.b.g.b$b):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo10695a(boolean z, C5703b.EnumC5705b bVar) {
        C4948b bVar2;
        if (this.f38654y != null) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "invite");
            long j = this.f12957a.f11961i;
            long c = C4947a.f12909a.mo10679c();
            long j2 = this.f12957a.f11958f;
            if (z != 0) {
                if (C4947a.f12910b.mo10672a() == EnumC4949c.NORMAL) {
                    bVar2 = C4947a.f12910b;
                } else {
                    return;
                }
            } else if (C4947a.f12909a.mo10672a() == EnumC4949c.NORMAL) {
                bVar2 = C4947a.f12909a;
            } else {
                return;
            }
            bVar2.mo10676a(EnumC4949c.INVITED, false);
            bVar2.f12914c = true;
            bVar2.f12913b = z;
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
            C5009a.m11205a(C5009a.f13036g, "invite_request", jSONObject, z, 8);
            C5009a.f13031b = System.currentTimeMillis();
            ((AbstractC11181z) ((LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class)).invite(j, c, j2, z).mo143274a(mo13750w())).mo17950a(new C4994n(this, z, bVar, bVar2), new C4995o(this, z, bVar, bVar2));
        }
    }

    /* renamed from: a */
    public final void mo10691a(AbstractC89171a<C89391z> aVar) {
        if (this.f38654y != null) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "cancel");
            C5009a.m11205a(C5009a.f13036g, "cancel_request", new JSONObject(), false, 12);
            C5009a.f13032c = System.currentTimeMillis();
            ((AbstractC11181z) ((LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class)).cancel(this.f12957a.f11961i, C4947a.f12909a.mo10679c(), C4947a.f12909a.mo10677b()).mo143274a(mo13750w())).mo17950a(new C4986g(aVar), new C4987h(this, aVar));
        }
    }

    /* renamed from: a */
    public final void mo10694a(Map<Long, C9642h> map, Map<Long, C11695b> map2) {
        m11175b(map2);
        this.f12967k = true;
        if (this.f12965i) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "dealResult, Battle state is End");
        } else if (C4947a.f12909a.mo10675a(EnumC4949c.PUNISH)) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "dealResult, Battle state is " + C4947a.f12909a.mo10672a() + ", return");
        } else if (this.f12966j) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "dealResult, current is showing result animation");
        } else {
            this.f12966j = true;
            Room room = this.f12958b;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            C9642h hVar = map.get(Long.valueOf(room.getOwnerUserId()));
            C4947a.f12909a.f12915d = hVar;
            C4947a.f12909a.f12916e = map.get(Long.valueOf(this.f12957a.f11958f));
            AbstractC4981b bVar = (AbstractC4981b) this.f38654y;
            if (bVar != null) {
                bVar.mo10702a(hVar, new C4990k(this, hVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo10692a(String str) {
        AbstractC88412b bVar;
        if (!this.f12965i) {
            this.f12965i = true;
            if (C4947a.f12909a.mo10676a(EnumC4949c.END, false)) {
                if (!this.f12959c) {
                    C5703b.m12463a(str);
                }
                C10095g.m18638f();
                C4947a.f12909a.f12927p = 0;
                DataChannel dataChannel = this.f18624w;
                if (dataChannel != null) {
                    dataChannel.mo28319c(C4491b.class);
                }
                AbstractC88412b bVar2 = this.f12960d;
                if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f12960d) == null)) {
                    bVar.dispose();
                }
                this.f12962f.removeCallbacksAndMessages(null);
                C4947a.m11148a("battle_end", 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo10693a(Map<Long, C9645j> map) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        C9631a aVar;
        C9649m mVar;
        C9646k kVar;
        C4947a.f12909a.f12931t.clear();
        for (Map.Entry<Long, C9645j> entry : map.entrySet()) {
            C4947a.f12909a.f12931t.put(entry.getKey(), Long.valueOf((long) entry.getValue().f23499a));
        }
        Room room = this.f12958b;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        C9645j jVar = map.get(Long.valueOf(room.getOwnerUserId()));
        if (jVar != null) {
            List<C9646k> list = jVar.f23500b;
            if (!(list == null || list.isEmpty() || (aVar = C4947a.f12909a.f12929r) == null || (mVar = aVar.f23478d) == null || mVar.f23511b <= 0)) {
                int i = mVar.f23511b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (!(i2 >= (list != null ? Integer.valueOf(list.size()) : null).intValue() || list == null || (kVar = list.get(i2)) == null)) {
                        long j = kVar.f23504a;
                        AbstractC6872f b = C11115u.m19743a().mo17915b();
                        C89219l.m154716b(b, "");
                        if (j == b.mo13161c()) {
                            C4947a.f12909a.f12930s = true;
                        }
                    }
                }
            }
            if (!(jVar == null || (dataChannel2 = this.f18624w) == null)) {
                dataChannel2.mo28315b(C4951b.class, Integer.valueOf(jVar.f23499a)).mo28315b(C4953d.class, jVar.f23500b);
            }
        }
        C9645j jVar2 = map.get(Long.valueOf(this.f12957a.f11958f));
        if (!(jVar2 == null || (dataChannel = this.f18624w) == null)) {
            dataChannel.mo28315b(C4957h.class, Integer.valueOf(jVar2.f23499a)).mo28315b(C4954e.class, jVar2.f23500b);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$d */
    public static final class RunnableC4983d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4971b f12985a;

        static {
            Covode.recordClassIndex(5566);
        }

        RunnableC4983d(C4971b bVar) {
            this.f12985a = bVar;
        }

        public final void run() {
            if (this.f12985a.f38654y != null) {
                this.f12985a.mo10686a();
            }
        }
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        AbstractC88412b bVar = this.f12960d;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f12961e;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.f12962f.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public final void mo10696c() {
        this.f12962f.postDelayed(new RunnableC4983d(this), 1000);
    }

    /* renamed from: e */
    public final void mo10698e() {
        if (C4947a.f12909a.mo10676a(EnumC4949c.FINISH, false)) {
            if (this.f12959c) {
                mo10688a(106, false, false, null);
            } else {
                mo10686a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$ad */
    static final class C4976ad implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C4971b f12974a;

        static {
            Covode.recordClassIndex(5559);
        }

        C4976ad(C4971b bVar) {
            this.f12974a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            C3854a.m9453a(4, "LinkPKPresenterTag", "startPunishCountDown, finish");
            DataChannel dataChannel = this.f12974a.f18624w;
            if (dataChannel != null) {
                dataChannel.mo28315b(C4955f.class, (Object) 0L);
            }
            if (this.f12974a.f12959c) {
                C5703b.m12472b(C5703b.EnumC5704a.TIME_OUT);
                this.f12974a.mo10687a((C4971b) 102, false, (boolean) null);
                return;
            }
            this.f12974a.mo10692a("punish_count_down");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$z */
    static final class C5008z implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C4971b f13028a;

        /* renamed from: b */
        final /* synthetic */ boolean f13029b;

        static {
            Covode.recordClassIndex(5591);
        }

        C5008z(C4971b bVar, boolean z) {
            this.f13028a = bVar;
            this.f13029b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            boolean z = this.f13029b;
            C5009a.m11205a(C5009a.f13036g, "open_message_timer_complete", new JSONObject(), z, 8);
            C3854a.m9453a(4, "LinkPKPresenterTag", "startBattleOpenTimeOutCountDown, finish");
            this.f13028a.mo10688a(107, true, false, null);
        }
    }

    public C4971b() {
        boolean z;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f12969m = z;
        this.f12957a = C4384b.C4385a.m10496a();
    }

    /* renamed from: f */
    public final void mo10699f() {
        String a;
        if (!this.f12965i) {
            C4384b.C4385a.m10496a();
            User user = (User) C4384b.m10480c("data_guest_user");
            if (user != null) {
                if (C4947a.f12909a.f12921j) {
                    a = C3966y.m9660a((int) R.string.e93, user.displayId);
                } else {
                    a = C3966y.m9660a((int) R.string.e94, user.displayId);
                }
                C11226ao.m19883a(C3966y.m9669e(), a, 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$p */
    public static final class RunnableC4996p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4971b f13012a;

        static {
            Covode.recordClassIndex(5579);
        }

        RunnableC4996p(C4971b bVar) {
            this.f13012a = bVar;
        }

        public final void run() {
            if (!C4947a.f12909a.mo10675a(EnumC4949c.FINISH) && !this.f13012a.f12959c) {
                C9636b bVar = new C9636b();
                C9640f fVar = new C9640f();
                fVar.f23487a = C3966y.m9657a((int) R.string.e82);
                bVar.f23479a = fVar;
                C9615ao aoVar = new C9615ao();
                C11778b bVar2 = new C11778b();
                bVar2.f28137c = C4971b.m11171b(this.f13012a).getId();
                bVar2.f28141g = true;
                aoVar.f28134O = bVar2;
                aoVar.f23365a = 3;
                aoVar.f23369i = bVar;
                aoVar.f23371k = true;
                this.f13012a.f18625x.insertMessage(aoVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$v */
    public static final class C5002v implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C4971b f13022a;

        static {
            Covode.recordClassIndex(5585);
        }

        C5002v(C4971b bVar) {
            this.f13022a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            C3854a.m9453a(4, "LinkPKPresenterTag", "BattleCountDown, finish");
            if (this.f13022a.f12969m) {
                ((AbstractC11181z) AbstractC88979t.m154307b(LiveTimeIncrementForBattleSetting.INSTANCE.getValue(), TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(this.f13022a.mo13748u())).mo17950a(new AbstractC88433f(this) {
                    /* class com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.C5002v.C50031 */

                    /* renamed from: a */
                    final /* synthetic */ C5002v f13023a;

                    static {
                        Covode.recordClassIndex(5586);
                    }

                    {
                        this.f13023a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f13023a.f13022a.mo10698e();
                    }
                }, new AbstractC88433f(this) {
                    /* class com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.C5002v.C50042 */

                    /* renamed from: a */
                    final /* synthetic */ C5002v f13024a;

                    static {
                        Covode.recordClassIndex(5587);
                    }

                    {
                        this.f13024a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f13024a.f13022a.mo10698e();
                    }
                });
            } else {
                this.f13022a.mo10698e();
            }
        }
    }

    /* renamed from: d */
    public final void mo10697d() {
        EnumC4949c a = C4947a.f12909a.mo10672a();
        if (a.compareTo((Enum) EnumC4949c.START) >= 0 && a.compareTo((Enum) EnumC4949c.END) < 0) {
            RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C5805e.m12718a().mo11572a(RoomSwitchApi.class);
            Room room = this.f12958b;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            ((AbstractC11181z) roomSwitchApi.updateSwitch(room.getId(), 6, true).mo143274a(mo13749v())).mo17950a(C4979ag.f12982a, C4980ah.f12983a);
        }
    }

    /* renamed from: g */
    public final void mo10700g() {
        C6805b<Boolean> bVar;
        AbstractC4981b bVar2;
        if (this.f12959c) {
            bVar = AbstractC6804a.f16974bW;
        } else {
            bVar = AbstractC6804a.f16975bX;
        }
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (!a.booleanValue() && EnableBattleUiNewStyleSetting.INSTANCE.getValue() != 2 && !TextUtils.isEmpty(this.f12968l) && C4947a.f12909a.mo10672a() == EnumC4949c.START && (bVar2 = (AbstractC4981b) this.f38654y) != null) {
            String str = this.f12968l;
            if (str == null) {
                C89219l.m154715b();
            }
            bVar2.mo10703a(str);
            C6806c.m14603a((C6800c) bVar, (Object) true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$k */
    public static final class C4990k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4971b f12993a;

        /* renamed from: b */
        final /* synthetic */ C9642h f12994b;

        static {
            Covode.recordClassIndex(5573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4990k(C4971b bVar, C9642h hVar) {
            super(0);
            this.f12993a = bVar;
            this.f12994b = hVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            long value;
            AbstractC88412b bVar;
            boolean z;
            this.f12993a.f12966j = false;
            if (this.f12993a.f12959c) {
                C5703b.m12460a(C5703b.EnumC5704a.TIME_OUT);
            }
            C9642h hVar = this.f12994b;
            if (hVar == null || hVar.f23491b != 2) {
                DataChannel dataChannel = this.f12993a.f18624w;
                if (dataChannel != null) {
                    C9642h hVar2 = this.f12994b;
                    if (hVar2 == null || hVar2.f23491b != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    dataChannel.mo28315b(C4950a.class, Boolean.valueOf(z));
                }
                C4971b bVar2 = this.f12993a;
                if (C4947a.f12909a.mo10676a(EnumC4949c.PUNISH, false)) {
                    C4947a.f12909a.f12927p = System.currentTimeMillis();
                    if (C4947a.f12909a.f12928q > 0) {
                        value = C4947a.f12909a.f12928q;
                    } else {
                        value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                    }
                    C4947a.f12909a.f12920i = value;
                    boolean z2 = bVar2.f12959c;
                    JSONObject jSONObject = new JSONObject();
                    C3866a.m9474a(jSONObject, "count", value);
                    if (z2) {
                        C5009a.m11205a(C5009a.f13036g, "punish_start", jSONObject, false, 12);
                    } else {
                        C5009a.f13036g.mo10708a("punish_start", jSONObject, 0);
                    }
                    C3854a.m9453a(4, "LinkPKPresenterTag", "startPunishCountDown, timeSecond = ".concat(String.valueOf(value)));
                    if (value > 0) {
                        DataChannel dataChannel2 = bVar2.f18624w;
                        if (dataChannel2 != null) {
                            dataChannel2.mo28315b(C4955f.class, Long.valueOf(value));
                        }
                        AbstractC88412b bVar3 = bVar2.f12960d;
                        if (!(bVar3 == null || bVar3.isDisposed() || (bVar = bVar2.f12960d) == null)) {
                            bVar.dispose();
                        }
                        bVar2.f12960d = ((AbstractC11181z) C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(value).mo143292d(new C4973aa(value)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(bVar2.mo13748u())).mo17951a(new C4974ab(bVar2), new C4975ac(bVar2), new C4976ad(bVar2));
                    }
                }
            } else {
                this.f12993a.mo10692a("finish_draw");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo10686a() {
        if (this.f38654y != null && !this.f12964h) {
            this.f12964h = true;
            long c = C4947a.f12909a.mo10679c();
            long b = C4947a.f12909a.mo10677b();
            C5009a.m11206a("audience_result");
            LinkBattleApi linkBattleApi = (LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class);
            Room room = this.f12958b;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            long id = room.getId();
            Room room2 = this.f12958b;
            if (room2 == null) {
                C89219l.m154710a("mRoom");
            }
            ((AbstractC11181z) linkBattleApi.getInfo(id, c, b, room2.getOwnerUserId()).mo143274a(mo13750w())).mo17950a(new C4984e(this), new C4985f(this));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$aa */
    static final class C4973aa<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ long f12971a;

        static {
            Covode.recordClassIndex(5556);
        }

        C4973aa(long j) {
            this.f12971a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(this.f12971a - ((Number) obj).longValue());
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$ah */
    public static final class C4980ah<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4980ah f12983a = new C4980ah();

        static {
            Covode.recordClassIndex(5563);
        }

        C4980ah() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$s */
    public static final class C4999s<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ long f13019a;

        static {
            Covode.recordClassIndex(5582);
        }

        C4999s(long j) {
            this.f13019a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(this.f13019a - ((Number) obj).longValue());
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$w */
    static final class C5005w<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ long f13025a;

        static {
            Covode.recordClassIndex(5588);
        }

        C5005w(long j) {
            this.f13025a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(this.f13025a - ((Number) obj).longValue());
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Room m11171b(C4971b bVar) {
        Room room = bVar.f12958b;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        return room;
    }

    /* renamed from: c */
    private static /* synthetic */ long m11176c(C4971b bVar) {
        return bVar.mo10685a(System.currentTimeMillis());
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$ac */
    static final class C4975ac<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12973a;

        static {
            Covode.recordClassIndex(5558);
        }

        C4975ac(C4971b bVar) {
            this.f12973a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C3854a.m9453a(4, "LinkPKPresenterTag", "startPunishCountDown, throwable = ".concat(String.valueOf(th)));
            C4971b bVar = this.f12973a;
            if (th == null) {
                C89219l.m154715b();
            }
            bVar.mo13747a(th);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$ae */
    static final class C4977ae<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f12975a;

        /* renamed from: b */
        final /* synthetic */ HashMap f12976b;

        /* renamed from: c */
        final /* synthetic */ int f12977c;

        static {
            Covode.recordClassIndex(5560);
        }

        C4977ae(boolean z, HashMap hashMap, int i) {
            this.f12975a = z;
            this.f12976b = hashMap;
            this.f12977c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5009a.m11220b(this.f12975a, "other", this.f12976b);
            C4947a.m11148a("reject", this.f12977c);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$af */
    static final class C4978af<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12978a;

        /* renamed from: b */
        final /* synthetic */ boolean f12979b;

        /* renamed from: c */
        final /* synthetic */ HashMap f12980c;

        /* renamed from: d */
        final /* synthetic */ int f12981d;

        static {
            Covode.recordClassIndex(5561);
        }

        C4978af(C4971b bVar, boolean z, HashMap hashMap, int i) {
            this.f12978a = bVar;
            this.f12979b = z;
            this.f12980c = hashMap;
            this.f12981d = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4971b bVar = this.f12978a;
            if (th == null) {
                C89219l.m154715b();
            }
            bVar.mo13747a(th);
            C5009a.m11216a(this.f12979b, "other", th, this.f12980c);
            C4947a.m11148a("reject", this.f12981d);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$j */
    public static final class C4989j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12992a;

        static {
            Covode.recordClassIndex(5572);
        }

        C4989j(C4971b bVar) {
            this.f12992a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C3854a.m9453a(4, "LinkPKPresenterTag", "checkBattleInfo, failed");
            C5009a.m11208a("audience_start", th);
            C4971b bVar = this.f12992a;
            if (th == null) {
                C89219l.m154715b();
            }
            bVar.mo13747a(th);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$u */
    public static final class C5001u<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f13021a;

        static {
            Covode.recordClassIndex(5584);
        }

        C5001u(C4971b bVar) {
            this.f13021a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C3854a.m9453a(4, "LinkPKPresenterTag", "BattleCountDown, throwable = ".concat(String.valueOf(th)));
            C4971b bVar = this.f13021a;
            if (th == null) {
                C89219l.m154715b();
            }
            bVar.mo13747a(th);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$x */
    static final class C5006x<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5006x f13026a = new C5006x();

        static {
            Covode.recordClassIndex(5589);
        }

        C5006x() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "startBattleOpenTimeOutCountDown, countdownTime = ".concat(String.valueOf(((Number) obj).longValue())));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$y */
    static final class C5007y<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f13027a;

        static {
            Covode.recordClassIndex(5590);
        }

        C5007y(C4971b bVar) {
            this.f13027a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C3854a.m9453a(4, "LinkPKPresenterTag", "startBattleOpenTimeOutCountDown, throwable = ".concat(String.valueOf(th)));
            C4971b bVar = this.f13027a;
            if (th == null) {
                C89219l.m154715b();
            }
            bVar.mo13747a(th);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$ab */
    static final class C4974ab<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12972a;

        static {
            Covode.recordClassIndex(5557);
        }

        C4974ab(C4971b bVar) {
            this.f12972a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue() - 1;
            C3854a.m9453a(4, "LinkPKPresenterTag", "startPunishCountDown, countdownTime = ".concat(String.valueOf(longValue)));
            DataChannel dataChannel = this.f12972a.f18624w;
            if (dataChannel != null) {
                dataChannel.mo28315b(C4955f.class, Long.valueOf(longValue));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$f */
    public static final class C4985f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12987a;

        static {
            Covode.recordClassIndex(5568);
        }

        C4985f(C4971b bVar) {
            this.f12987a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f12987a.f12964h = false;
            if (this.f12987a.f38654y != null) {
                C5009a.m11208a("audience_result", th);
                C3854a.m9453a(4, "LinkPKPresenterTag", "audienceSyncBattleInfo, failed");
                C4971b bVar = this.f12987a;
                if (th == null) {
                    C89219l.m154715b();
                }
                bVar.mo13747a(th);
                this.f12987a.mo10696c();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$g */
    public static final class C4986g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f12988a;

        static {
            Covode.recordClassIndex(5569);
        }

        C4986g(AbstractC89171a aVar) {
            this.f12988a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89171a aVar = this.f12988a;
            if (aVar != null) {
                aVar.invoke();
            }
            C3854a.m9453a(4, "LinkPKPresenterTag", "cancel, success");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13032c);
            C5009a.m11205a(C5009a.f13036g, "cancel_succeed", jSONObject, false, 12);
            C4947a.m11148a("cancel_success", 0);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$h */
    public static final class C4987h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12989a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f12990b;

        static {
            Covode.recordClassIndex(5570);
        }

        C4987h(C4971b bVar, AbstractC89171a aVar) {
            this.f12989a = bVar;
            this.f12990b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            JSONObject jSONObject = new JSONObject();
            C5009a.m12488a(jSONObject, th);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13032c);
            C5009a.m11210a("cancel_failed", jSONObject, false, 1);
            AbstractC89171a aVar = this.f12990b;
            if (aVar != null) {
                aVar.invoke();
            }
            C3854a.m9453a(4, "LinkPKPresenterTag", "cancel, failed");
            AbstractC4981b bVar = (AbstractC4981b) this.f12989a.f38654y;
            if (bVar != null) {
                bVar.mo10704b(th);
            }
            if (th != null) {
                this.f12989a.mo13747a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$t */
    public static final class C5000t<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f13020a;

        static {
            Covode.recordClassIndex(5583);
        }

        C5000t(C4971b bVar) {
            this.f13020a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue() - 1;
            C3854a.m9453a(4, "LinkPKPresenterTag", "BattleCountDown, countdownTime = ".concat(String.valueOf(longValue)));
            DataChannel dataChannel = this.f13020a.f18624w;
            if (dataChannel != null) {
                dataChannel.mo28315b(C4960k.class, Long.valueOf(longValue));
            }
        }
    }

    /* renamed from: b */
    private final void m11174b(C9614an anVar) {
        List<C9651o> list = anVar.f23360k;
        if (list != null) {
            HashMap hashMap = new HashMap();
            for (T t : list) {
                if (!(t.f23514a == null || t.f23515b == null)) {
                    Long l = t.f23514a;
                    if (l == null) {
                        C89219l.m154715b();
                    }
                    C9645j jVar = t.f23515b;
                    if (jVar == null) {
                        C89219l.m154715b();
                    }
                    hashMap.put(l, jVar);
                }
            }
            mo10693a(hashMap);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$c */
    public static final class C4982c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4971b f12984a;

        static {
            Covode.recordClassIndex(5565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4982c(C4971b bVar) {
            super(1);
            this.f12984a = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C4971b bVar = this.f12984a;
            long value = LiveInteractBattleOpenTimeoutSetting.INSTANCE.getValue();
            AbstractC88412b bVar2 = bVar.f12961e;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "count", String.valueOf((int) value));
            C5009a.m11205a(C5009a.f13036g, "open_message_timer_start", jSONObject, booleanValue, 8);
            bVar.f12961e = ((AbstractC11181z) C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(value).mo143292d(new C5005w(value)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(bVar.mo13748u())).mo17951a(C5006x.f13026a, new C5007y(bVar), new C5008z(bVar, booleanValue));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$e */
    public static final class C4984e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12986a;

        static {
            Covode.recordClassIndex(5567);
        }

        C4984e(C4971b bVar) {
            this.f12986a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            this.f12986a.f12964h = false;
            if (this.f12986a.f38654y != null) {
                C11696c cVar = (C11696c) dVar.data;
                String b = C4139e.C4140a.f11576c.mo46674b(cVar);
                C89219l.m154716b(b, "");
                C5009a.m11207a("audience_result", b);
                C3854a.m9453a(4, "LinkPKPresenterTag", "audienceSyncBattleInfo, info = ".concat(String.valueOf(cVar)));
                C9644i iVar = cVar.f27984c;
                if (iVar == null) {
                    return;
                }
                if (iVar.f23497e > 1) {
                    Map<Long, C9642h> map = cVar.f27986e;
                    if (map != null) {
                        if (this.f12986a.f12967k && this.f12986a.f12970n != null) {
                            C9613am amVar = this.f12986a.f12970n;
                            if (amVar == null) {
                                C89219l.m154715b();
                            }
                            C5009a.m11211a(map, amVar, this.f12986a.f12959c);
                        }
                        this.f12986a.mo10694a(map, cVar.f27991j);
                        return;
                    }
                    return;
                }
                this.f12986a.mo10696c();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$m */
    public static final class C4992m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12999a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13000b;

        /* renamed from: c */
        final /* synthetic */ boolean f13001c;

        /* renamed from: d */
        final /* synthetic */ boolean f13002d;

        static {
            Covode.recordClassIndex(5575);
        }

        C4992m(C4971b bVar, AbstractC89171a aVar, boolean z, boolean z2) {
            this.f12999a = bVar;
            this.f13000b = aVar;
            this.f13001c = z;
            this.f13002d = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC89171a aVar = this.f13000b;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f12999a.f12963g = false;
            if (this.f12999a.f38654y != null) {
                boolean z = this.f13001c;
                boolean z2 = this.f13002d;
                JSONObject jSONObject = new JSONObject();
                C5009a.m12488a(jSONObject, th);
                C3866a.m9475a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
                C3866a.m9475a(jSONObject, "other_left", String.valueOf(z2 ? 1 : 0));
                C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13034e);
                C5009a.m11210a("battle_finish_failed", jSONObject, false, 1);
                C3854a.m9453a(4, "LinkPKPresenterTag", "finish, failed");
                if (!this.f13001c) {
                    this.f12999a.f12962f.postDelayed(new Runnable(this) {
                        /* class com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.C4992m.RunnableC49931 */

                        /* renamed from: a */
                        final /* synthetic */ C4992m f13003a;

                        static {
                            Covode.recordClassIndex(5576);
                        }

                        {
                            this.f13003a = r1;
                        }

                        public final void run() {
                            this.f13003a.f12999a.mo10688a(105, false, false, null);
                        }
                    }, 1000);
                }
                C4971b bVar = this.f12999a;
                if (th == null) {
                    C89219l.m154715b();
                }
                bVar.mo13747a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$q */
    public static final class C4997q<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f13013a;

        /* renamed from: b */
        final /* synthetic */ boolean f13014b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f13015c;

        static {
            Covode.recordClassIndex(5580);
        }

        C4997q(C4971b bVar, boolean z, AbstractC89171a aVar) {
            this.f13013a = bVar;
            this.f13014b = z;
            this.f13015c = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "punish, success");
            if (this.f13014b) {
                this.f13013a.mo10692a("punish_cut_short_request");
            }
            boolean z = this.f13014b;
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13035f);
            C5009a.m11205a(C5009a.f13036g, "punish_finish_succeed", jSONObject, false, 12);
            AbstractC89171a aVar = this.f13015c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$r */
    public static final class C4998r<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f13016a;

        /* renamed from: b */
        final /* synthetic */ boolean f13017b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f13018c;

        static {
            Covode.recordClassIndex(5581);
        }

        C4998r(C4971b bVar, boolean z, AbstractC89171a aVar) {
            this.f13016a = bVar;
            this.f13017b = z;
            this.f13018c = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C3854a.m9453a(4, "LinkPKPresenterTag", "punish, failed");
            boolean z = this.f13017b;
            JSONObject jSONObject = new JSONObject();
            C5009a.m12488a(jSONObject, th);
            C3866a.m9475a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13035f);
            C5009a.m11210a("punish_finish_failed", jSONObject, false, 1);
            AbstractC89171a aVar = this.f13018c;
            if (aVar != null) {
                aVar.invoke();
            }
            C4971b bVar = this.f13016a;
            if (th == null) {
                C89219l.m154715b();
            }
            bVar.mo13747a(th);
        }
    }

    /* renamed from: b */
    private final void m11172b(long j) {
        AbstractC88412b bVar;
        C3854a.m9453a(4, "LinkPKPresenterTag", "BattleCountDown, timeSecond = ".concat(String.valueOf(j)));
        if (j > 0) {
            DataChannel dataChannel = this.f18624w;
            if (dataChannel != null) {
                dataChannel.mo28315b(C4960k.class, Long.valueOf(j));
            }
            AbstractC88412b bVar2 = this.f12960d;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f12960d) == null)) {
                bVar.dispose();
            }
            this.f12960d = ((AbstractC11181z) C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(j).mo143292d(new C4999s(j)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(mo13748u())).mo17951a(new C5000t(this), new C5001u(this), new C5002v(this));
        }
    }

    /* renamed from: a */
    public final long mo10685a(long j) {
        long value;
        C9644i iVar = C4947a.f12909a.f12912a;
        if (this.f12959c || iVar == null) {
            value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            C3854a.m9453a(4, "LinkPKPresenterTag", "getBattleRemainSecond, currentTime  = " + j + ", localTime = " + System.currentTimeMillis());
            if (j <= 0) {
                j = System.currentTimeMillis();
            }
            value = ((long) iVar.f23496d) - (Math.max(0L, j - iVar.f23495c) / 1000);
        }
        C3854a.m9453a(4, "LinkPKPresenterTag", "getBattleRemainSecond, remainSecond  = ".concat(String.valueOf(value)));
        return value;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$l */
    public static final class C4991l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12995a;

        /* renamed from: b */
        final /* synthetic */ boolean f12996b;

        /* renamed from: c */
        final /* synthetic */ boolean f12997c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f12998d;

        static {
            Covode.recordClassIndex(5574);
        }

        C4991l(C4971b bVar, boolean z, boolean z2, AbstractC89171a aVar) {
            this.f12995a = bVar;
            this.f12996b = z;
            this.f12997c = z2;
            this.f12998d = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            this.f12995a.f12963g = false;
            Map<Long, C9642h> map = ((C5010a) dVar.data).f13040a;
            if (this.f12995a.f12967k && this.f12995a.f12970n != null) {
                C9613am amVar = this.f12995a.f12970n;
                if (amVar == null) {
                    C89219l.m154715b();
                }
                C5009a.m11211a(map, amVar, this.f12995a.f12959c);
            }
            boolean z = this.f12996b;
            boolean z2 = this.f12997c;
            String b = C4139e.C4140a.f11576c.mo46674b(map);
            C89219l.m154716b(b, "");
            C89219l.m154721d(b, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            C3866a.m9475a(jSONObject, "other_left", String.valueOf(z2 ? 1 : 0));
            C3866a.m9475a(jSONObject, "response", b);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13034e);
            C5009a.m11205a(C5009a.f13036g, "battle_finish_succeed", jSONObject, false, 12);
            C3854a.m9453a(4, "LinkPKPresenterTag", "finish, battleResult = ".concat(String.valueOf(map)));
            if (this.f12995a.f12965i) {
                C3854a.m9453a(4, "LinkPKPresenterTag", "dealResult, Battle state is End, return");
                AbstractC89171a aVar = this.f12998d;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (C4947a.f12909a.mo10675a(EnumC4949c.PUNISH)) {
                C3854a.m9453a(4, "LinkPKPresenterTag", "dealResult, Battle state is punish, return");
                AbstractC89171a aVar2 = this.f12998d;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else {
                C4947a.f12909a.f12921j = this.f12996b;
                C4947a.f12909a.f12922k = this.f12996b;
                if (this.f12996b) {
                    this.f12995a.mo10699f();
                    this.f12995a.mo10692a("cut_short_request");
                } else {
                    Map<Long, C9645j> map2 = ((C5010a) dVar.data).f13042c;
                    if (map2 != null) {
                        this.f12995a.mo10693a(map2);
                    }
                    this.f12995a.mo10694a(map, ((C5010a) dVar.data).f13041b);
                }
                C3854a.m9453a(3, "LinkPKPresenterTag", "finish, success, callback");
                AbstractC89171a aVar3 = this.f12998d;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$n */
    public static final class C4994n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f13004a;

        /* renamed from: b */
        final /* synthetic */ boolean f13005b;

        /* renamed from: c */
        final /* synthetic */ C5703b.EnumC5705b f13006c;

        /* renamed from: d */
        final /* synthetic */ C4948b f13007d;

        static {
            Covode.recordClassIndex(5577);
        }

        C4994n(C4971b bVar, boolean z, C5703b.EnumC5705b bVar2, C4948b bVar3) {
            this.f13004a = bVar;
            this.f13005b = z;
            this.f13006c = bVar2;
            this.f13007d = bVar3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            C89219l.m154721d(dVar, "");
            if (this.f13004a.f38654y != null) {
                C5013b bVar = (C5013b) dVar.data;
                C3854a.m9453a(4, "LinkPKPresenterTag", "invite, result = ".concat(String.valueOf(bVar)));
                int i = bVar.f13045b;
                this.f13004a.f18624w.mo28311a(C4391ae.class, Integer.valueOf(i));
                if (i <= 1) {
                    C5703b.m12467a(this.f13005b, 1, this.f13006c);
                    return;
                }
                this.f13007d.mo10673a(bVar.f13044a);
                boolean z = this.f13005b;
                String b = C4139e.C4140a.f11576c.mo46674b(bVar);
                C89219l.m154716b(b, "");
                C89219l.m154721d(b, "");
                JSONObject jSONObject = new JSONObject();
                C3866a.m9475a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
                C3866a.m9475a(jSONObject, "response", b);
                C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13031b);
                C5009a.m11205a(C5009a.f13036g, "invite_succeed", jSONObject, z, 8);
                C5703b.m12467a(this.f13005b, 0, this.f13006c);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$o */
    public static final class C4995o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f13008a;

        /* renamed from: b */
        final /* synthetic */ boolean f13009b;

        /* renamed from: c */
        final /* synthetic */ C5703b.EnumC5705b f13010c;

        /* renamed from: d */
        final /* synthetic */ C4948b f13011d;

        static {
            Covode.recordClassIndex(5578);
        }

        C4995o(C4971b bVar, boolean z, C5703b.EnumC5705b bVar2, C4948b bVar3) {
            this.f13008a = bVar;
            this.f13009b = z;
            this.f13010c = bVar2;
            this.f13011d = bVar3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.f13008a.f38654y != null && th != null) {
                C3854a.m9453a(4, "LinkPKPresenterTag", "invite, failed");
                boolean z = this.f13009b;
                JSONObject jSONObject = new JSONObject();
                C3866a.m9475a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
                C5009a.m12488a(jSONObject, th);
                C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13031b);
                C5009a.m11210a("invite_failed", jSONObject, z, 1);
                this.f13008a.mo13747a(th);
                if (th instanceof C2912a) {
                    C5703b.m12467a(this.f13009b, 1, this.f13010c);
                    C2912a aVar = (C2912a) th;
                    if (!TextUtils.isEmpty(aVar.getPrompt())) {
                        C11226ao.m19883a(C3966y.m9669e(), aVar.getPrompt(), 0);
                    } else {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eb8);
                    }
                    this.f13011d.mo10678b(this.f13009b, "invite_failed");
                    return;
                }
                C5703b.m12467a(this.f13009b, 2, this.f13010c);
                this.f13011d.mo10678b(this.f13009b, "invite_failed");
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gkv);
            }
        }
    }

    /* renamed from: a */
    private final void m11169a(C9614an anVar) {
        Integer valueOf;
        C3854a.m9453a(4, "LinkPKPresenterTag", "checkBattleInfo, info = " + anVar.getMessageId());
        C4947a.f12909a.f12912a = anVar.f23356g;
        C4947a.f12909a.f12929r = anVar.f23358i;
        Map<Long, C9642h> map = anVar.f23357h;
        long c = m11176c(this);
        C9644i iVar = anVar.f23356g;
        if (!(iVar == null || (valueOf = Integer.valueOf(iVar.f23497e)) == null)) {
            if (valueOf.intValue() == 1) {
                if (c > 0) {
                    C5703b.m12471b();
                    List<C9648l> list = anVar.f23361l;
                    if (list != null) {
                        for (T t : list) {
                            Long l = t.f23508a;
                            Room room = this.f12958b;
                            if (room == null) {
                                C89219l.m154710a("mRoom");
                            }
                            long ownerUserId = room.getOwnerUserId();
                            if (l != null && l.longValue() == ownerUserId) {
                                C4947a.f12909a.f12932u = t.f23509b;
                            } else {
                                long j = this.f12957a.f11958f;
                                Long l2 = t.f23508a;
                                if (l2 != null && j == l2.longValue()) {
                                    C4947a.f12909a.f12933v = t.f23509b;
                                } else {
                                    C3854a.m9453a(6, "LinkPKPresenterTag", "handleBattleInfo error, anchorInfo unknown user id");
                                }
                            }
                        }
                    }
                    C4947a.f12909a.f12924m = true;
                    mo10689a(c, anVar.f23359j);
                    m11174b(anVar);
                    this.f12968l = C8983b.m17319a().mo15219a("pm_mt_live_rulesofmatch");
                    mo10700g();
                    return;
                }
                return;
            } else if (valueOf.intValue() == 3) {
                long value = c + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                if (value > 0) {
                    C4947a.f12909a.f12928q = value;
                    m11174b(anVar);
                    if (map != null) {
                        mo10694a(map, anVar.f23359j);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C4947a.m11148a("check_info", 0);
    }

    /* renamed from: b */
    private final void m11175b(Map<Long, C11695b> map) {
        if (map != null) {
            C4948b bVar = C4947a.f12909a;
            Room room = this.f12958b;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            bVar.f12917f = map.get(Long.valueOf(room.getOwnerUserId()));
            C4947a.f12909a.f12918g = map.get(Long.valueOf(this.f12957a.f11958f));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.b$i */
    public static final class C4988i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4971b f12991a;

        static {
            Covode.recordClassIndex(5571);
        }

        C4988i(C4971b bVar) {
            this.f12991a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            Integer num;
            C11697d dVar;
            C11697d dVar2;
            C5832d dVar3 = (C5832d) obj;
            if (this.f12991a.f38654y != null) {
                C11696c cVar = (C11696c) dVar3.data;
                String b = C4139e.C4140a.f11576c.mo46674b(cVar);
                C89219l.m154716b(b, "");
                C5009a.m11207a("audience_start", b);
                C3854a.m9453a(4, "LinkPKPresenterTag", "checkBattleInfo, info = ".concat(String.valueOf(cVar)));
                C4947a.f12909a.f12912a = cVar.f27984c;
                C4947a.f12909a.f12929r = cVar.f27990i;
                Map<Long, C9642h> map = cVar.f27986e;
                C4971b bVar = this.f12991a;
                Extra extra = dVar3.extra;
                if (extra != null) {
                    j = extra.now;
                } else {
                    j = 0;
                }
                long a = bVar.mo10685a(j);
                C9644i iVar = cVar.f27984c;
                Boolean bool = null;
                if (iVar != null) {
                    num = Integer.valueOf(iVar.f23497e);
                } else {
                    num = null;
                }
                boolean z = false;
                if (num != null) {
                    if (num.intValue() == 1) {
                        if (a > 0) {
                            C5703b.m12471b();
                            Map<Long, C11697d> map2 = cVar.f27987f;
                            C4948b bVar2 = C4947a.f12909a;
                            if (map2 != null) {
                                dVar = map2.get(Long.valueOf(C4971b.m11171b(this.f12991a).getOwnerUserId()));
                            } else {
                                dVar = null;
                            }
                            bVar2.f12932u = dVar;
                            C4948b bVar3 = C4947a.f12909a;
                            if (map2 != null) {
                                dVar2 = map2.get(Long.valueOf(this.f12991a.f12957a.f11958f));
                            } else {
                                dVar2 = null;
                            }
                            bVar3.f12933v = dVar2;
                            Map<Long, Boolean> map3 = cVar.f27989h;
                            if (map3 != null) {
                                bool = map3.get(1L);
                            }
                            C4948b bVar4 = C4947a.f12909a;
                            if (bool != null) {
                                z = bool.booleanValue();
                            }
                            bVar4.f12924m = z;
                            this.f12991a.mo10689a(a, cVar.f27991j);
                            Map<Long, C9645j> map4 = cVar.f27985d;
                            if (map4 != null) {
                                this.f12991a.mo10693a(map4);
                            }
                            this.f12991a.f12968l = cVar.f27988g;
                            this.f12991a.mo10700g();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        long value = a + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                        if (value > 0) {
                            C4947a.f12909a.f12928q = value;
                            Map<Long, C9645j> map5 = cVar.f27985d;
                            if (map5 != null) {
                                this.f12991a.mo10693a(map5);
                            }
                            if (map != null) {
                                this.f12991a.mo10694a(map, cVar.f27991j);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                C4947a.m11148a("check_info", 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0534, code lost:
        if (r8 < r0) goto L_0x0536;
     */
    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.p2082ss.ugc.live.sdk.message.data.IMessage r19) {
        /*
        // Method dump skipped, instructions count: 1644
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* renamed from: a */
    private static boolean m11170a(long j, boolean z) {
        C4948b bVar;
        if (z) {
            bVar = C4947a.f12910b;
        } else {
            bVar = C4947a.f12909a;
        }
        if (j == bVar.mo10677b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10689a(long j, Map<Long, C11695b> map) {
        C10095g.m18637e();
        this.f12965i = false;
        this.f12967k = false;
        m11175b(map);
        C4947a.f12909a.mo10676a(EnumC4949c.START, true);
        C4947a.f12909a.f12926o = System.currentTimeMillis();
        C4947a.f12909a.f12919h = j;
        C5009a.m11214a(this.f12959c, j);
        m11172b(j);
        this.f12962f.removeCallbacksAndMessages(null);
        if (j > 1) {
            this.f12962f.postDelayed(new RunnableC4996p(this), 1000);
        }
    }

    /* renamed from: a */
    public final void mo10687a(int i, boolean z, AbstractC89171a<C89391z> aVar) {
        if (this.f38654y != null) {
            C3854a.m9453a(4, "LinkPKPresenterTag", "punish, cutShort = ".concat(String.valueOf(z)));
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "source", String.valueOf(i));
            C3866a.m9475a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            C5009a.m11205a(C5009a.f13036g, "punish_finish_request", jSONObject, false, 12);
            C5009a.f13035f = System.currentTimeMillis();
            C4947a.f12909a.f12923l = z;
            long c = C4947a.f12909a.mo10679c();
            LinkBattleApi linkBattleApi = (LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class);
            Room room = this.f12958b;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            ((AbstractC11181z) linkBattleApi.punish(room.getId(), c, z).mo143274a(mo13750w())).mo17950a(new C4997q(this, z, aVar), new C4998r(this, z, aVar));
            if (!z) {
                mo10692a("punish_request");
            }
        }
    }

    /* renamed from: a */
    public final void mo10688a(int i, boolean z, boolean z2, AbstractC89171a<C89391z> aVar) {
        C3854a.m9453a(4, "LinkPKPresenterTag", "finish, cutShort = " + z + "  isFinishing = " + this.f12963g);
        if (this.f38654y == null) {
            if (aVar != null) {
                aVar.invoke();
            }
            C3854a.m9453a(4, "LinkPKPresenterTag", "finish, viewInterface == null");
        } else if (!this.f12963g) {
            this.f12963g = true;
            long c = C4947a.f12909a.mo10679c();
            long b = C4947a.f12909a.mo10677b();
            long j = C4384b.C4385a.m10496a().f11958f;
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "source", String.valueOf(i));
            C3866a.m9475a(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
            C3866a.m9475a(jSONObject, "other_left", String.valueOf(z2 ? 1 : 0));
            C5009a.m11205a(C5009a.f13036g, "battle_finish_request", jSONObject, false, 12);
            C5009a.f13034e = System.currentTimeMillis();
            ((AbstractC11181z) ((LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class)).finish(c, b, z, z2, j).mo143274a(mo13750w())).mo17950a(new C4991l(this, z, z2, aVar), new C4992m(this, aVar, z, z2));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
