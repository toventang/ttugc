package com.bytedance.framwork.core.p1005c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.c.a */
public abstract class AbstractC14801a {

    /* renamed from: c */
    public String f36072c;

    /* renamed from: d */
    public AbstractC14803b f36073d;

    /* renamed from: e */
    protected C14809d f36074e;

    /* renamed from: f */
    public String f36075f;

    /* renamed from: g */
    public AbstractC14804c f36076g;

    /* renamed from: h */
    public long f36077h;

    /* renamed from: com.bytedance.framwork.core.c.a$a */
    public static abstract class AbstractC14802a implements AbstractC14803b {
        static {
            Covode.recordClassIndex(16902);
        }

        @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
        /* renamed from: c */
        public int mo23808c() {
            return 4;
        }

        @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
        /* renamed from: d */
        public long mo23809d() {
            return 15000;
        }

        @Override // com.bytedance.framwork.core.p1005c.AbstractC14801a.AbstractC14803b
        /* renamed from: e */
        public String mo23810e() {
            return null;
        }
    }

    /* renamed from: com.bytedance.framwork.core.c.a$b */
    public interface AbstractC14803b {
        static {
            Covode.recordClassIndex(16903);
        }

        /* renamed from: a */
        String mo23806a();

        /* renamed from: b */
        List<String> mo23807b();

        /* renamed from: c */
        int mo23808c();

        /* renamed from: d */
        long mo23809d();

        /* renamed from: e */
        String mo23810e();
    }

    /* renamed from: com.bytedance.framwork.core.c.a$c */
    public interface AbstractC14804c {
        static {
            Covode.recordClassIndex(16904);
        }

        /* renamed from: a */
        boolean mo23811a();

        /* renamed from: b */
        long mo23812b();

        /* renamed from: c */
        boolean mo23813c();
    }

    static {
        Covode.recordClassIndex(16901);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo23814a(String str, byte[] bArr);

    /* renamed from: a */
    public final boolean mo23833a(byte[] bArr) {
        return this.f36074e.mo23836a(this.f36072c, bArr);
    }

    public AbstractC14801a(Context context, AbstractC14803b bVar, AbstractC14804c cVar) {
        this.f36073d = bVar;
        this.f36076g = cVar;
        if (bVar == null) {
            throw new IllegalArgumentException("config is null.");
        } else if (cVar != null) {
            String a = bVar.mo23806a();
            this.f36072c = a;
            if (!TextUtils.isEmpty(a)) {
                C14809d a2 = C14809d.m27185a(context);
                this.f36074e = a2;
                String str = this.f36072c;
                if (!a2.f36088b.get()) {
                    a2.f36087a.put(str, this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("type is empty.");
        } else {
            throw new IllegalArgumentException("responseConfig is null");
        }
    }
}
