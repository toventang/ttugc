package com.p2082ss.android.ugc.aweme.music.search;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.search.d */
public final class C60958d extends C17372a implements AbstractC60416h {

    /* renamed from: e */
    public static final C60959a f138448e = new C60959a((byte) 0);

    /* renamed from: f */
    private SparseArray f138449f;

    static {
        Covode.recordClassIndex(71549);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f138449f == null) {
            this.f138449f = new SparseArray();
        }
        View view = (View) this.f138449f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f138449f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f138449f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.d$a */
    public static final class C60959a {
        static {
            Covode.recordClassIndex(71550);
        }

        private C60959a() {
        }

        public /* synthetic */ C60959a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m110533a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.p2082ss.android.ugc.aweme.music.assem.C60394b mo20658e() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.music.assem.b r2 = new com.ss.android.ugc.aweme.music.assem.b
            android.os.Bundle r1 = r10.getArguments()
            r8 = 0
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "user_id"
            java.lang.String r3 = r1.getString(r0)
        L_0x000f:
            android.os.Bundle r1 = r10.getArguments()
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "sec_user_id"
            java.lang.String r4 = r1.getString(r0)
        L_0x001b:
            r0 = 1
            com.ss.android.ugc.aweme.experiment.ProfileMusicTabConfig r0 = com.p2082ss.android.ugc.aweme.experiment.C46936fm.m90230a()
            boolean r0 = r0.getEnablePin()
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            int r1 = r0.getAccountType()
            r0 = 3
            if (r1 == r0) goto L_0x0058
            r0 = 1
            r6 = 1
        L_0x003f:
            r0 = 1
            android.os.Bundle r1 = r10.getArguments()
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "pinned_music_list"
            java.io.Serializable r8 = r1.getSerializable(r0)
        L_0x004c:
            com.ss.android.ugc.aweme.music.model.PinnedMusicList r8 = (com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList) r8
            r0 = 64
            r5 = 1
            r7 = 1
            r9 = 64
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0058:
            r0 = 0
            r6 = 0
            goto L_0x003f
        L_0x005b:
            r4 = r8
            goto L_0x001b
        L_0x005d:
            r3 = r8
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.search.C60958d.mo20658e():com.bytedance.assem.arch.service.a");
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.d$b */
    static final class C60960b extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C60960b f138450a = new C60960b();

        static {
            Covode.recordClassIndex(71551);
        }

        C60960b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C609611.f138451a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C60960b.f138450a);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.d$c */
    static final class C60962c extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60958d f138452a;

        /* renamed from: b */
        final /* synthetic */ SearchMusicArg f138453b;

        static {
            Covode.recordClassIndex(71553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60962c(C60958d dVar, SearchMusicArg searchMusicArg) {
            super(1);
            this.f138452a = dVar;
            this.f138453b = searchMusicArg;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f138452a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.search.C60958d.C60962c.C609631 */

                /* renamed from: a */
                final /* synthetic */ C60962c f138454a;

                static {
                    Covode.recordClassIndex(71554);
                }

                {
                    this.f138454a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(this.f138454a.f138453b);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f138452a, C609642.f138455a);
            assembler2.mo20582b(this.f138452a, C609653.f138456a);
            assembler2.mo20582b(this.f138452a, C609664.f138457a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_me", false);
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        Serializable serializable = null;
        if (arguments2 != null) {
            str = arguments2.getString("user_id");
        } else {
            str = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("sec_user_id");
        } else {
            str2 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("previous_page");
        } else {
            str3 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            serializable = arguments5.getSerializable("pinned_music_list");
        }
        C12780d.m23005a(this, new C60962c(this, new SearchMusicArg(z, str, str2, str3, (PinnedMusicList) serializable)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.anf, viewGroup, false);
    }
}
