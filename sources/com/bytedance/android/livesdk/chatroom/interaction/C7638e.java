package com.bytedance.android.livesdk.chatroom.interaction;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.interaction.e */
public final class C7638e {

    /* renamed from: a */
    public static final C7639a f18941a = new C7639a((byte) 0);

    /* renamed from: b */
    private boolean f18942b;

    /* renamed from: c */
    private final View f18943c;

    static {
        Covode.recordClassIndex(8415);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.e$a */
    public static final class C7639a {
        static {
            Covode.recordClassIndex(8416);
        }

        private C7639a() {
        }

        public /* synthetic */ C7639a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo13856a() {
        if (!this.f18942b) {
            this.f18942b = true;
            ViewGroup.LayoutParams layoutParams = this.f18943c.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                View view = this.f18943c;
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                layoutParams3.addRule(11);
                layoutParams3.addRule(12);
                layoutParams3.bottomMargin = C3966y.m9653a(150.0f);
                layoutParams3.rightMargin = C3966y.m9653a(8.0f);
                view.setLayoutParams(layoutParams3);
            }
        }
    }

    public C7638e(View view) {
        C89219l.m154721d(view, "");
        this.f18943c = view;
    }
}
