package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;
import org.json.JSONObject;
import p4646ms.p4647bd.p4648o.C89868b;

/* renamed from: ms.bd.o.j */
public abstract class AbstractC89895j extends C89868b.AbstractC89869a {

    /* renamed from: a */
    private static AbstractC89895j f203781a;

    /* renamed from: ms.bd.o.j$a */
    public static class C89896a {

        /* renamed from: a */
        private long f203782a;

        /* renamed from: b */
        private long f203783b;

        /* renamed from: c */
        private String f203784c;

        /* renamed from: d */
        private String f203785d;

        static {
            Covode.recordClassIndex(105993);
        }

        /* renamed from: a */
        public final void mo144458a(String str) {
            this.f203784c = str;
            this.f203785d = null;
            this.f203782a = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo144459a(String str, int i) {
            AbstractC89895j a = AbstractC89895j.m155976a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f203782a;
                long j2 = currentTimeMillis - j;
                this.f203783b = j2;
                a.mo144454a(j2, j, this.f203784c, this.f203785d, str, i);
            }
        }

        /* renamed from: b */
        public final void mo144460b(String str, int i) {
            AbstractC89895j a = AbstractC89895j.m155976a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f203782a;
                long j2 = currentTimeMillis - j;
                this.f203783b = j2;
                a.mo144457b(j2, j, this.f203784c, this.f203785d, str, i);
            }
        }
    }

    static {
        Covode.recordClassIndex(105992);
    }

    /* renamed from: a */
    public static synchronized AbstractC89895j m155976a() {
        AbstractC89895j jVar;
        synchronized (AbstractC89895j.class) {
            jVar = f203781a;
        }
        return jVar;
    }

    /* renamed from: a */
    public static synchronized void m155977a(AbstractC89895j jVar) {
        synchronized (AbstractC89895j.class) {
            f203781a = jVar;
        }
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35023a(int i, int i2, long j, String str, Object obj) {
        if (i != 131073) {
            if (i == 131074) {
                String[] strArr = (String[]) obj;
                if (!(str == null || strArr == null || strArr.length == 0)) {
                    mo144455a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
                }
            }
            return null;
        } else if (str == null || !mo144456a(str)) {
            return null;
        } else {
            return C89889h.m155966a(16777217, 0, 0, "3120c1", new byte[]{C86745e.f195623b, 24});
        }
    }

    /* renamed from: a */
    public abstract void mo144454a(long j, long j2, String str, String str2, String str3, int i);

    /* renamed from: a */
    public abstract void mo144455a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    public abstract boolean mo144456a(String str);

    /* renamed from: b */
    public abstract void mo144457b(long j, long j2, String str, String str2, String str3, int i);
}
