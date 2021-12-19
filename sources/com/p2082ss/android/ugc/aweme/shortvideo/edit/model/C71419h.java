package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.h */
public final class C71419h {

    /* renamed from: a */
    private final int f160027a;

    /* renamed from: b */
    private final int f160028b;

    /* renamed from: c */
    private final long f160029c;

    /* renamed from: d */
    private final long f160030d;

    /* renamed from: e */
    private final String f160031e;

    static {
        Covode.recordClassIndex(83953);
    }

    public C71419h() {
        this(0, 0, null, 31);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo113031a(EditVideoSegment editVideoSegment) {
        C89219l.m154721d(editVideoSegment, "");
        List c = C89070n.m154524c(editVideoSegment);
        int i = this.f160027a;
        int i2 = this.f160028b;
        long j = this.f160029c;
        long j2 = this.f160030d;
        String str = this.f160031e;
        if (str == null) {
            str = C71413b.m126120a();
        }
        return new EditPreviewInfo(c, i, i2, j, j2, str);
    }

    private C71419h(int i, int i2, String str) {
        this.f160027a = i;
        this.f160028b = i2;
        this.f160029c = 0;
        this.f160030d = 0;
        this.f160031e = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C71419h(int i, int i2, String str, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str);
    }
}
