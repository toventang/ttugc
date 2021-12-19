package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ba */
public final class C73977ba {

    /* renamed from: a */
    public static final C73977ba f166072a = new C73977ba();

    private C73977ba() {
    }

    static {
        Covode.recordClassIndex(86727);
    }

    /* renamed from: a */
    public static final void m130111a(View view) {
        C89219l.m154721d(view, "");
        Activity a = C80564i.m139647a(view.getContext());
        if (a != null) {
            C89219l.m154716b(a, "");
            f166072a.mo116400a(view, new View$OnTouchListenerC73978a(a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ba$a */
    public static final class View$OnTouchListenerC73978a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ Activity f166073a;

        static {
            Covode.recordClassIndex(86728);
        }

        View$OnTouchListenerC73978a(Activity activity) {
            this.f166073a = activity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C71827ew.m126828b(this.f166073a);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo116400a(View view, View.OnTouchListener onTouchListener) {
        if (view.getId() != R.id.m4) {
            if (!(view instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C89219l.m154716b(childAt, "");
                    mo116400a(childAt, onTouchListener);
                }
            }
        }
    }
}
