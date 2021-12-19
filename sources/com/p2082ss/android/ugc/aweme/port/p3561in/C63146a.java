package com.p2082ss.android.ugc.aweme.port.p3561in;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.port.in.a */
public final class C63146a {

    /* renamed from: a */
    public List<? extends MusicModel> f143498a;

    /* renamed from: b */
    public long f143499b;

    /* renamed from: c */
    public int f143500c;

    /* renamed from: d */
    public int f143501d;

    /* renamed from: e */
    public boolean f143502e;

    /* renamed from: f */
    public String f143503f;

    static {
        Covode.recordClassIndex(74419);
    }

    public C63146a(List<? extends MusicModel> list, long j, int i, int i2, boolean z, String str) {
        C89219l.m154721d(str, "");
        this.f143498a = list;
        this.f143499b = j;
        this.f143500c = i;
        this.f143501d = i2;
        this.f143502e = z;
        this.f143503f = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C63146a(List list, long j, int i, int i2, boolean z, String str, int i3) {
        this(list, (i3 & 2) != 0 ? 0 : j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? "" : str);
    }
}
