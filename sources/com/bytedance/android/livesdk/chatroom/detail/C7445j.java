package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.slot.C6160ac;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.p489d.C7413a;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p425aa.p427b.C6515g;
import com.bytedance.android.livesdk.p561j.C9089da;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.EnumC10344h;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdkapi.depend.model.live.C11735p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.j */
public final class C7445j {

    /* renamed from: G */
    private static boolean f18474G;

    /* renamed from: A */
    public long f18475A;

    /* renamed from: B */
    public DataChannel f18476B;

    /* renamed from: C */
    public String f18477C;

    /* renamed from: D */
    public String f18478D = "";

    /* renamed from: E */
    public String f18479E;

    /* renamed from: F */
    public long f18480F;

    /* renamed from: H */
    private HandlerThread f18481H;

    /* renamed from: I */
    private volatile boolean f18482I;

    /* renamed from: J */
    private volatile boolean f18483J;

    /* renamed from: K */
    private final WeakReference<Context> f18484K;

    /* renamed from: L */
    private boolean f18485L = false;

    /* renamed from: M */
    private boolean f18486M = false;

    /* renamed from: N */
    private boolean f18487N;

    /* renamed from: O */
    private C11735p f18488O;

    /* renamed from: P */
    private AbstractC88412b f18489P;

    /* renamed from: Q */
    private long f18490Q = -1;

    /* renamed from: R */
    private boolean f18491R = false;

    /* renamed from: S */
    private boolean f18492S = false;

    /* renamed from: a */
    public volatile boolean f18493a;

    /* renamed from: b */
    public volatile boolean f18494b = true;

    /* renamed from: c */
    public final Runnable f18495c = new Runnable() {
        /* class com.bytedance.android.livesdk.chatroom.detail.C7445j.RunnableC74461 */

        static {
            Covode.recordClassIndex(8216);
        }

        public final void run() {
            long j;
            if (C7445j.this.f18493a) {
                j = 60000 - (((SystemClock.elapsedRealtime() - C7445j.this.f18506n) - C7445j.this.f18511s) % 60000);
                C7445j.this.f18493a = false;
            } else {
                j = 60000;
            }
            C7445j.this.f18496d.postDelayed(this, j);
            if (C7445j.this.f18494b || j != 60000) {
                C7445j.this.f18494b = false;
            } else {
                C7445j.this.mo13672a("watch_onemin");
            }
        }
    };

    /* renamed from: d */
    public final Handler f18496d;

    /* renamed from: e */
    public final String f18497e;

    /* renamed from: f */
    public final String f18498f;

    /* renamed from: g */
    public final long f18499g;

    /* renamed from: h */
    public final String f18500h;

    /* renamed from: i */
    public final EnterRoomConfig f18501i;

    /* renamed from: j */
    long f18502j = 0;

    /* renamed from: k */
    public boolean f18503k = false;

    /* renamed from: l */
    public volatile boolean f18504l = false;

    /* renamed from: m */
    boolean f18505m = false;

    /* renamed from: n */
    public long f18506n = -1;

    /* renamed from: o */
    public long f18507o = -1;

    /* renamed from: p */
    public boolean f18508p = false;

    /* renamed from: q */
    public long f18509q = -1;

    /* renamed from: r */
    public long f18510r = -1;

    /* renamed from: s */
    public long f18511s = 0;

    /* renamed from: t */
    public String f18512t = "click";

    /* renamed from: u */
    public String f18513u;

    /* renamed from: v */
    public String f18514v;

    /* renamed from: w */
    public String f18515w;

    /* renamed from: x */
    public String f18516x;

    /* renamed from: y */
    long f18517y;

    /* renamed from: z */
    public String f18518z;

    static {
        Covode.recordClassIndex(8215);
    }

    /* renamed from: c */
    public final long mo13675c() {
        return (SystemClock.elapsedRealtime() - this.f18506n) - this.f18511s;
    }

    /* renamed from: d */
    public final void mo13676d() {
        Context context;
        WeakReference<Context> weakReference = this.f18484K;
        if (weakReference == null || weakReference.get() == null) {
            context = null;
        } else {
            context = this.f18484K.get();
        }
        C6558k.m14024a(context);
        String str = this.f18498f;
        m15344a("request_id", this.f18497e, "log_pb", str, "log_pb", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo13677e() {
        if (!this.f18504l) {
            long c = mo13675c();
            if (c / 1000 >= 30 && !this.f18483J) {
                mo13672a("livesdk_watch_thirtysec");
                this.f18483J = true;
            } else if (c < 30000) {
                this.f18496d.postDelayed(new RunnableC7450n(this), 30000 - c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo13678f() {
        if (!this.f18504l) {
            long c = mo13675c();
            if (c / 1000 >= 10 && !this.f18482I) {
                mo13672a("livesdk_watch_tensec");
                this.f18482I = true;
            } else if (c < 10000) {
                this.f18496d.postDelayed(new RunnableC7449m(this), 10000 - c);
            }
        }
    }

    /* renamed from: b */
    public final void mo13674b() {
        C7413a a = C7413a.m15292a();
        EnterRoomConfig enterRoomConfig = this.f18501i;
        long j = this.f18502j;
        a.f18387b = true;
        a.f18390e = enterRoomConfig;
        a.f18391f.put("audience_live_play_enter_room_config", enterRoomConfig);
        a.f18391f.put("audience_live_play_room_id", String.valueOf(j));
        a.f18388c = SystemClock.elapsedRealtime();
        a.mo13619c();
        C3854a.m9453a(4, "AudienceLivePlayTaskManager", "startRoomDuration");
        this.f18506n = SystemClock.elapsedRealtime();
        this.f18490Q = SystemClock.elapsedRealtime();
        if (this.f18504l) {
            this.f18510r = this.f18506n;
        }
        this.f18494b = true;
        this.f18496d.post(this.f18495c);
        this.f18496d.postDelayed(new RunnableC7447k(this), 10000);
        this.f18496d.postDelayed(new RunnableC7448l(this), 30000);
        this.f18475A = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo13669a() {
        this.f18501i.f28232b.f28279w = 0;
        this.f18503k = false;
        this.f18504l = false;
        this.f18485L = false;
        this.f18486M = false;
        this.f18487N = false;
        this.f18506n = -1;
        this.f18507o = -1;
        this.f18508p = false;
        this.f18509q = -1;
        this.f18510r = -1;
        this.f18511s = 0;
        this.f18512t = null;
        this.f18513u = null;
        this.f18516x = null;
        this.f18488O = null;
        this.f18492S = false;
        this.f18491R = false;
        this.f18505m = false;
        this.f18476B = null;
        this.f18482I = false;
        this.f18483J = false;
        this.f18496d.removeCallbacksAndMessages(null);
        HandlerThread handlerThread = this.f18481H;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f18481H = null;
        }
    }

    /* renamed from: a */
    private static JSONObject m15344a(Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < 6; i += 2) {
            try {
                if (objArr[i] instanceof String) {
                    int i2 = i + 1;
                    if (i2 < 6) {
                        jSONObject.put((String) objArr[i], objArr[i2]);
                    } else if (f18474G) {
                        throw new IllegalArgumentException(C1764a.m5929a(Locale.ENGLISH, "no value found for key at %d", new Object[]{Integer.valueOf(i)}));
                    }
                } else if (f18474G) {
                    throw new IllegalArgumentException(C1764a.m5929a(Locale.ENGLISH, "key at %d is not a string", new Object[]{Integer.valueOf(i)}));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo13672a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        String str3 = "1";
        hashMap.put("growth_deepevent", str3);
        hashMap.put("request_page", C7411d.m15284a().mo13614e());
        if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
            hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
        }
        String str4 = this.f18501i.f28232b.f28274r;
        if (TextUtils.isEmpty(str4) || !"click_push_live_cd_user".equals(str4)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", str3);
        }
        if (C3966y.m9670f()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        hashMap.put("room_orientation", str2);
        if (!this.f18501i.f28233c.f28342aw) {
            str3 = "0";
        }
        hashMap.put("is_return", str3);
        C6501b.C6502a.m13948a(str).mo12652a((Map<String, String>) hashMap).mo12643a(this.f18476B).mo12654b("live_view").mo12658d("live_detail").mo12661f(this.f18512t).mo12655b();
    }

    /* renamed from: a */
    public final void mo13671a(Room room) {
        String str;
        String str2;
        String str3;
        C7413a a = C7413a.m15292a();
        C3854a.m9453a(4, "AudienceLivePlayTaskManager", "stopRoomDuration duration: " + a.mo13618b());
        a.f18387b = false;
        a.f18389d = 0;
        a.f18388c = -1;
        a.f18390e = null;
        a.f18391f.clear();
        a.f18386a.clear();
        a.f18392g.removeCallbacksAndMessages(null);
        if (!(this.f18506n == -1 || this.f18487N || room == null)) {
            if (this.f18507o != -1) {
                C6501b.C6502a.m13948a("live_stream_duration").mo12639a().mo12651a("duration", String.valueOf((SystemClock.elapsedRealtime() - this.f18507o) - this.f18511s)).mo12654b("live_view").mo12658d("live_detail").mo12655b();
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f18506n) - this.f18511s;
            if (C6160ac.m13404b()) {
                Long l = 0L;
                for (Long l2 : C7822br.f19400aq) {
                    l = Long.valueOf(l.longValue() + l2.longValue());
                }
                elapsedRealtime += l.longValue();
            }
            HashMap hashMap = new HashMap();
            if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
                hashMap.put("connection_type", "manual_pk");
                hashMap.put("pk_id", String.valueOf(((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getBattleId()));
            }
            hashMap.put("request_page", C7411d.m15284a().mo13614e());
            if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
                hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
            }
            String str4 = this.f18501i.f28232b.f28274r;
            String str5 = "1";
            if (TextUtils.isEmpty(str4) || !"click_push_live_cd_user".equals(str4)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", str5);
            }
            long hotDuration = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getHotDuration(this.f18502j);
            ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).resetDuration(this.f18502j);
            if (this.f18501i.f28233c.f28342aw) {
                str = str5;
            } else {
                str = "0";
            }
            hashMap.put("is_return", str);
            if (!TextUtils.isEmpty(this.f18501i.f28232b.f28262f)) {
                hashMap.put("live_reason", this.f18501i.f28232b.f28262f);
            }
            if (room.getOwner() == null || room.getOwner().getAuthenticationInfo() == null) {
                str2 = "0";
            } else {
                str2 = str5;
            }
            hashMap.put("is_anchor_official", str2);
            C6515g.m13960a((Map<String, String>) hashMap, room);
            C6501b.C6502a.m13948a("live_duration").mo12652a((Map<String, String>) hashMap).mo12639a().mo12651a("duration", String.valueOf(elapsedRealtime)).mo12646a("hot_duration", hotDuration).mo12654b("live_view").mo12658d("live_detail").mo12655b();
            String str6 = "open";
            if (!(C6193a.m13435a(IWalletService.class) == null || ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12380e() == null || !((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12380e().getValidUser())) {
                if (((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12383g()) {
                    str3 = str6;
                } else {
                    str3 = "close";
                }
                C6501b.C6502a.m13948a("livesdk_auto_balance_exchange_status").mo12639a().mo12651a("status", str3).mo12655b();
            }
            this.f18487N = true;
            if (C11199a.m19850a(this.f18476B)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("duration", String.valueOf(elapsedRealtime));
                HashMap hashMap3 = new HashMap();
                hashMap3.put("room_id", String.valueOf(this.f18502j));
                hashMap3.put("anchor_id", String.valueOf(this.f18517y));
                hashMap3.put("duration", String.valueOf(elapsedRealtime));
                C11199a.m19849a("live_ad", "live_duration", hashMap2, hashMap3);
            }
            if (this.f18490Q != -1) {
                DataChannel dataChannel = this.f18476B;
                HashMap hashMap4 = new HashMap();
                hashMap4.put("video_id", C6544e.m13992f());
                if (dataChannel != null) {
                    hashMap4.put("is_live_recall", "0");
                    Room room2 = (Room) dataChannel.mo28318b(C9093de.class);
                    if (room2 != null) {
                        if (!room2.hasCommerceGoods) {
                            str5 = "0";
                        }
                        hashMap4.put("is_sale", str5);
                        hashMap4.put("orientation", String.valueOf(room2.getOrientation()));
                    }
                }
                AbstractC88412b bVar = this.f18489P;
                if (bVar != null && !bVar.isDisposed()) {
                    try {
                        this.f18489P.dispose();
                    } catch (Exception e) {
                        C6555i.m14021b();
                        C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
                    }
                }
                hashMap4.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f18490Q));
                hashMap4.put("trigger", "close");
                C6501b.C6502a.m13948a("livesdk_video_over").mo12652a((Map<String, String>) hashMap4).mo12643a(this.f18476B).mo12661f(this.f18512t).mo12655b();
                this.f18490Q = -1;
            }
            C6501b a2 = C6501b.C6502a.m13948a("livesdk_user_left_rankings_status").mo12639a();
            if (((Long) DataChannelGlobal.f42558d.mo28324b(C9089da.class)).longValue() == EnumC10344h.RANKINGS_SWITCH_STATUS_OFF.getValue()) {
                str6 = "close";
            }
            a2.mo12651a("ranking_status", str6).mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo13670a(long j, boolean z, long j2, C11735p pVar) {
        String str;
        this.f18502j = j;
        if (z) {
            str = "audio_live";
        } else {
            str = "video_live";
        }
        this.f18516x = str;
        this.f18517y = j2;
        this.f18488O = pVar;
    }

    /* renamed from: a */
    public final void mo13673a(boolean z, boolean z2, String str, Room room) {
        if (z) {
            this.f18491R = z;
        }
        if (z2) {
            this.f18492S = z2;
        }
        if (this.f18492S && this.f18491R) {
            RunnableC7453q qVar = new RunnableC7453q(this, str, room);
            C89219l.m154721d(qVar, "");
            C6204h.m13477a(qVar, 3);
        }
    }

    public C7445j(Context context, String str, String str2, long j, String str3, String str4, EnterRoomConfig enterRoomConfig, String str5, String str6) {
        f18474G = TextUtils.equals(((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel(), "local_test");
        HandlerThread handlerThread = new HandlerThread("watch_live_timer");
        this.f18481H = handlerThread;
        handlerThread.start();
        this.f18496d = new Handler(this.f18481H.getLooper());
        this.f18484K = new WeakReference<>(context);
        this.f18497e = str;
        this.f18498f = str2;
        this.f18499g = j;
        this.f18500h = str3;
        this.f18513u = str4;
        this.f18501i = enterRoomConfig;
        this.f18514v = str5;
        this.f18515w = str6;
    }
}
