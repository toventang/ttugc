package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.e */
public final class C70071e {

    /* renamed from: a */
    public final List<VideoSegment> f156682a;

    /* renamed from: b */
    public final String f156683b;

    /* renamed from: c */
    public final String f156684c;

    /* renamed from: d */
    public final int f156685d;

    /* renamed from: e */
    public final int f156686e;

    /* renamed from: f */
    public final int f156687f;

    /* renamed from: g */
    public final boolean f156688g;

    /* renamed from: h */
    public final VEVideoEncodeSettings.ENCODE_STANDARD f156689h;

    /* renamed from: i */
    public final VEVideoEncodeSettings.ENCODE_PROFILE f156690i;

    /* renamed from: j */
    public final VEVideoEncodeSettings.ENCODE_BITRATE_MODE f156691j;

    /* renamed from: k */
    public final int f156692k;

    /* renamed from: l */
    public final int f156693l;

    /* renamed from: m */
    public final int f156694m;

    /* renamed from: n */
    public final String f156695n;

    static {
        Covode.recordClassIndex(82491);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70071e)) {
            return false;
        }
        C70071e eVar = (C70071e) obj;
        return C89219l.m154714a(this.f156682a, eVar.f156682a) && C89219l.m154714a(this.f156683b, eVar.f156683b) && C89219l.m154714a(this.f156684c, eVar.f156684c) && this.f156685d == eVar.f156685d && this.f156686e == eVar.f156686e && this.f156687f == eVar.f156687f && this.f156688g == eVar.f156688g && C89219l.m154714a(this.f156689h, eVar.f156689h) && C89219l.m154714a(this.f156690i, eVar.f156690i) && C89219l.m154714a(this.f156691j, eVar.f156691j) && this.f156692k == eVar.f156692k && this.f156693l == eVar.f156693l && this.f156694m == eVar.f156694m && C89219l.m154714a(this.f156695n, eVar.f156695n);
    }

    public final int hashCode() {
        List<VideoSegment> list = this.f156682a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f156683b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f156684c;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f156685d) * 31) + this.f156686e) * 31) + this.f156687f) * 31;
        boolean z = this.f156688g;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = this.f156689h;
        int hashCode4 = (i5 + (encode_standard != null ? encode_standard.hashCode() : 0)) * 31;
        VEVideoEncodeSettings.ENCODE_PROFILE encode_profile = this.f156690i;
        int hashCode5 = (hashCode4 + (encode_profile != null ? encode_profile.hashCode() : 0)) * 31;
        VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode = this.f156691j;
        int hashCode6 = (((((((hashCode5 + (encode_bitrate_mode != null ? encode_bitrate_mode.hashCode() : 0)) * 31) + this.f156692k) * 31) + this.f156693l) * 31) + this.f156694m) * 31;
        String str3 = this.f156695n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "CutVideoCompileSettings(segments=" + this.f156682a + ", videoOutputPath=" + this.f156683b + ", audioOutputPath=" + this.f156684c + ", videoWidth=" + this.f156685d + ", videoHeight=" + this.f156686e + ", fps=" + this.f156687f + ", isHWEncode=" + this.f156688g + ", encodeStandard=" + this.f156689h + ", encodeProfile=" + this.f156690i + ", videoEncodeBitrateMode=" + this.f156691j + ", videoBitrate=" + this.f156692k + ", resizeMode=" + this.f156693l + ", rotate=" + this.f156694m + ", externalSettings=" + this.f156695n + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> */
    /* JADX WARN: Multi-variable type inference failed */
    private C70071e(List<? extends VideoSegment> list, String str, String str2, int i, int i2, int i3, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, String str3) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(encode_standard, "");
        C89219l.m154721d(encode_profile, "");
        C89219l.m154721d(encode_bitrate_mode, "");
        C89219l.m154721d(str3, "");
        this.f156682a = list;
        this.f156683b = str;
        this.f156684c = str2;
        this.f156685d = i;
        this.f156686e = i2;
        this.f156687f = i3;
        this.f156688g = false;
        this.f156689h = encode_standard;
        this.f156690i = encode_profile;
        this.f156691j = encode_bitrate_mode;
        this.f156692k = i4;
        this.f156693l = i5;
        this.f156694m = 0;
        this.f156695n = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C70071e(List list, String str, String str2, int i, int i2, int i3, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, String str3, int i6) {
        this(list, str, str2, (i6 & 8) != 0 ? 720 : i, (i6 & 16) != 0 ? 1280 : i2, (i6 & 32) != 0 ? 30 : i3, (i6 & 128) != 0 ? VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264 : encode_standard, (i6 & 256) != 0 ? VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE : encode_profile, (i6 & 512) != 0 ? VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF : encode_bitrate_mode, (i6 & 1024) != 0 ? 15 : i4, (i6 & 2048) != 0 ? 1 : i5, (i6 & 8192) != 0 ? "" : str3);
    }
}
