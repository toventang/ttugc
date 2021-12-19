package com.p2082ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel */
public final class DraftEditTransferModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<DraftEditTransferModel> CREATOR = new C43217a();
    private final String primaryKey;
    private final List<EditVideoSegment> videoSegmentsCopy;

    static {
        Covode.recordClassIndex(51408);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftEditTransferModel copy$default(DraftEditTransferModel draftEditTransferModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftEditTransferModel.primaryKey;
        }
        if ((i & 2) != 0) {
            list = draftEditTransferModel.videoSegmentsCopy;
        }
        return draftEditTransferModel.copy(str, list);
    }

    public final String component1() {
        return this.primaryKey;
    }

    public final List<EditVideoSegment> component2() {
        return this.videoSegmentsCopy;
    }

    public final DraftEditTransferModel copy(String str, List<? extends EditVideoSegment> list) {
        return new DraftEditTransferModel(str, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftEditTransferModel)) {
            return false;
        }
        DraftEditTransferModel draftEditTransferModel = (DraftEditTransferModel) obj;
        return C89219l.m154714a(this.primaryKey, draftEditTransferModel.primaryKey) && C89219l.m154714a(this.videoSegmentsCopy, draftEditTransferModel.videoSegmentsCopy);
    }

    public final int hashCode() {
        String str = this.primaryKey;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DraftEditTransferModel(primaryKey=" + this.primaryKey + ", videoSegmentsCopy=" + this.videoSegmentsCopy + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.primaryKey);
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (EditVideoSegment editVideoSegment : list) {
                parcel.writeParcelable(editVideoSegment, i);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final List<EditVideoSegment> getVideoSegmentsCopy() {
        return this.videoSegmentsCopy;
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel$a */
    public static class C43217a implements Parcelable.Creator<DraftEditTransferModel> {
        static {
            Covode.recordClassIndex(51409);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DraftEditTransferModel[] newArray(int i) {
            return new DraftEditTransferModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DraftEditTransferModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readParcelable(DraftEditTransferModel.class.getClassLoader()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new DraftEditTransferModel(readString, arrayList);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftEditTransferModel(String str, List<? extends EditVideoSegment> list) {
        this.primaryKey = str;
        this.videoSegmentsCopy = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftEditTransferModel(String str, List list, int i, C89214g gVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
