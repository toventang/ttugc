package com.p2082ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel */
public final class ProfileStoryRingViewModel extends AssemViewModel<C76587p> {

    /* renamed from: m */
    public static final C76489a f171771m = new C76489a((byte) 0);

    /* renamed from: j */
    public boolean f171772j;

    /* renamed from: k */
    public User f171773k;

    /* renamed from: l */
    boolean f171774l = true;

    static {
        Covode.recordClassIndex(89470);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel$a */
    public static final class C76489a {
        static {
            Covode.recordClassIndex(89471);
        }

        private C76489a() {
        }

        public /* synthetic */ C76489a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C76587p mo20674f() {
        return new C76587p();
    }

    /* renamed from: g */
    public final String mo23342g() {
        if (this.f171772j) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: a */
    public final void mo120227a(String str) {
        C89219l.m154721d(str, "");
        mo20662a(new C76490b(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel$b */
    public static final class C76490b extends AbstractC89220m implements AbstractC89172b<C76587p, C76587p> {

        /* renamed from: a */
        final /* synthetic */ String f171775a;

        static {
            Covode.recordClassIndex(89472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76490b(String str) {
            super(1);
            this.f171775a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76587p invoke(C76587p pVar) {
            C89219l.m154721d(pVar, "");
            C12776a aVar = new C12776a(this.f171775a);
            C89219l.m154721d(aVar, "");
            return new C76587p(aVar);
        }
    }
}
