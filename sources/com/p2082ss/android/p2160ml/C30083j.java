package com.p2082ss.android.p2160ml;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ml.j */
public final class C30083j {

    /* renamed from: a */
    public final String f71788a;

    /* renamed from: b */
    public final AbstractC30087d f71789b;

    /* renamed from: c */
    public final AbstractC30085b f71790c;

    /* renamed from: d */
    public final AbstractC30080g f71791d;

    /* renamed from: e */
    final AbstractC30086c f71792e;

    /* renamed from: f */
    public final AbstractC30081h f71793f;

    /* renamed from: g */
    ExecutorService f71794g;

    /* renamed from: h */
    public final Context f71795h;

    /* renamed from: com.ss.android.ml.j$a */
    public static class C30084a {

        /* renamed from: a */
        public String f71796a;

        /* renamed from: b */
        public AbstractC30087d f71797b;

        /* renamed from: c */
        public AbstractC30085b f71798c;

        /* renamed from: d */
        public AbstractC30080g f71799d;

        /* renamed from: e */
        public AbstractC30086c f71800e;

        /* renamed from: f */
        public AbstractC30081h f71801f;

        /* renamed from: g */
        ExecutorService f71802g;

        /* renamed from: h */
        Context f71803h;

        static {
            Covode.recordClassIndex(36580);
        }
    }

    /* renamed from: com.ss.android.ml.j$b */
    public interface AbstractC30085b {
        static {
            Covode.recordClassIndex(36581);
        }

        /* renamed from: a */
        <T> T mo53450a(String str, Type type);
    }

    /* renamed from: com.ss.android.ml.j$c */
    public interface AbstractC30086c {
        static {
            Covode.recordClassIndex(36582);
        }

        /* renamed from: a */
        ExecutorService mo53451a();
    }

    /* renamed from: com.ss.android.ml.j$d */
    public interface AbstractC30087d {
        static {
            Covode.recordClassIndex(36583);
        }

        /* renamed from: a */
        boolean mo53452a(String str, String str2, String str3);
    }

    static {
        Covode.recordClassIndex(36579);
    }

    public C30083j(C30084a aVar) {
        if (aVar.f71796a == null) {
            throw new RuntimeException("must specified cache path");
        } else if (aVar.f71797b == null) {
            throw new RuntimeException("must implement IFileDownloader");
        } else if (aVar.f71798c != null) {
            this.f71788a = aVar.f71796a;
            this.f71789b = aVar.f71797b;
            this.f71790c = aVar.f71798c;
            this.f71791d = aVar.f71799d;
            this.f71793f = aVar.f71801f;
            this.f71794g = aVar.f71802g;
            this.f71795h = aVar.f71803h;
            this.f71792e = aVar.f71800e;
        } else {
            throw new RuntimeException("must implement IConfigParser");
        }
    }
}
