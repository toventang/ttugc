package com.p2082ss.android.ugc.asve.p2212a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2218g.C31101a;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.model.BefTextLayout;
import com.p2082ss.android.vesdk.model.BefTextLayoutResult;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.a.a */
public final class C31013a implements C85346av.AbstractC85361g {
    static {
        Covode.recordClassIndex(37642);
    }

    @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85361g
    /* renamed from: a */
    public final BefTextLayoutResult mo56094a(String str, BefTextLayout befTextLayout) {
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        C31101a aVar = new C31101a(befTextLayout);
        Bitmap a = aVar.mo56520a(str);
        befTextLayoutResult.setBitmap(a);
        befTextLayoutResult.setLineCount(aVar.f74522c);
        C89219l.m154716b(a, "");
        befTextLayoutResult.setHeight(a.getHeight());
        befTextLayoutResult.setWidth(a.getWidth());
        return befTextLayoutResult;
    }
}
