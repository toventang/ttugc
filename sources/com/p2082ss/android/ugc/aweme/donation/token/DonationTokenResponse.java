package com.p2082ss.android.ugc.aweme.donation.token;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.token.DonationTokenResponse */
public final class DonationTokenResponse extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "data")
    private final DonationTokenBean data;

    static {
        Covode.recordClassIndex(51324);
    }

    public static /* synthetic */ DonationTokenResponse copy$default(DonationTokenResponse donationTokenResponse, DonationTokenBean donationTokenBean, int i, Object obj) {
        if ((i & 1) != 0) {
            donationTokenBean = donationTokenResponse.data;
        }
        return donationTokenResponse.copy(donationTokenBean);
    }

    public final DonationTokenBean component1() {
        return this.data;
    }

    public final DonationTokenResponse copy(DonationTokenBean donationTokenBean) {
        return new DonationTokenResponse(donationTokenBean);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DonationTokenResponse) && C89219l.m154714a(this.data, ((DonationTokenResponse) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        DonationTokenBean donationTokenBean = this.data;
        if (donationTokenBean != null) {
            return donationTokenBean.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DonationTokenResponse(data=" + this.data + ")";
    }

    public final DonationTokenBean getData() {
        return this.data;
    }

    public DonationTokenResponse(DonationTokenBean donationTokenBean) {
        this.data = donationTokenBean;
    }
}
