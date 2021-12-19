package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58141c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.u */
public final class C58135u extends AbstractC58137v implements Handler.Callback {

    /* renamed from: a */
    private HandlerC58141c f132394a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132395c;

    static {
        Covode.recordClassIndex(68201);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
        this.f132395c = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final void mo95599b() {
        this.f132395c = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v
    /* renamed from: c */
    public final EnumC58151ae mo95603c() {
        return EnumC58151ae.SPARSE;
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.u$a */
    static final class RunnableC58136a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC58264w f132396a;

        static {
            Covode.recordClassIndex(68202);
        }

        RunnableC58136a(AbstractC58264w wVar) {
            this.f132396a = wVar;
        }

        public final void run() {
            C58221f.f132578b.mo95695b(this.f132396a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        if (C58221f.f132578b.mo95693a(EnumC58151ae.SPARSE) && !this.f132394a.hasMessages(1202)) {
            this.f132394a.mo95649a(1202, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        AbstractC58264w b = C58221f.f132578b.mo95694b(EnumC58151ae.SPARSE);
        if (b != null) {
            C58254p.m105192a(false).execute(new RunnableC58136a(b));
        }
        if (!C58221f.f132578b.mo95693a(EnumC58151ae.SPARSE)) {
            return true;
        }
        this.f132394a.mo95649a(1202, 50);
        return true;
    }
}
