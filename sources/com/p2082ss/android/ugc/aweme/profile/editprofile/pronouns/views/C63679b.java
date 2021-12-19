package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.views;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.views.b */
public final class C63679b extends LinearLayout {

    /* renamed from: a */
    private SparseArray f144385a;

    static {
        Covode.recordClassIndex(74999);
    }

    /* renamed from: a */
    private View m115214a() {
        if (this.f144385a == null) {
            this.f144385a = new SparseArray();
        }
        View view = (View) this.f144385a.get(R.id.d_w);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.d_w);
        this.f144385a.put(R.id.d_w, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo102267a(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) m115214a();
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C63679b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8130);
        LayoutInflater.from(getContext()).inflate(R.layout.apf, this);
        MethodCollector.m26664o(8130);
    }

    public /* synthetic */ C63679b(Context context, byte b) {
        this(context);
    }
}
