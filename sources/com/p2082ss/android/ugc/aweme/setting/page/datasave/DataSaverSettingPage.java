package com.p2082ss.android.ugc.aweme.setting.page.datasave;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.DataSaverSettingPage */
public final class DataSaverSettingPage extends AbstractC68195a {

    /* renamed from: e */
    private final AbstractC89244h f152813e = C89250i.m154773a((AbstractC89171a) new C68263a(this));

    /* renamed from: f */
    private SparseArray f152814f;

    static {
        Covode.recordClassIndex(80471);
    }

    /* renamed from: d */
    private final C43047dm m120527d() {
        return (C43047dm) this.f152813e.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f152814f == null) {
            this.f152814f = new SparseArray();
        }
        View view = (View) this.f152814f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152814f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f152814f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ax9;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.DataSaverSettingPage$a */
    static final class C68263a extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ DataSaverSettingPage f152815a;

        static {
            Covode.recordClassIndex(80472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68263a(DataSaverSettingPage dataSaverSettingPage) {
            super(0);
            this.f152815a = dataSaverSettingPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            PowerList powerList = (PowerList) this.f152815a.mo27715a(R.id.c_1);
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
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
    @Override // com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final void mo108724a(android.app.Activity r9) {
        /*
            r8 = this;
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r9, r2)
            r0 = 2131823125(0x7f110a15, float:1.927904E38)
            com.p2082ss.android.ugc.aweme.setting.page.base.C68256b.m120517a(r8, r0)
            com.ss.android.ugc.aweme.dm r1 = r8.m120527d()
            com.ss.android.ugc.aweme.setting.page.datasave.a r0 = new com.ss.android.ugc.aweme.setting.page.datasave.a
            r7 = r8
            r0.<init>(r7)
            r1.mo73247a(r0)
            boolean r0 = com.p2082ss.android.ugc.aweme.api.C33539h.m68712a()
            if (r0 == 0) goto L_0x005b
            boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80580in.m139687c()
            if (r0 != 0) goto L_0x005b
            r0 = 2131820776(0x7f1100e8, float:1.9274276E38)
            java.lang.String r6 = r9.getString(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r6, r2)
            com.ss.android.ugc.aweme.dm r5 = r8.m120527d()
            com.ss.android.ugc.aweme.db.d r4 = new com.ss.android.ugc.aweme.db.d
            com.ss.android.ugc.aweme.be.e r3 = new com.ss.android.ugc.aweme.be.e
            r2 = 1
            r1 = 0
            r0 = 12
            r3.<init>(r6, r2, r1, r0)
            r4.<init>(r3)
            r5.mo73247a(r4)
            com.ss.android.ugc.aweme.dm r1 = r8.m120527d()
            com.ss.android.ugc.aweme.setting.page.datasave.zerorating.c r0 = new com.ss.android.ugc.aweme.setting.page.datasave.zerorating.c
            r0.<init>(r7)
            r1.mo73247a(r0)
            com.ss.android.ugc.aweme.dm r1 = r8.m120527d()
            com.ss.android.ugc.aweme.setting.page.datasave.zerorating.a r0 = new com.ss.android.ugc.aweme.setting.page.datasave.zerorating.a
            r0.<init>(r7)
            r1.mo73247a(r0)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.page.datasave.DataSaverSettingPage.mo108724a(android.app.Activity):void");
    }
}
