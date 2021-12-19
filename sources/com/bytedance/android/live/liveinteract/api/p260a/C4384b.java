package com.bytedance.android.live.liveinteract.api.p260a;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.liveinteract.api.C4400an;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.livesdk.chatroom.interact.model.C7610h;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableLinkLoadWidgetOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.ShowLinkCrossRoomResetStacktraceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.p425aa.p428c.C6527f;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9029aw;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.C11735p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "LINK_CROSS_DATA_HOLDER")
/* renamed from: com.bytedance.android.live.liveinteract.api.a.b */
public final class C4384b extends AbstractC4383a {

    /* renamed from: ao */
    public static C4384b f11908ao;

    /* renamed from: ap */
    public static final Map<String, Object> f11909ap = new ConcurrentHashMap();

    /* renamed from: aq */
    public static final C4385a f11910aq = new C4385a((byte) 0);

    /* renamed from: A */
    public boolean f11911A;

    /* renamed from: B */
    public boolean f11912B;

    /* renamed from: C */
    public long f11913C;

    /* renamed from: D */
    public int f11914D;

    /* renamed from: E */
    public long f11915E;

    /* renamed from: F */
    public boolean f11916F;

    /* renamed from: G */
    public boolean f11917G;

    /* renamed from: H */
    public long f11918H;

    /* renamed from: I */
    public long f11919I;

    /* renamed from: J */
    public boolean f11920J;

    /* renamed from: K */
    public long f11921K;

    /* renamed from: L */
    public String f11922L;

    /* renamed from: M */
    public String f11923M;

    /* renamed from: N */
    public int f11924N = -1;

    /* renamed from: O */
    public boolean f11925O;

    /* renamed from: P */
    public boolean f11926P;

    /* renamed from: Q */
    public boolean f11927Q;

    /* renamed from: R */
    public boolean f11928R;

    /* renamed from: S */
    public long f11929S;

    /* renamed from: T */
    public User f11930T;

    /* renamed from: U */
    public boolean f11931U;

    /* renamed from: V */
    public String f11932V;

    /* renamed from: W */
    public long f11933W;

    /* renamed from: X */
    public int f11934X = 1;

    /* renamed from: Y */
    public int f11935Y;

    /* renamed from: Z */
    public boolean f11936Z;

    /* renamed from: a */
    public boolean f11937a;

    /* renamed from: aa */
    public long f11938aa;

    /* renamed from: ab */
    public String f11939ab;

    /* renamed from: ac */
    public long f11940ac;

    /* renamed from: ad */
    public Map<Long, SurfaceView> f11941ad = new HashMap();

    /* renamed from: ae */
    public boolean f11942ae;

    /* renamed from: af */
    public boolean f11943af;

    /* renamed from: ag */
    public boolean f11944ag = true;

    /* renamed from: ah */
    public boolean f11945ah;

    /* renamed from: ai */
    public long f11946ai;

    /* renamed from: aj */
    public String f11947aj;

    /* renamed from: ak */
    public boolean f11948ak = true;

    /* renamed from: al */
    public boolean f11949al;

    /* renamed from: am */
    public long f11950am;

    /* renamed from: an */
    public DataChannel f11951an;

    /* renamed from: ar */
    private final int f11952ar = 1;

    /* renamed from: as */
    private long f11953as;

    /* renamed from: b */
    public boolean f11954b;

    /* renamed from: c */
    public boolean f11955c;

    /* renamed from: d */
    public volatile boolean f11956d;

    /* renamed from: e */
    public long f11957e;

    /* renamed from: f */
    public long f11958f;

    /* renamed from: g */
    public String f11959g;

    /* renamed from: h */
    public long f11960h;

    /* renamed from: i */
    public long f11961i;

    /* renamed from: j */
    public boolean f11962j;

    /* renamed from: k */
    public boolean f11963k;

    /* renamed from: l */
    public boolean f11964l;

    /* renamed from: m */
    public boolean f11965m;

    /* renamed from: n */
    public boolean f11966n;

    /* renamed from: o */
    public boolean f11967o = true;

    /* renamed from: p */
    public EnumC4442m f11968p = EnumC4442m.NONE;

    /* renamed from: q */
    public boolean f11969q;

    /* renamed from: r */
    public int f11970r;

    /* renamed from: s */
    public String f11971s = "";

    /* renamed from: t */
    public String f11972t;

    /* renamed from: u */
    public int f11973u;

    /* renamed from: v */
    public String f11974v;

    /* renamed from: w */
    public boolean f11975w;

    /* renamed from: x */
    public String f11976x;

    /* renamed from: y */
    public Room f11977y;

    /* renamed from: z */
    public C7610h f11978z;

    /* renamed from: com.bytedance.android.live.liveinteract.api.a.b$a */
    public static final class C4385a {
        static {
            Covode.recordClassIndex(4961);
        }

        private C4385a() {
        }

        /* renamed from: a */
        public static C4384b m10496a() {
            long j;
            if (C4384b.f11908ao == null) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                C4384b.f11908ao = new C4384b(j, null);
            }
            C4384b bVar = C4384b.f11908ao;
            if (bVar == null) {
                C89219l.m154715b();
            }
            return bVar;
        }

        public /* synthetic */ C4385a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m10498a(String str) {
            C89219l.m154721d(str, "");
            C4384b bVar = C4384b.f11908ao;
            if (bVar != null) {
                bVar.mo10156e(str);
            }
            C4384b bVar2 = C4384b.f11908ao;
            if (bVar2 != null) {
                bVar2.f11951an = null;
            }
            C4384b.f11908ao = null;
        }

        /* renamed from: a */
        public static C4384b m10497a(long j, DataChannel dataChannel, String str) {
            C89219l.m154721d(str, "");
            m10498a("source");
            C4384b bVar = new C4384b(j, dataChannel);
            C4384b.f11908ao = bVar;
            return bVar;
        }
    }

    /* renamed from: d */
    public final Config.Vendor mo10153d() {
        Config.Vendor fromValue = Config.Vendor.fromValue(this.f11973u);
        C89219l.m154716b(fromValue, "");
        return fromValue;
    }

    static {
        Covode.recordClassIndex(4960);
    }

    /* renamed from: c */
    public static boolean m10481c() {
        if (EnableLinkLoadWidgetOptSetting.INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo10147a() {
        Integer num;
        DataChannel dataChannel = this.f11951an;
        if (dataChannel == null || (num = (Integer) dataChannel.mo28318b(C9029aw.class)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final EnumC4440k mo10151b() {
        EnumC4440k kVar;
        DataChannel dataChannel = this.f11951an;
        if (dataChannel == null || (kVar = (EnumC4440k) dataChannel.mo28318b(C4400an.class)) == null) {
            return EnumC4440k.DISABLED;
        }
        return kVar;
    }

    /* renamed from: e */
    public final C6527f mo10155e() {
        String str;
        String str2;
        if (this.f11970r > 0) {
            if (this.f11914D == 0) {
                str = "manual_pk";
            } else {
                str = "";
            }
        } else if (this.f11916F) {
            str = "audience";
        } else {
            str = "anchor";
        }
        C6527f fVar = new C6527f();
        fVar.f16289a = this.f11957e;
        fVar.f16290b = this.f11958f;
        fVar.f16291c = this.f11970r;
        fVar.f16292d = str;
        fVar.f16295g = this.f11971s;
        if (Boolean.valueOf(this.f11917G).booleanValue()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        fVar.f16297i = str2;
        C89219l.m154716b(fVar, "");
        return fVar;
    }

    @Override // com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a
    /* renamed from: a */
    public final void mo10144a(long j) {
        this.f11953as = j;
    }

    /* renamed from: d */
    public final void mo10154d(String str) {
        this.f11922L = str;
        this.f11972t = str;
    }

    /* renamed from: c */
    public static <C> C m10480c(String str) {
        C c = (C) f11909ap.get(str);
        if (c != null) {
            return c;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a
    /* renamed from: b */
    public final void mo10146b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f11939ab = str;
        }
    }

    /* renamed from: f */
    private static int m10482f(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("live_rtc_engine_config")) {
                return 0;
            }
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
                if (optJSONObject.has("rtc_vendor")) {
                    return optJSONObject.optInt("rtc_vendor");
                }
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final C4384b mo10148a(C11735p pVar) {
        if (pVar != null && pVar.f28079a > 0) {
            this.f11957e = pVar.f28079a;
            this.f11937a = true;
        }
        return this;
    }

    /* renamed from: a */
    public final void mo10149a(int i) {
        DataChannel dataChannel = this.f11951an;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9029aw.class, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final boolean mo10152b(EnumC4440k kVar) {
        DataChannel dataChannel;
        C89219l.m154721d(kVar, "");
        if (kVar == EnumC4440k.CONNECTION_SUCCEED) {
            LivePerformanceManager.getInstance().monitorPerformance("live_pk");
        }
        EnumC4440k b = mo10151b();
        if (b == null) {
            b = EnumC4440k.DISABLED;
        }
        if (kVar.ordinal() - b.ordinal() > 1) {
            if (b.compareTo((Enum) EnumC4440k.CONNECTION_START) < 0 && kVar == EnumC4440k.CONNECTION_SUCCEED) {
                DataChannel dataChannel2 = this.f11951an;
                if (dataChannel2 != null) {
                    dataChannel2.mo28315b(C4400an.class, EnumC4440k.CONNECTION_START);
                }
            } else if (b.compareTo((Enum) EnumC4440k.CONNECTION_FINISH) < 0 && kVar.equals(EnumC4440k.CONNECTION_FINISH_SUCCEED) && (dataChannel = this.f11951an) != null) {
                dataChannel.mo28315b(C4400an.class, EnumC4440k.CONNECTION_FINISH);
            }
        }
        if (kVar.compareTo((Enum) b) <= 0) {
            return false;
        }
        DataChannel dataChannel3 = this.f11951an;
        if (dataChannel3 != null) {
            dataChannel3.mo28315b(C4400an.class, kVar);
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.p260a.AbstractC4383a
    /* renamed from: a */
    public final void mo10145a(String str) {
        this.f11974v = str;
        int f = m10482f(str);
        if (f > 0) {
            this.f11973u = f;
        }
    }

    /* renamed from: a */
    public final boolean mo10150a(EnumC4440k kVar) {
        C89219l.m154721d(kVar, "");
        EnumC4440k b = mo10151b();
        if (b == null) {
            C89219l.m154715b();
        }
        if (b.compareTo((Enum) kVar) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo10156e(String str) {
        DataChannel dataChannel;
        String str2;
        long j;
        long j2;
        String str3;
        String str4;
        C89219l.m154721d(str, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            JSONObject jSONObject = new JSONObject();
            m10479a(jSONObject, "event_id", "data_reset");
            m10479a(jSONObject, "reset_source", str);
            m10479a(jSONObject, "channel_id", Long.valueOf(this.f11957e));
            String str5 = "0";
            if (Room.isValid(room)) {
                str2 = room.getIdStr();
            } else {
                str2 = str5;
            }
            C89219l.m154716b(str2, "");
            m10479a(jSONObject, "room_id", str2);
            long ownerUserId = room.getOwnerUserId();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b != null) {
                j = b.mo13161c();
            } else {
                j = 0;
            }
            m10479a(jSONObject, "anchor_id", Long.valueOf(ownerUserId));
            m10479a(jSONObject, "guest_anchor_id", Long.valueOf(this.f11958f));
            m10479a(jSONObject, "current_user_id", Long.valueOf(j));
            String str6 = this.f11922L;
            if (str6 == null) {
                str6 = "";
            }
            m10479a(jSONObject, "link_mic_id", str6);
            if (this.f11975w) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            m10479a(jSONObject, "rtc_join_channel_advance", Long.valueOf(j2));
            m10479a(jSONObject, "server_auto_joinchannel", Boolean.valueOf(LinkServerAutoJoinChannel.INSTANCE.getValue()));
            EnumC4440k b2 = mo10151b();
            if (b2 == null || (str3 = b2.name()) == null) {
                str3 = "";
            }
            m10479a(jSONObject, "link_state", str3);
            m10479a(jSONObject, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            m10479a(jSONObject, "network_type", Long.valueOf((long) TTNetInit.getEffectiveConnectionType()));
            m10479a(jSONObject, "invite_type", this.f11968p);
            if (CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
                str5 = "1";
            }
            m10479a(jSONObject, "need_wait_rtc_joinchannel_succeed", str5);
            if (ownerUserId == j) {
                str4 = "ttlive_client_anchor_link_mic_monitor";
            } else {
                str4 = "ttlive_client_audience_link_mic_monitor";
            }
            C3868c.m9492a(str4, 1, jSONObject);
        }
        this.f11921K = 0;
        this.f11919I = 0;
        this.f11920J = false;
        this.f11918H = 0;
        this.f11916F = false;
        this.f11917G = false;
        this.f11957e = 0;
        this.f11958f = 0;
        this.f11959g = null;
        this.f11960h = 0;
        this.f11961i = 0;
        this.f11962j = false;
        this.f11969q = false;
        this.f11937a = false;
        this.f11954b = false;
        this.f11925O = false;
        this.f11926P = false;
        this.f11931U = false;
        this.f11970r = 0;
        this.f11971s = "";
        this.f11922L = null;
        this.f11923M = null;
        mo10145a("");
        this.f11973u = 0;
        this.f11975w = false;
        this.f11936Z = false;
        this.f11912B = false;
        this.f11911A = false;
        this.f11913C = 0;
        this.f11914D = 0;
        this.f11938aa = 0;
        this.f11933W = 0;
        this.f11946ai = 0;
        this.f11947aj = null;
        this.f11976x = null;
        this.f11955c = false;
        this.f11934X = 1;
        this.f11928R = false;
        this.f11927Q = false;
        this.f11930T = null;
        this.f11968p = EnumC4442m.NONE;
        this.f11942ae = false;
        this.f11929S = 0;
        this.f11935Y = 0;
        this.f11941ad.clear();
        mo10146b((String) null);
        this.f11940ac = 0;
        this.f11956d = false;
        this.f11944ag = true;
        this.f11967o = true;
        this.f11966n = false;
        this.f11945ah = false;
        this.f11943af = false;
        this.f11977y = null;
        this.f11978z = null;
        if (ShowLinkCrossRoomResetStacktraceSetting.INSTANCE.getValue()) {
            C3854a.m9457a("ttlive_pk", "LinkCrossRoomDataHolder.reset", new IllegalStateException());
        }
        if (!(mo10151b() == EnumC4440k.DISABLED || (dataChannel = this.f11951an) == null)) {
            dataChannel.mo28315b(C4400an.class, EnumC4440k.DISABLED);
        }
        this.f11949al = false;
    }

    public C4384b(long j, DataChannel dataChannel) {
        this.f11950am = j;
        this.f11951an = dataChannel;
    }

    /* renamed from: a */
    private static void m10479a(JSONObject jSONObject, String str, Object obj) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(obj, "");
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }
}
