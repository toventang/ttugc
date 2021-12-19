package com.p2082ss.texturerender.p4404a;

import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86203l;

/* renamed from: com.ss.texturerender.a.o */
public final class C86185o extends C86180j {

    /* renamed from: M */
    private final String f192265M = "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: N */
    private final String f192266N = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    /* renamed from: O */
    private float[] f192267O = new float[16];

    /* renamed from: P */
    private int f192268P;

    static {
        Covode.recordClassIndex(101328);
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j
    /* renamed from: b */
    public final int mo136491b() {
        this.f192175d.getTransformMatrix(this.f192267O);
        GLES20.glUniformMatrix4fv(this.f192268P, 1, false, this.f192267O, 0);
        return 0;
    }

    public C86185o() {
        super(3);
        this.f192173b = 36197;
        this.f192174c = 100;
        C86203l.m148116a("TR_GLOesTo2DFilter", "new GLOesTo2DFilter");
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final int mo136469a(Bundle bundle) {
        super.mo136469a(bundle);
        this.f192268P = GLES20.glGetUniformLocation(this.f192230p, "uSTMatrix");
        C86203l.m148116a("TR_GLOesTo2DFilter", "init");
        mo136477b(bundle);
        return 0;
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: b */
    public final String mo136476b(int i) {
        if (i == 11000) {
            return "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        if (i != 11001) {
            return super.mo136476b(i);
        }
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }
}
