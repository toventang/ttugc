package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.p */
public final class C57292p extends LinearLayout {

    /* renamed from: a */
    public Context f130516a;

    /* renamed from: b */
    private TextView f130517b;

    static {
        Covode.recordClassIndex(67197);
    }

    /* renamed from: a */
    public final void mo94493a() {
        Resources resources;
        Context context = this.f130516a;
        if (context != null && (resources = context.getResources()) != null) {
            setTextColor(resources.getColor(R.color.bx));
        }
    }

    public final void setTextColor(int i) {
        TextView textView = this.f130517b;
        if (textView == null) {
            C89219l.m154710a("textView");
        }
        textView.setTextColor(i);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f130517b;
            if (textView == null) {
                C89219l.m154710a("textView");
            }
            textView.setText(str);
        }
    }

    public C57292p(Context context) {
        super(context, null, 0);
        MethodCollector.m26663i(6757);
        this.f130516a = context;
        View findViewById = C1764a.m5927a(LayoutInflater.from(context), R.layout.aa4, this, true).findViewById(R.id.dt7);
        C89219l.m154716b(findViewById, "");
        this.f130517b = (TextView) findViewById;
        MethodCollector.m26664o(6757);
    }
}
