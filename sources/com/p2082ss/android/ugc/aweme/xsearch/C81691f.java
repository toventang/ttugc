package com.p2082ss.android.ugc.aweme.xsearch;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.f */
public final class C81691f {

    /* renamed from: a */
    public static final C81691f f182664a = new C81691f();

    /* renamed from: b */
    private static final AbstractC89244h f182665b = C89250i.m154773a((AbstractC89171a) C81692a.f182666a);

    /* renamed from: a */
    public static WeakHashMap<RecyclerView, C81686a> m141556a() {
        return (WeakHashMap) f182665b.getValue();
    }

    private C81691f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.f$a */
    static final class C81692a extends AbstractC89220m implements AbstractC89171a<WeakHashMap<RecyclerView, C81686a>> {

        /* renamed from: a */
        public static final C81692a f182666a = new C81692a();

        static {
            Covode.recordClassIndex(95096);
        }

        C81692a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakHashMap<RecyclerView, C81686a> invoke() {
            return new WeakHashMap();
        }
    }

    static {
        Covode.recordClassIndex(95095);
    }

    /* renamed from: a */
    public static C81686a m141555a(View view) {
        C89219l.m154721d(view, "");
        ViewParent parent = view.getParent();
        while (!(parent instanceof RecyclerView)) {
            if (parent == null) {
                return null;
            }
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        return m141556a().get(parent);
    }
}
