package com.p2082ss.android.ugc.aweme.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.model.AnchorCell */
public final class AnchorCell implements Parcelable {
    public static final Parcelable.Creator<AnchorCell> CREATOR = new C33540a();
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public String f79655a;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: b */
    public AnchorIcon f79656b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    public String f79657c;
    @AbstractC27891c(mo46611a = "sub_title")

    /* renamed from: d */
    public String f79658d;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: e */
    public String f79659e;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: f */
    public String f79660f;

    /* renamed from: g */
    public int f79661g;

    /* renamed from: h */
    public boolean f79662h;

    static {
        Covode.recordClassIndex(40410);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f79655a);
        AnchorIcon anchorIcon = this.f79656b;
        if (anchorIcon != null) {
            parcel.writeInt(1);
            anchorIcon.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f79657c);
        parcel.writeString(this.f79658d);
        parcel.writeString(this.f79659e);
        parcel.writeString(this.f79660f);
        parcel.writeInt(this.f79661g);
        parcel.writeInt(this.f79662h ? 1 : 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.api.model.AnchorCell$a */
    public static class C33540a implements Parcelable.Creator<AnchorCell> {
        static {
            Covode.recordClassIndex(40411);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AnchorCell[] newArray(int i) {
            return new AnchorCell[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AnchorCell createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new AnchorCell(parcel.readString(), parcel.readInt() != 0 ? AnchorIcon.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }
    }

    private /* synthetic */ AnchorCell() {
        this(null, null, null, null, null, null, -100, false);
    }

    public final int hashCode() {
        String str = this.f79655a;
        if (str == null) {
            str = "";
        }
        return Integer.valueOf(str).intValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnchorCell) {
            return TextUtils.equals(this.f79655a, ((AnchorCell) obj).f79655a);
        }
        return false;
    }

    public AnchorCell(String str, AnchorIcon anchorIcon, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.f79655a = str;
        this.f79656b = anchorIcon;
        this.f79657c = str2;
        this.f79658d = str3;
        this.f79659e = str4;
        this.f79660f = str5;
        this.f79661g = i;
        this.f79662h = z;
    }
}
