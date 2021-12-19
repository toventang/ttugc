package com.p2082ss.android.ugc.aweme.miniapp.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg */
public final class MiniAppMediaChooseEmptyArg implements IRouteArg {
    public static final Parcelable.Creator<MiniAppMediaChooseEmptyArg> CREATOR = new C59283a();
    private final int chooseNum;
    private final int currentType;

    static {
        Covode.recordClassIndex(69657);
    }

    public MiniAppMediaChooseEmptyArg() {
        this(0, 0, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r2 == null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg __fromBundle(android.os.Bundle r8) {
        /*
            r6 = 0
            if (r8 != 0) goto L_0x0004
            return r6
        L_0x0004:
            java.lang.String r1 = "key_choose_type"
            java.lang.String r7 = "key_choose_num"
            boolean r0 = r8.containsKey(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0050
            com.bytedance.router.arg.RouteParser r2 = com.bytedance.router.arg.RouteParser.INSTANCE
            java.lang.Object r1 = r8.get(r1)
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r4 = r2.parse(r1, r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x004e
        L_0x001f:
            r3 = 1
        L_0x0020:
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x004c
            com.bytedance.router.arg.RouteParser r2 = com.bytedance.router.arg.RouteParser.INSTANCE
            java.lang.Object r1 = r8.get(r7)
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r2 = r2.parse(r1, r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x0038
        L_0x0036:
            int r3 = r3 + 2
        L_0x0038:
            com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg r1 = new com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg
            if (r4 == 0) goto L_0x004a
            int r0 = r4.intValue()
        L_0x0040:
            if (r2 == 0) goto L_0x0046
            int r5 = r2.intValue()
        L_0x0046:
            r1.<init>(r0, r5, r3, r6)
            return r1
        L_0x004a:
            r0 = 0
            goto L_0x0040
        L_0x004c:
            r2 = r6
            goto L_0x0036
        L_0x004e:
            r3 = 0
            goto L_0x0020
        L_0x0050:
            r4 = r6
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg");
    }

    /* renamed from: com_ss_android_ugc_aweme_miniapp_media_MiniAppMediaChooseEmptyArg_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m108983x7f249a79(int i) {
        return i;
    }

    public static /* synthetic */ MiniAppMediaChooseEmptyArg copy$default(MiniAppMediaChooseEmptyArg miniAppMediaChooseEmptyArg, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = miniAppMediaChooseEmptyArg.currentType;
        }
        if ((i3 & 2) != 0) {
            i2 = miniAppMediaChooseEmptyArg.chooseNum;
        }
        return miniAppMediaChooseEmptyArg.copy(i, i2);
    }

    public final int component1() {
        return this.currentType;
    }

    public final int component2() {
        return this.chooseNum;
    }

    public final MiniAppMediaChooseEmptyArg copy(int i, int i2) {
        return new MiniAppMediaChooseEmptyArg(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniAppMediaChooseEmptyArg)) {
            return false;
        }
        MiniAppMediaChooseEmptyArg miniAppMediaChooseEmptyArg = (MiniAppMediaChooseEmptyArg) obj;
        return this.currentType == miniAppMediaChooseEmptyArg.currentType && this.chooseNum == miniAppMediaChooseEmptyArg.chooseNum;
    }

    public final int hashCode() {
        return (m108983x7f249a79(this.currentType) * 31) + m108983x7f249a79(this.chooseNum);
    }

    public final String toString() {
        return "MiniAppMediaChooseEmptyArg(currentType=" + this.currentType + ", chooseNum=" + this.chooseNum + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.currentType);
        parcel.writeInt(this.chooseNum);
    }

    public final int getChooseNum() {
        return this.chooseNum;
    }

    public final int getCurrentType() {
        return this.currentType;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyArg$a */
    public static class C59283a implements Parcelable.Creator<MiniAppMediaChooseEmptyArg> {
        static {
            Covode.recordClassIndex(69658);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MiniAppMediaChooseEmptyArg[] newArray(int i) {
            return new MiniAppMediaChooseEmptyArg[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MiniAppMediaChooseEmptyArg createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new MiniAppMediaChooseEmptyArg(parcel.readInt(), parcel.readInt());
        }
    }

    public MiniAppMediaChooseEmptyArg(int i, int i2) {
        this.currentType = i;
        this.chooseNum = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MiniAppMediaChooseEmptyArg(int i, int i2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 1 : i2);
    }
}
