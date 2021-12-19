package com.p2082ss.android.ugc.aweme.homepage.api.data;

import android.content.Intent;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.locks.Lock;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel */
public final class HomePageDataViewModel extends AbstractC1174ac {

    /* renamed from: n */
    public static final C52942a f121734n = new C52942a((byte) 0);

    /* renamed from: a */
    public View f121735a;

    /* renamed from: b */
    public boolean f121736b;

    /* renamed from: c */
    public final C52948a f121737c = new C52948a();

    /* renamed from: d */
    public final Lock f121738d = new C52949b();

    /* renamed from: e */
    public final Message f121739e = new Message();

    /* renamed from: f */
    public String f121740f;

    /* renamed from: g */
    public Aweme f121741g;

    /* renamed from: h */
    public C1213t<String> f121742h = new C1213t<>();

    /* renamed from: i */
    public C1213t<String> f121743i = new C1213t<>();

    /* renamed from: j */
    public String f121744j;

    /* renamed from: k */
    public Aweme f121745k;

    /* renamed from: l */
    public boolean f121746l;

    /* renamed from: m */
    public int f121747m = 1;

    /* renamed from: o */
    private final AbstractC89244h f121748o = C89250i.m154773a((AbstractC89171a) C52945c.f121751a);

    /* renamed from: p */
    private final AbstractC89244h f121749p = C89250i.m154773a((AbstractC89171a) C52944b.f121750a);

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$a */
    public static final class C52942a {
        static {
            Covode.recordClassIndex(62466);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$a$a */
        public static final class C52943a implements C1175ad.AbstractC1177b {
            static {
                Covode.recordClassIndex(62467);
            }

            C52943a() {
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new HomePageDataViewModel();
            }
        }

        private C52942a() {
        }

        public /* synthetic */ C52942a(byte b) {
            this();
        }

        /* renamed from: a */
        public static HomePageDataViewModel m97777a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, new C52943a()).mo3983a(HomePageDataViewModel.class);
            C89219l.m154716b(a, "");
            return (HomePageDataViewModel) a;
        }
    }

    static {
        Covode.recordClassIndex(62465);
    }

    /* renamed from: a */
    public final C1213t<Boolean> mo89325a() {
        return (C1213t) this.f121748o.getValue();
    }

    /* renamed from: b */
    public final C1213t<C89386u<Integer, Integer, Intent>> mo89327b() {
        return (C1213t) this.f121749p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$b */
    static final class C52944b extends AbstractC89220m implements AbstractC89171a<C1213t<C89386u<? extends Integer, ? extends Integer, ? extends Intent>>> {

        /* renamed from: a */
        public static final C52944b f121750a = new C52944b();

        static {
            Covode.recordClassIndex(62468);
        }

        C52944b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89386u<? extends Integer, ? extends Integer, ? extends Intent>> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(null);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$c */
    static final class C52945c extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C52945c f121751a = new C52945c();

        static {
            Covode.recordClassIndex(62469);
        }

        C52945c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(null);
            return tVar;
        }
    }

    /* renamed from: c */
    public final String mo89328c() {
        return this.f121742h.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f121735a = null;
        mo89327b().setValue(null);
    }

    /* renamed from: a */
    public final void mo89326a(String str) {
        this.f121742h.setValue(str);
    }
}
