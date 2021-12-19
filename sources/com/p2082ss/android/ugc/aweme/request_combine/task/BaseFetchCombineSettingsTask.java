package com.p2082ss.android.ugc.aweme.request_combine.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.request_combine.p3675a.C67117a;
import com.p2082ss.android.ugc.aweme.request_combine.p3676b.C67119a;
import com.p2082ss.android.ugc.aweme.request_combine.p3676b.EnumC67120b;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67129a;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67131b;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67132c;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67135d;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67136e;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67144f;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3679b.C67147a;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3679b.C67148b;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3679b.C67149c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.task.BaseFetchCombineSettingsTask */
public abstract class BaseFetchCombineSettingsTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(78779);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public int bQ_() {
        return 1048575;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        C67119a.m118771a(EnumC67120b.FETCH_COMBINE_TASK_RUN);
        if (C16105a.m29906a(context)) {
            C51423a.m95787a("FetchCombineSettingsTask");
            if (C67117a.m118770a()) {
                C67119a.m118771a(EnumC67120b.USE_SETTINGS_COMBINE_API);
                new C58221f.C58223b().mo95701b((AbstractC58259r) new C67149c()).mo95706a();
                return;
            }
            C58221f.C58225d e = C58221f.m105153e();
            if (C16083j.m29874a().mo25538c()) {
                e.mo95704a(new C67136e());
            } else {
                e.mo95704a(new C67148b()).mo95704a(new C67147a());
            }
            e.mo95704a(new C67135d()).mo95704a(new C67144f()).mo95704a(new C67132c()).mo95704a(new C67131b()).mo95704a(new C67129a(EnumC58147aa.IDLE)).mo95706a();
        }
    }
}
