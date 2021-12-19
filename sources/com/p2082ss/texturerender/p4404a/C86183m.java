package com.p2082ss.texturerender.p4404a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86197g;
import com.p2082ss.texturerender.C86203l;

/* renamed from: com.ss.texturerender.a.m */
public final class C86183m extends C86180j {

    /* renamed from: M */
    private final String f192259M = "precision mediump float;\nuniform sampler2D sTexture;\nuniform sampler2D lutTexture;\nvarying vec2 vTextureCoord;\nuniform float strength;\nvoid main() {\n    vec4 inputTexColor = texture2D(sTexture, vTextureCoord);\n    float blueColor = inputTexColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 7.999);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texturePos1;\n    texturePos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec2 texturePos2;\n    texturePos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec4 newColor1 = texture2D(lutTexture, texturePos1);\n    vec4 newColor2 = texture2D(lutTexture, texturePos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(inputTexColor, vec4(newColor.rgb, inputTexColor.w), strength);\n}";

    /* renamed from: N */
    private float f192260N = 1.0f;

    /* renamed from: O */
    private int f192261O;

    /* renamed from: P */
    private int f192262P;

    /* renamed from: Q */
    private int f192263Q = C86197g.m148102a();

    static {
        Covode.recordClassIndex(101326);
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final AbstractC86171a mo136470a() {
        C86197g.m148105b(this.f192263Q);
        C86203l.m148116a("TR_GLLutFilter", "release,this:".concat(String.valueOf(this)));
        return super.mo136470a();
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j
    /* renamed from: b */
    public final int mo136491b() {
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f192263Q);
        GLES20.glUniform1i(this.f192262P, 1);
        GLES20.glUniform1f(this.f192261O, this.f192260N);
        return 0;
    }

    public C86183m() {
        super(2);
        this.f192174c = 15;
        C86203l.m148116a("TR_GLLutFilter", "new GLLutFilter,this:".concat(String.valueOf(this)));
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: b */
    public final String mo136476b(int i) {
        if (i != 11001) {
            return super.mo136476b(i);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nuniform sampler2D lutTexture;\nvarying vec2 vTextureCoord;\nuniform float strength;\nvoid main() {\n    vec4 inputTexColor = texture2D(sTexture, vTextureCoord);\n    float blueColor = inputTexColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 7.999);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texturePos1;\n    texturePos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec2 texturePos2;\n    texturePos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec4 newColor1 = texture2D(lutTexture, texturePos1);\n    vec4 newColor2 = texture2D(lutTexture, texturePos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(inputTexColor, vec4(newColor.rgb, inputTexColor.w), strength);\n}";
    }

    /* renamed from: a */
    private void m148055a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            GLES20.glBindTexture(3553, this.f192263Q);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            C86203l.m148116a("TR_GLLutFilter", "setBitmap:" + bitmap + ",this:" + this);
        }
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: b */
    public final void mo136477b(Bundle bundle) {
        if (bundle == null || this.f192172a != bundle.getInt("effect_type")) {
            super.mo136477b(bundle);
        } else if (bundle.getInt("action") == 22) {
            m148055a((Bitmap) bundle.getParcelable("lut_bitmap"));
        }
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final int mo136469a(Bundle bundle) {
        super.mo136469a(bundle);
        this.f192261O = GLES20.glGetUniformLocation(this.f192230p, "strength");
        this.f192262P = GLES20.glGetUniformLocation(this.f192230p, "lutTexture");
        m148055a((Bitmap) bundle.getParcelable("lut_bitmap"));
        if (bundle.containsKey("strength")) {
            this.f192260N = bundle.getFloat("strength");
        }
        C86203l.m148116a("TR_GLLutFilter", "init,this:".concat(String.valueOf(this)));
        return 0;
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final void mo136472a(int i, float f) {
        if (i != 20) {
            super.mo136472a(i, f);
            return;
        }
        this.f192260N = f;
        C86203l.m148116a("TR_GLLutFilter", "set strength:" + this.f192260N + ",this:" + this);
    }
}
