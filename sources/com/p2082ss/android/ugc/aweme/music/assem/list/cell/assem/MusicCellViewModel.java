package com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60394b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel */
public final class MusicCellViewModel extends AssemViewModel<C60590k> implements AbstractC47430d {

    /* renamed from: j */
    final C47426a f137733j = new C47426a();

    static {
        Covode.recordClassIndex(71079);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62587a(BaseResponse baseResponse) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: c */
    public final void mo20669c() {
        this.f137733j.mo67839a_(this);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C60590k mo20674f() {
        return new C60590k();
    }

    /* renamed from: h */
    public final void mo23343h() {
        mo20662a(C60528b.f137735a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo23342g() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137579d;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: e_ */
    public final void mo62592e_(Exception exc) {
        C51423a.m95790a((Throwable) exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel$b */
    static final class C60528b extends AbstractC89220m implements AbstractC89172b<C60590k, C60590k> {

        /* renamed from: a */
        public static final C60528b f137735a = new C60528b();

        static {
            Covode.recordClassIndex(71081);
        }

        C60528b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60590k invoke(C60590k kVar) {
            C60590k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            return C60590k.m110154a(kVar2, kVar2.f137806a, null, 2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62589a(String str) {
        if (str != null) {
            mo20662a(new C60527a(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel$a */
    static final class C60527a extends AbstractC89220m implements AbstractC89172b<C60590k, C60590k> {

        /* renamed from: a */
        final /* synthetic */ String f137734a;

        static {
            Covode.recordClassIndex(71080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60527a(String str) {
            super(1);
            this.f137734a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60590k invoke(C60590k kVar) {
            C60590k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            return C60590k.m110154a(kVar2, false, new C12776a(this.f137734a), 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel$c */
    static final class C60529c extends AbstractC89220m implements AbstractC89172b<C60590k, C60590k> {

        /* renamed from: a */
        final /* synthetic */ MusicCellViewModel f137736a;

        /* renamed from: b */
        final /* synthetic */ String f137737b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f137738c;

        /* renamed from: d */
        final /* synthetic */ int f137739d;

        /* renamed from: e */
        final /* synthetic */ boolean f137740e;

        static {
            Covode.recordClassIndex(71082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60529c(MusicCellViewModel musicCellViewModel, String str, MusicModel musicModel, int i, boolean z) {
            super(1);
            this.f137736a = musicCellViewModel;
            this.f137737b = str;
            this.f137738c = musicModel;
            this.f137739d = i;
            this.f137740e = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v0, types: [boolean, int] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem.C60590k invoke(com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem.C60590k r22) {
            /*
            // Method dump skipped, instructions count: 266
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel.C60529c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo98081a(MusicModel musicModel, String str, int i, boolean z) {
        C89219l.m154721d(musicModel, "");
        mo20662a(new C60529c(this, str, musicModel, i, z));
    }
}
