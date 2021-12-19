package com.p2082ss.texturerender.p4404a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86203l;
import com.p2082ss.texturerender.C86210o;

/* renamed from: com.ss.texturerender.a.p */
public final class C86186p extends AbstractC86171a {

    /* renamed from: i */
    private int f192269i = -1;

    /* renamed from: j */
    private int f192270j;

    /* renamed from: k */
    private int f192271k;

    /* renamed from: l */
    private boolean f192272l = true;

    /* renamed from: m */
    private C86210o f192273m;

    /* renamed from: n */
    private float[] f192274n;

    /* renamed from: o */
    private int f192275o = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(101329);
    }

    public C86186p() {
        super(5);
        C86203l.m148116a("TR_VideoOCLSREffect", "new VideoOCLSREffect");
        this.f192174c = 5;
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final AbstractC86171a mo136470a() {
        if (this.f192273m != null) {
            C86203l.m148116a("TR_VideoOCLSREffect", "release video sr");
            this.f192273m.mo136538b();
            this.f192273m = null;
        }
        return super.mo136470a();
    }

    /* renamed from: a */
    private C86176f m148067a(C86176f fVar) {
        this.f192175d.setOption(6, 0);
        return fVar;
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final int mo136469a(Bundle bundle) {
        boolean z;
        super.mo136469a(bundle);
        int i = bundle.getInt("srAlgType");
        int i2 = bundle.getInt("texture_type");
        String string = bundle.getString("moduleName");
        boolean z2 = true;
        boolean z3 = bundle.getBoolean("srIsMaliSync", true);
        if (this.f192269i == i && this.f192173b == i2 && this.f192272l == z3) {
            return 0;
        }
        this.f192173b = i2;
        if (this.f192173b == 36197 && this.f192274n == null) {
            this.f192274n = new float[16];
        }
        this.f192270j = bundle.getInt("srMaxSizeWidth");
        this.f192271k = bundle.getInt("srMaxSizeHeight");
        String str = (String) bundle.getSerializable("kernelBinPath");
        if (TextUtils.isEmpty(str)) {
            C86203l.m148116a("TR_VideoOCLSREffect", "sr config is empty");
            return -1;
        }
        if (this.f192273m != null) {
            C86203l.m148116a("TR_VideoOCLSREffect", "release prev SR instance");
            this.f192273m.mo136538b();
            this.f192273m = null;
        }
        C86203l.m148116a("TR_VideoOCLSREffect", "start init sr");
        C86210o oVar = new C86210o();
        this.f192273m = oVar;
        if (this.f192270j <= 0 || this.f192271k <= 0) {
            if (this.f192173b != 36197) {
                z2 = false;
            }
            if (!oVar.mo136536a(str, i, z2, string)) {
                C86203l.m148116a("TR_VideoOCLSREffect", "sr init failed");
                this.f192273m.mo136538b();
                this.f192273m = null;
                return -1;
            }
        } else {
            if (this.f192173b == 36197) {
                z = true;
            } else {
                z = false;
            }
            if (!oVar.mo136537a(str, i, z, z3, this.f192271k, this.f192270j, string)) {
                C86203l.m148116a("TR_VideoOCLSREffect", "sr init set max texture size failed");
                this.f192273m.mo136538b();
                this.f192273m = null;
                return -1;
            }
        }
        this.f192269i = i;
        this.f192272l = z3;
        C86203l.m148116a("TR_VideoOCLSREffect", "init sr success, texTarget:" + i2 + " bundle:" + bundle.toString());
        return 0;
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final C86176f mo136471a(C86176f fVar, C86179i iVar) {
        int a;
        if (this.f192175d == null) {
            return fVar;
        }
        if (this.f192273m == null) {
            return m148067a(fVar);
        }
        if (this.f192269i < 0 || this.f192175d.getUseSr() != 1) {
            return m148067a(fVar);
        }
        int i = fVar.f192203c;
        int i2 = fVar.f192204d;
        if (!this.f192175d.supportProcessResolution(i, i2)) {
            return m148067a(fVar);
        }
        if (this.f192173b == 36197) {
            this.f192175d.getTransformMatrix(this.f192274n);
            a = this.f192273m.mo136535a(fVar.f192201a, i, i2, this.f192274n);
        } else {
            a = this.f192273m.mo136534a(fVar.f192201a, i, i2);
        }
        if (a == -1) {
            if (this.f192275o != -1) {
                C86203l.m148116a("TR_VideoOCLSREffect", "sr process failed,width:" + i + ",height:" + i2);
                this.f192275o = -1;
            }
            this.f192175d.notifyError(2);
            return m148067a(fVar);
        }
        int a2 = this.f192273m.mo136533a();
        this.f192175d.setOption(6, 1);
        if (this.f192275o != 0) {
            C86203l.m148116a("TR_VideoOCLSREffect", "sr process success,sr tex:" + a2 + ",width:" + (i * 2) + ",height:" + (i2 * 2));
            this.f192275o = 0;
        }
        fVar.mo136486a();
        return new C86176f(null, a2, i * 2, i2 * 2, 3553);
    }
}
