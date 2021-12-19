package com.p2082ss.android.ugc.aweme.donation.token;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.token.DonationTokenBean */
public final class DonationTokenBean implements Serializable {
    @AbstractC27891c(mo46611a = "token")
    private final String token;

    static {
        Covode.recordClassIndex(51321);
    }

    public static /* synthetic */ DonationTokenBean copy$default(DonationTokenBean donationTokenBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = donationTokenBean.token;
        }
        return donationTokenBean.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final DonationTokenBean copy(String str) {
        return new DonationTokenBean(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DonationTokenBean) && C89219l.m154714a(this.token, ((DonationTokenBean) obj).token);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DonationTokenBean(token=" + this.token + ")";
    }

    public final String getToken() {
        return this.token;
    }

    public DonationTokenBean(String str) {
        this.token = str;
    }
}
