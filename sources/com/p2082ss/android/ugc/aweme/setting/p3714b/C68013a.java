package com.p2082ss.android.ugc.aweme.setting.p3714b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.p2386be.C34798f;
import com.p2082ss.android.ugc.aweme.p2727db.C40934c;
import com.p2082ss.android.ugc.aweme.p2727db.C40941f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.b.a */
public final class C68013a {
    static {
        Covode.recordClassIndex(80209);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.b.a$a */
    static final class C68014a extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        final /* synthetic */ View f152363a;

        /* renamed from: b */
        final /* synthetic */ String f152364b;

        static {
            Covode.recordClassIndex(80210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68014a(View view, String str) {
            super(1);
            this.f152363a = view;
            this.f152364b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            C34796d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C34796d.m71048a(dVar2, null, null, null, null, false, this.f152363a, null, null, false, null, false, this.f152364b, false, false, null, false, 0, 128991);
        }
    }

    /* renamed from: a */
    public static final C40941f m120311a(String str, View.OnClickListener onClickListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(onClickListener, "");
        return new C40941f(new C34798f("", false, null, str, null, null, false, false, onClickListener, null, 6134));
    }

    /* renamed from: a */
    public static final void m120312a(C40934c cVar, View view, String str) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(view, "");
        cVar.mo70126a(new C68014a(view, str));
    }
}
