package com.bytedance.android.live.network.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class RequestPb {
    @AbstractC27891c(mo46611a = "enable")
    private boolean enable;
    @AbstractC27891c(mo46611a = "pass_through_api")
    private String passThroughApi;
    @AbstractC27891c(mo46611a = "switches")
    private String switches;

    static {
        Covode.recordClassIndex(6424);
    }

    public String getPassThroughApi() {
        return this.passThroughApi;
    }

    public String getSwitches() {
        return this.switches;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public static RequestPb defaultInstance() {
        RequestPb requestPb = new RequestPb();
        requestPb.enable = false;
        requestPb.switches = "{}";
        requestPb.passThroughApi = "";
        return requestPb;
    }
}
