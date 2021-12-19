package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.h */
public final class C39906h extends AbstractC39896f {
    static {
        Covode.recordClassIndex(47650);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.h$a */
    static final class C39907a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23293c.C23309j f93879a;

        /* renamed from: b */
        final /* synthetic */ C39906h f93880b;

        static {
            Covode.recordClassIndex(47651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39907a(AbstractC23293c.C23309j jVar, C39906h hVar) {
            super(0);
            this.f93879a = jVar;
            this.f93880b = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            int i;
            boolean z;
            Boolean invoke;
            if (!this.f93879a.mo37960g()) {
                i = this.f93880b.f93855a.f93869g;
            } else {
                i = this.f93880b.f93855a.f93870h;
            }
            AbstractC89172b<? super Integer, Boolean> bVar = this.f93880b.f93855a.f93876n;
            if (bVar == null || (invoke = bVar.invoke(Integer.valueOf(i))) == null) {
                z = false;
            } else {
                z = invoke.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39906h(C39901g gVar) {
        super(gVar);
        C89219l.m154721d(gVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39896f
    /* renamed from: a */
    public final void mo69153a(TuxTextCell tuxTextCell) {
        Boolean bool;
        C89219l.m154721d(tuxTextCell, "");
        if (!(tuxTextCell.getAccessory() instanceof AbstractC23293c.C23309j)) {
            Context context = tuxTextCell.getContext();
            C89219l.m154716b(context, "");
            tuxTextCell.setAccessory(new AbstractC23293c.C23309j(context));
        }
        C1213t<Boolean> tVar = this.f93855a.f93872j;
        Integer num = null;
        if (tVar != null) {
            bool = tVar.getValue();
        } else {
            bool = null;
        }
        boolean z = true;
        tuxTextCell.setLoading(C89219l.m154714a((Object) bool, (Object) true));
        AbstractC23293c.AbstractC23296b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AbstractC23293c.C23309j jVar = (AbstractC23293c.C23309j) accessory;
        C1213t<Integer> tVar2 = this.f93855a.f93871i;
        if (tVar2 != null) {
            num = tVar2.getValue();
        }
        int i = this.f93855a.f93869g;
        if (num == null || num.intValue() != i) {
            z = false;
        }
        jVar.mo37959c(z);
        jVar.f55218a = this.f93855a.f93875m;
        jVar.mo37958a(new C39907a(jVar, this));
        jVar.mo37957a(new C39908b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.h$b */
    static final class C39908b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C39906h f93881a;

        static {
            Covode.recordClassIndex(47652);
        }

        C39908b(C39906h hVar) {
            this.f93881a = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            AbstractC89172b<? super Integer, C89391z> bVar = this.f93881a.f93855a.f93874l;
            if (bVar != null) {
                if (z) {
                    i = this.f93881a.f93855a.f93869g;
                } else {
                    i = this.f93881a.f93855a.f93870h;
                }
                bVar.invoke(Integer.valueOf(i));
            }
        }
    }
}
