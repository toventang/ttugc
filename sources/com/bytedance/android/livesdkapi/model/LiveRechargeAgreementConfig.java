package com.bytedance.android.livesdkapi.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class LiveRechargeAgreementConfig {
    @AbstractC27891c(mo46611a = "live_room_recharge_agreement_for_global")
    public String agreementForGlobal;
    @AbstractC27891c(mo46611a = "live_room_recharge_agreement_for_region")
    public List<AgreementForRegion> agreementsForRegion;
    @AbstractC27891c(mo46611a = "is_show_recharge_rule_in_global")
    public boolean isShowRechargeLawInGlobal;
    @AbstractC27891c(mo46611a = "is_show_recharge_rule_in_region")
    public boolean isShowRechargeLawInRegion;

    static {
        Covode.recordClassIndex(13535);
    }

    public class AgreementForRegion {
        @AbstractC27891c(mo46611a = "title")
        public String lawName;
        @AbstractC27891c(mo46611a = "url")
        public String lawUrl;

        static {
            Covode.recordClassIndex(13536);
        }

        public AgreementForRegion() {
        }
    }
}
