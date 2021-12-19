package com.p2082ss.bytenn;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.bytenn.ByteNNConfig */
public class ByteNNConfig implements Parcelable {
    public static final Parcelable.Creator<ByteNNConfig> CREATOR = new Parcelable.Creator<ByteNNConfig>() {
        /* class com.p2082ss.bytenn.ByteNNConfig.C860721 */

        static {
            Covode.recordClassIndex(100843);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ByteNNConfig[] newArray(int i) {
            return new ByteNNConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ByteNNConfig createFromParcel(Parcel parcel) {
            return new ByteNNConfig(parcel);
        }
    };
    private EnumC86073a forwardType;
    private String[] inputNames;
    private ByteBuffer model;
    private String modelName;
    private int numThread;
    private String oclKernelBinPath;

    public int describeContents() {
        return 0;
    }

    public int getOrdinalOfForwardType() {
        return this.forwardType.ordinal();
    }

    static {
        Covode.recordClassIndex(100842);
    }

    public ByteNNConfig() {
        this.numThread = 1;
        this.forwardType = EnumC86073a.CPU;
        this.oclKernelBinPath = "";
        this.modelName = "";
    }

    /* renamed from: com.ss.bytenn.ByteNNConfig$a */
    public enum EnumC86073a {
        CPU,
        GPU,
        DSP,
        NPU,
        Auto,
        METAL,
        OPENCL,
        OPENGL,
        VULKAN,
        CUDA,
        CoreML;

        static {
            Covode.recordClassIndex(100844);
        }
    }

    public void setThreadNum(int i) {
        this.numThread = i;
    }

    protected ByteNNConfig(Parcel parcel) {
        this.numThread = 1;
        this.forwardType = EnumC86073a.values()[parcel.readInt()];
        parcel.readByteArray(null);
        this.model = ByteBuffer.wrap(null);
        parcel.readStringArray(this.inputNames);
        this.oclKernelBinPath = parcel.readString();
        this.modelName = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.forwardType.ordinal());
        parcel.writeByteArray(new byte[this.model.remaining()]);
        parcel.readStringArray(this.inputNames);
        parcel.writeStringArray(this.inputNames);
        parcel.writeString(this.oclKernelBinPath);
        parcel.writeString(this.modelName);
    }

    public void init(EnumC86073a aVar, ByteBuffer byteBuffer, String[] strArr, String str, String str2) {
        this.forwardType = aVar;
        if (strArr != null) {
            this.inputNames = strArr;
        } else {
            this.inputNames = new String[0];
        }
        if (byteBuffer.isDirect()) {
            this.model = byteBuffer;
            this.oclKernelBinPath = str;
            this.modelName = str2;
            return;
        }
        throw new Exception("ByteBuffer must be direct");
    }
}
