package com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.facebook.imageutils.C24658b;
import com.p2082ss.android.ugc.aweme.application.C33914o;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter */
public final class FrescoSoLoadSetter implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68697);
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
        C24658b.f58579a = C58440a.f133057a;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter$a */
    static final class C58440a implements C24658b.AbstractC24659a {

        /* renamed from: a */
        public static final C58440a f133057a = new C58440a();

        static {
            Covode.recordClassIndex(68698);
        }

        C58440a() {
        }

        @Override // com.facebook.imageutils.C24658b.AbstractC24659a
        /* renamed from: a */
        public final void mo34256a(String str) {
            if (C33914o.f80220b.get(str) == null) {
                Librarian.m38964a(str, false, (Context) null);
            }
        }
    }
}
