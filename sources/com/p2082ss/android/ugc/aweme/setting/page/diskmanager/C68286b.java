package com.p2082ss.android.ugc.aweme.setting.page.diskmanager;

import android.view.View;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.AbstractC23430a;
import com.bytedance.p1733u.C23435d;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b */
public final class C68286b extends AbstractView$OnClickListenerC68297d {
    static {
        Covode.recordClassIndex(80500);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34796d mo70128b() {
        return mo70128b();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: d */
    public final /* synthetic */ C34796d mo70131d() {
        return mo70131d();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d
    /* renamed from: e */
    public final C34796d mo108766e() {
        C34796d e = super.mo70131d();
        mo108776j().setText(mo108768a(R.string.fmu, new Object[0]));
        mo108777k();
        return e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c
    /* renamed from: a */
    public final C34796d mo70133a() {
        return new C34796d(mo108768a(R.string.fn0, new Object[0]), null, this, null, false, mo108776j(), mo108775i(), false, null, true, mo108768a(R.string.fna, new Object[0]), false, null, 127898);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d
    /* renamed from: f */
    public final void mo108767f() {
        String str;
        mo108770a(R.string.fn0);
        mo108771a("RESOURCE");
        ArrayList<AbstractC23430a> arrayList = new ArrayList(C23435d.m44118b());
        int i = 0;
        if (!arrayList.isEmpty()) {
            for (AbstractC23430a aVar : arrayList) {
                if (aVar != null) {
                    str = aVar.mo38198a();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) "RESOURCE") && (i = i + 1) < 0) {
                    C89070n.m154523b();
                }
            }
        }
        mo70126a(new C68287a(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b */
    public static final class C68288b implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C68286b f152860a;

        static {
            Covode.recordClassIndex(80502);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68288b(C68286b bVar) {
            this.f152860a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b$b */
        static final class C68290b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C68288b f152862a;

            static {
                Covode.recordClassIndex(80504);
            }

            C68290b(C68288b bVar) {
                this.f152862a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C1213t<Integer> tVar;
                DiskViewModel h = this.f152862a.f152860a.mo108774h();
                if (!(h == null || (tVar = h.f152851b) == null)) {
                    tVar.setValue(0);
                }
                this.f152862a.f152860a.mo70126a(new AbstractC89172b<C34796d, C34796d>(this) {
                    /* class com.p2082ss.android.ugc.aweme.setting.page.diskmanager.C68286b.C68288b.C68290b.C682911 */

                    /* renamed from: a */
                    final /* synthetic */ C68290b f152863a;

                    static {
                        Covode.recordClassIndex(80505);
                    }

                    {
                        this.f152863a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34796d invoke(C34796d dVar) {
                        C34796d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C34796d.m71048a(dVar2, this.f152863a.f152862a.f152860a.mo108768a(R.string.fmy, Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b$c */
        static final class C68292c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C68288b f152864a;

            static {
                Covode.recordClassIndex(80506);
            }

            C68292c(C68288b bVar) {
                this.f152864a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C1213t<Integer> tVar;
                DiskViewModel h = this.f152864a.f152860a.mo108774h();
                if (!(h == null || (tVar = h.f152851b) == null)) {
                    tVar.setValue(0);
                }
                this.f152864a.f152860a.mo70126a(new AbstractC89172b<C34796d, C34796d>(this) {
                    /* class com.p2082ss.android.ugc.aweme.setting.page.diskmanager.C68286b.C68288b.C68292c.C682931 */

                    /* renamed from: a */
                    final /* synthetic */ C68292c f152865a;

                    static {
                        Covode.recordClassIndex(80507);
                    }

                    {
                        this.f152865a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34796d invoke(C34796d dVar) {
                        C34796d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C34796d.m71048a(dVar2, this.f152865a.f152864a.f152860a.mo108768a(R.string.fmy, Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b$a */
        static final class C68289a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C68289a f152861a = new C68289a();

            static {
                Covode.recordClassIndex(80503);
            }

            C68289a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                String str;
                C89219l.m154721d(obj, "");
                C51423a.m95792b("clear-cache", "start clear resource cache with disk manager");
                List<AbstractC23430a> b = C23435d.m44118b();
                if (b != null) {
                    ArrayList<T> arrayList = new ArrayList();
                    for (T t : b) {
                        T t2 = t;
                        if (t2 != null) {
                            str = t2.mo38198a();
                        } else {
                            str = null;
                        }
                        if (C89219l.m154714a((Object) "RESOURCE", (Object) str)) {
                            arrayList.add(t);
                        }
                    }
                    for (T t3 : arrayList) {
                        t3.mo38199b();
                    }
                }
                C51423a.m95792b("clear-cache", "finish clear resource cache with disk manager");
                return "";
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C1213t<Integer> tVar;
            C89219l.m154721d(aVar, "");
            DiskViewModel h = this.f152860a.mo108774h();
            if (!(h == null || (tVar = h.f152851b) == null)) {
                tVar.setValue(1);
            }
            AbstractC88979t.m154310b("").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C68289a.f152861a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C68290b(this), new C68292c(this));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68286b(AbstractC68195a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$a */
    static final class C68287a extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        final /* synthetic */ int f152859a;

        static {
            Covode.recordClassIndex(80501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68287a(int i) {
            super(1);
            this.f152859a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            boolean z;
            C34796d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (this.f152859a > 0) {
                z = true;
            } else {
                z = false;
            }
            return C34796d.m71048a(dVar2, null, null, null, null, z, null, null, null, false, null, false, null, false, false, null, false, 0, 131055);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d
    /* renamed from: a */
    public final void mo108765a(View view) {
        C1213t<C89378p<Integer, AbstractC89172b<C23024a, C89391z>>> tVar;
        C89219l.m154721d(view, "");
        DiskViewModel h = mo108774h();
        if (!(h == null || (tVar = h.f152852c) == null)) {
            tVar.setValue(C89387v.m154943a(Integer.valueOf((int) R.string.fmv), new C68288b(this)));
        }
        C39162r.onEventV3("clean_resource_file");
    }
}
