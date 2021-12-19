package com.p2082ss.android.ugc.aweme.p2282ad.dynamic;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33203a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ad.dynamic.a */
public final class C33179a extends AbstractC34952a {

    /* renamed from: a */
    public final C33203a f78838a;

    static {
        Covode.recordClassIndex(39999);
    }

    public C33179a(C33203a aVar) {
        C89219l.m154721d(aVar, "");
        this.f78838a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d("onLoadStart, uri: ".concat(String.valueOf(uri)), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
        C89219l.m154721d("onLoadFail error:" + th + ", uri: " + uri, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        this.f78838a.f78899c = iVar;
        C89219l.m154721d("onLoadUriSuccess, uri: ".concat(String.valueOf(uri)), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d("onLoadParamsSuccess, uri: ".concat(String.valueOf(uri)), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d("onLoadKitInstanceSuccess, uri: ".concat(String.valueOf(uri)), "");
    }
}
