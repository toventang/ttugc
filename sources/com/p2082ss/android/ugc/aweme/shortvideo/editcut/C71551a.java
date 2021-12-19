package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.asve.editor.C31078i;
import com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33484c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69842at;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70071e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70073g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.C85615x;
import com.p2082ss.android.vesdk.VEListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a */
public final class C71551a implements AbstractC33484c {

    /* renamed from: b */
    public static final Map<String, String> f160341b = new LinkedHashMap();

    /* renamed from: c */
    public static final C71552a f160342c = new C71552a((byte) 0);

    /* renamed from: g */
    private static int f160343g;

    /* renamed from: a */
    public boolean f160344a;

    /* renamed from: d */
    private boolean f160345d = true;

    /* renamed from: e */
    private final AbstractC89244h f160346e = C89250i.m154773a((AbstractC89171a) C71553b.f160348a);

    /* renamed from: f */
    private final AbstractC89244h f160347f = C89250i.m154773a((AbstractC89171a) new C71556e(this));

    /* renamed from: c */
    private final String m126452c() {
        return (String) this.f160346e.getValue();
    }

    /* renamed from: d */
    private final C31060a m126453d() {
        return (C31060a) this.f160347f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a$a */
    public static final class C71552a {
        static {
            Covode.recordClassIndex(84097);
        }

        private C71552a() {
        }

        public /* synthetic */ C71552a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a$e */
    static final class C71556e extends AbstractC89220m implements AbstractC89171a<C31060a> {

        /* renamed from: a */
        final /* synthetic */ C71551a f160353a;

        static {
            Covode.recordClassIndex(84101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71556e(C71551a aVar) {
            super(0);
            this.f160353a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31060a invoke() {
            this.f160353a.f160344a = true;
            return new C31060a(C69744c.m123270b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33484c
    /* renamed from: a */
    public final void mo59566a() {
        this.f160345d = true;
        if (this.f160344a) {
            m126453d().mo56387s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a$b */
    static final class C71553b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C71553b f160348a = new C71553b();

        static {
            Covode.recordClassIndex(84098);
        }

        C71553b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C63244g.m114602a().mo73279g().mo69470c().mo69476b("recompile");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a$d */
    public static final class C71555d implements VEListener.AbstractC85248q {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f160350a;

        /* renamed from: b */
        final /* synthetic */ String f160351b;

        /* renamed from: c */
        final /* synthetic */ String f160352c;

        static {
            Covode.recordClassIndex(84100);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            C71551a.f160341b.put(this.f160352c, this.f160351b);
            this.f160350a.invoke(true, this.f160351b);
        }

        C71555d(AbstractC89183m mVar, String str, String str2) {
            this.f160350a = mVar;
            this.f160351b = str;
            this.f160352c = str2;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            this.f160350a.invoke(false, this.f160351b);
        }
    }

    static {
        Covode.recordClassIndex(84096);
    }

    /* renamed from: b */
    public final void mo113308b() {
        C84902i.m145888a(m126452c(), new C71554c(f160341b.values()));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a$c */
    static final class C71554c<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ Collection f160349a;

        static {
            Covode.recordClassIndex(84099);
        }

        C71554c(Collection collection) {
            this.f160349a = collection;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            File file = (File) obj;
            Collection collection = this.f160349a;
            C89219l.m154716b(file, "");
            return Boolean.valueOf(!collection.contains(file.getPath()));
        }
    }

    /* renamed from: a */
    private final void m126451a(C70071e eVar, VEListener.AbstractC85248q qVar) {
        m126453d().mo56342c(-1);
        List<VideoSegment> list = eVar.f156682a;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C71413b.m126116a((VideoSegment) it.next()));
        }
        C70504v.C70505a.m124385a(arrayList, m126453d());
        try {
            m126453d().mo56316a(eVar.f156683b, eVar.f156684c, C70504v.C70505a.m124384a(eVar), qVar);
        } catch (C85615x e) {
            qVar.onCompileError(4118, 0, 0.0f, e.getMessage());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33484c
    /* renamed from: a */
    public final void mo59567a(String str, VideoSegment videoSegment, AbstractC89183m<? super Boolean, ? super String, C89391z> mVar) {
        String str2 = str;
        C89219l.m154721d(videoSegment, "");
        C89219l.m154721d(mVar, "");
        String str3 = videoSegment.mo110571a(false).toString();
        String str4 = f160341b.get(str3);
        if (str4 == null || !C84902i.m145892a(str4)) {
            if (str2 == null) {
                File file = new File(m126452c());
                if (!file.exists()) {
                    file.mkdirs();
                }
                StringBuilder append = new StringBuilder().append(m126452c());
                StringBuilder sb = new StringBuilder("-");
                int i = f160343g;
                f160343g = i + 1;
                str2 = new File(append.append(C70638dj.m124844b(sb.append(i).append("-concat-v").toString())).toString()).getPath();
                C89219l.m154716b(str2, "");
            }
            String a = SettingsManager.m29616a().mo25398a("import_compile_external_settings", "");
            C89219l.m154716b(a, "");
            List a2 = C89070n.m154516a(videoSegment);
            C70071e eVar = new C70071e(a2, str2, null, -1, -1, C70073g.m123700a(a2), null, null, null, 0, 0, a, 8128);
            List a3 = C89070n.m154516a(str3);
            C71555d dVar = new C71555d(mVar, str2, str3);
            C31060a d = m126453d();
            Object[] array = a3.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            if (d.mo56274a(new C31078i((String[]) array)) == 0) {
                int a4 = C69842at.m123410a();
                C31060a d2 = m126453d();
                if (a4 <= 0) {
                    a4 = 30;
                }
                d2.mo56366i(a4);
                m126453d().mo56313a(0, 1, 0.5f);
                m126453d().mo56342c(1);
                m126453d().mo56348d(C63244g.m114602a().mo73281i().getVideoWidth(), C63244g.m114602a().mo73281i().getVideoHeight());
                m126453d().mo56334b(true);
                if (m126453d().mo56244E().mo131685f() != 0) {
                    dVar.onCompileError(4118, 0, 0.0f, "prepare error, suspend by user");
                } else {
                    m126451a(eVar, dVar);
                }
            } else {
                dVar.onCompileError(4118, 0, 0.0f, "init error, suspend by user");
            }
        } else {
            mVar.invoke(true, str4);
        }
    }
}
