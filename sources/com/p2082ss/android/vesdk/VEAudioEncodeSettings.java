package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings */
public class VEAudioEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEAudioEncodeSettings> CREATOR = new Parcelable.Creator<VEAudioEncodeSettings>() {
        /* class com.p2082ss.android.vesdk.VEAudioEncodeSettings.C851921 */

        static {
            Covode.recordClassIndex(99245);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioEncodeSettings[] newArray(int i) {
            return new VEAudioEncodeSettings[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioEncodeSettings createFromParcel(Parcel parcel) {
            return new VEAudioEncodeSettings(parcel);
        }
    };

    /* renamed from: a */
    static final VEAudioEncodeSettings f190616a = new VEAudioEncodeSettings();

    /* renamed from: b */
    public ENCODE_STANDARD f190617b;

    /* renamed from: c */
    public int f190618c;

    /* renamed from: d */
    public int f190619d;

    /* renamed from: e */
    public int f190620e;

    /* renamed from: f */
    public boolean f190621f;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$a */
    public static final class C85194a {

        /* renamed from: a */
        public ENCODE_STANDARD f190623a = ENCODE_STANDARD.ENCODE_STANDARD_WAV;

        /* renamed from: b */
        public int f190624b = 44100;

        /* renamed from: c */
        public int f190625c = 131072;

        /* renamed from: d */
        public int f190626d = 2;

        /* renamed from: e */
        public boolean f190627e;

        /* renamed from: f */
        private String f190628f;

        /* renamed from: g */
        private EnumC85195b f190629g = EnumC85195b.COMPILE;

        static {
            Covode.recordClassIndex(99248);
        }

        /* renamed from: a */
        public final VEAudioEncodeSettings mo130147a() {
            if (this.f190628f != null) {
                m146499b();
            }
            return new VEAudioEncodeSettings(this, (byte) 0);
        }

        /* renamed from: b */
        private void m146499b() {
            try {
                JSONObject jSONObject = new JSONObject(this.f190628f);
                JSONObject jSONObject2 = null;
                if (this.f190629g.equals(EnumC85195b.COMPILE)) {
                    jSONObject2 = jSONObject.getJSONObject("compile");
                } else if (this.f190629g.equals(EnumC85195b.RECORD)) {
                    jSONObject2 = jSONObject.getJSONObject("record");
                } else if (this.f190629g.equals(EnumC85195b.COMPILE_WATERMARK)) {
                    jSONObject2 = jSONObject.getJSONObject("watermark_compile");
                }
                try {
                    String string = jSONObject2.getString("mCodec");
                    ENCODE_STANDARD encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
                    if (string == null) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
                    } else if ("AAC".equals(string.toUpperCase())) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
                    } else if ("PCM".equals(string.toUpperCase())) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_PCM;
                    } else if ("WAV".equals(string.toUpperCase())) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_WAV;
                    }
                    this.f190623a = encode_standard;
                    this.f190624b = jSONObject2.getInt("mSampleRate");
                    this.f190625c = jSONObject2.getInt("mBps");
                    this.f190626d = jSONObject2.getInt("mChannelCount");
                    this.f190627e = jSONObject2.getBoolean("mHwEnc");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(99244);
    }

    public VEAudioEncodeSettings() {
        this.f190618c = 44100;
        this.f190619d = 131072;
        this.f190620e = 2;
        this.f190618c = 44100;
        this.f190619d = 128000;
        this.f190620e = 2;
    }

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$ENCODE_STANDARD */
    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_WAV,
        ENCODE_STANDARD_PCM,
        ENCODE_STANDARD_AAC;
        
        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new Parcelable.Creator<ENCODE_STANDARD>() {
            /* class com.p2082ss.android.vesdk.VEAudioEncodeSettings.ENCODE_STANDARD.C851931 */

            static {
                Covode.recordClassIndex(99247);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_STANDARD[] newArray(int i) {
                return new ENCODE_STANDARD[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_STANDARD createFromParcel(Parcel parcel) {
                return ENCODE_STANDARD.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99246);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$b */
    public enum EnumC85195b {
        RECORD,
        COMPILE,
        COMPILE_WATERMARK;

        static {
            Covode.recordClassIndex(99249);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mCodec\":").append(this.f190617b);
        sb.append(",\"mSampleRate\":").append(this.f190618c);
        sb.append(",\"mBps\":").append(this.f190619d);
        sb.append(",\"mChannelCount\":").append(this.f190620e);
        sb.append(",\"mHwEnc\":").append(this.f190621f);
        sb.append('}');
        return sb.toString();
    }

    protected VEAudioEncodeSettings(Parcel parcel) {
        boolean z;
        this.f190618c = 44100;
        this.f190619d = 131072;
        this.f190620e = 2;
        this.f190617b = (ENCODE_STANDARD) parcel.readParcelable(ENCODE_STANDARD.class.getClassLoader());
        this.f190618c = parcel.readInt();
        this.f190619d = parcel.readInt();
        this.f190620e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f190621f = z;
    }

    private VEAudioEncodeSettings(C85194a aVar) {
        this.f190618c = 44100;
        this.f190619d = 131072;
        this.f190620e = 2;
        this.f190617b = aVar.f190623a;
        this.f190618c = aVar.f190624b;
        this.f190619d = aVar.f190625c;
        this.f190620e = aVar.f190626d;
        this.f190621f = aVar.f190627e;
    }

    /* synthetic */ VEAudioEncodeSettings(C85194a aVar, byte b) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f190617b, i);
        parcel.writeInt(this.f190618c);
        parcel.writeInt(this.f190619d);
        parcel.writeInt(this.f190620e);
        parcel.writeByte(this.f190621f ? (byte) 1 : 0);
    }
}
