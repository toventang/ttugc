package com.bytedance.android.livesdk.envelope.p520a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p592e.C9814a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.envelope.a.c */
public final class C8427c {
    static {
        Covode.recordClassIndex(9272);
    }

    /* renamed from: a */
    public static final C8426b m16639a(C9814a aVar) {
        List<String> urls;
        String str;
        String str2 = "";
        C89219l.m154721d(aVar, str2);
        C8426b bVar = new C8426b();
        bVar.f20849b = aVar.f23830b;
        bVar.f20852e = aVar.f23833e;
        bVar.f20848a = aVar.f23829a;
        bVar.f20850c = aVar.f23831c;
        bVar.f20853f = aVar.f23834f;
        bVar.f20855h = aVar.f23836h;
        bVar.f20854g = aVar.f23835g;
        bVar.f20851d = aVar.f23832d;
        ImageModel imageModel = aVar.f23837i;
        if (!(imageModel == null || (urls = imageModel.getUrls()) == null || (str = urls.get(0)) == null)) {
            str2 = str;
        }
        bVar.f20856i = str2;
        return bVar;
    }
}
