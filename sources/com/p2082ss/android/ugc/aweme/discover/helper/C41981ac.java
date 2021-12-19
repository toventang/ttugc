package com.p2082ss.android.ugc.aweme.discover.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42024k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ac */
public final class C41981ac implements AbstractC42024k {

    /* renamed from: a */
    private final AbstractC89244h f97907a;

    /* renamed from: b */
    private final AbstractC89244h f97908b = C89250i.m154773a((AbstractC89171a) C41982a.f97909a);

    static {
        Covode.recordClassIndex(49911);
    }

    /* renamed from: a */
    private final ConstraintLayout m84045a() {
        return (ConstraintLayout) this.f97907a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.ac$a */
    static final class C41982a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41982a f97909a = new C41982a();

        static {
            Covode.recordClassIndex(49912);
        }

        C41982a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("trending_sounds_rank_num", 12) - 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.ac$b */
    static final class C41983b extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42024k.C42026b f97910a;

        static {
            Covode.recordClassIndex(49913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41983b(AbstractC42024k.C42026b bVar) {
            super(0);
            this.f97910a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            View a = C1764a.m5927a(LayoutInflater.from(this.f97910a.f97980a.getContext()), R.layout.awg, this.f97910a.f97980a, false);
            if (!(a instanceof ConstraintLayout)) {
                return null;
            }
            return a;
        }
    }

    public C41981ac(AbstractC42024k.C42026b bVar) {
        C89219l.m154721d(bVar, "");
        this.f97907a = C89250i.m154773a((AbstractC89171a) new C41983b(bVar));
        ConstraintLayout a = m84045a();
        if (a != null && bVar.f97981b.invoke(a).intValue() == 1) {
            a.findViewById(R.id.s9).setBackgroundResource(R.drawable.bcf);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42024k
    /* renamed from: a */
    public final void mo71152a(AbstractC42024k.C42025a aVar) {
        C89219l.m154721d(aVar, "");
        ConstraintLayout a = m84045a();
        if (a != null) {
            int intValue = ((Number) this.f97908b.getValue()).intValue();
            int i = aVar.f97979a;
            if (i >= 0 && intValue >= i) {
                a.setVisibility(0);
                View findViewById = a.findViewById(R.id.ap6);
                C89219l.m154716b(findViewById, "");
                ((TextView) findViewById).setText(String.valueOf(aVar.f97979a + 1));
                return;
            }
            a.setVisibility(8);
        }
    }
}
