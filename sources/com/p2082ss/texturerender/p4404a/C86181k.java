package com.p2082ss.texturerender.p4404a;

import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86203l;

/* renamed from: com.ss.texturerender.a.k */
public final class C86181k extends C86180j {

    /* renamed from: M */
    private final String f192241M = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianWeights[44];\nuniform int radius;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nuniform float gaussianAlpha;\nvoid main() {\n    vec4 sum = texture2D(sTexture, vTextureCoord) * gaussianWeights[0];\n    for (int i = 1; i <= radius; i++) {\n        vec2 stepOffset = vec2(texelWidthOffset * float(i), texelHeightOffset * float(i));\n        sum += texture2D(sTexture, vTextureCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, vTextureCoord - stepOffset) * gaussianWeights[i];\n    }\n    gl_FragColor = vec4(sum.rgb, gaussianAlpha);\n}\n";

    /* renamed from: N */
    private int f192242N;

    /* renamed from: O */
    private float f192243O = 2.0f;

    /* renamed from: P */
    private boolean f192244P;

    /* renamed from: Q */
    private int f192245Q = -1;

    /* renamed from: R */
    private int f192246R = -1;

    /* renamed from: S */
    private int f192247S = -1;

    /* renamed from: T */
    private int f192248T = -1;

    /* renamed from: U */
    private int f192249U = -1;

    /* renamed from: V */
    private float f192250V;

    /* renamed from: W */
    private float f192251W;

    /* renamed from: X */
    private float[] f192252X;

    /* renamed from: Y */
    private float f192253Y = 1.0f;

    static {
        Covode.recordClassIndex(101324);
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j
    /* renamed from: c */
    public final int mo136492c() {
        GLES20.glDisable(3042);
        return 0;
    }

    public C86181k() {
        super(10);
        this.f192174c = 6;
        C86203l.m148116a("TR_GLGaussianBlurFilter", "new GLGaussianBlurFilter,this:".concat(String.valueOf(this)));
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j
    /* renamed from: b */
    public final int mo136491b() {
        if (!this.f192244P) {
            GLES20.glUniform1fv(this.f192245Q, this.f192242N + 1, this.f192252X, 0);
            this.f192244P = true;
        }
        GLES20.glUniform1i(this.f192248T, this.f192242N);
        GLES20.glUniform1f(this.f192246R, this.f192250V);
        GLES20.glUniform1f(this.f192247S, this.f192251W);
        GLES20.glUniform1f(this.f192249U, this.f192253Y);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        return 0;
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: b */
    public final String mo136476b(int i) {
        if (i != 11001) {
            return super.mo136476b(i);
        }
        return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianWeights[44];\nuniform int radius;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nuniform float gaussianAlpha;\nvoid main() {\n    vec4 sum = texture2D(sTexture, vTextureCoord) * gaussianWeights[0];\n    for (int i = 1; i <= radius; i++) {\n        vec2 stepOffset = vec2(texelWidthOffset * float(i), texelHeightOffset * float(i));\n        sum += texture2D(sTexture, vTextureCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, vTextureCoord - stepOffset) * gaussianWeights[i];\n    }\n    gl_FragColor = vec4(sum.rgb, gaussianAlpha);\n}\n";
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final int mo136469a(Bundle bundle) {
        super.mo136469a(bundle);
        this.f192245Q = GLES20.glGetUniformLocation(this.f192230p, "gaussianWeights");
        this.f192246R = GLES20.glGetUniformLocation(this.f192230p, "texelWidthOffset");
        this.f192247S = GLES20.glGetUniformLocation(this.f192230p, "texelHeightOffset");
        this.f192248T = GLES20.glGetUniformLocation(this.f192230p, "radius");
        this.f192249U = GLES20.glGetUniformLocation(this.f192230p, "gaussianAlpha");
        float f = bundle.getFloat("strength", -1.0f);
        if (f > 1.0f) {
            m148044a(f);
        } else {
            m148044a(2.0f);
        }
        this.f192253Y = bundle.getFloat("alpha", 1.0f);
        C86203l.m148116a("TR_GLGaussianBlurFilter", "GLGaussianBlurFilter init,this:".concat(String.valueOf(this)));
        return 0;
    }

    /* renamed from: a */
    private void m148044a(float f) {
        float max = Math.max(Math.min(f, 26.0f), 1.0f);
        this.f192243O = max;
        this.f192242N = (int) Math.floor(Math.sqrt(Math.pow((double) max, 2.0d) * -2.0d * Math.log(Math.sqrt(Math.pow((double) this.f192243O, 2.0d) * 6.283185307179586d) * 0.00390625d)));
        C86203l.m148116a("TR_GLGaussianBlurFilter", "updateGaussianWeights sigma:" + this.f192243O + ",mBlurRadius:" + this.f192242N);
        this.f192252X = new float[(this.f192242N + 1)];
        for (int i = 0; i <= this.f192242N; i++) {
            this.f192252X[i] = (float) m148043a(this.f192243O, i);
        }
        float f2 = this.f192252X[0];
        for (int i2 = 1; i2 <= this.f192242N; i2++) {
            f2 += this.f192252X[i2] * 2.0f;
        }
        for (int i3 = 0; i3 <= this.f192242N; i3++) {
            float[] fArr = this.f192252X;
            fArr[i3] = fArr[i3] / f2;
        }
        this.f192244P = false;
    }

    /* renamed from: a */
    private static double m148043a(float f, int i) {
        double d = (double) f;
        return (1.0d / Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d)) * Math.exp((-Math.pow((double) i, 2.0d)) / (Math.pow(d, 2.0d) * 2.0d));
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final C86176f mo136471a(C86176f fVar, C86179i iVar) {
        if (this.f192243O == 1.0f) {
            return fVar;
        }
        double texWidth = (double) this.f192175d.getTexWidth();
        Double.isNaN(texWidth);
        this.f192250V = (float) (1.0d / texWidth);
        this.f192251W = 0.0f;
        C86176f a = super.mo136471a(fVar, iVar);
        this.f192250V = 0.0f;
        double texHeight = (double) this.f192175d.getTexHeight();
        Double.isNaN(texHeight);
        this.f192251W = (float) (1.0d / texHeight);
        return super.mo136471a(a, iVar);
    }

    @Override // com.p2082ss.texturerender.p4404a.C86180j, com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final void mo136472a(int i, float f) {
        if (i == 20 && f != this.f192243O) {
            m148044a(f);
            C86203l.m148116a("TR_GLGaussianBlurFilter", "set strength:" + this.f192243O + ",this:" + this);
        }
    }
}
