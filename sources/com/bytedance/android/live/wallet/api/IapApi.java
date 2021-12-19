package com.bytedance.android.live.wallet.api;

import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.base.C6313b;
import com.bytedance.android.live.wallet.base.PayOrderResultStruct;
import com.bytedance.android.live.wallet.base.SubOrderResultStruct;
import com.bytedance.android.live.wallet.base.p415a.C6312a;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.C6382e;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.C11317f;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

public interface IapApi {
    static {
        Covode.recordClassIndex(7017);
    }

    @AbstractC22012t(mo35799a = "/webcast/wallet_api_tiktok/auto_exchange/")
    AbstractC88979t<C5832d<AutoExchangeData>> autoExchange(@AbstractC22018z(mo35807a = "auto_exchange") boolean z);

    @AbstractC22012t(mo35799a = "/hotsoon/props/bundles/buy/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C11317f>> buyPackage(@AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC22012t(mo35799a = "/hotsoon/ward/buy/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C11317f>> buyWard(@AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/wallet_api/query_order/")
    AbstractC88979t<C5832d<PayOrderResultStruct>> checkOrderResult(@AbstractC22018z(mo35807a = "order_id") String str);

    @AbstractC22000h(mo35789a = "/webcast/sub/contract/status/")
    AbstractC88979t<C5832d<SubOrderResultStruct>> checkSubOrder(@AbstractC22018z(mo35807a = "to_uid") String str, @AbstractC22018z(mo35807a = "contract_id") String str2);

    @AbstractC22012t(mo35799a = "/webcast/wallet_api/diamond_buy/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C6313b>> createAmazonOrder(@AbstractC21997e(mo35786a = "way") int i, @AbstractC21997e(mo35786a = "diamond_id") int i2, @AbstractC21997e(mo35786a = "currency") String str, @AbstractC21997e(mo35786a = "source") int i3, @AbstractC21997e(mo35786a = "price_amount_micros") long j, @AbstractC21997e(mo35786a = "iap_country_code") String str2, @AbstractC21997e(mo35786a = "amazon_id") String str3);

    @AbstractC22012t(mo35799a = "/webcast/wallet_api/diamond_buy/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C6313b>> createOrder(@AbstractC21997e(mo35786a = "way") int i, @AbstractC21997e(mo35786a = "diamond_id") int i2, @AbstractC21997e(mo35786a = "currency") String str, @AbstractC21997e(mo35786a = "source") int i3, @AbstractC21997e(mo35786a = "price_amount_micros") long j, @AbstractC21997e(mo35786a = "first_recharge") boolean z);

    @AbstractC22000h(mo35789a = "/hotsoon/diamond/{dealId}/_buy/")
    AbstractC88979t<String> createOrderInfo(@AbstractC22016x(mo35804a = "dealId") String str, @AbstractC22018z(mo35807a = "way") int i, @AbstractC22018z(mo35807a = "pay_currency") String str2);

    @AbstractC22012t(mo35799a = "/webcast/wallet_api/diamond_exchange/")
    @AbstractC21999g
    AbstractC88979t<C5832d> exchangeCoins(@AbstractC21997e(mo35786a = "diamond_id") int i, @AbstractC21997e(mo35786a = "way") int i2, @AbstractC21997e(mo35786a = "currency") String str, @AbstractC21997e(mo35786a = "source") int i3, @AbstractC21997e(mo35786a = "coins_count") long j, @AbstractC21997e(mo35786a = "local_amount") long j2, @AbstractC21997e(mo35786a = "currency_dot") long j3);

    @AbstractC22000h(mo35789a = "/webcast/diamond/")
    AbstractC88979t<C5827a<C11314c, DiamondPackageExtra>> fetchDiamondPackage(@AbstractC22018z(mo35807a = "currency") String str, @AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2, @AbstractC22018z(mo35807a = "type") long j3);

    @AbstractC22000h(mo35789a = "/hotsoon/wallet/payment_channels/")
    AbstractC88979t<C5831c<C6382e>> fetchOptionList();

    @AbstractC22000h(mo35789a = "/luckycat/tiktokm/v1/user/balance/get")
    AbstractC88979t<C5832d<BalanceStruct>> getBalanceInfo(@AbstractC22018z(mo35807a = "scene") int i);

    @AbstractC22012t(mo35799a = "/webcast/recharge/base_package/")
    @AbstractC21999g
    AbstractC88979t<C5832d<BalanceStructExtra>> getExchangeRatio(@AbstractC21997e(mo35786a = "currency") String str, @AbstractC21997e(mo35786a = "package_region") String str2, @AbstractC21997e(mo35786a = "type") long j, @AbstractC21997e(mo35786a = "balance") long j2, @AbstractC21997e(mo35786a = "real_dot") int i);

    @AbstractC22000h(mo35789a = "/webcast/wallet_api_tiktok/wallet/info/")
    AbstractC88979t<C5832d<C6384g>> getWalletInfoNew();

    @AbstractC22000h(mo35789a = "/webcast/diamond/first_charge/")
    AbstractC88979t<C5832d<Object>> isFirstCharge();

    @AbstractC22000h(mo35789a = "/webcast/wallet_api/query_order/")
    AbstractC88979t<CheckOrderOriginalResult> queryOrder(@AbstractC22018z(mo35807a = "order_id") String str);

    @AbstractC22012t(mo35799a = "/webcast/sub/contract/create/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C6312a>> subscribeOrder(@AbstractC21997e(mo35786a = "to_uid") String str, @AbstractC21997e(mo35786a = "tpl_id") String str2, @AbstractC21997e(mo35786a = "sku_name") String str3, @AbstractC21997e(mo35786a = "device_tz") String str4);
}
