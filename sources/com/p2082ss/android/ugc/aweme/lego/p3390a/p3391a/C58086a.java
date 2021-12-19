package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.a */
public final class C58086a extends AbstractC58131s {
    static {
        Covode.recordClassIndex(68152);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95597a() {
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: b */
    public final void mo95599b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.a$a */
    static final class RunnableC58087a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f132331a;

        static {
            Covode.recordClassIndex(68153);
        }

        RunnableC58087a(String str) {
            this.f132331a = str;
        }

        public final void run() {
            C58221f.f132580d.mo95684a(this.f132331a);
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        for (String str : C58221f.f132580d.mo95688c(EnumC58151ae.BACKGROUND)) {
            C58254p.m105192a(false).execute(new RunnableC58087a(str));
        }
    }
}
