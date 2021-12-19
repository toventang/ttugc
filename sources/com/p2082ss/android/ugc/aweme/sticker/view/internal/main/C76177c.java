package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76243a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.c */
public final class C76177c implements AbstractC76115b<C84984j, Fragment> {

    /* renamed from: a */
    private final HashMap<String, AbstractC76114a<C84984j, Fragment>> f171135a;

    /* renamed from: b */
    private final AbstractC89244h f171136b;

    static {
        Covode.recordClassIndex(89127);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.c$a */
    static final class C76178a extends AbstractC89220m implements AbstractC89171a<AbstractC76114a<? extends C84984j, ? extends Fragment>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76114a f171137a = null;

        static {
            Covode.recordClassIndex(89128);
        }

        C76178a(AbstractC76114a aVar) {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76114a<? extends C84984j, ? extends Fragment> invoke() {
            AbstractC76114a aVar = this.f171137a;
            if (aVar == null) {
                return new C76243a();
            }
            return aVar;
        }
    }

    private C76177c() {
        this.f171135a = new HashMap<>();
        this.f171136b = C89250i.m154773a((AbstractC89171a) new C76178a(null));
    }

    public /* synthetic */ C76177c(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b
    /* renamed from: a */
    public final AbstractC76114a<C84984j, Fragment> mo119858a(String str) {
        AbstractC76114a<C84984j, Fragment> aVar = this.f171135a.get(str);
        if (aVar == null) {
            return (AbstractC76114a) this.f171136b.getValue();
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo119931a(String str, AbstractC76114a<C84984j, ? extends Fragment> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f171135a.put(str, aVar);
    }
}
