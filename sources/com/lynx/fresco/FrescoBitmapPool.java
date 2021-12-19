package com.lynx.fresco;

import android.graphics.Bitmap;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.lynx.p2031a.AbstractC28181a;
import com.lynx.tasm.base.LLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FrescoBitmapPool extends AbstractC28181a {
    private final Map<Bitmap, C24117a<Bitmap>> mReferenceMap = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(34296);
    }

    @Override // com.lynx.p2031a.AbstractC28181a
    public void recycle(Bitmap bitmap) {
        C24117a<Bitmap> aVar;
        if (bitmap != null && (aVar = this.mReferenceMap.get(bitmap)) != null && aVar.mo39700d()) {
            aVar.close();
        }
    }

    @Override // com.lynx.p2031a.AbstractC28181a
    public Bitmap require(int i, int i2, Bitmap.Config config) {
        try {
            C24117a<Bitmap> b = C24428k.m46551a().mo40248f().mo40152b(i, i2, config);
            Bitmap a = b.mo39695a();
            if (a == null) {
                return null;
            }
            this.mReferenceMap.put(a, b);
            return a;
        } catch (Exception e) {
            LLog.m56856a(6, "Image", "maybe oom " + Log.getStackTraceString(e));
            return null;
        }
    }
}
