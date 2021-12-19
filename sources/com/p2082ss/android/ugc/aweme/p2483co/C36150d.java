package com.p2082ss.android.ugc.aweme.p2483co;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.utils.C80212ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.co.d */
public final class C36150d extends AbstractC36147a {

    /* renamed from: a */
    public View f85398a;

    /* renamed from: b */
    public View f85399b;

    /* renamed from: c */
    public View f85400c;

    /* renamed from: d */
    public TextView f85401d;

    static {
        Covode.recordClassIndex(43403);
    }

    /* renamed from: d */
    public static Drawable m73649d() {
        if (!m73643a()) {
            return null;
        }
        Drawable a = m73648a(2131233149);
        Drawable a2 = m73648a(2131233148);
        if (a == null || a2 == null) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842913}, a);
        stateListDrawable.addState(new int[]{16842913}, a2);
        return stateListDrawable;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2483co.AbstractC36147a
    /* renamed from: c */
    public final void mo63275c() {
        View view = this.f85398a;
        if (view != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(view, null, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 9.5f, system.getDisplayMetrics()))), null, false, 27);
        }
        View view2 = this.f85399b;
        if (view2 != null) {
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 45.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            C36157i.m73655a(view2, a, C89241a.m154730a(TypedValue.applyDimension(1, 45.0f, system3.getDisplayMetrics())));
        }
        View view3 = this.f85400c;
        if (view3 != null) {
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 45.0f, system4.getDisplayMetrics()));
            Resources system5 = Resources.getSystem();
            C89219l.m154709a((Object) system5, "");
            C36157i.m73655a(view3, a2, C89241a.m154730a(TypedValue.applyDimension(1, 45.0f, system5.getDisplayMetrics())));
        }
        TextView textView = this.f85401d;
        if (textView != null) {
            textView.setTextSize(1, 11.0f);
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            C23163i.m43660a((View) textView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system6.getDisplayMetrics()))), false, 23);
            Resources system7 = Resources.getSystem();
            C89219l.m154709a((Object) system7, "");
            C23163i.m43668b(textView, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system7.getDisplayMetrics()))), null, null, false, 29);
        }
    }

    /* renamed from: a */
    private static Drawable m73648a(int i) {
        MethodCollector.m26663i(3038);
        Drawable a = C0643b.m2369a(C17867d.m33078a(), i);
        if (a == null) {
            MethodCollector.m26664o(3038);
            return null;
        }
        C89219l.m154716b(a, "");
        int intrinsicWidth = a.getIntrinsicWidth();
        int intrinsicHeight = a.getIntrinsicHeight();
        Bitmap a2 = C80212ag.m139038a(a);
        Matrix matrix = new Matrix();
        matrix.postScale(0.9f, 0.9f);
        Bitmap createBitmap = Bitmap.createBitmap(a2, 0, 0, intrinsicWidth, intrinsicHeight, matrix, true);
        C89219l.m154716b(a2, "");
        if (!a2.isRecycled()) {
            a2.recycle();
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), createBitmap);
        bitmapDrawable.setTargetDensity(C13628n.m24524d(C17867d.m33078a()));
        MethodCollector.m26664o(3038);
        return bitmapDrawable;
    }
}
