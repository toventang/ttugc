package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24248c;
import com.facebook.imagepipeline.p1891p.C24644b;

/* renamed from: com.facebook.drawee.view.d */
public class C24263d extends C24262c<C24246a> {
    static {
        Covode.recordClassIndex(28395);
    }

    public C24263d(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public C24263d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        C24644b.m47156a();
        C24644b.m47156a();
        C24247b a = C24248c.m46051a(new C24247b(context.getResources()), context, attributeSet);
        C24644b.m47156a();
        setAspectRatio(a.f57480e);
        setHierarchy(a.mo39973a());
        C24644b.m47156a();
    }

    public C24263d(Context context, C24246a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    public C24263d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    public C24263d(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
