package com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3784b;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.b.b */
public final class C69662b {

    /* renamed from: a */
    public static final C69663a f155505a = new C69663a((byte) 0);

    static {
        Covode.recordClassIndex(82035);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.b.b$a */
    public static final class C69663a {
        static {
            Covode.recordClassIndex(82036);
        }

        private C69663a() {
        }

        public /* synthetic */ C69663a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.b.b$a$a */
        public static final class C69664a extends BottomSheetBehavior.AbstractC26607a {

            /* renamed from: a */
            final /* synthetic */ DialogC26609a f155506a;

            /* renamed from: b */
            final /* synthetic */ BottomSheetBehavior f155507b;

            static {
                Covode.recordClassIndex(82037);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
            /* renamed from: a */
            public final void mo37774a(View view, float f) {
                C89219l.m154721d(view, "");
            }

            C69664a(DialogC26609a aVar, BottomSheetBehavior bottomSheetBehavior) {
                this.f155506a = aVar;
                this.f155507b = bottomSheetBehavior;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
            /* renamed from: a */
            public final void mo37775a(View view, int i) {
                C89219l.m154721d(view, "");
                if (i == 5) {
                    this.f155506a.cancel();
                    this.f155507b.mo43978c(4);
                }
            }
        }

        /* renamed from: a */
        private static void m123054a(Window window, int i) {
            String str = Build.MANUFACTURER + "-" + Build.MODEL;
            if (TextUtils.equals("vivo-V1821A", str) || TextUtils.equals("vivo-V1821T", str)) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-1, i);
            }
        }

        /* renamed from: b */
        private static void m123056b(DialogC26609a aVar, View view) {
            WindowManager.LayoutParams attributes;
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior a = BottomSheetBehavior.m52754a((View) parent);
            if (a != null) {
                Window window = aVar.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    a.mo43976b(attributes.height);
                } else {
                    return;
                }
            }
            C89219l.m154716b(a, "");
            a.mo43978c(3);
            a.f62901o = new C69664a(aVar, a);
        }

        /* renamed from: a */
        public static void m123055a(DialogC26609a aVar, View view) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(view, "");
            Context context = aVar.getContext();
            C89219l.m154716b(context, "");
            Window window = aVar.getWindow();
            int b = C13628n.m24521b(context) - C13628n.m24525e(context);
            if (window != null) {
                if (b == 0) {
                    b = -1;
                }
                m123054a(window, b);
                m123056b(aVar, view);
                window.setGravity(80);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                window.findViewById(R.id.ajx).setBackgroundDrawable(new ColorDrawable(0));
                aVar.setCanceledOnTouchOutside(true);
            }
        }
    }
}
