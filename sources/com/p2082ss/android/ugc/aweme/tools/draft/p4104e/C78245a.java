package com.p2082ss.android.ugc.aweme.tools.draft.p4104e;

import android.app.ProgressDialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.e.a */
public final class C78245a {

    /* renamed from: a */
    public static final C78245a f175744a = new C78245a();

    private C78245a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.e.a$a */
    public static final class C78246a implements ProgressDialogC81146b.AbstractC81149c {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f175745a;

        static {
            Covode.recordClassIndex(91361);
        }

        @Override // com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b.AbstractC81149c
        /* renamed from: a */
        public final void mo113366a() {
            this.f175745a.invoke();
        }

        C78246a(AbstractC89171a aVar) {
            this.f175745a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(91360);
    }

    /* renamed from: a */
    public static ProgressDialog m136731a(Context context, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        return ProgressDialogC81146b.C81148b.m140903a(context, ProgressDialogC81146b.EnumC81147a.VISIBLE_AFTER_5S, new C78246a(aVar));
    }
}
