package com.p2082ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo */
public final class CreateAwemeCoverInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreateAwemeCoverInfo> CREATOR = new C45930a();
    @AbstractC27891c(mo46611a = "cover_text_attr")
    private final CreateAwemeCoverTextAttr coverTextAttr;
    @AbstractC27891c(mo46611a = "is_cover_positioned")
    private final int isCoverPositioned;
    @AbstractC27891c(mo46611a = "is_cover_text")
    private final int isCoverText;

    static {
        Covode.recordClassIndex(54457);
    }

    public static /* synthetic */ CreateAwemeCoverInfo copy$default(CreateAwemeCoverInfo createAwemeCoverInfo, int i, int i2, CreateAwemeCoverTextAttr createAwemeCoverTextAttr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = createAwemeCoverInfo.isCoverText;
        }
        if ((i3 & 2) != 0) {
            i2 = createAwemeCoverInfo.isCoverPositioned;
        }
        if ((i3 & 4) != 0) {
            createAwemeCoverTextAttr = createAwemeCoverInfo.coverTextAttr;
        }
        return createAwemeCoverInfo.copy(i, i2, createAwemeCoverTextAttr);
    }

    public final int component1() {
        return this.isCoverText;
    }

    public final int component2() {
        return this.isCoverPositioned;
    }

    public final CreateAwemeCoverTextAttr component3() {
        return this.coverTextAttr;
    }

    public final CreateAwemeCoverInfo copy(int i, int i2, CreateAwemeCoverTextAttr createAwemeCoverTextAttr) {
        C89219l.m154721d(createAwemeCoverTextAttr, "");
        return new CreateAwemeCoverInfo(i, i2, createAwemeCoverTextAttr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAwemeCoverInfo)) {
            return false;
        }
        CreateAwemeCoverInfo createAwemeCoverInfo = (CreateAwemeCoverInfo) obj;
        return this.isCoverText == createAwemeCoverInfo.isCoverText && this.isCoverPositioned == createAwemeCoverInfo.isCoverPositioned && C89219l.m154714a(this.coverTextAttr, createAwemeCoverInfo.coverTextAttr);
    }

    public final int hashCode() {
        int i = ((this.isCoverText * 31) + this.isCoverPositioned) * 31;
        CreateAwemeCoverTextAttr createAwemeCoverTextAttr = this.coverTextAttr;
        return i + (createAwemeCoverTextAttr != null ? createAwemeCoverTextAttr.hashCode() : 0);
    }

    public final String toString() {
        return "CreateAwemeCoverInfo(isCoverText=" + this.isCoverText + ", isCoverPositioned=" + this.isCoverPositioned + ", coverTextAttr=" + this.coverTextAttr + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.isCoverText);
        parcel.writeInt(this.isCoverPositioned);
        this.coverTextAttr.writeToParcel(parcel, 0);
    }

    public final CreateAwemeCoverTextAttr getCoverTextAttr() {
        return this.coverTextAttr;
    }

    public final int isCoverPositioned() {
        return this.isCoverPositioned;
    }

    public final int isCoverText() {
        return this.isCoverText;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo$a */
    public static class C45930a implements Parcelable.Creator<CreateAwemeCoverInfo> {
        static {
            Covode.recordClassIndex(54458);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CreateAwemeCoverInfo[] newArray(int i) {
            return new CreateAwemeCoverInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CreateAwemeCoverInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CreateAwemeCoverInfo(parcel.readInt(), parcel.readInt(), CreateAwemeCoverTextAttr.CREATOR.createFromParcel(parcel));
        }
    }

    public CreateAwemeCoverInfo(int i, int i2, CreateAwemeCoverTextAttr createAwemeCoverTextAttr) {
        C89219l.m154721d(createAwemeCoverTextAttr, "");
        this.isCoverText = i;
        this.isCoverPositioned = i2;
        this.coverTextAttr = createAwemeCoverTextAttr;
    }
}
