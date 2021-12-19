package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.g */
public final class C43233g {
    @AbstractC27891c(mo46611a = "preview_width")

    /* renamed from: a */
    public int f100940a;
    @AbstractC27891c(mo46611a = "preview_height")

    /* renamed from: b */
    public int f100941b;
    @AbstractC27891c(mo46611a = "video_segment_list")

    /* renamed from: c */
    public List<DraftVideoSegment> f100942c;
    @AbstractC27891c(mo46611a = "volume")

    /* renamed from: d */
    public float f100943d;
    @AbstractC27891c(mo46611a = "fps")

    /* renamed from: e */
    public int f100944e;
    @AbstractC27891c(mo46611a = "scene_in")

    /* renamed from: f */
    public int f100945f;
    @AbstractC27891c(mo46611a = "scene_out")

    /* renamed from: g */
    public int f100946g;
    @AbstractC27891c(mo46611a = "draftDir")

    /* renamed from: h */
    public String f100947h;

    static {
        Covode.recordClassIndex(51435);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43233g)) {
            return false;
        }
        C43233g gVar = (C43233g) obj;
        return this.f100940a == gVar.f100940a && this.f100941b == gVar.f100941b && C89219l.m154714a(this.f100942c, gVar.f100942c) && Float.compare(this.f100943d, gVar.f100943d) == 0 && this.f100944e == gVar.f100944e && this.f100945f == gVar.f100945f && this.f100946g == gVar.f100946g && C89219l.m154714a(this.f100947h, gVar.f100947h);
    }

    public final String toString() {
        return "DraftPreviewConfigure(previewWidth=" + this.f100940a + ", previewHeight=" + this.f100941b + ", videoSegments=" + this.f100942c + ", mVolume=" + this.f100943d + ", mFps=" + this.f100944e + ", sceneIn=" + this.f100945f + ", sceneOut=" + this.f100946g + ", draftDir=" + this.f100947h + ")";
    }

    private /* synthetic */ C43233g() {
        this(C89086z.INSTANCE);
    }

    public final int hashCode() {
        int i;
        int i2 = ((this.f100940a * 31) + this.f100941b) * 31;
        List<DraftVideoSegment> list = this.f100942c;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = (((((((((i2 + i) * 31) + Float.floatToIntBits(this.f100943d)) * 31) + this.f100944e) * 31) + this.f100945f) * 31) + this.f100946g) * 31;
        String str = this.f100947h;
        if (str != null) {
            i3 = str.hashCode();
        }
        return floatToIntBits + i3;
    }

    /* renamed from: a */
    public final void mo73750a(List<DraftVideoSegment> list) {
        C89219l.m154721d(list, "");
        this.f100942c = list;
    }

    private C43233g(List<DraftVideoSegment> list) {
        C89219l.m154721d(list, "");
        this.f100940a = 576;
        this.f100941b = 1024;
        this.f100942c = list;
        this.f100943d = 0.0f;
        this.f100944e = -1;
        this.f100945f = 0;
        this.f100946g = 0;
        this.f100947h = null;
    }
}
