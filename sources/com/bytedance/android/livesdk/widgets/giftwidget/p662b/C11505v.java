package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.app.p232b.C4067d;
import com.bytedance.android.live.design.app.p232b.C4072h;
import com.bytedance.android.live.design.app.p232b.C4074i;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C6903bd;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeEnableV2Setting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargePath;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRoomChargeTypeSetting;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6875i;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.service.p625c.p630e.C10742a;
import com.bytedance.android.livesdk.service.p625c.p631f.C10748d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.v */
public final class C11505v {

    /* renamed from: a */
    public Context f27578a;

    /* renamed from: b */
    public DataChannel f27579b;

    /* renamed from: c */
    public AbstractC89172b<C6903bd, C89391z> f27580c = new C11507w(this);

    /* renamed from: d */
    private C6873g<AbstractC2994b> f27581d = new C6873g<AbstractC2994b>() {
        /* class com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11505v.C115061 */

        static {
            Covode.recordClassIndex(13165);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z, com.bytedance.android.livesdk.p456as.C6873g
        public final /* synthetic */ void onNext(AbstractC2994b bVar) {
            super.onNext(bVar);
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        }
    };

    static {
        Covode.recordClassIndex(13164);
    }

    /* renamed from: a */
    public final void mo18318a() {
        Context context = this.f27578a;
        if (context != null) {
            String a = C1764a.m5928a(context.getResources().getString(R.string.gin), new Object[]{LowAgeAnchorLimitSetting.INSTANCE.getValue()});
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(this.f27578a);
            aVar.f22256m = true;
            aVar.f22245b = a;
            aVar.mo15244a(R.string.gjt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11510z(this), false).mo15249b(R.string.gju, DialogInterface$OnClickListenerC11448aa.f27466a, false).mo15247a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18321b(C6903bd bdVar) {
        if (!CanRechargeSetting.INSTANCE.getValue()) {
            mo18318a();
        } else {
            m20339c(bdVar);
        }
    }

    /* renamed from: c */
    private void m20339c(C6903bd bdVar) {
        if (!C11115u.m19743a().mo17915b().mo13165e()) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            Context context = this.f27578a;
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C3966y.m9657a((int) R.string.gsu);
            a.f17234c = 1002;
            a.f17236e = "live_detail";
            a.f17237f = "gift_send";
            a.f17235d = "enableGift";
            b.mo13149a(context, a.mo13173a()).mo143062b(this.f27581d);
        } else if (!C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.RECHARGE)) {
            if (LiveRoomChargeTypeSetting.INSTANCE.getValue() == 1) {
                m20340d(bdVar);
            } else if (this.f27578a instanceof Activity) {
                ((IWalletService) C6193a.m13435a(IWalletService.class)).openWallet(C11279p.m20001a(this.f27578a));
            }
        }
    }

    /* renamed from: d */
    private void m20340d(C6903bd bdVar) {
        if (!C8729d.f21542u.mo15007b() || !LiveFirstRechargeEnableV2Setting.INSTANCE.getValue() || !LiveFirstRechargePath.INSTANCE.getValue() || "other_recharge".equals(bdVar.f17288c)) {
            Context context = this.f27578a;
            if (context != null && (context instanceof ActivityC0945e) && bdVar != null) {
                boolean booleanValue = ((Boolean) this.f27579b.mo28318b(C9119ed.class)).booleanValue();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_bundle_is_anchor", booleanValue);
                bundle.putString("KEY_CHARGE_REASON", bdVar.f17286a);
                bundle.putLong("key_bundle_need_coins", bdVar.f17287b);
                bundle.putString("key_bundle_gift_from", bdVar.f17289d);
                bundle.putString("key_bundle_previous_page", bdVar.f17288c);
                bundle.putInt("key_bundle_charge_source", 0);
                ((IWalletService) C6193a.m13435a(IWalletService.class)).showRechargeDialog((ActivityC0945e) this.f27578a, bundle, this.f27579b, null);
                return;
            }
            return;
        }
        C8729d.f21542u.mo15003a(this.f27578a, bdVar.f17286a);
    }

    /* renamed from: a */
    public final void mo18319a(C6903bd bdVar) {
        if (this.f27578a != null) {
            long[] jArr = {C11115u.m19743a().mo17915b().mo13147a().getId()};
            C6875i iVar = new C6875i();
            boolean b = C6875i.m14731b(this.f27578a, "saved_uid_recharge", jArr[0]);
            if (!LiveLowAgeCountrySetting.INSTANCE.getValue() || UserWithAgeSetting.INSTANCE.getValue() || b) {
                mo18321b(bdVar);
                return;
            }
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(this.f27578a);
            aVar.f22244a = C3966y.m9660a((int) R.string.e5u, Integer.valueOf(LiveRechargeAgeThresholdSetting.INSTANCE.getValue()));
            aVar.f22245b = C3966y.m9657a((int) R.string.e5r);
            DialogC9148b.C9149a b2 = aVar.mo15245a((CharSequence) C3966y.m9657a((int) R.string.e5s), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11508x(this, iVar, jArr, bdVar), false).mo15250b((CharSequence) C3966y.m9657a((int) R.string.e5q), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11509y(this), false);
            b2.f22256m = false;
            b2.mo15247a().show();
            C10748d.m19337a(-1);
        }
    }

    /* renamed from: a */
    public final void mo18320a(String str) {
        LiveDialog.C4056a aVar = new LiveDialog.C4056a(this.f27578a);
        C4072h.C4073a aVar2 = new C4072h.C4073a();
        aVar2.f11261a = this.f27578a.getString(R.string.efy);
        aVar2.f11263c = new C11449ab(this, str);
        C4072h a = aVar2.mo9524a();
        C4074i.C4075a aVar3 = new C4074i.C4075a();
        aVar3.f11261a = this.f27578a.getString(R.string.efx);
        aVar3.f11263c = new C11450ac(str);
        C4067d.C4068a a2 = new C4067d.C4068a().mo9515a(a).mo9515a(aVar3.mo9525a());
        a2.f11269b = 1;
        C4067d a3 = a2.mo9516a();
        aVar.mo9499a(R.string.efz);
        if (str.equals("reject")) {
            aVar.mo9504b(R.string.eg0);
        } else if (str.equals("frequency")) {
            aVar.mo9504b(R.string.eg1);
        }
        aVar.mo9501a(a3);
        aVar.mo9503a().show();
        C10742a.m19332a(str);
    }
}
