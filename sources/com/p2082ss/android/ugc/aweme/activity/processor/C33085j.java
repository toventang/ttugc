package com.p2082ss.android.ugc.aweme.activity.processor;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.utils.LanguageService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.j */
public final class C33085j extends AbstractC17350d {

    /* renamed from: d */
    public static final C33085j f78648d = new C33085j();

    private C33085j() {
    }

    static {
        Covode.recordClassIndex(39897);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27649a(Activity activity) {
        C89219l.m154721d(activity, "");
        LanguageService.m138959a().mo123623a(activity);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17350d, com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: b */
    public final void mo27658b(ActivityC17312a aVar, Bundle bundle) {
        C89219l.m154721d(aVar, "");
        super.mo27658b(aVar, bundle);
        LanguageService.m138959a().mo123623a(aVar);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27652a(ActivityC17312a aVar, Configuration configuration) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(configuration, "");
        super.mo27652a(aVar, configuration);
        LanguageService.m138959a().mo123623a(aVar);
    }
}
