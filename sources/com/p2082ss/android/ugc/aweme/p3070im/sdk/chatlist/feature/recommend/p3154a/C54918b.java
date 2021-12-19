package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3156b.p3157a.C54919a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.b */
public final class C54918b extends C1445j.AbstractC1451e<C54919a> {
    static {
        Covode.recordClassIndex(64640);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(C54919a aVar, C54919a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return C89219l.m154714a(aVar, aVar2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(C54919a aVar, C54919a aVar2) {
        String str;
        C54919a aVar3 = aVar;
        C54919a aVar4 = aVar2;
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        if (aVar3.f125727a != aVar4.f125727a) {
            return false;
        }
        User user = aVar3.f125728b;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = aVar4.f125728b;
        if (user2 != null) {
            str2 = user2.getUid();
        }
        if (!C89219l.m154714a((Object) str, (Object) str2) || aVar3.f125729c != aVar4.f125729c) {
            return false;
        }
        return true;
    }
}
