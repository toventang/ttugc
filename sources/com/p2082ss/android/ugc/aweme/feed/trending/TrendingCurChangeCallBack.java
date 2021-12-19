package com.p2082ss.android.ugc.aweme.feed.trending;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack */
public final class TrendingCurChangeCallBack extends AbstractC1174ac {

    /* renamed from: b */
    public static final C49946a f115132b = new C49946a((byte) 0);

    /* renamed from: a */
    public final C1213t<C89378p<Aweme, Boolean>> f115133a = new C1213t<>();

    static {
        Covode.recordClassIndex(59057);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack$a */
    public static final class C49946a {
        static {
            Covode.recordClassIndex(59058);
        }

        private C49946a() {
        }

        public /* synthetic */ C49946a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack$a$a */
        public static final class C49947a<T> implements AbstractC1214u {

            /* renamed from: a */
            final /* synthetic */ AbstractC89183m f115134a;

            static {
                Covode.recordClassIndex(59059);
            }

            C49947a(AbstractC89183m mVar) {
                this.f115134a = mVar;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                C89378p pVar = (C89378p) obj;
                if (pVar != null) {
                    this.f115134a.invoke(pVar.getFirst(), pVar.getSecond());
                }
            }
        }

        /* renamed from: a */
        public static C1213t<C89378p<Aweme, Boolean>> m93789a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(TrendingCurChangeCallBack.class);
            C89219l.m154716b(a, "");
            return ((TrendingCurChangeCallBack) a).f115133a;
        }

        /* renamed from: a */
        public static void m93790a(ActivityC0945e eVar, Aweme aweme, boolean z) {
            if (eVar != null) {
                m93789a(eVar).setValue(C89387v.m154943a(aweme, Boolean.valueOf(z)));
            }
        }
    }
}
