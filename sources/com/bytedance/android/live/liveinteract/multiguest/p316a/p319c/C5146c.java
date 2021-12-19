package com.bytedance.android.live.liveinteract.multiguest.p316a.p319c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.model.C7605d;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c */
public final class C5146c implements OnMessageListener {

    /* renamed from: a */
    public static final C88411a f13333a = new C88411a();

    /* renamed from: b */
    public static final Map<Long, String> f13334b = new LinkedHashMap();

    /* renamed from: c */
    public static IMessageManager f13335c;

    /* renamed from: d */
    public static boolean f13336d;

    /* renamed from: e */
    public static Set<Long> f13337e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public static final C5146c f13338f = new C5146c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c$c */
    public static final class C5149c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5149c f13342a = new C5149c();

        static {
            Covode.recordClassIndex(5741);
        }

        C5149c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c$d */
    public static final class C5150d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5150d f13343a = new C5150d();

        static {
            Covode.recordClassIndex(5742);
        }

        C5150d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c$f */
    static final class C5152f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5152f f13345a = new C5152f();

        static {
            Covode.recordClassIndex(5744);
        }

        C5152f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C5146c() {
    }

    static {
        Covode.recordClassIndex(5738);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c$e */
    static final class C5151e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f13344a;

        static {
            Covode.recordClassIndex(5743);
        }

        C5151e(long j) {
            this.f13344a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5146c.m11382a(this.f13344a, true);
        }
    }

    /* renamed from: a */
    public static final String m11381a(long j) {
        String str = f13334b.get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        C89219l.m154721d(iMessage, "");
        if (iMessage instanceof C9627ay) {
            User user = ((C9627ay) iMessage).f23444f;
            if (user != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            m11382a(j, true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c$b */
    public static final class C5148b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f13340a;

        /* renamed from: b */
        final /* synthetic */ User f13341b;

        static {
            Covode.recordClassIndex(5740);
        }

        public C5148b(long j, User user) {
            this.f13340a = j;
            this.f13341b = user;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            long j = this.f13340a;
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", j);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14492g);
            C5714i.m12488a(jSONObject, th);
            C5714i.m12550a(true, "invite_failed", jSONObject, 1);
            C5146c.m11382a(this.f13340a, false);
            if (th instanceof C2912a) {
                C11264f.m19957a(C3966y.m9669e(), th);
                return;
            }
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.e7y, this.f13341b.displayId), 0);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.c$a */
    public static final class C5147a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f13339a;

        static {
            Covode.recordClassIndex(5739);
        }

        public C5147a(long j) {
            this.f13339a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C7605d dVar;
            C5832d dVar2 = (C5832d) obj;
            long j = this.f13339a;
            if (dVar2 == null || (dVar = (C7605d) dVar2.data) == null || (str = dVar.f18861e) == null) {
                str = "";
            }
            C89219l.m154721d(str, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", j);
            long currentTimeMillis = System.currentTimeMillis() - C5714i.f14492g;
            C3866a.m9474a(jSONObject, "cost", currentTimeMillis);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
            C5714i.m12543a(jSONObject, Long.valueOf(j), str);
            C3866a.m9474a(jSONObject, "invite_service_timestamp", (System.currentTimeMillis() + C11225an.f26870a) - currentTimeMillis);
            C5714i.m12531a(C5714i.f14494j, true, "invite_succeed", jSONObject);
            C5146c.f13333a.mo142945a(AbstractC88979t.m154307b(2, TimeUnit.MINUTES).mo143254a(new C5151e(this.f13339a), C5152f.f13345a));
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8o);
            Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
            if (a instanceof C5271a) {
                C5713h.m12506a(this.f13339a, ((C5271a) a).f13646q);
            } else {
                C5713h.m12506a(this.f13339a, (EnumC4422k) null);
            }
        }
    }

    /* renamed from: a */
    public static final void m11382a(long j, boolean z) {
        if (f13337e.contains(Long.valueOf(j))) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                long id = room.getId();
                if (id != 0 && z) {
                    String a = C6898g.C6899a.f17285a.mo13196a(j);
                    if (a == null) {
                        a = "";
                    }
                    C5714i.m12530a(j, a);
                    C88411a aVar = f13333a;
                    int i = LinkApi.EnumC7284b.Invite.val;
                    C6894d a2 = C6894d.m14753a();
                    C89219l.m154716b(a2, "");
                    aVar.mo142945a(((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).anchorCancelInviteGuest(id, id, j, i, a2.f17274u).mo143254a(C5149c.f13342a, C5150d.f13343a));
                }
            }
            f13337e.remove(Long.valueOf(j));
            f13334b.remove(Long.valueOf(j));
        }
    }
}
