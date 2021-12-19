package com.p2082ss.android.ugc.aweme.openauthorize.p3539a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.a.g */
public final class C62703g implements Serializable {
    @AbstractC27891c(mo46611a = "scope_name")

    /* renamed from: a */
    private final String f142152a;
    @AbstractC27891c(mo46611a = "scope_desc")

    /* renamed from: b */
    private final String f142153b;
    @AbstractC27891c(mo46611a = "is_scope_required")

    /* renamed from: c */
    private final Boolean f142154c;

    /* renamed from: d */
    private Boolean f142155d;

    static {
        Covode.recordClassIndex(73509);
    }

    public final String getScopeDesc() {
        return this.f142153b;
    }

    public final String getScopeName() {
        return this.f142152a;
    }

    public final Boolean getScopeRequired() {
        return this.f142154c;
    }

    public final Boolean isEnabled() {
        return this.f142155d;
    }

    public final void setEnabled(Boolean bool) {
        this.f142155d = bool;
    }
}
