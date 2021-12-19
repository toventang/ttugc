package com.bytedance.assem.arch.p797d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.p022b.p023a.C0464a;
import com.C1764a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.EnumC12762l;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.d.b */
public abstract class AbstractC12770b extends AbstractC12766p {

    /* renamed from: l */
    public static final AbstractC89244h f31062l = C89250i.m154774a(EnumC89331m.NONE, C12773c.f31069a);

    /* renamed from: m */
    public static final AbstractC89244h f31063m = C89250i.m154774a(EnumC89331m.NONE, C12772b.f31068a);

    /* renamed from: n */
    public static final C12771a f31064n = new C12771a((byte) 0);

    /* renamed from: i */
    public int f31065i;

    /* renamed from: j */
    public EnumC12762l f31066j = EnumC12762l.SYNC;

    /* renamed from: k */
    public View f31067k;

    /* renamed from: com.bytedance.assem.arch.d.b$a */
    public static final class C12771a {
        static {
            Covode.recordClassIndex(14595);
        }

        private C12771a() {
        }

        public /* synthetic */ C12771a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.assem.arch.d.b$b */
    static final class C12772b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C12772b f31068a = new C12772b();

        static {
            Covode.recordClassIndex(14596);
        }

        C12772b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m22997a());
        }

        /* renamed from: a */
        private static boolean m22997a() {
            try {
                System.out.println(C89204ab.m154669a(C1862a.class));
                return true;
            } catch (ClassNotFoundException e) {
                AbstractC12789k kVar = C12787j.f31108b;
                if (kVar == null) {
                    return false;
                }
                kVar.mo20639a("Could not find AndInflater", e);
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.assem.arch.d.b$c */
    static final class C12773c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C12773c f31069a = new C12773c();

        static {
            Covode.recordClassIndex(14597);
        }

        C12773c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m22998a());
        }

        /* renamed from: a */
        private static boolean m22998a() {
            try {
                System.out.print(C89204ab.m154669a(C0464a.class));
                return true;
            } catch (ClassNotFoundException e) {
                AbstractC12789k kVar = C12787j.f31108b;
                if (kVar == null) {
                    return false;
                }
                kVar.mo20639a("Could not find AsyncLayoutInflater", e);
                return false;
            }
        }
    }

    static {
        Covode.recordClassIndex(14594);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: u */
    public final void mo20631u() {
        View view;
        if (this.f31065i != 0) {
            View view2 = bD_().f30981c;
            if (view2 != null) {
                view = view2.findViewById(this.f31065i);
            } else {
                view = null;
            }
            if (view == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (view instanceof ViewGroup) {
                int i = C12775c.f31072a[this.f31066j.ordinal()];
                if (i == 1) {
                    Context az_ = az_();
                    if (az_ != null) {
                        new C0464a(az_).mo2025a(R.layout.a3q, (ViewGroup) view, new C12774d(this, view));
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (i == 2) {
                    Context az_2 = az_();
                    if (az_2 != null) {
                        View a = C1862a.m6031a(az_2, R.layout.a3q);
                        if (a != null) {
                            ((ViewGroup) view).addView(a);
                            this.f31067k = a;
                            mo20629a(view);
                            mo20630b(a);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (i == 3) {
                    Context az_3 = az_();
                    if (az_3 != null) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        View a2 = C1764a.m5927a(LayoutInflater.from(az_3), R.layout.a3q, viewGroup, false);
                        if (a2 != null) {
                            viewGroup.addView(a2);
                            this.f31067k = a2;
                            mo20629a(view);
                            mo20630b(a2);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("container must be a ViewGroup.".toString());
            }
        } else {
            throw new IllegalStateException("slotLayoutId must be assigned.".toString());
        }
    }

    /* renamed from: com.bytedance.assem.arch.d.b$d */
    static final class C12774d implements C0464a.AbstractC0469d {

        /* renamed from: a */
        final /* synthetic */ AbstractC12770b f31070a;

        /* renamed from: b */
        final /* synthetic */ View f31071b;

        static {
            Covode.recordClassIndex(14598);
        }

        C12774d(AbstractC12770b bVar, View view) {
            this.f31070a = bVar;
            this.f31071b = view;
        }

        @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
            MethodCollector.m26663i(3692);
            C89219l.m154719c(view, "");
            if (this.f31070a.f31000d.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
                MethodCollector.m26664o(3692);
                return;
            }
            ((ViewGroup) this.f31071b).addView(view);
            AbstractC12770b bVar = this.f31070a;
            C89219l.m154719c(view, "");
            bVar.f31067k = view;
            this.f31070a.mo20629a(this.f31071b);
            this.f31070a.mo20630b(view);
            MethodCollector.m26664o(3692);
        }
    }
}
