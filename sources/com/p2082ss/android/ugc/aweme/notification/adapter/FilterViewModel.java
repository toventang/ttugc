package com.p2082ss.android.ugc.aweme.notification.adapter;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.FilterViewModel */
public final class FilterViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f140293a = C89250i.m154773a((AbstractC89171a) C61806b.f140296a);

    /* renamed from: b */
    private final AbstractC89244h f140294b = C89250i.m154773a((AbstractC89171a) C61805a.f140295a);

    static {
        Covode.recordClassIndex(72539);
    }

    /* renamed from: a */
    public final C1213t<Integer> mo99882a() {
        return (C1213t) this.f140293a.getValue();
    }

    /* renamed from: b */
    public final C1213t<C61631f> mo99883b() {
        return (C1213t) this.f140294b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.FilterViewModel$a */
    static final class C61805a extends AbstractC89220m implements AbstractC89171a<C1213t<C61631f>> {

        /* renamed from: a */
        public static final C61805a f140295a = new C61805a();

        static {
            Covode.recordClassIndex(72540);
        }

        C61805a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C61631f> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.FilterViewModel$b */
    static final class C61806b extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C61806b f140296a = new C61806b();

        static {
            Covode.recordClassIndex(72541);
        }

        C61806b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(Integer.valueOf(C61530a.C61532b.m111445a()));
            return tVar;
        }
    }
}
