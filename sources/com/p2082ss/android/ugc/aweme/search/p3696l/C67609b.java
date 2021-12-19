package com.p2082ss.android.ugc.aweme.search.p3696l;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.search.l.b */
public final class C67609b<T> {

    /* renamed from: a */
    private ArrayList<T> f151483a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<T> f151484b;

    /* renamed from: c */
    private final C67610a<T> f151485c = new C67610a<>();

    /* renamed from: d */
    private boolean f151486d;

    static {
        Covode.recordClassIndex(79248);
    }

    /* renamed from: a */
    public final ArrayList<T> mo106612a() {
        if (!this.f151486d) {
            return this.f151483a;
        }
        if (this.f151484b == null) {
            this.f151484b = new ArrayList<>(this.f151483a);
        }
        return this.f151484b;
    }

    /* renamed from: b */
    public final C67610a<T> mo106613b() {
        if (!this.f151486d) {
            this.f151486d = true;
            this.f151484b = null;
            this.f151485c.f151487a = this.f151483a;
            this.f151485c.f151488b = this.f151483a.size();
            return this.f151485c;
        }
        throw new IllegalStateException("Iteration already started");
    }

    /* renamed from: c */
    public final void mo106614c() {
        if (this.f151486d) {
            this.f151486d = false;
            ArrayList<T> arrayList = this.f151484b;
            if (arrayList != null) {
                this.f151483a = arrayList;
                this.f151485c.f151487a.clear();
                this.f151485c.f151488b = 0;
            }
            this.f151484b = null;
            return;
        }
        throw new IllegalStateException("Iteration not started");
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.b$a */
    public static class C67610a<T> {

        /* renamed from: a */
        public ArrayList<T> f151487a;

        /* renamed from: b */
        public int f151488b;

        static {
            Covode.recordClassIndex(79249);
        }

        /* renamed from: a */
        public final T mo106615a(int i) {
            return this.f151487a.get(i);
        }
    }
}
