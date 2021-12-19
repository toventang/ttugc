package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.aa */
public final class C35957aa extends LinearLayout {

    /* renamed from: a */
    public Context f84876a;

    /* renamed from: b */
    private TuxTextView f84877b;

    static {
        Covode.recordClassIndex(43203);
    }

    /* renamed from: a */
    public final void mo63091a() {
        Resources resources;
        Context context = this.f84876a;
        if (context != null && (resources = context.getResources()) != null) {
            setTextColor(resources.getColor(R.color.bx));
        }
    }

    public final void setTextColor(int i) {
        TuxTextView tuxTextView = this.f84877b;
        if (tuxTextView == null) {
            C89219l.m154710a("textView");
        }
        tuxTextView.setTextColor(i);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.f84877b;
            if (tuxTextView == null) {
                C89219l.m154710a("textView");
            }
            tuxTextView.setText(str);
        }
    }

    public C35957aa(Context context) {
        super(context, null, 0);
        MethodCollector.m26663i(3781);
        this.f84876a = context;
        View findViewById = C1764a.m5927a(LayoutInflater.from(context), R.layout.aa4, this, true).findViewById(R.id.dt7);
        C89219l.m154716b(findViewById, "");
        this.f84877b = (TuxTextView) findViewById;
        MethodCollector.m26664o(3781);
    }
}
