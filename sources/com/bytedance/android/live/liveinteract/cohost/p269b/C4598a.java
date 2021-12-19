package com.bytedance.android.live.liveinteract.cohost.p269b;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4494e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4496g;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4498i;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.liveinteract.platform.p367b.AbstractC5663a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.model.C7607f;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7667f;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a */
public final class C4598a extends AbstractC5651b {

    /* renamed from: c */
    public static final C4599a f12233c = new C4599a((byte) 0);
    @AbstractC4430d(mo10204a = "LINK_LOGGER")

    /* renamed from: a */
    public AbstractC5663a f12234a;

    /* renamed from: b */
    public boolean f12235b;

    /* renamed from: d */
    private final AbstractC89244h f12236d;

    /* renamed from: o */
    private final AbstractC89244h f12237o;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$l */
    public static final class C4610l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4610l f12251a = new C4610l();

        static {
            Covode.recordClassIndex(5186);
        }

        C4610l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$p */
    static final class C4614p<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4614p f12257a = new C4614p();

        static {
            Covode.recordClassIndex(5190);
        }

        C4614p() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5174);
    }

    /* renamed from: a */
    public final C4384b mo10340a() {
        return (C4384b) this.f12236d.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$a */
    public static final class C4599a {
        static {
            Covode.recordClassIndex(5175);
        }

        private C4599a() {
        }

        public /* synthetic */ C4599a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$k */
    static final class C4609k extends AbstractC89220m implements AbstractC89171a<C4384b> {

        /* renamed from: a */
        public static final C4609k f12250a = new C4609k();

        static {
            Covode.recordClassIndex(5185);
        }

        C4609k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C4384b invoke() {
            return C4384b.C4385a.m10496a();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$j */
    static final class C4608j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C4598a f12249a;

        static {
            Covode.recordClassIndex(5184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4608j(C4598a aVar) {
            super(0);
            this.f12249a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f12249a.getClass().getName();
        }
    }

    /* renamed from: b */
    public final AbstractC5663a mo10343b() {
        AbstractC5663a aVar = this.f12234a;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        return aVar;
    }

    /* renamed from: c */
    public final boolean mo10346c() {
        if (mo10340a().f11975w) {
            DataChannel dataChannel = this.f14378n;
            if (dataChannel == null) {
                return true;
            }
            dataChannel.mo28319c(C4496g.class);
            return true;
        }
        mo10340a().mo10156e("stopRtcIfJoinChannelAdvance");
        return false;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$b */
    static final class C4600b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C4600b f12238a = new C4600b();

        static {
            Covode.recordClassIndex(5176);
        }

        C4600b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$d */
    static final class C4602d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C4602d f12240a = new C4602d();

        static {
            Covode.recordClassIndex(5178);
        }

        C4602d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$f */
    static final class C4604f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C4604f f12243a = new C4604f();

        static {
            Covode.recordClassIndex(5180);
        }

        C4604f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$h */
    static final class C4606h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C4606h f12246a = new C4606h();

        static {
            Covode.recordClassIndex(5182);
        }

        C4606h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$m */
    public static final class C4611m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4598a f12252a;

        static {
            Covode.recordClassIndex(5187);
        }

        public C4611m(C4598a aVar) {
            this.f12252a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4598a aVar = this.f12252a;
            C89219l.m154716b(th, "");
            aVar.mo10342a(th);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$n */
    static final class C4612n<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C4612n f12253a = new C4612n();

        static {
            Covode.recordClassIndex(5188);
        }

        C4612n() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$q */
    static final class C4615q<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4598a f12258a;

        static {
            Covode.recordClassIndex(5191);
        }

        C4615q(C4598a aVar) {
            this.f12258a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4598a aVar = this.f12258a;
            C89219l.m154716b(th, "");
            aVar.mo10342a(th);
        }
    }

    /* renamed from: a */
    public final void mo10342a(Throwable th) {
        C3854a.m9455a(6, (String) this.f12237o.getValue(), th.getStackTrace());
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: c */
    public final AbstractC88403ab<C5661a> mo10345c(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        map.put("channel_id", Long.valueOf(mo10340a().f11957e));
        AbstractC5663a aVar = this.f12234a;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11444b().mo10356c(map);
        return ((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).joinChannelV3(mo10340a().f11957e, mo10340a().f11939ab).mo142925c(C4606h.f12246a).mo142910a(new C11191f()).mo142912a(new C4607i(this, map));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: f */
    public final void mo10349f(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        long j = mo10340a().f11957e;
        Object obj = map.get("content");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        C89219l.m154716b(((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).sendSignalV3(j, (String) obj, null).mo142910a(new C11191f()).mo142915a(C4614p.f12257a, new C4615q(this)), "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: a */
    public final AbstractC88403ab<C5661a> mo10341a(Map<String, Object> map) {
        String str = "";
        C89219l.m154721d(map, str);
        int value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        map.put("to_room_id", Long.valueOf(mo10340a().f11961i));
        map.put("to_user_id", Long.valueOf(mo10340a().f11958f));
        String str2 = mo10340a().f11959g;
        if (str2 == null) {
            str2 = str;
        }
        map.put("sec_to_user_id", str2);
        map.put("room_id", Long.valueOf(mo10340a().f11960h));
        map.put("invite_type", mo10340a().f11968p);
        map.put("match_type", 0);
        map.put("invite_time_out", Integer.valueOf(value));
        AbstractC5663a aVar = this.f12234a;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11444b().mo10358e(map);
        this.f14369e = mo10340a().f11960h;
        CoHostApi coHostApi = (CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class);
        long j = mo10340a().f11961i;
        long j2 = mo10340a().f11958f;
        String str3 = mo10340a().f11959g;
        if (str3 != null) {
            str = str3;
        }
        return coHostApi.invite(12, j, j2, str, mo10340a().f11960h, mo10340a().f11968p.getType(), 0, value).mo142925c(C4604f.f12243a).mo142910a(new C11191f()).mo142912a(new C4605g(this, map));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: b */
    public final AbstractC88403ab<C5661a> mo10344b(Map<String, Object> map) {
        String str = "";
        C89219l.m154721d(map, str);
        if (map.get("reply_status") == null) {
            return null;
        }
        Object obj = map.get("reply_status");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (map.get("channel_id") == null) {
            map.put("channel_id", Long.valueOf(mo10340a().f11957e));
        }
        if (map.get("guest_user_id") == null) {
            map.put("guest_user_id", Long.valueOf(mo10340a().f11958f));
        }
        if (map.get("transparent_extra") == null) {
            String str2 = mo10340a().f11939ab;
            if (str2 != null) {
                str = str2;
            }
            map.put("transparent_extra", str);
        }
        if (map.get("guest_user_id") instanceof Long) {
            Object obj2 = map.get("guest_user_id");
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            if (((Long) obj2).longValue() > 0 && (map.get("channel_id") instanceof Long)) {
                Object obj3 = map.get("channel_id");
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                if (((Long) obj3).longValue() > 0) {
                    AbstractC5663a aVar = this.f12234a;
                    if (aVar == null) {
                        C89219l.m154710a("mLinkLogger");
                    }
                    aVar.mo11444b().mo10353a(map);
                    Object obj4 = map.get("channel_id");
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                    long longValue = ((Long) obj4).longValue();
                    long j = this.f14369e;
                    Object obj5 = map.get("guest_user_id");
                    Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                    long longValue2 = ((Long) obj5).longValue();
                    Object obj6 = map.get("transparent_extra");
                    Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.String");
                    return ((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).reply(longValue, j, intValue, longValue2, (String) obj6).mo142925c(C4612n.f12253a).mo142910a(new C11191f()).mo142912a(new C4613o(this, map, intValue));
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: d */
    public final AbstractC88403ab<C5661a> mo10347d(Map<String, Object> map) {
        AbstractC88403ab<C5832d<Void>> finishV3;
        C89219l.m154721d(map, "");
        Object obj = map.get("needSuggest");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AbstractC5663a aVar = this.f12234a;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11444b().mo10360g(map);
        if (booleanValue) {
            finishV3 = ((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).finishV3(mo10340a().f11957e, mo10340a().f11939ab, mo10340a().f11958f);
        } else {
            finishV3 = ((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).finishV3(mo10340a().f11957e, mo10340a().f11939ab);
        }
        AbstractC88403ab<R> a = finishV3.mo142925c(C4602d.f12240a).mo142910a(new C11191f()).mo142912a(new C4603e(this, map));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: e */
    public final AbstractC88403ab<C5661a> mo10348e(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        this.f12235b = false;
        Object obj = map.get("cancel_reason");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.api.LinkApi.CancelReason");
        LinkApi.EnumC7283a aVar = (LinkApi.EnumC7283a) obj;
        C5702a.m12450a("LinkCross_Cancel", this.f14371g);
        C89219l.m154721d(aVar, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "cancel_type", aVar.value);
        C4617b bVar = C4617b.f12263e;
        C4617b.m10742a((C4617b) "cancel_request", (String) jSONObject, (JSONObject) 0);
        if (mo10340a().f11961i <= 0 || this.f14373i <= 0 || mo10340a().f11958f <= 0 || TextUtils.isEmpty(mo10340a().f11959g)) {
            return ((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).cancel(mo10340a().f11957e, mo10340a().f11950am, mo10340a().f11961i, mo10340a().f11958f, mo10340a().f11959g, aVar.value, mo10340a().f11939ab).mo142925c(C4600b.f12238a).mo142910a(new C11191f()).mo142912a(new C4601c(this));
        }
        return null;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$c */
    static final class C4601c<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C4598a f12239a;

        static {
            Covode.recordClassIndex(5177);
        }

        C4601c(C4598a aVar) {
            this.f12239a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo10350a(Object obj, Object obj2) {
            if (obj != null) {
                this.f12239a.f12235b = true;
            }
            if (obj2 != null) {
                this.f12239a.f12235b = true;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$e */
    static final class C4603e<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C4598a f12241a;

        /* renamed from: b */
        final /* synthetic */ Map f12242b;

        static {
            Covode.recordClassIndex(5179);
        }

        C4603e(C4598a aVar, Map map) {
            this.f12241a = aVar;
            this.f12242b = map;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            if (obj != null) {
                this.f12241a.mo10340a().f11945ah = false;
                this.f12242b.put("response", obj);
                this.f12241a.mo10343b().mo11444b().mo10361h(this.f12242b);
            }
            if (th != null) {
                this.f12241a.mo10340a().f11945ah = false;
                this.f12241a.mo10343b().mo11444b().mo10354b(th, this.f12242b);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$i */
    static final class C4607i<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C4598a f12247a;

        /* renamed from: b */
        final /* synthetic */ Map f12248b;

        static {
            Covode.recordClassIndex(5183);
        }

        C4607i(C4598a aVar, Map map) {
            this.f12247a = aVar;
            this.f12248b = map;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            if (obj != null) {
                this.f12248b.put("response", obj);
                this.f12247a.mo10343b().mo11444b().mo10357d(this.f12248b);
            }
            if (th != null) {
                this.f12247a.mo10343b().mo11444b().mo10351a(th);
            }
        }
    }

    public C4598a(long j, DataChannel dataChannel) {
        super(j, dataChannel);
        long j2;
        C4431e.f12034a.mo10198a(C4384b.C4385a.m10496a(), null);
        C4431e.f12034a.mo10201a(this);
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        this.f14369e = j2;
        this.f12236d = C89250i.m154773a((AbstractC89171a) C4609k.f12250a);
        this.f12235b = true;
        this.f12237o = C89250i.m154773a((AbstractC89171a) new C4608j(this));
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$o */
    static final class C4613o<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C4598a f12254a;

        /* renamed from: b */
        final /* synthetic */ Map f12255b;

        /* renamed from: c */
        final /* synthetic */ int f12256c;

        static {
            Covode.recordClassIndex(5189);
        }

        C4613o(C4598a aVar, Map map, int i) {
            this.f12254a = aVar;
            this.f12255b = map;
            this.f12256c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            C7667f fVar;
            DataChannel dataChannel;
            C5661a aVar = (C5661a) obj;
            Throwable th = (Throwable) obj2;
            if (aVar != null) {
                this.f12255b.put("response", aVar);
                this.f12254a.mo10343b().mo11444b().mo10355b(this.f12255b);
                if (this.f12254a.mo10340a().mo10150a(EnumC4440k.CONNECTION_FINISH)) {
                    return;
                }
                if (aVar.f14391a instanceof C5832d) {
                    Object obj3 = aVar.f14391a;
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult?>");
                    C5832d dVar = (C5832d) obj3;
                    if (!(dVar == null || (fVar = (C7667f) dVar.data) == null)) {
                        int i = this.f12256c;
                        if (i == 1) {
                            C4598a aVar2 = this.f12254a;
                            String b = C4139e.C4140a.f11575b.mo46674b(fVar);
                            C89219l.m154716b(b, "");
                            C5702a.m12449a("LinkCross_Reply_Success", b);
                            if (!aVar2.mo10340a().mo10150a(EnumC4440k.CONNECTION_FINISH)) {
                                aVar2.mo10340a().mo10154d(fVar.f19010a);
                                aVar2.mo10340a().f11923M = fVar.f19013d;
                                boolean value = LinkServerAutoJoinChannel.INSTANCE.getValue();
                                if (!aVar2.mo10340a().f11955c || value) {
                                    aVar2.mo10340a().f11955c = true;
                                    if (!TextUtils.isEmpty(fVar.f19014e)) {
                                        aVar2.mo10340a().mo10145a(fVar.f19014e);
                                    }
                                    DataChannel dataChannel2 = aVar2.f14378n;
                                    if (dataChannel2 != null) {
                                        dataChannel2.mo28320c(C4450t.class, new C7398o(4));
                                    }
                                    if (!value && (dataChannel = aVar2.f14378n) != null) {
                                        dataChannel.mo28319c(C4494e.class);
                                    }
                                } else {
                                    DataChannel dataChannel3 = aVar2.f14378n;
                                    if (dataChannel3 != null) {
                                        dataChannel3.mo28319c(C4494e.class);
                                    }
                                }
                            }
                        } else if (i == 2 || i == 5) {
                            this.f12254a.mo10340a().f11967o = false;
                            this.f12254a.mo10346c();
                        }
                    }
                }
            }
            if (th != null) {
                this.f12254a.mo10343b().mo11444b().mo10352a(th, this.f12255b);
                this.f12254a.mo10346c();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$g */
    static final class C4605g<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C4598a f12244a;

        /* renamed from: b */
        final /* synthetic */ Map f12245b;

        static {
            Covode.recordClassIndex(5181);
        }

        C4605g(C4598a aVar, Map map) {
            this.f12244a = aVar;
            this.f12245b = map;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            C5832d dVar;
            C5661a aVar = (C5661a) obj;
            Throwable th = (Throwable) obj2;
            if (aVar != null) {
                C7607f fVar = null;
                if (aVar.f14391a instanceof C5832d) {
                    Object obj3 = aVar.f14391a;
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult>");
                    dVar = (C5832d) obj3;
                    if (dVar != null) {
                        fVar = (C7607f) dVar.data;
                    }
                } else {
                    dVar = null;
                }
                this.f12244a.mo10343b().mo11444b().mo10359f(this.f12245b);
                this.f12244a.mo10340a().f11940ac = System.currentTimeMillis();
                if (fVar != null) {
                    this.f12244a.f14373i = fVar.f18879a;
                    this.f12244a.f14370f = fVar.f18884f;
                    this.f12244a.mo10340a().f11957e = fVar.f18879a;
                    this.f12244a.mo10340a().mo10154d(fVar.f18884f);
                    this.f12244a.mo10340a().f11975w = fVar.f18882d;
                    this.f12244a.mo10340a().f11962j = fVar.f18883e;
                    this.f12244a.mo10340a().f11943af = false;
                    boolean z = fVar.f18883e;
                    C89219l.m154721d(dVar, "");
                    JSONObject jSONObject = new JSONObject();
                    C4617b.m12484a(jSONObject, dVar);
                    long currentTimeMillis = System.currentTimeMillis() - C4617b.f12259a;
                    C3866a.m9474a(jSONObject, "cost", currentTimeMillis);
                    C3866a.m9475a(jSONObject, "rtc_push_stream", String.valueOf(z));
                    long currentTimeMillis2 = System.currentTimeMillis() + C11225an.f26870a;
                    C3866a.m9474a(jSONObject, "invite_service_timestamp", currentTimeMillis2 - currentTimeMillis);
                    C3866a.m9474a(jSONObject, "server_timestamp", currentTimeMillis2);
                    C4617b.m10742a("invite_succeed", jSONObject, 0);
                    if (fVar.f18882d && !TextUtils.isEmpty(fVar.f18881c)) {
                        this.f12244a.mo10340a().mo10145a(fVar.f18881c);
                        DataChannel dataChannel = this.f12244a.f14378n;
                        if (dataChannel != null) {
                            dataChannel.mo28320c(C4450t.class, new C7398o(4));
                        }
                    }
                }
            }
            if (th != null) {
                this.f12244a.mo10342a(th);
                JSONObject jSONObject2 = new JSONObject();
                C4617b.m12488a(jSONObject2, th);
                C3866a.m9474a(jSONObject2, "cost", System.currentTimeMillis() - C4617b.f12259a);
                C4617b.m10742a("invite_failed", jSONObject2, 1);
                DataChannel dataChannel2 = this.f12244a.f14378n;
                if (dataChannel2 != null) {
                    dataChannel2.mo28319c(C4498i.class);
                }
                this.f12244a.mo10340a().mo10156e("Invite_Failed");
                this.f12244a.mo10340a().f11943af = false;
            }
        }
    }
}
