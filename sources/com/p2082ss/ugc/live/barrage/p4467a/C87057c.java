package com.p2082ss.ugc.live.barrage.p4467a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4469c.C87067a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.barrage.a.c */
public final class C87057c extends AbstractC87048a {

    /* renamed from: a */
    public Bitmap f196265a;

    /* renamed from: b */
    public View f196266b;

    /* renamed from: c */
    private final Context f196267c;

    /* renamed from: d */
    private int f196268d;

    /* renamed from: e */
    private final C87058a f196269e = new C87058a(this);

    static {
        Covode.recordClassIndex(102823);
    }

    @Override // com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a
    /* renamed from: b */
    public final Bitmap mo140675b() {
        return this.f196265a;
    }

    @Override // com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a
    /* renamed from: c */
    public final void mo140676c() {
        super.mo140676c();
        View view = this.f196266b;
        if (view != null) {
            C87067a.m150802a(view, this.f196269e);
        } else {
            C87067a.m150801a(this.f196267c, this.f196268d, this.f196269e);
        }
    }

    @Override // com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a
    /* renamed from: d */
    public final void mo140677d() {
        super.mo140677d();
        View view = this.f196266b;
        if (view != null) {
            view.destroyDrawingCache();
        }
        this.f196266b = null;
        Bitmap bitmap = this.f196265a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f196265a = null;
    }

    /* renamed from: com.ss.ugc.live.barrage.a.c$a */
    public static final class C87058a implements C87067a.AbstractC87068a {

        /* renamed from: a */
        final /* synthetic */ C87057c f196270a;

        static {
            Covode.recordClassIndex(102824);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C87058a(C87057c cVar) {
            this.f196270a = cVar;
        }

        @Override // com.p2082ss.ugc.live.barrage.p4469c.C87067a.AbstractC87068a
        /* renamed from: a */
        public final void mo140679a(View view, Bitmap bitmap) {
            int i;
            MethodCollector.m26663i(10245);
            C89219l.m154719c(view, "");
            C89219l.m154719c(bitmap, "");
            this.f196270a.f196266b = view;
            int i2 = 0;
            if (bitmap.isRecycled()) {
                this.f196270a.f196265a = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_4444);
            } else {
                this.f196270a.f196265a = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            }
            View view2 = this.f196270a.f196266b;
            if (view2 != null) {
                view2.destroyDrawingCache();
            }
            RectF rectF = this.f196270a.f196257j;
            float f = this.f196270a.f196257j.left;
            Bitmap bitmap2 = this.f196270a.f196265a;
            if (bitmap2 != null) {
                i = bitmap2.getWidth();
            } else {
                i = 0;
            }
            rectF.right = f + ((float) i);
            RectF rectF2 = this.f196270a.f196257j;
            float f2 = this.f196270a.f196257j.top;
            Bitmap bitmap3 = this.f196270a.f196265a;
            if (bitmap3 != null) {
                i2 = bitmap3.getHeight();
            }
            rectF2.bottom = f2 + ((float) i2);
            this.f196270a.f196255h = true;
            MethodCollector.m26664o(10245);
        }
    }

    /* renamed from: a */
    public final void mo140678a(View view) {
        C89219l.m154719c(view, "");
        m150775b(view);
    }

    public C87057c(View view) {
        C89219l.m154719c(view, "");
        Context context = view.getContext();
        C89219l.m154709a((Object) context, "");
        this.f196267c = context;
        mo140678a(view);
    }

    /* renamed from: b */
    private final void m150775b(View view) {
        this.f196266b = view;
        this.f196268d = -1;
        AbstractC87048a.AbstractC87049a aVar = this.f196258k;
        if (C89219l.m154714a(aVar, AbstractC87048a.AbstractC87049a.C87052c.f196261a) || C89219l.m154714a(aVar, AbstractC87048a.AbstractC87049a.C87053d.f196262a)) {
            View view2 = this.f196266b;
            if (view2 != null) {
                C87067a.m150802a(view2, this.f196269e);
            } else {
                C87067a.m150801a(this.f196267c, this.f196268d, this.f196269e);
            }
        }
    }
}
