package com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.p795b.AbstractC12658i;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.AbstractC12711w;
import com.bytedance.assem.arch.p795b.C12690t;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14530k;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l */
public final class C60591l extends AbstractC12711w<C60591l> implements AbstractC12658i<C60603d> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f137808u = {new C89232y(C60591l.class, "musicFakeViewModel", "getMusicFakeViewModel()Lcom/ss/android/ugc/aweme/music/assem/list/cell/assem/MusicFakeViewModel;", 0)};

    /* renamed from: v */
    final AbstractC89248d f137809v;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l$b */
    public static final class C60593b extends AbstractC89220m implements AbstractC89172b<C60600m, C60600m> {
        public static final C60593b INSTANCE = new C60593b();

        static {
            Covode.recordClassIndex(71147);
        }

        public C60593b() {
            super(1);
        }

        public final C60600m invoke(C60600m mVar) {
            C89219l.m154719c(mVar, "");
            return mVar;
        }
    }

    static {
        Covode.recordClassIndex(71145);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.ao1;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l$c */
    public static final class C60594c extends AbstractC89220m implements AbstractC89171a<C12874b<C60600m>> {
        public static final C60594c INSTANCE = new C60594c();

        static {
            Covode.recordClassIndex(71148);
        }

        public C60594c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60600m> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l$d */
    public static final class C60595d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137811a;

        static {
            Covode.recordClassIndex(71149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60595d(AbstractC12693u uVar) {
            super(0);
            this.f137811a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137811a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l$e */
    public static final class C60596e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f137812a;

        static {
            Covode.recordClassIndex(71150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60596e(AbstractC12693u uVar) {
            super(0);
            this.f137812a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137812a.bD_().f30985g;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C12690t.m22847a(this, new C60598g(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l$a */
    public static final class C60592a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137810a;

        static {
            Covode.recordClassIndex(71146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60592a(AbstractC89277c cVar) {
            super(0);
            this.f137810a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137810a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l$f */
    static final class C60597f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60591l f137813a;

        static {
            Covode.recordClassIndex(71151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60597f(C60591l lVar) {
            super(0);
            this.f137813a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137813a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    public C60591l() {
        AbstractC12848i iVar = AbstractC12848i.C12852d.f31278a;
        C60597f fVar = new C60597f(this);
        AbstractC89277c a = C89204ab.m154669a(MusicFakeViewModel.class);
        this.f137809v = C14530k.m26542a(this, a, iVar == null ? AbstractC12848i.C12851c.f31277a : iVar, new C60592a(a), C60594c.INSTANCE, fVar, C60593b.INSTANCE, null, null, new C60595d(this), new C60596e(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(C60603d dVar) {
        C89219l.m154721d(dVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: b */
    public final /* synthetic */ void mo20469b(C60603d dVar) {
        C89219l.m154721d(dVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: c */
    public final /* synthetic */ boolean mo20470c(C60603d dVar) {
        C89219l.m154721d(dVar, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.l$g */
    static final class C60598g extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60591l f137814a;

        static {
            Covode.recordClassIndex(71152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60598g(C60591l lVar) {
            super(1);
            this.f137814a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r0.mo4011a().compareTo((java.lang.Enum) androidx.lifecycle.AbstractC1196i.EnumC1199b.DESTROYED) > 0) goto L_0x0041;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.assem.arch.core.Assembler r7) {
            /*
            // Method dump skipped, instructions count: 135
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem.C60591l.C60598g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20468a(C60603d dVar, List list) {
        C89219l.m154721d(dVar, "");
    }
}
