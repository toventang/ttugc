package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam */
public final class AudioEffectParam implements Parcelable, IAudioEffectParam, Serializable {
    public static final C70822a CREATOR = new C70822a((byte) 0);
    @AbstractC27891c(mo46611a = "challenge")
    private AVChallenge challenge;
    @AbstractC27891c(mo46611a = "effectPath")
    private String effectPath;
    @AbstractC27891c(mo46611a = "effectTag")
    private String effectTag;
    @AbstractC27891c(mo46611a = "preprocessResult")
    private byte[] preprocessResult;
    @AbstractC27891c(mo46611a = "seqIn")
    private int seqIn;
    @AbstractC27891c(mo46611a = "seqOut")
    private int seqOut;
    private boolean showErrorToast;
    @AbstractC27891c(mo46611a = "trackIndex")
    private int trackIndex;
    @AbstractC27891c(mo46611a = "trackType")
    private int trackType;
    @AbstractC27891c(mo46611a = "uploadId")
    private String uploadId;

    static {
        Covode.recordClassIndex(83307);
    }

    public AudioEffectParam() {
        this(null, 0, 0, null, null, 0, 0, null, null, 511, null);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam$a */
    public static final class C70822a implements Parcelable.Creator<AudioEffectParam> {
        static {
            Covode.recordClassIndex(83308);
        }

        private C70822a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AudioEffectParam[] newArray(int i) {
            return new AudioEffectParam[i];
        }

        public /* synthetic */ C70822a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AudioEffectParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new AudioEffectParam(parcel);
        }
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final String getEffectPath() {
        return this.effectPath;
    }

    public final String getEffectTag() {
        return this.effectTag;
    }

    public final byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final int getSeqIn() {
        return this.seqIn;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final int getSeqOut() {
        return this.seqOut;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final int getTrackIndex() {
        return this.trackIndex;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final int getTrackType() {
        return this.trackType;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final void setSeqIn(int i) {
        this.seqIn = i;
    }

    @Override // com.bytedance.creativex.editor.preview.IAudioEffectParam
    public final void setSeqOut(int i) {
        this.seqOut = i;
    }

    public final void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public final void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setEffectPath(String str) {
        C89219l.m154721d(str, "");
        this.effectPath = str;
    }

    public final void setEffectTag(String str) {
        C89219l.m154721d(str, "");
        this.effectTag = str;
    }

    public final void setUploadId(String str) {
        C89219l.m154721d(str, "");
        this.uploadId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioEffectParam(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r11, r0)
            java.lang.String r1 = r11.readString()
            if (r1 != 0) goto L_0x000c
            r1 = r0
        L_0x000c:
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            int r2 = r11.readInt()
            int r3 = r11.readInt()
            java.lang.String r4 = r11.readString()
            if (r4 != 0) goto L_0x001e
            r4 = r0
        L_0x001e:
            p4600h.p4611f.p4613b.C89219l.m154716b(r4, r0)
            java.lang.String r5 = r11.readString()
            if (r5 != 0) goto L_0x0028
            r5 = r0
        L_0x0028:
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r0)
            int r6 = r11.readInt()
            int r7 = r11.readInt()
            byte[] r8 = r11.createByteArray()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r9 = r11.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r9 = (com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge) r9
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(getUploadId());
        parcel.writeInt(getTrackType());
        parcel.writeInt(getTrackIndex());
        parcel.writeString(getEffectPath());
        parcel.writeString(getEffectTag());
        parcel.writeInt(getSeqIn());
        parcel.writeInt(getSeqOut());
        parcel.writeByteArray(getPreprocessResult());
        parcel.writeParcelable(this.challenge, i);
    }

    public AudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, AVChallenge aVChallenge) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
        this.challenge = aVChallenge;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AudioEffectParam(java.lang.String r12, int r13, int r14, java.lang.String r15, java.lang.String r16, int r17, int r18, byte[] r19, com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge r20, int r21, p4600h.p4611f.p4613b.C89214g r22) {
        /*
            r11 = this;
            r1 = r21
            r7 = r17
            r2 = r12
            r4 = r14
            r9 = r19
            r3 = r13
            r5 = r15
            r0 = r1 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r1 & 2
            r8 = 0
            if (r0 == 0) goto L_0x0017
            r3 = 0
        L_0x0017:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x001c:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0021
            r5 = r6
        L_0x0021:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0043
        L_0x0025:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x002a
            r7 = 0
        L_0x002a:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0040
        L_0x002e:
            r0 = r1 & 128(0x80, float:1.794E-43)
            r10 = 0
            if (r0 == 0) goto L_0x0034
            r9 = r10
        L_0x0034:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x003d:
            r10 = r20
            goto L_0x0038
        L_0x0040:
            r8 = r18
            goto L_0x002e
        L_0x0043:
            r6 = r16
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, int, int, byte[], com.ss.android.ugc.aweme.shortvideo.AVChallenge, int, h.f.b.g):void");
    }
}
