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

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.d */
public final class C58092d extends AbstractC58131s implements Handler.Callback {

    /* renamed from: a */
    public HandlerC58141c f132339a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132340c;

    static {
        Covode.recordClassIndex(68158);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: b */
    public final void mo95599b() {
        this.f132340c = false;
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95597a() {
        this.f132340c = true;
        this.f132339a.mo95649a(1206, 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.d$a */
    static final class RunnableC58093a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58092d f132341a;

        /* renamed from: b */
        final /* synthetic */ String f132342b;

        static {
            Covode.recordClassIndex(68159);
        }

        RunnableC58093a(C58092d dVar, String str) {
            this.f132341a = dVar;
            this.f132342b = str;
        }

        public final void run() {
            C58221f.f132580d.mo95684a(this.f132342b);
            this.f132341a.f132339a.mo95649a(1206, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.d$b */
    static final class RunnableC58094b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58092d f132343a;

        /* renamed from: b */
        final /* synthetic */ AbstractC58264w f132344b;

        static {
            Covode.recordClassIndex(68160);
        }

        RunnableC58094b(C58092d dVar, AbstractC58264w wVar) {
            this.f132343a = dVar;
            this.f132344b = wVar;
        }

        public final void run() {
            C58221f.f132578b.mo95695b(this.f132344b);
            this.f132343a.f132339a.mo95649a(1206, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        if (C58221f.f132580d.mo95686a(EnumC58151ae.APP_BACKGROUND) && this.f132340c) {
            this.f132339a.mo95649a(1206, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        if (!this.f132340c) {
            return true;
        }
        String b = C58221f.f132580d.mo95687b(EnumC58151ae.APP_BACKGROUND);
        if (b != null) {
            C58254p.m105192a(false).execute(new RunnableC58093a(this, b));
        }
        AbstractC58264w b2 = C58221f.f132578b.mo95694b(EnumC58151ae.APP_BACKGROUND);
        if (b2 == null) {
            return true;
        }
        C58254p.m105192a(false).execute(new RunnableC58094b(this, b2));
        return true;
    }
}
