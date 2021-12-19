package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1121b.p1123b.C16106a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.C61402j;
import com.p2082ss.android.ugc.aweme.net.C61414l;
import com.p2082ss.android.ugc.aweme.net.NetworkInitTask;
import com.p2082ss.android.ugc.aweme.net.p3493f.C61350f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask */
public final class InitTTNetTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C58356a f132870a = new C58356a((byte) 0);

    static {
        Covode.recordClassIndex(68500);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask$a */
    public static final class C58356a {
        static {
            Covode.recordClassIndex(68501);
        }

        private C58356a() {
        }

        public /* synthetic */ C58356a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask$b */
    public static final class C58357b extends C61414l.AbstractC61415a {
        static {
            Covode.recordClassIndex(68502);
        }

        C58357b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.net.C61414l.AbstractC61415a
        /* renamed from: a */
        public final void mo95744a() {
            C61402j.m111178a().mo28818a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
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
    /* renamed from: j */
    public final List<AbstractC58252n> mo28610j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NetworkInitTask());
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C49710k.f114401i = true;
        C58945a.C58947b.f134185a.mo96425a("method_init_ttnet_duration", false);
        C16106a.f38794a = new C61350f(C17867d.m33078a());
        C61414l.AbstractC61415a.f139445a = new C58357b();
        C58945a.C58947b.f134185a.mo96429b("method_init_ttnet_duration", false);
    }
}
