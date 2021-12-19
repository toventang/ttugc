package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.ies.web.jsbridge2.m */
public interface AbstractC18347m {

    /* renamed from: com.bytedance.ies.web.jsbridge2.m$a */
    public interface AbstractC18348a {

        /* renamed from: com.bytedance.ies.web.jsbridge2.m$a$a */
        public interface AbstractC18349a {
            static {
                Covode.recordClassIndex(21021);
            }

            /* renamed from: a */
            void mo29315a(String str);
        }

        static {
            Covode.recordClassIndex(21020);
        }

        /* renamed from: a */
        String mo29390a(String str, String str2);

        /* renamed from: a */
        void mo29391a(String str, AbstractC18349a aVar);

        /* renamed from: b */
        void mo29392b(String str, String str2);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.m$b */
    public interface AbstractC18350b {
        static {
            Covode.recordClassIndex(21022);
        }

        /* renamed from: a */
        void mo29323a(String str);

        /* renamed from: a */
        void mo29324a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.m$c */
    public interface AbstractC18351c {
        static {
            Covode.recordClassIndex(21023);
        }

        /* renamed from: a */
        boolean mo26206a(String str);

        /* renamed from: a */
        boolean mo26207a(String str, String str2);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.m$d */
    public interface AbstractC18352d {
        static {
            Covode.recordClassIndex(21024);
        }
    }

    static {
        Covode.recordClassIndex(21019);
    }

    /* renamed from: a */
    EnumC18353e mo29379a();

    /* renamed from: a */
    void mo29380a(String str, String str2, byte[] bArr, AbstractC18350b bVar);

    /* renamed from: b */
    int mo29381b();

    /* renamed from: c */
    String mo29382c();

    /* renamed from: d */
    String mo29383d();

    /* renamed from: e */
    String mo29384e();

    /* renamed from: f */
    String mo29385f();

    /* renamed from: g */
    Collection<String> mo29386g();

    /* renamed from: h */
    AbstractC18348a mo29387h();

    /* renamed from: i */
    Executor mo29388i();

    /* renamed from: j */
    String mo29389j();

    /* renamed from: com.bytedance.ies.web.jsbridge2.m$e */
    public enum EnumC18353e {
        SG("https://jsb-sg.byteoversea.com/src/server/v2/package"),
        US("https://jsb-va.byteoversea.com/src/server/v2/package");
        
        public String url;

        static {
            Covode.recordClassIndex(21025);
        }

        private EnumC18353e(String str) {
            this.url = str;
        }
    }
}
