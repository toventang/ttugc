package com.p2082ss.android.ugc.aweme.commerce.sdk.p2516a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a */
public abstract class AbstractC37517a {

    /* renamed from: c */
    public static final C37518a f88564c = new C37518a((byte) 0);

    /* renamed from: a */
    public final HashMap<String, String> f88565a = new HashMap<>();

    /* renamed from: b */
    public final String f88566b;

    /* renamed from: d */
    private final HashMap<String, String> f88567d = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b */
    public interface AbstractC37519b {

        /* renamed from: a */
        public static final C37520a f88568a = C37520a.f88570b;

        /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a */
        public static final class C37520a {

            /* renamed from: a */
            static final AbstractC37519b f88569a = new C37521a();

            /* renamed from: b */
            static final /* synthetic */ C37520a f88570b = new C37520a();

            /* renamed from: c */
            private static final AbstractC37519b f88571c = new C37522b();

            /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a$a */
            public static final class C37521a implements AbstractC37519b {
                static {
                    Covode.recordClassIndex(44909);
                }

                C37521a() {
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.sdk.p2516a.AbstractC37517a.AbstractC37519b
                /* renamed from: a */
                public final String mo65349a(String str) {
                    C89219l.m154721d(str, "");
                    if (TextUtils.isEmpty(str) || C89219l.m154714a((Object) "null", (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a$b */
            public static final class C37522b implements AbstractC37519b {
                static {
                    Covode.recordClassIndex(44910);
                }

                C37522b() {
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.sdk.p2516a.AbstractC37517a.AbstractC37519b
                /* renamed from: a */
                public final String mo65349a(String str) {
                    C89219l.m154721d(str, "");
                    if (TextUtils.isEmpty(str) || C89219l.m154714a((Object) "null", (Object) str) || C89219l.m154714a((Object) "0", (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            private C37520a() {
            }

            static {
                Covode.recordClassIndex(44908);
            }
        }

        static {
            Covode.recordClassIndex(44907);
        }

        /* renamed from: a */
        String mo65349a(String str);
    }

    static {
        Covode.recordClassIndex(44905);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo65348b();

    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$a */
    public static final class C37518a {
        static {
            Covode.recordClassIndex(44906);
        }

        private C37518a() {
        }

        public /* synthetic */ C37518a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$c */
    static final class CallableC37523c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC37517a f88572a;

        static {
            Covode.recordClassIndex(44911);
        }

        CallableC37523c(AbstractC37517a aVar) {
            this.f88572a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                C39161q.m79451a(this.f88572a.f88566b, this.f88572a.f88565a);
                return C89391z.f203057a;
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    /* renamed from: a */
    public final void mo65345a() {
        mo65346a("data_type", "commerce_data", AbstractC37519b.C37520a.f88569a);
        mo65348b();
        this.f88565a.putAll(this.f88567d);
        C1731i.m5640b(new CallableC37523c(this), C1731i.f5562a);
    }

    /* renamed from: a */
    public final boolean mo65347a(String str) {
        C89219l.m154721d(str, "");
        return this.f88565a.containsKey(str);
    }

    public AbstractC37517a(String str) {
        C89219l.m154721d(str, "");
        this.f88566b = str;
    }

    /* renamed from: a */
    public final void mo65346a(String str, String str2, AbstractC37519b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        if (str2 != null) {
            this.f88565a.put(str, bVar.mo65349a(str2));
        }
    }
}
