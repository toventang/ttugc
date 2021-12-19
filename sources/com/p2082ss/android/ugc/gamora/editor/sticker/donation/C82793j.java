package com.p2082ss.android.ugc.gamora.editor.sticker.donation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p2730de.C40977l;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82726a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.j */
public final class C82793j extends ClickableSpan {

    /* renamed from: a */
    public String f185063a;

    /* renamed from: b */
    private final Context f185064b;

    /* renamed from: c */
    private final String f185065c;

    /* renamed from: d */
    private final String f185066d;

    static {
        Covode.recordClassIndex(96643);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        textPaint.setColor(C0643b.m2378c(this.f185064b, R.color.bh));
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        if (!C40977l.m82500a(view, 1200)) {
            String str = this.f185065c;
            String str2 = this.f185066d;
            JSONObject jSONObject = new JSONObject();
            C82726a.m142892a(jSONObject, new C82726a.C82732f(str, str2));
            C80322d.m139252a("tiltify_about_click", jSONObject);
            Bundle bundle = new Bundle();
            bundle.putString("url", this.f185063a);
            bundle.putString("title", this.f185064b.getString(R.string.baa));
            bundle.putString("enter_from", "tiltify_page");
            SmartRouter.buildRoute(this.f185064b, "aweme://donation/web/page").withParam(bundle).open();
        }
    }

    public C82793j(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        this.f185064b = context;
        this.f185065c = str;
        this.f185066d = str2;
    }
}
