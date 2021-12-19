package com.p2082ss.texturerender.p4404a;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86203l;

/* renamed from: com.ss.texturerender.a.n */
public final class C86184n extends C86180j {

    /* renamed from: M */
    private final String f192264M = "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 vTextureCoord;\nvoid main() {\n    vec4 tmpFrag = texture2D(sTexture, vTextureCoord);\n    float rbAver = tmpFrag.r * 0.5 + tmpFrag.b * 0.5;\n    float delta = tmpFrag.g - rbAver;\n    tmpFrag.a = 1.0 - smoothstep(0.0, 0.25, delta);\n    tmpFrag.a = tmpFrag.a * tmpFrag.a * tmpFrag.a;\n    gl_FragColor = tmpFrag;\n}";

    static {
        Covode.recordClassIndex(101327);
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j
    /* renamed from: b */
    public final int mo136491b() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        return 0;
    }

    public C86184n() {
        super(9);
        this.f192174c = 25;
        C86203l.m148116a("TR_GLMattingFilter", "new GLMattingFilter,this:".concat(String.valueOf(this)));
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: b */
    public final String mo136476b(int i) {
        if (i != 11001) {
            return super.mo136476b(i);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 vTextureCoord;\nvoid main() {\n    vec4 tmpFrag = texture2D(sTexture, vTextureCoord);\n    float rbAver = tmpFrag.r * 0.5 + tmpFrag.b * 0.5;\n    float delta = tmpFrag.g - rbAver;\n    tmpFrag.a = 1.0 - smoothstep(0.0, 0.25, delta);\n    tmpFrag.a = tmpFrag.a * tmpFrag.a * tmpFrag.a;\n    gl_FragColor = tmpFrag;\n}";
    }
}
