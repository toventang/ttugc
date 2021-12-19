package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3106b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23008e;
import com.p1793c.p1794a.C23758a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.c */
public final class C54067c extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(63742);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.c$a */
    static final class C54068a extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C54068a f123919a = new C54068a();

        static {
            Covode.recordClassIndex(63743);
        }

        C54068a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.l);
            eVar2.f54464c = Float.valueOf(C23758a.m44906a(20));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54067c(ViewGroup viewGroup) {
        super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a5i, viewGroup, false));
        C89219l.m154721d(viewGroup, "");
    }
}
