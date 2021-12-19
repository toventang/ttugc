package com.p2082ss.android.ugc.aweme.profile.widgets.navbar;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64944d;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64964j;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC64966a;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65024b;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65025a;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65028b;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65052f;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3604b.C65072i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.c */
public final class C65078c extends C64945e {
    static {
        Covode.recordClassIndex(76546);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.c$a */
    static final class C65079a extends AbstractC89220m implements AbstractC89172b<C64944d<EnumC65077d>, C89391z> {

        /* renamed from: a */
        public static final C65079a f146929a = new C65079a();

        static {
            Covode.recordClassIndex(76547);
        }

        C65079a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C64944d<EnumC65077d> dVar) {
            C64944d<EnumC65077d> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo104274a(EnumC65077d.Back, C89204ab.m154669a(C65025a.class));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.c$b */
    static final class C65080b extends AbstractC89220m implements AbstractC89172b<C64944d<EnumC64966a>, C89391z> {

        /* renamed from: a */
        public static final C65080b f146930a = new C65080b();

        static {
            Covode.recordClassIndex(76548);
        }

        C65080b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C64944d<EnumC64966a> dVar) {
            C64944d<EnumC64966a> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo104274a(EnumC64966a.Nickname, C89204ab.m154669a(C65072i.class));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.c$c */
    static final class C65081c extends AbstractC89220m implements AbstractC89172b<C64944d<EnumC65024b>, C89391z> {

        /* renamed from: a */
        public static final C65081c f146931a = new C65081c();

        static {
            Covode.recordClassIndex(76549);
        }

        C65081c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C64944d<EnumC65024b> dVar) {
            C64944d<EnumC65024b> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo104274a(EnumC65024b.Bell, C89204ab.m154669a(C65028b.class));
            dVar2.mo104274a(EnumC65024b.More, C89204ab.m154669a(C65052f.class));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        C64964j.m116725a(this, C65079a.f146929a);
        C64964j.m116726b(this, C65080b.f146930a);
        C64964j.m116727c(this, C65081c.f146931a);
    }
}
