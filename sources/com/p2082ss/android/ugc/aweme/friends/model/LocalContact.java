package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.LocalContact */
public final class LocalContact {
    public final String contactName;
    public final String phoneNumber;

    static {
        Covode.recordClassIndex(60904);
    }

    public static /* synthetic */ LocalContact copy$default(LocalContact localContact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localContact.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = localContact.contactName;
        }
        return localContact.copy(str, str2);
    }

    public final LocalContact copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new LocalContact(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalContact)) {
            return false;
        }
        LocalContact localContact = (LocalContact) obj;
        return C89219l.m154714a(this.phoneNumber, localContact.phoneNumber) && C89219l.m154714a(this.contactName, localContact.contactName);
    }

    public final int hashCode() {
        String str = this.phoneNumber;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contactName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LocalContact(phoneNumber=" + this.phoneNumber + ", contactName=" + this.contactName + ")";
    }

    public LocalContact(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.phoneNumber = str;
        this.contactName = str2;
    }
}
