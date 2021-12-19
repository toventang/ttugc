package com.bytedance.android.livesdk.p643ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ui.c */
public final class C10938c extends FrameLayout {

    /* renamed from: a */
    private TextView f26280a;

    /* renamed from: b */
    private HashMap f26281b;

    static {
        Covode.recordClassIndex(12550);
    }

    /* renamed from: a */
    private View m19566a(int i) {
        if (this.f26281b == null) {
            this.f26281b = new HashMap();
        }
        View view = (View) this.f26281b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26281b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C10938c mo17798a() {
        if (m19566a(R.id.cfk) != null) {
            ImageView imageView = (ImageView) m19566a(R.id.cfk);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(0);
            ((ImageView) m19566a(R.id.cfk)).setImageResource(2131234696);
        } else {
            ImageView imageView2 = (ImageView) m19566a(R.id.cfk);
            C89219l.m154716b(imageView2, "");
            imageView2.setVisibility(8);
        }
        return this;
    }

    /* renamed from: a */
    public final C10938c mo17799a(String str) {
        if (m19566a(R.id.cfl) != null) {
            LiveTextView liveTextView = (LiveTextView) m19566a(R.id.cfl);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(str);
        }
        return this;
    }

    /* renamed from: b */
    public final C10938c mo17800b(String str) {
        LiveTextView liveTextView = (LiveTextView) m19566a(R.id.cfn);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(str);
        LiveTextView liveTextView2 = (LiveTextView) m19566a(R.id.cfn);
        C89219l.m154716b(liveTextView2, "");
        liveTextView2.setVisibility(0);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10938c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8914);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bbk, this, true);
        this.f26280a = (TextView) findViewById(R.id.cfm);
        MethodCollector.m26664o(8914);
    }

    public /* synthetic */ C10938c(Context context, byte b) {
        this(context);
    }
}
