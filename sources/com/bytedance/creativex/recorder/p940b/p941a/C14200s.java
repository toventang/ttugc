package com.bytedance.creativex.recorder.p940b.p941a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.b.a.s */
public final class C14200s {

    /* renamed from: a */
    public final List<String> f34472a;

    /* renamed from: b */
    public final List<String> f34473b;

    /* renamed from: c */
    public final SavePhotoStickerInfo f34474c;

    static {
        Covode.recordClassIndex(16269);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14200s)) {
            return false;
        }
        C14200s sVar = (C14200s) obj;
        return C89219l.m154714a(this.f34472a, sVar.f34472a) && C89219l.m154714a(this.f34473b, sVar.f34473b) && C89219l.m154714a(this.f34474c, sVar.f34474c);
    }

    public final int hashCode() {
        List<String> list = this.f34472a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f34473b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        SavePhotoStickerInfo savePhotoStickerInfo = this.f34474c;
        if (savePhotoStickerInfo != null) {
            i = savePhotoStickerInfo.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "RecordStickerInfo(arTexts=" + this.f34472a + ", effectTexts=" + this.f34473b + ", savePhotoStickerInfo=" + this.f34474c + ")";
    }

    private /* synthetic */ C14200s() {
        this(null, null, null);
    }

    public C14200s(List<String> list, List<String> list2, SavePhotoStickerInfo savePhotoStickerInfo) {
        this.f34472a = list;
        this.f34473b = list2;
        this.f34474c = savePhotoStickerInfo;
    }
}
