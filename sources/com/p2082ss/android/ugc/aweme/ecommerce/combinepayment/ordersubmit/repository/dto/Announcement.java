package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Announcement */
public final class Announcement {
    @AbstractC27891c(mo46611a = "announcement_id")
    private final String announcementId;
    @AbstractC27891c(mo46611a = "background")
    private final Image background;
    @AbstractC27891c(mo46611a = "icon")
    private final Image icon;
    @AbstractC27891c(mo46611a = "link")
    private final String link;
    @AbstractC27891c(mo46611a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(52112);
    }

    public static /* synthetic */ Announcement copy$default(Announcement announcement, String str, String str2, Image image, String str3, Image image2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = announcement.announcementId;
        }
        if ((i & 2) != 0) {
            str2 = announcement.text;
        }
        if ((i & 4) != 0) {
            image = announcement.icon;
        }
        if ((i & 8) != 0) {
            str3 = announcement.link;
        }
        if ((i & 16) != 0) {
            image2 = announcement.background;
        }
        return announcement.copy(str, str2, image, str3, image2);
    }

    public final String component1() {
        return this.announcementId;
    }

    public final String component2() {
        return this.text;
    }

    public final Image component3() {
        return this.icon;
    }

    public final String component4() {
        return this.link;
    }

    public final Image component5() {
        return this.background;
    }

    public final Announcement copy(String str, String str2, Image image, String str3, Image image2) {
        return new Announcement(str, str2, image, str3, image2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Announcement)) {
            return false;
        }
        Announcement announcement = (Announcement) obj;
        return C89219l.m154714a(this.announcementId, announcement.announcementId) && C89219l.m154714a(this.text, announcement.text) && C89219l.m154714a(this.icon, announcement.icon) && C89219l.m154714a(this.link, announcement.link) && C89219l.m154714a(this.background, announcement.background);
    }

    public final int hashCode() {
        String str = this.announcementId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Image image2 = this.background;
        if (image2 != null) {
            i = image2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Announcement(announcementId=" + this.announcementId + ", text=" + this.text + ", icon=" + this.icon + ", link=" + this.link + ", background=" + this.background + ")";
    }

    public final String getAnnouncementId() {
        return this.announcementId;
    }

    public final Image getBackground() {
        return this.background;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getText() {
        return this.text;
    }

    public final Announcement merge(Announcement announcement) {
        if (announcement == null) {
            return this;
        }
        String str = announcement.announcementId;
        if (str == null) {
            str = this.announcementId;
        }
        String str2 = announcement.text;
        if (str2 == null) {
            str2 = this.text;
        }
        Image image = announcement.icon;
        if (image == null) {
            image = this.icon;
        }
        String str3 = announcement.link;
        if (str3 == null) {
            str3 = this.link;
        }
        Image image2 = announcement.background;
        if (image2 == null) {
            image2 = this.background;
        }
        return new Announcement(str, str2, image, str3, image2);
    }

    public Announcement(String str, String str2, Image image, String str3, Image image2) {
        this.announcementId = str;
        this.text = str2;
        this.icon = image;
        this.link = str3;
        this.background = image2;
    }
}
