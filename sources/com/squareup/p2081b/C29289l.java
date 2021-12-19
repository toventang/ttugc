package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.C29299t;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.l */
public final class C29289l extends AbstractC29253a<ImageView> {

    /* renamed from: m */
    AbstractC29276e f69486m;

    static {
        Covode.recordClassIndex(35638);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.p2081b.AbstractC29253a
    /* renamed from: b */
    public final void mo51048b() {
        super.mo51048b();
        if (this.f69486m != null) {
            this.f69486m = null;
        }
    }

    @Override // com.squareup.p2081b.AbstractC29253a
    /* renamed from: a */
    public final void mo51046a() {
        ImageView imageView = (ImageView) this.f69376c.get();
        if (imageView != null) {
            if (this.f69380g != 0) {
                imageView.setImageResource(this.f69380g);
            } else if (this.f69381h != null) {
                imageView.setImageDrawable(this.f69381h);
            }
        }
    }

    @Override // com.squareup.p2081b.AbstractC29253a
    /* renamed from: a */
    public final void mo51047a(Bitmap bitmap, C29299t.EnumC29305d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f69376c.get();
            if (imageView != null) {
                C29309u.m58700a(imageView, this.f69374a.f69517d, bitmap, dVar, this.f69377d, this.f69374a.f69525l);
                AbstractC29276e eVar = this.f69486m;
                if (eVar != null) {
                    eVar.mo27160a();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(C1764a.m5928a("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    C29289l(C29299t tVar, ImageView imageView, C29312w wVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, AbstractC29276e eVar, boolean z) {
        super(tVar, imageView, wVar, i, i2, i3, drawable, str, obj, z);
        this.f69486m = eVar;
    }
}
