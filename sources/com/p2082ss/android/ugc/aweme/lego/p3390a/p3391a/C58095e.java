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

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.e */
public final class C58095e extends AbstractC58137v implements Handler.Callback {

    /* renamed from: a */
    public HandlerC58141c f132345a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132346c;

    static {
        Covode.recordClassIndex(68161);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final void mo95599b() {
        this.f132346c = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v
    /* renamed from: c */
    public final EnumC58151ae mo95603c() {
        return EnumC58151ae.APP_BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
        this.f132346c = true;
        this.f132345a.mo95649a(1206, 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.e$a */
    static final class RunnableC58096a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58095e f132347a;

        /* renamed from: b */
        final /* synthetic */ String f132348b;

        static {
            Covode.recordClassIndex(68162);
        }

        RunnableC58096a(C58095e eVar, String str) {
            this.f132347a = eVar;
            this.f132348b = str;
        }

        public final void run() {
            C58221f.f132580d.mo95684a(this.f132348b);
            this.f132347a.f132345a.mo95649a(1206, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.e$b */
    static final class RunnableC58097b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58095e f132349a;

        /* renamed from: b */
        final /* synthetic */ AbstractC58264w f132350b;

        static {
            Covode.recordClassIndex(68163);
        }

        RunnableC58097b(C58095e eVar, AbstractC58264w wVar) {
            this.f132349a = eVar;
            this.f132350b = wVar;
        }

        public final void run() {
            C58221f.f132578b.mo95695b(this.f132350b);
            this.f132349a.f132345a.mo95649a(1206, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        if (C58221f.f132578b.mo95693a(EnumC58151ae.APP_BACKGROUND) && this.f132346c) {
            this.f132345a.mo95649a(1206, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        if (!this.f132346c) {
            return true;
        }
        String b = C58221f.f132580d.mo95687b(EnumC58151ae.APP_BACKGROUND);
        if (b != null) {
            C58254p.m105192a(false).execute(new RunnableC58096a(this, b));
        }
        AbstractC58264w b2 = C58221f.f132578b.mo95694b(EnumC58151ae.APP_BACKGROUND);
        if (b2 == null) {
            return true;
        }
        C58254p.m105192a(false).execute(new RunnableC58097b(this, b2));
        return true;
    }
}
