package com.p2082ss.android.ugc.aweme.services.upload;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig */
public final class ExternalUploadVideoConfig {
    private final String appKey;
    private final String authorization;
    private final String fileHostName;
    private final int maxFailTime;
    private final int sliceSize;
    private final int sliceTimeout;
    private final String videoHostName;

    static {
        Covode.recordClassIndex(80003);
    }

    public ExternalUploadVideoConfig() {
        this(0, 0, null, null, 0, null, null, 127, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120131x15444835(int i) {
        return i;
    }

    public static /* synthetic */ ExternalUploadVideoConfig copy$default(ExternalUploadVideoConfig externalUploadVideoConfig, int i, int i2, String str, String str2, int i3, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = externalUploadVideoConfig.maxFailTime;
        }
        if ((i4 & 2) != 0) {
            i2 = externalUploadVideoConfig.sliceSize;
        }
        if ((i4 & 4) != 0) {
            str = externalUploadVideoConfig.fileHostName;
        }
        if ((i4 & 8) != 0) {
            str2 = externalUploadVideoConfig.videoHostName;
        }
        if ((i4 & 16) != 0) {
            i3 = externalUploadVideoConfig.sliceTimeout;
        }
        if ((i4 & 32) != 0) {
            str3 = externalUploadVideoConfig.appKey;
        }
        if ((i4 & 64) != 0) {
            str4 = externalUploadVideoConfig.authorization;
        }
        return externalUploadVideoConfig.copy(i, i2, str, str2, i3, str3, str4);
    }

    public final int component1() {
        return this.maxFailTime;
    }

    public final int component2() {
        return this.sliceSize;
    }

    public final String component3() {
        return this.fileHostName;
    }

    public final String component4() {
        return this.videoHostName;
    }

    public final int component5() {
        return this.sliceTimeout;
    }

    public final String component6() {
        return this.appKey;
    }

    public final String component7() {
        return this.authorization;
    }

    public final ExternalUploadVideoConfig copy(int i, int i2, String str, String str2, int i3, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new ExternalUploadVideoConfig(i, i2, str, str2, i3, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalUploadVideoConfig)) {
            return false;
        }
        ExternalUploadVideoConfig externalUploadVideoConfig = (ExternalUploadVideoConfig) obj;
        return this.maxFailTime == externalUploadVideoConfig.maxFailTime && this.sliceSize == externalUploadVideoConfig.sliceSize && C89219l.m154714a(this.fileHostName, externalUploadVideoConfig.fileHostName) && C89219l.m154714a(this.videoHostName, externalUploadVideoConfig.videoHostName) && this.sliceTimeout == externalUploadVideoConfig.sliceTimeout && C89219l.m154714a(this.appKey, externalUploadVideoConfig.appKey) && C89219l.m154714a(this.authorization, externalUploadVideoConfig.authorization);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m120131x15444835(this.maxFailTime) * 31) + m120131x15444835(this.sliceSize)) * 31;
        String str = this.fileHostName;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_services_upload_ExternalUploadVideoConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.videoHostName;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m120131x15444835(this.sliceTimeout)) * 31;
        String str3 = this.appKey;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.authorization;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ExternalUploadVideoConfig(maxFailTime=" + this.maxFailTime + ", sliceSize=" + this.sliceSize + ", fileHostName=" + this.fileHostName + ", videoHostName=" + this.videoHostName + ", sliceTimeout=" + this.sliceTimeout + ", appKey=" + this.appKey + ", authorization=" + this.authorization + ")";
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getFileHostName() {
        return this.fileHostName;
    }

    public final int getMaxFailTime() {
        return this.maxFailTime;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSliceTimeout() {
        return this.sliceTimeout;
    }

    public final String getVideoHostName() {
        return this.videoHostName;
    }

    public ExternalUploadVideoConfig(int i, int i2, String str, String str2, int i3, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.maxFailTime = i;
        this.sliceSize = i2;
        this.fileHostName = str;
        this.videoHostName = str2;
        this.sliceTimeout = i3;
        this.appKey = str3;
        this.authorization = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ExternalUploadVideoConfig(int r9, int r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, int r16, p4600h.p4611f.p4613b.C89214g r17) {
        /*
            r8 = this;
            r6 = r14
            r1 = r9
            r3 = r11
            r2 = r10
            r4 = r12
            r0 = r16 & 1
            r5 = 0
            if (r0 == 0) goto L_0x000b
            r1 = 0
        L_0x000b:
            r0 = r16 & 2
            if (r0 == 0) goto L_0x0010
            r2 = 0
        L_0x0010:
            r0 = r16 & 4
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0017
            r3 = r7
        L_0x0017:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x001c
            r4 = r7
        L_0x001c:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0030
        L_0x0020:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x0025
            r6 = r7
        L_0x0025:
            r0 = r16 & 64
            if (r0 == 0) goto L_0x002e
        L_0x0029:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x002e:
            r7 = r15
            goto L_0x0029
        L_0x0030:
            r5 = r13
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig.<init>(int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
