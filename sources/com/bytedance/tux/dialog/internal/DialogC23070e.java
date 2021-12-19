package com.bytedance.tux.dialog.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0240h;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.p1714c.AbstractC23036a;
import com.bytedance.tux.p1717e.C23073a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.internal.e */
public final class DialogC23070e extends DialogC0240h {

    /* renamed from: a */
    public final AbstractC23036a f54620a;

    /* renamed from: b */
    public final View f54621b;

    /* renamed from: c */
    private final View f54622c;

    static {
        Covode.recordClassIndex(26994);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.bytedance.tux.dialog.internal.e$a */
    static final class RunnableC23071a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC23070e f54623a;

        static {
            Covode.recordClassIndex(26995);
        }

        RunnableC23071a(DialogC23070e eVar) {
            this.f54623a = eVar;
        }

        public final void run() {
            this.f54623a.f54620a.mo37431a(this.f54623a.f54621b);
        }
    }

    public final void show() {
        try {
            super.show();
            this.f54622c.post(new RunnableC23071a(this));
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC23070e(C23013a aVar, View view, AbstractC23036a aVar2, View view2) {
        super(aVar.f54573f);
        ActivityC0945e eVar;
        Activity activity;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(view, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(view2, "");
        this.f54622c = view;
        this.f54620a = aVar2;
        this.f54621b = view2;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        setContentView(view);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(aVar.f54572e.f54614p);
            window2.setBackgroundDrawableResource(17170445);
            window2.addFlags(2);
            Context context = aVar.f54573f;
            while (true) {
                eVar = null;
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            activity = null;
            ActivityC0945e eVar2 = activity instanceof ActivityC0945e ? activity : eVar;
            if (eVar2 == null) {
                window2.getAttributes().height = -2;
            } else {
                C23073a.C23074a.m43509a(eVar2, this).mo37500c().f54627a.mo33415d();
                window2.getAttributes().height = -1;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.dimAmount = 0.5f;
            attributes.gravity = 1;
            attributes.width = -1;
        }
    }
}
