package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6246a;
import com.bytedance.android.live.wallet.C6305b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.C6380c;
import com.bytedance.android.live.wallet.model.C6381d;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9139u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.wallet.C11315d;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11634a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveOpenExchangeCoinsDialog extends AbstractC18334e<C6380c, Object> {
    static {
        Covode.recordClassIndex(7809);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public void onTerminate() {
    }

    public String chargeReason(C6380c cVar) {
        if (cVar.f15941d == 0) {
            return "ug_exchange";
        }
        return "anchor_income";
    }

    public void finishResult(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("complete", i);
        } catch (JSONException unused) {
            finishWithFailure();
        }
        finishWithResult(jSONObject);
    }

    public void goExchangeToCoins(final C6380c cVar) {
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12368a(cVar, new AbstractC11634a() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenExchangeCoinsDialog.C70702 */

            static {
                Covode.recordClassIndex(7811);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11634a
            /* renamed from: b */
            public final void mo13346b() {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e0m);
                LiveOpenExchangeCoinsDialog.this.finishResult(0);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11634a
            /* renamed from: a */
            public final void mo13345a() {
                if (cVar.f15942e == 0) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e0l);
                }
                if (cVar.f15942e == 2) {
                    C6501b.C6502a.m13948a("livesdk_withdraw_exchange_success").mo12639a().mo12651a("exchange_level", cVar.f15947j).mo12655b();
                } else {
                    C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_exchange_success").mo12639a().mo12651a("exchange_level", cVar.f15947j).mo12651a("request_page", LiveOpenExchangeCoinsDialog.this.requestPage(cVar)).mo12651a("charge_reason", LiveOpenExchangeCoinsDialog.this.chargeReason(cVar));
                    if (cVar.f15942e == 0 && DataChannelGlobal.f42558d.mo28324b(C9139u.class) != null) {
                        a.mo12645a("is_anchor", !((EnumC9592k) DataChannelGlobal.f42558d.mo28324b(C9139u.class)).isAudience());
                    }
                    a.mo12655b();
                }
                C6779a.m14563a().mo13053a(new C6381d());
                C6779a.m14563a().mo13053a(new C11315d(true, (int) cVar.f15943f));
                LiveOpenExchangeCoinsDialog.this.finishResult(1);
            }
        });
    }

    public String requestPage(C6380c cVar) {
        if (cVar.f15942e == 0) {
            return "live_detail";
        }
        if (cVar.f15942e == 1) {
            return "my_profile";
        }
        return "";
    }

    private int textId(C6380c cVar) {
        if (cVar.f15941d == 0) {
            return R.string.e0j;
        }
        RevenueExchange revenueExchange = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12382f().f15957c;
        if (revenueExchange == null || !revenueExchange.isRevenue()) {
            return R.string.e2j;
        }
        return R.string.e2k;
    }

    /* access modifiers changed from: protected */
    public void invoke(final C6380c cVar, C18338g gVar) {
        boolean z;
        if (AbstractC6804a.f17007cC.mo13066a().booleanValue()) {
            IWalletService iWalletService = (IWalletService) C6193a.m13435a(IWalletService.class);
            Context context = gVar.f43859a;
            C70691 r1 = new AbstractC6246a() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenExchangeCoinsDialog.C70691 */

                /* renamed from: a */
                boolean f17678a = true;

                static {
                    Covode.recordClassIndex(7810);
                }

                @Override // com.bytedance.android.live.wallet.AbstractC6246a
                /* renamed from: a */
                public final void mo12252a() {
                    if (cVar.f15942e == 2) {
                        C6501b.C6502a.m13948a("livesdk_withdraw_exchange_confirm").mo12639a().mo12651a("exchange_level", cVar.f15947j).mo12655b();
                    } else {
                        C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_exchange_confirm").mo12639a().mo12651a("exchange_level", cVar.f15947j).mo12651a("request_page", LiveOpenExchangeCoinsDialog.this.requestPage(cVar)).mo12651a("charge_reason", LiveOpenExchangeCoinsDialog.this.chargeReason(cVar));
                        if (cVar.f15942e == 0 && DataChannelGlobal.f42558d.mo28324b(C9139u.class) != null) {
                            a.mo12645a("is_anchor", !((EnumC9592k) DataChannelGlobal.f42558d.mo28324b(C9139u.class)).isAudience());
                        }
                        a.mo12655b();
                    }
                    if (!this.f17678a) {
                        C6806c.m14603a((C6800c) AbstractC6804a.f17007cC, (Object) false);
                    }
                    LiveOpenExchangeCoinsDialog.this.goExchangeToCoins(cVar);
                }

                @Override // com.bytedance.android.live.wallet.AbstractC6246a
                /* renamed from: b */
                public final void mo12254b() {
                    if (cVar.f15942e == 2) {
                        C6501b.C6502a.m13948a("livesdk_withdraw_exchange_cancel").mo12639a().mo12651a("exchange_level", cVar.f15947j).mo12655b();
                    } else {
                        C6501b a = C6501b.C6502a.m13948a("livesdk_recharge_exchange_cancel").mo12639a().mo12651a("exchange_level", cVar.f15947j).mo12646a("exchange_coins", cVar.f15943f).mo12651a("request_page", LiveOpenExchangeCoinsDialog.this.requestPage(cVar)).mo12651a("charge_reason", LiveOpenExchangeCoinsDialog.this.chargeReason(cVar));
                        if (cVar.f15942e == 0 && DataChannelGlobal.f42558d.mo28324b(C9139u.class) != null) {
                            a.mo12645a("is_anchor", !((EnumC9592k) DataChannelGlobal.f42558d.mo28324b(C9139u.class)).isAudience());
                        }
                        a.mo12655b();
                    }
                    LiveOpenExchangeCoinsDialog.this.finishResult(2);
                }

                @Override // com.bytedance.android.live.wallet.AbstractC6246a
                /* renamed from: a */
                public final void mo12253a(Boolean bool) {
                    this.f17678a = !bool.booleanValue();
                }
            };
            String a = C3966y.m9660a(textId(cVar), cVar.f15939b + cVar.f15946i);
            if (cVar.f15941d == 0) {
                z = true;
            } else {
                z = false;
            }
            iWalletService.showExchangeConfirmDialog(context, r1, new C6305b(R.string.e0k, a, R.string.e0h, R.string.e0g, R.string.e0i, z));
            return;
        }
        goExchangeToCoins(cVar);
    }
}
