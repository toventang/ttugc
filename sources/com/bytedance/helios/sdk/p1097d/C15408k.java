package com.bytedance.helios.sdk.p1097d;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.d.k */
public final class C15408k extends AbstractC15412n {

    /* renamed from: b */
    public static final C15409a f37623b = new C15409a((byte) 0);

    static {
        Covode.recordClassIndex(17660);
    }

    /* renamed from: com.bytedance.helios.sdk.d.k$a */
    public static final class C15409a {
        static {
            Covode.recordClassIndex(17661);
        }

        private C15409a() {
        }

        public /* synthetic */ C15409a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final int[] mo25138a() {
        return C15407j.f37619c;
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: b */
    public final String mo25146b() {
        return C15407j.f37617a;
    }

    public C15408k() {
        mo25154a(C15407j.f37620d);
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: a */
    public final long mo25150a(C15397d dVar) {
        Object obj;
        CameraCaptureSession cameraCaptureSession;
        C89219l.m154719c(dVar, "");
        int i = dVar.f37587d;
        int i2 = 0;
        if (i != 100100) {
            switch (i) {
                case 100200:
                    Object[] objArr = dVar.f37586c;
                    if (objArr != null) {
                        obj = objArr[0];
                        break;
                    }
                    break;
                case 100201:
                case 100205:
                    obj = dVar.f37585b;
                    break;
                case 100202:
                case 100203:
                case 100204:
                    if (Build.VERSION.SDK_INT >= 21 && (cameraCaptureSession = (CameraCaptureSession) dVar.f37585b) != null) {
                        obj = cameraCaptureSession.getDevice();
                        break;
                    }
                default:
                    obj = dVar.f37585b;
                    break;
            }
            return (long) i2;
        }
        obj = dVar.f37584a;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return (long) i2;
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: b */
    public final List<Integer> mo25147b(int i) {
        switch (i) {
            case 100101:
                return C89070n.m154516a((Object) 100100);
            case 100103:
                return C89070n.m154516a((Object) 100102);
            case 100105:
                return C89070n.m154516a((Object) 100104);
            case 100201:
                return C89070n.m154522b(100200, 100202, 100203);
            case 100204:
                return C89070n.m154522b(100202, 100203);
            default:
                return C89086z.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final void mo25135a(C15397d dVar, Throwable th) {
        C89219l.m154719c(dVar, "");
        C15400e eVar = (C15400e) this.f37577a.get(dVar.f37587d);
        if (eVar.f37596b == 3) {
            int i = eVar.f37597c;
            if (i == 100106 || i == 100205) {
                mo25155b(dVar);
                return;
            }
            return;
        }
        C89219l.m154709a((Object) eVar, "");
        mo25152a(eVar, dVar, th);
    }
}
