package com.p2082ss.android.p2092ad.splash.core.p2104i;

import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ad.splash.core.i.j */
public final class C29518j implements AbstractC29505b {

    /* renamed from: a */
    public final AbstractC29505b f70285a;

    /* renamed from: b */
    private final ExecutorService f70286b = C29495h.m59105d();

    static {
        Covode.recordClassIndex(35912);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ad.splash.core.i.j$a */
    public static final class RunnableC29519a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f70287a;

        static {
            Covode.recordClassIndex(35913);
        }

        RunnableC29519a(AbstractC89171a aVar) {
            this.f70287a = aVar;
        }

        public final void run() {
            this.f70287a.invoke();
        }
    }

    /* renamed from: a */
    private static boolean m59168a() {
        return C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: com.ss.android.ad.splash.core.i.j$b */
    static final class C29520b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C29518j f70288a;

        /* renamed from: b */
        final /* synthetic */ View f70289b;

        /* renamed from: c */
        final /* synthetic */ long f70290c;

        /* renamed from: d */
        final /* synthetic */ List f70291d;

        /* renamed from: e */
        final /* synthetic */ String f70292e;

        /* renamed from: f */
        final /* synthetic */ boolean f70293f;

        /* renamed from: g */
        final /* synthetic */ long f70294g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f70295h;

        /* renamed from: i */
        final /* synthetic */ C29506c f70296i;

        static {
            Covode.recordClassIndex(35914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29520b(C29518j jVar, View view, long j, List list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
            super(0);
            this.f70288a = jVar;
            this.f70289b = view;
            this.f70290c = j;
            this.f70291d = list;
            this.f70292e = str;
            this.f70293f = z;
            this.f70294g = j2;
            this.f70295h = jSONObject;
            this.f70296i = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f70288a.f70285a.mo51603b(this.f70289b, this.f70290c, this.f70291d, this.f70292e, this.f70293f, this.f70294g, this.f70295h, this.f70296i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.i.j$c */
    static final class C29521c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C29518j f70297a;

        /* renamed from: b */
        final /* synthetic */ View f70298b;

        /* renamed from: c */
        final /* synthetic */ String f70299c;

        /* renamed from: d */
        final /* synthetic */ long f70300d;

        /* renamed from: e */
        final /* synthetic */ List f70301e;

        /* renamed from: f */
        final /* synthetic */ String f70302f;

        /* renamed from: g */
        final /* synthetic */ boolean f70303g;

        /* renamed from: h */
        final /* synthetic */ long f70304h;

        /* renamed from: i */
        final /* synthetic */ JSONObject f70305i;

        /* renamed from: j */
        final /* synthetic */ C29506c f70306j;

        static {
            Covode.recordClassIndex(35915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29521c(C29518j jVar, View view, String str, long j, List list, String str2, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
            super(0);
            this.f70297a = jVar;
            this.f70298b = view;
            this.f70299c = str;
            this.f70300d = j;
            this.f70301e = list;
            this.f70302f = str2;
            this.f70303g = z;
            this.f70304h = j2;
            this.f70305i = jSONObject;
            this.f70306j = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f70297a.f70285a.mo51602a(this.f70298b, this.f70299c, this.f70300d, this.f70301e, this.f70302f, this.f70303g, this.f70304h, this.f70305i, this.f70306j);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.i.j$d */
    static final class C29522d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C29518j f70307a;

        /* renamed from: b */
        final /* synthetic */ View f70308b;

        /* renamed from: c */
        final /* synthetic */ long f70309c;

        /* renamed from: d */
        final /* synthetic */ List f70310d;

        /* renamed from: e */
        final /* synthetic */ String f70311e;

        /* renamed from: f */
        final /* synthetic */ boolean f70312f;

        /* renamed from: g */
        final /* synthetic */ long f70313g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f70314h;

        /* renamed from: i */
        final /* synthetic */ C29506c f70315i;

        static {
            Covode.recordClassIndex(35916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29522d(C29518j jVar, View view, long j, List list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
            super(0);
            this.f70307a = jVar;
            this.f70308b = view;
            this.f70309c = j;
            this.f70310d = list;
            this.f70311e = str;
            this.f70312f = z;
            this.f70313g = j2;
            this.f70314h = jSONObject;
            this.f70315i = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f70307a.f70285a.mo51601a(this.f70308b, this.f70309c, this.f70310d, this.f70311e, this.f70312f, this.f70313g, this.f70314h, this.f70315i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.i.j$e */
    static final class C29523e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C29518j f70316a;

        /* renamed from: b */
        final /* synthetic */ View f70317b;

        /* renamed from: c */
        final /* synthetic */ long f70318c;

        /* renamed from: d */
        final /* synthetic */ List f70319d;

        /* renamed from: e */
        final /* synthetic */ String f70320e;

        /* renamed from: f */
        final /* synthetic */ boolean f70321f;

        /* renamed from: g */
        final /* synthetic */ long f70322g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f70323h;

        /* renamed from: i */
        final /* synthetic */ C29506c f70324i;

        static {
            Covode.recordClassIndex(35917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29523e(C29518j jVar, View view, long j, List list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
            super(0);
            this.f70316a = jVar;
            this.f70317b = view;
            this.f70318c = j;
            this.f70319d = list;
            this.f70320e = str;
            this.f70321f = z;
            this.f70322g = j2;
            this.f70323h = jSONObject;
            this.f70324i = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f70316a.f70285a.mo51604c(this.f70317b, this.f70318c, this.f70319d, this.f70320e, this.f70321f, this.f70322g, this.f70323h, this.f70324i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.i.j$f */
    static final class C29524f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C29518j f70325a;

        /* renamed from: b */
        final /* synthetic */ View f70326b;

        /* renamed from: c */
        final /* synthetic */ long f70327c;

        /* renamed from: d */
        final /* synthetic */ List f70328d;

        /* renamed from: e */
        final /* synthetic */ String f70329e;

        /* renamed from: f */
        final /* synthetic */ boolean f70330f;

        /* renamed from: g */
        final /* synthetic */ long f70331g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f70332h;

        /* renamed from: i */
        final /* synthetic */ C29506c f70333i;

        static {
            Covode.recordClassIndex(35918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29524f(C29518j jVar, View view, long j, List list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
            super(0);
            this.f70325a = jVar;
            this.f70326b = view;
            this.f70327c = j;
            this.f70328d = list;
            this.f70329e = str;
            this.f70330f = z;
            this.f70331g = j2;
            this.f70332h = jSONObject;
            this.f70333i = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f70325a.f70285a.mo51605d(this.f70326b, this.f70327c, this.f70328d, this.f70329e, this.f70330f, this.f70331g, this.f70332h, this.f70333i);
            return C89391z.f203057a;
        }
    }

    public C29518j(AbstractC29505b bVar) {
        C89219l.m154719c(bVar, "");
        this.f70285a = bVar;
    }

    /* renamed from: a */
    private final void m59167a(AbstractC89171a<C89391z> aVar) {
        if (m59168a()) {
            this.f70286b.execute(new RunnableC29519a(aVar));
        } else {
            aVar.invoke();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: b */
    public final void mo51603b(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59167a(new C29520b(this, view, j, list, str, z, j2, jSONObject, cVar));
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: c */
    public final void mo51604c(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59167a(new C29523e(this, view, j, list, str, z, j2, jSONObject, cVar));
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: d */
    public final void mo51605d(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59167a(new C29524f(this, view, j, list, str, z, j2, jSONObject, cVar));
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: a */
    public final void mo51601a(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59167a(new C29522d(this, view, j, list, str, z, j2, jSONObject, cVar));
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: a */
    public final void mo51602a(View view, String str, long j, List<String> list, String str2, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59167a(new C29521c(this, view, str, j, list, str2, z, j2, jSONObject, cVar));
    }
}
