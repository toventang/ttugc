package com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.api.C82740a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.api.C82741b;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.api.C82742c;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationSearchApi;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82770a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82772c;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82773d;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82774e;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82775f;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel */
public final class OrganizationListViewModel extends JediViewModel<OrganizationListState> {

    /* renamed from: f */
    public static final C82794a f185067f = new C82794a((byte) 0);

    /* renamed from: a */
    public int f185068a;

    /* renamed from: b */
    public int f185069b = 1;

    /* renamed from: c */
    public List<C82772c> f185070c = new ArrayList();

    /* renamed from: d */
    public String f185071d;

    /* renamed from: e */
    public List<C82774e> f185072e = new ArrayList();

    static {
        Covode.recordClassIndex(96645);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$a */
    public static final class C82794a {
        static {
            Covode.recordClassIndex(96646);
        }

        private C82794a() {
        }

        public /* synthetic */ C82794a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo127858a() {
        mo127862g();
        mo127859a(false);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ OrganizationListState mo23027d() {
        return new OrganizationListState(null, 1, null);
    }

    /* renamed from: b */
    public final void mo127860b() {
        mo33689c(C82808i.f185093a);
        mo127858a();
    }

    /* renamed from: g */
    public final void mo127862g() {
        this.f185070c.clear();
        this.f185068a = 0;
        this.f185069b = 1;
        this.f185071d = null;
        this.f185072e.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$d */
    public static final class C82799d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f185080a;

        /* renamed from: b */
        final /* synthetic */ boolean f185081b;

        static {
            Covode.recordClassIndex(96651);
        }

        C82799d(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f185080a = organizationListViewModel;
            this.f185081b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C40970e.m82487a((Throwable) obj);
            this.f185080a.mo33689c(new AbstractC89172b<OrganizationListState, OrganizationListState>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.C82799d.C828001 */

                /* renamed from: a */
                final /* synthetic */ C82799d f185082a;

                static {
                    Covode.recordClassIndex(96652);
                }

                {
                    this.f185082a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    C89219l.m154721d(organizationListState2, "");
                    List<C82772c> list = this.f185082a.f185080a.f185070c;
                    boolean z2 = this.f185082a.f185081b;
                    if (this.f185082a.f185080a.f185069b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new C82809a(null, false, null, list, null, null, false, false, z2, z, LiveFeedRefreshTimeSetting.DEFAULT));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$g */
    public static final class C82805g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f185089a;

        /* renamed from: b */
        final /* synthetic */ boolean f185090b;

        static {
            Covode.recordClassIndex(96657);
        }

        C82805g(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f185089a = organizationListViewModel;
            this.f185090b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C40970e.m82487a((Throwable) obj);
            this.f185089a.mo33689c(new AbstractC89172b<OrganizationListState, OrganizationListState>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.C82805g.C828061 */

                /* renamed from: a */
                final /* synthetic */ C82805g f185091a;

                static {
                    Covode.recordClassIndex(96658);
                }

                {
                    this.f185091a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    C89219l.m154721d(organizationListState2, "");
                    List<C82774e> list = this.f185091a.f185089a.f185072e;
                    String str = this.f185091a.f185089a.f185071d;
                    boolean z2 = this.f185091a.f185090b;
                    if (this.f185091a.f185089a.f185069b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new C82809a(str, true, list, null, null, null, false, false, z2, z, 184));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$h */
    public static final class C82807h extends AbstractC89220m implements AbstractC89172b<OrganizationListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f185092a;

        static {
            Covode.recordClassIndex(96659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82807h(OrganizationListViewModel organizationListViewModel) {
            super(1);
            this.f185092a = organizationListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrganizationListState organizationListState) {
            OrganizationListState organizationListState2 = organizationListState;
            C89219l.m154721d(organizationListState2, "");
            C82809a result = organizationListState2.getResult();
            if (result == null || !result.f185095b) {
                this.f185092a.mo127859a(true);
            } else {
                this.f185092a.mo127861b(true);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$i */
    public static final class C82808i extends AbstractC89220m implements AbstractC89172b<OrganizationListState, OrganizationListState> {

        /* renamed from: a */
        public static final C82808i f185093a = new C82808i();

        static {
            Covode.recordClassIndex(96660);
        }

        C82808i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
            OrganizationListState organizationListState2 = organizationListState;
            C89219l.m154721d(organizationListState2, "");
            return organizationListState2.copy(new C82809a(null, false, null, null, null, null, false, true, false, false, 56));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$b */
    public static final class C82795b extends AbstractC89220m implements AbstractC89172b<OrganizationListState, OrganizationListState> {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f185073a;

        /* renamed from: b */
        final /* synthetic */ boolean f185074b;

        static {
            Covode.recordClassIndex(96647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82795b(OrganizationListViewModel organizationListViewModel, boolean z) {
            super(1);
            this.f185073a = organizationListViewModel;
            this.f185074b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
            boolean z;
            OrganizationListState organizationListState2 = organizationListState;
            C89219l.m154721d(organizationListState2, "");
            List<C82772c> list = this.f185073a.f185070c;
            boolean z2 = this.f185074b;
            if (this.f185073a.f185069b == 1) {
                z = true;
            } else {
                z = false;
            }
            return organizationListState2.copy(new C82809a(null, false, null, list, null, null, true, false, z2, z, 181));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$c */
    public static final class C82796c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f185075a;

        /* renamed from: b */
        final /* synthetic */ boolean f185076b;

        static {
            Covode.recordClassIndex(96648);
        }

        C82796c(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f185075a = organizationListViewModel;
            this.f185076b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C82773d dVar = (C82773d) obj;
            if (dVar.error_code == 0) {
                this.f185075a.f185068a = dVar.f185024a;
                this.f185075a.f185069b = dVar.f185025b;
                List<C82772c> list = dVar.f185028e;
                if (list != null) {
                    this.f185075a.f185070c.addAll(list);
                }
                this.f185075a.mo33689c(new AbstractC89172b<OrganizationListState, OrganizationListState>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.C82796c.C827971 */

                    /* renamed from: a */
                    final /* synthetic */ C82796c f185077a;

                    static {
                        Covode.recordClassIndex(96649);
                    }

                    {
                        this.f185077a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                        boolean z;
                        OrganizationListState organizationListState2 = organizationListState;
                        C89219l.m154721d(organizationListState2, "");
                        List<C82772c> list = this.f185077a.f185075a.f185070c;
                        String str = dVar.f185026c;
                        C82770a aVar = dVar.f185027d;
                        boolean z2 = this.f185077a.f185076b;
                        if (this.f185077a.f185075a.f185069b == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return organizationListState2.copy(new C82809a(null, false, null, list, str, aVar, false, true, z2, z, 4));
                    }
                });
                return;
            }
            this.f185075a.mo33689c(new AbstractC89172b<OrganizationListState, OrganizationListState>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.C82796c.C827982 */

                /* renamed from: a */
                final /* synthetic */ C82796c f185079a;

                static {
                    Covode.recordClassIndex(96650);
                }

                {
                    this.f185079a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    C89219l.m154721d(organizationListState2, "");
                    List<C82772c> list = this.f185079a.f185075a.f185070c;
                    boolean z2 = this.f185079a.f185076b;
                    if (this.f185079a.f185075a.f185069b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new C82809a(null, false, null, list, null, null, false, false, z2, z, LiveFeedRefreshTimeSetting.DEFAULT));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$e */
    public static final class C82801e extends AbstractC89220m implements AbstractC89172b<OrganizationListState, OrganizationListState> {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f185083a;

        /* renamed from: b */
        final /* synthetic */ boolean f185084b;

        static {
            Covode.recordClassIndex(96653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82801e(OrganizationListViewModel organizationListViewModel, boolean z) {
            super(1);
            this.f185083a = organizationListViewModel;
            this.f185084b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
            boolean z;
            OrganizationListState organizationListState2 = organizationListState;
            C89219l.m154721d(organizationListState2, "");
            List<C82774e> list = this.f185083a.f185072e;
            String str = this.f185083a.f185071d;
            boolean z2 = this.f185084b;
            if (this.f185083a.f185069b == 1) {
                z = true;
            } else {
                z = false;
            }
            return organizationListState2.copy(new C82809a(str, true, list, null, null, null, true, false, z2, z, 184));
        }
    }

    /* renamed from: a */
    public final void mo127859a(boolean z) {
        mo33689c(new C82795b(this, z));
        C82740a.m142899a(new C82741b(this.f185068a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C82796c(this, z), new C82799d(this, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel$f */
    public static final class C82802f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OrganizationListViewModel f185085a;

        /* renamed from: b */
        final /* synthetic */ boolean f185086b;

        static {
            Covode.recordClassIndex(96654);
        }

        C82802f(OrganizationListViewModel organizationListViewModel, boolean z) {
            this.f185085a = organizationListViewModel;
            this.f185086b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int intValue;
            C82775f fVar = (C82775f) obj;
            if (fVar.error_code == 0) {
                OrganizationListViewModel organizationListViewModel = this.f185085a;
                int i = 0;
                if (fVar.f185037a == null) {
                    intValue = 0;
                } else {
                    intValue = fVar.f185037a.intValue();
                }
                organizationListViewModel.f185068a = intValue;
                OrganizationListViewModel organizationListViewModel2 = this.f185085a;
                if (fVar.f185038b != null && !C89219l.m154714a((Object) fVar.f185038b, (Object) false)) {
                    i = 1;
                }
                organizationListViewModel2.f185069b = i;
                List<C82774e> list = fVar.f185039c;
                if (list != null) {
                    this.f185085a.f185072e.addAll(list);
                }
                this.f185085a.mo33689c(new AbstractC89172b<OrganizationListState, OrganizationListState>(this) {
                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.C82802f.C828031 */

                    /* renamed from: a */
                    final /* synthetic */ C82802f f185087a;

                    static {
                        Covode.recordClassIndex(96655);
                    }

                    {
                        this.f185087a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                        boolean z;
                        OrganizationListState organizationListState2 = organizationListState;
                        C89219l.m154721d(organizationListState2, "");
                        List<C82774e> list = this.f185087a.f185085a.f185072e;
                        String str = this.f185087a.f185085a.f185071d;
                        boolean z2 = this.f185087a.f185086b;
                        if (this.f185087a.f185085a.f185069b == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return organizationListState2.copy(new C82809a(str, true, list, null, null, null, false, true, z2, z, 56));
                    }
                });
                return;
            }
            this.f185085a.mo33689c(new AbstractC89172b<OrganizationListState, OrganizationListState>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel.C82802f.C828042 */

                /* renamed from: a */
                final /* synthetic */ C82802f f185088a;

                static {
                    Covode.recordClassIndex(96656);
                }

                {
                    this.f185088a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ OrganizationListState invoke(OrganizationListState organizationListState) {
                    boolean z;
                    OrganizationListState organizationListState2 = organizationListState;
                    C89219l.m154721d(organizationListState2, "");
                    List<C82774e> list = this.f185088a.f185085a.f185072e;
                    String str = this.f185088a.f185085a.f185071d;
                    boolean z2 = this.f185088a.f185086b;
                    if (this.f185088a.f185085a.f185069b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return organizationListState2.copy(new C82809a(str, true, list, null, null, null, false, false, z2, z, 184));
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo127861b(boolean z) {
        mo33689c(new C82801e(this, z));
        C82742c.C82743a aVar = new C82742c.C82743a();
        if (z) {
            aVar.f184955a = this.f185068a;
        }
        aVar.f184957c = this.f185071d;
        OrganizationSearchApi.C82739a.m142898a(aVar.mo127735a()).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C82802f(this, z), new C82805g(this, z));
    }
}
