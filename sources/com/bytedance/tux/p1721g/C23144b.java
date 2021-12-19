package com.bytedance.tux.p1721g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.C0277d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23155d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.g.b */
public final class C23144b {

    /* renamed from: b */
    public static final C23145a f54774b = new C23145a((byte) 0);

    /* renamed from: f */
    private static int f54775f;

    /* renamed from: a */
    C23146c f54776a = new C23146c();

    /* renamed from: c */
    private Context f54777c;

    /* renamed from: d */
    private View f54778d;

    /* renamed from: e */
    private C23148e f54779e;

    static {
        Covode.recordClassIndex(27073);
    }

    /* renamed from: com.bytedance.tux.g.b$a */
    static final class C23145a {
        static {
            Covode.recordClassIndex(27074);
        }

        private C23145a() {
        }

        public /* synthetic */ C23145a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C23144b mo37632a() {
        this.f54776a.f54787h = true;
        int i = f54775f + 1;
        f54775f = i;
        if (i >= Integer.MAX_VALUE) {
            f54775f = 1;
        }
        this.f54776a.f54788i = f54775f;
        return this;
    }

    /* renamed from: b */
    public final void mo37637b() {
        Context context = this.f54777c;
        View view = this.f54778d;
        CharSequence charSequence = this.f54776a.f54781b;
        if (context != null && view != null && charSequence != null && charSequence.length() > 0) {
            C23148e eVar = new C23148e(context, view, this.f54776a);
            eVar.mo37644b();
            if (this.f54776a.f54787h) {
                C23147d.m43621a(eVar);
            }
            this.f54779e = eVar;
        }
    }

    /* renamed from: a */
    public final C23144b mo37634a(long j) {
        this.f54776a.f54784e = j;
        return this;
    }

    /* renamed from: a */
    public final C23144b mo37633a(int i) {
        Context context = this.f54777c;
        if (context == null) {
            return this;
        }
        this.f54777c = new C0277d(context, i);
        return this;
    }

    /* renamed from: b */
    public final C23144b mo37636b(int i) {
        this.f54776a.f54782c = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final C23144b mo37638c(int i) {
        this.f54776a.f54783d = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final C23144b mo37639d(int i) {
        Integer num;
        C23146c cVar = this.f54776a;
        Context context = this.f54777c;
        if (context != null) {
            num = C23155d.m43641a(context, i);
        } else {
            num = null;
        }
        cVar.f54783d = num;
        return this;
    }

    /* renamed from: e */
    public final C23144b mo37640e(int i) {
        String str;
        C23146c cVar = this.f54776a;
        Context context = this.f54777c;
        if (context != null) {
            str = context.getString(i);
        } else {
            str = null;
        }
        cVar.f54781b = str;
        return this;
    }

    public C23144b(Activity activity) {
        View view;
        C89219l.m154719c(activity, "");
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.f54778d = view;
        this.f54777c = activity;
    }

    public C23144b(Dialog dialog) {
        View view;
        C89219l.m154719c(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.f54778d = view;
        this.f54777c = dialog.getContext();
    }

    /* renamed from: a */
    public final C23144b mo37635a(CharSequence charSequence) {
        this.f54776a.f54781b = charSequence;
        return this;
    }

    public C23144b(View view) {
        C89219l.m154719c(view, "");
        this.f54778d = view;
        this.f54777c = view.getContext();
    }

    public C23144b(Fragment fragment) {
        View view;
        C89219l.m154719c(fragment, "");
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            view = null;
        }
        this.f54778d = view;
        this.f54777c = fragment.getContext();
    }
}
