package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.c */
public final class C54958c extends C1445j.AbstractC1451e<EnumC54957b> {
    static {
        Covode.recordClassIndex(64682);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(EnumC54957b bVar, EnumC54957b bVar2) {
        EnumC54957b bVar3 = bVar;
        EnumC54957b bVar4 = bVar2;
        C89219l.m154721d(bVar3, "");
        C89219l.m154721d(bVar4, "");
        return C89219l.m154714a((Object) bVar3.getNoticeCode(), (Object) bVar4.getNoticeCode());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(EnumC54957b bVar, EnumC54957b bVar2) {
        EnumC54957b bVar3 = bVar;
        EnumC54957b bVar4 = bVar2;
        C89219l.m154721d(bVar3, "");
        C89219l.m154721d(bVar4, "");
        if (bVar3.getButtonText() == bVar4.getButtonText() && bVar3.getDescription() == bVar4.getDescription() && bVar3.getTitle() == bVar4.getTitle()) {
            return true;
        }
        return false;
    }
}
