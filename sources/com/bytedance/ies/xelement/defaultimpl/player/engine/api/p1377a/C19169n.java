package com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a;

import android.content.res.AssetFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n */
public final class C19169n {

    /* renamed from: a */
    public final String f45316a;

    /* renamed from: b */
    public final String f45317b;

    /* renamed from: c */
    public final String f45318c;

    /* renamed from: d */
    public final AssetFileDescriptor f45319d;

    /* renamed from: e */
    public final PlayModel f45320e;

    static {
        Covode.recordClassIndex(21932);
    }

    public C19169n() {
        this(null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19169n)) {
            return false;
        }
        C19169n nVar = (C19169n) obj;
        return C89219l.m154714a(this.f45316a, nVar.f45316a) && C89219l.m154714a(this.f45317b, nVar.f45317b) && C89219l.m154714a(this.f45318c, nVar.f45318c) && C89219l.m154714a(this.f45319d, nVar.f45319d) && C89219l.m154714a(this.f45320e, nVar.f45320e);
    }

    public final int hashCode() {
        String str = this.f45316a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45317b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45318c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AssetFileDescriptor assetFileDescriptor = this.f45319d;
        int hashCode4 = (hashCode3 + (assetFileDescriptor != null ? assetFileDescriptor.hashCode() : 0)) * 31;
        PlayModel playModel = this.f45320e;
        if (playModel != null) {
            i = playModel.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: a */
    public final boolean mo30519a() {
        String str = this.f45316a;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "PlayerModel(playUrl=" + this.f45316a + ", localFilePath=" + this.f45317b + ", cacheKey=" + this.f45318c + ", assetFd=" + this.f45319d + ')';
    }

    private C19169n(String str, String str2, PlayModel playModel) {
        this.f45316a = str;
        this.f45317b = str2;
        this.f45318c = null;
        this.f45319d = null;
        this.f45320e = playModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19169n(String str, String str2, PlayModel playModel, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 16) != 0 ? null : playModel);
    }
}
