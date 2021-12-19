package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.GlGenericDrawer;

public class GlRectDrawer extends GlGenericDrawer {

    /* renamed from: org.webrtc.GlRectDrawer$1 */
    static /* synthetic */ class C902891 {
        static {
            Covode.recordClassIndex(106638);
        }
    }

    static {
        Covode.recordClassIndex(106637);
    }

    static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        static {
            Covode.recordClassIndex(106639);
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }

        private ShaderCallbacks() {
        }

        /* synthetic */ ShaderCallbacks(C902891 r1) {
            this();
        }
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public GlRectDrawer() {
        super("void main() {\n  gl_FragColor = sample(tc);\n}\n", new ShaderCallbacks(null));
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawOes(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawRgb(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super.drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6);
    }
}
