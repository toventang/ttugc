package com.bytedance.tux.p1717e;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.immersionbar.C20057e;
import com.bytedance.immersionbar.EnumC20054b;
import com.bytedance.tux.p1722h.C23155d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.e.a */
public final class C23073a {

    /* renamed from: b */
    public static final C23074a f54626b = new C23074a((byte) 0);

    /* renamed from: a */
    public final C20057e f54627a;

    /* renamed from: c */
    private final Context f54628c;

    static {
        Covode.recordClassIndex(26997);
    }

    /* renamed from: com.bytedance.tux.e.a$a */
    public static final class C23074a {
        static {
            Covode.recordClassIndex(26998);
        }

        private C23074a() {
        }

        public /* synthetic */ C23074a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C23073a m43506a(Fragment fragment) {
            C89219l.m154719c(fragment, "");
            C20057e a = C20057e.m37949a(fragment);
            Context context = fragment.getContext();
            C89219l.m154709a((Object) a, "");
            return new C23073a(context, a, (byte) 0);
        }

        /* renamed from: a */
        public static C23073a m43507a(DialogInterface$OnCancelListenerC0944d dVar) {
            C89219l.m154719c(dVar, "");
            C20057e a = C20057e.m37950a(dVar);
            Context context = dVar.getContext();
            C89219l.m154709a((Object) a, "");
            return new C23073a(context, a, (byte) 0);
        }

        /* renamed from: a */
        public static C23073a m43508a(ActivityC0945e eVar) {
            C89219l.m154719c(eVar, "");
            C20057e a = C20057e.m37951a(eVar);
            C89219l.m154709a((Object) a, "");
            return new C23073a(eVar, a, (byte) 0);
        }

        /* renamed from: a */
        public static C23073a m43509a(ActivityC0945e eVar, Dialog dialog) {
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(dialog, "");
            C20057e a = C20057e.m37952a(eVar, dialog);
            C89219l.m154709a((Object) a, "");
            return new C23073a(eVar, a, (byte) 0);
        }

        /* renamed from: a */
        public static C23073a m43510a(ActivityC0945e eVar, Window window) {
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(window, "");
            C20057e a = C20057e.m37953a(eVar, window);
            C89219l.m154709a((Object) a, "");
            return new C23073a(eVar, a, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C23073a mo37493a() {
        this.f54627a.mo33404a();
        return this;
    }

    /* renamed from: b */
    public final C23073a mo37497b() {
        this.f54627a.mo33408b();
        return this;
    }

    /* renamed from: c */
    public final C23073a mo37500c() {
        this.f54627a.mo33411c();
        return this;
    }

    /* renamed from: d */
    public final C23073a mo37503d(int i) {
        this.f54627a.mo33412c(i);
        return this;
    }

    /* renamed from: e */
    public final C23073a mo37504e(int i) {
        this.f54627a.mo33414d(i);
        return this;
    }

    /* renamed from: a */
    public final C23073a mo37494a(int i) {
        this.f54627a.mo33405a(i);
        return this;
    }

    /* renamed from: b */
    public final C23073a mo37498b(int i) {
        this.f54627a.mo33409b(i);
        return this;
    }

    /* renamed from: c */
    public final C23073a mo37502c(boolean z) {
        this.f54627a.mo33413c(z);
        return this;
    }

    /* renamed from: a */
    public final C23073a mo37495a(boolean z) {
        this.f54627a.mo33407a(z);
        return this;
    }

    /* renamed from: b */
    public final C23073a mo37499b(boolean z) {
        this.f54627a.mo33410b(z);
        return this;
    }

    /* renamed from: c */
    public final C23073a mo37501c(int i) {
        Integer a;
        Context context = this.f54628c;
        if (!(context == null || (a = C23155d.m43641a(context, i)) == null)) {
            this.f54627a.mo33409b(a.intValue());
        }
        return this;
    }

    /* renamed from: f */
    public final C23073a mo37505f(int i) {
        Integer a;
        Context context = this.f54628c;
        if (!(context == null || (a = C23155d.m43641a(context, i)) == null)) {
            this.f54627a.mo33414d(a.intValue());
        }
        return this;
    }

    private C23073a(Context context, C20057e eVar) {
        this.f54628c = context;
        this.f54627a = eVar;
    }

    /* renamed from: a */
    public final C23073a mo37496a(boolean z, boolean z2) {
        EnumC20054b bVar;
        if (z) {
            if (z2) {
                bVar = EnumC20054b.FLAG_HIDE_BAR;
            } else {
                bVar = EnumC20054b.FLAG_HIDE_NAVIGATION_BAR;
            }
        } else if (z2) {
            bVar = EnumC20054b.FLAG_HIDE_STATUS_BAR;
        } else {
            bVar = EnumC20054b.FLAG_SHOW_BAR;
        }
        this.f54627a.mo33406a(bVar);
        return this;
    }

    public /* synthetic */ C23073a(Context context, C20057e eVar, byte b) {
        this(context, eVar);
    }
}
