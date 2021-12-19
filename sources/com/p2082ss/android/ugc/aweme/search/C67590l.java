package com.p2082ss.android.ugc.aweme.search;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l */
public final class C67590l implements Serializable {
    @AbstractC27891c(mo46611a = "region")

    /* renamed from: a */
    private String f151358a;
    @AbstractC27891c(mo46611a = "event_id")

    /* renamed from: b */
    private String f151359b;
    @AbstractC27891c(mo46611a = "event_name")

    /* renamed from: c */
    private String f151360c;
    @AbstractC27891c(mo46611a = "rank_text")

    /* renamed from: d */
    private String f151361d;
    @AbstractC27891c(mo46611a = "heat_value")

    /* renamed from: e */
    private Long f151362e;
    @AbstractC27891c(mo46611a = "hotlink")

    /* renamed from: f */
    private String f151363f;
    @AbstractC27891c(mo46611a = "icon_type")

    /* renamed from: g */
    private final int f151364g;
    @AbstractC27891c(mo46611a = "online_time")

    /* renamed from: h */
    private final String f151365h;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: i */
    private final String f151366i;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: j */
    private final String f151367j;

    static {
        Covode.recordClassIndex(79229);
    }

    public static /* synthetic */ void getIconType$annotations() {
    }

    public final String getCoverUrl() {
        return this.f151363f;
    }

    public final String getEventId() {
        return this.f151359b;
    }

    public final String getExtra() {
        return this.f151367j;
    }

    public final Long getHeatValue() {
        return this.f151362e;
    }

    public final int getIconType() {
        return this.f151364g;
    }

    public final String getOnlineTime() {
        return this.f151365h;
    }

    public final String getRankText() {
        return this.f151361d;
    }

    public final String getRegion() {
        return this.f151358a;
    }

    public final String getSchema() {
        return this.f151366i;
    }

    public final String getTrendingName() {
        return this.f151360c;
    }

    public final String getType() {
        int i = this.f151364g;
        if (i == 1) {
            return "hot";
        }
        if (i != 2) {
            return "none";
        }
        return "up";
    }

    public final String toString() {
        return "event_id:" + this.f151359b + " event_name:" + this.f151360c;
    }

    public final Map<String, String> getExtraMap() {
        C0484a aVar = new C0484a();
        try {
            HashMap hashMap = (HashMap) new C27910f().mo46670a(this.f151367j, HashMap.class);
            C89219l.m154716b(hashMap, "");
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return aVar;
        } catch (Exception unused) {
            return new C0484a();
        }
    }

    public final void setCoverUrl(String str) {
        this.f151363f = str;
    }

    public final void setEventId(String str) {
        this.f151359b = str;
    }

    public final void setHeatValue(Long l) {
        this.f151362e = l;
    }

    public final void setRankText(String str) {
        this.f151361d = str;
    }

    public final void setRegion(String str) {
        this.f151358a = str;
    }

    public final void setTrendingName(String str) {
        this.f151360c = str;
    }
}
