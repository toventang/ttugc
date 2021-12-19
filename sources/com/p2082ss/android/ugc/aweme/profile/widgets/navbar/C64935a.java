package com.p2082ss.android.ugc.aweme.profile.widgets.navbar;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64944d;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64964j;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC64966a;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65024b;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64983c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64986d;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64989e;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64993f;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C65008i;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C65017k;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a */
public final class C64935a extends C64945e {
    static {
        Covode.recordClassIndex(76403);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a$b */
    static final class C64937b extends AbstractC89220m implements AbstractC89172b<C64944d<EnumC64966a>, C89391z> {

        /* renamed from: a */
        public static final C64937b f146757a = new C64937b();

        static {
            Covode.recordClassIndex(76405);
        }

        C64937b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C64944d<EnumC64966a> dVar) {
            C64944d<EnumC64966a> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo104274a(EnumC64966a.Nickname, C89204ab.m154669a(C64993f.class));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a$c */
    static final class C64938c extends AbstractC89220m implements AbstractC89172b<C64944d<EnumC65024b>, C89391z> {

        /* renamed from: a */
        public static final C64938c f146758a = new C64938c();

        static {
            Covode.recordClassIndex(76406);
        }

        C64938c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C64944d<EnumC65024b> dVar) {
            C64944d<EnumC65024b> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo104274a(EnumC65024b.LiveEvent, C89204ab.m154669a(C64989e.class));
            dVar2.mo104274a(EnumC65024b.Setting, C89204ab.m154669a(C65008i.class));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        C64964j.m116725a(this, C64936a.f146756a);
        C64964j.m116726b(this, C64937b.f146757a);
        C64964j.m116727c(this, C64938c.f146758a);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a$a */
    static final class C64936a extends AbstractC89220m implements AbstractC89172b<C64944d<EnumC65077d>, C89391z> {

        /* renamed from: a */
        public static final C64936a f146756a = new C64936a();

        static {
            Covode.recordClassIndex(76404);
        }

        C64936a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C64944d<EnumC65077d> dVar) {
            C64944d<EnumC65077d> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo104274a(EnumC65077d.Back, C89204ab.m154669a(C64983c.class));
            dVar2.mo104274a(EnumC65077d.FindFriends, C89204ab.m154669a(C64986d.class));
            dVar2.mo104274a(EnumC65077d.SuggestBA, C89204ab.m154669a(C65017k.class));
            dVar2.mo104274a(EnumC65077d.Activity, C89204ab.m154669a(C64967a.class));
            return C89391z.f203057a;
        }
    }
}
