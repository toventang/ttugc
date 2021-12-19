package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ReactionContext */
public final class ReactionContext implements Parcelable {
    public static final Parcelable.Creator<ReactionContext> CREATOR = new C69733a();

    /* renamed from: a */
    public ReactionParams f155723a;

    static {
        Covode.recordClassIndex(82125);
    }

    public ReactionContext(byte b) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ReactionContext) && C89219l.m154714a(this.f155723a, ((ReactionContext) obj).f155723a);
        }
        return true;
    }

    public final int hashCode() {
        ReactionParams reactionParams = this.f155723a;
        if (reactionParams != null) {
            return reactionParams.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReactionContext(reactionParams=" + this.f155723a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.f155723a, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ReactionContext$a */
    public static class C69733a implements Parcelable.Creator<ReactionContext> {
        static {
            Covode.recordClassIndex(82126);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReactionContext[] newArray(int i) {
            return new ReactionContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReactionContext createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ReactionContext((ReactionParams) parcel.readParcelable(ReactionContext.class.getClassLoader()));
        }
    }

    private /* synthetic */ ReactionContext() {
        this((ReactionParams) null);
    }

    public ReactionContext(ReactionParams reactionParams) {
        this.f155723a = reactionParams;
    }
}
