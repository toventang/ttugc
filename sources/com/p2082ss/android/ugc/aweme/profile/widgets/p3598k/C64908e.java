package com.p2082ss.android.ugc.aweme.profile.widgets.p3598k;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.profile.C63420af;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.e */
public final class C64908e extends AbstractC12769a {

    /* renamed from: j */
    private TextView f146726j;

    static {
        Covode.recordClassIndex(76375);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.e$b */
    static final class C64910b extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64908e f146728a;

        static {
            Covode.recordClassIndex(76377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64910b(C64908e eVar) {
            super(1);
            this.f146728a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            this.f146728a.mo104260a("");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.e$a */
    static final class C64909a extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64908e f146727a;

        static {
            Covode.recordClassIndex(76376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64909a(C64908e eVar) {
            super(1);
            this.f146727a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || t.isBlock)) {
                C64908e eVar = this.f146727a;
                t.getFollowStatus();
                eVar.mo104260a(t.getSignature());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo104260a(String str) {
        User user;
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f146726j;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            user = iVar.f146329a;
        } else {
            user = null;
        }
        TextView textView2 = this.f146726j;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (C80580in.m139694g(user) && C80580in.m139687c()) {
            TextView textView3 = this.f146726j;
            if (textView3 != null) {
                textView3.setText(R.string.fxt);
            }
        } else if (this.f31048h) {
            C63420af.m114998a(this.f146726j, str);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        this.f146726j = (TextView) view.findViewById(R.id.fa9);
        if (C80580in.m139687c()) {
            C34729o.m70956a(false, this.f146726j);
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64911f.f146729a, new C64909a(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64912g.f146730a, new C64910b(this));
    }
}
