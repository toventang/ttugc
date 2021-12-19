package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.o */
public class C58868o {

    /* renamed from: a */
    protected int f134009a;

    /* renamed from: b */
    protected int f134010b;

    /* renamed from: c */
    private int f134011c;

    /* renamed from: d */
    private int f134012d;

    /* renamed from: e */
    private int f134013e;

    /* renamed from: f */
    private int f134014f;

    /* renamed from: g */
    private int f134015g;

    /* renamed from: h */
    private int f134016h;

    /* renamed from: i */
    private FloatBuffer[] f134017i;

    /* renamed from: j */
    private boolean f134018j;

    static {
        Covode.recordClassIndex(69182);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo96276a() {
        return 3553;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float[] mo96302d() {
        return C58869p.f134023e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo96277b() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "precision mediump float;\nuniform sampler2D u_tex;\nuniform bool fmt_changed; \nvarying vec2 v_tex;\nvoid main() {\n   if (fmt_changed) {\n       gl_FragColor = vec4(texture2D(u_tex, v_tex).bgr, 1.0);\n   } else { \n       gl_FragColor = texture2D(u_tex, v_tex);\n   }\n}\n"};
    }

    /* renamed from: e */
    private void m108145e() {
        GLES20.glBindBuffer(34962, this.f134012d);
        GLES20.glBufferData(34962, 32, this.f134017i[0].rewind(), 35044);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.f134013e);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
    }

    /* renamed from: c */
    public void mo96301c() {
        int i = this.f134011c;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f134011c = 0;
        }
        int i2 = this.f134012d;
        if (i2 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i2}, 0);
            this.f134012d = 0;
        }
        int i3 = this.f134013e;
        if (i3 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i3}, 0);
            this.f134013e = 0;
        }
        this.f134018j = false;
    }

    /* renamed from: a */
    public final void mo96298a(int i, float[] fArr) {
        if (this.f134018j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f134011c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(mo96276a(), i);
            m108145e();
            GLES20.glUniformMatrix4fv(this.f134014f, 1, false, C58859i.f133974b, 0);
            if (fArr == null) {
                fArr = C58859i.f133974b;
            }
            GLES20.glUniformMatrix4fv(this.f134015g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f134016h, 0);
            GLES20.glViewport(0, 0, this.f134009a * 2, this.f134010b * 2);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(mo96276a(), 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0171 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo96300a(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58868o.mo96300a(int, int):boolean");
    }

    /* renamed from: a */
    public final void mo96299a(int i, float[] fArr, float[] fArr2) {
        if (this.f134018j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f134011c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(mo96276a(), i);
            m108145e();
            GLES20.glUniformMatrix4fv(this.f134014f, 1, false, fArr2, 0);
            if (fArr == null) {
                fArr = C58859i.f133974b;
            }
            GLES20.glUniformMatrix4fv(this.f134015g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f134016h, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(mo96276a(), 0);
        }
    }
}
