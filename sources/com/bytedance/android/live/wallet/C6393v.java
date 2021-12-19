package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.C6367i;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.AbstractC6303a;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.p413a.C6266i;
import com.bytedance.android.live.wallet.p413a.DialogC6248b;
import com.bytedance.android.live.wallet.p414b.C6306a;
import com.bytedance.android.live.wallet.p416c.C6318b;
import com.bytedance.android.live.wallet.p417d.C6334b;
import com.bytedance.android.live.wallet.p418e.C6342b;
import com.bytedance.android.live.wallet.p418e.C6345c;
import com.bytedance.android.live.wallet.p418e.C6346d;
import com.bytedance.android.live.wallet.p419f.p420a.AbstractC6348a;
import com.bytedance.android.live.wallet.p419f.p420a.C6350c;
import com.bytedance.android.live.wallet.p419f.p421b.AbstractC6357a;
import com.bytedance.android.live.wallet.p422g.C6361a;
import com.bytedance.android.livesdk.chatroom.interaction.PackagePurchaseHelper;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeDialogTypeSetting;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.p657a.C11310a;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.v */
public class C6393v implements IWalletService {
    static {
        Covode.recordClassIndex(7123);
    }

    private static String getBannerUrl(DataChannel dataChannel) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getDiamondRechargeFragment(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getPayDialog(Context context, int i, Bundle bundle, ChargeDeal chargeDeal) {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC6332d walletCenter() {
        return C6367i.C6370a.f15908a;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC6315c getPipoPayHelper() {
        return new C6318b(0);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public List<C11314c> getRechargeItemCache() {
        return C6336e.f15839g.mo12388a();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int getRechargeType() {
        if (LiveRechargeDialogTypeSetting.INSTANCE.getValue() == 0) {
            return 2;
        }
        return 3;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC88979t<C5832d<Object>> isFirstCharge() {
        return ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).isFirstCharge().mo143271a(new C11191f());
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void openWallet(Activity activity) {
        if (CanRechargeSetting.INSTANCE.getValue()) {
            ((IHostApp) C6193a.m13435a(IHostApp.class)).openWallet(activity);
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int isFirstConsume(AbstractC2994b bVar) {
        if (bVar.getUserHonor() == null || bVar.getUserHonor().mo16486p() == null || bVar.getUserHonor().mo16486p().size() <= 1 || bVar.getUserHonor().mo16486p().get(1) == null || bVar.getUserHonor().mo16486p().get(1).f24041d != 0) {
            return 0;
        }
        return 1;
    }

    private void checkExchange(Bundle bundle) {
        BalanceStructExtra balanceStructExtra = walletCenter().mo12382f().f15958d;
        BalanceStructExtra exchangeInfo = walletCenter().mo12380e().getExchangeInfo();
        UserBalance userBalance = walletCenter().mo12380e().getUserBalance();
        RevenueExchange revenueExchange = walletCenter().mo12382f().f15957c;
        if (revenueExchange == null || !revenueExchange.getEnableExchange() || balanceStructExtra == null) {
            if (walletCenter().mo12380e().getValidUser() && exchangeInfo != null && userBalance != null) {
                bundle.putInt("key_bundle_show_balance", -1);
                if (exchangeInfo.getMaxCoins() > 0) {
                    bundle.putInt("key_bundle_can_exchange", 2);
                } else if (userBalance.getBalance() > 0) {
                    bundle.putInt("key_bundle_can_exchange", 1);
                }
            }
        } else if (revenueExchange.getBalance() > 0) {
            bundle.putInt("key_bundle_show_balance", -2);
            if (balanceStructExtra.getMaxCoins() > 0) {
                bundle.putInt("key_bundle_can_exchange", 2);
            } else {
                bundle.putInt("key_bundle_can_exchange", 1);
            }
        } else if (!walletCenter().mo12380e().getValidUser() || exchangeInfo == null || userBalance == null || userBalance.getBalance() <= 0) {
            bundle.putInt("key_bundle_show_balance", -2);
            if (balanceStructExtra.getMaxCoins() > 0) {
                bundle.putInt("key_bundle_can_exchange", 2);
            } else if (revenueExchange.getBalance() > 0) {
                bundle.putInt("key_bundle_can_exchange", 1);
            }
        } else {
            bundle.putInt("key_bundle_show_balance", -1);
            if (exchangeInfo.getMaxCoins() > 0) {
                bundle.putInt("key_bundle_can_exchange", 2);
            } else if (userBalance.getBalance() > 0) {
                bundle.putInt("key_bundle_can_exchange", 1);
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void handleExceptionForAll(C11310a aVar, Activity activity) {
        C6361a.m13732a(aVar, activity);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getFirstChargeRewardFragment(int i, int i2) {
        C6306a aVar = new C6306a();
        aVar.f15774a = i;
        aVar.f15775b = i2;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$showTurnOnAutoExchangeDialog$3$WalletService(DialogInterface dialogInterface, int i) {
        C6501b.C6502a.m13948a("livesdk_auto_balance_exchange_click").mo12651a("click", "turn_on").mo12655b();
        walletCenter().mo12371a("auto_exchange_window");
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void setRechargeItemCache(List<C11314c> list, int i) {
        DiamondPackageExtra diamondPackageExtra;
        if (!(i == -1 || (diamondPackageExtra = C6336e.f15839g.f15845e) == null)) {
            diamondPackageExtra.recentlyPurchasedPacketId = i;
        }
        if (!C13603b.m24435a((Collection) list)) {
            C6336e.f15839g.mo12390a(list);
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Map<String, AbstractC18293d> getLiveWalletJSB(WeakReference<Context> weakReference, C18288a aVar) {
        HashMap hashMap = new HashMap();
        C6346d dVar = new C6346d();
        hashMap.put("getPurchaseItemList", new C6345c(weakReference.get(), aVar, dVar));
        hashMap.put("charge", new C6342b(weakReference.get(), aVar, dVar));
        return hashMap;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showTurnOnAutoExchangeDialog(Context context, DataChannel dataChannel) {
        DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(context);
        aVar.f22256m = false;
        aVar.mo15243a(R.string.e11).mo15248b(R.string.e10).mo15244a(R.string.e0y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6397z(this), false).mo15249b(R.string.e0s, DialogInterface$OnClickListenerC6291aa.f15725a, false).mo15247a().show();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void configPackagePurchaseHelper(C10935a aVar, DataChannel dataChannel, AbstractC1204m mVar) {
        new PackagePurchaseHelper(aVar, dataChannel, mVar);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showExchangeConfirmDialog(Context context, AbstractC6246a aVar, C6305b bVar) {
        MethodCollector.m26663i(12906);
        DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
        aVar2.f22247d = R.drawable.by6;
        aVar2.f22256m = false;
        DialogC9148b.C9149a a = aVar2.mo15243a(bVar.f15767a);
        a.f22245b = bVar.f15768b;
        a.mo15244a(bVar.f15770d, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6394w(aVar), false).mo15249b(bVar.f15769c, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6395x(aVar), false);
        if (bVar.f15772f) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.b4k, (ViewGroup) null);
            LiveCheckBox liveCheckBox = (LiveCheckBox) inflate.findViewById(R.id.a4f);
            liveCheckBox.setText(bVar.f15771e);
            liveCheckBox.setOnCheckedChangeListener(new C6396y(aVar));
            aVar2.f22252i = inflate;
        }
        aVar2.mo15247a().show();
        MethodCollector.m26664o(12906);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public DialogInterface$OnCancelListenerC0944d createRechargeDialogFragment(ActivityC0945e eVar, AbstractC11635b bVar, Bundle bundle, C11637d dVar) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bundle, "");
        C6266i iVar = new C6266i();
        iVar.f15675b = eVar;
        iVar.f15685l = null;
        iVar.f15686m = bVar;
        iVar.setArguments(bundle);
        iVar.f15674a = dVar;
        return iVar;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public DialogInterface$OnCancelListenerC0944d showRechargeDialog(ActivityC0945e eVar, Bundle bundle, DataChannel dataChannel, AbstractC6347f fVar) {
        if (HideChargeIconForUserSetting.INSTANCE.getValue() || !CanRechargeSetting.INSTANCE.getValue()) {
            return null;
        }
        AbstractC0952i iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class);
        int i = 1;
        if (!bundle.containsKey("key_bundle_banner_url") || TextUtils.isEmpty(bundle.getString("key_bundle_banner_url"))) {
            String bannerUrl = getBannerUrl(dataChannel);
            i = 1 ^ (TextUtils.isEmpty(bannerUrl) ? 1 : 0);
            bundle.putString("key_bundle_banner_url", bannerUrl);
        }
        bundle.putInt("key_bundle_charge_type", i);
        checkExchange(bundle);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bundle, "");
        C6266i iVar2 = new C6266i();
        iVar2.f15675b = eVar;
        iVar2.setArguments(bundle);
        iVar2.f15685l = fVar;
        if (iVar == null || iVar.mo3551a("RechargeDialog") != null) {
            return null;
        }
        iVar2.show(iVar, "RechargeDialog");
        return iVar2;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, IWalletService.AbstractC6245a aVar, String str) {
        DialogC6248b bVar = new DialogC6248b(activity, bundle.getString("KEY_REQUEST_PAGE"));
        AbstractC6366h a = new C6334b(jSONObject).mo12387a();
        if (a != null) {
            bVar.mo12258a(a);
        }
        bVar.f15627i = aVar;
        bVar.mo12259a(str);
        return bVar;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC6348a getBasePayPresenter(Activity activity, AbstractC6303a aVar, String str, String str2, int i, AbstractC6357a aVar2) {
        C6350c cVar = new C6350c(activity, aVar, str);
        cVar.mo12404a(aVar2);
        return cVar;
    }
}
