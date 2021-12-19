package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1469l.C20688a;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20693c;
import com.facebook.common.p1830b.C24074i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.C24161f;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.u */
public final class C58704u implements AbstractC11803e {
    static {
        Covode.recordClassIndex(69006);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e
    /* renamed from: a */
    public final String mo18863a(ImageModel imageModel) {
        List<String> urls;
        if (!(imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty())) {
            int size = urls.size();
            for (int i = 0; i < size; i++) {
                if (C34577e.m70603a(Uri.parse(urls.get(i)))) {
                    return C34577e.m70588a(urls.get(i));
                }
            }
        }
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e
    /* renamed from: a */
    public final AbstractC11803e.C11804a mo18862a(ImageModel imageModel, final AbstractC11803e.AbstractC11805b bVar) {
        C24636b[] bVarArr;
        C587051 r6 = new AbstractC24435b() {
            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58704u.C587051 */

            static {
                Covode.recordClassIndex(69007);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            }

            @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
            /* renamed from: a */
            public final void mo9033a(Bitmap bitmap) {
                bVar.mo8986a(bitmap);
            }
        };
        if (!(imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0)) {
            ArrayList arrayList = new ArrayList();
            for (String str : imageModel.getUrls()) {
                if (!C13627m.m24498a(str)) {
                    C24639c a = C24639c.m47149a(Uri.parse(str));
                    ((AbstractC20693c) C20688a.m13435a(AbstractC20693c.class)).mo34107a(a);
                    arrayList.add(a.mo40483a());
                }
            }
            if (!(arrayList.size() == 0 || (bVarArr = (C24636b[]) arrayList.toArray(new C24636b[arrayList.size()])) == null || bVarArr.length == 0)) {
                ArrayList arrayList2 = new ArrayList();
                for (C24636b bVar2 : bVarArr) {
                    if (bVar2 != null) {
                        arrayList2.add(C24428k.m46551a().mo40247e().mo40223a(bVar2, C24636b.EnumC24638b.FULL_FETCH));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C24161f.m45794a(arrayList2).mo34217b().mo39739a(r6, C24074i.m45587b());
                }
            }
        }
        return null;
    }
}
