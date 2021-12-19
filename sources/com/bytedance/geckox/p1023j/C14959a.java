package com.bytedance.geckox.p1023j;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.bytedance.geckox.j.a */
public final class C14959a implements Serializable {
    public boolean allowUpdate;
    public long lastReadTimeStamp;

    static {
        Covode.recordClassIndex(17072);
    }

    public C14959a(long j, boolean z) {
        this.lastReadTimeStamp = j;
        this.allowUpdate = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14959a(long j, boolean z, int i, C89214g gVar) {
        this(j, (i & 2) != 0 ? true : z);
    }
}
