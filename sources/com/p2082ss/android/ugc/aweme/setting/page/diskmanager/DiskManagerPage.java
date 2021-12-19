package com.p2082ss.android.ugc.aweme.setting.page.diskmanager;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.p1733u.AbstractC23430a;
import com.bytedance.p1733u.C23435d;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3735c.DialogC68579b;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage */
public final class DiskManagerPage extends AbstractC68195a {

    /* renamed from: f */
    public static final C68272a f152839f = new C68272a((byte) 0);

    /* renamed from: e */
    DialogC68579b f152840e;

    /* renamed from: g */
    private final AbstractC89244h f152841g = C89250i.m154773a((AbstractC89171a) new C68277f(this));

    /* renamed from: h */
    private final AbstractC89244h f152842h = C89250i.m154773a((AbstractC89171a) new C68276e(this));

    /* renamed from: i */
    private SparseArray f152843i;

    static {
        Covode.recordClassIndex(80484);
    }

    /* renamed from: d */
    private final DiskViewModel m120554d() {
        return (DiskViewModel) this.f152841g.getValue();
    }

    /* renamed from: e */
    private final C43047dm m120555e() {
        return (C43047dm) this.f152842h.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f152843i == null) {
            this.f152843i = new SparseArray();
        }
        View view = (View) this.f152843i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152843i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f152843i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ax_;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$a */
    public static final class C68272a {
        static {
            Covode.recordClassIndex(80485);
        }

        private C68272a() {
        }

        /* renamed from: a */
        public static long m120559a() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                Long showStorageTipSize = iESSettingsProxy.getShowStorageTipSize();
                C89219l.m154716b(showStorageTipSize, "");
                return showStorageTipSize.longValue();
            } catch (Exception unused) {
                return 314572800;
            }
        }

        /* renamed from: b */
        public static long m120560b() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                Long showStorageDotSize = iESSettingsProxy.getShowStorageDotSize();
                C89219l.m154716b(showStorageDotSize, "");
                return showStorageDotSize.longValue();
            } catch (Exception unused) {
                return 1073741824;
            }
        }

        /* renamed from: c */
        public static long m120561c() {
            List<AbstractC23430a> b = C23435d.m44118b();
            if (b == null) {
                return 0;
            }
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b, 10));
            for (T t : b) {
                C89219l.m154716b(t, "");
                arrayList.add(Long.valueOf(t.mo38202e()));
            }
            return C89070n.m154600t(arrayList);
        }

        public /* synthetic */ C68272a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$f */
    static final class C68277f extends AbstractC89220m implements AbstractC89171a<DiskViewModel> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerPage f152848a;

        static {
            Covode.recordClassIndex(80490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68277f(DiskManagerPage diskManagerPage) {
            super(0);
            this.f152848a = diskManagerPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DiskViewModel invoke() {
            return C1181ae.m3879a(this.f152848a, (C1175ad.AbstractC1177b) null).mo3983a(DiskViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$e */
    static final class C68276e extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerPage f152847a;

        static {
            Covode.recordClassIndex(80489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68276e(DiskManagerPage diskManagerPage) {
            super(0);
            this.f152847a = diskManagerPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            PowerList powerList = (PowerList) this.f152847a.mo27715a(R.id.c_1);
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: i */
    public final boolean mo108726i() {
        DialogC68579b bVar = this.f152840e;
        if (bVar == null || !bVar.isShowing()) {
            return super.mo108726i();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C1213t<Boolean> tVar;
        super.onResume();
        DiskViewModel d = m120554d();
        if (d != null && (tVar = d.f152850a) != null) {
            tVar.setValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$d */
    static final class C68275d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f152846a;

        static {
            Covode.recordClassIndex(80488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68275d(AbstractC89172b bVar) {
            super(1);
            this.f152846a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.fmu, this.f152846a);
            bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$b */
    static final class C68273b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DiskManagerPage f152844a;

        static {
            Covode.recordClassIndex(80486);
        }

        C68273b(DiskManagerPage diskManagerPage) {
            this.f152844a = diskManagerPage;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            DialogC68579b bVar;
            DialogC68579b bVar2;
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 0) {
                    DiskManagerPage diskManagerPage = this.f152844a;
                    DialogC68579b bVar3 = diskManagerPage.f152840e;
                    if (bVar3 != null && bVar3.isShowing() && (bVar2 = diskManagerPage.f152840e) != null) {
                        bVar2.dismiss();
                    }
                } else if (num.intValue() == 1) {
                    DiskManagerPage diskManagerPage2 = this.f152844a;
                    if (diskManagerPage2.f152840e == null) {
                        ActivityC0945e activity = diskManagerPage2.getActivity();
                        if (activity == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity, "");
                        DialogC68579b bVar4 = new DialogC68579b(activity);
                        bVar4.setCancelable(false);
                        diskManagerPage2.f152840e = bVar4;
                    }
                    DialogC68579b bVar5 = diskManagerPage2.f152840e;
                    if ((bVar5 == null || !bVar5.isShowing()) && (bVar = diskManagerPage2.f152840e) != null) {
                        bVar.show();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$c */
    static final class C68274c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DiskManagerPage f152845a;

        static {
            Covode.recordClassIndex(80487);
        }

        C68274c(DiskManagerPage diskManagerPage) {
            this.f152845a = diskManagerPage;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            DiskManagerPage diskManagerPage = this.f152845a;
            int intValue = ((Number) pVar.getFirst()).intValue();
            AbstractC89172b bVar = (AbstractC89172b) pVar.getSecond();
            Context context = diskManagerPage.getContext();
            if (context != null) {
                C89219l.m154716b(context, "");
                try {
                    ((C23023b) C23028c.m43435a((C23023b) new C23023b(context).mo37483b(intValue), new C68275d(bVar)).mo37482a(true)).mo37405a().mo37396b().show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            super.onViewCreated(r4, r5)
            r0 = 2131824359(0x7f110ee7, float:1.9281544E38)
            com.p2082ss.android.ugc.aweme.setting.page.base.C68256b.m120517a(r3, r0)
            java.lang.String r0 = "enter_storage_management"
            com.p2082ss.android.ugc.aweme.common.C39162r.onEventV3(r0)
            com.ss.android.ugc.aweme.dm r1 = r3.m120555e()
            com.ss.android.ugc.aweme.setting.page.diskmanager.a r0 = new com.ss.android.ugc.aweme.setting.page.diskmanager.a
            r2 = r3
            r0.<init>(r2)
            r1.mo73247a(r0)
            com.ss.android.ugc.aweme.dm r1 = r3.m120555e()
            com.ss.android.ugc.aweme.setting.page.diskmanager.b r0 = new com.ss.android.ugc.aweme.setting.page.diskmanager.b
            r0.<init>(r2)
            r1.mo73247a(r0)
            com.ss.android.ugc.aweme.dm r1 = r3.m120555e()
            com.ss.android.ugc.aweme.setting.page.diskmanager.c r0 = new com.ss.android.ugc.aweme.setting.page.diskmanager.c
            r0.<init>(r2)
            r1.mo73247a(r0)
            com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel r0 = r3.m120554d()
            if (r0 == 0) goto L_0x004b
            androidx.lifecycle.t<java.lang.Integer> r2 = r0.f152851b
            if (r2 == 0) goto L_0x004b
            r1 = r3
            com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$b r0 = new com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$b
            r0.<init>(r3)
            r2.observe(r1, r0)
        L_0x004b:
            com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel r0 = r3.m120554d()
            if (r0 == 0) goto L_0x005e
            androidx.lifecycle.t<h.p<java.lang.Integer, h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>>> r2 = r0.f152852c
            if (r2 == 0) goto L_0x005e
            r1 = r3
            com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$c r0 = new com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage$c
            r0.<init>(r3)
            r2.observe(r1, r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
