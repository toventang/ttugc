package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StreamUrl {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public long f27947a;
    @AbstractC27891c(mo46611a = "id_str")

    /* renamed from: b */
    public String f27948b;
    @AbstractC27891c(mo46611a = "provider")

    /* renamed from: c */
    public int f27949c;
    @AbstractC27891c(mo46611a = "rtmp_push_url")

    /* renamed from: d */
    public String f27950d;
    @AbstractC27891c(mo46611a = "push_urls")

    /* renamed from: e */
    public List<String> f27951e;
    @AbstractC27891c(mo46611a = "rtmp_pull_url")

    /* renamed from: f */
    public String f27952f;
    @AbstractC27891c(mo46611a = "flv_pull_url")

    /* renamed from: g */
    public Map<String, String> f27953g;
    @AbstractC27891c(mo46611a = "resolution_name")

    /* renamed from: h */
    public Map<String, String> f27954h;
    @AbstractC27891c(mo46611a = "flv_pull_url_params")

    /* renamed from: i */
    Map<String, String> f27955i;
    @AbstractC27891c(mo46611a = "candidate_resolution")

    /* renamed from: j */
    public List<String> f27956j;
    @AbstractC27891c(mo46611a = "default_resolution")

    /* renamed from: k */
    public String f27957k;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: l */
    public C11738s f27958l;
    @AbstractC27891c(mo46611a = "rtmp_pull_url_params")

    /* renamed from: m */
    String f27959m;
    @AbstractC27891c(mo46611a = "rtmp_push_url_params")

    /* renamed from: n */
    public String f27960n;
    @AbstractC27891c(mo46611a = "live_core_sdk_data")

    /* renamed from: o */
    public LiveCoreSDKData f27961o;

    /* renamed from: p */
    public String f27962p;

    /* renamed from: q */
    public String f27963q;
    public final LinkedList<LiveCoreSDKData.Quality> qualityList = new LinkedList<>();
    final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();

    /* renamed from: r */
    public String f27964r = null;

    /* renamed from: s */
    public String f27965s = null;
    final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();

    /* renamed from: t */
    LiveCoreSDKData.Quality f27966t = null;

    /* renamed from: u */
    private LiveCoreSDKData.Quality f27967u = null;

    static {
        Covode.recordClassIndex(13380);
    }

    /* renamed from: a */
    public final String mo18682a() {
        if (TextUtils.isEmpty(this.f27962p)) {
            return this.f27950d;
        }
        return this.f27962p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo18684c() {
        this.f27966t = null;
        this.f27967u = null;
        this.qualityList.clear();
        LiveCoreSDKData liveCoreSDKData = this.f27961o;
        if (liveCoreSDKData != null) {
            if (liveCoreSDKData.getQualityList() != null && this.f27961o.getQualityList().size() > 0) {
                for (LiveCoreSDKData.Quality quality : this.f27961o.getQualityList()) {
                    this.qualityList.add(quality);
                    if (this.f27967u == null) {
                        this.f27967u = quality;
                    }
                }
            }
            this.f27966t = this.f27961o.getDefaultQuality();
            if (this.qualityList.isEmpty()) {
                LiveCoreSDKData.Quality quality2 = this.f27966t;
                this.f27967u = quality2;
                this.qualityList.add(quality2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18683b() {
        String str;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.f27964r = null;
        this.f27965s = null;
        List<String> list = this.f27956j;
        if (!(list == null || this.f27954h == null || this.f27953g == null)) {
            for (String str2 : list) {
                String str3 = this.f27954h.get(str2);
                if (!(str3 == null || (str = this.f27953g.get(str2)) == null)) {
                    Map<String, String> map = this.f27955i;
                    String str4 = map == null ? null : map.get(str2);
                    this.qualityMap.put(str3, str);
                    this.sdkParamsMap.put(str3, str4);
                    if (str2.equals(this.f27957k)) {
                        this.f27964r = str3;
                    } else if (this.f27964r == null) {
                        this.f27964r = str3;
                    }
                    if (this.f27965s == null) {
                        this.f27965s = str3;
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.f27952f)) {
            this.f27964r = "default";
            this.f27965s = "default";
            this.qualityMap.put("default", this.f27952f);
            this.sdkParamsMap.put(this.f27964r, this.f27959m);
        }
    }
}
