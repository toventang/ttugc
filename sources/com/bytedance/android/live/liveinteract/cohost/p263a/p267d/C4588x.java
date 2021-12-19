package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4475e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4462b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p282c.C4677b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p282c.C4692d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p282c.View$OnClickListenerC4672a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p282c.View$OnClickListenerC4690c;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4837a;
import com.bytedance.android.live.liveinteract.linkroom.p292d.p293a.View$OnClickListenerC4896a;
import com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a;
import com.bytedance.android.live.liveinteract.match.p295b.p303g.C4965a;
import com.bytedance.android.live.liveinteract.match.p311ui.p313b.C5022a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p353d.C5499a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog.View$OnClickListenerC5559a;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9752b;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9754d;
import com.bytedance.android.livesdk.p561j.C9139u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Stack;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.x */
public final class C4588x implements C4480f.AbstractC4482b {

    /* renamed from: a */
    public final C4480f.AbstractC4483c f12218a;

    /* renamed from: b */
    private final Stack<C4469d.AbstractC4471b<?>> f12219b = new Stack<>();

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.x$a */
    public enum EnumC4589a {
        BUTTON_FRAGMENT,
        INVITE_USER_LIST_FRAGMENT,
        INVITEE_FRAGMENT,
        SETTING_FRAGMENT,
        SURVEY_FRAGMENT,
        TYPE_PK_BE_INVITED,
        MULTI_LIVE_ANCHOR_SETTING_FRAGMENT;

        static {
            Covode.recordClassIndex(5165);
        }
    }

    static {
        Covode.recordClassIndex(5164);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f.AbstractC4482b
    /* renamed from: c */
    public final void mo10267c() {
        this.f12219b.clear();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f.AbstractC4482b
    /* renamed from: a */
    public final boolean mo10264a() {
        if (this.f12219b.isEmpty()) {
            return false;
        }
        this.f12219b.pop();
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f.AbstractC4482b
    /* renamed from: b */
    public final C4469d.AbstractC4471b<?> mo10266b() {
        if (!this.f12219b.isEmpty()) {
            return this.f12219b.peek();
        }
        return null;
    }

    public C4588x(C4480f.AbstractC4483c cVar) {
        C89219l.m154721d(cVar, "");
        this.f12218a = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: java.util.Stack<com.bytedance.android.live.liveinteract.cohost.a.a.d$b<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.bytedance.android.live.liveinteract.cohost.ui.c.b */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.bytedance.android.live.liveinteract.cohost.ui.c.a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.bytedance.android.live.liveinteract.cohost.ui.c.c */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.bytedance.android.live.liveinteract.cohost.ui.c.d */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: com.bytedance.android.live.liveinteract.match.ui.b.a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f.AbstractC4482b
    /* renamed from: a */
    public final boolean mo10265a(EnumC4589a aVar, C4469d.AbstractC4472c cVar) {
        Boolean bool;
        View$OnClickListenerC4896a aVar2;
        String str;
        boolean z;
        int i;
        C4692d.EnumC4694b bVar;
        C89219l.m154721d(aVar, "");
        DataChannel dataChannel = null;
        if (this.f12218a.mo10268f() != null) {
            EnumC9592k kVar = (EnumC9592k) DataChannelGlobal.f42558d.mo28324b(C9139u.class);
            if (kVar != null) {
                bool = Boolean.valueOf(kVar.isEndPage());
            } else {
                bool = null;
            }
            if (!C11279p.m20012a(bool)) {
                if (cVar != null) {
                    cVar.f12058c = this.f12218a.mo10268f();
                }
                if (this.f12218a instanceof C4469d.AbstractC4474e) {
                    switch (C4590y.f12221a[aVar.ordinal()]) {
                        case 1:
                            if (cVar instanceof C4831a.C4834c) {
                                C4831a.C4834c cVar2 = (C4831a.C4834c) cVar;
                                View$OnClickListenerC4896a aVar3 = new View$OnClickListenerC4896a((byte) 0);
                                aVar3.f12056b = new C4837a(aVar3);
                                aVar3.f12055a = (C4469d.AbstractC4474e) this.f12218a;
                                if (cVar2 != null) {
                                    dataChannel = cVar2.f12058c;
                                }
                                aVar3.f12819d = dataChannel;
                                aVar2 = aVar3;
                                this.f12219b.push(aVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case 2:
                            if (cVar instanceof C4462b.C4465c) {
                                C4469d.AbstractC4474e eVar = (C4469d.AbstractC4474e) this.f12218a;
                                C4462b.C4465c cVar3 = (C4462b.C4465c) cVar;
                                C89219l.m154721d(eVar, "");
                                C89219l.m154721d(cVar3, "");
                                C4677b bVar2 = new C4677b((byte) 0);
                                DataChannel dataChannel2 = cVar3.f12058c;
                                C89219l.m154716b(dataChannel2, "");
                                bVar2.f12056b = new C4542b(bVar2, dataChannel2);
                                bVar2.f12055a = eVar;
                                bVar2.f12381g = cVar3.f12050a;
                                bVar2.f12382h = cVar3.f12058c;
                                aVar2 = bVar2;
                                this.f12219b.push(aVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case 3:
                            if (cVar instanceof C4457a.C4460c) {
                                C4457a.C4460c cVar4 = (C4457a.C4460c) cVar;
                                C89219l.m154721d(cVar4, "");
                                View$OnClickListenerC4672a aVar4 = new View$OnClickListenerC4672a((byte) 0);
                                aVar4.f12056b = new C4533a(aVar4, cVar4.f12058c);
                                aVar4.f12055a = (C4469d.AbstractC4474e) this.f12218a;
                                C9754d dVar = cVar4.f12043a;
                                if (!(dVar == null || dVar.f23764h == null)) {
                                    long j = C4384b.C4385a.m10496a().f11958f;
                                    ImageModel imageModel = dVar.f23764h.f23739e;
                                    C89219l.m154716b(imageModel, "");
                                    String str2 = dVar.f23764h.f23740f;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    int i2 = dVar.f23764h.f23738d;
                                    String str3 = dVar.f23764h.f23742h;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    C9752b bVar3 = dVar.f23764h;
                                    C89219l.m154716b(bVar3, "");
                                    if (bVar3.f23744j == null) {
                                        str = "";
                                    } else {
                                        str = bVar3.f23744j.title;
                                        if (str == null) {
                                            str = "";
                                        }
                                    }
                                    aVar4.f12358g = new View$OnClickListenerC4672a.C4675c(j, imageModel, str2, i2, str3, str, dVar.f23764h.f23743i);
                                    if (dVar.f23764h.f23741g != null) {
                                        if (dVar.f23764h.f23741g.f23734c != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        aVar4.f12360i = z;
                                    }
                                }
                                aVar4.f12359h = new View$OnClickListenerC4672a.C4673a(View$OnClickListenerC4672a.C4674b.m10806a().getOwnerUserId());
                                aVar4.f12356e = View$OnClickListenerC4672a.C4674b.m10806a().getId();
                                aVar4.f12355d = C4384b.C4385a.m10496a().f11957e;
                                aVar4.f12357f = C4384b.C4385a.m10496a().f11968p;
                                aVar2 = aVar4;
                                this.f12219b.push(aVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case 4:
                            View$OnClickListenerC4690c cVar5 = new View$OnClickListenerC4690c((byte) 0);
                            cVar5.f12056b = new C4557c(cVar5);
                            cVar5.f12055a = (C4469d.AbstractC4474e) this.f12218a;
                            aVar2 = cVar5;
                            this.f12219b.push(aVar2 == 1 ? 1 : 0);
                            return true;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            if (cVar instanceof AbstractC4475e.C4478c) {
                                C4469d.AbstractC4474e eVar2 = (C4469d.AbstractC4474e) this.f12218a;
                                AbstractC4475e.C4478c cVar6 = (AbstractC4475e.C4478c) cVar;
                                C89219l.m154721d(eVar2, "");
                                C89219l.m154721d(cVar6, "");
                                C4692d dVar2 = new C4692d((byte) 0);
                                dVar2.f12056b = new C4562d(dVar2, cVar6.f12061a);
                                Long l = cVar6.f12061a.get("invite_type");
                                if (l != null) {
                                    i = (int) l.longValue();
                                } else {
                                    i = 1;
                                }
                                dVar2.f12416i = i;
                                if (dVar2.f12416i == 1) {
                                    bVar = C4692d.EnumC4694b.FOR_FRIEND_HEIGHT;
                                } else {
                                    bVar = C4692d.EnumC4694b.FOR_STRANGER_HEIGHT;
                                }
                                C4692d.f12408j = bVar;
                                dVar2.f12055a = eVar2;
                                aVar2 = dVar2;
                                this.f12219b.push(aVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            if (cVar instanceof C4942a.C4943a) {
                                C4469d.AbstractC4474e eVar3 = (C4469d.AbstractC4474e) this.f12218a;
                                C4942a.C4943a aVar5 = (C4942a.C4943a) cVar;
                                C89219l.m154721d(eVar3, "");
                                C89219l.m154721d(aVar5, "");
                                C5022a aVar6 = new C5022a();
                                DataChannel dataChannel3 = aVar5.f12058c;
                                C89219l.m154716b(dataChannel3, "");
                                aVar6.f12056b = new C4965a(aVar6, dataChannel3);
                                aVar6.f12055a = eVar3;
                                aVar6.f13059e = aVar5.f12907b;
                                aVar6.f13058d = aVar5.f12906a;
                                aVar2 = aVar6;
                                this.f12219b.push(aVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            if (cVar instanceof C4831a.C4834c) {
                                C4831a.C4834c cVar7 = (C4831a.C4834c) cVar;
                                View$OnClickListenerC5559a aVar7 = new View$OnClickListenerC5559a((byte) 0);
                                aVar7.f12056b = new C5499a(aVar7);
                                aVar7.f12055a = (C4469d.AbstractC4474e) this.f12218a;
                                if (cVar7 != null) {
                                    dataChannel = cVar7.f12058c;
                                }
                                aVar7.f14166d = dataChannel;
                                aVar2 = aVar7;
                                this.f12219b.push(aVar2 == 1 ? 1 : 0);
                                return true;
                            }
                            break;
                        default:
                            throw new C89376n();
                    }
                }
            }
        }
        return false;
    }
}
