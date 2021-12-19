package com.p2082ss.android.ugc.gamora.editor.lightening.p4282b;

import android.content.Context;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j */
public final class C82370j {

    /* renamed from: g */
    public static final C82371a f184259g = new C82371a((byte) 0);

    /* renamed from: a */
    VideoPublishEditModel f184260a;

    /* renamed from: b */
    Context f184261b;

    /* renamed from: c */
    public AbstractC89172b<? super C69905c, C89391z> f184262c;

    /* renamed from: d */
    public C69905c f184263d;

    /* renamed from: e */
    public final C1213t<C82366g<C82369i>> f184264e = new C1213t<>();

    /* renamed from: f */
    public AbstractC88412b f184265f;

    /* renamed from: h */
    private boolean f184266h;

    static {
        Covode.recordClassIndex(96204);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$a */
    public static final class C82371a {
        static {
            Covode.recordClassIndex(96205);
        }

        private C82371a() {
        }

        public /* synthetic */ C82371a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$e */
    static final class CallableC82377e<V> implements Callable {

        /* renamed from: a */
        public static final CallableC82377e f184276a = new CallableC82377e();

        static {
            Covode.recordClassIndex(96211);
        }

        CallableC82377e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new RuntimeException("download file failed");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$k */
    static final class C82383k implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C82370j f184282a;

        static {
            Covode.recordClassIndex(96217);
        }

        C82383k(C82370j jVar) {
            this.f184282a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f184282a.mo127472a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$c */
    static final class CallableC82373c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C69905c f184269a;

        /* renamed from: b */
        final /* synthetic */ String f184270b;

        static {
            Covode.recordClassIndex(96207);
        }

        CallableC82373c(C69905c cVar, String str) {
            this.f184269a = cVar;
            this.f184270b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return C89387v.m154943a(this.f184269a, this.f184270b);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo127473a() {
        boolean z;
        MethodCollector.m26663i(10125);
        z = this.f184266h;
        MethodCollector.m26664o(10125);
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo127472a(boolean z) {
        MethodCollector.m26663i(10126);
        this.f184266h = z;
        MethodCollector.m26664o(10126);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$b */
    public static final class C82372b implements AbstractC63257p.AbstractC63258a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f184267a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f184268b;

        static {
            Covode.recordClassIndex(96206);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101753a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101754a(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101756a(String str) {
            C89219l.m154721d(str, "");
            this.f184267a.invoke(str);
        }

        C82372b(AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f184267a = bVar;
            this.f184268b = bVar2;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101755a(Integer num, String str) {
            AbstractC89172b bVar = this.f184268b;
            if (str == null) {
                str = "";
            }
            bVar.invoke(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$g */
    static final class C82379g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C82379g f184278a = new C82379g();

        static {
            Covode.recordClassIndex(96213);
        }

        C82379g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            Object g = C89070n.m154583g(list);
            if (g != null) {
                return g;
            }
            throw new RuntimeException("load music result is empty");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$i */
    static final class C82381i<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C82381i f184280a = new C82381i();

        static {
            Covode.recordClassIndex(96215);
        }

        C82381i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            C69905c cVar = (C69905c) pVar.getFirst();
            cVar.path = (String) pVar.getSecond();
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$j */
    static final class C82382j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82370j f184281a;

        static {
            Covode.recordClassIndex(96216);
        }

        C82382j(C82370j jVar) {
            this.f184281a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f184281a.f184265f = (AbstractC88412b) obj;
            this.f184281a.mo127472a(true);
            this.f184281a.f184264e.setValue(new C82366g<>(EnumC82368h.LOADING, null, null, 6));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$m */
    static final class C82385m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82370j f184284a;

        static {
            Covode.recordClassIndex(96219);
        }

        C82385m(C82370j jVar) {
            this.f184284a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C1213t<C82366g<C82369i>> tVar = this.f184284a.f184264e;
            C89219l.m154716b(th, "");
            C89219l.m154721d(th, "");
            tVar.setValue(new C82366g<>(EnumC82368h.FAIL, null, th, 2));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$d */
    static final class C82374d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C82370j f184271a;

        /* renamed from: b */
        final /* synthetic */ C69905c f184272b;

        static {
            Covode.recordClassIndex(96208);
        }

        C82374d(C82370j jVar, C69905c cVar) {
            this.f184271a = jVar;
            this.f184272b = cVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C89378p<C69905c, String>> vVar) {
            C89219l.m154721d(vVar, "");
            C82370j jVar = this.f184271a;
            C69905c cVar = this.f184272b;
            C823751 r5 = new AbstractC89172b<String, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.C82370j.C82374d.C823751 */

                /* renamed from: a */
                final /* synthetic */ C82374d f184273a;

                static {
                    Covode.recordClassIndex(96209);
                }

                {
                    this.f184273a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(String str) {
                    C89219l.m154721d(str, "");
                    vVar.mo143031a(C89387v.m154943a(this.f184273a.f184272b, str));
                    vVar.mo143023a();
                    return C89391z.f203057a;
                }
            };
            C823762 r4 = new AbstractC89172b<String, C89391z>() {
                /* class com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.C82370j.C82374d.C823762 */

                static {
                    Covode.recordClassIndex(96210);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(String str) {
                    String str2 = str;
                    C89219l.m154721d(str2, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143104b(new RuntimeException(str2));
                    }
                    return C89391z.f203057a;
                }
            };
            if (jVar.f184261b == null) {
                r4.invoke("not init");
                return;
            }
            AbstractC63257p s = C63244g.m114602a().mo73291s();
            Context context = jVar.f184261b;
            if (context == null) {
                C89219l.m154715b();
            }
            s.mo101744a(context, cVar, 6, new C82372b(r5, r4));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$f */
    static final class C82378f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C82378f f184277a = new C82378f();

        static {
            Covode.recordClassIndex(96212);
        }

        C82378f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List<T> list = (List) obj;
            C89219l.m154721d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                C69905c b = C63253l.f143623a.mo73306b().mo101543b((MusicModel) t);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$h */
    static final class C82380h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C82370j f184279a;

        static {
            Covode.recordClassIndex(96214);
        }

        C82380h(C82370j jVar) {
            this.f184279a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C69905c cVar = (C69905c) obj;
            C89219l.m154721d(cVar, "");
            C82370j jVar = this.f184279a;
            String b = C63253l.f143623a.mo73306b().mo101748b(cVar);
            if (C84902i.m145892a(b) && new File(b).length() > 0) {
                AbstractC88979t c = AbstractC88979t.m154314c(new CallableC82373c(cVar, b));
                C89219l.m154716b(c, "");
                return c;
            } else if (cVar != null) {
                AbstractC88979t a = AbstractC88979t.m154294a(new C82374d(jVar, cVar));
                C89219l.m154716b(a, "");
                return a;
            } else {
                AbstractC88979t b2 = AbstractC88979t.m154311b((Callable<? extends Throwable>) CallableC82377e.f184276a);
                C89219l.m154716b(b2, "");
                return b2;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.j$l */
    static final class C82384l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82370j f184283a;

        static {
            Covode.recordClassIndex(96218);
        }

        C82384l(C82370j jVar) {
            this.f184283a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C69905c cVar = (C69905c) obj;
            C69905c cVar2 = C70005cr.m123611a().f156482a;
            if (cVar2 == null || (str = cVar2.getMusicId()) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            boolean z = !C89361p.m154870a((CharSequence) str);
            C1213t<C82366g<C82369i>> tVar = this.f184283a.f184264e;
            C89219l.m154716b(cVar, "");
            tVar.setValue(new C82366g<>(EnumC82368h.SUCCESS, new C82369i(cVar, z), null, 4));
            if (!z) {
                this.f184283a.f184263d = cVar;
                C70005cr.m123611a().mo70083a(cVar);
                AbstractC89172b<? super C69905c, C89391z> bVar = this.f184283a.f184262c;
                if (bVar != null) {
                    bVar.invoke(cVar);
                }
            }
        }
    }
}
