package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.p1998c.p1999a.C27241i;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactModel */
public class ContactModel {
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    public String firstName;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "invited")
    public boolean invited;
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    public String lastName;
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    public String mSection;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    public int originIndex;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "phone_number")
    public String phoneNumber;
    public transient String photoUri;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "region_code")
    public String regionCode;
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    public String url;

    static {
        Covode.recordClassIndex(60883);
    }

    public ContactModel() {
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactModel contactModel = (ContactModel) obj;
            if (!C27241i.m54222a(this.phoneNumber, contactModel.phoneNumber) || !C27241i.m54222a(this.name, contactModel.name)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public ContactModel(String str, String str2) {
        this.phoneNumber = str;
        this.name = str2;
    }
}
