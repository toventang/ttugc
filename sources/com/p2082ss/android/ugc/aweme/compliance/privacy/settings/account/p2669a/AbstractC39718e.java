package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a;

import android.content.Context;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e */
public abstract class AbstractC39718e extends AbstractC39713b implements AbstractC1204m {

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.e$a */
    public interface AbstractC39719a {
        static {
            Covode.recordClassIndex(47446);
        }

        /* renamed from: a */
        void mo69100a(AbstractC39718e eVar);
    }

    static {
        Covode.recordClassIndex(47445);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC39718e(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b
    /* renamed from: a */
    public final void mo69093a(AbstractC39714c cVar) {
        C89219l.m154721d(cVar, "");
        super.mo69093a(cVar);
        if (cVar instanceof AbstractC39719a) {
            ((AbstractC39719a) cVar).mo69100a(this);
        }
    }
}
