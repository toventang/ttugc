package com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.d */
public class DialogC44308d extends DialogC26609a {

    /* renamed from: a */
    private AbstractC45271m f103329a;

    static {
        Covode.recordClassIndex(52622);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.d$a */
    static final class C44309a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC44308d f103330a;

        static {
            Covode.recordClassIndex(52623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44309a(DialogC44308d dVar) {
            super(0);
            this.f103330a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            DialogC44308d.super.onBackPressed();
            return C89391z.f203057a;
        }
    }

    public void onBackPressed() {
        AbstractC45271m mVar = this.f103329a;
        if (mVar != null) {
            mVar.mo73991a(new C44309a(this));
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.vl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ DialogC44308d(Context context) {
        this(context, R.style.vm);
    }

    /* renamed from: a */
    public final void mo75219a(AbstractC45271m mVar) {
        C89219l.m154721d(mVar, "");
        this.f103329a = mVar;
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(View view) {
        C89219l.m154721d(view, "");
        super.setContentView(view);
        m87031a(view);
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.setStatusBarColor(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(int i) {
        MethodCollector.m26663i(8164);
        View inflate = View.inflate(getContext(), i, null);
        super.setContentView(inflate);
        m87031a(inflate);
        MethodCollector.m26664o(8164);
    }

    /* renamed from: a */
    private final void m87031a(View view) {
        ViewParent viewParent;
        while (!(!C89219l.m154714a((Object) Build.MODEL, (Object) "M2004J19C"))) {
            if (view != null) {
                view.setFitsSystemWindows(false);
            }
            ViewGroup viewGroup = null;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                viewGroup = viewParent;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                view = viewGroup2;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC44308d(Context context, int i) {
        super(context, i);
        C89219l.m154721d(context, "");
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(view, "");
        super.setContentView(view, layoutParams);
        m87031a(view);
    }
}
