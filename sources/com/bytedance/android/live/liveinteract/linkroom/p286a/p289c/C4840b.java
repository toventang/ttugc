package com.bytedance.android.live.liveinteract.linkroom.p286a.p289c;

import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.C4410a;
import com.bytedance.android.live.liveinteract.api.p261b.C4412c;
import com.bytedance.android.live.liveinteract.api.p261b.C4413d;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4494e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4498i;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4499j;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4500k;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p269b.C4598a;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4616a;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p323b.C5194a;
import com.bytedance.android.live.liveinteract.multiguest.p324c.C5200a;
import com.bytedance.android.live.liveinteract.platform.common.api.C5673b;
import com.bytedance.android.live.liveinteract.platform.common.api.C5674c;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5684c;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5741z;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5743b;
import com.bytedance.android.live.liveinteract.platform.p363a.C5659c;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5647a;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5650b;
import com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a;
import com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5658g;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.liveinteract.platform.p367b.AbstractC5663a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReceiveInviteMessageTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.p580d.p581a.C9746a;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9753c;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9754d;
import com.bytedance.android.livesdk.model.message.p580d.p586f.C9766b;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9780a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9075cn;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.C11735p;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.b */
public final class C4840b extends AbstractC7501r<AbstractC4842a> implements HandlerC11626a.AbstractC11627a {

    /* renamed from: a */
    public C4384b f12684a = C4384b.C4385a.m10496a();

    /* renamed from: b */
    AbstractC88412b f12685b;

    /* renamed from: c */
    public Room f12686c;

    /* renamed from: d */
    public boolean f12687d;

    /* renamed from: e */
    boolean f12688e;

    /* renamed from: f */
    public boolean f12689f;

    /* renamed from: g */
    public boolean f12690g;
    @AbstractC4430d(mo10204a = "LINKER_MANAGER")

    /* renamed from: h */
    public C5659c f12691h;

    /* renamed from: i */
    private HandlerC11626a f12692i;

    /* renamed from: j */
    private EnumC11728i f12693j;
    @AbstractC4430d(mo10204a = "LINK_MESSAGE_CENTER")

    /* renamed from: k */
    private C5658g f12694k;

    /* renamed from: l */
    private final C5652a f12695l = new C5652a() {
        /* class com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.C48411 */

        static {
            Covode.recordClassIndex(5423);
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a, com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5654c
        /* renamed from: a */
        public final void mo10325a(C9606aj ajVar) {
            if (C4840b.this.f38654y != null) {
                ((AbstractC4842a) C4840b.this.f38654y).mo10584a(ajVar);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a, com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5654c
        /* renamed from: d */
        public final void mo10576d(C9606aj ajVar) {
            C9746a.EnumC9747a aVar;
            if (C4840b.this.f12687d && ajVar.f23324j != null) {
                C9746a.EnumC9747a aVar2 = C9746a.EnumC9747a.INVITE_CANCEL;
                int i = ajVar.f23324j.f23728c;
                if (i == 0) {
                    aVar = C9746a.EnumC9747a.INVITE_CANCEL;
                } else if (i != 1) {
                    aVar = C9746a.EnumC9747a.TYPE_UNKNOWN;
                } else {
                    aVar = C9746a.EnumC9747a.APPLY_CANCEL;
                }
                if (aVar2 == aVar) {
                    C4617b.m10745b(ajVar);
                    if (C4840b.this.f12684a.f11957e > 0 && C4840b.this.f12684a.f11957e == ajVar.f23320f) {
                        if (!TextUtils.isEmpty(ajVar.f23335u)) {
                            C4840b.this.f12684a.mo10146b(ajVar.f23335u);
                        }
                        ((AbstractC4842a) C4840b.this.f38654y).mo10592e();
                        ((AbstractC4842a) C4840b.this.f38654y).mo10591d();
                    }
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a, com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5657f
        /* renamed from: e */
        public final void mo10577e(C9606aj ajVar) {
            List<C9766b> list;
            if (C4840b.this.f38654y != null && !C4840b.this.f12687d) {
                boolean z = false;
                boolean z2 = true;
                if (ajVar.mo16562c() == C9606aj.EnumC9607a.ANCHOR_LINKMIC) {
                    if (!(ajVar.f23326l == null || (list = ajVar.f23326l.f23730a) == null || list.size() < 2)) {
                        for (C9766b bVar : list) {
                            if (bVar.f23771a.getId() == C4840b.this.f12686c.getOwnerUserId()) {
                                z = true;
                            } else {
                                C4840b.this.f12684a.f11958f = bVar.f23771a.getId();
                            }
                        }
                        if (z) {
                            if (!(C4840b.this.f12691h.mo11439a() instanceof C4598a)) {
                                C4840b.this.mo10564a();
                            }
                            C4384b.C4385a.m10496a().f11937a = true;
                            ((AbstractC4842a) C4840b.this.f38654y).mo10587b();
                        }
                    }
                } else if (ajVar.mo16562c() == C9606aj.EnumC9607a.AUDIENCE_LINKMIC && ajVar.f23326l != null) {
                    List<C9766b> list2 = ajVar.f23326l.f23730a;
                    if (list2.size() == 1 && list2.get(0).f23771a.getId() == C4840b.this.f12686c.getOwnerUserId()) {
                        long j = ajVar.f23326l.f23731b;
                        C4840b bVar2 = C4840b.this;
                        if (j != 1) {
                            z2 = false;
                        }
                        bVar2.f12690g = z2;
                        C6894d.m14753a().f17259d = list2.get(0).f23773c;
                        C5741z.f14564b = "others";
                        ((AbstractC4842a) C4840b.this.f38654y).mo10582a(LinkApi.EnumC7287e.AUDIENCE_OPEN);
                    }
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a, com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5657f
        /* renamed from: f */
        public final void mo10578f(C9606aj ajVar) {
            List<C9766b> list;
            if (!(C4840b.this.f38654y == null || C4840b.this.f12687d || ajVar.mo16562c() != C9606aj.EnumC9607a.ANCHOR_LINKMIC || ajVar.f23325k == null || (list = ajVar.f23325k.f23770a) == null || list.size() < 2)) {
                boolean z = false;
                long j = 0;
                for (C9766b bVar : list) {
                    if (bVar.f23771a.getId() == C4840b.this.f12686c.getOwnerUserId()) {
                        z = true;
                    } else {
                        j = bVar.f23771a.getId();
                    }
                }
                if (z) {
                    if (!(C4840b.this.f12691h.mo11439a() instanceof C4598a)) {
                        C4840b.this.mo10564a();
                    }
                    C4384b.C4385a.m10496a().f11937a = true;
                    C4384b.C4385a.m10496a().f11958f = j;
                    ((AbstractC4842a) C4840b.this.f38654y).mo10587b();
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a, com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5654c
        /* renamed from: c */
        public final void mo10575c(C9606aj ajVar) {
            String str;
            String str2;
            DataChannel dataChannel;
            if (C4840b.this.f12687d && ajVar.mo16562c() == C9606aj.EnumC9607a.ANCHOR_LINKMIC && ajVar.f23323i != null) {
                C3854a.m9453a(3, "LinkControlPresenter", "receive reply  message");
                C4617b.m10739a(ajVar);
                C4840b.this.mo10571d();
                C9780a aVar = ajVar.f23323i;
                if (aVar.f23801i == 2 || aVar.f23801i == 5) {
                    ((AbstractC4842a) C4840b.this.f38654y).mo10588b(aVar.f23801i);
                }
                if (C4840b.this.f12684a.f11957e != ajVar.f23320f || C4840b.this.f12684a.f11958f == 0) {
                    return;
                }
                if (C4840b.this.f12684a.mo10150a(EnumC4440k.CONNECTION_FINISH)) {
                    C11226ao.m19882a(C3966y.m9669e(), ((AbstractC4842a) C4840b.this.f38654y).mo10579a(aVar.f23801i));
                    return;
                }
                try {
                    C4598a aVar2 = (C4598a) C4840b.this.f12691h.mo11442b(C5647a.EnumC5648a.COHOST);
                    C89219l.m154721d(ajVar, "");
                    C9780a aVar3 = ajVar.f23323i;
                    aVar2.mo10340a().mo10146b(ajVar.f23335u);
                    boolean z = true;
                    if (aVar3.f23801i == 1) {
                        aVar2.f14370f = aVar3.f23796d.f23821h;
                        aVar2.mo10340a().mo10154d(aVar3.f23796d.f23821h);
                        aVar2.mo10340a().f11923M = aVar3.f23799g.f23821h;
                        C6898g.C6899a.f17285a.mo13199a(aVar3.f23797e, aVar3.f23799g.f23821h);
                        aVar2.mo10340a().f11913C = System.currentTimeMillis();
                        if (!TextUtils.isEmpty(aVar3.f23796d.f23818e)) {
                            aVar2.mo10340a().mo10145a(aVar3.f23796d.f23818e);
                        }
                        if (!LinkServerAutoJoinChannel.INSTANCE.getValue() && (dataChannel = aVar2.f14378n) != null) {
                            dataChannel.mo28319c(C4494e.class);
                        }
                    }
                    ((AbstractC4842a) C4840b.this.f38654y).mo10581a(aVar.f23801i, PrivacyCert.Builder.with("bpea-503").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    if (aVar.f23801i != 1) {
                        z = false;
                    }
                    C6501b a = C6501b.C6502a.m13948a("livesdk_connection_response_receive").mo12639a().mo12651a("connection_type", "anchor").mo12646a("invitee_id", C4384b.C4385a.m10496a().f11958f);
                    if (C4384b.C4385a.m10496a().f11968p == EnumC4442m.FOLLOW_INVITE) {
                        str = "mutual_follow";
                    } else {
                        str = "recommend";
                    }
                    C6501b a2 = a.mo12651a("invitee_list", str);
                    if (z) {
                        str2 = "accept";
                    } else {
                        str2 = "reject";
                    }
                    a2.mo12651a("selection", str2).mo12646a("response_duration", System.currentTimeMillis() - C4384b.C4385a.m10496a().f11940ac).mo12655b();
                } catch (NullPointerException unused) {
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a, com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5654c
        /* renamed from: b */
        public final void mo10574b(C9606aj ajVar) {
            Boolean bool;
            AbstractC88403ab<R> a;
            Room room;
            if (C4840b.this.f38654y != null && C4840b.this.f12687d && ajVar.mo16562c() == C9606aj.EnumC9607a.ANCHOR_LINKMIC) {
                C9754d a2 = C5743b.m12613a(ajVar);
                C4617b.m10741a(ajVar, a2);
                if (a2 != null && ajVar.f23322h != null && a2.f23764h != null) {
                    C4840b.this.mo10564a();
                    if (C4840b.this.f12691h.mo11439a() instanceof C4598a) {
                        C4840b.this.f12691h.mo11439a().f14372h = false;
                        C4598a aVar = (C4598a) C4840b.this.f12691h.mo11439a();
                        boolean z = C4840b.this.f12689f;
                        C4864x xVar = new C4864x(this, a2);
                        C89219l.m154721d(ajVar, "");
                        C89219l.m154721d(xVar, "");
                        C9754d a3 = C5743b.m12613a(ajVar);
                        if (a3 != null && ajVar.f23322h != null && a3.f23764h != null) {
                            C89219l.m154721d(ajVar, "");
                            C9754d a4 = C5743b.m12613a(ajVar);
                            DataChannel dataChannel = aVar.f14378n;
                            int i = 12;
                            if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || room.getMosaicStatus() != 1) {
                                C6805b<Boolean> bVar = AbstractC6804a.f17035ci;
                                C89219l.m154716b(bVar, "");
                                Boolean a5 = bVar.mo13066a();
                                C89219l.m154716b(a5, "");
                                if (a5.booleanValue()) {
                                    i = 2;
                                } else {
                                    if (a4 == null) {
                                        C89219l.m154715b();
                                    }
                                    if (a4.f23757a == 2) {
                                        if (aVar.mo10340a().f11958f <= 0) {
                                            if (((long) a4.f23759c) != aVar.mo10340a().f11915E) {
                                                i = 8;
                                            }
                                            i = 0;
                                        }
                                    } else if (z) {
                                        i = 9;
                                    } else if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                                        LiveAppBundleUtils.ensurePluginAvailable(C3966y.m9669e(), EnumC11229b.LINK_MIC);
                                        i = 10;
                                    } else {
                                        C6894d a6 = C6894d.m14753a();
                                        C89219l.m154716b(a6, "");
                                        if (a6.f17258c || (C4394ah.m10505a(aVar.mo10340a().mo10147a(), 2) && !TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue())) {
                                            i = 11;
                                        } else {
                                            DataChannel dataChannel2 = aVar.f14378n;
                                            if (dataChannel2 != null) {
                                                bool = (Boolean) dataChannel2.mo28318b(C9075cn.class);
                                            } else {
                                                bool = null;
                                            }
                                            if (!C11279p.m20012a(bool)) {
                                                if (C4384b.C4385a.m10496a().f11949al) {
                                                    i = 13;
                                                } else if (TextUtils.isEmpty(aVar.mo10340a().f11923M) && aVar.mo10340a().f11958f <= 0) {
                                                    if (a4.f23762f != 4 || (ajVar.f23322h.f23749e & 12) <= 0) {
                                                        i = 3;
                                                    } else {
                                                        if (Build.VERSION.SDK_INT < 21) {
                                                            i = 7;
                                                        }
                                                        i = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = 4;
                                }
                            } else {
                                i = 6;
                            }
                            C3854a.m9453a(4, "CoHostLinker", "tryRefuseInvite, refuseReason = $refuseReason");
                            if (i > 0) {
                                long j = ajVar.f23322h.f23745a;
                                long j2 = ajVar.f23320f;
                                int i2 = ajVar.f23322h.f23749e;
                                String str = ajVar.f23335u;
                                HashMap hashMap = new HashMap();
                                hashMap.put("channel_id", Long.valueOf(j2));
                                hashMap.put("room_id", Long.valueOf(aVar.f14369e));
                                hashMap.put("vendor", Integer.valueOf(i2));
                                hashMap.put("rtc_join_channel_advance", Boolean.valueOf(ajVar.f23322h.f23748d));
                                hashMap.put("guest_user_id", Long.valueOf(j));
                                hashMap.put("reply_status", Integer.valueOf(i));
                                C89219l.m154716b(str, "");
                                hashMap.put("transparent_extra", str);
                                AbstractC88403ab<C5661a> b = aVar.mo10344b(hashMap);
                                if (b != null && (a = b.mo142910a(new C11191f())) != null) {
                                    a.mo142915a(C4598a.C4610l.f12251a, new C4598a.C4611m(aVar));
                                    return;
                                }
                                return;
                            }
                            if (TTliveLinkmicMsgOptimizationSwitchSetting.INSTANCE.getValue() != 1 || !ajVar.mo16564e()) {
                                long d = ajVar.mo16563d();
                                long value = (long) (MtCoHostReceiveInviteMessageTimeOutSetting.INSTANCE.getValue() * 1000);
                                if (d >= value) {
                                    C4617b.m10740a(ajVar, 0, value, a3);
                                    return;
                                }
                            } else {
                                long f = ajVar.mo16565f();
                                long value2 = (long) (TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting.INSTANCE.getValue() * 1000);
                                if (f < value2) {
                                    C4617b.m10740a(ajVar, value2, 0, a3);
                                    return;
                                }
                                aVar.mo10340a().f11935Y = (int) (ajVar.mo16565f() / 1000);
                            }
                            C9753c cVar = ajVar.f23322h;
                            aVar.mo10340a().mo10146b(ajVar.f23335u);
                            aVar.mo10340a().f11957e = ajVar.f23320f;
                            aVar.f14373i = ajVar.f23320f;
                            aVar.mo10340a().f11954b = true;
                            aVar.mo10340a().mo10154d(cVar.f23751g);
                            aVar.mo10340a().f11923M = cVar.f23752h;
                            aVar.f14370f = cVar.f23751g;
                            aVar.mo10340a().f11958f = cVar.f23745a;
                            aVar.mo10340a().f11970r = a3.f23761e;
                            aVar.mo10340a().f11914D = a3.f23757a;
                            if (a3.f23760d != null) {
                                C4384b a7 = aVar.mo10340a();
                                String str2 = a3.f23760d;
                                C89219l.m154716b(str2, "");
                                a7.f11971s = str2;
                            }
                            aVar.mo10340a().f11960h = cVar.f23746b;
                            aVar.mo10340a().f11961i = aVar.f14369e;
                            int i3 = a3.f23758b;
                            if (i3 == 1) {
                                aVar.mo10340a().f11968p = EnumC4442m.FOLLOW_INVITE;
                            } else if (i3 == 2) {
                                aVar.mo10340a().f11968p = EnumC4442m.RECOMMEND_INVITE;
                            } else if (i3 != 5) {
                                aVar.mo10340a().f11968p = EnumC4442m.NONE;
                            } else {
                                aVar.mo10340a().f11968p = EnumC4442m.RANDOM_LINK_MIC_INVITE;
                            }
                            aVar.mo10340a().f11915E = (long) a3.f23759c;
                            aVar.mo10340a().f11959g = cVar.f23750f;
                            if (cVar.f23748d && !TextUtils.isEmpty(cVar.f23747c)) {
                                aVar.mo10340a().mo10145a(cVar.f23747c);
                            }
                            aVar.mo10340a().f11975w = cVar.f23748d;
                            aVar.mo10340a().f11965m = true;
                            C5703b.m12462a(C5703b.EnumC5706c.ANCHOR, false);
                            xVar.invoke();
                        }
                    }
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.b$a */
    public interface AbstractC4842a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(5424);
        }

        /* renamed from: a */
        int mo10579a(int i);

        /* renamed from: a */
        void mo10580a();

        /* renamed from: a */
        void mo10581a(int i, PrivacyCert privacyCert);

        /* renamed from: a */
        void mo10582a(LinkApi.EnumC7287e eVar);

        /* renamed from: a */
        void mo10583a(LinkApi.EnumC7287e eVar, Throwable th);

        /* renamed from: a */
        void mo10584a(C9606aj ajVar);

        /* renamed from: a */
        void mo10585a(C9754d dVar);

        /* renamed from: a */
        void mo10586a(boolean z);

        /* renamed from: b */
        void mo10587b();

        /* renamed from: b */
        void mo10588b(int i);

        /* renamed from: b */
        void mo10589b(boolean z);

        /* renamed from: c */
        void mo10590c();

        /* renamed from: d */
        void mo10591d();

        /* renamed from: e */
        void mo10592e();

        /* renamed from: f */
        void mo10593f();

        /* renamed from: h */
        void mo10594h();
    }

    static {
        Covode.recordClassIndex(5422);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10569a(LinkApi.EnumC7287e eVar, Throwable th) {
        this.f12688e = false;
        mo13747a(th);
        if (!(th instanceof C2912a) || ((C2908a) th).getErrorCode() != 31011) {
            ((AbstractC4842a) this.f38654y).mo10583a(eVar, th);
        } else {
            ((AbstractC11137ac) ((LinkReviewApi) C5805e.m12718a().mo11572a(LinkReviewApi.class)).bannedInfo(13).mo142916a(mo13749v())).mo17937a(new C4861u(this), new C4862v(this));
        }
    }

    /* renamed from: d */
    public final void mo10571d() {
        AbstractC88412b bVar = this.f12685b;
        if (bVar != null) {
            bVar.dispose();
            this.f12685b = null;
        }
        m10972e();
    }

    /* renamed from: c */
    public static boolean m10971c() {
        if (!C4394ah.m10505a(C4384b.C4385a.m10496a().mo10147a(), 2) || TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m10972e() {
        C4384b.C4385a.m10496a().f11924N = -1;
        if (this.f18624w != null) {
            this.f18624w.mo28315b(C4500k.class, (Object) -1);
        }
    }

    /* renamed from: a */
    public final void mo10564a() {
        C4431e.f12034a.mo10198a(new C4616a(), null);
        C5650b bVar = new C5650b();
        bVar.f14365b = this.f12687d;
        this.f12691h.mo11440a(this.f12686c.getOwnerUserId(), C5647a.EnumC5648a.COHOST, this.f18624w, bVar);
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    public final void mo8577b() {
        this.f12684a.mo10156e("LinkControlPresenter_OnDestroy");
        this.f12694k.mo11438b(this.f12695l);
        this.f12692i.removeCallbacksAndMessages(null);
        mo10571d();
        Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
        if (a instanceof C5271a) {
            C5713h.m12507a(((C5271a) a).f13646q);
        } else {
            C5713h.m12507a((EnumC4422k) null);
        }
        if (C4502a.m10583a()) {
            C4502a.m10578a(C4502a.EnumC4505b.EXIT);
        }
        super.mo8577b();
    }

    public final void onEvent(C4412c cVar) {
        if (this.f38654y != null) {
            ((AbstractC4842a) this.f38654y).mo10593f();
        }
    }

    public final void onEvent(C4410a aVar) {
        if (this.f38654y != null) {
            int i = aVar.f11996a;
            if (i == 1) {
                ((AbstractC4842a) this.f38654y).mo10580a();
            } else if (i == 2) {
                ((AbstractC4842a) this.f38654y).mo10590c();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public final void handleMsg(Message message) {
        if (this.f38654y == null || message.what != 2) {
            return;
        }
        if (!(message.obj instanceof Room) || !Room.isValid((Room) message.obj)) {
            m10970a(this.f12686c);
        } else {
            m10970a((Room) message.obj);
        }
    }

    /* renamed from: a */
    private void m10970a(Room room) {
        boolean z;
        this.f12686c = room;
        C5702a.m12448a("SyncRoomStats", room);
        if (this.f12686c.isWithLinkMic()) {
            if (this.f12686c.getLinkMicInfo() == null || this.f12686c.getLinkMicInfo().f28084f != 1) {
                z = false;
            } else {
                z = true;
            }
            this.f12690g = z;
            C5741z.f14564b = "live_play";
            ((AbstractC4842a) this.f38654y).mo10582a(LinkApi.EnumC7287e.AUDIENCE_OPEN);
        }
        C11735p linkMicInfo = this.f12686c.getLinkMicInfo();
        if (linkMicInfo != null) {
            C4384b a = C4384b.C4385a.m10496a();
            a.f11958f = linkMicInfo.f28080b;
            a.mo10148a(linkMicInfo);
            if (a.f11957e > 0) {
                ((AbstractC4842a) this.f38654y).mo10587b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo10570b(int i) {
        C5702a.m12447a("LinkCross_Invite_TimeOut");
        C3866a.m9474a(new JSONObject(), "time_out", (long) i);
        C4617b bVar = C4617b.f12263e;
        C4617b.m10742a((C4617b) "invite_timeout", (String) new JSONObject(), (JSONObject) 0);
        mo10567a(LinkApi.EnumC7283a.COUNTDOWN_CANCEL);
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dwh);
    }

    /* renamed from: a */
    public final void mo10565a(int i) {
        C5702a.m12450a("LinkCross_Reply_RtcJoinChannelFailed", true);
        HashMap<String, Object> d = C4617b.m12493d();
        d.put("reply_status", Integer.valueOf(i));
        if (this.f12691h.mo11439a() instanceof C4598a) {
            if (this.f12691h.mo11439a().mo10344b(d) != null) {
                ((AbstractC11137ac) this.f12691h.mo11439a().mo10344b(d).mo142916a(mo13749v())).mo17937a(C4854n.f12709a, new C4856p(this));
            }
            ((C4598a) this.f12691h.mo11439a()).mo10346c();
        }
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC4842a aVar) {
        super.mo10297a((AbstractC8094bq) aVar);
        this.f12692i = new HandlerC11626a(this);
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C4410a.class).mo143274a(mo13748u())).mo17949a(new C4843c(this));
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C4412c.class).mo143274a(mo13748u())).mo17949a(new C4844d(this));
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C4413d.class).mo143274a(mo13748u())).mo17949a(new C4855o(this));
        this.f12694k.mo11437a(this.f12695l);
        if (this.f12687d) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).getAnchorLinkMicUserSetting(room.getId(), room.getOwner().getSecUid()).mo143271a(new C11191f()).mo143254a(C5673b.f14408a, C5674c.f14409a);
            }
        } else if (C4384b.m10481c()) {
            m10970a(this.f12686c);
        } else {
            C7307f.f18161a.mo13557a(this.f12692i, this.f12687d, this.f12686c.getId(), 2);
        }
        if (this.f12687d && this.f12693j == EnumC11728i.VIDEO) {
            ((AbstractC11137ac) ((CoHostApi) C5805e.m12718a().mo11572a(CoHostApi.class)).checkPermissionV3(this.f12686c.getId()).mo142916a(mo13749v())).mo17937a(new C4863w(this), new C4845e(this));
            ((AbstractC11137ac) ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).checkPermissionV1(this.f12686c.getId(), this.f12686c.getOwnerUserId(), 1).mo142916a(mo13749v())).mo17937a(new C4846f(this), new C4847g(this));
        }
        if (this.f18624w != null) {
            this.f18624w.mo28310a(C4499j.class, (AbstractC89172b) new C4857q(this)).mo28310a(C4498i.class, (AbstractC89172b) new C4858r(this));
        }
    }

    /* renamed from: a */
    public final void mo10567a(LinkApi.EnumC7283a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("cancel_reason", aVar);
        if (!(this.f12691h.mo11439a() == null || this.f12691h.mo11439a().mo10348e(hashMap) == null)) {
            ((AbstractC11137ac) this.f12691h.mo11439a().mo10348e(hashMap).mo142916a(mo13749v())).mo17937a(C4848h.f12702a, new C4849i(this));
        }
        if (this.f12691h.mo11439a() instanceof C4598a) {
            ((C4598a) this.f12691h.mo11439a()).mo10346c();
        }
        m10972e();
        this.f12685b = null;
    }

    /* renamed from: a */
    public final void mo10568a(LinkApi.EnumC7287e eVar) {
        int i;
        C3854a.m9453a(4, "LinkControlPresenter", "initAndTurnOnMultiGuest, mTurningOnAudienceInteract = " + this.f12688e + "  mIsMicRoom = " + this.f12689f);
        if (!this.f12688e && !this.f12689f) {
            this.f12688e = true;
            C4431e.f12034a.mo10198a(new C5200a(), null);
            C5650b bVar = new C5650b();
            bVar.f14365b = this.f12687d;
            this.f12691h.mo11440a(this.f12686c.getOwnerUserId(), C5647a.EnumC5648a.MULTIGUEST, this.f18624w, bVar);
            if (this.f12686c.isLiveTypeAudio()) {
                i = 8;
            } else {
                i = 1;
            }
            if (this.f18624w != null) {
                this.f18624w.mo28311a(C5684c.class, (Object) null);
            }
            C6806c.m14603a((C6800c) AbstractC6804a.f17036cj, (Object) true);
            if (this.f12691h.mo11439a() instanceof C5194a) {
                C5194a aVar = (C5194a) this.f12691h.mo11439a();
                long id = this.f12686c.getId();
                C89219l.m154721d(eVar, "");
                HashMap hashMap = new HashMap();
                hashMap.put("source", eVar);
                aVar.f14369e = id;
                AbstractC5663a aVar2 = aVar.f13430c;
                if (aVar2 == null) {
                    C89219l.m154710a("mLinkLogger");
                }
                aVar2.mo11444b().mo10985i(hashMap);
                AbstractC88403ab<R> a = ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).init(id, 12, i).mo142910a(new C11191f()).mo142912a(new C5194a.C5195a(aVar, hashMap, id, eVar));
                C89219l.m154716b(a, "");
                ((AbstractC11137ac) a.mo142916a(mo13749v())).mo17937a(new C4859s(this, eVar), new C4860t(this, eVar));
            }
        }
    }

    public C4840b(Room room, boolean z, EnumC11728i iVar) {
        this.f12686c = room;
        this.f12687d = z;
        this.f12693j = iVar;
        C4431e.f12034a.mo10201a(this);
    }
}
