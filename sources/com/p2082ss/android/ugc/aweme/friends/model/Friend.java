package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.friends.model.Friend */
public class Friend extends User {
    private boolean invited;
    private boolean isFirstOne;
    @AbstractC27891c(mo46611a = "phone_number")
    private String phoneNumber;
    private transient String photoUri;
    private String section = "";
    @AbstractC27891c(mo46611a = "social_name")
    private String socialName;

    static {
        Covode.recordClassIndex(60888);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPhotoUri() {
        return this.photoUri;
    }

    public String getSection() {
        return this.section;
    }

    public String getSocialName() {
        return this.socialName;
    }

    public boolean isFirstOne() {
        return this.isFirstOne;
    }

    public boolean isInvited() {
        return this.invited;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.socialName;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.phoneNumber;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public void setFirstOne(boolean z) {
        this.isFirstOne = z;
    }

    public void setInvited(boolean z) {
        this.invited = z;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPhotoUri(String str) {
        this.photoUri = str;
    }

    public void setSection(String str) {
        this.section = str;
    }

    public void setSocialName(String str) {
        this.socialName = str;
    }

    public Friend(String str) {
        this.socialName = str;
    }

    public static Friend copyFrom(User user) {
        if (user == null) {
            return null;
        }
        if (user instanceof Friend) {
            return (Friend) user;
        }
        Friend friend = new Friend(null);
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getAnnotation(AbstractC27891c.class) != null) {
                field.setAccessible(true);
                try {
                    field.set(friend, field.get(user));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return friend;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Friend friend = (Friend) obj;
        if (!Objects.equals(this.socialName, friend.socialName) || !Objects.equals(this.phoneNumber, friend.phoneNumber)) {
            return false;
        }
        return true;
    }
}
