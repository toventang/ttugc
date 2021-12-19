package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58194f;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.EnumC58085a;
import com.p2082ss.android.ugc.aweme.lego.p3390a.EnumC58145f;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58141c;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58143e;
import com.p2082ss.android.ugc.p4260e.AbstractC81916a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.f */
public final class C58098f extends AbstractC58131s implements Handler.Callback {

    /* renamed from: a */
    private HandlerC58141c f132351a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132352c;

    static {
        Covode.recordClassIndex(68164);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: b */
    public final void mo95599b() {
        this.f132352c = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.f$a */
    static final class RunnableC58099a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f132353a;

        static {
            Covode.recordClassIndex(68165);
        }

        RunnableC58099a(String str) {
            this.f132353a = str;
        }

        public final void run() {
            C58221f.f132580d.mo95684a(this.f132353a);
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95597a() {
        this.f132352c = true;
        if (C58140b.f132399a == EnumC58085a.COLD_BOOT_BEGIN) {
            C58140b.f132399a = EnumC58085a.COLD_BOOT_END;
            AbstractC58194f fVar = C58221f.f132587k;
            if (fVar != null) {
                fVar.mo60052a(EnumC58145f.COLD_BOOT_END);
            }
            HandlerC58143e.f132402b.mo95649a(1207, 1000);
            HandlerC58143e.f132402b.mo95649a(1208, 5000);
            AbstractC81916a aVar = C58221f.f132588l.get(EnumC58150ad.REQUEST_SPARSE);
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo95597a();
            AbstractC81916a aVar2 = C58221f.f132588l.get(EnumC58150ad.REQUEST_IDLE);
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.mo95597a();
        }
        if (C58140b.f132399a == EnumC58085a.HOT_BOOT_BEGIN) {
            C58140b.f132399a = EnumC58085a.HOT_BOOT_END;
            AbstractC81916a aVar3 = C58221f.f132588l.get(EnumC58150ad.REQUEST_SPARSE);
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            aVar3.mo95597a();
            AbstractC81916a aVar4 = C58221f.f132588l.get(EnumC58150ad.REQUEST_IDLE);
            if (aVar4 == null) {
                C89219l.m154715b();
            }
            aVar4.mo95597a();
        }
        this.f132351a.mo95649a(1201, 1000);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        String b = C58221f.f132580d.mo95687b(EnumC58151ae.BOOT_FINISH);
        if (b != null) {
            C58254p.m105192a(false).execute(new RunnableC58099a(b));
        }
        if (!C58221f.f132580d.mo95686a(EnumC58151ae.BOOT_FINISH)) {
            return true;
        }
        this.f132351a.mo95649a(1201, 50);
        return true;
    }
}
