package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2824c;

import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40533a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45575o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.c.b */
public final class C43468b extends AbstractC43470c {

    /* renamed from: a */
    public static final C43469a f101390a = new C43469a((byte) 0);

    /* renamed from: c */
    private C43420a f101391c;

    static {
        Covode.recordClassIndex(51697);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.c.b$a */
    public static final class C43469a {
        static {
            Covode.recordClassIndex(51698);
        }

        private C43469a() {
        }

        public /* synthetic */ C43469a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2824c.AbstractC43470c
    /* renamed from: a */
    public final void mo73988a() {
        C43420a aVar = this.f101391c;
        if (aVar != null) {
            aVar.mo73976g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2824c.AbstractC43470c
    /* renamed from: b */
    public final void mo73990b() {
        C43420a aVar = this.f101391c;
        if (aVar != null) {
            aVar.mo73977h();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43468b(AddressEditActivity addressEditActivity) {
        super(addressEditActivity);
        C89219l.m154721d(addressEditActivity, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m
    /* renamed from: a */
    public final void mo73991a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        C43420a aVar2 = this.f101391c;
        if (aVar2 != null) {
            aVar2.mo73974e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2824c.AbstractC43470c
    /* renamed from: a */
    public final void mo73989a(Bundle bundle) {
        ((AbstractC43470c) this).f101392b.setContentView(R.layout.nv);
        C45575o.m88124a(((AbstractC43470c) this).f101392b.getWindow());
        new C40533a(((AbstractC43470c) this).f101392b);
        C43420a aVar = null;
        if (bundle != null) {
            Fragment a = ((AbstractC43470c) this).f101392b.getSupportFragmentManager().mo3551a("address_edit_fragment");
            if (a instanceof C43420a) {
                aVar = a;
            }
            this.f101391c = aVar;
            return;
        }
        AddressPageStarter.AddressEditEnterParams a2 = AddressPageStarter.AddressEditEnterParams.C43333a.m86451a(((AbstractC43470c) this).f101392b.getIntent());
        if (a2 != null) {
            aVar = new C43420a();
            aVar.mo73970a(a2);
        }
        this.f101391c = aVar;
        if (aVar != null) {
            AbstractC0976n a3 = ((AbstractC43470c) this).f101392b.getSupportFragmentManager().mo3552a();
            RelativeLayout relativeLayout = (RelativeLayout) ((AbstractC43470c) this).f101392b._$_findCachedViewById(R.id.acf);
            C89219l.m154716b(relativeLayout, "");
            a3.mo3454a(relativeLayout.getId(), aVar, "address_edit_fragment").mo3473c();
        }
    }
}
