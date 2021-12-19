package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3355a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a */
public class DialogC57652a extends Dialog {

    /* renamed from: c */
    public static final C57653a f131582c = new C57653a((byte) 0);

    /* renamed from: d */
    private static final int f131583d = ((int) C13628n.m24520b(C17867d.m33078a(), 20.0f));

    /* renamed from: a */
    public int f131584a = -1;

    /* renamed from: b */
    public int f131585b = -1;

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a$a */
    public static final class C57653a {
        static {
            Covode.recordClassIndex(67617);
        }

        private C57653a() {
        }

        public /* synthetic */ C57653a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(67616);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(this.f131584a, this.f131585b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC57652a(Context context) {
        super(context, R.style.zn);
        C89219l.m154721d(context, "");
        requestWindowFeature(1);
    }
}
