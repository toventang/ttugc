package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.b */
public final class C43936b implements Html.ImageGetter {

    /* renamed from: a */
    public final Context f102443a;

    /* renamed from: b */
    public final TextView f102444b;

    static {
        Covode.recordClassIndex(52225);
    }

    public final Drawable getDrawable(String str) {
        C89219l.m154721d(str, "");
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        C20761r.m39061a(str).mo34182a(new C43937a(this, levelListDrawable));
        return levelListDrawable;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.b$a */
    public static final class C43937a implements AbstractC20737n {

        /* renamed from: a */
        final /* synthetic */ C43936b f102445a;

        /* renamed from: b */
        final /* synthetic */ LevelListDrawable f102446b;

        static {
            Covode.recordClassIndex(52226);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34150a() {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f102446b.addLevel(1, 1, new BitmapDrawable(this.f102445a.f102443a.getResources(), bitmap));
                this.f102446b.setBounds(0, 0, bitmap.getWidth(), C34728n.m70946a(13.0d));
                this.f102446b.setLevel(1);
                this.f102445a.f102444b.invalidate();
            }
        }

        C43937a(C43936b bVar, LevelListDrawable levelListDrawable) {
            this.f102445a = bVar;
            this.f102446b = levelListDrawable;
        }
    }

    public C43936b(Context context, TextView textView) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(textView, "");
        this.f102443a = context;
        this.f102444b = textView;
    }
}
