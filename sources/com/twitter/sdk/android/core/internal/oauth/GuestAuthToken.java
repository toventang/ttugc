package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class GuestAuthToken extends OAuth2Token {
    @AbstractC27891c(mo46611a = "guest_token")

    /* renamed from: b */
    public final String f199275b;

    static {
        Covode.recordClassIndex(103728);
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    /* renamed from: a */
    public final boolean mo142186a() {
        if (System.currentTimeMillis() >= this.f199175a + 10800000) {
            return true;
        }
        return false;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.f199275b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f199275b;
        String str2 = ((GuestAuthToken) obj).f199275b;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.f199275b = str3;
    }
}
