package com.p2082ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.awemelobby.C12907a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.internal.C20916c;
import com.bytedance.lobby.internal.LobbyCore;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.LobbyInitTask */
public final class LobbyInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68734);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154719c(context, "");
        C12907a.C12908a aVar = new C12907a.C12908a();
        C20916c.C20917a.C20918a aVar2 = new C20916c.C20917a.C20918a();
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        aVar2.f49468a = applicationContext;
        aVar2.f49469b = C12907a.f31426a;
        aVar2.f49470c = aVar;
        int i = 0;
        LobbyCore.initialize(new C20916c.C20917a(aVar2, (byte) 0));
        if (C12907a.f31426a) {
            StringBuilder sb = new StringBuilder();
            for (T t : aVar.mo20735b()) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(t2.f49402b);
                i = i2;
            }
            C89219l.m154709a((Object) sb.toString(), "");
            aVar.mo20735b().size();
        }
    }
}
