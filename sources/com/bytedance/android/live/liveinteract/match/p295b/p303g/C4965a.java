package com.bytedance.android.live.liveinteract.match.p295b.p303g;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4958i;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.g.a */
public final class C4965a extends C4942a.AbstractC4945b {

    /* renamed from: b */
    public static final C4966a f12943b = new C4966a((byte) 0);

    /* renamed from: a */
    public final DataChannel f12944a;

    static {
        Covode.recordClassIndex(5548);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.a$a */
    public static final class C4966a {
        static {
            Covode.recordClassIndex(5549);
        }

        private C4966a() {
        }

        public /* synthetic */ C4966a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.a$d */
    static final class C4969d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4965a f12950a;

        /* renamed from: b */
        final /* synthetic */ boolean f12951b;

        /* renamed from: c */
        final /* synthetic */ int f12952c;

        static {
            Covode.recordClassIndex(5552);
        }

        C4969d(C4965a aVar, boolean z, int i) {
            this.f12950a = aVar;
            this.f12951b = z;
            this.f12952c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f12950a.f12053h != null) {
                C5009a.m11220b(this.f12951b, "normal", null);
                C3854a.m9453a(4, "InteractBattleTAG", "reject, success");
                C4947a.m11148a("reject_success", this.f12952c);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.a$b */
    static final class C4967b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4965a f12945a;

        /* renamed from: b */
        final /* synthetic */ boolean f12946b;

        static {
            Covode.recordClassIndex(5550);
        }

        C4967b(C4965a aVar, boolean z) {
            this.f12945a = aVar;
            this.f12946b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f12945a.f12053h != null) {
                boolean z = this.f12946b;
                JSONObject jSONObject = new JSONObject();
                C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13033d);
                C5009a.m11205a(C5009a.f13036g, "open_succeed", jSONObject, z, 8);
                C3854a.m9453a(4, "InteractBattleTAG", "open, success");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.a$e */
    static final class C4970e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4965a f12953a;

        /* renamed from: b */
        final /* synthetic */ boolean f12954b;

        /* renamed from: c */
        final /* synthetic */ int f12955c;

        static {
            Covode.recordClassIndex(5553);
        }

        C4970e(C4965a aVar, boolean z, int i) {
            this.f12953a = aVar;
            this.f12954b = z;
            this.f12955c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.f12953a.f12053h != null) {
                C3854a.m9453a(4, "InteractBattleTAG", "reject, failed");
                C5009a.m11216a(this.f12954b, "normal", th, (Map<String, ? extends Object>) null);
                C4947a.m11148a("reject_failed", this.f12955c);
                C4965a aVar = this.f12953a;
                if (th == null) {
                    C89219l.m154715b();
                }
                aVar.mo10249a(th);
                ((C4942a.AbstractC4946c) this.f12953a.f12053h).mo10670a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.a$c */
    static final class C4968c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4965a f12947a;

        /* renamed from: b */
        final /* synthetic */ boolean f12948b;

        /* renamed from: c */
        final /* synthetic */ long f12949c;

        static {
            Covode.recordClassIndex(5551);
        }

        C4968c(C4965a aVar, boolean z, long j) {
            this.f12947a = aVar;
            this.f12948b = z;
            this.f12949c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.f12947a.f12053h != null) {
                boolean z = this.f12948b;
                long j = this.f12949c;
                JSONObject jSONObject = new JSONObject();
                C5009a.m12488a(jSONObject, th);
                C3866a.m9474a(jSONObject, "battle_id", j);
                C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13033d);
                int i = 1;
                C5009a.m11210a("open_failed", jSONObject, z, 1);
                C3854a.m9453a(4, "InteractBattleTAG", "open, success");
                if (this.f12948b) {
                    i = 2;
                }
                C4947a.m11148a("open_failed", i);
                C4965a aVar = this.f12947a;
                if (th == null) {
                    C89219l.m154715b();
                }
                aVar.mo10249a(th);
                ((C4942a.AbstractC4946c) this.f12947a.f12053h).mo10671b(th);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4965a(C4942a.AbstractC4946c cVar, DataChannel dataChannel) {
        super(cVar);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dataChannel, "");
        this.f12944a = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a.AbstractC4945b
    /* renamed from: a */
    public final void mo10667a(int i, long j) {
        int i2;
        long c = C4947a.f12909a.mo10679c();
        boolean z = true;
        if (i == 1) {
            i2 = 2;
        } else {
            z = false;
            i2 = 0;
        }
        C5703b.m12477b(z, false);
        C5009a.m11217a(z, "normal", (Map<String, ? extends Object>) null);
        ((AbstractC11181z) ((LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class)).reject(c, j, i).mo143274a(mo10250f())).mo17950a(new C4969d(this, z, i2), new C4970e(this, z, i2));
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a.AbstractC4945b
    /* renamed from: b */
    public final void mo10668b(int i, long j) {
        boolean z;
        long j2;
        long c = C4947a.f12909a.mo10679c();
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        C5703b.m12477b(z, true);
        C5009a.m11205a(C5009a.f13036g, "open_request", new JSONObject(), z, 8);
        C5009a.f13033d = System.currentTimeMillis();
        this.f12944a.mo28315b(C4958i.class, Boolean.valueOf(z));
        long value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            j2 = LiveTimeIncrementForBattleSetting.INSTANCE.getValue() + value;
        } else {
            j2 = value;
        }
        ((AbstractC11181z) ((LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class)).open(c, j, value, j2).mo143274a(mo10250f())).mo17950a(new C4967b(this, z), new C4968c(this, z, j));
    }
}
