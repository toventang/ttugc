package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73755i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73756j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73461ak;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73545c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cs */
public final class C70006cs {

    /* renamed from: a */
    public static final C70007a f156500a = new C70007a((byte) 0);

    static {
        Covode.recordClassIndex(82420);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cs$a */
    public static final class C70007a {
        static {
            Covode.recordClassIndex(82421);
        }

        private C70007a() {
        }

        public /* synthetic */ C70007a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cs$b */
    public static final class C70008b {

        /* renamed from: a */
        public int f156501a;

        /* renamed from: b */
        public String f156502b;

        /* renamed from: c */
        public int f156503c;

        /* renamed from: d */
        public boolean f156504d;

        /* renamed from: e */
        public String f156505e;

        /* renamed from: f */
        public int f156506f;

        /* renamed from: g */
        public int f156507g;

        /* renamed from: h */
        public String f156508h;

        /* renamed from: i */
        public String f156509i;

        /* renamed from: j */
        public String f156510j;

        /* renamed from: k */
        public String f156511k;

        /* renamed from: l */
        public String f156512l;

        /* renamed from: m */
        public boolean f156513m;

        /* renamed from: n */
        public int f156514n;

        /* renamed from: o */
        public String f156515o;

        /* renamed from: p */
        public AbstractC73756j f156516p;

        /* renamed from: q */
        public VideoPublishEditModel f156517q;

        /* renamed from: r */
        public AbstractC89171a<C89391z> f156518r;

        /* renamed from: s */
        public boolean f156519s;

        /* renamed from: t */
        public boolean f156520t;

        static {
            Covode.recordClassIndex(82422);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cs$b$a */
        public static final class C70009a implements AbstractC73756j {

            /* renamed from: a */
            final /* synthetic */ C70008b f156521a;

            /* renamed from: b */
            final /* synthetic */ AbstractC73755i f156522b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89238e f156523c;

            static {
                Covode.recordClassIndex(82423);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73756j
            /* renamed from: a */
            public final void mo79539a(int i) {
                AbstractC73756j jVar = this.f156521a.f156516p;
                if (jVar != null) {
                    jVar.mo79539a(i);
                }
                if (this.f156522b == null) {
                    try {
                        T t = this.f156523c.element;
                        if (t != null) {
                            t.mo37810b();
                        }
                    } catch (Exception unused) {
                    }
                }
            }

            C70009a(C70008b bVar, AbstractC73755i iVar, C89233z.C89238e eVar) {
                this.f156521a = bVar;
                this.f156522b = iVar;
                this.f156523c = eVar;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: androidx.fragment.app.Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void mo110457a(Fragment fragment, AbstractC73755i iVar, DialogInterface.OnDismissListener onDismissListener) {
            Fragment fragment2;
            C89219l.m154721d(fragment, "");
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            C70009a aVar = new C70009a(this, iVar, eVar);
            boolean z = fragment instanceof C23226a;
            if (this.f156513m) {
                fragment2 = C73545c.C73546a.m129669a(this.f156503c, z, aVar);
            } else {
                C73461ak a = C73461ak.m129602a(this.f156501a, this.f156503c, this.f156504d, this.f156505e, this.f156506f, this.f156507g, this.f156508h, this.f156509i, this.f156510j, this.f156511k, this.f156512l, this.f156502b, z, aVar, iVar, this.f156517q, this.f156520t, this.f156519s, this.f156514n, this.f156515o);
                a.f165037V = this.f156518r;
                C89219l.m154716b(a, "");
                fragment2 = a;
            }
            if (z) {
                eVar.element = fragment;
                eVar.element.mo37809a(fragment2);
                return;
            }
            C23226a.C23227a a2 = new C23226a.C23227a().mo37817a(fragment2);
            if (onDismissListener != null) {
                a2 = a2.mo37815a(onDismissListener);
            }
            eVar.element = (T) a2.f55057a;
            eVar.element.show(fragment.getChildFragmentManager(), "PublishPermissionSheet");
        }
    }
}
