package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58141c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.t */
public final class C58133t extends AbstractC58131s implements Handler.Callback {

    /* renamed from: a */
    private HandlerC58141c f132391a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132392c;

    static {
        Covode.recordClassIndex(68199);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95597a() {
        this.f132392c = true;
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: b */
    public final void mo95599b() {
        this.f132392c = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.t$a */
    static final class RunnableC58134a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f132393a;

        static {
            Covode.recordClassIndex(68200);
        }

        RunnableC58134a(String str) {
            this.f132393a = str;
        }

        public final void run() {
            C58221f.f132580d.mo95684a(this.f132393a);
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        if (C58221f.f132580d.mo95686a(EnumC58151ae.SPARSE) && !this.f132391a.hasMessages(1202)) {
            this.f132391a.mo95649a(1202, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        String b = C58221f.f132580d.mo95687b(EnumC58151ae.SPARSE);
        if (b != null) {
            C58254p.m105192a(false).execute(new RunnableC58134a(b));
        }
        if (!C58221f.f132580d.mo95686a(EnumC58151ae.SPARSE)) {
            return true;
        }
        this.f132391a.mo95649a(1202, 50);
        return true;
    }
}
