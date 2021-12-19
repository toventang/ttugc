package com.p2082ss.android.ugc.aweme.comment.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.d */
public final class C37299d {

    /* renamed from: a */
    public AbstractC37300a f87973a;

    /* renamed from: b */
    private final View f87974b;

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.d$a */
    public interface AbstractC37300a {
        static {
            Covode.recordClassIndex(44670);
        }

        /* renamed from: a */
        void mo64659a(int i);
    }

    static {
        Covode.recordClassIndex(44669);
    }

    public C37299d(View view) {
        C89219l.m154721d(view, "");
        this.f87974b = view;
    }

    /* renamed from: a */
    public final void mo64894a(int i) {
        this.f87974b.setVisibility(i);
        AbstractC37300a aVar = this.f87973a;
        if (aVar != null) {
            aVar.mo64659a(i);
        }
    }
}
