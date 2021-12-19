package com.p2082ss.ugc.live.p4460a.p4461a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.C87011a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87027a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.C87032e;

/* renamed from: com.ss.ugc.live.a.a.e */
public final class C87034e {

    /* renamed from: a */
    public final AbstractC87012b f196214a;

    /* renamed from: b */
    public final AbstractC87027a f196215b;

    /* renamed from: c */
    public final int f196216c;

    /* renamed from: d */
    public final int f196217d;

    /* renamed from: e */
    public final int f196218e;

    /* renamed from: f */
    public final long f196219f;

    /* renamed from: g */
    private final int f196220g;

    static {
        Covode.recordClassIndex(102800);
    }

    /* renamed from: a */
    public final int mo140638a() {
        return this.f196220g * 1000;
    }

    /* renamed from: com.ss.ugc.live.a.a.e$a */
    public static class C87035a {

        /* renamed from: a */
        public AbstractC87012b f196221a;

        /* renamed from: b */
        public AbstractC87027a f196222b;

        /* renamed from: c */
        public int f196223c = 2;

        /* renamed from: d */
        public int f196224d = 5;

        /* renamed from: e */
        public int f196225e = 3;

        /* renamed from: f */
        public int f196226f;

        /* renamed from: g */
        public long f196227g = 600000;

        /* renamed from: h */
        private final Context f196228h;

        static {
            Covode.recordClassIndex(102801);
        }

        /* renamed from: a */
        public final C87034e mo140639a() {
            if (this.f196221a == null) {
                this.f196221a = new C87011a(this.f196228h);
            }
            if (this.f196222b == null) {
                this.f196222b = new C87032e();
            }
            return new C87034e(this, (byte) 0);
        }

        public C87035a(Context context) {
            this.f196228h = context;
        }
    }

    private C87034e(C87035a aVar) {
        this.f196214a = aVar.f196221a;
        this.f196215b = aVar.f196222b;
        this.f196216c = aVar.f196223c;
        this.f196220g = aVar.f196224d;
        this.f196217d = aVar.f196225e;
        this.f196219f = aVar.f196227g;
        this.f196218e = aVar.f196226f;
    }

    /* synthetic */ C87034e(C87035a aVar, byte b) {
        this(aVar);
    }
}
