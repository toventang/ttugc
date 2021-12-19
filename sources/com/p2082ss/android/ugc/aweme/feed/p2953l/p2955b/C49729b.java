package com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.C49735c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.l.b.b */
public final class C49729b {

    /* renamed from: e */
    public static final C49731b f114447e = new C49731b((byte) 0);

    /* renamed from: a */
    public C49735c f114448a;

    /* renamed from: b */
    public boolean f114449b;

    /* renamed from: c */
    public AbstractC49732c f114450c;

    /* renamed from: d */
    public SparseArray<C49735c> f114451d;

    /* renamed from: com.ss.android.ugc.aweme.feed.l.b.b$c */
    public interface AbstractC49732c {
        static {
            Covode.recordClassIndex(58581);
        }

        /* renamed from: a */
        void mo81470a();
    }

    static {
        Covode.recordClassIndex(58578);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.b.b$b */
    public static final class C49731b {
        static {
            Covode.recordClassIndex(58580);
        }

        private C49731b() {
        }

        public /* synthetic */ C49731b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.b.b$d */
    public static final class C49733d implements C49735c.AbstractC49736a {

        /* renamed from: a */
        final /* synthetic */ C49729b f114454a;

        /* renamed from: b */
        final /* synthetic */ int f114455b;

        static {
            Covode.recordClassIndex(58582);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.C49735c.AbstractC49736a
        /* renamed from: a */
        public final void mo81476a() {
            this.f114454a.mo81473a(this.f114455b);
        }

        C49733d(C49729b bVar, int i) {
            this.f114454a = bVar;
            this.f114455b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.b.b$e */
    public static final class C49734e implements C49735c.AbstractC49736a {

        /* renamed from: a */
        final /* synthetic */ C49729b f114456a;

        /* renamed from: b */
        final /* synthetic */ int f114457b;

        static {
            Covode.recordClassIndex(58583);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.C49735c.AbstractC49736a
        /* renamed from: a */
        public final void mo81476a() {
            if (!this.f114456a.f114449b) {
                this.f114456a.mo81473a(this.f114457b);
            }
        }

        public C49734e(C49729b bVar, int i) {
            this.f114456a = bVar;
            this.f114457b = i;
        }
    }

    /* renamed from: a */
    public final void mo81472a() {
        mo81474b();
        this.f114451d.clear();
        this.f114448a = null;
        this.f114449b = true;
        this.f114450c = null;
    }

    /* renamed from: b */
    public final void mo81474b() {
        int size = this.f114451d.size();
        for (int i = 0; i < size; i++) {
            this.f114451d.valueAt(i).f114458a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.b.b$a */
    public static final class C49730a {

        /* renamed from: a */
        public final SparseArray<C49735c> f114452a = new SparseArray<>();

        /* renamed from: b */
        public AbstractC49732c f114453b;

        static {
            Covode.recordClassIndex(58579);
        }

        /* renamed from: a */
        public final C49730a mo81475a(C49735c cVar) {
            C89219l.m154721d(cVar, "");
            this.f114452a.append(cVar.f114459b, cVar);
            return this;
        }
    }

    public C49729b(SparseArray<C49735c> sparseArray) {
        C89219l.m154721d(sparseArray, "");
        this.f114451d = sparseArray;
    }

    /* renamed from: a */
    public final void mo81473a(int i) {
        C49735c valueAt;
        int i2 = i + 1;
        if (i2 >= this.f114451d.size() || (valueAt = this.f114451d.valueAt(i2)) == null) {
            AbstractC49732c cVar = this.f114450c;
            if (cVar != null) {
                cVar.mo81470a();
                return;
            }
            return;
        }
        this.f114448a = valueAt;
        valueAt.mo81477a(new C49733d(this, i2));
        AbstractC49732c cVar2 = this.f114450c;
    }
}
