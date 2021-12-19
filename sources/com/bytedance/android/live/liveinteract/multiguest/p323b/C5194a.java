package com.bytedance.android.live.liveinteract.multiguest.p323b;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.EnumC4401ao;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.liveinteract.platform.p367b.AbstractC5663a;
import com.bytedance.android.live.liveinteract.platform.p368c.C5668c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7663b;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7676a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractAudienceTimeOutSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.b.a */
public final class C5194a extends AbstractC5651b {

    /* renamed from: a */
    public final String f13428a = "MultiGuestLinker";
    @AbstractC4430d(mo10204a = "RTC_CONTROLLER")

    /* renamed from: b */
    public C5668c f13429b;
    @AbstractC4430d(mo10204a = "LINK_LOGGER")

    /* renamed from: c */
    public AbstractC5663a f13430c;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: d */
    public C5271a f13431d;

    /* renamed from: o */
    private final AbstractC89244h f13432o = C89250i.m154773a((AbstractC89171a) C5198d.f13439a);

    static {
        Covode.recordClassIndex(5786);
    }

    /* renamed from: c */
    public final C6894d mo10980c() {
        return (C6894d) this.f13432o.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.b.a$d */
    static final class C5198d extends AbstractC89220m implements AbstractC89171a<C6894d> {

        /* renamed from: a */
        public static final C5198d f13439a = new C5198d();

        static {
            Covode.recordClassIndex(5790);
        }

        C5198d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6894d invoke() {
            return C6894d.m14753a();
        }
    }

    /* renamed from: a */
    public final AbstractC5663a mo10978a() {
        AbstractC5663a aVar = this.f13430c;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        return aVar;
    }

    /* renamed from: b */
    public final C5271a mo10979b() {
        C5271a aVar = this.f13431d;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        return aVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.b.a$b */
    static final class C5196b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C5196b f13437a = new C5196b();

        static {
            Covode.recordClassIndex(5788);
        }

        C5196b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.b.a$c */
    static final class C5197c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C5197c f13438a = new C5197c();

        static {
            Covode.recordClassIndex(5789);
        }

        C5197c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.b.a$e */
    static final class C5199e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C5199e f13440a = new C5199e();

        static {
            Covode.recordClassIndex(5791);
        }

        C5199e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C5661a aVar = new C5661a();
            aVar.f14391a = obj;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: h */
    public final AbstractC88403ab<C5661a> mo10982h(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        LinkApi linkApi = (LinkApi) C5805e.m12718a().mo11572a(LinkApi.class);
        long j = this.f14369e;
        C5271a aVar = this.f13431d;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        return linkApi.leave(j, aVar.f13650u).mo142925c(C5197c.f13438a);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: i */
    public final AbstractC88403ab<C5661a> mo10983i(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        LinkApi linkApi = (LinkApi) C5805e.m12718a().mo11572a(LinkApi.class);
        long j = this.f14369e;
        Object obj = map.get("toUserId");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        Object obj2 = map.get("secUserId");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        C5271a aVar = this.f13431d;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        return linkApi.kickOut(j, longValue, str, aVar.f13650u).mo142925c(C5196b.f13437a);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b
    /* renamed from: g */
    public final AbstractC88403ab<C5661a> mo10981g(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        AbstractC5663a aVar = this.f13430c;
        if (aVar == null) {
            C89219l.m154710a("mLinkLogger");
        }
        aVar.mo11444b().mo10987k(map);
        int value = LiveInteractAudienceTimeOutSetting.INSTANCE.getValue();
        Object obj = map.get("userId");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        Object obj2 = map.get("interactId");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "guest_user_id", longValue);
        C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
        C5714i.m12543a(jSONObject, Long.valueOf(longValue), str);
        C5714i.m12531a(C5714i.f14494j, true, "permit_request", jSONObject);
        C5714i.f14488c = System.currentTimeMillis();
        C5271a aVar2 = this.f13431d;
        if (aVar2 == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        EnumC4422k kVar = aVar2.f13646q;
        C5271a aVar3 = this.f13431d;
        if (aVar3 == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        C6501b.C6502a.m13948a("livesdk_anchor_guest_connection_success").mo12639a().mo12651a("live_type", "video_live").mo12651a("guest_invite_type", "guest_apply_anchor").mo12651a("enter_from", aVar3.mo11113d()).mo12651a("layout_setting", C5586a.m12128a(kVar).getFirst()).mo12651a("window_setting", C5586a.m12128a(kVar).getSecond()).mo12655b();
        Object obj3 = map.get("roomId");
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Long");
        long longValue2 = ((Long) obj3).longValue();
        Object obj4 = map.get("userId");
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue3 = ((Long) obj4).longValue();
        Object obj5 = map.get("secUserId");
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.String");
        String str2 = mo10980c().f17274u;
        Object obj6 = map.get("linkmicPermitStatus");
        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Int");
        return ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).permit(longValue2, longValue3, (String) obj5, value, str2, ((Integer) obj6).intValue()).mo142925c(C5199e.f13440a);
    }

    public C5194a(long j, DataChannel dataChannel) {
        super(j, dataChannel);
        C5271a aVar = new C5271a();
        C4431e.f12034a.mo10198a(aVar, null);
        C4431e.f12034a.mo10198a(new C5668c(), null);
        C4431e.f12034a.mo10201a(this);
        C5586a.f14225a = aVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.b.a$a */
    public static final class C5195a<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C5194a f13433a;

        /* renamed from: b */
        final /* synthetic */ HashMap f13434b;

        /* renamed from: c */
        final /* synthetic */ long f13435c;

        /* renamed from: d */
        final /* synthetic */ LinkApi.EnumC7287e f13436d;

        static {
            Covode.recordClassIndex(5787);
        }

        public C5195a(C5194a aVar, HashMap hashMap, long j, LinkApi.EnumC7287e eVar) {
            this.f13433a = aVar;
            this.f13434b = hashMap;
            this.f13435c = j;
            this.f13436d = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            HashMap<Long, String> c;
            HashMap<Long, String> c2;
            C5832d dVar = (C5832d) obj;
            Throwable th = (Throwable) obj2;
            C7676a aVar = null;
            if (!(dVar == null || dVar.data == null)) {
                Object obj3 = dVar.data;
                C89219l.m154716b(obj3, "");
                C7663b bVar = (C7663b) obj3;
                if (!TextUtils.isEmpty(bVar.f18983b)) {
                    this.f13433a.mo10980c().f17259d = bVar.f18983b;
                    this.f13433a.mo10980c().f17260e = bVar.f18983b;
                    this.f13433a.mo10980c().mo13185a(bVar.f18985d);
                    C5271a b = this.f13433a.mo10979b();
                    if (!(b == null || (c2 = b.mo11112c()) == null)) {
                        c2.clear();
                    }
                    C5271a b2 = this.f13433a.mo10979b();
                    if (!(b2 == null || (c = b2.mo11112c()) == null)) {
                        c.putAll(bVar.f18986e);
                    }
                    this.f13433a.f14370f = bVar.f18983b;
                    HashMap hashMap = this.f13434b;
                    String b3 = C4139e.C4140a.f11575b.mo46674b(bVar);
                    C89219l.m154716b(b3, "");
                    hashMap.put("response", b3);
                    C6898g.C6899a.f17285a.mo13199a(this.f13435c, bVar.f18983b);
                    C5194a aVar2 = this.f13433a;
                    EnumC4401ao aoVar = EnumC4401ao.USER_LINKED;
                    C89219l.m154721d(aoVar, "");
                    if (aVar2.f14375k != aoVar) {
                        aVar2.f14375k = aoVar;
                    }
                    C4386c.m10499a().mo10159a((Integer) 2);
                    C11115u.m19743a().mo17915b().mo13169i().mo116431a_(new C6873g());
                    boolean z = true;
                    if (bVar.f18987f != 1) {
                        z = false;
                    }
                    C5271a b4 = this.f13433a.mo10979b();
                    if (b4 != null) {
                        b4.mo11110a(z);
                    }
                    C5271a b5 = this.f13433a.mo10979b();
                    if (b5 != null) {
                        C7676a aVar3 = bVar.f18988g;
                        if (aVar3 != null) {
                            aVar = C7676a.m15669a(aVar3.f19019a, aVar3.f19020b);
                        }
                        b5.f13638i = aVar;
                    }
                    this.f13433a.mo10978a().mo11444b().mo10986j(this.f13434b);
                    if (z) {
                        C6894d.m14753a().f17275v = 3;
                    } else {
                        C6894d.m14753a().f17275v = 2;
                    }
                } else {
                    this.f13433a.mo10978a().mo11444b().mo10984c(new Exception(), this.f13434b);
                    C5714i.m12532a(this.f13436d, new Exception());
                }
            }
            if (th != null) {
                this.f13433a.mo10978a().mo11444b().mo10984c(th, this.f13434b);
            }
        }
    }
}
