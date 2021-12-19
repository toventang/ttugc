package com.p2082ss.android.ugc.aweme.audiorecord;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam */
public final class AudioRecorderParam implements Parcelable, Serializable {
    public static final C33976a CREATOR = new C33976a((byte) 0);
    private int audioRecordIndex;
    @AbstractC27891c(mo46611a = "audiourl")
    private String audioUrl;
    @AbstractC27891c(mo46611a = "extraurl")
    private String extraUrl;
    @AbstractC27891c(mo46611a = "mstack")
    private Stack<Point> mStack;
    private boolean needDel;
    @AbstractC27891c(mo46611a = "needoriginalsound")
    private boolean needOriginalSound;
    @AbstractC27891c(mo46611a = "voicevolume")
    private float voiceVolume;

    static {
        Covode.recordClassIndex(40903);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam$a */
    public static final class C33976a implements Parcelable.Creator<AudioRecorderParam> {
        static {
            Covode.recordClassIndex(40904);
        }

        private C33976a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AudioRecorderParam[] newArray(int i) {
            return new AudioRecorderParam[i];
        }

        public /* synthetic */ C33976a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AudioRecorderParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new AudioRecorderParam(parcel);
        }
    }

    public final int getAudioRecordIndex() {
        return this.audioRecordIndex;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final String getExtraUrl() {
        return this.extraUrl;
    }

    public final Stack<Point> getMStack() {
        return this.mStack;
    }

    public final boolean getNeedDel() {
        return this.needDel;
    }

    public final boolean getNeedOriginalSound() {
        return this.needOriginalSound;
    }

    public final float getVoiceVolume() {
        return this.voiceVolume;
    }

    public AudioRecorderParam() {
        this.mStack = new Stack<>();
        this.needOriginalSound = true;
        this.audioUrl = "";
        this.extraUrl = "";
        this.audioRecordIndex = -1;
    }

    public final boolean hasRecord() {
        if (TextUtils.isEmpty(this.audioUrl) || this.mStack.empty()) {
            return false;
        }
        return true;
    }

    public final void setAudioRecordIndex(int i) {
        this.audioRecordIndex = i;
    }

    public final void setNeedDel(boolean z) {
        this.needDel = z;
    }

    public final void setNeedOriginalSound(boolean z) {
        this.needOriginalSound = z;
    }

    public final void setVoiceVolume(float f) {
        this.voiceVolume = f;
    }

    public final void setAudioUrl(String str) {
        C89219l.m154721d(str, "");
        this.audioUrl = str;
    }

    public final void setExtraUrl(String str) {
        C89219l.m154721d(str, "");
        this.extraUrl = str;
    }

    public final void setMStack(Stack<Point> stack) {
        C89219l.m154721d(stack, "");
        this.mStack = stack;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioRecorderParam(Parcel parcel) {
        this();
        boolean z;
        String str = "";
        C89219l.m154721d(parcel, str);
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type java.util.Stack<com.ss.android.ugc.aweme.audiorecord.Point>");
        this.mStack = (Stack) readSerializable;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needOriginalSound = z;
        String readString = parcel.readString();
        this.audioUrl = readString == null ? str : readString;
        this.voiceVolume = parcel.readFloat();
        String readString2 = parcel.readString();
        this.extraUrl = readString2 != null ? readString2 : str;
    }

    public final void copyFrom(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            this.voiceVolume = audioRecorderParam.voiceVolume;
            this.needOriginalSound = audioRecorderParam.needOriginalSound;
            this.needDel = audioRecorderParam.needDel;
            this.voiceVolume = audioRecorderParam.voiceVolume;
            this.audioRecordIndex = audioRecorderParam.audioRecordIndex;
            this.audioUrl = audioRecorderParam.audioUrl;
            this.extraUrl = audioRecorderParam.extraUrl;
            this.mStack.clear();
            this.mStack.addAll(audioRecorderParam.mStack);
        }
    }

    public final boolean hasChange(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            Stack stack = new Stack();
            Stack stack2 = new Stack();
            stack.addAll(this.mStack);
            stack2.addAll(audioRecorderParam.mStack);
            if (stack.size() != stack2.size()) {
                return true;
            }
            while (!stack.isEmpty() && !stack2.empty()) {
                Point point = (Point) stack2.pop();
                C89219l.m154716b(point, "");
                if (!((Point) stack.pop()).isEqual(point)) {
                    return true;
                }
            }
            if (this.needOriginalSound != audioRecorderParam.needOriginalSound) {
                return true;
            }
            return false;
        } else if (!this.mStack.empty() || !this.needOriginalSound) {
            return true;
        } else {
            return false;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeSerializable(this.mStack);
        parcel.writeByte(this.needOriginalSound ? (byte) 1 : 0);
        parcel.writeString(this.audioUrl);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeString(this.extraUrl);
    }
}
