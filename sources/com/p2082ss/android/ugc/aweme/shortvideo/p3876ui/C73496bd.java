package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.C65687t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bd */
public final class C73496bd {
    static {
        Covode.recordClassIndex(86233);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bd$a */
    public static final class C73497a implements AbstractC63264v.AbstractC63265a {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f165124a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f165125b;

        /* renamed from: c */
        final /* synthetic */ String f165126c;

        /* renamed from: d */
        final /* synthetic */ int f165127d;

        /* renamed from: e */
        final /* synthetic */ boolean f165128e = true;

        /* renamed from: f */
        final /* synthetic */ AbstractC89183m f165129f;

        static {
            Covode.recordClassIndex(86234);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
        /* renamed from: a */
        public final void mo87657a(String[] strArr, int[] iArr) {
            C73496bd.m129634a(this.f165124a, this.f165125b, this.f165126c, this.f165127d, this.f165128e, this.f165129f);
        }

        C73497a(ActivityC0945e eVar, VideoPublishEditModel videoPublishEditModel, String str, int i, boolean z, AbstractC89183m mVar) {
            this.f165124a = eVar;
            this.f165125b = videoPublishEditModel;
            this.f165126c = str;
            this.f165127d = i;
            this.f165129f = mVar;
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
    /* renamed from: a */
    public static final void m129633a(androidx.fragment.app.ActivityC0945e r6, int r7, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, java.lang.String r9, p4600h.p4611f.p4612a.AbstractC89183m<? super java.lang.Boolean, ? super java.lang.Boolean, p4600h.C89391z> r10) {
        /*
            java.lang.String r0 = ""
            r2 = r6
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r5 = r7
            if (r5 == 0) goto L_0x0028
            r0 = 1
            r6 = 1
        L_0x0010:
            boolean r0 = com.p2082ss.android.ugc.aweme.experiment.C46981gn.m90261a()
            r4 = r9
            r7 = r10
            r3 = r8
            if (r0 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x002a
            r7.invoke(r1, r1)
            com.ss.android.ugc.aweme.shortvideo.ui.bd$a r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bd$a
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g.m129832a(r2, r1)
            return
        L_0x0028:
            r6 = 0
            goto L_0x0010
        L_0x002a:
            m129634a(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73496bd.m129633a(androidx.fragment.app.e, int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, h.f.a.m):void");
    }

    /* renamed from: a */
    public static final void m129634a(ActivityC0945e eVar, VideoPublishEditModel videoPublishEditModel, String str, int i, boolean z, AbstractC89183m<? super Boolean, ? super Boolean, C89391z> mVar) {
        String str2;
        String str3;
        C65687t.m117578a(i);
        if (z) {
            C63244g.m114602a().mo73287o().mo104790j().mo104829a(eVar, str);
        }
        C84425b bVar = new C84425b();
        String str4 = null;
        if (videoPublishEditModel != null) {
            str2 = videoPublishEditModel.creationId;
        } else {
            str2 = null;
        }
        C84425b a = bVar.mo129406a("creation_id", str2).mo129406a("enter_from", "video_post_page");
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        C84425b a2 = a.mo129406a("to_status", str3);
        if (videoPublishEditModel != null) {
            str4 = videoPublishEditModel.mShootWay;
        }
        C39162r.m79460a("click_react_download_control", a2.mo129406a("shoot_way", str4).mo129403a("save_with_captions", -1).f188764a);
        if (mVar != null) {
            mVar.invoke(true, Boolean.valueOf(z));
        }
    }
}
