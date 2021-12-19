package com.p2082ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.c */
public final class C68173c implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    private final String f152625a;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: b */
    private final String f152626b;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: c */
    private final String f152627c;
    @AbstractC27891c(mo46611a = "access_msg")

    /* renamed from: d */
    private final String f152628d;
    @AbstractC27891c(mo46611a = "scope_names")

    /* renamed from: e */
    private final List<String> f152629e;
    @AbstractC27891c(mo46611a = "client_key")

    /* renamed from: f */
    private final String f152630f;
    @AbstractC27891c(mo46611a = "authorized_time_text")

    /* renamed from: g */
    private final String f152631g;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: h */
    private final String f152632h;
    @AbstractC27891c(mo46611a = "removal_alert")

    /* renamed from: i */
    private final String f152633i;
    @AbstractC27891c(mo46611a = "removal_popup_title")

    /* renamed from: j */
    private final String f152634j;
    @AbstractC27891c(mo46611a = "removal_popup_content")

    /* renamed from: k */
    private final String f152635k;
    @AbstractC27891c(mo46611a = "client_permission_url")

    /* renamed from: l */
    private final String f152636l;

    static {
        Covode.recordClassIndex(80372);
    }

    public final String getAccessMsg() {
        return this.f152628d;
    }

    public final String getAlert() {
        return this.f152633i;
    }

    public final String getAuthorizedTimeText() {
        return this.f152631g;
    }

    public final String getClientKey() {
        return this.f152630f;
    }

    public final String getDesc() {
        return this.f152627c;
    }

    public final String getIcon() {
        return this.f152626b;
    }

    public final String getName() {
        return this.f152625a;
    }

    public final String getPermissionUrl() {
        return this.f152636l;
    }

    public final String getRemovalPopupContent() {
        return this.f152635k;
    }

    public final String getRemovalPopupTitle() {
        return this.f152634j;
    }

    public final List<String> getScopeNames() {
        return this.f152629e;
    }

    public final String getStatus() {
        return this.f152632h;
    }
}
