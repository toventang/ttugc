package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct */
public final class ProfileNgoStruct implements Serializable {
    @AbstractC27891c(mo46611a = "ngo_donation_link")
    private String donationLink = "";
    @AbstractC27891c(mo46611a = "ngo_icon_url")
    private String iconUrl = "";
    @AbstractC27891c(mo46611a = "ngo_id")

    /* renamed from: id */
    private int f144673id;
    @AbstractC27891c(mo46611a = "ngo_name")
    private String name = "";

    static {
        Covode.recordClassIndex(75199);
    }

    public final String getDonationLink() {
        return this.donationLink;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.f144673id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setId(int i) {
        this.f144673id = i;
    }

    public final void setDonationLink(String str) {
        C89219l.m154721d(str, "");
        this.donationLink = str;
    }

    public final void setIconUrl(String str) {
        C89219l.m154721d(str, "");
        this.iconUrl = str;
    }

    public final void setName(String str) {
        C89219l.m154721d(str, "");
        this.name = str;
    }
}
