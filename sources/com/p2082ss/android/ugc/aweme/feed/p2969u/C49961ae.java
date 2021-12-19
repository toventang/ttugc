package com.p2082ss.android.ugc.aweme.feed.p2969u;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48165at;
import com.p2082ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.p2082ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p2082ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.u.ae */
public final class C49961ae extends C35321b<C48165at, EmptyGuideV2> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(59073);
    }

    /* renamed from: a */
    public final void mo85002a() {
        ((C48165at) this.f83348b).mo80300a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) this.f83349c;
        T t = ((AbstractC35320a) this.f83348b).mData;
        if (emptyGuideV2.f114035b != null) {
            emptyGuideV2.f114035b.mo27382d();
        }
        if (t == null || t.getUserList() == null || t.getUserList().size() <= 0) {
            emptyGuideV2.mo81333c();
            return;
        }
        emptyGuideV2.f114039f = t.logPb.getImprId();
        ArrayList arrayList = new ArrayList();
        for (UserWithAweme userWithAweme : t.getUserList()) {
            if (!(userWithAweme == null || userWithAweme.getUser() == null || userWithAweme.getAweme() == null)) {
                arrayList.add(userWithAweme);
            }
        }
        emptyGuideV2.f114037d.setData(arrayList);
        emptyGuideV2.f114037d.f114079c.f114053b = 0;
        emptyGuideV2.f114037d.setOnItemOperationListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0071: INVOKE  
              (wrap: com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView : 0x006a: IGET  (r1v3 com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView) = (r4v1 'emptyGuideV2' com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2) com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.d com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView)
              (wrap: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2$6 : 0x006e: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2$6) = (r4v1 'emptyGuideV2' com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2) call: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.6.<init>(com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView.setOnItemOperationListener(com.ss.android.ugc.aweme.profile.ui.widget.h$b):void in method: com.ss.android.ugc.aweme.feed.u.ae.c():void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006e: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2$6) = (r4v1 'emptyGuideV2' com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2) call: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.6.<init>(com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.u.ae.c():void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2969u.C49961ae.mo57528c():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        ((EmptyGuideV2) this.f83349c).mo81329a(exc);
    }

    /* renamed from: a */
    public final int mo85001a(String str) {
        if (this.f83348b != null) {
            C48165at atVar = (C48165at) this.f83348b;
            if (atVar.f111558a != null) {
                return atVar.f111558a.indexOf(str);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo85003a(User user) {
        if (this.f83348b != null) {
            C48165at atVar = (C48165at) this.f83348b;
            if (atVar.mData != null && !((SuperAccountList) atVar.mData).getUserList().isEmpty()) {
                List<UserWithAweme> userList = ((SuperAccountList) atVar.mData).getUserList();
                userList.remove(user);
                ((SuperAccountList) atVar.mData).userList = userList;
            }
        }
    }

    public C49961ae(C48165at atVar, EmptyGuideV2 emptyGuideV2) {
        super(atVar, emptyGuideV2);
        ((AbstractC35320a) this.f83348b).addNotifyListener(this);
    }
}
