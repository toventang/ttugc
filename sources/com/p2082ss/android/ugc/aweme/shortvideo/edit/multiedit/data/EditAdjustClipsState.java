package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState */
public final class EditAdjustClipsState implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditAdjustClipsState> CREATOR = new C71487a();

    /* renamed from: a */
    private final C89378p<Long, Long> f160188a;

    /* renamed from: b */
    private final C89378p<Long, Long> f160189b;

    static {
        Covode.recordClassIndex(84021);
    }

    public EditAdjustClipsState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditAdjustClipsState copy$default(EditAdjustClipsState editAdjustClipsState, C89378p pVar, C89378p pVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = editAdjustClipsState.f160188a;
        }
        if ((i & 2) != 0) {
            pVar2 = editAdjustClipsState.f160189b;
        }
        return editAdjustClipsState.copy(pVar, pVar2);
    }

    public final C89378p<Long, Long> component1() {
        return this.f160188a;
    }

    public final C89378p<Long, Long> component2() {
        return this.f160189b;
    }

    public final EditAdjustClipsState copy(C89378p<Long, Long> pVar, C89378p<Long, Long> pVar2) {
        return new EditAdjustClipsState(pVar, pVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsState)) {
            return false;
        }
        EditAdjustClipsState editAdjustClipsState = (EditAdjustClipsState) obj;
        return C89219l.m154714a(this.f160188a, editAdjustClipsState.f160188a) && C89219l.m154714a(this.f160189b, editAdjustClipsState.f160189b);
    }

    public final int hashCode() {
        C89378p<Long, Long> pVar = this.f160188a;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C89378p<Long, Long> pVar2 = this.f160189b;
        if (pVar2 != null) {
            i = pVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditAdjustClipsState(lastEditBoundary=" + this.f160188a + ", viewBoundary=" + this.f160189b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeSerializable(this.f160188a);
        parcel.writeSerializable(this.f160189b);
    }

    public final C89378p<Long, Long> getLastEditBoundary() {
        return this.f160188a;
    }

    public final C89378p<Long, Long> getViewBoundary() {
        return this.f160189b;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState$a */
    public static class C71487a implements Parcelable.Creator<EditAdjustClipsState> {
        static {
            Covode.recordClassIndex(84022);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditAdjustClipsState[] newArray(int i) {
            return new EditAdjustClipsState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditAdjustClipsState createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EditAdjustClipsState((C89378p) parcel.readSerializable(), (C89378p) parcel.readSerializable());
        }
    }

    public EditAdjustClipsState(C89378p<Long, Long> pVar, C89378p<Long, Long> pVar2) {
        this.f160188a = pVar;
        this.f160189b = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAdjustClipsState(C89378p pVar, C89378p pVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : pVar2);
    }
}
