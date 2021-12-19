package com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.e */
public final class C79611e {
    static {
        Covode.recordClassIndex(92823);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.e$a */
    public static final class C79612a implements AbstractC79602a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ ImageView f178630a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f178631b = null;

        static {
            Covode.recordClassIndex(92824);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource.AbstractC79602a
        /* renamed from: a */
        public final /* synthetic */ void mo123146a(Bitmap bitmap) {
            boolean z;
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.f178630a.setImageBitmap(bitmap2);
            }
            AbstractC89172b bVar = this.f178631b;
            if (bVar != null) {
                if (bitmap2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.invoke(Boolean.valueOf(z));
            }
        }

        C79612a(ImageView imageView, AbstractC89172b bVar) {
            this.f178630a = imageView;
        }
    }
}
