package com.p2082ss.android.ugc.aweme.story.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.model.EditContext */
public final class EditContext implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditContext> CREATOR = new C76631a();

    /* renamed from: a */
    private final ETParams f171972a;

    /* renamed from: b */
    private final String f171973b;

    /* renamed from: c */
    private final ExtractFramesModel f171974c;

    /* renamed from: d */
    private final boolean f171975d;

    /* renamed from: e */
    private final File f171976e;

    /* renamed from: f */
    private final List<String> f171977f;

    /* renamed from: g */
    private final List<String> f171978g;

    /* renamed from: h */
    private final String f171979h;

    /* renamed from: i */
    private final int f171980i;

    /* renamed from: j */
    private final String f171981j;

    /* renamed from: k */
    private final List<String> f171982k;

    /* renamed from: l */
    private final String f171983l;

    /* renamed from: m */
    private final StickerInfo f171984m;

    /* renamed from: n */
    private final boolean f171985n;

    /* renamed from: o */
    private final long f171986o;

    /* renamed from: p */
    private final String f171987p;

    static {
        Covode.recordClassIndex(89619);
    }

    public EditContext() {
        this(null, null, null, false, null, null, null, null, 0, null, null, null, null, false, 0, null, 65535, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m134220x347baba(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m134221x347baba(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ EditContext copy$default(EditContext editContext, ETParams eTParams, String str, ExtractFramesModel extractFramesModel, boolean z, File file, List list, List list2, String str2, int i, String str3, List list3, String str4, StickerInfo stickerInfo, boolean z2, long j, String str5, int i2, Object obj) {
        String str6 = str;
        ETParams eTParams2 = eTParams;
        List list4 = list;
        File file2 = file;
        boolean z3 = z;
        ExtractFramesModel extractFramesModel2 = extractFramesModel;
        String str7 = str3;
        int i3 = i;
        String str8 = str2;
        List list5 = list2;
        boolean z4 = z2;
        StickerInfo stickerInfo2 = stickerInfo;
        String str9 = str4;
        List list6 = list3;
        String str10 = str5;
        long j2 = j;
        if ((i2 & 1) != 0) {
            eTParams2 = editContext.f171972a;
        }
        if ((i2 & 2) != 0) {
            str6 = editContext.f171973b;
        }
        if ((i2 & 4) != 0) {
            extractFramesModel2 = editContext.f171974c;
        }
        if ((i2 & 8) != 0) {
            z3 = editContext.f171975d;
        }
        if ((i2 & 16) != 0) {
            file2 = editContext.f171976e;
        }
        if ((i2 & 32) != 0) {
            list4 = editContext.f171977f;
        }
        if ((i2 & 64) != 0) {
            list5 = editContext.f171978g;
        }
        if ((i2 & 128) != 0) {
            str8 = editContext.f171979h;
        }
        if ((i2 & 256) != 0) {
            i3 = editContext.f171980i;
        }
        if ((i2 & 512) != 0) {
            str7 = editContext.f171981j;
        }
        if ((i2 & 1024) != 0) {
            list6 = editContext.f171982k;
        }
        if ((i2 & 2048) != 0) {
            str9 = editContext.f171983l;
        }
        if ((i2 & 4096) != 0) {
            stickerInfo2 = editContext.f171984m;
        }
        if ((i2 & 8192) != 0) {
            z4 = editContext.f171985n;
        }
        if ((i2 & 16384) != 0) {
            j2 = editContext.f171986o;
        }
        if ((i2 & 32768) != 0) {
            str10 = editContext.f171987p;
        }
        return editContext.copy(eTParams2, str6, extractFramesModel2, z3, file2, list4, list5, str8, i3, str7, list6, str9, stickerInfo2, z4, j2, str10);
    }

    public final ETParams component1() {
        return this.f171972a;
    }

    public final String component10() {
        return this.f171981j;
    }

    public final List<String> component11() {
        return this.f171982k;
    }

    public final String component12() {
        return this.f171983l;
    }

    public final StickerInfo component13() {
        return this.f171984m;
    }

    public final boolean component14() {
        return this.f171985n;
    }

    public final long component15() {
        return this.f171986o;
    }

    public final String component16() {
        return this.f171987p;
    }

    public final String component2() {
        return this.f171973b;
    }

    public final ExtractFramesModel component3() {
        return this.f171974c;
    }

    public final boolean component4() {
        return this.f171975d;
    }

    public final File component5() {
        return this.f171976e;
    }

    public final List<String> component6() {
        return this.f171977f;
    }

    public final List<String> component7() {
        return this.f171978g;
    }

    public final String component8() {
        return this.f171979h;
    }

    public final int component9() {
        return this.f171980i;
    }

    public final EditContext copy(ETParams eTParams, String str, ExtractFramesModel extractFramesModel, boolean z, File file, List<String> list, List<String> list2, String str2, int i, String str3, List<String> list3, String str4, StickerInfo stickerInfo, boolean z2, long j, String str5) {
        C89219l.m154721d(str5, "");
        return new EditContext(eTParams, str, extractFramesModel, z, file, list, list2, str2, i, str3, list3, str4, stickerInfo, z2, j, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditContext)) {
            return false;
        }
        EditContext editContext = (EditContext) obj;
        return C89219l.m154714a(this.f171972a, editContext.f171972a) && C89219l.m154714a(this.f171973b, editContext.f171973b) && C89219l.m154714a(this.f171974c, editContext.f171974c) && this.f171975d == editContext.f171975d && C89219l.m154714a(this.f171976e, editContext.f171976e) && C89219l.m154714a(this.f171977f, editContext.f171977f) && C89219l.m154714a(this.f171978g, editContext.f171978g) && C89219l.m154714a(this.f171979h, editContext.f171979h) && this.f171980i == editContext.f171980i && C89219l.m154714a(this.f171981j, editContext.f171981j) && C89219l.m154714a(this.f171982k, editContext.f171982k) && C89219l.m154714a(this.f171983l, editContext.f171983l) && C89219l.m154714a(this.f171984m, editContext.f171984m) && this.f171985n == editContext.f171985n && this.f171986o == editContext.f171986o && C89219l.m154714a(this.f171987p, editContext.f171987p);
    }

    public final int hashCode() {
        ETParams eTParams = this.f171972a;
        int i = 0;
        int hashCode = (eTParams != null ? eTParams.hashCode() : 0) * 31;
        String str = this.f171973b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ExtractFramesModel extractFramesModel = this.f171974c;
        int hashCode3 = (hashCode2 + (extractFramesModel != null ? extractFramesModel.hashCode() : 0)) * 31;
        boolean z = this.f171975d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        File file = this.f171976e;
        int hashCode4 = (i6 + (file != null ? file.hashCode() : 0)) * 31;
        List<String> list = this.f171977f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f171978g;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f171979h;
        int hashCode7 = (((hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31) + m134220x347baba(this.f171980i)) * 31;
        String str3 = this.f171981j;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list3 = this.f171982k;
        int hashCode9 = (hashCode8 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str4 = this.f171983l;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        StickerInfo stickerInfo = this.f171984m;
        int hashCode11 = (hashCode10 + (stickerInfo != null ? stickerInfo.hashCode() : 0)) * 31;
        if (!this.f171985n) {
            i2 = 0;
        }
        int com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode11 + i2) * 31) + m134221x347baba(this.f171986o)) * 31;
        String str5 = this.f171987p;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i;
    }

    public final String toString() {
        return "EditContext(etParams=" + this.f171972a + ", stickers=" + this.f171973b + ", extractFramesModel=" + this.f171974c + ", publishWithAnim=" + this.f171975d + ", recordTempDir=" + this.f171976e + ", arTextList=" + this.f171977f + ", messageBubbleTexts=" + this.f171978g + ", videoSegmentDesc=" + this.f171979h + ", cameraPosition=" + this.f171980i + ", cameraIds=" + this.f171981j + ", cameraLensInfo=" + this.f171982k + ", metadataMapStr=" + this.f171983l + ", stickerInfo=" + this.f171984m + ", containBackgroundVideo=" + this.f171985n + ", shootTimestamp=" + this.f171986o + ", isWestWindowExist=" + this.f171987p + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        ETParams eTParams = this.f171972a;
        if (eTParams != null) {
            parcel.writeInt(1);
            eTParams.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f171973b);
        parcel.writeSerializable(this.f171974c);
        parcel.writeInt(this.f171975d ? 1 : 0);
        parcel.writeSerializable(this.f171976e);
        parcel.writeStringList(this.f171977f);
        parcel.writeStringList(this.f171978g);
        parcel.writeString(this.f171979h);
        parcel.writeInt(this.f171980i);
        parcel.writeString(this.f171981j);
        parcel.writeStringList(this.f171982k);
        parcel.writeString(this.f171983l);
        parcel.writeSerializable(this.f171984m);
        parcel.writeInt(this.f171985n ? 1 : 0);
        parcel.writeLong(this.f171986o);
        parcel.writeString(this.f171987p);
    }

    public final List<String> getArTextList() {
        return this.f171977f;
    }

    public final String getCameraIds() {
        return this.f171981j;
    }

    public final List<String> getCameraLensInfo() {
        return this.f171982k;
    }

    public final int getCameraPosition() {
        return this.f171980i;
    }

    public final boolean getContainBackgroundVideo() {
        return this.f171985n;
    }

    public final ETParams getEtParams() {
        return this.f171972a;
    }

    public final ExtractFramesModel getExtractFramesModel() {
        return this.f171974c;
    }

    public final List<String> getMessageBubbleTexts() {
        return this.f171978g;
    }

    public final String getMetadataMapStr() {
        return this.f171983l;
    }

    public final boolean getPublishWithAnim() {
        return this.f171975d;
    }

    public final File getRecordTempDir() {
        return this.f171976e;
    }

    public final long getShootTimestamp() {
        return this.f171986o;
    }

    public final StickerInfo getStickerInfo() {
        return this.f171984m;
    }

    public final String getStickers() {
        return this.f171973b;
    }

    public final String getVideoSegmentDesc() {
        return this.f171979h;
    }

    public final String isWestWindowExist() {
        return this.f171987p;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.model.EditContext$a */
    public static class C76631a implements Parcelable.Creator<EditContext> {
        static {
            Covode.recordClassIndex(89620);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditContext[] newArray(int i) {
            return new EditContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditContext createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EditContext(parcel.readInt() != 0 ? ETParams.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (ExtractFramesModel) parcel.readSerializable(), parcel.readInt() != 0, (File) parcel.readSerializable(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), (StickerInfo) parcel.readSerializable(), parcel.readInt() != 0, parcel.readLong(), parcel.readString());
        }
    }

    public EditContext(ETParams eTParams, String str, ExtractFramesModel extractFramesModel, boolean z, File file, List<String> list, List<String> list2, String str2, int i, String str3, List<String> list3, String str4, StickerInfo stickerInfo, boolean z2, long j, String str5) {
        C89219l.m154721d(str5, "");
        this.f171972a = eTParams;
        this.f171973b = str;
        this.f171974c = extractFramesModel;
        this.f171975d = z;
        this.f171976e = file;
        this.f171977f = list;
        this.f171978g = list2;
        this.f171979h = str2;
        this.f171980i = i;
        this.f171981j = str3;
        this.f171982k = list3;
        this.f171983l = str4;
        this.f171984m = stickerInfo;
        this.f171985n = z2;
        this.f171986o = j;
        this.f171987p = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditContext(ETParams eTParams, String str, ExtractFramesModel extractFramesModel, boolean z, File file, List list, List list2, String str2, int i, String str3, List list3, String str4, StickerInfo stickerInfo, boolean z2, long j, String str5, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : eTParams, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : extractFramesModel, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? null : file, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) == 0 ? stickerInfo : null, (i2 & 8192) == 0 ? z2 : false, (i2 & 16384) != 0 ? -1 : j, (i2 & 32768) != 0 ? "" : str5);
    }
}
