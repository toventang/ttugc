package com.p2082ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.e */
public final class C77428e {

    /* renamed from: a */
    public float f173721a;

    /* renamed from: b */
    public EnumC77446i f173722b;

    /* renamed from: c */
    public String f173723c;

    /* renamed from: d */
    public Aweme f173724d;

    /* renamed from: e */
    public AbstractC72639k f173725e;

    static {
        Covode.recordClassIndex(90459);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77428e)) {
            return false;
        }
        C77428e eVar = (C77428e) obj;
        return Float.compare(this.f173721a, eVar.f173721a) == 0 && C89219l.m154714a(this.f173722b, eVar.f173722b) && C89219l.m154714a(this.f173723c, eVar.f173723c) && C89219l.m154714a(this.f173724d, eVar.f173724d) && C89219l.m154714a(this.f173725e, eVar.f173725e);
    }

    public final String toString() {
        return "StoryPublishData(progress=" + this.f173721a + ", status=" + this.f173722b + ", failReason=" + this.f173723c + ", aweme=" + this.f173724d + ", callback=" + this.f173725e + ")";
    }

    public /* synthetic */ C77428e() {
        this(EnumC77446i.UPLOADING, "");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int floatToIntBits = Float.floatToIntBits(this.f173721a) * 31;
        EnumC77446i iVar = this.f173722b;
        int i4 = 0;
        if (iVar != null) {
            i = iVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = (floatToIntBits + i) * 31;
        String str = this.f173723c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Aweme aweme = this.f173724d;
        if (aweme != null) {
            i3 = aweme.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        AbstractC72639k kVar = this.f173725e;
        if (kVar != null) {
            i4 = kVar.hashCode();
        }
        return i7 + i4;
    }

    /* renamed from: a */
    public final void mo121052a(EnumC77446i iVar) {
        C89219l.m154721d(iVar, "");
        this.f173722b = iVar;
    }

    /* renamed from: a */
    public final void mo121053a(String str) {
        C89219l.m154721d(str, "");
        this.f173723c = str;
    }

    private C77428e(EnumC77446i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        this.f173721a = 0.0f;
        this.f173722b = iVar;
        this.f173723c = str;
        this.f173724d = null;
        this.f173725e = null;
    }
}
