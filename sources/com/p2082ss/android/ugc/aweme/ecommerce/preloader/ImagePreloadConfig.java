package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadConfig */
public final class ImagePreloadConfig implements Parcelable {
    public static final Parcelable.Creator<ImagePreloadConfig> CREATOR = new C45082a();
    @AbstractC27891c(mo46611a = "priority")

    /* renamed from: a */
    public final List<Integer> f105122a;
    @AbstractC27891c(mo46611a = "option")

    /* renamed from: b */
    public final int f105123b;

    static {
        Covode.recordClassIndex(53509);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePreloadConfig)) {
            return false;
        }
        ImagePreloadConfig imagePreloadConfig = (ImagePreloadConfig) obj;
        return C89219l.m154714a(this.f105122a, imagePreloadConfig.f105122a) && this.f105123b == imagePreloadConfig.f105123b;
    }

    public final int hashCode() {
        List<Integer> list = this.f105122a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.f105123b;
    }

    public final String toString() {
        return "ImagePreloadConfig(priority=" + this.f105122a + ", option=" + this.f105123b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<Integer> list = this.f105122a;
        parcel.writeInt(list.size());
        for (Integer num : list) {
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f105123b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadConfig$a */
    public static class C45082a implements Parcelable.Creator<ImagePreloadConfig> {
        static {
            Covode.recordClassIndex(53510);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ImagePreloadConfig[] newArray(int i) {
            return new ImagePreloadConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImagePreloadConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                readInt--;
            }
            return new ImagePreloadConfig(arrayList, parcel.readInt());
        }
    }

    public /* synthetic */ ImagePreloadConfig() {
        this(C89086z.INSTANCE, 0);
    }

    public ImagePreloadConfig(List<Integer> list, int i) {
        C89219l.m154721d(list, "");
        this.f105122a = list;
        this.f105123b = i;
    }
}
