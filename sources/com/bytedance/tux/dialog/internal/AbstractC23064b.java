package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.Window$CallbackC23058f;
import com.bytedance.tux.dialog.internal.AbstractC23064b;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.internal.b */
public abstract class AbstractC23064b<T extends AbstractC23064b<T, U>, U> {

    /* renamed from: g */
    public CharSequence f54585g;

    /* renamed from: h */
    public CharSequence f54586h;

    /* renamed from: i */
    public DialogInterface.OnDismissListener f54587i;

    /* renamed from: j */
    public DialogInterface.OnCancelListener f54588j;

    /* renamed from: k */
    public DialogInterface.OnShowListener f54589k;

    /* renamed from: l */
    public Window$CallbackC23058f.AbstractC23059a f54590l;

    /* renamed from: m */
    public boolean f54591m = true;

    /* renamed from: n */
    public final Context f54592n;

    static {
        Covode.recordClassIndex(26988);
    }

    /* renamed from: a */
    public final T mo37482a(boolean z) {
        this.f54591m = z;
        return this;
    }

    /* renamed from: b */
    public T mo37411b(CharSequence charSequence) {
        this.f54585g = charSequence;
        return this;
    }

    /* renamed from: d */
    public T mo37413d(CharSequence charSequence) {
        this.f54586h = charSequence;
        return this;
    }

    /* renamed from: com.bytedance.tux.dialog.internal.b$a */
    static final class DialogInterface$OnDismissListenerC23065a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f54593a;

        static {
            Covode.recordClassIndex(26989);
        }

        DialogInterface$OnDismissListenerC23065a(AbstractC89172b bVar) {
            this.f54593a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC89172b bVar = this.f54593a;
            if (dialogInterface != null) {
                bVar.invoke(dialogInterface);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.tux.dialog.internal.b$b */
    static final class DialogInterface$OnShowListenerC23066b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f54594a;

        static {
            Covode.recordClassIndex(26990);
        }

        DialogInterface$OnShowListenerC23066b(AbstractC89172b bVar) {
            this.f54594a = bVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            AbstractC89172b bVar = this.f54594a;
            if (dialogInterface != null) {
                bVar.invoke(dialogInterface);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    public AbstractC23064b(Context context) {
        C89219l.m154719c(context, "");
        this.f54592n = context;
    }

    /* renamed from: a */
    public final T mo37479a(int i) {
        mo37411b(this.f54592n.getString(i));
        return this;
    }

    /* renamed from: b */
    public final T mo37483b(int i) {
        mo37413d(this.f54592n.getString(i));
        return this;
    }

    /* renamed from: a */
    public final T mo37480a(Window$CallbackC23058f.AbstractC23059a aVar) {
        C89219l.m154719c(aVar, "");
        this.f54590l = aVar;
        return this;
    }

    /* renamed from: b */
    public final T mo37484b(AbstractC89172b<? super C23013a, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f54589k = new DialogInterface$OnShowListenerC23066b(bVar);
        return this;
    }

    /* renamed from: a */
    public final T mo37481a(AbstractC89172b<? super C23013a, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f54587i = new DialogInterface$OnDismissListenerC23065a(bVar);
        return this;
    }
}
