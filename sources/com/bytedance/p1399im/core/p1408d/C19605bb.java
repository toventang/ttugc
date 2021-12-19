package com.bytedance.p1399im.core.p1408d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.p1404a.C19483d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.d.bb */
public final class C19605bb {

    /* renamed from: a */
    public final int f46582a = 1;

    /* renamed from: b */
    public long f46583b = 3000;

    /* renamed from: c */
    public List<C19538ai> f46584c = new ArrayList();

    /* renamed from: d */
    public final Handler f46585d;

    /* renamed from: e */
    public final String f46586e;

    /* renamed from: f */
    public boolean f46587f;

    static {
        Covode.recordClassIndex(22449);
    }

    /* renamed from: a */
    public final void mo31386a() {
        C19483d a = C19483d.m36365a();
        C89219l.m154709a((Object) a, "");
        if (a.mo31141b().f46228aJ && this.f46587f) {
            C19631f.m36668a(C89070n.m154516a(this.f46586e), "message_model");
        }
    }

    /* renamed from: a */
    public final void mo31387a(List<C19538ai> list) {
        C89219l.m154719c(list, "");
        this.f46584c = list;
    }

    /* renamed from: com.bytedance.im.core.d.bb$a */
    public static final class HandlerC19606a extends Handler {

        /* renamed from: a */
        final /* synthetic */ C19605bb f46588a;

        static {
            Covode.recordClassIndex(22450);
        }

        public final void handleMessage(Message message) {
            C89219l.m154719c(message, "");
            if (message.what == this.f46588a.f46582a) {
                C19605bb bbVar = this.f46588a;
                long j = 0;
                for (C19538ai aiVar : bbVar.f46584c) {
                    if (aiVar.isSelf() && aiVar.getIndex() > j) {
                        j = aiVar.getIndex();
                    }
                }
                String str = bbVar.f46586e;
                C89219l.m154719c(str, "");
                HashMap<Long, C19589ao> hashMap = C19631f.f46654b.get(str);
                boolean z = true;
                if (hashMap != null) {
                    Iterator<C19589ao> it = hashMap.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        C19589ao next = it.next();
                        C89219l.m154709a((Object) next, "");
                        if (next.f46508d < j) {
                            break;
                        }
                    }
                }
                C20002j.m37778a(" ConvReadInfoHelperSingleConReadInfoHelper cid = " + this.f46588a.f46586e + " shouldQueryMsg = " + z);
                if (z) {
                    this.f46588a.mo31386a();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC19606a(C19605bb bbVar, Looper looper) {
            super(looper);
            this.f46588a = bbVar;
        }
    }

    public C19605bb(String str, boolean z) {
        C89219l.m154719c(str, "");
        this.f46586e = str;
        this.f46587f = z;
        mo31386a();
        this.f46585d = new HandlerC19606a(this, Looper.getMainLooper());
    }
}
