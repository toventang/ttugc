package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.AbstractC20755l;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.a */
public final class C58917a {

    /* renamed from: a */
    public C23226a f134143a;

    static {
        Covode.recordClassIndex(69236);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.a$a */
    public static final class View$OnClickListenerC58918a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58917a f134144a;

        static {
            Covode.recordClassIndex(69237);
        }

        View$OnClickListenerC58918a(C58917a aVar) {
            this.f134144a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a aVar = this.f134144a.f134143a;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: a */
    static void m108260a(AbstractC20755l lVar, String str) {
        C20766v a = C20761r.m39061a(str);
        a.f49092E = lVar;
        a.mo34179a("WallPaperGuideDialog").mo34186c();
    }

    /* renamed from: a */
    static void m108259a(Context context, TextView textView, int i) {
        MethodCollector.m26663i(5449);
        int a = C34728n.m70946a(17.0d);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        C89219l.m154716b(decodeResource, "");
        int width = decodeResource.getWidth();
        int height = decodeResource.getHeight();
        float f = (float) a;
        Matrix matrix = new Matrix();
        matrix.postScale(f / ((float) width), f / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource, 0, 0, width, height, matrix, true);
        C89219l.m154716b(createBitmap, "");
        ImageSpan imageSpan = new ImageSpan(context, createBitmap);
        SpannableString spannableString = new SpannableString(textView.getText());
        CharSequence text = textView.getText();
        C89219l.m154716b(text, "");
        int a2 = C89361p.m154888a(text, "%s", 0, false, 6);
        spannableString.setSpan(imageSpan, a2, a2 + 2, 33);
        textView.setText(spannableString);
        MethodCollector.m26664o(5449);
    }
}
