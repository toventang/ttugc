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
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a */
public final class C68279a extends AbstractView$OnClickListenerC68297d {
    static {
        Covode.recordClassIndex(80493);
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
    /* renamed from: f */
    public final void mo108767f() {
        mo108770a(R.string.fni);
        mo108771a("CACHE");
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
        View i = mo108775i();
        return new C34796d(mo108768a(R.string.fni, new Object[0]), null, this, null, false, mo108776j(), i, false, null, false, mo108768a(R.string.fn_, new Object[0]), false, null, 127898);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a */
    public static final class C68280a implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C68279a f152853a;

        static {
            Covode.recordClassIndex(80494);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68280a(C68279a aVar) {
            this.f152853a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a$b */
        static final class C68282b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C68280a f152855a;

            static {
                Covode.recordClassIndex(80496);
            }

            C68282b(C68280a aVar) {
                this.f152855a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C1213t<Integer> tVar;
                DiskViewModel h = this.f152855a.f152853a.mo108774h();
                if (!(h == null || (tVar = h.f152851b) == null)) {
                    tVar.setValue(0);
                }
                this.f152855a.f152853a.mo70126a(new AbstractC89172b<C34796d, C34796d>(this) {
                    /* class com.p2082ss.android.ugc.aweme.setting.page.diskmanager.C68279a.C68280a.C68282b.C682831 */

                    /* renamed from: a */
                    final /* synthetic */ C68282b f152856a;

                    static {
                        Covode.recordClassIndex(80497);
                    }

                    {
                        this.f152856a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34796d invoke(C34796d dVar) {
                        C34796d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C34796d.m71048a(dVar2, this.f152856a.f152855a.f152853a.mo108768a(R.string.fnh, Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a$c */
        static final class C68284c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C68280a f152857a;

            static {
                Covode.recordClassIndex(80498);
            }

            C68284c(C68280a aVar) {
                this.f152857a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C1213t<Integer> tVar;
                DiskViewModel h = this.f152857a.f152853a.mo108774h();
                if (!(h == null || (tVar = h.f152851b) == null)) {
                    tVar.setValue(0);
                }
                this.f152857a.f152853a.mo70126a(new AbstractC89172b<C34796d, C34796d>(this) {
                    /* class com.p2082ss.android.ugc.aweme.setting.page.diskmanager.C68279a.C68280a.C68284c.C682851 */

                    /* renamed from: a */
                    final /* synthetic */ C68284c f152858a;

                    static {
                        Covode.recordClassIndex(80499);
                    }

                    {
                        this.f152858a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34796d invoke(C34796d dVar) {
                        C34796d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C34796d.m71048a(dVar2, this.f152858a.f152857a.f152853a.mo108768a(R.string.fnh, Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a$a */
        static final class C68281a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C68281a f152854a = new C68281a();

            static {
                Covode.recordClassIndex(80495);
            }

            C68281a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                String str;
                C89219l.m154721d(obj, "");
                C51423a.m95792b("clear-cache", "start clear temp cache with disk manager");
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
                        if (C89219l.m154714a((Object) "CACHE", (Object) str)) {
                            arrayList.add(t);
                        }
                    }
                    for (T t3 : arrayList) {
                        t3.mo38199b();
                    }
                }
                C51423a.m95792b("clear-cache", "finish clear temp cache with disk manager");
                return "";
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C1213t<Integer> tVar;
            C89219l.m154721d(aVar, "");
            DiskViewModel h = this.f152853a.mo108774h();
            if (!(h == null || (tVar = h.f152851b) == null)) {
                tVar.setValue(1);
            }
            AbstractC88979t.m154310b("").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C68281a.f152854a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C68282b(this), new C68284c(this));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68279a(AbstractC68195a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d
    /* renamed from: a */
    public final void mo108765a(View view) {
        C1213t<C89378p<Integer, AbstractC89172b<C23024a, C89391z>>> tVar;
        C89219l.m154721d(view, "");
        DiskViewModel h = mo108774h();
        if (!(h == null || (tVar = h.f152852c) == null)) {
            tVar.setValue(C89387v.m154943a(Integer.valueOf((int) R.string.fmw), new C68280a(this)));
        }
        C39162r.onEventV3("clean_temp_file");
    }
}
