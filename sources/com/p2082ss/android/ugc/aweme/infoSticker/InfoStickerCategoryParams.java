package com.p2082ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams */
public final class InfoStickerCategoryParams implements Parcelable, Serializable {
    public static final C56731a CREATOR = new C56731a((byte) 0);
    @AbstractC27891c(mo46611a = "info_sticker_category")
    private LinkedHashMap<String, String> infoStickerCategoryMap;

    static {
        Covode.recordClassIndex(66592);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams$a */
    public static final class C56731a implements Parcelable.Creator<InfoStickerCategoryParams> {
        static {
            Covode.recordClassIndex(66593);
        }

        private C56731a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InfoStickerCategoryParams[] newArray(int i) {
            return new InfoStickerCategoryParams[i];
        }

        public /* synthetic */ C56731a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InfoStickerCategoryParams createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new InfoStickerCategoryParams(parcel);
        }
    }

    public final LinkedHashMap<String, String> getInfoStickerCategoryMap() {
        return this.infoStickerCategoryMap;
    }

    public InfoStickerCategoryParams() {
        this.infoStickerCategoryMap = new LinkedHashMap<>();
    }

    public final void setInfoStickerCategoryMap(LinkedHashMap<String, String> linkedHashMap) {
        C89219l.m154721d(linkedHashMap, "");
        this.infoStickerCategoryMap = linkedHashMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoStickerCategoryParams(Parcel parcel) {
        this();
        C89219l.m154721d(parcel, "");
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.collections.LinkedHashMap<kotlin.String, kotlin.String> /* = java.util.LinkedHashMap<kotlin.String, kotlin.String> */");
        this.infoStickerCategoryMap = (LinkedHashMap) readSerializable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeSerializable(this.infoStickerCategoryMap);
    }
}
