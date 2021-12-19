package com.p2082ss.android.ugc.aweme.music.p3481ui.widget;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61133b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61147bg;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.widget.a */
public final class C61234a extends AbstractC12769a implements AbstractC61236b {

    /* renamed from: j */
    private final C12786i f139039j = new C12786i(bW_(), new C61235a(this, "music_info"));

    /* renamed from: k */
    private Fragment f139040k;

    /* renamed from: l */
    private C61147bg f139041l;

    static {
        Covode.recordClassIndex(71845);
    }

    /* renamed from: v */
    private final C61133b m110889v() {
        return (C61133b) this.f139039j.getValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C61237c mo20658e() {
        return new C61237c();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.widget.a$a */
    public static final class C61235a extends AbstractC89220m implements AbstractC89171a<C61133b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f139042a;

        /* renamed from: b */
        final /* synthetic */ String f139043b;

        static {
            Covode.recordClassIndex(71846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61235a(AbstractC12748a aVar, String str) {
            super(0);
            this.f139042a = aVar;
            this.f139043b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.music.ui.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.music.p3481ui.C61133b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f139042a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.music.ui.b> r1 = com.p2082ss.android.ugc.aweme.music.p3481ui.C61133b.class
                java.lang.String r0 = r3.f139043b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.widget.C61234a.C61235a.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.widget.AbstractC61236b
    /* renamed from: a */
    public final void mo98761a(ExternalMusicInfo externalMusicInfo) {
        C89219l.m154721d(externalMusicInfo, "");
        C61147bg bgVar = this.f139041l;
        if (bgVar == null) {
            C89219l.m154710a("thirdMusicLogic");
        }
        Fragment fragment = this.f139040k;
        if (fragment == null) {
            C89219l.m154710a("fragment");
        }
        bgVar.mo98696c(fragment.getContext(), C89070n.m154516a(externalMusicInfo));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.widget.AbstractC61236b
    /* renamed from: b */
    public final void mo98762b(com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            androidx.fragment.app.Fragment r0 = r3.f139040k
            java.lang.String r1 = "fragment"
            if (r0 != 0) goto L_0x000e
            p4600h.p4611f.p4613b.C89219l.m154710a(r1)
        L_0x000e:
            com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
            com.ss.android.ugc.aweme.music.ui.bg r2 = r3.f139041l
            if (r2 != 0) goto L_0x001a
            java.lang.String r0 = "thirdMusicLogic"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x001a:
            androidx.fragment.app.Fragment r0 = r3.f139040k
            if (r0 != 0) goto L_0x0021
            p4600h.p4611f.p4613b.C89219l.m154710a(r1)
        L_0x0021:
            android.content.Context r1 = r0.getContext()
            r0 = 1
            r2.mo98693a(r1, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.p3481ui.widget.C61234a.mo98762b(com.ss.android.ugc.aweme.music.model.ExternalMusicInfo):void");
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        boolean z;
        C89219l.m154721d(view, "");
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a != null) {
            this.f139040k = a;
            this.f139041l = new C61147bg(m110889v().f138813b, m110889v().f138814c, m110889v().f138815d, m110889v().f138816e);
            PowerList powerList = (PowerList) view;
            Fragment fragment = this.f139040k;
            if (fragment == null) {
                C89219l.m154710a("fragment");
            }
            fragment.getContext();
            powerList.setLayoutManager(new LinearLayoutManager());
            powerList.mo28083a(ThirdMusicViewHolder.class);
            powerList.setLifecycleOwner(this);
            ArrayList arrayList = new ArrayList();
            int size = m110889v().f138812a.size();
            int i = 0;
            for (T t : m110889v().f138812a) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (i == size - 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C61238d(t2, z));
                i = i2;
            }
            powerList.getState().mo28138b(arrayList);
        }
    }
}
