package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap */
public final class InteractTextStructWrap implements Parcelable {
    public static final Parcelable.Creator<InteractTextStructWrap> CREATOR = new C46060a();
    private final TextStickerTextUnderlineIndexRange range;
    private final CreateAnchorInfo struct;

    static {
        Covode.recordClassIndex(54603);
    }

    public static /* synthetic */ InteractTextStructWrap copy$default(InteractTextStructWrap interactTextStructWrap, TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            textStickerTextUnderlineIndexRange = interactTextStructWrap.range;
        }
        if ((i & 2) != 0) {
            createAnchorInfo = interactTextStructWrap.struct;
        }
        return interactTextStructWrap.copy(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    public final TextStickerTextUnderlineIndexRange component1() {
        return this.range;
    }

    public final CreateAnchorInfo component2() {
        return this.struct;
    }

    public final InteractTextStructWrap copy(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        C89219l.m154721d(textStickerTextUnderlineIndexRange, "");
        C89219l.m154721d(createAnchorInfo, "");
        return new InteractTextStructWrap(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractTextStructWrap)) {
            return false;
        }
        InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) obj;
        return C89219l.m154714a(this.range, interactTextStructWrap.range) && C89219l.m154714a(this.struct, interactTextStructWrap.struct);
    }

    public final int hashCode() {
        TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = this.range;
        int i = 0;
        int hashCode = (textStickerTextUnderlineIndexRange != null ? textStickerTextUnderlineIndexRange.hashCode() : 0) * 31;
        CreateAnchorInfo createAnchorInfo = this.struct;
        if (createAnchorInfo != null) {
            i = createAnchorInfo.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InteractTextStructWrap(range=" + this.range + ", struct=" + this.struct + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        this.range.writeToParcel(parcel, 0);
        parcel.writeParcelable(this.struct, i);
    }

    public final TextStickerTextUnderlineIndexRange getRange() {
        return this.range;
    }

    public final CreateAnchorInfo getStruct() {
        return this.struct;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap$a */
    public static class C46060a implements Parcelable.Creator<InteractTextStructWrap> {
        static {
            Covode.recordClassIndex(54604);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InteractTextStructWrap[] newArray(int i) {
            return new InteractTextStructWrap[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InteractTextStructWrap createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new InteractTextStructWrap(TextStickerTextUnderlineIndexRange.CREATOR.createFromParcel(parcel), (CreateAnchorInfo) parcel.readParcelable(InteractTextStructWrap.class.getClassLoader()));
        }
    }

    public final boolean isValid(int i) {
        return this.range.isValid(i);
    }

    public InteractTextStructWrap(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        C89219l.m154721d(textStickerTextUnderlineIndexRange, "");
        C89219l.m154721d(createAnchorInfo, "");
        this.range = textStickerTextUnderlineIndexRange;
        this.struct = createAnchorInfo;
    }
}
