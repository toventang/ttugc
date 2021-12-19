package com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.C51781e;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM;
import com.p2082ss.android.ugc.aweme.friends.widget.p3023a.C51759a;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.a.c */
public final class C51774c extends AbstractC51771a<C51781e> {

    /* renamed from: e */
    public final AbstractC51538a f119331e;

    static {
        Covode.recordClassIndex(61139);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a
    /* renamed from: c */
    public final void mo87502c() {
        this.f119331e.mo87041b();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a
    /* renamed from: b */
    public final void mo87500b() {
        boolean z;
        this.f119331e.mo87037a();
        ContactVM a = mo87497a();
        T t = this.f119325b;
        if (t == null) {
            C89219l.m154710a("data");
        }
        C51781e eVar = (C51781e) t;
        C89219l.m154721d(eVar, "");
        if (!a.f119362a.contains(Integer.valueOf(eVar.hashCode()))) {
            a.f119362a.add(Integer.valueOf(eVar.hashCode()));
            int a2 = a.mo87521a(eVar);
            if (eVar.f119341b.getPhotoUri() != null) {
                z = true;
            } else {
                z = false;
            }
            C39162r.m79452a().execute(new ContactVM.RunnableC51797b(a, C51759a.m96435a(z), a2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51774c(AbstractC51538a aVar) {
        super((View) aVar);
        C89219l.m154721d(aVar, "");
        this.f119331e = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a
    /* renamed from: b */
    public final void mo87501b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo87501b(bVar);
        this.f119331e.mo87040a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.friends.widget.contact.a] */
    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a
    /* renamed from: a */
    public final /* synthetic */ void mo87498a(C51781e eVar) {
        C51781e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        this.f119331e.mo87039a(eVar2.f119341b);
        this.f119331e.setOutClickListener(new C51775a(this, eVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.a.c$a */
    static final class C51775a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51774c f119332a;

        /* renamed from: b */
        final /* synthetic */ C51781e f119333b;

        static {
            Covode.recordClassIndex(61140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51775a(C51774c cVar, C51781e eVar) {
            super(1);
            this.f119332a = cVar;
            this.f119333b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            boolean z;
            String str2 = str;
            C89219l.m154721d(str2, "");
            C56407f.m102373a(C517761.f119334a);
            ContactVM a = this.f119332a.mo87497a();
            C51781e eVar = this.f119333b;
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(str2, "");
            String valueOf = String.valueOf(a.mo87521a(eVar));
            if (eVar.f119341b.getPhotoUri() != null) {
                z = true;
            } else {
                z = false;
            }
            C39162r.m79452a().execute(new ContactVM.RunnableC51796a(a, C51759a.m96435a(z), valueOf, str2));
            return C89391z.f203057a;
        }
    }
}
