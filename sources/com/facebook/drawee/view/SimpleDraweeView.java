package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24206g;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.p2082ss.android.ugc.trill.R;

public class SimpleDraweeView extends C24263d {
    private static AbstractC24093k<? extends AbstractC24198b> sDraweecontrollerbuildersupplier;
    private static AbstractC24206g sIDraweecontrollerbuildersupplier;
    private AbstractC24198b mControllerBuilder;

    static {
        Covode.recordClassIndex(28390);
    }

    public static void shutDown() {
        sDraweecontrollerbuildersupplier = null;
    }

    /* access modifiers changed from: protected */
    public AbstractC24198b getControllerBuilder() {
        return this.mControllerBuilder;
    }

    public static void initialize(AbstractC24093k<? extends AbstractC24198b> kVar) {
        sDraweecontrollerbuildersupplier = kVar;
    }

    @Override // com.facebook.drawee.view.C24262c
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        init(context, null);
    }

    public static void initialize(AbstractC24206g gVar) {
        sIDraweecontrollerbuildersupplier = gVar;
    }

    public void setActualImageResource(int i) {
        setActualImageResource(i, null);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.facebook.imagepipeline.o.b */
    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(C24636b bVar) {
        AbstractC24198b bVar2 = this.mControllerBuilder;
        bVar2.f57299c = bVar;
        bVar2.f57309m = getController();
        setController(bVar2.mo39827e());
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public void setActualImageResource(int i, Object obj) {
        setImageURI(C24134g.m45734a(i), obj);
    }

    public void setImageURI(Uri uri, Object obj) {
        AbstractC24198b bVar = this.mControllerBuilder;
        bVar.f57298b = obj;
        setController(bVar.mo39799b(uri).mo39824a(getController()).mo39827e());
    }

    public void setImageURI(String str, Object obj) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setImageURI(uri, obj);
    }

    public SimpleDraweeView(Context context, C24246a aVar) {
        super(context, aVar);
        init(context, null);
    }

    /* JADX INFO: finally extract failed */
    private void init(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            C24644b.m47156a();
            if (isInEditMode()) {
                ((C24246a) getHierarchy()).mo39959a((C24250e) null);
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                if (sDraweecontrollerbuildersupplier == null) {
                    C24091i.m45618a(sIDraweecontrollerbuildersupplier.mo39777a(), "SimpleDraweeView was not initialized!");
                    sDraweecontrollerbuildersupplier = sIDraweecontrollerbuildersupplier.mo39777a();
                }
                this.mControllerBuilder = (AbstractC24198b) sDraweecontrollerbuildersupplier.mo34217b();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hs, R.attr.ht, R.attr.hu, R.attr.jc, R.attr.tq, R.attr.ts, R.attr.tt, R.attr.a6m, R.attr.a7e, R.attr.a7f, R.attr.a7o, R.attr.a7s, R.attr.a7t, R.attr.a7u, R.attr.a9p, R.attr.a9q, R.attr.a_o, R.attr.a_p, R.attr.a_q, R.attr.a_r, R.attr.a_s, R.attr.a_u, R.attr.a_v, R.attr.a_w, R.attr.a_x, R.attr.a_y, R.attr.aa6, R.attr.aa8, R.attr.aa9, R.attr.aa_, R.attr.asz});
                try {
                    if (obtainStyledAttributes.hasValue(2)) {
                        setImageURI(Uri.parse(obtainStyledAttributes.getString(2)), (Object) null);
                    } else if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
            C24644b.m47156a();
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }
}
