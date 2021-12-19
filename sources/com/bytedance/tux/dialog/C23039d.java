package com.bytedance.tux.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.dialog.internal.AbstractDialogInterfaceC23060a;
import com.bytedance.tux.p1719f.C23142d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.d */
public final class C23039d extends AbstractDialogInterfaceC23060a<C23048e> {

    /* renamed from: a */
    private final Dialog f54536a;

    static {
        Covode.recordClassIndex(26959);
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractDialogInterfaceC23060a
    /* renamed from: b */
    public final Dialog mo37396b() {
        return this.f54536a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.dialog.d$d */
    public static final class View$OnClickListenerC23044d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23039d f54544a;

        /* renamed from: b */
        final /* synthetic */ C23048e.C23049a f54545b;

        /* renamed from: c */
        final /* synthetic */ DialogInterfaceC0216c f54546c;

        /* renamed from: d */
        final /* synthetic */ int f54547d;

        static {
            Covode.recordClassIndex(26964);
        }

        View$OnClickListenerC23044d(C23039d dVar, C23048e.C23049a aVar, DialogInterfaceC0216c cVar, int i) {
            this.f54544a = dVar;
            this.f54545b = aVar;
            this.f54546c = cVar;
            this.f54547d = i;
        }

        public final void onClick(View view) {
            if (!this.f54545b.f54555b) {
                this.f54546c.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f54545b.f54556c;
            if (onClickListener != null) {
                onClickListener.onClick(this.f54544a, this.f54547d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23039d(C23048e eVar) {
        super(eVar);
        Integer valueOf;
        int i;
        C23142d dVar;
        C89219l.m154719c(eVar, "");
        Context context = eVar.f54592n;
        C89219l.m154719c(context, "");
        TypedValue typedValue = new TypedValue();
        C23142d dVar2 = null;
        if (!context.getTheme().resolveAttribute(R.attr.c9, typedValue, true)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(typedValue.data);
        }
        Context context2 = eVar.f54592n;
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 0;
        }
        DialogInterfaceC0216c.C0217a aVar = new DialogInterfaceC0216c.C0217a(context2, i);
        final C23048e.C23049a aVar2 = eVar.f54551a;
        final C23048e.C23049a aVar3 = eVar.f54552b;
        final C23048e.C23049a aVar4 = eVar.f54553c;
        CharSequence charSequence = eVar.f54585g;
        if (charSequence != null) {
            dVar = new C23142d(charSequence);
            dVar.mo37628a(this.f54572e.f54600b);
        } else {
            dVar = null;
        }
        CharSequence charSequence2 = eVar.f54586h;
        if (charSequence2 != null) {
            dVar2 = new C23142d(charSequence2);
            dVar2.mo37628a(this.f54572e.f54601c);
        }
        aVar.mo449a(dVar);
        aVar.mo456b(dVar2);
        aVar.mo451a(eVar.f54591m);
        if (aVar2 != null) {
            C23142d dVar3 = new C23142d(aVar2.f54554a);
            dVar3.mo37628a(this.f54572e.f54604f);
            aVar.mo450a(dVar3, new DialogInterface$OnClickListenerC23041a(aVar2));
        }
        if (aVar3 != null) {
            C23142d dVar4 = new C23142d(aVar3.f54554a);
            dVar4.mo37628a(this.f54572e.f54604f);
            aVar.mo457b(dVar4, new DialogInterface$OnClickListenerC23042b(aVar3));
        }
        if (aVar4 != null) {
            new C23142d(aVar4.f54554a).mo37628a(this.f54572e.f54604f);
            aVar.mo460c(aVar4.f54554a, new DialogInterface$OnClickListenerC23043c(aVar4));
        }
        DialogInterfaceC0216c a = aVar.mo453a();
        C89219l.m154709a((Object) a, "");
        this.f54536a = a;
        mo37471c();
        a.setOnShowListener(new DialogInterface.OnShowListener(this) {
            /* class com.bytedance.tux.dialog.C23039d.DialogInterface$OnShowListenerC230401 */

            /* renamed from: a */
            final /* synthetic */ C23039d f54537a;

            static {
                Covode.recordClassIndex(26960);
            }

            {
                this.f54537a = r1;
            }

            public final void onShow(DialogInterface dialogInterface) {
                this.f54537a.mo37434a(-1, aVar2);
                this.f54537a.mo37434a(-2, aVar3);
                this.f54537a.mo37434a(-3, aVar4);
                DialogInterface.OnShowListener onShowListener = this.f54537a.f54576i;
                if (onShowListener != null) {
                    onShowListener.onShow(dialogInterface);
                }
            }
        });
    }

    /* renamed from: com.bytedance.tux.dialog.d$a */
    static final class DialogInterface$OnClickListenerC23041a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23048e.C23049a f54541a;

        static {
            Covode.recordClassIndex(26961);
        }

        DialogInterface$OnClickListenerC23041a(C23048e.C23049a aVar) {
            this.f54541a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f54541a.f54555b) {
                dialogInterface.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f54541a.f54556c;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: com.bytedance.tux.dialog.d$b */
    static final class DialogInterface$OnClickListenerC23042b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23048e.C23049a f54542a;

        static {
            Covode.recordClassIndex(26962);
        }

        DialogInterface$OnClickListenerC23042b(C23048e.C23049a aVar) {
            this.f54542a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f54542a.f54555b) {
                dialogInterface.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f54542a.f54556c;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: com.bytedance.tux.dialog.d$c */
    static final class DialogInterface$OnClickListenerC23043c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23048e.C23049a f54543a;

        static {
            Covode.recordClassIndex(26963);
        }

        DialogInterface$OnClickListenerC23043c(C23048e.C23049a aVar) {
            this.f54543a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f54543a.f54555b) {
                dialogInterface.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f54543a.f54556c;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo37434a(int i, C23048e.C23049a aVar) {
        Dialog dialog = this.f54536a;
        if (dialog != null) {
            DialogInterfaceC0216c cVar = (DialogInterfaceC0216c) dialog;
            Button a = cVar.mo440a(i);
            if (a != null && aVar != null) {
                a.setOnClickListener(new View$OnClickListenerC23044d(this, aVar, cVar, i));
                return;
            }
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
