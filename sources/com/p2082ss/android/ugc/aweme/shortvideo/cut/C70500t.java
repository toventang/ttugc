package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.p2082ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t */
public final class C70500t<T> {

    /* renamed from: c */
    public static final C70501a f157553c = new C70501a((byte) 0);

    /* renamed from: a */
    public final long f157554a;

    /* renamed from: b */
    public final String f157555b;

    /* renamed from: d */
    private final AbstractC89244h f157556d;

    /* renamed from: e */
    private final Context f157557e;

    /* renamed from: f */
    private final AbstractC70069c<T> f157558f;

    static {
        Covode.recordClassIndex(82949);
    }

    /* renamed from: b */
    private final DiskLruCache m124362b() {
        return (DiskLruCache) this.f157556d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t$a */
    public static final class C70501a {
        static {
            Covode.recordClassIndex(82950);
        }

        private C70501a() {
        }

        public /* synthetic */ C70501a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t$b */
    static final class C70502b extends AbstractC89220m implements AbstractC89171a<DiskLruCache> {

        /* renamed from: a */
        final /* synthetic */ C70500t f157559a;

        static {
            Covode.recordClassIndex(82951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70502b(C70500t tVar) {
            super(0);
            this.f157559a = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DiskLruCache invoke() {
            return DiskLruCache.open(new File(this.f157559a.f157555b), 1, 1, this.f157559a.f157554a);
        }
    }

    /* renamed from: a */
    public final void mo111085a() {
        try {
            m124362b().delete();
            DiskLruCache b = m124362b();
            C89219l.m154716b(b, "");
            m124361a(b.getDirectory());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C70581y<T> mo111084a(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        DiskLruCache.Snapshot snapshot = m124362b().get(MD5Utils.getMD5String(str));
        if (snapshot == null) {
            return null;
        }
        try {
            InputStream inputStream = snapshot.getInputStream(0);
            C89219l.m154716b(inputStream, "");
            C70581y<T> a = this.f157558f.mo110523a(inputStream);
            inputStream.close();
            return a;
        } finally {
            snapshot.close();
        }
    }

    /* renamed from: b */
    public final boolean mo111087b(String str) {
        DiskLruCache.Snapshot snapshot;
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str) || (snapshot = m124362b().get(MD5Utils.getMD5String(str))) == null) {
            return false;
        }
        snapshot.close();
        return true;
    }

    /* renamed from: a */
    private static boolean m124361a(File file) {
        MethodCollector.m26663i(10168);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(10168);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(10168);
        return delete;
    }

    public C70500t(Context context, String str, AbstractC70069c<T> cVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        this.f157557e = context;
        this.f157555b = str;
        this.f157558f = cVar;
        long a = C84902i.m145882a(context);
        long j = 13107200;
        if (a > 52428800) {
            j = 52428800;
        } else if (a > 26214400) {
            j = 26214400;
        } else if (a <= 13107200) {
            j = 10485760;
        }
        this.f157554a = j;
        this.f157556d = C89250i.m154773a((AbstractC89171a) new C70502b(this));
    }

    /* renamed from: a */
    public final void mo111086a(String str, C70581y<T> yVar, AbstractC89172b<? super Boolean, C89391z> bVar) {
        OutputStream newOutputStream;
        C89219l.m154721d(str, "");
        C89219l.m154721d(yVar, "");
        C89219l.m154721d(bVar, "");
        if (TextUtils.isEmpty(str)) {
            bVar.invoke(false);
            return;
        }
        DiskLruCache.Editor editor = null;
        try {
            DiskLruCache.Editor edit = m124362b().edit(MD5Utils.getMD5String(str));
            if (edit != null && (newOutputStream = edit.newOutputStream(0)) != null) {
                this.f157558f.mo110524a(newOutputStream, yVar);
                newOutputStream.flush();
                newOutputStream.close();
                edit.commit();
                bVar.invoke(true);
                m124362b().flush();
            }
        } catch (Exception unused) {
            if (0 != 0) {
                try {
                    editor.abort();
                } catch (Exception unused2) {
                }
            }
            bVar.invoke(false);
        }
    }
}
