package com.bytedance.android.livesdk.rank.impl.p612e;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.C9544ba;
import com.bytedance.android.livesdk.model.message.C9622au;
import com.bytedance.android.livesdk.model.message.C9685br;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9089da;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.EnumC10344h;
import com.bytedance.android.livesdk.rank.impl.C10372b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.e.c */
public final class C10403c implements AbstractC10336c, OnMessageListener {

    /* renamed from: b */
    private final AbstractC89244h f25112b = C89250i.m154773a((AbstractC89171a) C10404a.f25114a);

    /* renamed from: c */
    private AbstractC0952i f25113c;

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$e */
    static final class C10408e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10408e f25118a = new C10408e();

        static {
            Covode.recordClassIndex(11982);
        }

        C10408e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11977);
    }

    /* renamed from: e */
    private final IMessageManager m18920e() {
        return (IMessageManager) this.f25112b.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$a */
    static final class C10404a extends AbstractC89220m implements AbstractC89171a<IMessageManager> {

        /* renamed from: a */
        public static final C10404a f25114a = new C10404a();

        static {
            Covode.recordClassIndex(11978);
        }

        C10404a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IMessageManager invoke() {
            return ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c
    /* renamed from: b */
    public final void mo17117b() {
        IMessageManager e = m18920e();
        if (e != null) {
            e.removeMessageListener(EnumC9596a.RANK_TOAST_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c
    /* renamed from: d */
    public final boolean mo17119d() {
        Long l = (Long) DataChannelGlobal.f42558d.mo28324b(C9089da.class);
        if (l == null || l.longValue() <= EnumC10344h.RANKINGS_SWITCH_STATUS_HIDE.getValue()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c
    /* renamed from: c */
    public final void mo17118c() {
        ((UserApi) C5805e.m12718a().mo11572a(UserApi.class)).getUserAttr("6").mo142910a(new C11191f()).mo142915a(C10407d.f25117a, C10408e.f25118a);
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c
    /* renamed from: a */
    public final void mo17114a() {
        IMessageManager e = m18920e();
        if (e != null) {
            e.addMessageListener(EnumC9596a.RANK_TOAST_MESSAGE.getIntType(), this);
        }
        IMessageManager e2 = m18920e();
        if (e2 != null) {
            e2.addMessageListener(EnumC9596a.LOCAL_LIVE_PLAY_ORIENTATION_CHANGED_MESSAGE.getIntType(), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$c */
    public static final class C10406c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC10336c.AbstractC10338b f25116a;

        static {
            Covode.recordClassIndex(11980);
        }

        C10406c(AbstractC10336c.AbstractC10338b bVar) {
            this.f25116a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f25116a.mo12613b();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c
    /* renamed from: a */
    public final void mo17116a(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        this.f25113c = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$b */
    public static final class C10405b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC10336c.AbstractC10338b f25115a;

        static {
            Covode.recordClassIndex(11979);
        }

        C10405b(AbstractC10336c.AbstractC10338b bVar) {
            this.f25115a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((C5832d) obj).statusCode == 0) {
                this.f25115a.mo12612a();
            } else {
                this.f25115a.mo12613b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$d */
    static final class C10407d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10407d f25117a = new C10407d();

        static {
            Covode.recordClassIndex(11981);
        }

        C10407d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long value;
            Map<Long, Long> map;
            Long l;
            C5832d dVar = (C5832d) obj;
            if (dVar.statusCode == 0) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
                C9544ba baVar = (C9544ba) dVar.data;
                if (baVar == null || (map = baVar.f23195a) == null || (l = map.get(6L)) == null) {
                    value = EnumC10344h.RANKINGS_SWITCH_STATUS_ON.getValue();
                } else {
                    value = l.longValue();
                }
                dataChannelGlobal.mo28321a(C9089da.class, Long.valueOf(value));
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC0952i iVar;
        Boolean bool;
        AbstractC0952i iVar2;
        if (iMessage instanceof C9685br) {
            C9685br.C9686a aVar = ((C9685br) iMessage).f23574a;
            if (aVar != null) {
                bool = Boolean.valueOf(aVar.f23576b);
            } else {
                bool = null;
            }
            if (C11279p.m20012a(bool) && (iVar2 = this.f25113c) != null) {
                if (C3966y.m9670f()) {
                    C10372b bVar = new C10372b();
                    String str = C10372b.f25061a;
                    C89219l.m154716b(str, "");
                    bVar.show(iVar2, str);
                    return;
                }
                AbstractC10336c.C10337a.f24991a = true;
            }
        } else if ((iMessage instanceof C9622au) && ((C9622au) iMessage).f23423a && AbstractC10336c.C10337a.f24991a && (iVar = this.f25113c) != null) {
            C10372b bVar2 = new C10372b();
            String str2 = C10372b.f25061a;
            C89219l.m154716b(str2, "");
            bVar2.show(iVar, str2);
            AbstractC10336c.C10337a.f24991a = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$g */
    static final class DialogInterface$OnClickListenerC10410g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10403c f25125a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10336c.AbstractC10338b f25126b;

        /* renamed from: c */
        final /* synthetic */ DataChannel f25127c;

        /* renamed from: d */
        final /* synthetic */ String f25128d;

        static {
            Covode.recordClassIndex(11984);
        }

        DialogInterface$OnClickListenerC10410g(C10403c cVar, AbstractC10336c.AbstractC10338b bVar, DataChannel dataChannel, String str) {
            this.f25125a = cVar;
            this.f25126b = bVar;
            this.f25127c = dataChannel;
            this.f25128d = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C10403c.m18918a("livesdk_turn_on_ranking_popup_click", this.f25127c, this.f25128d).mo12651a("button_click_type", "cancel").mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$f */
    static final class DialogInterface$OnClickListenerC10409f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10403c f25119a;

        /* renamed from: b */
        final /* synthetic */ long f25120b;

        /* renamed from: c */
        final /* synthetic */ long f25121c;

        /* renamed from: d */
        final /* synthetic */ AbstractC10336c.AbstractC10338b f25122d;

        /* renamed from: e */
        final /* synthetic */ DataChannel f25123e;

        /* renamed from: f */
        final /* synthetic */ String f25124f;

        static {
            Covode.recordClassIndex(11983);
        }

        DialogInterface$OnClickListenerC10409f(C10403c cVar, long j, long j2, AbstractC10336c.AbstractC10338b bVar, DataChannel dataChannel, String str) {
            this.f25119a = cVar;
            this.f25120b = j;
            this.f25121c = j2;
            this.f25122d = bVar;
            this.f25123e = dataChannel;
            this.f25124f = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C10403c.m18919a(this.f25120b, this.f25121c, this.f25122d);
            C10403c.m18918a("livesdk_turn_on_ranking_popup_click", this.f25123e, this.f25124f).mo12651a("button_click_type", "turn_on").mo12655b();
        }
    }

    /* renamed from: a */
    public static C6501b m18918a(String str, DataChannel dataChannel, String str2) {
        return C6501b.C6502a.m13948a(str).mo12643a(dataChannel).mo12651a("enter_from", "live_page").mo12651a("user_type", str2);
    }

    /* renamed from: a */
    public static void m18919a(long j, long j2, AbstractC10336c.AbstractC10338b bVar) {
        ((UserApi) C5805e.m12718a().mo11572a(UserApi.class)).updateSwitch(j, j2).mo143271a(new C11191f()).mo143254a(new C10405b(bVar), new C10406c(bVar));
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10336c
    /* renamed from: a */
    public final void mo17115a(Context context, long j, long j2, DataChannel dataChannel, String str, AbstractC10336c.AbstractC10338b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        if (context != null) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            AbstractC2994b a = b.mo13147a();
            C89219l.m154716b(a, "");
            if (a.getSecret() == 1 && j2 == EnumC10344h.RANKINGS_SWITCH_STATUS_ON.getValue()) {
                DialogC9148b.C9149a b2 = new DialogC9148b.C9149a(context).mo15243a(R.string.e5e).mo15248b(R.string.e5h).mo15244a(R.string.eaf, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10409f(this, j, j2, bVar, dataChannel, str), false).mo15249b(R.string.e5g, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10410g(this, bVar, dataChannel, str), false);
                b2.f22256m = false;
                b2.mo15247a().show();
                m18918a("livesdk_turn_on_ranking_popup_show", dataChannel, str).mo12655b();
                return;
            }
        }
        m18919a(j, j2, bVar);
    }
}
