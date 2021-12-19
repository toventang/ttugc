package com.p2082ss.android.ugc.aweme.services;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$photoCanvasGoNext$1 */
final class InternalRecordServiceImpl$photoCanvasGoNext$1 extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {
    final /* synthetic */ ActivityC0945e $activity;
    final /* synthetic */ AbstractC89172b $onFinish;

    static {
        Covode.recordClassIndex(79669);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InternalRecordServiceImpl$photoCanvasGoNext$1(ActivityC0945e eVar, AbstractC89172b bVar) {
        super(1);
        this.$activity = eVar;
        this.$onFinish = bVar;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_InternalRecordServiceImpl$photoCanvasGoNext$1_androidx_lifecycle_VScopeLancet_of */
    public static C1175ad m120111xb3d50608(ActivityC0945e eVar) {
        return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(Boolean bool) {
        invoke(bool);
        return C89391z.f203057a;
    }

    public final void invoke(Boolean bool) {
        AbstractC1174ac a = m120111xb3d50608(this.$activity).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ((ShortVideoContextViewModel) a).mo110050b(false);
        this.$onFinish.invoke(Boolean.valueOf(C89219l.m154714a((Object) bool, (Object) true)));
    }
}
