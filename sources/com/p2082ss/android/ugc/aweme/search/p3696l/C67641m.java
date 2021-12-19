package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.m */
public final class C67641m {

    /* renamed from: a */
    public static final boolean f151543a = C16048b.m29633a().mo25421a(true, "search_page_launch_booster", true);

    /* renamed from: b */
    public static final AbstractC89244h f151544b = C89250i.m154773a((AbstractC89171a) C67642a.f151547a);

    /* renamed from: c */
    public static final C67641m f151545c = new C67641m();

    /* renamed from: d */
    private static final AbstractC89244h f151546d = C89250i.m154773a((AbstractC89171a) C67643b.f151548a);

    /* renamed from: a */
    public static boolean m119787a() {
        return ((Boolean) f151546d.getValue()).booleanValue();
    }

    private C67641m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.m$a */
    static final class C67642a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67642a f151547a = new C67642a();

        static {
            Covode.recordClassIndex(79281);
        }

        C67642a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "search_cancel_optimize", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.m$b */
    static final class C67643b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67643b f151548a = new C67643b();

        static {
            Covode.recordClassIndex(79282);
        }

        C67643b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "search_refresh_chunk_response", false));
        }
    }

    static {
        Covode.recordClassIndex(79280);
    }

    /* renamed from: a */
    public static View m119786a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        if (C67644n.m119788a(context) != null) {
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            AbstractC40912d a = C67644n.m119788a(context2);
            if (a == null) {
                C89219l.m154715b();
            }
            return a.getInflater().mo70113a(i);
        }
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
