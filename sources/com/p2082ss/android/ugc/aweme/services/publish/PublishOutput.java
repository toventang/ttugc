package com.p2082ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.publish.PublishOutput */
public final class PublishOutput {
    private final String creationId;
    private final String filePath;
    private final boolean isCommercialMusic;
    private final boolean isOriginalSound;
    private final String musicId;

    static {
        Covode.recordClassIndex(79952);
    }

    public static /* synthetic */ PublishOutput copy$default(PublishOutput publishOutput, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishOutput.creationId;
        }
        if ((i & 2) != 0) {
            str2 = publishOutput.filePath;
        }
        if ((i & 4) != 0) {
            str3 = publishOutput.musicId;
        }
        if ((i & 8) != 0) {
            z = publishOutput.isCommercialMusic;
        }
        if ((i & 16) != 0) {
            z2 = publishOutput.isOriginalSound;
        }
        return publishOutput.copy(str, str2, str3, z, z2);
    }

    public static /* synthetic */ void getFilePath$annotations() {
    }

    public final String component1() {
        return this.creationId;
    }

    public final String component2() {
        return this.filePath;
    }

    public final String component3() {
        return this.musicId;
    }

    public final boolean component4() {
        return this.isCommercialMusic;
    }

    public final boolean component5() {
        return this.isOriginalSound;
    }

    public final PublishOutput copy(String str, String str2, String str3, boolean z, boolean z2) {
        return new PublishOutput(str, str2, str3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishOutput)) {
            return false;
        }
        PublishOutput publishOutput = (PublishOutput) obj;
        return C89219l.m154714a(this.creationId, publishOutput.creationId) && C89219l.m154714a(this.filePath, publishOutput.filePath) && C89219l.m154714a(this.musicId, publishOutput.musicId) && this.isCommercialMusic == publishOutput.isCommercialMusic && this.isOriginalSound == publishOutput.isOriginalSound;
    }

    public final int hashCode() {
        String str = this.creationId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.filePath;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.musicId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.isCommercialMusic;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.isOriginalSound) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "PublishOutput(creationId=" + this.creationId + ", filePath=" + this.filePath + ", musicId=" + this.musicId + ", isCommercialMusic=" + this.isCommercialMusic + ", isOriginalSound=" + this.isOriginalSound + ")";
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public final boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public PublishOutput(String str, String str2, String str3, boolean z, boolean z2) {
        this.creationId = str;
        this.filePath = str2;
        this.musicId = str3;
        this.isCommercialMusic = z;
        this.isOriginalSound = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PublishOutput(String str, String str2, String str3, boolean z, boolean z2, int i, C89214g gVar) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }
}
