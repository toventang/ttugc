package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.draft.model.i */
public final class C43235i {
    @AbstractC27891c(mo46611a = "uploadId")

    /* renamed from: a */
    public final String f100948a;
    @AbstractC27891c(mo46611a = "trackType")

    /* renamed from: b */
    public int f100949b;
    @AbstractC27891c(mo46611a = "trackIndex")

    /* renamed from: c */
    public int f100950c;
    @AbstractC27891c(mo46611a = "effectPath")

    /* renamed from: d */
    public String f100951d;
    @AbstractC27891c(mo46611a = "effectTag")

    /* renamed from: e */
    public String f100952e;
    @AbstractC27891c(mo46611a = "seqIn")

    /* renamed from: f */
    public int f100953f;
    @AbstractC27891c(mo46611a = "seqOut")

    /* renamed from: g */
    public int f100954g;
    @AbstractC27891c(mo46611a = "challenge")

    /* renamed from: h */
    public AVChallenge f100955h;

    static {
        Covode.recordClassIndex(51437);
    }

    public final String toString() {
        return "DraftVEAudioEffectParam(uploadId=" + this.f100948a + ", trackType=" + this.f100949b + ", trackIndex=" + this.f100950c + ", effectPath=" + this.f100951d + ", effectTag=" + this.f100952e + ", seqIn=" + this.f100953f + ", seqOut=" + this.f100954g + ", challenge=" + this.f100955h + ")";
    }

    private /* synthetic */ C43235i() {
        this("", 0, 0, "", "", 0, 0, null);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.f100949b * 31;
        String str = this.f100948a;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((i3 + i) * 31) + this.f100950c) * 31;
        String str2 = this.f100951d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f100952e;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + this.f100953f) * 31) + this.f100954g;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        AVChallenge aVChallenge;
        AVChallenge aVChallenge2;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam");
        C43235i iVar = (C43235i) obj;
        if (this.f100949b != iVar.f100949b || !C89219l.m154714a((Object) this.f100948a, (Object) iVar.f100948a) || this.f100950c != iVar.f100950c || !C89361p.m154872a(this.f100951d, iVar.f100951d, false) || !C89361p.m154872a(this.f100952e, iVar.f100952e, false) || this.f100953f != iVar.f100953f || this.f100954g != iVar.f100954g || (((aVChallenge = this.f100955h) == null || (aVChallenge2 = iVar.f100955h) == null || !C89219l.m154714a(aVChallenge, aVChallenge2)) && (this.f100955h != null || iVar.f100955h != null))) {
            return false;
        }
        return true;
    }

    public C43235i(String str, int i, int i2, String str2, String str3, int i3, int i4, AVChallenge aVChallenge) {
        this.f100948a = str;
        this.f100949b = i;
        this.f100950c = i2;
        this.f100951d = str2;
        this.f100952e = str3;
        this.f100953f = i3;
        this.f100954g = i4;
        this.f100955h = aVChallenge;
    }
}
