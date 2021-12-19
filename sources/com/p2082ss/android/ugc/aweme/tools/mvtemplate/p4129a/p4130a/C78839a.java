package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65401cn;
import com.p2082ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78854d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78857a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c.C78862b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c.C78863c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c.C78864d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c.C78866e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d.C78870a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d.C78871b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d.C78873c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d.C78876d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d.C78879e;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a */
public final class C78839a {

    /* renamed from: e */
    public static final C78840a f177206e = new C78840a((byte) 0);

    /* renamed from: a */
    public volatile boolean f177207a;

    /* renamed from: b */
    public MvThemeData f177208b;

    /* renamed from: c */
    final AbstractC63154aa f177209c = ((AbstractC63154aa) C63244g.m114602a().mo73291s());

    /* renamed from: d */
    public final ActivityC0945e f177210d;

    /* renamed from: f */
    private final SafeHandler f177211f;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$d */
    public static final class C78843d {

        /* renamed from: b */
        public static final C78844a f177227b = new C78844a((byte) 0);

        /* renamed from: a */
        public final int f177228a;

        static {
            Covode.recordClassIndex(91992);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$d$a */
        public static final class C78844a {
            static {
                Covode.recordClassIndex(91993);
            }

            private C78844a() {
            }

            public /* synthetic */ C78844a(byte b) {
                this();
            }

            /* renamed from: a */
            public static C78843d m137638a(int i) {
                int i2 = 1;
                if (i != 1) {
                    i2 = 0;
                }
                return new C78843d(i2);
            }
        }

        public C78843d(int i) {
            this.f177228a = i;
        }
    }

    static {
        Covode.recordClassIndex(91988);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$a */
    public static final class C78840a {
        static {
            Covode.recordClassIndex(91989);
        }

        private C78840a() {
        }

        /* renamed from: a */
        public static MusicModel m137633a() {
            MusicModel musicModel = new MusicModel();
            musicModel.setId(Long.MIN_VALUE);
            return musicModel;
        }

        public /* synthetic */ C78840a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo122692a() {
        this.f177211f.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$b */
    public final class C78841b implements AbstractC78852b {

        /* renamed from: a */
        public final AbstractC78854d f177212a;

        /* renamed from: b */
        public final MvThemeData f177213b;

        /* renamed from: c */
        final /* synthetic */ C78839a f177214c;

        static {
            Covode.recordClassIndex(91990);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b
        /* renamed from: a */
        public final void mo122694a() {
            AbstractC78854d dVar;
            if (!this.f177214c.f177207a && (dVar = this.f177212a) != null) {
                dVar.mo122700a(this.f177213b, null, null, false, false);
            }
            this.f177214c.mo122692a();
        }

        public C78841b(C78839a aVar, AbstractC78854d dVar, MvThemeData mvThemeData) {
            C89219l.m154721d(mvThemeData, "");
            this.f177214c = aVar;
            this.f177212a = dVar;
            this.f177213b = mvThemeData;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b
        /* renamed from: a */
        public final void mo122695a(MusicModel musicModel, String str, boolean z) {
            AbstractC78854d dVar;
            C89219l.m154721d(musicModel, "");
            C89219l.m154721d(str, "");
            if (!this.f177214c.f177207a && (dVar = this.f177212a) != null) {
                dVar.mo122700a(this.f177213b, musicModel, str, z, false);
            }
            this.f177214c.mo122692a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$c */
    public final class C78842c implements AbstractC78853c {

        /* renamed from: a */
        public final C78899d f177215a;

        /* renamed from: b */
        public final String f177216b;

        /* renamed from: c */
        public final AbstractC78854d f177217c;

        /* renamed from: d */
        public final List<String> f177218d;

        /* renamed from: e */
        public final String f177219e;

        /* renamed from: f */
        public final String f177220f;

        /* renamed from: g */
        public final MusicModel f177221g;

        /* renamed from: h */
        public final boolean f177222h;

        /* renamed from: i */
        public final String f177223i;

        /* renamed from: j */
        public final IPhotoPreDownloadMusic f177224j;

        /* renamed from: k */
        public final C78843d f177225k;

        /* renamed from: l */
        final /* synthetic */ C78839a f177226l;

        static {
            Covode.recordClassIndex(91991);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122696a() {
            AbstractC78854d dVar;
            if (!this.f177226l.f177207a && (dVar = this.f177217c) != null) {
                dVar.mo122699a();
            }
            this.f177226l.mo122692a();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122697a(MvThemeData mvThemeData) {
            boolean z;
            AbstractC63154aa.AbstractC63157c k;
            MusicModel c;
            C89219l.m154721d(mvThemeData, "");
            this.f177226l.f177208b = mvThemeData;
            String str = this.f177216b;
            C78857a aVar = new C78857a();
            if (C89219l.m154714a((Object) "singlepiceffect", (Object) str)) {
                aVar.mo122703a(mvThemeData);
            } else if (C89219l.m154714a((Object) "slideshoweffect", (Object) str)) {
                aVar.mo122705b(mvThemeData);
            }
            C78839a aVar2 = this.f177226l;
            C78899d dVar = this.f177215a;
            AbstractC78854d dVar2 = this.f177217c;
            List<String> list = this.f177218d;
            String str2 = this.f177219e;
            String str3 = this.f177220f;
            MusicModel musicModel = this.f177221g;
            boolean z2 = this.f177222h;
            String str4 = this.f177223i;
            IPhotoPreDownloadMusic iPhotoPreDownloadMusic = this.f177224j;
            if (this.f177225k.f177228a == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!C65401cn.m117102b() || C89219l.m154714a((Object) str4, (Object) "photo_shoot") || C89219l.m154714a((Object) str4, (Object) "photo_anchor") || C89219l.m154714a((Object) str4, (Object) "no_change_music")) {
                aVar2.mo122690a(dVar, dVar2, list, str2, mvThemeData, str3, musicModel, iPhotoPreDownloadMusic, z).mo122701a(null);
            } else if (list != null) {
                AbstractC63154aa aaVar = aVar2.f177209c;
                if (aaVar == null || (k = aaVar.mo101552k()) == null || (c = k.mo101569c()) == null || z2) {
                    aVar2.mo122690a(dVar, dVar2, list, str2, mvThemeData, str3, musicModel, iPhotoPreDownloadMusic, z).mo122701a(null);
                    return;
                }
                C78841b bVar = new C78841b(aVar2, dVar2, mvThemeData);
                C78859b bVar2 = new C78859b(dVar, new WeakReference(aVar2.f177210d), null, bVar, list, str2, str3, musicModel);
                bVar2.f177245b = c;
                bVar2.f177248e = z;
                C78862b bVar3 = new C78862b(bVar2);
                bVar3.f177238a = new C78864d(new C78859b(dVar, new WeakReference(aVar2.f177210d), null, bVar, list, str2, 448));
                bVar3.mo122701a(null);
            }
        }

        public C78842c(C78839a aVar, C78899d dVar, String str, AbstractC78854d dVar2, List<String> list, String str2, String str3, MusicModel musicModel, boolean z, String str4, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, C78843d dVar3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(dVar3, "");
            this.f177226l = aVar;
            this.f177215a = dVar;
            this.f177216b = str;
            this.f177217c = dVar2;
            this.f177218d = list;
            this.f177219e = str2;
            this.f177220f = str3;
            this.f177221g = musicModel;
            this.f177222h = z;
            this.f177223i = str4;
            this.f177224j = iPhotoPreDownloadMusic;
            this.f177225k = dVar3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$j */
    public static final class RunnableC78850j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78839a f177235a;

        /* renamed from: b */
        final /* synthetic */ C78899d f177236b;

        /* renamed from: c */
        final /* synthetic */ AbstractC78854d f177237c;

        static {
            Covode.recordClassIndex(91999);
        }

        RunnableC78850j(C78839a aVar, C78899d dVar, AbstractC78854d dVar2) {
            this.f177235a = aVar;
            this.f177236b = dVar;
            this.f177237c = dVar2;
        }

        public final void run() {
            this.f177235a.f177207a = true;
            C78899d dVar = this.f177236b;
            if (dVar != null) {
                int i = dVar.f177318a;
                int i2 = 4;
                if (i == 1) {
                    i2 = 2;
                } else if (i != 2) {
                    if (i == 3) {
                        i2 = 6;
                    } else if (i == 4) {
                        i2 = 8;
                    } else if (i != 5) {
                        i2 = 0;
                    } else {
                        i2 = 9;
                    }
                }
                dVar.f177328k = i2;
            }
            if (this.f177235a.f177208b == null) {
                AbstractC78854d dVar2 = this.f177237c;
                if (dVar2 != null) {
                    dVar2.mo122699a();
                }
            } else if (!C65401cn.m117102b() || !(this.f177235a.f177210d instanceof AbstractC72264w)) {
                AbstractC78854d dVar3 = this.f177237c;
                if (dVar3 != null) {
                    MvThemeData mvThemeData = this.f177235a.f177208b;
                    if (mvThemeData == null) {
                        C89219l.m154715b();
                    }
                    dVar3.mo122700a(mvThemeData, null, null, false, false);
                }
            } else {
                ActivityC0945e eVar = this.f177235a.f177210d;
                Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPreDownloadMusic");
                AbstractC72264w.C72265a e = ((AbstractC72264w) eVar).mo114265e();
                if (e.mo114486a()) {
                    AbstractC78854d dVar4 = this.f177237c;
                    if (dVar4 != null) {
                        MvThemeData mvThemeData2 = this.f177235a.f177208b;
                        if (mvThemeData2 == null) {
                            C89219l.m154715b();
                        }
                        dVar4.mo122700a(mvThemeData2, e.f162000a, e.f162001b, false, true);
                        return;
                    }
                    return;
                }
                AbstractC78854d dVar5 = this.f177237c;
                if (dVar5 != null) {
                    MvThemeData mvThemeData3 = this.f177235a.f177208b;
                    if (mvThemeData3 == null) {
                        C89219l.m154715b();
                    }
                    dVar5.mo122700a(mvThemeData3, null, null, false, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$e */
    public static final class C78845e implements AbstractC78853c {

        /* renamed from: a */
        final /* synthetic */ C78857a f177229a;

        static {
            Covode.recordClassIndex(91994);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122696a() {
        }

        public C78845e(C78857a aVar) {
            this.f177229a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122697a(MvThemeData mvThemeData) {
            C89219l.m154721d(mvThemeData, "");
            this.f177229a.mo122705b(mvThemeData);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$f */
    public static final class C78846f implements AbstractC78853c {

        /* renamed from: a */
        final /* synthetic */ C78857a f177230a;

        static {
            Covode.recordClassIndex(91995);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122696a() {
        }

        public C78846f(C78857a aVar) {
            this.f177230a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122697a(MvThemeData mvThemeData) {
            C89219l.m154721d(mvThemeData, "");
            this.f177230a.mo122703a(mvThemeData);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$g */
    public static final class C78847g implements AbstractC78853c {

        /* renamed from: a */
        final /* synthetic */ C78857a f177231a;

        static {
            Covode.recordClassIndex(91996);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122696a() {
        }

        public C78847g(C78857a aVar) {
            this.f177231a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122697a(MvThemeData mvThemeData) {
            C89219l.m154721d(mvThemeData, "");
            this.f177231a.mo122705b(mvThemeData);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$h */
    public static final class C78848h implements AbstractC78853c {

        /* renamed from: a */
        final /* synthetic */ C78857a f177232a;

        static {
            Covode.recordClassIndex(91997);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122696a() {
        }

        public C78848h(C78857a aVar) {
            this.f177232a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122697a(MvThemeData mvThemeData) {
            C89219l.m154721d(mvThemeData, "");
            this.f177232a.mo122703a(mvThemeData);
        }
    }

    public C78839a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f177210d = eVar;
        this.f177211f = new SafeHandler(eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$i */
    public static final class C78849i implements AbstractC78853c {

        /* renamed from: a */
        final /* synthetic */ String f177233a;

        /* renamed from: b */
        final /* synthetic */ C78857a f177234b;

        static {
            Covode.recordClassIndex(91998);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122696a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c
        /* renamed from: a */
        public final void mo122697a(MvThemeData mvThemeData) {
            C89219l.m154721d(mvThemeData, "");
            if (C89219l.m154714a((Object) "singlepiceffect", (Object) this.f177233a)) {
                this.f177234b.mo122703a(mvThemeData);
            } else if (C89219l.m154714a((Object) "slideshoweffect", (Object) this.f177233a)) {
                this.f177234b.mo122705b(mvThemeData);
            }
        }

        public C78849i(String str, C78857a aVar) {
            this.f177233a = str;
            this.f177234b = aVar;
        }
    }

    /* renamed from: a */
    private final void m137627a(AbstractC78854d dVar, C78899d dVar2) {
        this.f177207a = false;
        this.f177211f.postDelayed(new RunnableC78850j(this, dVar2, dVar), 5000);
    }

    /* renamed from: a */
    public final AbstractC78851a mo122689a(C78899d dVar, MusicModel musicModel, AbstractC78852b bVar, List<String> list, String str) {
        C78859b bVar2 = new C78859b(dVar, new WeakReference(this.f177210d), null, bVar, list, str, 448);
        bVar2.f177245b = musicModel;
        C78866e eVar = new C78866e(bVar2);
        eVar.f177238a = new C78864d(bVar2);
        return eVar;
    }

    /* renamed from: a */
    public final AbstractC78851a mo122691a(C78899d dVar, String str, String str2, boolean z, AbstractC78853c cVar) {
        C78859b bVar = new C78859b(dVar, new WeakReference(this.f177210d), cVar, null, null, null, 504);
        bVar.f177244a = str;
        C78879e eVar = new C78879e(str2, bVar);
        C78876d dVar2 = new C78876d(str2, bVar);
        C78871b bVar2 = new C78871b(bVar);
        C78873c cVar2 = new C78873c(bVar);
        eVar.f177238a = dVar2;
        dVar2.f177238a = bVar2;
        bVar2.f177238a = cVar2;
        if (!z) {
            return eVar;
        }
        C78870a aVar = new C78870a(str2, bVar);
        aVar.f177238a = eVar;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC78851a mo122690a(C78899d dVar, AbstractC78854d dVar2, List<String> list, String str, MvThemeData mvThemeData, String str2, MusicModel musicModel, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, boolean z) {
        C78841b bVar = new C78841b(this, dVar2, mvThemeData);
        C78859b bVar2 = new C78859b(dVar, new WeakReference(this.f177210d), null, bVar, list, str, str2, musicModel);
        bVar2.f177247d = iPhotoPreDownloadMusic;
        bVar2.f177248e = z;
        C78863c cVar = new C78863c(bVar2);
        cVar.f177238a = mo122689a(dVar, (MusicModel) null, bVar, list, str);
        return cVar;
    }

    /* renamed from: a */
    public final void mo122693a(String str, AbstractC78854d dVar, List<String> list, String str2, String str3, MusicModel musicModel, C78899d dVar2, boolean z, String str4, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, C78843d dVar3) {
        String str5;
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar3, "");
        m137627a(dVar, dVar2);
        this.f177208b = null;
        if (dVar2 != null) {
            str5 = dVar2.f177327j;
        } else {
            str5 = null;
        }
        mo122691a(dVar2, str5, str, true, (AbstractC78853c) new C78842c(this, dVar2, str, dVar, list, str2, str3, musicModel, z, str4, null, dVar3)).mo122701a(null);
    }
}
