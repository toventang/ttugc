package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;

public class FansClubMember {
    @AbstractC27891c(mo46611a = "data")
    FansClubData data;
    @AbstractC27891c(mo46611a = "prefer_data")
    Map<Integer, FansClubData> preferData;

    static {
        Covode.recordClassIndex(11032);
    }

    public FansClubData getData() {
        return this.data;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }
}
