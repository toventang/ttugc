package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.IMContact */
public abstract class IMContact implements Serializable {
    protected int isRecentContact;
    protected int isRecentTop5Contact;
    private boolean isStickTop;
    protected int relationListItemType;

    static {
        Covode.recordClassIndex(66054);
    }

    public abstract UrlModel getDisplayAvatar();

    public abstract String getDisplayName();

    public abstract String getNickName();

    public int getIsRecentContact() {
        return this.isRecentContact;
    }

    public int getIsRecentTop5Contact() {
        return this.isRecentTop5Contact;
    }

    public int getType() {
        return this.relationListItemType;
    }

    public boolean isStickTop() {
        return this.isStickTop;
    }

    public void setIsRecentContact(int i) {
        this.isRecentContact = i;
    }

    public void setIsRecentTop5Contact(int i) {
        this.isRecentTop5Contact = i;
    }

    public void setStickTop(boolean z) {
        this.isStickTop = z;
    }

    public void setType(int i) {
        this.relationListItemType = i;
    }
}
