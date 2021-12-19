package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import java.io.File;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.e */
final /* synthetic */ class CallableC71998e implements Callable {

    /* renamed from: a */
    private final C71993c f161350a;

    /* renamed from: b */
    private final AbstractC88434g f161351b;

    /* renamed from: c */
    private final String f161352c;

    static {
        Covode.recordClassIndex(84638);
    }

    CallableC71998e(C71993c cVar, AbstractC88434g gVar, String str) {
        this.f161350a = cVar;
        this.f161351b = gVar;
        this.f161352c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C71993c cVar = this.f161350a;
        AbstractC88434g gVar = this.f161351b;
        String str = this.f161352c;
        Bitmap a = cVar.mo114166a();
        if (a == null) {
            return null;
        }
        if (gVar != null) {
            a = (Bitmap) gVar.apply(a);
        }
        C84891c.m145848a(a, new File(str), 60, Bitmap.CompressFormat.PNG);
        C84891c.m145846a(a);
        return null;
    }
}
