package com.snapchat.kit.sdk.core.p2067a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.snapchat.kit.sdk.core.a.a */
public class C28953a implements Serializable {
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "access_token")

    /* renamed from: a */
    private String f68398a;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "token_type")

    /* renamed from: b */
    private String f68399b;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "refresh_token")

    /* renamed from: c */
    private String f68400c;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "expires_in")

    /* renamed from: d */
    private long f68401d;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "last_updated")

    /* renamed from: e */
    private long f68402e;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "scope")

    /* renamed from: f */
    private String f68403f;

    static {
        Covode.recordClassIndex(35137);
    }

    public String getAccessToken() {
        return this.f68398a;
    }

    public long getExpiresIn() {
        return this.f68401d;
    }

    public long getLastUpdated() {
        return this.f68402e;
    }

    public String getRefreshToken() {
        return this.f68400c;
    }

    public String getScope() {
        return this.f68403f;
    }

    public String getTokenType() {
        return this.f68399b;
    }

    public long getExpiresInMillis() {
        return this.f68401d * 1000;
    }

    public String toString() {
        return toJson();
    }

    public String toJson() {
        return new C27910f().mo46674b(this);
    }

    public boolean isExpired() {
        if (System.currentTimeMillis() >= getLastUpdated() + getExpiresInMillis()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f68398a, this.f68399b, this.f68400c, Long.valueOf(this.f68401d), Long.valueOf(this.f68402e));
    }

    public boolean isComplete() {
        if (TextUtils.isEmpty(getAccessToken()) || TextUtils.isEmpty(getRefreshToken()) || !TextUtils.equals(getTokenType(), "Bearer") || getExpiresIn() <= 0 || getLastUpdated() <= 0 || TextUtils.isEmpty(getScope())) {
            return false;
        }
        return true;
    }

    public void setLastUpdated(long j) {
        this.f68402e = j;
    }

    public void setRefreshToken(String str) {
        this.f68400c = str;
    }

    public boolean hasAccessToScope(String str) {
        if (TextUtils.isEmpty(getScope())) {
            return false;
        }
        return Arrays.asList(getScope().split(" ")).contains(str);
    }

    public boolean willBeExpiredAfter(Long l) {
        if ((getLastUpdated() + getExpiresInMillis()) - System.currentTimeMillis() <= l.longValue()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28953a)) {
            return false;
        }
        C28953a aVar = (C28953a) obj;
        if (!Objects.equals(this.f68398a, aVar.f68398a) || !Objects.equals(this.f68399b, aVar.f68399b) || !Objects.equals(this.f68400c, aVar.f68400c) || !Objects.equals(Long.valueOf(this.f68401d), Long.valueOf(aVar.f68401d)) || !Objects.equals(Long.valueOf(this.f68402e), Long.valueOf(aVar.f68402e))) {
            return false;
        }
        return true;
    }

    public C28953a(String str, String str2, String str3, long j, long j2, String str4) {
        this.f68398a = str;
        this.f68399b = str2;
        this.f68400c = str3;
        this.f68401d = j;
        this.f68402e = j2;
        this.f68403f = str4;
    }
}
