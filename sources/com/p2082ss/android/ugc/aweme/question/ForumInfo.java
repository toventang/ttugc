package com.p2082ss.android.ugc.aweme.question;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.ForumInfo */
public final class ForumInfo implements Parcelable {
    public static final Parcelable.Creator<ForumInfo> CREATOR = new C66487a();
    @AbstractC27891c(mo46611a = "forum_type")

    /* renamed from: a */
    public final int f149463a;
    @AbstractC27891c(mo46611a = "forum_status")

    /* renamed from: b */
    public final int f149464b;
    @AbstractC27891c(mo46611a = "invited_users")

    /* renamed from: c */
    public final List<Long> f149465c;

    static {
        Covode.recordClassIndex(78023);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumInfo)) {
            return false;
        }
        ForumInfo forumInfo = (ForumInfo) obj;
        return this.f149463a == forumInfo.f149463a && this.f149464b == forumInfo.f149464b && C89219l.m154714a(this.f149465c, forumInfo.f149465c);
    }

    public final int hashCode() {
        int i = ((this.f149463a * 31) + this.f149464b) * 31;
        List<Long> list = this.f149465c;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ForumInfo(forumType=" + this.f149463a + ", forumStatus=" + this.f149464b + ", inviteUserList=" + this.f149465c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f149463a);
        parcel.writeInt(this.f149464b);
        List<Long> list = this.f149465c;
        parcel.writeInt(list.size());
        for (Long l : list) {
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.ForumInfo$a */
    public static class C66487a implements Parcelable.Creator<ForumInfo> {
        static {
            Covode.recordClassIndex(78024);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ForumInfo[] newArray(int i) {
            return new ForumInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ForumInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(Long.valueOf(parcel.readLong()));
                readInt3--;
            }
            return new ForumInfo(readInt, readInt2, arrayList);
        }
    }

    public ForumInfo(int i, int i2, List<Long> list) {
        C89219l.m154721d(list, "");
        this.f149463a = i;
        this.f149464b = i2;
        this.f149465c = list;
    }
}
