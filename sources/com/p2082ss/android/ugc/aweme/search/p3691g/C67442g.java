package com.p2082ss.android.ugc.aweme.search.p3691g;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.search.g.g */
public final class C67442g implements Serializable {
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: a */
    private int f151093a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private String f151094b;
    @AbstractC27891c(mo46611a = "log_info")

    /* renamed from: c */
    private Map<String, String> f151095c;

    /* renamed from: d */
    private boolean f151096d;

    /* renamed from: e */
    private boolean f151097e;

    /* renamed from: f */
    private C67438c f151098f;

    static {
        Covode.recordClassIndex(79078);
    }

    public final int getCode() {
        return this.f151093a;
    }

    public final C67438c getFilterOptionStruct() {
        return this.f151098f;
    }

    public final Map<String, String> getLogInfo() {
        return this.f151095c;
    }

    public final String getName() {
        return this.f151094b;
    }

    public final boolean isDefaultOption() {
        return this.f151096d;
    }

    public final boolean isSelected() {
        return this.f151097e;
    }

    public final void setCode(int i) {
        this.f151093a = i;
    }

    public final void setDefaultOption(boolean z) {
        this.f151096d = z;
    }

    public final void setFilterOptionStruct(C67438c cVar) {
        this.f151098f = cVar;
    }

    public final void setLogInfo(Map<String, String> map) {
        this.f151095c = map;
    }

    public final void setName(String str) {
        this.f151094b = str;
    }

    public final void setSelected(boolean z) {
        this.f151097e = z;
    }

    public C67442g(int i, String str) {
        this.f151093a = i;
        this.f151094b = str;
    }
}
