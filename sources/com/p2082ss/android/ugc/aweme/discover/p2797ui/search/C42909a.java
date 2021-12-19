package com.p2082ss.android.ugc.aweme.discover.p2797ui.search;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.AbstractC41892c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.a */
public final class C42909a implements AbstractC41892c {

    /* renamed from: a */
    public static int f100056a = -1;

    /* renamed from: b */
    public static final C42909a f100057b = new C42909a();

    /* renamed from: c */
    private static final AbstractC89244h f100058c = C89250i.m154773a((AbstractC89171a) C42910a.f100059a);

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.a$b */
    public interface AbstractC42911b {
        static {
            Covode.recordClassIndex(51016);
        }

        /* renamed from: a */
        void mo71436a(Aweme aweme, String str, String str2);
    }

    /* renamed from: b */
    public static Map<Integer, WeakReference<AbstractC42911b>> m85664b() {
        return (Map) f100058c.getValue();
    }

    private C42909a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.a$a */
    static final class C42910a extends AbstractC89220m implements AbstractC89171a<Map<Integer, WeakReference<AbstractC42911b>>> {

        /* renamed from: a */
        public static final C42910a f100059a = new C42910a();

        static {
            Covode.recordClassIndex(51015);
        }

        C42910a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, WeakReference<AbstractC42911b>> invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.AbstractC41892c
    /* renamed from: a */
    public final boolean mo71051a() {
        if (!m85664b().isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(51014);
    }

    /* renamed from: a */
    public static void m85663a(AbstractC42911b bVar) {
        C89219l.m154721d(bVar, "");
        Iterator<Map.Entry<Integer, WeakReference<AbstractC42911b>>> it = m85664b().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, WeakReference<AbstractC42911b>> next = it.next();
            if (next.getValue().get() == bVar || next.getValue().get() == null) {
                it.remove();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.AbstractC41892c
    /* renamed from: a */
    public final void mo71050a(Aweme aweme, String str, String str2) {
        AbstractC42911b bVar;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Iterator<Map.Entry<Integer, WeakReference<AbstractC42911b>>> it = m85664b().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, WeakReference<AbstractC42911b>> next = it.next();
            if (next.getValue().get() == null) {
                it.remove();
            } else if (next.getKey().intValue() == f100056a && (bVar = next.getValue().get()) != null) {
                bVar.mo71436a(aweme, str, str2);
            }
        }
    }
}
