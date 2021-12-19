package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3400b;

import android.content.Context;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58528c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.C58570b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58573b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58577d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58578e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.b.a */
public final class C58520a {

    /* renamed from: a */
    C58522a.C58523a f133213a = new C58522a.C58523a();

    /* renamed from: b */
    private Context f133214b;

    /* renamed from: c */
    private float[] f133215c = new float[8];

    /* renamed from: d */
    private float[] f133216d = new float[8];

    /* renamed from: e */
    private float[] f133217e = new float[8];

    /* renamed from: f */
    private FloatBuffer f133218f;

    /* renamed from: g */
    private FloatBuffer f133219g;

    /* renamed from: h */
    private FloatBuffer f133220h;

    /* renamed from: i */
    private int f133221i = 0;

    /* renamed from: j */
    private int f133222j = 0;

    /* renamed from: k */
    private int f133223k = 0;

    /* renamed from: l */
    private int f133224l = 0;

    /* renamed from: m */
    private int f133225m = 0;

    /* renamed from: n */
    private int f133226n = 0;

    /* renamed from: o */
    private Map<String, C58527b> f133227o = new HashMap();

    /* renamed from: p */
    private Map<String, Integer> f133228p = new HashMap();

    /* renamed from: q */
    private List<C58527b> f133229q;

    static {
        Covode.recordClassIndex(68811);
    }

    /* renamed from: a */
    public final void mo95912a() {
        m107446c();
        m107447d();
        m107448e();
    }

    /* renamed from: c */
    private void m107446c() {
        FloatBuffer put = ByteBuffer.allocateDirect(this.f133215c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f133215c);
        this.f133218f = put;
        put.position(0);
        FloatBuffer put2 = ByteBuffer.allocateDirect(this.f133216d.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f133216d);
        this.f133219g = put2;
        put2.position(0);
        FloatBuffer put3 = ByteBuffer.allocateDirect(this.f133217e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f133217e);
        this.f133220h = put3;
        put3.position(0);
    }

    /* renamed from: e */
    private void m107448e() {
        List<C58527b> list = this.f133229q;
        if (!(list == null || list.isEmpty())) {
            this.f133228p.clear();
            this.f133227o.clear();
            for (int i = 0; i < this.f133229q.size(); i++) {
                C58527b bVar = this.f133229q.get(i);
                this.f133227o.put(bVar.f133261a, bVar);
                this.f133228p.put(bVar.f133261a, Integer.valueOf(C58578e.m107689a(bVar.f133269i)));
            }
        }
    }

    /* renamed from: b */
    public final void mo95914b() {
        for (Map.Entry<String, Integer> entry : this.f133228p.entrySet()) {
            C58578e.m107690a(entry.getValue().intValue());
        }
        for (Map.Entry<String, C58527b> entry2 : this.f133227o.entrySet()) {
            entry2.getValue();
        }
        this.f133227o.clear();
        this.f133228p.clear();
        this.f133229q.clear();
    }

    /* renamed from: d */
    private void m107447d() {
        int a = C58577d.m107686a(C58577d.m107687a("mask/mask_vertex.sh", this.f133214b.getResources()), C58577d.m107687a("mask/mask_frag.sh", this.f133214b.getResources()));
        this.f133221i = a;
        if (a != 0) {
            this.f133222j = GLES20.glGetAttribLocation(a, "aPosition");
            do {
            } while (GLES20.glGetError() != 0);
            if (this.f133222j != -1) {
                this.f133223k = GLES20.glGetAttribLocation(this.f133221i, "aTextureCoord");
                C58577d.m107688a();
                if (this.f133223k != -1) {
                    this.f133224l = GLES20.glGetAttribLocation(this.f133221i, "aMaskTextureCoord");
                    C58577d.m107688a();
                    if (this.f133224l != -1) {
                        this.f133225m = GLES20.glGetUniformLocation(this.f133221i, "sTexture");
                        C58577d.m107688a();
                        if (this.f133225m != -1) {
                            this.f133226n = GLES20.glGetUniformLocation(this.f133221i, "sMaskTexture");
                            C58577d.m107688a();
                            if (this.f133226n == -1) {
                                throw new RuntimeException("Could not get attrib location for sMaskTexture");
                            }
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for sTexture");
                    }
                    throw new RuntimeException("Could not get attrib location for aMaskTextureCoord");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
    }

    public C58520a(Context context, List<C58527b> list) {
        this.f133214b = context;
        this.f133229q = new ArrayList(list);
    }

    /* renamed from: a */
    private static void m107445a(C58522a.C58525c cVar, C58522a.C58523a aVar, float f, float f2) {
        if (cVar.f133256b != 1) {
            C58522a.C58523a a = aVar.mo95926a(cVar.f133258d);
            aVar.mo95925a(0.0f, 0.0f, a.mo95923a(), a.mo95929b(), a.mo95923a(), a.mo95929b());
            return;
        }
        aVar.mo95926a(cVar.f133258d);
        float a2 = aVar.mo95923a();
        float b = aVar.mo95929b();
        if (cVar.f133255a == 0) {
            aVar.mo95925a(0.0f, 0.0f, f, f2, f, f2);
        } else {
            m107443a(a2, b, f, f2, aVar);
        }
    }

    /* renamed from: a */
    private static void m107443a(float f, float f2, float f3, float f4, C58522a.C58523a aVar) {
        if (f > f3 || f2 > f4) {
            float f5 = f / f2;
            if (f5 > f3 / f4) {
                float f6 = f3 / f5;
                float f7 = (f4 - f6) / 2.0f;
                aVar.mo95925a(0.0f, f7, f3, f7 + f6, f3, f4);
                return;
            }
            float f8 = f5 * f4;
            float f9 = (f3 - f8) / 2.0f;
            aVar.mo95925a(f9, 0.0f, f8 + f9, f4, f3, f4);
            return;
        }
        float f10 = (f3 - f) / 2.0f;
        float f11 = (f4 - f2) / 2.0f;
        aVar.mo95925a(f10, f11, f + f10, f2 + f11, f3, f4);
    }

    /* renamed from: a */
    private static void m107444a(C58522a.C58525c cVar, float f, float f2, float f3, float f4, C58522a.C58523a aVar) {
        int[] iArr = cVar.f133258d;
        if (iArr.length >= 4) {
            int i = iArr[0];
            int i2 = iArr[1];
            float f5 = ((float) i) + ((((float) iArr[2]) - f) / 2.0f);
            float f6 = ((float) i2) + ((((float) iArr[3]) - f2) / 2.0f);
            aVar.mo95925a(f5, f6, f + f5, f2 + f6, f3, f4);
        }
    }

    /* renamed from: a */
    private void m107442a(float f, float f2, float f3, float f4, float f5, float f6, C58528c cVar, C58522a.C58525c cVar2) {
        if (cVar2.f133255a == 0) {
            m107444a(cVar2, f5, f6, f3, f4, this.f133213a);
        } else {
            this.f133213a.mo95927a(cVar2.f133258d, f3, f4);
        }
        C58573b.m107677a(this.f133213a, cVar);
        C58573b.m107676a(this.f133213a);
        C58573b.m107678a(this.f133215c, this.f133213a.f133240a, this.f133213a.f133241b, this.f133213a.f133242c, this.f133213a.f133243d);
        this.f133218f.position(0);
        this.f133218f.put(this.f133215c);
        m107445a(cVar2, this.f133213a, f5, f6);
        C58573b.m107678a(this.f133216d, this.f133213a.f133240a, this.f133213a.f133241b, this.f133213a.f133242c, this.f133213a.f133243d);
        this.f133219g.position(0);
        this.f133219g.put(this.f133216d);
        this.f133213a.mo95927a(cVar2.f133257c, f, f2);
        C58573b.m107678a(this.f133217e, this.f133213a.f133240a, this.f133213a.f133241b, this.f133213a.f133242c, this.f133213a.f133243d);
        this.f133220h.position(0);
        this.f133220h.put(this.f133217e);
    }

    /* renamed from: a */
    public final void mo95913a(int i, int i2, int i3, int i4, int i5, C58528c cVar, String str, C58522a.C58525c cVar2) {
        if (cVar2.mo95947a()) {
            GLES20.glUseProgram(this.f133221i);
            do {
            } while (GLES20.glGetError() != 0);
            C58527b bVar = this.f133227o.get(str);
            if (bVar != null) {
                m107442a((float) i2, (float) i3, (float) i4, (float) i5, (float) bVar.f133263c, (float) bVar.f133264d, cVar, cVar2);
                this.f133218f.position(0);
                GLES20.glVertexAttribPointer(this.f133222j, 2, 5126, false, 0, (Buffer) this.f133218f);
                do {
                } while (GLES20.glGetError() != 0);
                GLES20.glEnableVertexAttribArray(this.f133222j);
                do {
                } while (GLES20.glGetError() != 0);
                this.f133219g.position(0);
                GLES20.glVertexAttribPointer(this.f133223k, 2, 5126, false, 0, (Buffer) this.f133219g);
                do {
                } while (GLES20.glGetError() != 0);
                GLES20.glEnableVertexAttribArray(this.f133223k);
                do {
                } while (GLES20.glGetError() != 0);
                GLES20.glActiveTexture(33984);
                Integer num = this.f133228p.get(str);
                if (num != null && num.intValue() != 0) {
                    GLES20.glBindTexture(3553, num.intValue());
                    GLES20.glUniform1i(this.f133225m, 0);
                    this.f133220h.position(0);
                    GLES20.glVertexAttribPointer(this.f133224l, 2, 5126, false, 0, (Buffer) this.f133220h);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glEnableVertexAttribArray(this.f133224l);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(C58570b.f133405a, i);
                    GLES20.glUniform1i(this.f133226n, 1);
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(770, 771);
                    GLES20.glDrawArrays(5, 0, 4);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glDisable(3042);
                }
            }
        }
    }
}
