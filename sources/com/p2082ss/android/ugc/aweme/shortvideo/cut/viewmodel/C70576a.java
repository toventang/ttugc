package com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a */
public final class C70576a {

    /* renamed from: f */
    public static final C70577a f157910f = new C70577a((byte) 0);

    /* renamed from: a */
    public C85581w.EnumC85607f f157911a;

    /* renamed from: b */
    public long f157912b;

    /* renamed from: c */
    public VEListener.AbstractC85250s f157913c;

    /* renamed from: d */
    public final int f157914d;

    /* renamed from: e */
    public boolean f157915e;

    static {
        Covode.recordClassIndex(83040);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a$a */
    public static final class C70577a {
        static {
            Covode.recordClassIndex(83041);
        }

        private C70577a() {
        }

        /* renamed from: a */
        public static /* synthetic */ C70576a m124666a() {
            return new C70576a(1, false);
        }

        public /* synthetic */ C70577a(byte b) {
            this();
        }
    }

    public /* synthetic */ C70576a(int i) {
        this(i, true);
    }

    public C70576a(int i, boolean z) {
        this.f157914d = i;
        this.f157915e = z;
        this.f157911a = C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek;
    }

    public /* synthetic */ C70576a(long j, C85581w.EnumC85607f fVar) {
        this(j, fVar, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C70576a(long j, C85581w.EnumC85607f fVar, VEListener.AbstractC85250s sVar) {
        this(3);
        C89219l.m154721d(fVar, "");
        this.f157912b = j;
        this.f157911a = fVar;
        this.f157913c = sVar;
    }
}
