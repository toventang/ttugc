package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.AbstractC6303a;
import com.bytedance.android.live.wallet.p419f.p420a.AbstractC6348a;
import com.bytedance.android.live.wallet.p419f.p421b.AbstractC6357a;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.p657a.C11310a;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.ab */
public class C6292ab implements IWalletService {
    static {
        Covode.recordClassIndex(7005);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void configPackagePurchaseHelper(C10935a aVar, DataChannel dataChannel, AbstractC1204m mVar) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public DialogInterface$OnCancelListenerC0944d createRechargeDialogFragment(ActivityC0945e eVar, AbstractC11635b bVar, Bundle bundle, C11637d dVar) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC6348a<?> getBasePayPresenter(Activity activity, AbstractC6303a aVar, String str, String str2, int i, AbstractC6357a aVar2) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, IWalletService.AbstractC6245a aVar, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getDiamondRechargeFragment(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getFirstChargeRewardFragment(int i, int i2) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getPayDialog(Context context, int i, Bundle bundle, ChargeDeal chargeDeal) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC6315c getPipoPayHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int getRechargeType() {
        return 0;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void handleExceptionForAll(C11310a aVar, Activity activity) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC88979t<C5832d<Object>> isFirstCharge() {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int isFirstConsume(AbstractC2994b bVar) {
        return 0;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void openWallet(Activity activity) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void setRechargeItemCache(List<C11314c> list, int i) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showExchangeConfirmDialog(Context context, AbstractC6246a aVar, C6305b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public DialogInterface$OnCancelListenerC0944d showRechargeDialog(ActivityC0945e eVar, Bundle bundle, DataChannel dataChannel, AbstractC6347f fVar) {
        C89219l.m154721d(eVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showTurnOnAutoExchangeDialog(Context context, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public AbstractC6332d walletCenter() {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public List<C11314c> getRechargeItemCache() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Map<String, AbstractC18293d> getLiveWalletJSB(WeakReference<Context> weakReference, C18288a aVar) {
        return new LinkedHashMap();
    }
}
