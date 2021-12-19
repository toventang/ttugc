package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.e */
public final class C39893e extends AbstractC39896f {
    static {
        Covode.recordClassIndex(47634);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.e$a */
    static final class C39894a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39893e f93853a;

        static {
            Covode.recordClassIndex(47635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39894a(C39893e eVar) {
            super(0);
            this.f93853a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean invoke;
            AbstractC89172b<? super Integer, Boolean> bVar = this.f93853a.f93855a.f93876n;
            if (bVar == null || (invoke = bVar.invoke(Integer.valueOf(this.f93853a.f93855a.f93869g))) == null) {
                z = false;
            } else {
                z = invoke.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39893e(C39901g gVar) {
        super(gVar);
        C89219l.m154721d(gVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39896f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69153a(com.bytedance.tux.table.cell.TuxTextCell r7) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.C39893e.mo69153a(com.bytedance.tux.table.cell.TuxTextCell):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.e$b */
    static final class C39895b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C39893e f93854a;

        static {
            Covode.recordClassIndex(47636);
        }

        C39895b(C39893e eVar) {
            this.f93854a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AbstractC89172b<? super Integer, C89391z> bVar = this.f93854a.f93855a.f93874l;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(this.f93854a.f93855a.f93869g));
            }
        }
    }
}
