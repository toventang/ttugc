package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e */
public class C71286e<T> extends C45922g {

    /* renamed from: q */
    private AbstractC71284d<T> f159781q;

    /* renamed from: r */
    private float f159782r;

    /* renamed from: s */
    private boolean f159783s;

    static {
        Covode.recordClassIndex(83805);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: o */
    public final boolean mo77372o() {
        return false;
    }

    public final AbstractC71284d<T> getBaseView() {
        return this.f159781q;
    }

    public final AbstractC71284d<T> getMBaseView() {
        return this.f159781q;
    }

    public final boolean getMIsAutoAdd() {
        return this.f159783s;
    }

    /* renamed from: r */
    public final void mo112777r() {
        View view = this.f106955g;
        C89219l.m154716b(view, "");
        this.f159782r = (float) view.getMeasuredHeight();
    }

    public final float getNewLayoutHeight() {
        AbstractC71284d<T> dVar = this.f159781q;
        if (dVar == null) {
            return 0.0f;
        }
        return ((this.f159782r - ((float) dVar.getHeight())) * this.f106950b) / 2.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: b */
    public final void mo77345b() {
        int i;
        View childAt;
        View childAt2;
        Rect rect = new Rect();
        View view = this.f106955g;
        FrameLayout frameLayout = null;
        if (!(view instanceof FrameLayout)) {
            view = null;
        }
        FrameLayout frameLayout2 = (FrameLayout) view;
        int i2 = 0;
        if (frameLayout2 == null || (childAt2 = frameLayout2.getChildAt(0)) == null) {
            i = 0;
        } else {
            i = childAt2.getMeasuredWidth();
        }
        View view2 = this.f106955g;
        if (view2 instanceof FrameLayout) {
            frameLayout = view2;
        }
        FrameLayout frameLayout3 = frameLayout;
        if (!(frameLayout3 == null || (childAt = frameLayout3.getChildAt(0)) == null)) {
            i2 = childAt.getMeasuredHeight();
        }
        View view3 = this.f106955g;
        C89219l.m154716b(view3, "");
        int x = (int) view3.getX();
        View view4 = this.f106955g;
        C89219l.m154716b(view4, "");
        int y = (int) view4.getY();
        rect.set(x, y, i + x, i2 + y);
        this.f106954f.mo77294a(rect);
        this.f106954f.mo77293a(this.f106950b, this.f106951c);
        this.f106954f.setStickerShowHelpboxCallback(new C71287a(this));
    }

    public final void setMBaseView(AbstractC71284d<T> dVar) {
        this.f159781q = dVar;
    }

    public final void setMIsAutoAdd(boolean z) {
        this.f159783s = z;
    }

    public C71286e(Context context) {
        this(context, (byte) 0);
    }

    private C71286e(Context context, byte b) {
        this(context, (char) 0);
    }

    private C71286e(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(9656);
        this.f106949a = getContext();
        LayoutInflater.from(this.f106949a).inflate(R.layout.ai4, this);
        this.f106954f = (StickerHelpBoxView) findViewById(R.id.e8x);
        this.f106955g = findViewById(R.id.ade);
        MethodCollector.m26664o(9656);
    }

    /* renamed from: a */
    public final void mo112772a(AbstractC71284d<T> dVar, boolean z) {
        MethodCollector.m26663i(9503);
        this.f159783s = z;
        if (dVar != null) {
            this.f159781q = dVar;
            View view = this.f106955g;
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
                View view2 = this.f106955g;
                if (view2 != null) {
                    ((ViewGroup) view2).addView(dVar);
                    MethodCollector.m26664o(9503);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(9503);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(9503);
            throw nullPointerException2;
        }
        MethodCollector.m26664o(9503);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e$a */
    static final class C71287a implements StickerHelpBoxView.AbstractC45912a {

        /* renamed from: a */
        final /* synthetic */ C71286e f159784a;

        static {
            Covode.recordClassIndex(83806);
        }

        C71287a(C71286e eVar) {
            this.f159784a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r3 != false) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
        @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView.AbstractC45912a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo77310a(boolean r3, boolean r4) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                com.ss.android.ugc.aweme.editSticker.interact.a.a r0 = r0.f106956h
                if (r0 == 0) goto L_0x0026
                if (r3 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                boolean r0 = r0.mo77350d()
                if (r0 == 0) goto L_0x0018
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                com.ss.android.ugc.aweme.editSticker.interact.a.a r1 = r0.f106956h
                r0 = 1
                r1.mo77262a(r0)
            L_0x0018:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                boolean r0 = r0.mo77350d()
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                r0.mo77349c()
                return
            L_0x0026:
                if (r3 == 0) goto L_0x0031
                goto L_0x0018
            L_0x0029:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                com.ss.android.ugc.aweme.editSticker.interact.a.a r1 = r0.f106956h
                r0 = 0
                r1.mo77262a(r0)
            L_0x0031:
                if (r4 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                com.ss.android.ugc.aweme.editSticker.a.b r0 = r0.f106964p
                r0.mo77176b()
                return
            L_0x003b:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f159784a
                com.ss.android.ugc.aweme.editSticker.a.b r0 = r0.f106964p
                r0.mo77176b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.C71286e.C71287a.mo77310a(boolean, boolean):void");
        }
    }

    /* renamed from: a */
    public final void mo112771a(View view, AbstractC71284d<T> dVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        if (C78099c.m136517a(getContext())) {
            View view2 = this.f106955g;
            C89219l.m154716b(view2, "");
            view2.setX(-((((float) (view.getWidth() - dVar.getWidth())) / 2.0f) - C13628n.m24520b(getContext(), 12.0f)));
        } else {
            View view3 = this.f106955g;
            C89219l.m154716b(view3, "");
            view3.setX((((float) (view.getWidth() - dVar.getWidth())) / 2.0f) - C13628n.m24520b(getContext(), 12.0f));
        }
        View view4 = this.f106955g;
        C89219l.m154716b(view4, "");
        view4.setY((((float) (view.getHeight() - dVar.getHeight())) / 2.0f) - C13628n.m24520b(getContext(), 12.0f));
    }
}
