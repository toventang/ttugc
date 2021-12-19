package com.p2082ss.android.ugc.aweme.music.assem;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.OriginMusicArg */
public final class OriginMusicArg implements AbstractC12779c, IRouteArg {
    public static final Parcelable.Creator<OriginMusicArg> CREATOR = new C60338a();
    private final int bottomBarHeight;
    private final boolean isMe;
    private final String previousPage;
    private final String secUserID;
    private final String userId;

    static {
        Covode.recordClassIndex(70886);
    }

    public OriginMusicArg() {
        this(false, null, null, 0, null, 31, null);
    }

    public OriginMusicArg(boolean z) {
        this(z, null, null, 0, null, 30, null);
    }

    public OriginMusicArg(boolean z, String str) {
        this(z, str, null, 0, null, 28, null);
    }

    public OriginMusicArg(boolean z, String str, String str2) {
        this(z, str, str2, 0, null, 24, null);
    }

    public OriginMusicArg(boolean z, String str, String str2, int i) {
        this(z, str, str2, i, null, 16, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r3 == null) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg __fromBundle(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.music.assem.OriginMusicArg");
    }

    /* renamed from: com_ss_android_ugc_aweme_music_assem_OriginMusicArg_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m110053xef2d4516(int i) {
        return i;
    }

    public static /* synthetic */ OriginMusicArg copy$default(OriginMusicArg originMusicArg, boolean z, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = originMusicArg.isMe;
        }
        if ((i2 & 2) != 0) {
            str = originMusicArg.userId;
        }
        if ((i2 & 4) != 0) {
            str2 = originMusicArg.secUserID;
        }
        if ((i2 & 8) != 0) {
            i = originMusicArg.bottomBarHeight;
        }
        if ((i2 & 16) != 0) {
            str3 = originMusicArg.previousPage;
        }
        return originMusicArg.copy(z, str, str2, i, str3);
    }

    public final boolean component1() {
        return this.isMe;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.secUserID;
    }

    public final int component4() {
        return this.bottomBarHeight;
    }

    public final String component5() {
        return this.previousPage;
    }

    public final OriginMusicArg copy(boolean z, String str, String str2, int i, String str3) {
        return new OriginMusicArg(z, str, str2, i, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginMusicArg)) {
            return false;
        }
        OriginMusicArg originMusicArg = (OriginMusicArg) obj;
        return this.isMe == originMusicArg.isMe && C89219l.m154714a(this.userId, originMusicArg.userId) && C89219l.m154714a(this.secUserID, originMusicArg.secUserID) && this.bottomBarHeight == originMusicArg.bottomBarHeight && C89219l.m154714a(this.previousPage, originMusicArg.previousPage);
    }

    public final int hashCode() {
        boolean z = this.isMe;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.userId;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.secUserID;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m110053xef2d4516(this.bottomBarHeight)) * 31;
        String str3 = this.previousPage;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return hashCode2 + i5;
    }

    public final String toString() {
        return "OriginMusicArg(isMe=" + this.isMe + ", userId=" + this.userId + ", secUserID=" + this.secUserID + ", bottomBarHeight=" + this.bottomBarHeight + ", previousPage=" + this.previousPage + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.isMe ? 1 : 0);
        parcel.writeString(this.userId);
        parcel.writeString(this.secUserID);
        parcel.writeInt(this.bottomBarHeight);
        parcel.writeString(this.previousPage);
    }

    public final int getBottomBarHeight() {
        return this.bottomBarHeight;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSecUserID() {
        return this.secUserID;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.OriginMusicArg$a */
    public static class C60338a implements Parcelable.Creator<OriginMusicArg> {
        static {
            Covode.recordClassIndex(70887);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OriginMusicArg[] newArray(int i) {
            return new OriginMusicArg[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OriginMusicArg createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new OriginMusicArg(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }
    }

    public OriginMusicArg(boolean z, String str, String str2, int i, String str3) {
        this.isMe = z;
        this.userId = str;
        this.secUserID = str2;
        this.bottomBarHeight = i;
        this.previousPage = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OriginMusicArg(boolean z, String str, String str2, int i, String str3, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) == 0 ? str3 : null);
    }
}
