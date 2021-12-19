package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.p1998c.p1999a.C27241i;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactModelV2 */
public class ContactModelV2 {
    @AbstractC27891c(mo46611a = "addresses")
    public List<String> addresses;
    @AbstractC27891c(mo46611a = "birthday")
    public String birthday;
    @AbstractC27891c(mo46611a = "department_name")
    public String department;
    @AbstractC27891c(mo46611a = "emails")
    public List<String> emails;
    public String familyName;
    public String givenName;
    @AbstractC27891c(mo46611a = "instant_message_addresses")
    public Map<String, String> instantMessageAddresses;
    @AbstractC27891c(mo46611a = "job_desc")
    public String jobDesc;
    @AbstractC27891c(mo46611a = "image_url")
    public String mImageUrl;
    @AbstractC27891c(mo46611a = "modification_date")
    public String modificationDate;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "nick_name")
    public String nickName;
    @AbstractC27891c(mo46611a = "note")
    public String note;
    @AbstractC27891c(mo46611a = "organization_name")
    public String organization;
    @AbstractC27891c(mo46611a = "phone_number")
    public List<String> phoneNumber;
    public transient String photoUri;
    public String section;
    @AbstractC27891c(mo46611a = "urls")
    public List<String> urls;

    static {
        Covode.recordClassIndex(60884);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactModelV2 contactModelV2 = (ContactModelV2) obj;
            if (!C27241i.m54222a(this.phoneNumber, contactModelV2.phoneNumber) || !C27241i.m54222a(this.name, contactModelV2.name)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
