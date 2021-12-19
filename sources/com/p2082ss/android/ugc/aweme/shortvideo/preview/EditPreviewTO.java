package com.p2082ss.android.ugc.aweme.shortvideo.preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.EditPreviewTO */
public final class EditPreviewTO implements Parcelable {
    public static final Parcelable.Creator<EditPreviewTO> CREATOR = new C72509a();
    private final FilterBean filterBean;
    private final String filterIntensityStoreTag;

    static {
        Covode.recordClassIndex(85187);
    }

    public static /* synthetic */ EditPreviewTO copy$default(EditPreviewTO editPreviewTO, FilterBean filterBean2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            filterBean2 = editPreviewTO.filterBean;
        }
        if ((i & 2) != 0) {
            str = editPreviewTO.filterIntensityStoreTag;
        }
        return editPreviewTO.copy(filterBean2, str);
    }

    public final FilterBean component1() {
        return this.filterBean;
    }

    public final String component2() {
        return this.filterIntensityStoreTag;
    }

    public final EditPreviewTO copy(FilterBean filterBean2, String str) {
        C89219l.m154721d(str, "");
        return new EditPreviewTO(filterBean2, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewTO)) {
            return false;
        }
        EditPreviewTO editPreviewTO = (EditPreviewTO) obj;
        return C89219l.m154714a(this.filterBean, editPreviewTO.filterBean) && C89219l.m154714a(this.filterIntensityStoreTag, editPreviewTO.filterIntensityStoreTag);
    }

    public final int hashCode() {
        FilterBean filterBean2 = this.filterBean;
        int i = 0;
        int hashCode = (filterBean2 != null ? filterBean2.hashCode() : 0) * 31;
        String str = this.filterIntensityStoreTag;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditPreviewTO(filterBean=" + this.filterBean + ", filterIntensityStoreTag=" + this.filterIntensityStoreTag + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.filterBean, i);
        parcel.writeString(this.filterIntensityStoreTag);
    }

    public final FilterBean getFilterBean() {
        return this.filterBean;
    }

    public final String getFilterIntensityStoreTag() {
        return this.filterIntensityStoreTag;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.EditPreviewTO$a */
    public static class C72509a implements Parcelable.Creator<EditPreviewTO> {
        static {
            Covode.recordClassIndex(85188);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditPreviewTO[] newArray(int i) {
            return new EditPreviewTO[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditPreviewTO createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EditPreviewTO((FilterBean) parcel.readParcelable(EditPreviewTO.class.getClassLoader()), parcel.readString());
        }
    }

    public EditPreviewTO(FilterBean filterBean2, String str) {
        C89219l.m154721d(str, "");
        this.filterBean = filterBean2;
        this.filterIntensityStoreTag = str;
    }
}
