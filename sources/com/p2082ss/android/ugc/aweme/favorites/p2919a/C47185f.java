package com.p2082ss.android.ugc.aweme.favorites.p2919a;

import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1183ag;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36401a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.p2082ss.android.ugc.aweme.experiment.C46794ck;
import com.p2082ss.android.ugc.aweme.experiment.C47004ha;
import com.p2082ss.android.ugc.aweme.experiment.C47005hb;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47633af;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47675c;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47677e;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47696f;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47714k;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47724l;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47730p;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.question.p3660b.C66503a;
import com.p2082ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.f */
public final class C47185f extends C64117cn {

    /* renamed from: a */
    public ArrayList<Fragment> f109823a = new ArrayList<>();

    /* renamed from: d */
    private Context f109824d;

    /* renamed from: e */
    private ArrayList<Integer> f109825e = new ArrayList<>();

    /* renamed from: f */
    private int f109826f;

    static {
        Covode.recordClassIndex(55789);
    }

    /* renamed from: a */
    public final void mo79581a() {
        if (this.f109823a.get(this.f109826f) instanceof C47724l) {
            ((C47724l) this.f109823a.get(this.f109826f)).mo79833t().notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final void mo79582c(int i) {
        AbstractC64118co coVar;
        for (int i2 = 0; i2 < getCount(); i2++) {
            if (!(!(mo3639a(i2) instanceof AbstractC64118co) || (coVar = (AbstractC64118co) mo3639a(i2)) == null || coVar.getFragmentManager() == null)) {
                if (i2 == i) {
                    coVar.setUserVisibleHint(true);
                } else {
                    coVar.setUserVisibleHint(false);
                }
                coVar.mo65254g();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn, androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        int intValue = this.f109825e.get(i).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 8) {
                            switch (intValue) {
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                    String string = this.f109824d.getString(R.string.ah4);
                                    if (string == null || "collect_hashtag".equals(string)) {
                                        return string;
                                    }
                                    return string.substring(0, 1).toUpperCase(Locale.ROOT) + string.substring(1).toLowerCase(Locale.ROOT);
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                    String string2 = this.f109824d.getString(R.string.ah7);
                                    if (string2 == null || "music".equals(string2)) {
                                        return string2;
                                    }
                                    return string2.substring(0, 1).toUpperCase(Locale.ROOT) + string2.substring(1).toLowerCase(Locale.ROOT);
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    return this.f109824d.getString(R.string.bvp);
                                default:
                                    switch (intValue) {
                                        case 16:
                                            String string3 = this.f109824d.getString(R.string.ah2);
                                            if (string3 == null || "tool".equals(string3)) {
                                                return string3;
                                            }
                                            return string3.substring(0, 1).toUpperCase(Locale.ROOT) + string3.substring(1).toLowerCase(Locale.ROOT);
                                        case 17:
                                            return this.f109824d.getString(R.string.c0s);
                                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                                            return this.f109824d.getString(R.string.p0);
                                        case 19:
                                            return this.f109824d.getString(R.string.c4o);
                                        default:
                                            switch (intValue) {
                                                case 25:
                                                    String string4 = this.f109824d.getString(R.string.hc2);
                                                    if (string4 == null || "wishlist_products_tab_name".equals(string4)) {
                                                        return string4;
                                                    }
                                                    return string4.substring(0, 1).toUpperCase(Locale.ROOT) + string4.substring(1).toLowerCase(Locale.ROOT);
                                                case 26:
                                                    return this.f109824d.getString(R.string.bsb);
                                                case 27:
                                                    return this.f109824d.getString(R.string.f0t);
                                                default:
                                                    return "";
                                            }
                                    }
                            }
                        } else {
                            String string5 = this.f109824d.getString(R.string.ah9);
                            if (string5 == null || "video".equals(string5)) {
                                return string5;
                            }
                            return string5.substring(0, 1).toUpperCase(Locale.ROOT) + string5.substring(1).toLowerCase(Locale.ROOT);
                        }
                    }
                }
            }
            return this.f109824d.getString(R.string.c0g);
        }
        return this.f109824d.getString(R.string.caj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: java.util.ArrayList<androidx.fragment.app.Fragment> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: java.util.ArrayList<androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47185f(AbstractC0952i iVar, Context context) {
        super(iVar);
        AbstractC1183ag agVar;
        Fragment eVar;
        this.f109824d = context;
        if (C46794ck.m90139a()) {
            agVar = new C47633af();
        } else {
            AbstractC64005b newBasicAwemeListFragment = C63419ae.f143971a.newBasicAwemeListFragment((int) context.getResources().getDimension(R.dimen.jt), 4, C31575b.m65865g().getCurUserId(), C31575b.m65865g().getCurSecUserId(), false, true);
            newBasicAwemeListFragment.mo103555A();
            newBasicAwemeListFragment.mo103563d(true);
            newBasicAwemeListFragment.mo103561c("collection");
            agVar = newBasicAwemeListFragment;
        }
        Fragment lVar = C47005hb.f109528a ? new C47714k() : new C47724l();
        C47696f fVar = new C47696f();
        C47730p pVar = new C47730p();
        if (C47004ha.f109524a) {
            eVar = new C47675c();
        } else {
            eVar = new C47677e();
        }
        AbstractC34586a b = StickerServiceImpl.m132027c().mo118502b();
        AbstractC34586a aVar = null;
        IShoppingAdsService d = ShoppingAdsServiceImpl.m76354d();
        if (d != null && d.mo65746a()) {
            aVar = d.mo65748b();
        }
        if (!C46794ck.m90140b()) {
            this.f109823a.add(agVar == 1 ? 1 : 0);
            this.f109825e.add(8);
            this.f109823a.add(lVar);
            this.f109825e.add(11);
            this.f109826f = this.f109823a.size() - 1;
            this.f109823a.add(b);
            this.f109825e.add(16);
            if (C36401a.m74098a()) {
                this.f109823a.add(fVar);
                this.f109825e.add(26);
            }
            if (C66503a.f149498a) {
                this.f109823a.add(pVar);
                this.f109825e.add(27);
            }
            this.f109823a.add(eVar);
            this.f109825e.add(10);
            if (aVar != null) {
                this.f109823a.add(aVar);
                this.f109825e.add(25);
            }
        } else {
            this.f109823a.add(agVar == 1 ? 1 : 0);
            this.f109825e.add(8);
            this.f109823a.add(eVar);
            this.f109825e.add(10);
            this.f109823a.add(lVar);
            this.f109825e.add(11);
            this.f109826f = this.f109823a.size() - 1;
            this.f109823a.add(b);
            this.f109825e.add(16);
            if (C36401a.m74098a()) {
                this.f109823a.add(fVar);
                this.f109825e.add(26);
            }
            if (C66503a.f149498a) {
                this.f109823a.add(pVar);
                this.f109825e.add(27);
            }
            if (aVar != null) {
                this.f109823a.add(aVar);
                this.f109825e.add(25);
            }
        }
        ArrayList<Fragment> arrayList = this.f109823a;
        ArrayList<Integer> arrayList2 = this.f109825e;
        ((C64117cn) this).f145456b = arrayList;
        ((C64117cn) this).f145457c = arrayList2;
    }
}
