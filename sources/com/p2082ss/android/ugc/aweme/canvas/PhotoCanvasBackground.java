package com.p2082ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.canvas.PhotoCanvasBackground */
public final class PhotoCanvasBackground implements Serializable {
    public static final C35356a Companion = new C35356a((byte) 0);
    private int endColor;
    private String filePath = "";
    private int startColor;
    private final int type;

    static {
        Covode.recordClassIndex(42525);
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.PhotoCanvasBackground$a */
    public static final class C35356a {
        static {
            Covode.recordClassIndex(42526);
        }

        private C35356a() {
        }

        public /* synthetic */ C35356a(byte b) {
            this();
        }

        /* renamed from: a */
        public static PhotoCanvasBackground m72363a(int i) {
            PhotoCanvasBackground photoCanvasBackground = new PhotoCanvasBackground(0);
            photoCanvasBackground.setStartColor(i);
            return photoCanvasBackground;
        }
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final int getType() {
        return this.type;
    }

    public final void setEndColor(int i) {
        this.endColor = i;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setStartColor(int i) {
        this.startColor = i;
    }

    public PhotoCanvasBackground(int i) {
        this.type = i;
    }
}
