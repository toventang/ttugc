package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting */
public final class SocialPlatformSetting implements Serializable {
    @AbstractC27891c(mo46611a = "display_consent_page")
    private final boolean displayConsentPage;
    @AbstractC27891c(mo46611a = "onboarding_rec_strategy")
    private final int onBoardingRecStrategy;
    @AbstractC27891c(mo46611a = "social_platform")
    private final int socialPlatform;
    @AbstractC27891c(mo46611a = "sync_status")
    private boolean syncStatus;

    static {
        Covode.recordClassIndex(75209);
    }

    public SocialPlatformSetting() {
        this(0, false, 0, false, 15, null);
    }

    public final boolean getDisplayConsentPage() {
        return this.displayConsentPage;
    }

    public final int getOnBoardingRecStrategy() {
        return this.onBoardingRecStrategy;
    }

    public final int getSocialPlatform() {
        return this.socialPlatform;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    public SocialPlatformSetting(int i, boolean z, int i2, boolean z2) {
        this.socialPlatform = i;
        this.syncStatus = z;
        this.onBoardingRecStrategy = i2;
        this.displayConsentPage = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SocialPlatformSetting(int i, boolean z, int i2, boolean z2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? true : z2);
    }
}
