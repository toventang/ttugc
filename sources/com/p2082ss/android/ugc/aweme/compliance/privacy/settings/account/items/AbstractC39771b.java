package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b */
public abstract class AbstractC39771b extends AbstractC39720f {

    /* renamed from: a */
    private final Integer f93637a;

    /* renamed from: b */
    private final Integer f93638b;

    static {
        Covode.recordClassIndex(47501);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f
    /* renamed from: b */
    public final int mo69101b() {
        return R.layout.un;
    }

    /* renamed from: e */
    public abstract C39256o mo69120e();

    /* renamed from: f */
    public abstract int mo69121f();

    /* renamed from: g */
    public Integer mo69122g() {
        return this.f93637a;
    }

    /* renamed from: h */
    public Integer mo69124h() {
        return this.f93638b;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: c */
    public boolean mo69102c() {
        return C39699a.m80581a(mo69120e()).f93535a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: d */
    public boolean mo69103d() {
        return C39699a.m80581a(mo69120e()).f93536b;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b$a */
    static final class C39772a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f93639a;

        static {
            Covode.recordClassIndex(47502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39772a(int i) {
            super(1);
            this.f93639a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f93639a;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public void mo69095a(C39723h hVar, int i) {
        int i2;
        C89219l.m154721d(hVar, "");
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bqp);
        tuxTextCell.setTitle(view.getContext().getString(mo69121f()));
        Integer g = mo69122g();
        if (g != null) {
            tuxTextCell.setSubtitle(view.getContext().getString(g.intValue()));
        }
        Integer h = mo69124h();
        if (h != null) {
            tuxTextCell.setIcon(C23005c.m43393a(new C39772a(h.intValue())));
        }
        tuxTextCell.setCellEnabled(mo69102c());
        C89219l.m154716b(tuxTextCell, "");
        if (mo69103d()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextCell.setVisibility(i2);
    }
}
