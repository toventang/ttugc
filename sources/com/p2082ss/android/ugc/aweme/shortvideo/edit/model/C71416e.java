package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.e */
public final class C71416e {

    /* renamed from: a */
    private final int f160016a;

    /* renamed from: b */
    private final int f160017b;

    /* renamed from: c */
    private final long f160018c;

    /* renamed from: d */
    private final long f160019d;

    /* renamed from: e */
    private final String f160020e;

    static {
        Covode.recordClassIndex(83950);
    }

    public C71416e() {
        this(0, 0, 31);
    }

    public C71416e(int i, int i2) {
        this(i, i2, 28);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo113021a(List<? extends EditVideoSegment> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        int i = this.f160016a;
        int i2 = this.f160017b;
        long j = this.f160018c;
        long j2 = this.f160019d;
        String str = this.f160020e;
        if (str == null) {
            str = C71413b.m126120a();
        }
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(arrayList, i, i2, j, j2, str);
        if (!(!list.isEmpty()) || list == null) {
            throw new IllegalArgumentException("segments must not be NullOrEmpty");
        }
        editPreviewInfo.getVideoList().addAll(list);
        return editPreviewInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C71416e(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 0, 0, null);
    }

    public C71416e(int i, int i2, long j, long j2, String str) {
        this.f160016a = i;
        this.f160017b = i2;
        this.f160018c = j;
        this.f160019d = j2;
        this.f160020e = str;
    }
}
