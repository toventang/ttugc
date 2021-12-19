package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.playerkit.model.x */
public final class C84227x {

    /* renamed from: f */
    public static final C84228a f188291f = new C84228a((byte) 0);

    /* renamed from: a */
    public String f188292a = "";

    /* renamed from: b */
    public long f188293b;

    /* renamed from: c */
    public ArrayList<C84201e> f188294c;

    /* renamed from: d */
    public long f188295d;

    /* renamed from: e */
    public long f188296e;

    static {
        Covode.recordClassIndex(98134);
    }

    /* renamed from: com.ss.android.ugc.playerkit.model.x$a */
    public static final class C84228a {
        static {
            Covode.recordClassIndex(98135);
        }

        private C84228a() {
        }

        public /* synthetic */ C84228a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo129042a() {
        ArrayList<C84201e> arrayList = this.f188294c;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList<C84201e> arrayList2 = this.f188294c;
            if (arrayList2 == null) {
                C89219l.m154707a();
            }
            Iterator<C84201e> it = arrayList2.iterator();
            while (it.hasNext()) {
                C84201e next = it.next();
                this.f188295d += (long) next.f188006c;
                this.f188296e += (long) next.f188007d;
            }
        }
    }
}
