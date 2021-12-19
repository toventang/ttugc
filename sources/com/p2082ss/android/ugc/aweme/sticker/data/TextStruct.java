package com.p2082ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.TextStruct */
public final class TextStruct implements Parcelable {
    public static final Parcelable.Creator<TextStruct> CREATOR = new C75305a();
    @AbstractC27891c(mo46611a = "anchors")
    private final List<CreateAnchorInfo> anchors;

    static {
        Covode.recordClassIndex(88221);
    }

    public TextStruct() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.TextStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStruct copy$default(TextStruct textStruct, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textStruct.anchors;
        }
        return textStruct.copy(list);
    }

    public final List<CreateAnchorInfo> component1() {
        return this.anchors;
    }

    public final TextStruct copy(List<CreateAnchorInfo> list) {
        C89219l.m154721d(list, "");
        return new TextStruct(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TextStruct) && C89219l.m154714a(this.anchors, ((TextStruct) obj).anchors);
        }
        return true;
    }

    public final int hashCode() {
        List<CreateAnchorInfo> list = this.anchors;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextStruct(anchors=" + this.anchors + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<CreateAnchorInfo> list = this.anchors;
        parcel.writeInt(list.size());
        for (CreateAnchorInfo createAnchorInfo : list) {
            createAnchorInfo.writeToParcel(parcel, 0);
        }
    }

    public final List<CreateAnchorInfo> getAnchors() {
        return this.anchors;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.TextStruct$a */
    public static class C75305a implements Parcelable.Creator<TextStruct> {
        static {
            Covode.recordClassIndex(88222);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStruct[] newArray(int i) {
            return new TextStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStruct createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(CreateAnchorInfo.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new TextStruct(arrayList);
        }
    }

    public TextStruct(List<CreateAnchorInfo> list) {
        C89219l.m154721d(list, "");
        this.anchors = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextStruct(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
