package com.p2082ss.android.ugc.aweme.search.p3691g;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.g.h */
public final class C67443h implements Serializable {
    @AbstractC27891c(mo46611a = "request_key")

    /* renamed from: a */
    private String f151099a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private String f151100b;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: c */
    private String f151101c;
    @AbstractC27891c(mo46611a = "log_info")

    /* renamed from: d */
    private String f151102d;

    /* renamed from: e */
    private boolean f151103e;

    /* renamed from: f */
    private boolean f151104f;

    /* renamed from: g */
    private C67436a f151105g;

    static {
        Covode.recordClassIndex(79079);
    }

    public final C67436a getActivityOptionStruct() {
        return this.f151105g;
    }

    public final String getDescription() {
        return this.f151101c;
    }

    public final String getLogInfo() {
        return this.f151102d;
    }

    public final String getName() {
        return this.f151100b;
    }

    public final String getRequestKey() {
        return this.f151099a;
    }

    public final boolean isDefaultOption() {
        return this.f151103e;
    }

    public final boolean isSelected() {
        return this.f151104f;
    }

    public final void setActivityOptionStruct(C67436a aVar) {
        this.f151105g = aVar;
    }

    public final void setDefaultOption(boolean z) {
        this.f151103e = z;
    }

    public final void setDescription(String str) {
        this.f151101c = str;
    }

    public final void setLogInfo(String str) {
        this.f151102d = str;
    }

    public final void setName(String str) {
        this.f151100b = str;
    }

    public final void setRequestKey(String str) {
        this.f151099a = str;
    }

    public final void setSelected(boolean z) {
        this.f151104f = z;
    }
}
