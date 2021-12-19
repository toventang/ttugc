package com.p2082ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.response.KidsVideoPlaytimeReminder */
public final class KidsVideoPlaytimeReminder {
    @AbstractC27891c(mo46611a = "wellness_img_url")
    private final String imageUrl;
    @AbstractC27891c(mo46611a = "dark_wellness_img_url")
    private final String imageUrlDark;
    @AbstractC27891c(mo46611a = "subtitle")
    private final String subtitle;
    @AbstractC27891c(mo46611a = "threshold")
    private final Integer threshold;
    @AbstractC27891c(mo46611a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(67270);
    }

    public KidsVideoPlaytimeReminder() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ KidsVideoPlaytimeReminder copy$default(KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kidsVideoPlaytimeReminder.threshold;
        }
        if ((i & 2) != 0) {
            str = kidsVideoPlaytimeReminder.imageUrl;
        }
        if ((i & 4) != 0) {
            str2 = kidsVideoPlaytimeReminder.imageUrlDark;
        }
        if ((i & 8) != 0) {
            str3 = kidsVideoPlaytimeReminder.title;
        }
        if ((i & 16) != 0) {
            str4 = kidsVideoPlaytimeReminder.subtitle;
        }
        return kidsVideoPlaytimeReminder.copy(num, str, str2, str3, str4);
    }

    public final Integer component1() {
        return this.threshold;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.imageUrlDark;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final KidsVideoPlaytimeReminder copy(Integer num, String str, String str2, String str3, String str4) {
        return new KidsVideoPlaytimeReminder(num, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsVideoPlaytimeReminder)) {
            return false;
        }
        KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder = (KidsVideoPlaytimeReminder) obj;
        return C89219l.m154714a(this.threshold, kidsVideoPlaytimeReminder.threshold) && C89219l.m154714a(this.imageUrl, kidsVideoPlaytimeReminder.imageUrl) && C89219l.m154714a(this.imageUrlDark, kidsVideoPlaytimeReminder.imageUrlDark) && C89219l.m154714a(this.title, kidsVideoPlaytimeReminder.title) && C89219l.m154714a(this.subtitle, kidsVideoPlaytimeReminder.subtitle);
    }

    public final int hashCode() {
        Integer num = this.threshold;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.imageUrlDark;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.subtitle;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "KidsVideoPlaytimeReminder(threshold=" + this.threshold + ", imageUrl=" + this.imageUrl + ", imageUrlDark=" + this.imageUrlDark + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrlDark() {
        return this.imageUrlDark;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getThreshold() {
        return this.threshold;
    }

    public final String getTitle() {
        return this.title;
    }

    public KidsVideoPlaytimeReminder(Integer num, String str, String str2, String str3, String str4) {
        this.threshold = num;
        this.imageUrl = str;
        this.imageUrlDark = str2;
        this.title = str3;
        this.subtitle = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsVideoPlaytimeReminder(Integer num, String str, String str2, String str3, String str4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
