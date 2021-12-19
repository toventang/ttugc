package com.bytedance.disk.p958c.p959a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p114bd.p115cu.p116fp.NativeUtils;

/* renamed from: com.bytedance.disk.c.a.d */
public interface AbstractC14433d {
    static {
        Covode.recordClassIndex(16511);
    }

    /* renamed from: a */
    void mo23258a();

    /* renamed from: a */
    byte[] mo23259a(byte[] bArr);

    /* renamed from: com.bytedance.disk.c.a.d$a */
    public static class C14434a implements AbstractC14433d {

        /* renamed from: a */
        private long f34909a;

        static {
            Covode.recordClassIndex(16512);
        }

        /* renamed from: b */
        private boolean m26349b() {
            if (this.f34909a != 0) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.disk.p958c.p959a.AbstractC14433d
        /* renamed from: a */
        public final void mo23258a() {
            MethodCollector.m26663i(8039);
            if (m26349b()) {
                NativeUtils.release(this.f34909a);
            }
            MethodCollector.m26664o(8039);
        }

        public C14434a(String str) {
            MethodCollector.m26663i(7747);
            this.f34909a = NativeUtils.nativeInit(str);
            MethodCollector.m26664o(7747);
        }

        @Override // com.bytedance.disk.p958c.p959a.AbstractC14433d
        /* renamed from: a */
        public final byte[] mo23259a(byte[] bArr) {
            MethodCollector.m26663i(7889);
            if (m26349b()) {
                byte[] crypt = NativeUtils.crypt(this.f34909a, bArr);
                MethodCollector.m26664o(7889);
                return crypt;
            }
            MethodCollector.m26664o(7889);
            return null;
        }
    }
}
