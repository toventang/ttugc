package com.p2082ss.android.ugc.aweme.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.model.AnchorIcon */
public final class AnchorIcon implements Parcelable {
    public static final Parcelable.Creator<AnchorIcon> CREATOR = new C33541a();
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: a */
    public String f79663a;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: b */
    public ArrayList<String> f79664b;

    static {
        Covode.recordClassIndex(40412);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f79663a);
        ArrayList<String> arrayList = this.f79664b;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (String str : arrayList) {
                parcel.writeString(str);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.api.model.AnchorIcon$a */
    public static class C33541a implements Parcelable.Creator<AnchorIcon> {
        static {
            Covode.recordClassIndex(40413);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AnchorIcon[] newArray(int i) {
            return new AnchorIcon[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AnchorIcon createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readString());
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new AnchorIcon(readString, arrayList);
        }
    }

    private /* synthetic */ AnchorIcon() {
        this(null, null);
    }

    public AnchorIcon(String str, ArrayList<String> arrayList) {
        this.f79663a = str;
        this.f79664b = arrayList;
    }
}
