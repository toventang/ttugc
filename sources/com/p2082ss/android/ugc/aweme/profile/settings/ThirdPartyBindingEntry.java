package com.p2082ss.android.ugc.aweme.profile.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.profile.settings.ThirdPartyBindingEntry */
public final class ThirdPartyBindingEntry {
    @AbstractC27891c(mo46611a = "ins")
    private final boolean ins;
    @AbstractC27891c(mo46611a = "twitter")
    private final boolean twitter;
    @AbstractC27891c(mo46611a = "youtube")
    private final boolean youtube;

    static {
        Covode.recordClassIndex(75299);
    }

    public ThirdPartyBindingEntry() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ ThirdPartyBindingEntry copy$default(ThirdPartyBindingEntry thirdPartyBindingEntry, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = thirdPartyBindingEntry.twitter;
        }
        if ((i & 2) != 0) {
            z2 = thirdPartyBindingEntry.ins;
        }
        if ((i & 4) != 0) {
            z3 = thirdPartyBindingEntry.youtube;
        }
        return thirdPartyBindingEntry.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.twitter;
    }

    public final boolean component2() {
        return this.ins;
    }

    public final boolean component3() {
        return this.youtube;
    }

    public final ThirdPartyBindingEntry copy(boolean z, boolean z2, boolean z3) {
        return new ThirdPartyBindingEntry(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyBindingEntry)) {
            return false;
        }
        ThirdPartyBindingEntry thirdPartyBindingEntry = (ThirdPartyBindingEntry) obj;
        return this.twitter == thirdPartyBindingEntry.twitter && this.ins == thirdPartyBindingEntry.ins && this.youtube == thirdPartyBindingEntry.youtube;
    }

    public final int hashCode() {
        boolean z = this.twitter;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.ins;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.youtube) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "ThirdPartyBindingEntry(twitter=" + this.twitter + ", ins=" + this.ins + ", youtube=" + this.youtube + ")";
    }

    public final boolean getIns() {
        return this.ins;
    }

    public final boolean getTwitter() {
        return this.twitter;
    }

    public final boolean getYoutube() {
        return this.youtube;
    }

    public ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3) {
        this.twitter = z;
        this.ins = z2;
        this.youtube = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3, int i, C89214g gVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
