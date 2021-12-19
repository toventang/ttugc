package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.network.response.C5832d;
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
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;

public interface IWalletService extends AbstractC2953a {

    /* renamed from: com.bytedance.android.live.wallet.IWalletService$a */
    public interface AbstractC6245a {
        static {
            Covode.recordClassIndex(6958);
        }

        /* renamed from: a */
        void mo12250a(Dialog dialog, AbstractC6366h hVar);

        /* renamed from: b */
        void mo12251b(Dialog dialog, AbstractC6366h hVar);
    }

    static {
        Covode.recordClassIndex(6957);
    }

    void configPackagePurchaseHelper(C10935a aVar, DataChannel dataChannel, AbstractC1204m mVar);

    DialogInterface$OnCancelListenerC0944d createRechargeDialogFragment(ActivityC0945e eVar, AbstractC11635b bVar, Bundle bundle, C11637d dVar);

    AbstractC6348a getBasePayPresenter(Activity activity, AbstractC6303a aVar, String str, String str2, int i, AbstractC6357a aVar2);

    Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, AbstractC6245a aVar, String str);

    Fragment getDiamondRechargeFragment(Context context, Bundle bundle);

    Fragment getFirstChargeRewardFragment(int i, int i2);

    Map<String, AbstractC18293d> getLiveWalletJSB(WeakReference<Context> weakReference, C18288a aVar);

    Dialog getPayDialog(Context context, int i, Bundle bundle, ChargeDeal chargeDeal);

    AbstractC6315c getPipoPayHelper();

    List<C11314c> getRechargeItemCache();

    int getRechargeType();

    void handleExceptionForAll(C11310a aVar, Activity activity);

    AbstractC88979t<C5832d<Object>> isFirstCharge();

    int isFirstConsume(AbstractC2994b bVar);

    void openWallet(Activity activity);

    void setRechargeItemCache(List<C11314c> list, int i);

    void showExchangeConfirmDialog(Context context, AbstractC6246a aVar, C6305b bVar);

    DialogInterface$OnCancelListenerC0944d showRechargeDialog(ActivityC0945e eVar, Bundle bundle, DataChannel dataChannel, AbstractC6347f fVar);

    void showTurnOnAutoExchangeDialog(Context context, DataChannel dataChannel);

    AbstractC6332d walletCenter();
}
