package com.lynx.tasm.p2062ui.image;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24028g;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.lynx.tasm.ui.image.k */
public final class C28910k implements AbstractC24641d {

    /* renamed from: a */
    private final List<AbstractC24641d> f68328a;

    static {
        Covode.recordClassIndex(35033);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        for (AbstractC24641d dVar : this.f68328a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(dVar.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final AbstractC24026e getPostprocessorCacheKey() {
        LinkedList linkedList = new LinkedList();
        for (AbstractC24641d dVar : this.f68328a) {
            linkedList.push(dVar.getPostprocessorCacheKey());
        }
        return new C24028g(linkedList);
    }

    private C28910k(List<AbstractC24641d> list) {
        this.f68328a = new LinkedList(list);
    }

    /* renamed from: a */
    public static AbstractC24641d m57905a(List<AbstractC24641d> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            return new C28910k(list);
        }
        return list.get(0);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
        Bitmap bitmap2;
        C24117a<Bitmap> aVar = null;
        try {
            C24117a aVar2 = null;
            for (AbstractC24641d dVar : this.f68328a) {
                if (aVar2 != null) {
                    bitmap2 = (Bitmap) aVar2.mo39695a();
                } else {
                    bitmap2 = bitmap;
                }
                aVar = dVar.process(bitmap2, fVar);
                C24117a.m45712c(aVar2);
                aVar2 = C24117a.m45711b(aVar);
            }
            C24117a<Bitmap> b = C24117a.m45711b(aVar);
            C24117a.m45712c(aVar);
            return b;
        } catch (Throwable th) {
            C24117a.m45712c(null);
            throw th;
        }
    }
}
